/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.springframework.dao.DataAccessException;

public interface Cache {

    boolean cacheEnable();

    Long evict(List<String> keys) throws DataAccessException;

    Long evict(String... key) throws DataAccessException;

    <T> List<T> getByList(List<String> keys, Class<T> type) throws DataAccessException;

    <T> T get(String key, Class<T> type) throws DataAccessException;

    Long getExpire(String key, final TimeUnit timeUnit) throws DataAccessException;

    Boolean put(String key, Object value) throws DataAccessException;

    Boolean put(String key, Object value, Long customerExpire) throws DataAccessException;

    Boolean hset(String key, String field, Object value) throws DataAccessException;

    Boolean hmset(String key, Map<String, Object> kvs) throws DataAccessException;

    <T> T hget(String key, String field, Class<T> type) throws DataAccessException;

    <T> Map<String, T> hmget(String key, List<String> field, Class<T> type) throws DataAccessException;

    <T> Map<String, T> hgetall(String key, Class<T> type) throws DataAccessException;

    Boolean hdel(String key, String field) throws DataAccessException;

    Boolean hmdel(String key, List<String> field) throws DataAccessException;
    /**
     * 根据字段前缀删除缓存
     *
     * @param fieldPrefix 字段前缀
     */
    Long hDelByPrefix(String key, String fieldPrefix) throws DataAccessException;

    Boolean exists(String key);
}
