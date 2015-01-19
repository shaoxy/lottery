package com.ai.lottery.core.controller;

import com.ai.lottery.business.cache.SystemConfigCache;
import com.ai.lottery.business.domain.httpVo.BaseResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author peiyu
 */
public abstract class BaseController {

    private static final Logger log = LoggerFactory.getLogger(BaseController.class);

    /**
     * 获得系统配置缓存
     */
    protected SystemConfigCache cache = SystemConfigCache.me();

    /**
     * 得到请求异常后的响应对象
     *
     * @param e 异常信息
     * @return 响应对象
     */
    protected BaseResponse getErrorResponse(Exception e) {
        BaseResponse response = new BaseResponse();
        response.setResultCode("9999");
        response.setResultDesc("亲，服务器出错啦");
        return response;
    }

}
