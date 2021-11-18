/*
 * Copyright (c) Baidu Inc. All rights reserved.
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.baidu.brcc.redis;

import static org.apache.commons.lang3.StringUtils.isBlank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.baidu.brcc.Cache;
import com.baidu.brcc.utils.gson.GsonUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class RedisCache implements Cache {

    // 键前缀
    @Value("${cache.key.prefix:mapp.rcc.}")
    private String keyPrefix;

    // 缓存总开关
    @Value("${rcc.cache.enable:true}")
    private boolean cacheEnable;

    // 缓存过期时间，默认30s
    @Value("${rcc.cache.default.expire: 30}")
    private long expireTime;

    private Random random = new Random();

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Override
    public boolean cacheEnable() {
        return cacheEnable;
    }

    @Override
    public Long evict(List<String> keys) throws DataAccessException {
        if (CollectionUtils.isEmpty(keys)) {
            return 0L;
        }
        String[] keya = new String[keys.size()];
        for (int i = 0; i < keys.size(); i++) {
            keya[i] = keys.get(i);
        }
        return evict(keya);
    }

    @Override
    public Long evict(String... key) throws DataAccessException {
        if (key == null || key.length <= 0) {
            return 0L;
        }
        byte[][] keys = new byte[key.length][];
        for (int i = 0; i < key.length; i++) {
            if (key[i] == null) {
                continue;
            }
            String keyString = keyPrefix.concat(key[i]);
            keys[i] = keyString.getBytes();
        }
        return redisTemplate.execute((RedisConnection connection) -> connection.del(keys));
    }

    @Override
    public <T> List<T> getByList(List<String> keys, Class<T> type) throws DataAccessException {
        if (CollectionUtils.isEmpty(keys)) {
            return null;
        }
        byte[][] keyf = new byte[keys.size()][];
        for (int i = 0; i < keys.size(); i++) {
            byte[] keyb = keyPrefix.concat(keys.get(i)).getBytes();
            keyf[i] = keyb;
        }
        return redisTemplate.execute((RedisConnection connection) -> {
            List<byte[]> values = connection.mGet(keyf);
            if (CollectionUtils.isEmpty(values)) {
                if (log.isDebugEnabled()) {
                    log.debug("the values of the keys {} is empty", keys);
                }
                return null;
            }
            return values.stream().filter(Objects :: nonNull)
                    .map((byte[] value) -> GsonUtils.toObject(value, type))
                    .collect(Collectors.toList());

        });
    }

    @Override
    public <T> T get(String key, Class<T> type) throws DataAccessException {
        if (isBlank(key)) {
            return null;
        }
        String keyString = keyPrefix.concat(key);
        return redisTemplate.execute((RedisConnection connection) -> {
            byte[] keyb = keyString.getBytes();
            byte[] value = connection.get(keyb);
            if (value == null) {
                return null;
            }
            return GsonUtils.toObject(value, type);
        });
    }

    @Override
    public Long getExpire(String key, TimeUnit timeUnit) throws DataAccessException {
        if (isBlank(key)) {
            return null;
        }
        String keyString = keyPrefix.concat(key);
        return redisTemplate.execute((RedisConnection connection) -> {
            byte[] keyb = keyString.getBytes();
            try {
                return connection.pTtl(keyb, timeUnit);
            } catch (Exception e) {
                // Driver may not support pTtl or we may be running on Redis 2.4
                return connection.ttl(keyb, timeUnit);
            }
        });
    }

    @Override
    public Boolean put(String key, Object value) throws DataAccessException {
        return put(key, value, expireTime + random.nextInt(10));
    }

    @Override
    public Boolean put(String key, Object value, Long customerExpire) throws DataAccessException {
        if (isBlank(key)) {
            return Boolean.FALSE;
        }
        String keyString = keyPrefix.concat(key);
        final long liveTime = (customerExpire != null) ? customerExpire : expireTime;
        return redisTemplate.execute(
                (RedisConnection connection) -> {
                    byte[] keyb = keyString.getBytes();
                    byte[] valueb = GsonUtils.toJsonBytes(value);
                    if (liveTime > 0) {
                        connection.setEx(keyb, liveTime, valueb);
                    } else {
                        connection.set(keyb, valueb);
                    }
                    return Boolean.TRUE;
                });
    }

    @Override
    public Boolean hset(String key, String field, Object value) throws DataAccessException {
        if (isBlank(key) || isBlank(field)) {
            return Boolean.FALSE;
        }
        String keyString = keyPrefix.concat(key);
        return redisTemplate.execute(
                (RedisConnection connection) -> {
                    byte[] keyb = keyString.getBytes();
                    byte[] fieldb = field.getBytes();
                    byte[] valueb = GsonUtils.toJsonBytes(value);
                    return connection.hSet(keyb, fieldb, valueb);
                });

    }

    @Override
    public Boolean hmset(String key, Map<String, Object> kvs) throws DataAccessException {
        if (isBlank(key) || CollectionUtils.isEmpty(kvs)) {
            return Boolean.FALSE;
        }
        String keyString = keyPrefix.concat(key);
        return redisTemplate.execute(
                (RedisConnection connection) -> {
                    Map<byte[], byte[]> kvalues = new HashMap<>();
                    for (Map.Entry<String, Object> entry : kvs.entrySet()) {
                        String filed = entry.getKey();
                        if (filed == null) {
                            continue;
                        }
                        kvalues.put(filed.getBytes(), GsonUtils.toJsonBytes(entry.getValue()));
                    }
                    byte[] keyb = keyString.getBytes();
                    connection.hMSet(keyb, kvalues);
                    return Boolean.TRUE;
                });
    }

    @Override
    public <T> T hget(String key, String field, Class<T> type) throws DataAccessException {
        if (isBlank(key) || isBlank(field)) {
            return null;
        }
        String keyString = keyPrefix.concat(key);
        return redisTemplate.execute(
                (RedisConnection connection) -> {
                    byte[] keyb = keyString.getBytes();
                    byte[] fieldb = field.getBytes();
                    byte[] valueb = connection.hGet(keyb, fieldb);
                    return GsonUtils.toObject(valueb, type);
                });
    }

    /**
     * 批量获取hash， 不存在的key将返回空
     *
     * @param key
     * @param fields
     * @param type
     * @param <T>
     *
     * @return
     */
    @Override
    public <T> Map<String, T> hmget(String key, List<String> fields, Class<T> type) throws DataAccessException {
        if (isBlank(key) || CollectionUtils.isEmpty(fields)) {
            return null;
        }
        String keyString = keyPrefix.concat(key);
        return redisTemplate.execute(
                (RedisConnection connection) -> {
                    byte[] keyb = keyString.getBytes();
                    byte[][] fieldsb = new byte[fields.size()][];
                    int i = 0;
                    for (String f : fields) {
                        fieldsb[i++] = f.getBytes();
                    }
                    // 根据 fields的顺序返回， 如果filed对于的数据不存在， 返回null
                    List<byte[]> valuebs = connection.hMGet(keyb, fieldsb);
                    if (CollectionUtils.isEmpty(valuebs)) {
                        return new HashMap<>(0);
                    }
                    Map<String, T> map = new HashMap<>();
                    for (int j = 0; j < fields.size(); j++) {
                        String kj = fields.get(j);
                        T vj = GsonUtils.toObject(valuebs.get(j), type);
                        map.put(kj, vj);
                    }
                    return map;
                });
    }

    @Override
    public <T> Map<String, T> hgetall(String key, Class<T> type) throws DataAccessException {
        if (isBlank(key)) {
            return null;
        }
        String keyString = keyPrefix.concat(key);
        return redisTemplate.execute(
                (RedisConnection connection) -> {
                    byte[] keyb = keyString.getBytes();
                    Map<byte[], byte[]> valuebs = connection.hGetAll(keyb);
                    if (CollectionUtils.isEmpty(valuebs)) {
                        return new HashMap<>(0);
                    }
                    Map<String, T> map = new HashMap<>();
                    for (Map.Entry<byte[], byte[]> entry : valuebs.entrySet()) {
                        String hk = new String(entry.getKey());
                        T hv = GsonUtils.toObject(entry.getValue(), type);
                        map.put(hk, hv);
                    }
                    return map;
                });
    }

    @Override
    public Boolean hdel(String key, String field) throws DataAccessException {
        if (isBlank(key) || isBlank(field)) {
            return Boolean.FALSE;
        }
        String keyString = keyPrefix.concat(key);
        return redisTemplate.execute(
                (RedisConnection connection) -> {
                    byte[] keyb = keyString.getBytes();
                    byte[] fieldb = field.getBytes();
                    connection.hDel(keyb, fieldb);
                    return Boolean.TRUE;
                });
    }

    @Override
    public Boolean hmdel(String key, List<String> fields) throws DataAccessException {
        if (isBlank(key) || CollectionUtils.isEmpty(fields)) {
            return Boolean.FALSE;
        }
        String keyString = keyPrefix.concat(key);
        return redisTemplate.execute(
                (RedisConnection connection) -> {
                    byte[] keyb = keyString.getBytes();
                    byte[][] fieldsb = new byte[fields.size()][];
                    int i = 0;
                    for (String f : fields) {
                        fieldsb[i++] = f.getBytes();
                    }
                    connection.hDel(keyb, fieldsb);
                    return Boolean.TRUE;
                });
    }

    @Override
    public Long hDelByPrefix(String key, String fieldPrefix) throws DataAccessException {
        if (isBlank(key) || isBlank(fieldPrefix)) {
            return 0L;
        }
        String keyString = keyPrefix.concat(key);
        byte[] cahceKey = keyString.getBytes();
        return redisTemplate.execute(
                (RedisConnection connection) -> {
                    Set<byte[]> keys = connection.hKeys(cahceKey);
                    if (CollectionUtils.isEmpty(keys)) {
                        if (log.isDebugEnabled()) {
                            log.debug("the cache {} is empty " + keyString);
                        }
                        return 0L;
                    }
                    List<byte[]> needDelFieldList = new ArrayList<>();
                    for (byte[] hkey : keys) {
                        String field = new String(hkey);
                        if (field.startsWith(fieldPrefix)) {
                            needDelFieldList.add(hkey);
                        }
                    }

                    final int needDelFieldLen = needDelFieldList.size();
                    byte[][] needDelField = new byte[needDelFieldLen][];
                    int i = 0;
                    for (byte[] dkey : needDelFieldList) {
                        needDelField[i] = dkey;
                        i++;
                    }

                    return connection.hDel(cahceKey, needDelField);
                });
    }

    @Override
    public Boolean exists(String key) throws DataAccessException {
        if (isBlank(key)) {
            return Boolean.FALSE;
        }
        String keyString = keyPrefix.concat(key);
        return redisTemplate.execute(
                (RedisConnection connection) -> {
                    byte[] keyb = keyString.getBytes();
                    return connection.exists(keyb);
                });
    }
}
