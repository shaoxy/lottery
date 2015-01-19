package com.ai.lottery.business.cache;

import com.ai.lottery.core.cache.Cache;
import com.ai.lottery.core.controller.strategy.Strategy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 解密策略缓存
 *
 * @author peiyu
 */
public class StrategyCache implements Cache<Integer, Strategy> {

    private Map<Integer, Strategy> cacheMap;

    private static final Object lock = new Object();

    private StrategyCache() {
        this.cacheMap = new HashMap<>();
    }

    public static StrategyCache me() {
        return StrategyCacheHandler.CACHE;
    }

    @Override
    public Strategy getCacheByKey(Integer key) {
        return this.cacheMap.get(key);
    }

    @Override
    public Map<Integer, Strategy> getAll() {
        return this.cacheMap;
    }

    @Override
    public void addCache(Integer key, Strategy value) {
        this.cacheMap.put(key, value);
    }

    @Override
    public void addAll(Map<Integer, Strategy> cacheMap) {
        this.cacheMap.putAll(cacheMap);
    }

    @Override
    public void updateCache(Integer key, Strategy newValue) {
        Strategy strategy = getCacheByKey(key);
        if (null != strategy) {
            synchronized (lock) {
                strategy = getCacheByKey(key);
                if (null != strategy) {
                    this.cacheMap.put(key, newValue);
                }
            }
        }
    }

    @Override
    public void deleteCache(Integer key) {
        this.cacheMap.remove(key);
    }

    @Override
    public void deleteCache(List<Integer> keys) {
        synchronized (lock) {
            for (Integer key : keys) {
                this.cacheMap.remove(key);
            }
//            keys.forEach(this.cacheMap::remove);
        }
    }

    @Override
    public void clear() {
        this.cacheMap.clear();
    }

    private static class StrategyCacheHandler {
        private static StrategyCache CACHE = new StrategyCache();
    }

}
