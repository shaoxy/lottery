package com.ai.lottery.business.dao.service;

import com.ai.lottery.business.dao.persistence.WxLotteryRoundMapper;
import com.ai.lottery.business.domain.entity.WxLotteryRound;
import com.ai.lottery.core.dao.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: WxLotteryRoundDao
* @Description: wx_lottery_round表对应dao操作接口实现类
* @author: peiyu
 */
@Repository
public class WxLotteryRoundDao {
    /**
     * @Fields LOGGER : 日志操作类
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(WxLotteryRoundDao.class);

    /**
     * @Fields WxLotteryRound表的Mybatis Mapper操作映射类
     */
    @Resource
    private WxLotteryRoundMapper wxLotteryRoundMapper;

    /**
    * @Title WxLotteryRoundDao.countByExample
    * @Description: 根据查询条件，计算wx_lottery_round个数
    * @param example 通用查询条件类
    * @return int 结果个数
     */
    public int countByExample(Criteria example) {
        int count = this.wxLotteryRoundMapper.countByExample(example);
        LOGGER.debug("count: {}", count);
        return count;
    }

    /**
    * @Title WxLotteryRoundDao.selectByPrimaryKey
    * @Description: 根据主键类，返回wx_lottery_round
    * @param lotteryRoundId lotteryRoundId
    * @return WxLotteryRound bean对象
     */
    public WxLotteryRound selectByPrimaryKey(String lotteryRoundId) {
        return this.wxLotteryRoundMapper.selectByPrimaryKey(lotteryRoundId);
    }

    /**
    * @Title WxLotteryRoundDao.selectByExample
    * @Description: 根据查询条件类，返回wx_lottery_round结果集
    * @param example 通用查询条件类
    * @return List<WxLotteryRound>wx_lottery_round结果集
     */
    public List<WxLotteryRound> selectByExample(Criteria example) {
        return this.wxLotteryRoundMapper.selectByExample(example);
    }

    /**
    * @Title WxLotteryRoundDao.deleteByPrimaryKey
    * @Description: 根据属性名称，删除wx_lottery_round
    * @param lotteryRoundId lotteryRoundId
    * @return int  删除个数
     */
    public int deleteByPrimaryKey(String lotteryRoundId) {
        return this.wxLotteryRoundMapper.deleteByPrimaryKey(lotteryRoundId);
    }

    /**
    * @Title WxLotteryRoundDao.updateByPrimaryKeySelective
    * @Description: 根据主键更新wx_lottery_round部分字段
    * @param record 要更新成为的WxLotteryRound对象
    * @return int 更新记录数
     */
    public int updateByPrimaryKeySelective(WxLotteryRound record) {
        return this.wxLotteryRoundMapper.updateByPrimaryKeySelective(record);
    }

    /**
    * @Title WxLotteryRoundDao.updateByPrimaryKey
    * @Description: 根据主键更新wx_lottery_round全部字段
    * @param record 要更新成为的WxLotteryRound对象
    * @return int 更新记录数
     */
    public int updateByPrimaryKey(WxLotteryRound record) {
        return this.wxLotteryRoundMapper.updateByPrimaryKey(record);
    }

    /**
    * @Title WxLotteryRoundDao.deleteByExample
    * @Description: 根据查询条件，删除wx_lottery_round
    * @param example 通用查询条件类
    * @return int  删除个数
     */
    public int deleteByExample(Criteria example) {
        return this.wxLotteryRoundMapper.deleteByExample(example);
    }

    /**
    * @Title WxLotteryRoundDao.updateByExampleSelective
    * @Description: 根据查询条件更新wx_lottery_round部分字段
    * @param record 要更新成为的WxLotteryRound对象
    * @param example 更新记录的查询条件
    * @return int 更新记录数
     */
    public int updateByExampleSelective(WxLotteryRound record, Criteria example) {
        return this.wxLotteryRoundMapper.updateByExampleSelective(record, example);
    }

    /**
    * @Title WxLotteryRoundDao.updateByExample
    * @Description: 根据查询条件更新wx_lottery_round全表字段
    * @param record 要更新成为的WxLotteryRound对象
    * @param example 更新记录的查询条件
    * @return int 更新记录数
     */
    public int updateByExample(WxLotteryRound record, Criteria example) {
        return this.wxLotteryRoundMapper.updateByExample(record, example);
    }

    /**
    * @Title WxLotteryRoundDao.insert
    * @Description: 插入一个wx_lottery_round
    * @param record wx_lottery_round的bean对象
    * @return int  插入个数
     */
    public int insert(WxLotteryRound record) {
        return this.wxLotteryRoundMapper.insert(record);
    }

    /**
    * @Title WxLotteryRoundDao.insertSelective
    * @Description: 插入一个只有部分字段的wx_lottery_round
    * @param record 只含部分字段的wx_lottery_round的bean对象
    * @return int  插入个数
     */
    public int insertSelective(WxLotteryRound record) {
        return this.wxLotteryRoundMapper.insertSelective(record);
    }
}