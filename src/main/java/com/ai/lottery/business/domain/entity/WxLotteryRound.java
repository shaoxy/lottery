package com.ai.lottery.business.domain.entity;

import com.ai.lottery.core.domain.entity.StringAndEqualsObject;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: WxLotteryRound
* @Description: wx_lottery_round表对应的java bean类
* @author: peiyu
 */
public class WxLotteryRound  extends StringAndEqualsObject implements Serializable {
    /**
     * @Fields serialVersionUID : 自动生成默认序列化ID
     */
    private static final long serialVersionUID = 1L;

    /**
     * @Fields wx_lottery_round.LOTTERY_ROUND_ID :抽奖轮次UUID
     */
    private String lotteryRoundId;

    /**
     * @Fields wx_lottery_round.LOTTERY_NAME :奖项名称
     */
    private String lotteryName;

    /**
     * @Fields wx_lottery_round.CREATE_TIME :创建时间
     */
    private Date createTime;

    /**
     * @return wx_lottery_round.LOTTERY_ROUND_ID : 返回 抽奖轮次UUID
     */
    public String getLotteryRoundId() {
        return lotteryRoundId;
    }

    /**
     * @param lotteryRoundId of wx_lottery_round : 设置 抽奖轮次UUID
     */
    public void setLotteryRoundId(String lotteryRoundId) {
        this.lotteryRoundId = lotteryRoundId == null ? null : lotteryRoundId.trim();
    }

    /**
     * @return wx_lottery_round.LOTTERY_NAME : 返回 奖项名称
     */
    public String getLotteryName() {
        return lotteryName;
    }

    /**
     * @param lotteryName of wx_lottery_round : 设置 奖项名称
     */
    public void setLotteryName(String lotteryName) {
        this.lotteryName = lotteryName == null ? null : lotteryName.trim();
    }

    /**
     * @return wx_lottery_round.CREATE_TIME : 返回 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime of wx_lottery_round : 设置 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}