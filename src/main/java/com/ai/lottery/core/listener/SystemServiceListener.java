package com.ai.lottery.core.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.ai.lottery.core.service.SystemListenerService;

/**
 * 系统监听,主要负责系统启动和停止时做的逻辑处理
 * 
 * @author Peiyu
 * 
 */
public class SystemServiceListener implements ServletContextListener {

	private static final Logger log = LoggerFactory
			.getLogger(SystemServiceListener.class);

	private static ServletContext context;

	private static WebApplicationContext wac;

	private SystemListenerService systemListenerService;

	public void contextDestroyed(ServletContextEvent arg0) {
		log.debug("系统停止.................");
		systemListenerService.shutdown(context);
		context = null;
		wac = null;
		log.debug("系统停止成功.................");
	}

	public void contextInitialized(ServletContextEvent sce) {
		log.debug("系统启动.................");
		context = sce.getServletContext();
		wac = WebApplicationContextUtils.getWebApplicationContext(context);
		this.systemListenerService = (SystemListenerService) wac
				.getBean("systemListenerService");
		try {
			this.systemListenerService.startup();
		} catch (Exception e) {
			log.error("系统启动失败:", e);
		}
		log.debug("系统启动成功.................");
	}

	public static ServletContext getServletContext() {
		return context;
	}

	public static WebApplicationContext getWebApplicationContext() {
		if (null == wac) {
			wac = WebApplicationContextUtils
					.getRequiredWebApplicationContext(context);
		}
		return wac;
	}
}
