package com.ai.lottery.business.cache;

//import com.ai.lottery.business.dao.service.TdMUserDao;
//import com.ai.lottery.business.domain.entity.TdMUser;
import com.ai.lottery.core.cache.GuavaCacheAdapter;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * 用户信息缓存，Key为用户ID，Value为用户表实体
 * @author peiyu
 */
@Component
public class UserCache extends GuavaCacheAdapter<String, String> {
    @Override
    protected LoadingCache<String, String> config() {
        return null;
    }

/*    private static final Logger log = LoggerFactory.getLogger(UserCache.class);

    @Autowired
    private TdMUserDao tdMUserDao;

    @Override
    protected LoadingCache<String, TdMUser> config() {
        return CacheBuilder.newBuilder()
                .recordStats()
                .maximumSize(100)
                //写入后5分钟刷新一次
                .refreshAfterWrite(5, TimeUnit.MINUTES)
                .build(new CacheLoader<String, TdMUser>() {
                    @Override
                    public TdMUser load(String key) throws Exception {
                        log.debug("加载用户信息缓存，用户ID:{}", key);
                        return tdMUserDao.selectByPrimaryKey(key);
                    }
                });
    }*/
}
