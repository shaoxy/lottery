package com.ai.lottery.business.dao.service;

import com.ai.lottery.business.dao.persistence.WxLotteryLogMapper;
import com.ai.lottery.business.domain.entity.WxLotteryLog;
import com.ai.lottery.core.dao.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: WxLotteryLogDao
* @Description: wx_lottery_log表对应dao操作接口实现类
* @author: peiyu
 */
@Repository
public class WxLotteryLogDao {
    /**
     * @Fields LOGGER : 日志操作类
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(WxLotteryLogDao.class);

    /**
     * @Fields WxLotteryLog表的Mybatis Mapper操作映射类
     */
    @Resource
    private WxLotteryLogMapper wxLotteryLogMapper;

    /**
    * @Title WxLotteryLogDao.countByExample
    * @Description: 根据查询条件，计算wx_lottery_log个数
    * @param example 通用查询条件类
    * @return int 结果个数
     */
    public int countByExample(Criteria example) {
        int count = this.wxLotteryLogMapper.countByExample(example);
        LOGGER.debug("count: {}", count);
        return count;
    }

    /**
    * @Title WxLotteryLogDao.selectByPrimaryKey
    * @Description: 根据主键类，返回wx_lottery_log
    * @param lotteryLogId lotteryLogId
    * @return WxLotteryLog bean对象
     */
    public WxLotteryLog selectByPrimaryKey(String lotteryLogId) {
        return this.wxLotteryLogMapper.selectByPrimaryKey(lotteryLogId);
    }

    /**
    * @Title WxLotteryLogDao.selectByExample
    * @Description: 根据查询条件类，返回wx_lottery_log结果集
    * @param example 通用查询条件类
    * @return List<WxLotteryLog>wx_lottery_log结果集
     */
    public List<WxLotteryLog> selectByExample(Criteria example) {
        return this.wxLotteryLogMapper.selectByExample(example);
    }

    /**
    * @Title WxLotteryLogDao.deleteByPrimaryKey
    * @Description: 根据属性名称，删除wx_lottery_log
    * @param lotteryLogId lotteryLogId
    * @return int  删除个数
     */
    public int deleteByPrimaryKey(String lotteryLogId) {
        return this.wxLotteryLogMapper.deleteByPrimaryKey(lotteryLogId);
    }

    /**
    * @Title WxLotteryLogDao.updateByPrimaryKeySelective
    * @Description: 根据主键更新wx_lottery_log部分字段
    * @param record 要更新成为的WxLotteryLog对象
    * @return int 更新记录数
     */
    public int updateByPrimaryKeySelective(WxLotteryLog record) {
        return this.wxLotteryLogMapper.updateByPrimaryKeySelective(record);
    }

    /**
    * @Title WxLotteryLogDao.updateByPrimaryKey
    * @Description: 根据主键更新wx_lottery_log全部字段
    * @param record 要更新成为的WxLotteryLog对象
    * @return int 更新记录数
     */
    public int updateByPrimaryKey(WxLotteryLog record) {
        return this.wxLotteryLogMapper.updateByPrimaryKey(record);
    }

    /**
    * @Title WxLotteryLogDao.deleteByExample
    * @Description: 根据查询条件，删除wx_lottery_log
    * @param example 通用查询条件类
    * @return int  删除个数
     */
    public int deleteByExample(Criteria example) {
        return this.wxLotteryLogMapper.deleteByExample(example);
    }

    /**
    * @Title WxLotteryLogDao.updateByExampleSelective
    * @Description: 根据查询条件更新wx_lottery_log部分字段
    * @param record 要更新成为的WxLotteryLog对象
    * @param example 更新记录的查询条件
    * @return int 更新记录数
     */
    public int updateByExampleSelective(WxLotteryLog record, Criteria example) {
        return this.wxLotteryLogMapper.updateByExampleSelective(record, example);
    }

    /**
    * @Title WxLotteryLogDao.updateByExample
    * @Description: 根据查询条件更新wx_lottery_log全表字段
    * @param record 要更新成为的WxLotteryLog对象
    * @param example 更新记录的查询条件
    * @return int 更新记录数
     */
    public int updateByExample(WxLotteryLog record, Criteria example) {
        return this.wxLotteryLogMapper.updateByExample(record, example);
    }

    /**
    * @Title WxLotteryLogDao.insert
    * @Description: 插入一个wx_lottery_log
    * @param record wx_lottery_log的bean对象
    * @return int  插入个数
     */
    public int insert(WxLotteryLog record) {
        return this.wxLotteryLogMapper.insert(record);
    }

    /**
    * @Title WxLotteryLogDao.insertSelective
    * @Description: 插入一个只有部分字段的wx_lottery_log
    * @param record 只含部分字段的wx_lottery_log的bean对象
    * @return int  插入个数
     */
    public int insertSelective(WxLotteryLog record) {
        return this.wxLotteryLogMapper.insertSelective(record);
    }
}