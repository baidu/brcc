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
