package com.ai.lottery.business.domain.constants;

/**
 * @ClassName: TWxLotteryLog
* @Description: wx_lottery_log表结构对应的常量类，定义字段名常量
* @author: peiyu
 */
public abstract class TWxLotteryLog {
    /**
     * @Fields wx_lottery_log.LOTTERY_LOG_ID: 中奖日志IDUUID
     */
    public static final String LOTTERY_LOG_ID = "LOTTERY_LOG_ID";

    /**
     * @Fields wx_lottery_log.OPEN_ID: 微信用户的OPENID
     */
    public static final String OPEN_ID = "OPEN_ID";

    /**
     * @Fields wx_lottery_log.LOTTERY_ROUND: 抽奖轮次UUID
     */
    public static final String LOTTERY_ROUND = "LOTTERY_ROUND";

    /**
     * @Fields wx_lottery_log.HANDLE_TYPE: 操作类型 0增加中奖者 1删除中奖者
     */
    public static final String HANDLE_TYPE = "HANDLE_TYPE";

    /**
     * @Fields wx_lottery_log.CREATE_TIME: 创建时间
     */
    public static final String CREATE_TIME = "CREATE_TIME";
}