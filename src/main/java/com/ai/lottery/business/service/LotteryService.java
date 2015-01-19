package com.ai.lottery.business.service;

import com.ai.lottery.business.domain.entity.WxUserPond;
import com.ai.lottery.business.domain.httpVo.LotteryRequest;
import com.ai.lottery.business.domain.httpVo.LotteryResponse;

import java.util.List;

/**
 * Created by xy on 2015/1/8.
 */
public interface LotteryService {

    /**
     * 得到奖池用户列表
     *
     * @return
     */
    public List<WxUserPond> getLotteryUserList();

    /**
     * 日志
     *
     * @param request
     * @return
     */
    public LotteryResponse addLotteryLogs(LotteryRequest request);

    /**
     * 抽奖方案保存
     *
     * @param request
     * @return
     */
    public LotteryResponse saveWinnerPlan(LotteryRequest request);
}
