package com.ai.lottery.business.domain.httpVo;

import java.util.List;

/**
 * 抽奖请求
 *
 * @author shaoxy
 */
public class LotteryRequest extends BaseRequest {

    /**
     * 操作类型 0增加中奖者 1删除中奖者
     */
    private Short handleType;

    private String lotteryRound;

    private String lotteryRoundName;

    private List<String> winList;

    @Override
    public String getLotteryRound() {
        return lotteryRound;
    }

    @Override
    public void setLotteryRound(String lotteryRound) {
        this.lotteryRound = lotteryRound;
    }

    public String getLotteryRoundName() {
        return lotteryRoundName;
    }

    public void setLotteryRoundName(String lotteryRoundName) {
        this.lotteryRoundName = lotteryRoundName;
    }

    public List<String> getWinList() {
        return winList;
    }

    public void setWinList(List<String> winList) {
        this.winList = winList;
    }

    /**
     * 操作类型 0增加中奖者 1删除中奖者
     */
    public Short getHandleType() {
        return handleType;
    }
    /**
     * 操作类型 0增加中奖者 1删除中奖者
     */
    public void setHandleType(Short handleType) {
        this.handleType = handleType;
    }
}

