package com.ai.lottery.business.controller;

import com.ai.lottery.business.domain.entity.WxUserPond;
import com.ai.lottery.business.domain.httpVo.BaseResponse;
import com.ai.lottery.business.domain.httpVo.LotteryRequest;
import com.ai.lottery.business.domain.httpVo.LotteryResponse;
import com.ai.lottery.business.service.LotteryService;
import com.ai.lottery.core.controller.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shaoxy
 */
@RestController
@RequestMapping("/lottery")
public class LotteryRestController extends BaseController {

    private static final Logger log = LoggerFactory.getLogger(LotteryRestController.class);

    @Autowired
    private LotteryService lotteryService;

    @RequestMapping(value = "/getLotteryUserList")
    @ResponseBody
    public Object getLotteryUserList() {
        log.debug("获取抽奖人员列表...");
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            List<WxUserPond> lotteryUserList = this.lotteryService.getLotteryUserList();
            map.put("error", "");
            map.put("msg", lotteryUserList);
        } catch (Exception e) {
            map.put("error", "故障：" + e.toString());
            map.put("msg", "网络故障!请重试");
            return map;
        }
        return map;
    }

    /**
     * @param request
     * @return 2015-1-12 下午4:23:01
     * @RequestBody LotteryRequest request
     * 抽奖记录
     */
    @RequestMapping(value = "/addLotteryLog")
    @ResponseBody
    public BaseResponse addLotteryLog(@RequestBody LotteryRequest request) {
        BaseResponse response = null;
        try {
            log.debug(request.toJsonString());
            response = this.lotteryService.addLotteryLogs(request);
        } catch (Exception e) {
            log.error("异常", e);
            response = getErrorResponse(e);
        }
        return response;
    }
    /**
     * @param request
     * @return 2015-1-12 下午4:23:01
     * @RequestBody LotteryRequest request
     * 增加胜利者
     */
    @RequestMapping(value = "/saveWinnerPlan")
    @ResponseBody
    public BaseResponse saveWinnerPlan(@RequestBody LotteryRequest request) {
        BaseResponse response = null;
        try {
            log.debug(request.toJsonString());
            response = this.lotteryService.saveWinnerPlan(request);
        } catch (Exception e) {
            log.error("异常", e);
            response = getErrorResponse(e);
        }
        return response;
    }
    /**
     * @param twFWinners
     * @param OpenId
     * @return
     * 2014-3-25 下午4:23:25
     */
/*    @RequestMapping(value = "/user/lottery/delWinner")
    @ResponseBody
    public Object delWinner(TwFWinners twFWinners,String OpenId) {
        Map<String, String> map = new HashMap<String, String>();
        try {
//			twFWinners.setWinnersId(UUIDUtils.getUUID());
            twFWinners.setState("0");
//			twFWinners.setLevel(new Short("0"));
            lotteryService.deleteTwFWinners(twFWinners);
            map.put("error", "");
            map.put("msg", "删除成功！");
        } catch (Exception e) {
            map.put("error", "故障：" + e.toString());
            return map;
        }
        return map;
    }*/
}