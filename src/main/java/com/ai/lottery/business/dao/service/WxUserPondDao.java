package com.ai.lottery.business.dao.service;

import com.ai.lottery.business.dao.persistence.WxUserPondMapper;
import com.ai.lottery.business.domain.entity.WxUserPond;
import com.ai.lottery.core.dao.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: WxUserPondDao
* @Description: wx_user_pond表对应dao操作接口实现类
* @author: peiyu
 */
@Repository
public class WxUserPondDao {
    /**
     * @Fields LOGGER : 日志操作类
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(WxUserPondDao.class);

    /**
     * @Fields WxUserPond表的Mybatis Mapper操作映射类
     */
    @Resource
    private WxUserPondMapper wxUserPondMapper;

    /**
    * @Title WxUserPondDao.countByExample
    * @Description: 根据查询条件，计算wx_user_pond个数
    * @param example 通用查询条件类
    * @return int 结果个数
     */
    public int countByExample(Criteria example) {
        int count = this.wxUserPondMapper.countByExample(example);
        LOGGER.debug("count: {}", count);
        return count;
    }

    /**
    * @Title WxUserPondDao.selectByPrimaryKey
    * @Description: 根据主键类，返回wx_user_pond
    * @param userPondId userPondId
    * @return WxUserPond bean对象
     */
    public WxUserPond selectByPrimaryKey(String userPondId) {
        return this.wxUserPondMapper.selectByPrimaryKey(userPondId);
    }

    /**
    * @Title WxUserPondDao.selectByExample
    * @Description: 根据查询条件类，返回wx_user_pond结果集
    * @param example 通用查询条件类
    * @return List<WxUserPond>wx_user_pond结果集
     */
    public List<WxUserPond> selectByExample(Criteria example) {
        return this.wxUserPondMapper.selectByExample(example);
    }

    /**
    * @Title WxUserPondDao.deleteByPrimaryKey
    * @Description: 根据属性名称，删除wx_user_pond
    * @param userPondId userPondId
    * @return int  删除个数
     */
    public int deleteByPrimaryKey(String userPondId) {
        return this.wxUserPondMapper.deleteByPrimaryKey(userPondId);
    }

    /**
    * @Title WxUserPondDao.updateByPrimaryKeySelective
    * @Description: 根据主键更新wx_user_pond部分字段
    * @param record 要更新成为的WxUserPond对象
    * @return int 更新记录数
     */
    public int updateByPrimaryKeySelective(WxUserPond record) {
        return this.wxUserPondMapper.updateByPrimaryKeySelective(record);
    }

    /**
    * @Title WxUserPondDao.updateByPrimaryKey
    * @Description: 根据主键更新wx_user_pond全部字段
    * @param record 要更新成为的WxUserPond对象
    * @return int 更新记录数
     */
    public int updateByPrimaryKey(WxUserPond record) {
        return this.wxUserPondMapper.updateByPrimaryKey(record);
    }

    /**
    * @Title WxUserPondDao.deleteByExample
    * @Description: 根据查询条件，删除wx_user_pond
    * @param example 通用查询条件类
    * @return int  删除个数
     */
    public int deleteByExample(Criteria example) {
        return this.wxUserPondMapper.deleteByExample(example);
    }

    /**
    * @Title WxUserPondDao.updateByExampleSelective
    * @Description: 根据查询条件更新wx_user_pond部分字段
    * @param record 要更新成为的WxUserPond对象
    * @param example 更新记录的查询条件
    * @return int 更新记录数
     */
    public int updateByExampleSelective(WxUserPond record, Criteria example) {
        return this.wxUserPondMapper.updateByExampleSelective(record, example);
    }

    /**
    * @Title WxUserPondDao.updateByExample
    * @Description: 根据查询条件更新wx_user_pond全表字段
    * @param record 要更新成为的WxUserPond对象
    * @param example 更新记录的查询条件
    * @return int 更新记录数
     */
    public int updateByExample(WxUserPond record, Criteria example) {
        return this.wxUserPondMapper.updateByExample(record, example);
    }

    /**
    * @Title WxUserPondDao.insert
    * @Description: 插入一个wx_user_pond
    * @param record wx_user_pond的bean对象
    * @return int  插入个数
     */
    public int insert(WxUserPond record) {
        return this.wxUserPondMapper.insert(record);
    }

    /**
    * @Title WxUserPondDao.insertSelective
    * @Description: 插入一个只有部分字段的wx_user_pond
    * @param record 只含部分字段的wx_user_pond的bean对象
    * @return int  插入个数
     */
    public int insertSelective(WxUserPond record) {
        return this.wxUserPondMapper.insertSelective(record);
    }
}