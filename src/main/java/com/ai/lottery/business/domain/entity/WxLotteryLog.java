package com.ai.lottery.business.domain.entity;

import com.ai.lottery.core.domain.entity.StringAndEqualsObject;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: WxLotteryLog
* @Description: wx_lottery_log表对应的java bean类
* @author: peiyu
 */
public class WxLotteryLog extends StringAndEqualsObject implements Serializable {
    /**
     * @Fields serialVersionUID : 自动生成默认序列化ID
     */
    private static final long serialVersionUID = 1L;

    /**
     * @Fields wx_lottery_log.LOTTERY_LOG_ID :中奖日志IDUUID
     */
    private String lotteryLogId;

    /**
     * @Fields wx_lottery_log.OPEN_ID :微信用户的OPENID
     */
    private String openId;

    /**
     * @Fields wx_lottery_log.LOTTERY_ROUND :抽奖轮次UUID
     */
    private String lotteryRound;

    /**
     * @Fields wx_lottery_log.HANDLE_TYPE :操作类型 0增加中奖者 1删除中奖者
     */
    private Short handleType;

    /**
     * @Fields wx_lottery_log.CREATE_TIME :创建时间
     */
    private Date createTime;

    /**
     * @return wx_lottery_log.LOTTERY_LOG_ID : 返回 中奖日志IDUUID
     */
    public String getLotteryLogId() {
        return lotteryLogId;
    }

    /**
     * @param lotteryLogId of wx_lottery_log : 设置 中奖日志IDUUID
     */
    public void setLotteryLogId(String lotteryLogId) {
        this.lotteryLogId = lotteryLogId == null ? null : lotteryLogId.trim();
    }

    /**
     * @return wx_lottery_log.OPEN_ID : 返回 微信用户的OPENID
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * @param openId of wx_lottery_log : 设置 微信用户的OPENID
     */
    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    /**
     * @return wx_lottery_log.LOTTERY_ROUND : 返回 抽奖轮次UUID
     */
    public String getLotteryRound() {
        return lotteryRound;
    }

    /**
     * @param lotteryRound of wx_lottery_log : 设置 抽奖轮次UUID
     */
    public void setLotteryRound(String lotteryRound) {
        this.lotteryRound = lotteryRound == null ? null : lotteryRound.trim();
    }

    /**
     * @return wx_lottery_log.HANDLE_TYPE : 返回 操作类型 0增加中奖者 1删除中奖者
     */
    public Short getHandleType() {
        return handleType;
    }

    /**
     * @param handleType of wx_lottery_log : 设置 操作类型 0增加中奖者 1删除中奖者
     */
    public void setHandleType(Short handleType) {
        this.handleType = handleType;
    }

    /**
     * @return wx_lottery_log.CREATE_TIME : 返回 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime of wx_lottery_log : 设置 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}