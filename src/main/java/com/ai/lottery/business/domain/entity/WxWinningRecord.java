package com.ai.lottery.business.domain.entity;

import com.ai.lottery.core.domain.entity.StringAndEqualsObject;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: WxWinningRecord
* @Description: wx_winning_record表对应的java bean类
* @author: peiyu
 */
public class WxWinningRecord extends StringAndEqualsObject implements Serializable {
    /**
     * @Fields serialVersionUID : 自动生成默认序列化ID
     */
    private static final long serialVersionUID = 1L;

    /**
     * @Fields wx_winning_record.WINNING_RECORD_ID :中奖日志IDUUID
     */
    private String winningRecordId;

    /**
     * @Fields wx_winning_record.OPEN_ID :微信用户的OPENID
     */
    private String openId;

    /**
     * @Fields wx_winning_record.LOTTERY_ROUND :抽奖轮次UUID
     */
    private String lotteryRound;

    /**
     * @Fields wx_winning_record.CREATE_TIME :创建时间
     */
    private Date createTime;

    /**
     * @return wx_winning_record.WINNING_RECORD_ID : 返回 中奖日志IDUUID
     */
    public String getWinningRecordId() {
        return winningRecordId;
    }

    /**
     * @param winningRecordId of wx_winning_record : 设置 中奖日志IDUUID
     */
    public void setWinningRecordId(String winningRecordId) {
        this.winningRecordId = winningRecordId == null ? null : winningRecordId.trim();
    }

    /**
     * @return wx_winning_record.OPEN_ID : 返回 微信用户的OPENID
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * @param openId of wx_winning_record : 设置 微信用户的OPENID
     */
    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    /**
     * @return wx_winning_record.LOTTERY_ROUND : 返回 抽奖轮次UUID
     */
    public String getLotteryRound() {
        return lotteryRound;
    }

    /**
     * @param lotteryRound of wx_winning_record : 设置 抽奖轮次UUID
     */
    public void setLotteryRound(String lotteryRound) {
        this.lotteryRound = lotteryRound == null ? null : lotteryRound.trim();
    }

    /**
     * @return wx_winning_record.CREATE_TIME : 返回 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime of wx_winning_record : 设置 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}