package com.ai.lottery.business.service.impl;

import com.ai.lottery.business.domain.httpVo.LotteryRequest;
import com.ai.lottery.business.domain.httpVo.LotteryResponse;
import com.ai.lottery.business.service.LotteryService;
import com.ai.lottery.business.dao.service.*;
import com.ai.lottery.business.domain.constants.*;
import com.ai.lottery.business.domain.entity.*;
import com.ai.lottery.core.dao.Criteria;
import com.ai.lottery.core.utils.CheckNull;
import com.ai.lottery.core.utils.UUIDUtils;
import com.sun.tools.javac.comp.Check;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 抽奖Service
 * Created by shaoxy.
 */
@Service("lotteryService")
public class LotteryServiceImpl extends BaseServiceImpl implements LotteryService {

    private static final Logger log = LoggerFactory.getLogger(LotteryServiceImpl.class);

    @Autowired
    private WxUserPondDao wxUserPondDao;
    @Autowired
    private WxLotteryLogDao wxLotteryLogDao;
    @Autowired
    private WxWinningRecordDao wxWinningRecordDao;
    @Autowired
    private WxLotteryRoundDao wxLotteryRoundDao;

    @Override
    public List<WxUserPond> getLotteryUserList() {
        Criteria example = new Criteria();
        example.createConditon().andEqualTo(TWxUserPond.STATE, STATE_NORMAL);
        example.setDistinct(true);
        List<WxUserPond> wxUserPonds = this.wxUserPondDao.selectByExample(example);
        return wxUserPonds;
    }

    @Override
    public LotteryResponse addLotteryLogs(LotteryRequest request) {
        log.debug("开始插入抽奖log！");
        LotteryResponse response = new LotteryResponse();
        if (!CheckNull.isNull(request.getHandleType()) && !CheckNull.isNull(request.getLotteryRound())
                && !CheckNull.isNull(request.getOpenId())) {
            log.debug("数据不为空，开始插入抽奖log！");
            WxLotteryLog record = new WxLotteryLog();
            record.setCreateTime(new Date());
            record.setHandleType(request.getHandleType());
            record.setLotteryLogId(UUIDUtils.getUUID());
            record.setLotteryRound(request.getLotteryRound());
            record.setOpenId(request.getOpenId());
            this.wxLotteryLogDao.insertSelective(record);
            response.setResultCode(SUCCESS);
            response.setResultDesc("插入抽奖log成功！");
        } else {
            log.debug("请求数据不正确！");
            response.setResultCode(PARAM_ERROR);
            response.setResultDesc("请求数据不正确！");
        }
        return response;
    }

    @Override
    public LotteryResponse saveWinnerPlan(LotteryRequest request) {
        log.debug("开始插入获奖记录！");
        LotteryResponse response = new LotteryResponse();
        if (!CheckNull.isNull(request.getLotteryRound()) && !CheckNull.isNull(request.getLotteryRoundName())
                && !CheckNull.isNull(request.getWinList())) {
            log.debug("数据不为空，开始插入获奖记录！");
            String lotteryRound = request.getLotteryRound();
            String lotteryRoundName = request.getLotteryRoundName();
            List<String> winList = request.getWinList();
            //获奖名称表
            WxLotteryRound lotteryRoundRecord = new WxLotteryRound();
            lotteryRoundRecord.setCreateTime(new Date());
            lotteryRoundRecord.setLotteryName(lotteryRoundName);
            lotteryRoundRecord.setLotteryRoundId(lotteryRound);
            this.wxLotteryRoundDao.insertSelective(lotteryRoundRecord);
            //获奖记录
            for (String a : winList) {
                if (!CheckNull.isNull(a)) {
                    WxWinningRecord winningRecord = new WxWinningRecord();
                    winningRecord.setCreateTime(new Date());
                    winningRecord.setOpenId(a);
                    winningRecord.setLotteryRound(lotteryRound);
                    winningRecord.setWinningRecordId(UUIDUtils.getUUID());
                    this.wxWinningRecordDao.insertSelective(winningRecord);
                }
            }
            response.setResultCode(SUCCESS);
            response.setResultDesc("插入获奖记录成功！");
        } else {
            log.debug("请求数据不正确！");
            response.setResultCode(PARAM_ERROR);
            response.setResultDesc("请求数据不正确！");
        }
        return response;
    }
}
