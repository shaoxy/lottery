package com.ai.lottery.core.service;

import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import com.ai.lottery.core.listener.SystemStartupListener;
import com.ai.lottery.core.listener.SystemShutdownListener;

public interface SystemListenerService {
	/**
	 * 设置系统启动时执行的业务类
	 * 
	 * @param service
	 */
	public void setStartupServices(List<SystemStartupListener> service);

	/**
	 * 设置系统关闭时执行的业务类
	 * 
	 * @param service
	 */
	public void setShutdownServices(List<SystemShutdownListener> service);

	/**
	 * 系统启动
	 * 
	 * @return
	 */
	public Map<String, Object> startup() throws Exception;

	/**
	 * 系统关闭
	 * 
	 * @param context
	 * @return 成功返回true，否则返回false
	 */
	public boolean shutdown(ServletContext context);
}
