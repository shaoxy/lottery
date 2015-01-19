package com.ai.lottery.business.controller;

import com.ai.lottery.business.domain.entity.WxUserPond;
import com.ai.lottery.business.service.LotteryService;
import com.ai.lottery.core.utils.JSONUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author shaoxy
 */
@Controller
@RequestMapping("/lottery")
public class LotteryController {

    private static final Logger log = LoggerFactory.getLogger(LotteryController.class);

    @Autowired
    private LotteryService lotteryService;

    @RequestMapping(value = {"/init"}, method = {RequestMethod.GET})
    public String pageInit(ModelMap modelMap) {
        log.debug("开始进入抽奖页面...");
        List<WxUserPond> lotteryUserList = this.lotteryService.getLotteryUserList();
        modelMap.addAttribute("lotteryUserList", JSONUtil.toJson(lotteryUserList));
        modelMap.addAttribute("lotteryUserList_size", lotteryUserList.size());
        return "lottery";
    }

    @RequestMapping(value = {"/userPage"}, method = {RequestMethod.GET})
    public String userPageInit(ModelMap modelMap) {
        log.debug("进入用户列表页面...");
        List<WxUserPond> lotteryUserList = this.lotteryService.getLotteryUserList();
        modelMap.addAttribute("lotteryUserList", lotteryUserList);
        modelMap.addAttribute("lotteryUserList_size", lotteryUserList.size());
        return "userPage";
    }
}