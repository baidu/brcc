/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.config;

import static org.mockito.Mockito.mock;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

public class CacheConfigTest {
    CacheConfig cacheConfig = new CacheConfig();

    @Test
    public void testRedisTemplate() throws Exception {
        RedisConnectionFactory connectionFactory = mock(RedisConnectionFactory.class);
        RedisTemplate<String, Object> result = cacheConfig.redisTemplate(connectionFactory);
        Assert.assertEquals(StringRedisSerializer.class, result.getKeySerializer().getClass());
        Assert.assertEquals(StringRedisSerializer.class, result.getValueSerializer().getClass());
        Assert.assertEquals(StringRedisSerializer.class, result.getHashKeySerializer().getClass());
        Assert.assertEquals(StringRedisSerializer.class, result.getHashValueSerializer().getClass());
    }
}
