package com.ai.lottery.core.controller.strategy.impl;

import com.ai.lottery.core.controller.strategy.Strategy;
import com.ai.lottery.core.utils.CipherUtils;
import com.ai.lottery.core.utils.JSONUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 通过AES解密策略
 * @author peiyu
 */
public class AESStrategyImpl implements Strategy<String, String> {

    private static final Logger log = LoggerFactory.getLogger(AESStrategyImpl.class);

    @Override
    public String invoke(String s) {
        log.debug("需要用过AES解密:{}", s);
        String data;
        try {
            data = JSONUtil.toMap(s).get("data").toString();
        } catch (Exception e) {
            log.error("报文格式错误", e);
            data = "";
        }

        String result = CipherUtils.decrypt(data);
        log.debug("解密后数据:{}", result);
        return result;
    }
}
