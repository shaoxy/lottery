package com.ai.lottery.business.cache;

import com.ai.lottery.core.cache.Cache;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 系统配置缓存
 *
 * @author peiyu
 */
public class SystemConfigCache implements Cache<String, String> {

    private Map<String, String> cacheMap;

    private Object lock = new Object();

    private SystemConfigCache() {
        this.cacheMap = new HashMap<>();
    }

    public static SystemConfigCache me() {
        return SystemConfigCacheHandler.CACHE;
    }

    @Override
    public String getCacheByKey(String key) {
        return this.cacheMap.get(key);
    }

    @Override
    public Map<String, String> getAll() {
        return this.cacheMap;
    }

    @Override
    public void addCache(String key, String value) {
        this.cacheMap.put(key, value);
    }

    @Override
    public void addAll(Map<String, String> cacheMap) {
        this.cacheMap.putAll(cacheMap);
    }

    @Override
    public void updateCache(String key, String newValue) {
        String value = getCacheByKey(key);
        if (null != value) {
            synchronized (this.lock) {
                value = getCacheByKey(key);
                if (null != value) {
                    this.cacheMap.put(key, value);
                }
            }
        }

    }

    @Override
    public void deleteCache(String key) {
        this.cacheMap.remove(key);
    }

    @Override
    public void deleteCache(List<String> keys) {
        synchronized (this.lock) {
            for (String key : keys) {
                this.cacheMap.remove(key);
            }
//            keys.forEach(this.cacheMap::remove);
        }
    }

    @Override
    public void clear() {
        this.cacheMap.clear();
    }

    private static class SystemConfigCacheHandler {
        private static SystemConfigCache CACHE = new SystemConfigCache();
    }
}
