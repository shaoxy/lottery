package com.ai.lottery.business.dao.persistence;

import com.ai.lottery.business.domain.entity.WxUserPond;
import com.ai.lottery.core.dao.Criteria;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName: WxUserPondMapper
* @Description: wx_user_pond表对应的dao操作Mapper映射类
* @author: peiyu
 */
public interface WxUserPondMapper {
    /**
    * @Title WxUserPondMapper.countByExample
    * @Description: 根据查询条件，计算wx_user_pond个数
    * @param example 通用查询条件类
    * @return int 结果个数
     */
    int countByExample(Criteria example);

    /**
    * @Title WxUserPondMapper.deleteByExample
    * @Description: 根据查询条件，删除wx_user_pond
    * @param example 通用查询条件类
    * @return int  删除个数
     */
    int deleteByExample(Criteria example);

    /**
    * @Title WxUserPondMapper.deleteByPrimaryKey
    * @Description: 根据属性名称，删除wx_user_pond
    * @param userPondId userPondId
    * @return int  删除个数
     */
    int deleteByPrimaryKey(String userPondId);

    /**
    * @Title WxUserPondMapper.insert
    * @Description: 插入一个wx_user_pond
    * @param record wx_user_pond的bean对象
    * @return int  插入个数
     */
    int insert(WxUserPond record);

    /**
    * @Title WxUserPondMapper.insertSelective
    * @Description: 插入一个只有部分字段的wx_user_pond
    * @param record 只含部分字段的wx_user_pond的bean对象
    * @return int  插入个数
     */
    int insertSelective(WxUserPond record);

    /**
    * @Title WxUserPondMapper.selectByExample
    * @Description: 根据查询条件类，返回wx_user_pond结果集
    * @param example 通用查询条件类
    * @return List<WxUserPond>wx_user_pond结果集
     */
    List<WxUserPond> selectByExample(Criteria example);

    /**
    * @Title WxUserPondMapper.selectByPrimaryKey
    * @Description: 根据主键类，返回wx_user_pond
    * @param userPondId userPondId
    * @return WxUserPond bean对象
     */
    WxUserPond selectByPrimaryKey(String userPondId);

    /**
    * @Title WxUserPondMapper.updateByExampleSelective
    * @Description: 根据查询条件更新wx_user_pond部分字段
    * @param record 要更新成为的WxUserPond对象
    * @param criteria 更新记录的查询条件
    * @return int 更新记录数
     */
    int updateByExampleSelective(@Param("record") WxUserPond record, @Param("example") Criteria criteria);

    /**
    * @Title WxUserPondMapper.updateByExample
    * @Description: 根据查询条件更新wx_user_pond全表字段
    * @param record 要更新成为的WxUserPond对象
    * @param criteria 更新记录的查询条件
    * @return int 更新记录数
     */
    int updateByExample(@Param("record") WxUserPond record, @Param("example") Criteria criteria);

    /**
    * @Title WxUserPondMapper.updateByPrimaryKeySelective
    * @Description: 根据主键更新wx_user_pond部分字段
    * @param record 要更新成为的WxUserPond对象
    * @return int 更新记录数
     */
    int updateByPrimaryKeySelective(WxUserPond record);

    /**
    * @Title WxUserPondMapper.updateByPrimaryKey
    * @Description: 根据主键更新wx_user_pond全部字段
    * @param record 要更新成为的WxUserPond对象
    * @return int 更新记录数
     */
    int updateByPrimaryKey(WxUserPond record);
}