package com.ai.lottery.core.cache;

import com.google.common.cache.CacheStats;
import com.google.common.cache.LoadingCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/**
 * @author peiyu
 */
public abstract class GuavaCacheAdapter<K, V> implements Cache<K, V> {

    private static final Logger log = LoggerFactory.getLogger(GuavaCacheAdapter.class);

    private final LoadingCache<K, V> cache = config();

    protected abstract LoadingCache<K, V> config();

    @Override
    public V getCacheByKey(K key) {
        try {
            return this.cache.get(key);
        } catch (ExecutionException e) {
            log.error("获取缓存异常", e);
        }
        return null;
    }

    @Override
    public Map<K, V> getAll() {
        return this.cache.asMap();
    }

    @Override
    public void addCache(K key, V value) {
        this.cache.put(key, value);
    }

    @Override
    public void addAll(Map<K, V> cacheMap) {
        this.cache.putAll(cacheMap);
    }

    @Override
    public void updateCache(K key, V newValue) {
        this.cache.put(key, newValue);
    }

    @Override
    public void deleteCache(K key) {
        this.cache.invalidate(key);
    }

    @Override
    public void deleteCache(List<K> keys) {
        this.cache.invalidateAll(keys);
    }

    @Override
    public void clear() {
        this.cache.cleanUp();
    }

    /**
     * 获取缓存统计数据
     * @return 统计数据
     */
    protected CacheStats cacheStats() {
        return this.cache.stats();
    }
}
