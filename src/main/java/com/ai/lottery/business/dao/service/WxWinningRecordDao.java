package com.ai.lottery.business.dao.service;

import com.ai.lottery.business.dao.persistence.WxWinningRecordMapper;
import com.ai.lottery.business.domain.entity.WxWinningRecord;
import com.ai.lottery.core.dao.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: WxWinningRecordDao
* @Description: wx_winning_record表对应dao操作接口实现类
* @author: peiyu
 */
@Repository
public class WxWinningRecordDao {
    /**
     * @Fields LOGGER : 日志操作类
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(WxWinningRecordDao.class);

    /**
     * @Fields WxWinningRecord表的Mybatis Mapper操作映射类
     */
    @Resource
    private WxWinningRecordMapper wxWinningRecordMapper;

    /**
    * @Title WxWinningRecordDao.countByExample
    * @Description: 根据查询条件，计算wx_winning_record个数
    * @param example 通用查询条件类
    * @return int 结果个数
     */
    public int countByExample(Criteria example) {
        int count = this.wxWinningRecordMapper.countByExample(example);
        LOGGER.debug("count: {}", count);
        return count;
    }

    /**
    * @Title WxWinningRecordDao.selectByPrimaryKey
    * @Description: 根据主键类，返回wx_winning_record
    * @param winningRecordId winningRecordId
    * @return WxWinningRecord bean对象
     */
    public WxWinningRecord selectByPrimaryKey(String winningRecordId) {
        return this.wxWinningRecordMapper.selectByPrimaryKey(winningRecordId);
    }

    /**
    * @Title WxWinningRecordDao.selectByExample
    * @Description: 根据查询条件类，返回wx_winning_record结果集
    * @param example 通用查询条件类
    * @return List<WxWinningRecord>wx_winning_record结果集
     */
    public List<WxWinningRecord> selectByExample(Criteria example) {
        return this.wxWinningRecordMapper.selectByExample(example);
    }

    /**
    * @Title WxWinningRecordDao.deleteByPrimaryKey
    * @Description: 根据属性名称，删除wx_winning_record
    * @param winningRecordId winningRecordId
    * @return int  删除个数
     */
    public int deleteByPrimaryKey(String winningRecordId) {
        return this.wxWinningRecordMapper.deleteByPrimaryKey(winningRecordId);
    }

    /**
    * @Title WxWinningRecordDao.updateByPrimaryKeySelective
    * @Description: 根据主键更新wx_winning_record部分字段
    * @param record 要更新成为的WxWinningRecord对象
    * @return int 更新记录数
     */
    public int updateByPrimaryKeySelective(WxWinningRecord record) {
        return this.wxWinningRecordMapper.updateByPrimaryKeySelective(record);
    }

    /**
    * @Title WxWinningRecordDao.updateByPrimaryKey
    * @Description: 根据主键更新wx_winning_record全部字段
    * @param record 要更新成为的WxWinningRecord对象
    * @return int 更新记录数
     */
    public int updateByPrimaryKey(WxWinningRecord record) {
        return this.wxWinningRecordMapper.updateByPrimaryKey(record);
    }

    /**
    * @Title WxWinningRecordDao.deleteByExample
    * @Description: 根据查询条件，删除wx_winning_record
    * @param example 通用查询条件类
    * @return int  删除个数
     */
    public int deleteByExample(Criteria example) {
        return this.wxWinningRecordMapper.deleteByExample(example);
    }

    /**
    * @Title WxWinningRecordDao.updateByExampleSelective
    * @Description: 根据查询条件更新wx_winning_record部分字段
    * @param record 要更新成为的WxWinningRecord对象
    * @param example 更新记录的查询条件
    * @return int 更新记录数
     */
    public int updateByExampleSelective(WxWinningRecord record, Criteria example) {
        return this.wxWinningRecordMapper.updateByExampleSelective(record, example);
    }

    /**
    * @Title WxWinningRecordDao.updateByExample
    * @Description: 根据查询条件更新wx_winning_record全表字段
    * @param record 要更新成为的WxWinningRecord对象
    * @param example 更新记录的查询条件
    * @return int 更新记录数
     */
    public int updateByExample(WxWinningRecord record, Criteria example) {
        return this.wxWinningRecordMapper.updateByExample(record, example);
    }

    /**
    * @Title WxWinningRecordDao.insert
    * @Description: 插入一个wx_winning_record
    * @param record wx_winning_record的bean对象
    * @return int  插入个数
     */
    public int insert(WxWinningRecord record) {
        return this.wxWinningRecordMapper.insert(record);
    }

    /**
    * @Title WxWinningRecordDao.insertSelective
    * @Description: 插入一个只有部分字段的wx_winning_record
    * @param record 只含部分字段的wx_winning_record的bean对象
    * @return int  插入个数
     */
    public int insertSelective(WxWinningRecord record) {
        return this.wxWinningRecordMapper.insertSelective(record);
    }
}