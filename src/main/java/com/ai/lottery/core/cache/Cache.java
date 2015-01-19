package com.ai.lottery.core.cache;

import java.util.List;
import java.util.Map;

/**
 * 缓存接口
 * @author peiyu
 */
public interface Cache<K, V> {

    /**
     * 通过key获取缓存
     * @param key 关键字
     * @return 缓存
     */
    V getCacheByKey(K key);

    /**
     * 获取全部缓存
     * @return 全部缓存数据
     */
    Map<K, V> getAll();

    /**
     * 添加缓存
     * @param key 关键字
     * @param value 缓存
     */
    void addCache(K key, V value);

    /**
     * 批量添加缓存
     * @param cacheMap 需要加入的数据
     */
    void addAll(Map<K, V> cacheMap);

    /**
     * 更新缓存
     * @param key 关键字
     * @param newValue 新缓存
     */
    void updateCache(K key, V newValue);

    /**
     * 删除缓存
     * @param key 关键字
     */
    void deleteCache(K key);

    /**
     * 批量删除缓存
     * @param keys 缓存关键字列表
     */
    void deleteCache(List<K> keys);

    /**
     * 清理缓存数据
     */
    void clear();

}
