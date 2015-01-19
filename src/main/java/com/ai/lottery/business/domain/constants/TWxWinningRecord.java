package com.ai.lottery.business.domain.constants;

/**
 * @ClassName: TWxWinningRecord
* @Description: wx_winning_record表结构对应的常量类，定义字段名常量
* @author: peiyu
 */
public abstract class TWxWinningRecord {
    /**
     * @Fields wx_winning_record.WINNING_RECORD_ID: 中奖日志IDUUID
     */
    public static final String WINNING_RECORD_ID = "WINNING_RECORD_ID";

    /**
     * @Fields wx_winning_record.OPEN_ID: 微信用户的OPENID
     */
    public static final String OPEN_ID = "OPEN_ID";

    /**
     * @Fields wx_winning_record.LOTTERY_ROUND: 抽奖轮次UUID
     */
    public static final String LOTTERY_ROUND = "LOTTERY_ROUND";

    /**
     * @Fields wx_winning_record.CREATE_TIME: 创建时间
     */
    public static final String CREATE_TIME = "CREATE_TIME";
}