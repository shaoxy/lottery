package com.ai.lottery.business.dao.persistence;

import com.ai.lottery.business.domain.entity.WxWinningRecord;
import com.ai.lottery.core.dao.Criteria;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName: WxWinningRecordMapper
* @Description: wx_winning_record表对应的dao操作Mapper映射类
* @author: peiyu
 */
public interface WxWinningRecordMapper {
    /**
    * @Title WxWinningRecordMapper.countByExample
    * @Description: 根据查询条件，计算wx_winning_record个数
    * @param example 通用查询条件类
    * @return int 结果个数
     */
    int countByExample(Criteria example);

    /**
    * @Title WxWinningRecordMapper.deleteByExample
    * @Description: 根据查询条件，删除wx_winning_record
    * @param example 通用查询条件类
    * @return int  删除个数
     */
    int deleteByExample(Criteria example);

    /**
    * @Title WxWinningRecordMapper.deleteByPrimaryKey
    * @Description: 根据属性名称，删除wx_winning_record
    * @param winningRecordId winningRecordId
    * @return int  删除个数
     */
    int deleteByPrimaryKey(String winningRecordId);

    /**
    * @Title WxWinningRecordMapper.insert
    * @Description: 插入一个wx_winning_record
    * @param record wx_winning_record的bean对象
    * @return int  插入个数
     */
    int insert(WxWinningRecord record);

    /**
    * @Title WxWinningRecordMapper.insertSelective
    * @Description: 插入一个只有部分字段的wx_winning_record
    * @param record 只含部分字段的wx_winning_record的bean对象
    * @return int  插入个数
     */
    int insertSelective(WxWinningRecord record);

    /**
    * @Title WxWinningRecordMapper.selectByExample
    * @Description: 根据查询条件类，返回wx_winning_record结果集
    * @param example 通用查询条件类
    * @return List<WxWinningRecord>wx_winning_record结果集
     */
    List<WxWinningRecord> selectByExample(Criteria example);

    /**
    * @Title WxWinningRecordMapper.selectByPrimaryKey
    * @Description: 根据主键类，返回wx_winning_record
    * @param winningRecordId winningRecordId
    * @return WxWinningRecord bean对象
     */
    WxWinningRecord selectByPrimaryKey(String winningRecordId);

    /**
    * @Title WxWinningRecordMapper.updateByExampleSelective
    * @Description: 根据查询条件更新wx_winning_record部分字段
    * @param record 要更新成为的WxWinningRecord对象
    * @param criteria 更新记录的查询条件
    * @return int 更新记录数
     */
    int updateByExampleSelective(@Param("record") WxWinningRecord record, @Param("example") Criteria criteria);

    /**
    * @Title WxWinningRecordMapper.updateByExample
    * @Description: 根据查询条件更新wx_winning_record全表字段
    * @param record 要更新成为的WxWinningRecord对象
    * @param criteria 更新记录的查询条件
    * @return int 更新记录数
     */
    int updateByExample(@Param("record") WxWinningRecord record, @Param("example") Criteria criteria);

    /**
    * @Title WxWinningRecordMapper.updateByPrimaryKeySelective
    * @Description: 根据主键更新wx_winning_record部分字段
    * @param record 要更新成为的WxWinningRecord对象
    * @return int 更新记录数
     */
    int updateByPrimaryKeySelective(WxWinningRecord record);

    /**
    * @Title WxWinningRecordMapper.updateByPrimaryKey
    * @Description: 根据主键更新wx_winning_record全部字段
    * @param record 要更新成为的WxWinningRecord对象
    * @return int 更新记录数
     */
    int updateByPrimaryKey(WxWinningRecord record);
}