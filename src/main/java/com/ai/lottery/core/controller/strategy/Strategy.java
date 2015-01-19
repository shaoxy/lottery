package com.ai.lottery.core.controller.strategy;

/**
 * 策略接口
 * @author peiyu
 */
public interface Strategy<IN, OUT> {
    /**
     * 执行策略
     * @param in 入参
     * @return 执行结果
     */
    OUT invoke(IN in);
}
