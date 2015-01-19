package com.ai.lottery.core.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import com.ai.lottery.core.listener.SystemStartupListener;
import com.ai.lottery.core.service.SystemListenerService;
import org.nutz.lang.Lang;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ai.lottery.core.listener.SystemShutdownListener;

/**
 * 系统监听服务类 负责系统启动和停止时需要处理的业务逻辑
 *
 * @author Peiyu
 */
public class SystemListenerServiceImpl implements SystemListenerService {

    private static final Logger log = LoggerFactory
            .getLogger(SystemListenerServiceImpl.class);

    /**
     * 系统启动服务集合
     */
    private List<SystemStartupListener> startupServices;

    /**
     * 系统停止服务集合
     */
    private List<SystemShutdownListener> shutdownServices;

    public void setStartupServices(List<SystemStartupListener> listener) {
        this.startupServices = listener;
    }

    public void setShutdownServices(List<SystemShutdownListener> listener) {
        this.shutdownServices = listener;
    }

    /**
     * 系统启动
     */
    public Map<String, Object> startup() throws Exception {
        log.debug("开始加载SystemStartupService.......");
        Map<String, Object> result = new HashMap<>();
        if (!Lang.isEmpty(this.startupServices)) {
            List<SystemStartupListener> startupServices1 = this.startupServices;
            for (SystemStartupListener listener : startupServices1) {
                Map<String, Object> temp = listener.startup();
                if (!Lang.isEmpty(temp))
                    result.putAll(temp);
            }
/*			this.startupServices.forEach(listener -> {
                Map<String, Object> temp = listener.startup();
                if (!Lang.isEmpty(temp))
                    result.putAll(temp);
            });*/
        } else {
            log.debug("没有配置任何SystemStartupService.........");
        }
        log.debug("加载SystemStartupService完成.............");
        return result;
    }

    /**
     * 系统停止
     */
    public boolean shutdown(ServletContext context) {
        log.debug("开始执行SystemShutdownService.......");
        if (!Lang.isEmpty(this.shutdownServices)) {
            List<SystemShutdownListener> shutdownServices1 = this.shutdownServices;
            for (SystemShutdownListener listener : shutdownServices1) {
                listener.shutdown();
            }
//            this.shutdownServices.forEach(SystemShutdownListener::shutdown);

        } else {
            log.debug("没有配置任何SystemShutdownService.........");
        }
        log.debug("执行SystemShutdownService完成.............");
        return true;
    }
}
