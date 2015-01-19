package com.ai.lottery.core.listener;

import java.util.Map;

/**
 * 系统启动时调用
 * 
 * @author peiyu
 * 
 */
public interface SystemStartupListener {
	public Map<String, Object> startup();
}
