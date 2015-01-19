package com.ai.lottery.business.dao.persistence;

import com.ai.lottery.business.domain.entity.WxLotteryRound;
import com.ai.lottery.core.dao.Criteria;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName: WxLotteryRoundMapper
* @Description: wx_lottery_round表对应的dao操作Mapper映射类
* @author: peiyu
 */
public interface WxLotteryRoundMapper {
    /**
    * @Title WxLotteryRoundMapper.countByExample
    * @Description: 根据查询条件，计算wx_lottery_round个数
    * @param example 通用查询条件类
    * @return int 结果个数
     */
    int countByExample(Criteria example);

    /**
    * @Title WxLotteryRoundMapper.deleteByExample
    * @Description: 根据查询条件，删除wx_lottery_round
    * @param example 通用查询条件类
    * @return int  删除个数
     */
    int deleteByExample(Criteria example);

    /**
    * @Title WxLotteryRoundMapper.deleteByPrimaryKey
    * @Description: 根据属性名称，删除wx_lottery_round
    * @param lotteryRoundId lotteryRoundId
    * @return int  删除个数
     */
    int deleteByPrimaryKey(String lotteryRoundId);

    /**
    * @Title WxLotteryRoundMapper.insert
    * @Description: 插入一个wx_lottery_round
    * @param record wx_lottery_round的bean对象
    * @return int  插入个数
     */
    int insert(WxLotteryRound record);

    /**
    * @Title WxLotteryRoundMapper.insertSelective
    * @Description: 插入一个只有部分字段的wx_lottery_round
    * @param record 只含部分字段的wx_lottery_round的bean对象
    * @return int  插入个数
     */
    int insertSelective(WxLotteryRound record);

    /**
    * @Title WxLotteryRoundMapper.selectByExample
    * @Description: 根据查询条件类，返回wx_lottery_round结果集
    * @param example 通用查询条件类
    * @return List<WxLotteryRound>wx_lottery_round结果集
     */
    List<WxLotteryRound> selectByExample(Criteria example);

    /**
    * @Title WxLotteryRoundMapper.selectByPrimaryKey
    * @Description: 根据主键类，返回wx_lottery_round
    * @param lotteryRoundId lotteryRoundId
    * @return WxLotteryRound bean对象
     */
    WxLotteryRound selectByPrimaryKey(String lotteryRoundId);

    /**
    * @Title WxLotteryRoundMapper.updateByExampleSelective
    * @Description: 根据查询条件更新wx_lottery_round部分字段
    * @param record 要更新成为的WxLotteryRound对象
    * @param criteria 更新记录的查询条件
    * @return int 更新记录数
     */
    int updateByExampleSelective(@Param("record") WxLotteryRound record, @Param("example") Criteria criteria);

    /**
    * @Title WxLotteryRoundMapper.updateByExample
    * @Description: 根据查询条件更新wx_lottery_round全表字段
    * @param record 要更新成为的WxLotteryRound对象
    * @param criteria 更新记录的查询条件
    * @return int 更新记录数
     */
    int updateByExample(@Param("record") WxLotteryRound record, @Param("example") Criteria criteria);

    /**
    * @Title WxLotteryRoundMapper.updateByPrimaryKeySelective
    * @Description: 根据主键更新wx_lottery_round部分字段
    * @param record 要更新成为的WxLotteryRound对象
    * @return int 更新记录数
     */
    int updateByPrimaryKeySelective(WxLotteryRound record);

    /**
    * @Title WxLotteryRoundMapper.updateByPrimaryKey
    * @Description: 根据主键更新wx_lottery_round全部字段
    * @param record 要更新成为的WxLotteryRound对象
    * @return int 更新记录数
     */
    int updateByPrimaryKey(WxLotteryRound record);
}