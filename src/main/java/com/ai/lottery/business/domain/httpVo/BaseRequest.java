package com.ai.lottery.business.domain.httpVo;

import com.ai.lottery.core.domain.entity.StringAndEqualsObject;

/**
 * http请求对象基类
 *
 * @author shaoxy
 */
public class BaseRequest extends StringAndEqualsObject {

    /**
     * 微信用户的OPENID
     */
    private String openId;

    /**
     * 抽奖轮次UUID
     */
    private String lotteryRound;

    /**
     * 如果有翻页需要，需要传
     */
    private Long page;

    /**
     * 每页条数
     */
    private Integer pageSize;

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getLotteryRound() {
        return lotteryRound;
    }

    public void setLotteryRound(String lotteryRound) {
        this.lotteryRound = lotteryRound;
    }

    public Long getPage() {
        return page;
    }

    public void setPage(Long page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
