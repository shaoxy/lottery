package com.ai.lottery.business.dao.persistence;

import com.ai.lottery.business.domain.entity.WxLotteryLog;
import com.ai.lottery.core.dao.Criteria;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: WxLotteryLogMapper
* @Description: wx_lottery_log表对应的dao操作Mapper映射类
* @author: peiyu
 */
public interface WxLotteryLogMapper {
    /**
    * @Title WxLotteryLogMapper.countByExample
    * @Description: 根据查询条件，计算wx_lottery_log个数
    * @param example 通用查询条件类
    * @return int 结果个数
     */
    int countByExample(Criteria example);

    /**
    * @Title WxLotteryLogMapper.deleteByExample
    * @Description: 根据查询条件，删除wx_lottery_log
    * @param example 通用查询条件类
    * @return int  删除个数
     */
    int deleteByExample(Criteria example);

    /**
    * @Title WxLotteryLogMapper.deleteByPrimaryKey
    * @Description: 根据属性名称，删除wx_lottery_log
    * @param lotteryLogId lotteryLogId
    * @return int  删除个数
     */
    int deleteByPrimaryKey(String lotteryLogId);

    /**
    * @Title WxLotteryLogMapper.insert
    * @Description: 插入一个wx_lottery_log
    * @param record wx_lottery_log的bean对象
    * @return int  插入个数
     */
    int insert(WxLotteryLog record);

    /**
    * @Title WxLotteryLogMapper.insertSelective
    * @Description: 插入一个只有部分字段的wx_lottery_log
    * @param record 只含部分字段的wx_lottery_log的bean对象
    * @return int  插入个数
     */
    int insertSelective(WxLotteryLog record);

    /**
    * @Title WxLotteryLogMapper.selectByExample
    * @Description: 根据查询条件类，返回wx_lottery_log结果集
    * @param example 通用查询条件类
    * @return List<WxLotteryLog>wx_lottery_log结果集
     */
    List<WxLotteryLog> selectByExample(Criteria example);

    /**
    * @Title WxLotteryLogMapper.selectByPrimaryKey
    * @Description: 根据主键类，返回wx_lottery_log
    * @param lotteryLogId lotteryLogId
    * @return WxLotteryLog bean对象
     */
    WxLotteryLog selectByPrimaryKey(String lotteryLogId);

    /**
    * @Title WxLotteryLogMapper.updateByExampleSelective
    * @Description: 根据查询条件更新wx_lottery_log部分字段
    * @param record 要更新成为的WxLotteryLog对象
    * @param criteria 更新记录的查询条件
    * @return int 更新记录数
     */
    int updateByExampleSelective(@Param("record") WxLotteryLog record, @Param("example") Criteria criteria);

    /**
    * @Title WxLotteryLogMapper.updateByExample
    * @Description: 根据查询条件更新wx_lottery_log全表字段
    * @param record 要更新成为的WxLotteryLog对象
    * @param criteria 更新记录的查询条件
    * @return int 更新记录数
     */
    int updateByExample(@Param("record") WxLotteryLog record, @Param("example") Criteria criteria);

    /**
    * @Title WxLotteryLogMapper.updateByPrimaryKeySelective
    * @Description: 根据主键更新wx_lottery_log部分字段
    * @param record 要更新成为的WxLotteryLog对象
    * @return int 更新记录数
     */
    int updateByPrimaryKeySelective(WxLotteryLog record);

    /**
    * @Title WxLotteryLogMapper.updateByPrimaryKey
    * @Description: 根据主键更新wx_lottery_log全部字段
    * @param record 要更新成为的WxLotteryLog对象
    * @return int 更新记录数
     */
    int updateByPrimaryKey(WxLotteryLog record);
}