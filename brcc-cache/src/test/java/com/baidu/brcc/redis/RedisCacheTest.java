/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.redis;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.slf4j.Logger;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;

import com.baidu.brcc.RccReflectionUtils;

public class RedisCacheTest {
    @Mock
    RedisTemplate<String, Object> redisTemplate;
    @Mock
    Logger log;
    @InjectMocks
    RedisCache redisCache;

    private String a = "a";

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        RccReflectionUtils.setFieldValue(redisCache, "keyPrefix", "mapp.newrcc.");
        RccReflectionUtils.setFieldValue(redisCache, "cacheEnable", true);
        RccReflectionUtils.setFieldValue(redisCache, "expireTime", 7200L);
    }

    @Test
    public void testCacheEnable() throws Exception {
        boolean result = redisCache.cacheEnable();
        Assert.assertEquals(true, result);
    }

    @Test
    public void testEvict() throws Exception {
        when(redisTemplate.execute(any(RedisCallback.class))).thenAnswer(
                invocation -> 1L
        );
        Long result = redisCache.evict(Arrays.asList("key"));
        Assert.assertEquals(Long.valueOf(1), result);
    }

    @Test
    public void testEvict2() throws Exception {
        String[] keys = {"key"};
        when(redisTemplate.execute(any(RedisCallback.class))).thenAnswer(
                invocation -> 1L
        );
        Long result = redisCache.evict(keys);
        Assert.assertEquals(Long.valueOf(1), result);
    }

    @Test
    public void testGetByList() throws Exception {
        when(redisTemplate.execute(any(RedisCallback.class))).thenAnswer(
                (InvocationOnMock invocation) -> {
                    // Object[] args = invocation.getArguments();
                    return Arrays.asList(a);
                }
        );
        List<String> result = redisCache.getByList(Arrays.asList("key1"), String.class);
        Assert.assertEquals(a, result.get(0));
    }

    @Test
    public void testGet() throws Exception {
        when(redisTemplate.execute(any(RedisCallback.class))).thenAnswer(
                invocation -> a
        );
        String result = redisCache.get("key", String.class);
        Assert.assertEquals(a, result);
    }

    @Test
    public void testGetExpire() throws Exception {
        when(redisTemplate.execute(any(RedisCallback.class))).thenAnswer(
                invocation -> 1L
        );
        Long result = redisCache.getExpire("key", TimeUnit.NANOSECONDS);
        Assert.assertEquals(Long.valueOf(1), result);
    }

    @Test
    public void testPut() throws Exception {
        when(redisTemplate.execute(any(RedisCallback.class))).thenAnswer(
                invocation -> Boolean.TRUE
        );
        Boolean result = redisCache.put("key", "value");
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testPut2() throws Exception {
        when(redisTemplate.execute(any(RedisCallback.class))).thenAnswer(
                invocation -> Boolean.TRUE
        );
        Boolean result = redisCache.put("key", "value", Long.valueOf(1));
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testHset() throws Exception {
        when(redisTemplate.execute(any(RedisCallback.class))).thenAnswer(
                invocation -> Boolean.TRUE
        );
        Boolean result = redisCache.hset("key", "field", "value");
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testHmset() throws Exception {
        when(redisTemplate.execute(any(RedisCallback.class))).thenAnswer(
                invocation -> Boolean.TRUE
        );
        Boolean result = redisCache.hmset("key", new HashMap<String, Object>() {{
            put("String", "kvs");
        }});
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testHget() throws Exception {
        when(redisTemplate.execute(any(RedisCallback.class))).thenAnswer(
                invocation -> a
        );
        String result = redisCache.hget("key", "field", String.class);
        Assert.assertEquals(a, result);
    }

    @Test
    public void testHmget() throws Exception {
        when(redisTemplate.execute(any(RedisCallback.class))).thenAnswer(
                invocation -> {
                    Map<String, String> map = new HashMap<>();
                    map.put("key", a);
                    return map;
                }
        );
        Map<String, String> result = redisCache.hmget("key", Arrays.asList("String"), String.class);
        Assert.assertEquals(a, result.get("key"));
    }

    @Test
    public void testHgetall() throws Exception {
        when(redisTemplate.execute(any(RedisCallback.class))).thenAnswer(
                invocation -> {
                    Map<String, String> map = new HashMap<>();
                    map.put("key", a);
                    return map;
                }
        );
        Map<String, String> result = redisCache.hgetall("key", String.class);
        Assert.assertEquals(a, result.get("key"));
    }

    @Test
    public void testHdel() throws Exception {
        when(redisTemplate.execute(any(RedisCallback.class))).thenAnswer(
                invocation -> Boolean.TRUE
        );
        Boolean result = redisCache.hdel("key", "field");
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testHmdel() throws Exception {
        when(redisTemplate.execute(any(RedisCallback.class))).thenAnswer(
                invocation -> Boolean.TRUE
        );
        Boolean result = redisCache.hmdel("key", Arrays.asList("String"));
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testHDelByPrefix() throws Exception {
        when(redisTemplate.execute(any(RedisCallback.class))).thenAnswer(
                invocation -> 1L
        );
        Long result = redisCache.hDelByPrefix("key", "fieldPrefix");
        Assert.assertEquals(Long.valueOf(1), result);
    }

    @Test
    public void testExists() throws Exception {
        when(redisTemplate.execute(any(RedisCallback.class))).thenAnswer(
                invocation -> Boolean.TRUE
        );
        Boolean result = redisCache.exists("key");
        Assert.assertEquals(Boolean.TRUE, result);
    }
}
