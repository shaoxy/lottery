package com.ai.lottery.core.controller.strategy.impl;

import com.ai.lottery.core.controller.strategy.Strategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 报文不加密策略
 * Created by Think on 2014/10/30.
 */
public class NullStrategyImpl implements Strategy<String, String> {

    private static final Logger log = LoggerFactory.getLogger(NullStrategyImpl.class);

    @Override
    public String invoke(String s) {
        log.debug("数据无需解密:{}", s);
        return s;
    }
}
