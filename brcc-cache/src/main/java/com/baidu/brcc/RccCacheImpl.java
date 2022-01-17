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

import static com.baidu.brcc.CacheKeyGenerator.getApiTokenKey;
import static com.baidu.brcc.CacheKeyGenerator.getEnvironmentProjectIdKey;
import static com.baidu.brcc.CacheKeyGenerator.getItemVersionIdKey;
import static com.baidu.brcc.CacheKeyGenerator.getProjectNameKey;
import static com.baidu.brcc.CacheKeyGenerator.getUserNameKey;
import static com.baidu.brcc.CacheKeyGenerator.getUserTokenKey;
import static com.baidu.brcc.CacheKeyGenerator.getVersionEnvironmentIdKey;
import static com.baidu.brcc.CacheKeyGenerator.getVersionIdKey;
import static org.apache.commons.lang3.StringUtils.isBlank;
import static org.springframework.util.CollectionUtils.isEmpty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import com.baidu.brcc.domain.ConfigItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.baidu.brcc.domain.ApiToken;
import com.baidu.brcc.domain.Environment;
import com.baidu.brcc.domain.Project;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.Version;
import com.baidu.brcc.domain.vo.ApiEnvironmentVo;
import com.baidu.brcc.domain.vo.ApiItemVo;
import com.baidu.brcc.domain.vo.ApiVersionVo;
import com.baidu.brcc.retry.RetryActionWithOneParam;
import com.baidu.brcc.retry.RetryActionWithThrParam;
import com.baidu.brcc.retry.RetryActionWithTwoParam;
import com.baidu.brcc.service.RccCache;
import com.baidu.brcc.utils.gson.GsonUtils;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class RccCacheImpl implements RccCache {

    @Value("${rcc.cache.retry.times: 3}")
    private int retryTimes;

    @Autowired
    public Cache cache;

    @Override
    public boolean cacheEnable() {
        return cache.cacheEnable();
    }

    @Override
    public boolean existsEnvironmentHKey(Long projectId) {
        if (!cache.cacheEnable() || projectId == null || projectId <= 0) {
            return false;
        }
        String environmentProjectIdKey = getEnvironmentProjectIdKey(projectId);
        Boolean exists = new RetryActionWithOneParam<String, Boolean>(
                "exists",
                retryTimes,
                environmentProjectIdKey
        ).action(key -> cache.exists(key));
        return exists == null ? false : exists;
    }

    @Override
    public boolean existsVersionHKey(Long environmentId) {
        if (!cache.cacheEnable() || environmentId == null || environmentId <= 0) {
            return false;
        }
        String versionEnvironmentIdKey = getVersionEnvironmentIdKey(environmentId);
        Boolean exists = new RetryActionWithOneParam<String, Boolean>(
                "exists",
                retryTimes,
                versionEnvironmentIdKey
        ).action(key -> cache.exists(key));
        return exists == null ? false : exists;
    }

    @Override
    public boolean existsItemHKey(Long versionId) {
        if (!cache.cacheEnable() || versionId == null || versionId <= 0) {
            return false;
        }
        String itemVersionIdKey = getItemVersionIdKey(versionId);
        Boolean exists = new RetryActionWithOneParam<String, Boolean>(
                "exists",
                retryTimes,
                itemVersionIdKey
        ).action(key -> cache.exists(key));
        return exists == null ? false : exists;
    }

    // 失效工程
    @Override
    public void evictProject(String projectName, List<String> apiTokens) {
        if (!cache.cacheEnable()) {
            return;
        }
        // 删除的key
        List<String> deleteKeys = new ArrayList<>();
        if (!isBlank(projectName)) {
            String projectNameKey = getProjectNameKey(projectName);
            deleteKeys.add(projectNameKey);
        }
        if (!isEmpty(apiTokens)) {
            for (String apiToken : apiTokens) {
                String apiTokenKey = getApiTokenKey(apiToken);
                deleteKeys.add(apiTokenKey);
            }
        }
        if (!isEmpty(deleteKeys)) {
            Long cnt =
                    new RetryActionWithOneParam<List<String>, Long>("evict", retryTimes, deleteKeys)
                            .action((List<String> keys) -> cache.evict(keys)
                            );

            if (log.isDebugEnabled()) {
                log.debug("deleteProject keys[{}] total[{}] success[{}]", deleteKeys.size(), cnt);
            }
        }
    }

    @Override
    public void evictEnvironment(Long projectId) {
        if (!cache.cacheEnable() || projectId == null) {
            return;
        }
        // 删除工程下的环境
        String environmentProjectIdKey = getEnvironmentProjectIdKey(projectId);
        Long cnt = new RetryActionWithOneParam<List<String>, Long>(
                "evict",
                retryTimes,
                Arrays.asList(environmentProjectIdKey)
        ).action(
                keys -> cache.evict(keys)
        );
        if (log.isDebugEnabled()) {
            log.debug("evictEnvironment keys[{}] total[{}] success[{}]", environmentProjectIdKey, 1, cnt);
        }
    }

    @Override
    public void evictVersion(Long environmentId) {
        if (!cache.cacheEnable() || environmentId == null) {
            return;
        }
        // 删除环境下的所有版本
        String versionEnvironmentIdKey = getVersionEnvironmentIdKey(environmentId);
        Long cnt = new RetryActionWithOneParam<List<String>, Long>(
                "evict",
                retryTimes,
                Arrays.asList(versionEnvironmentIdKey)
        ).action(
                keys -> cache.evict(keys)
        );
        if (log.isDebugEnabled()) {
            log.debug("evictVersion keys[{}] total[{}] success[{}]", versionEnvironmentIdKey, 1, cnt);
        }
    }

    @Override
    public void evictConfigItem(List<Long> versionIds) {
        if (!cache.cacheEnable() || CollectionUtils.isEmpty(versionIds)) {
            return;
        }
        // 删除环境下的所有版本
        List<String> itemVersionIdKeys = new ArrayList<>();
        for(Long versionId : versionIds) {
            String itemVersionIdKey = getItemVersionIdKey(versionId);
            itemVersionIdKeys.add(itemVersionIdKey);
        }

        Long cnt = new RetryActionWithOneParam<List<String>, Long>(
                "evict",
                retryTimes,
                itemVersionIdKeys
        ).action(
                keys -> cache.evict(keys)
        );
        if (log.isDebugEnabled()) {
            log.debug("evictConfigItem keys[{}] total[{}] success[{}]", GsonUtils.toJsonString(itemVersionIdKeys), itemVersionIdKeys.size(), cnt);
        }
    }

    @Override
    public void evictVersionById(List<Long> versionIds) {
        if (!cache.cacheEnable() || CollectionUtils.isEmpty(versionIds)) {
            return;
        }
        List<String> deleteKeys = new ArrayList<>();
        for (Long versionId : versionIds) {
            String versionIdKey = getVersionIdKey(versionId);
            deleteKeys.add(versionIdKey);
        }

        Long cnt = new RetryActionWithOneParam<List<String>, Long>(
                "evict",
                retryTimes,
                deleteKeys
        ).action(
                keys -> cache.evict(keys)
        );
        if (log.isDebugEnabled()) {
            log.debug("evictVersionById keys[{}] total[{}] success[{}]", GsonUtils.toJsonString(deleteKeys),
                    deleteKeys.size(), cnt);
        }
    }

    // 级联删除工程
    @Override
    public void deleteProjectCascade(Project project, List<Long> environmentIds, List<Long> versionIds,
                                     List<String> apiTokens) {
        if (!cache.cacheEnable() || project == null) {
            return;
        }

        // 删除的key
        List<String> deleteKeys = new ArrayList<>();

        // 删除工程
        String projectNameKey = getProjectNameKey(project.getName());
        deleteKeys.add(projectNameKey);
        // 删除API TOKEN
        if (!isEmpty(apiTokens)) {
            for (String apiToken : apiTokens) {
                String apiTokenKey = getApiTokenKey(apiToken);
                deleteKeys.add(apiTokenKey);
            }
        }
        // 删除环境
        String environmentProjectIdKey = getEnvironmentProjectIdKey(project.getId());
        deleteKeys.add(environmentProjectIdKey);
        // 删除版本
        if (!isEmpty(environmentIds)) {
            for (Long environmentId : environmentIds) {
                String versionEnvironmentIdKey = getVersionEnvironmentIdKey(environmentId);
                deleteKeys.add(versionEnvironmentIdKey);
            }
        }
        // 删除配置项
        if (!isEmpty(versionIds)) {
            for (Long versionId : versionIds) {
                String itemVersionIdKey = getItemVersionIdKey(versionId);
                deleteKeys.add(itemVersionIdKey);
            }
        }

        Long cnt = new RetryActionWithOneParam<List<String>, Long>("evict", retryTimes, deleteKeys).action(
                (List<String> keys) -> cache.evict(keys)
        );

        // 失效versionId->version的缓存
        evictVersionById(versionIds);

        if (log.isDebugEnabled()) {
            log.debug("deleteProjectCascade keys[{}] total[{}] success[{}]", deleteKeys.size(), cnt);
        }
    }

    // 级联删除环境
    @Override
    public void deleteEnvironmentCascade(Environment environment, List<Long> versionIds) {
        if (!cache.cacheEnable() || environment == null) {
            return;
        }
        Long projectId = environment.getProjectId();
        Long environmentId = environment.getId();
        String name = environment.getName();

        // 删除工程下的环境
        String environmentProjectIdKey = getEnvironmentProjectIdKey(projectId);
        new RetryActionWithTwoParam<String, String, Boolean>(
                "hdel",
                retryTimes,
                environmentProjectIdKey,
                name
        ).action((String hkey, String field) -> cache.hdel(hkey, field));
        if (log.isDebugEnabled()) {
            log.debug("deleteEnvironmentCascade key[{}]", environmentProjectIdKey);
        }
        // 删除的key
        List<String> deleteKeys = new ArrayList<>();

        // 删除版本
        String versionEnvironmentIdKey = getVersionEnvironmentIdKey(environmentId);
        deleteKeys.add(versionEnvironmentIdKey);
        // 删除配置项
        if (!isEmpty(versionIds)) {
            for (Long versionId : versionIds) {
                String itemVersionIdKey = getItemVersionIdKey(versionId);
                deleteKeys.add(itemVersionIdKey);
            }
        }

        Long cnt = new RetryActionWithOneParam<List<String>, Long>("evict", retryTimes, deleteKeys).action(
                (List<String> keys) -> cache.evict(keys)
        );

        // 失效versionId->version的缓存
        evictVersionById(versionIds);

        if (log.isDebugEnabled()) {
            log.debug("deleteEnvironmentCascade keys[{}] total[{}] success[{}]", deleteKeys.size(), cnt);
        }
    }

    // 级联删除版本
    @Override
    public void deleteVersionCascade(Version version) {
        if (!cache.cacheEnable() || version == null) {
            return;
        }
        Long environmentId = version.getEnvironmentId();
        Long versionId = version.getId();
        String name = version.getName();

        // 删除环境下的版本
        String versionEnvironmentIdKey = getVersionEnvironmentIdKey(environmentId);
        new RetryActionWithTwoParam<String, String, Boolean>(
                "hdel",
                retryTimes,
                versionEnvironmentIdKey,
                name
        ).action((String hkey, String field) -> cache.hdel(hkey, field));
        if (log.isDebugEnabled()) {
            log.debug("deleteVersionCascade key[{}]", versionEnvironmentIdKey);
        }
        // 删除的key
        List<String> deleteKeys = new ArrayList<>();

        // 删除配置项
        String itemVersionIdKey = getItemVersionIdKey(versionId);
        deleteKeys.add(itemVersionIdKey);

        Long cnt = new RetryActionWithOneParam<List<String>, Long>("evict", retryTimes, deleteKeys).action(
                (List<String> keys) -> cache.evict(keys)
        );
        if (log.isDebugEnabled()) {
            log.debug("deleteVersionCascade keys[{}] total[{}] success[{}]", deleteKeys.size(), cnt);
        }
    }

    // 删除配置
    @Override
    public void deleteItems(Long versionId, List<String> itemNames) {
        if (!cache.cacheEnable() || versionId == null || versionId < 0 || isEmpty(itemNames)) {
            return;
        }

        String itemVersionIdKey = getItemVersionIdKey(versionId);

        new RetryActionWithTwoParam<String, List<String>, Boolean>(
                "hmdel",
                retryTimes,
                itemVersionIdKey,
                itemNames
        ).action((String hkey, List<String> fields) -> cache.hmdel(hkey, fields));
        if (log.isDebugEnabled()) {
            log.debug("deleteItems hkey[{}], fields[{}]", itemVersionIdKey, GsonUtils.toJsonString(itemNames));
        }
    }

    // 删除用户
    @Override
    public void evictUser(User user) {
        if (!cache.cacheEnable() || user == null) {
            return;
        }
        String name = user.getName();
        String token = user.getToken();
        String userNameKey = getUserNameKey(name);
        String userTokenKey = getUserTokenKey(token);
        cache.evict(userNameKey, userTokenKey);
    }

    // 查询工程
    @Override
    public Project getProject(String name) {
        if (!cache.cacheEnable() || isBlank(name)) {
            return null;
        }
        String projectNameKey = getProjectNameKey(name);

        RetryActionWithTwoParam<String, Class<Project>, Project> action = new RetryActionWithTwoParam<>(
                "get",
                retryTimes,
                projectNameKey,
                Project.class
        );
        return action.action((String key, Class<Project> type) -> cache.get(key, type));
    }

    // 查询api token
    @Override
    public ApiToken getApiToken(String token) {
        if (!cache.cacheEnable() || isBlank(token)) {
            return null;
        }
        String apiTokenKey = getApiTokenKey(token);

        RetryActionWithTwoParam<String, Class<ApiToken>, ApiToken> action = new RetryActionWithTwoParam<>(
                "get",
                retryTimes,
                apiTokenKey,
                ApiToken.class
        );
        return action.action((String key, Class<ApiToken> type) -> cache.get(key, type));
    }

    // 查询用户
    @Override
    public User getUserByToken(String token) {
        if (!cache.cacheEnable() || isBlank(token)) {
            return null;
        }
        String userTokenKey = getUserTokenKey(token);

        RetryActionWithTwoParam<String, Class<User>, User> action = new RetryActionWithTwoParam<>(
                "get",
                retryTimes,
                userTokenKey,
                User.class
        );
        return action.action((String key, Class<User> type) -> cache.get(key, type));
    }

    @Override
    public User getUserByName(String name) {
        if (!cache.cacheEnable() || isBlank(name)) {
            return null;
        }
        String usernameKey = getUserNameKey(name);

        RetryActionWithTwoParam<String, Class<User>, User> action = new RetryActionWithTwoParam<>(
                "get",
                retryTimes,
                usernameKey,
                User.class
        );
        return action.action((String key, Class<User> type) -> cache.get(key, type));
    }

    // 查询环境
    @Override
    public List<ApiEnvironmentVo> getEnvironments(Long projectId) {
        if (!cache.cacheEnable() || projectId == null || projectId <= 0) {
            return null;
        }
        String environmentProjectIdKey = getEnvironmentProjectIdKey(projectId);

        RetryActionWithTwoParam<String, Class<ApiEnvironmentVo>, Map<String, ApiEnvironmentVo>> action =
                new RetryActionWithTwoParam<>(
                        "hgetall",
                        retryTimes,
                        environmentProjectIdKey,
                        ApiEnvironmentVo.class
                );
        Map<String, ApiEnvironmentVo> map =
                action.action((String key, Class<ApiEnvironmentVo> type) -> cache.hgetall(key, type));
        if (isEmpty(map)) {
            return null;
        }
        return map.values().stream().filter(Objects :: nonNull).collect(Collectors.toList());
    }

    @Override
    public ApiEnvironmentVo getEnvironment(Long projectId, String name) {
        if (!cache.cacheEnable() || projectId == null || projectId <= 0) {
            return null;
        }
        String environmentProjectIdKey = getEnvironmentProjectIdKey(projectId);

        RetryActionWithThrParam<String, String, Class<ApiEnvironmentVo>, ApiEnvironmentVo> action =
                new RetryActionWithThrParam<>(
                        "hget",
                        retryTimes,
                        environmentProjectIdKey,
                        name,
                        ApiEnvironmentVo.class
                );
        return action
                .action((String hkey, String field, Class<ApiEnvironmentVo> type) -> cache.hget(hkey, field, type));
    }

    // 读版本
    @Override
    public List<ApiVersionVo> getVersions(Long environmentId) {
        if (!cache.cacheEnable() || environmentId == null || environmentId <= 0) {
            return null;
        }
        String versionEnvironmentIdKey = getVersionEnvironmentIdKey(environmentId);

        RetryActionWithTwoParam<String, Class<ApiVersionVo>, Map<String, ApiVersionVo>> action =
                new RetryActionWithTwoParam<>(
                        "hgetall",
                        retryTimes,
                        versionEnvironmentIdKey,
                        ApiVersionVo.class
                );
        Map<String, ApiVersionVo> map =
                action.action((String key, Class<ApiVersionVo> type) -> cache.hgetall(key, type));
        if (isEmpty(map)) {
            return null;
        }
        return map.values().stream().filter(Objects :: nonNull).collect(Collectors.toList());
    }

    @Override
    public ApiVersionVo getVersion(Long environmentId, String name) {
        if (!cache.cacheEnable() || environmentId == null || environmentId <= 0) {
            return null;
        }
        String versionEnvironmentIdKey = getVersionEnvironmentIdKey(environmentId);

        RetryActionWithThrParam<String, String, Class<ApiVersionVo>, ApiVersionVo> action =
                new RetryActionWithThrParam<>(
                        "hget",
                        retryTimes,
                        versionEnvironmentIdKey,
                        name,
                        ApiVersionVo.class
                );
        return action.action((String hkey, String field, Class<ApiVersionVo> type) -> cache.hget(hkey, field, type));
    }

    @Override
    public ApiVersionVo getVersionById(Long versionId) {
        if (!cache.cacheEnable() || versionId == null || versionId <= 0) {
            return null;
        }
        String versionIdKey = getVersionIdKey(versionId);
        return new RetryActionWithTwoParam<String, Class<ApiVersionVo>, ApiVersionVo>(
                "get",
                retryTimes,
                versionIdKey,
                ApiVersionVo.class
        ).action((key, type) -> cache.get(key, type));
    }

    // 读取配置项
    @Override
    public List<ApiItemVo> getItems(Long versionId) {
        if (!cache.cacheEnable() || versionId == null || versionId <= 0) {
            return null;
        }
        String itemVersionIdKey = getItemVersionIdKey(versionId);

        RetryActionWithTwoParam<String, Class<ApiItemVo>, Map<String, ApiItemVo>> action =
                new RetryActionWithTwoParam<>(
                        "hgetall",
                        retryTimes,
                        itemVersionIdKey,
                        ApiItemVo.class
                );
        Map<String, ApiItemVo> map =
                action.action((String key, Class<ApiItemVo> type) -> cache.hgetall(key, type));
        if (isEmpty(map)) {
            return null;
        }
        return map.values().stream().filter(Objects :: nonNull).collect(Collectors.toList());
    }

    @Override
    public Map<String,ConfigItem> getItemMap(Long versionId) {
        Map<String, ConfigItem> map = new HashMap<>();
        if (!cache.cacheEnable() || versionId == null || versionId <= 0) {
            return map;
        }
        String itemVersionIdKey = getItemVersionIdKey(versionId);
        RetryActionWithTwoParam<String, Class<ConfigItem>, Map<String, ConfigItem>> action =
                new RetryActionWithTwoParam<>(
                        "hgetall",
                        retryTimes,
                        itemVersionIdKey,
                        ConfigItem.class
                );
        map = action.action((String key, Class<ConfigItem> type) -> cache.hgetall(key, type));
        return map;
    }

    @Override
    public List<ApiItemVo> getItems(Long versionId, List<String> names) {
        if (!cache.cacheEnable() || versionId == null || versionId <= 0 || isEmpty(names)) {
            return null;
        }
        String itemVersionIdKey = getItemVersionIdKey(versionId);

        RetryActionWithThrParam<String, List<String>, Class<ApiItemVo>, Map<String, ApiItemVo>> action =
                new RetryActionWithThrParam<>(
                        "hmget",
                        retryTimes,
                        itemVersionIdKey,
                        names,
                        ApiItemVo.class
                );
        Map<String, ApiItemVo> map = action.action(
                (String hkey, List<String> fields, Class<ApiItemVo> type) -> cache.hmget(hkey, fields, type));
        if (isEmpty(map)) {
            return null;
        }
        return map.values().stream().filter(Objects :: nonNull).collect(Collectors.toList());
    }

    @Override
    public ApiItemVo getItem(Long versionId, String name) {
        if (!cache.cacheEnable() || versionId == null || versionId <= 0) {
            return null;
        }
        String itemVersionIdKey = getItemVersionIdKey(versionId);

        RetryActionWithThrParam<String, String, Class<ApiItemVo>, ApiItemVo> action =
                new RetryActionWithThrParam<>(
                        "hget",
                        retryTimes,
                        itemVersionIdKey,
                        name,
                        ApiItemVo.class
                );
        return action.action((String hkey, String field, Class<ApiItemVo> type) -> cache.hget(hkey, field, type));
    }

    // 加载工程
    @Override
    public void loadProject(Project project) {
        if (!cache.cacheEnable() || project == null) {
            return;
        }

        String name = project.getName();
        String projectNameKey = getProjectNameKey(name);

        RetryActionWithTwoParam<String, Object, Boolean> action =
                new RetryActionWithTwoParam<>(
                        "put",
                        retryTimes,
                        projectNameKey,
                        project
                );

        action.action((String key, Object value) -> cache.put(key, value));
    }

    // 加载用户
    @Override
    public void loadUser(User user) {
        if (!cache.cacheEnable() || user == null) {
            return;
        }
        String name = user.getName();
        String token = user.getToken();

        String userNameKey = getUserNameKey(name);
        String userTokenKey = getUserTokenKey(token);

        RetryActionWithTwoParam<String, Object, Boolean> action =
                new RetryActionWithTwoParam<>(
                        "put",
                        retryTimes,
                        userNameKey,
                        user
                );
        action.action((String key, Object value) -> cache.put(key, value));

        action = new RetryActionWithTwoParam<>(
                "put",
                retryTimes,
                userTokenKey,
                user
        );
        action.action((String key, Object value) -> cache.put(key, value));

    }

    // 加载Api token
    @Override
    public void loadApiToken(ApiToken apiToken) {
        if (!cache.cacheEnable() || apiToken == null) {
            return;
        }
        String token = apiToken.getToken();
        String apiTokenKey = getApiTokenKey(token);
        RetryActionWithTwoParam<String, Object, Boolean> action =
                new RetryActionWithTwoParam<>(
                        "put",
                        retryTimes,
                        apiTokenKey,
                        apiToken
                );
        action.action((String key, Object value) -> cache.put(key, value));
    }

    // 加载环境
    @Override
    public void loadEnvironment(ApiEnvironmentVo vo) {
        if (!cache.cacheEnable() || vo == null) {
            return;
        }
        Long projectId = vo.getProjectId();
        String environmentName = vo.getEnvironmentName();
        String environmentProjectIdKey = getEnvironmentProjectIdKey(projectId);
        new RetryActionWithThrParam<String, String, Object, Boolean>(
                "hset",
                retryTimes,
                environmentProjectIdKey,
                environmentName,
                vo
        ).action(
                (String key, String field, Object value) -> cache.hset(key, field, value)
        );
    }

    // 加载环境
    @Override
    public void loadEnvironments(Long projectId, List<ApiEnvironmentVo> environmentVos) {
        if (!cache.cacheEnable() || projectId == null || projectId <= 0) {
            return;
        }
        String environmentProjectIdKey = getEnvironmentProjectIdKey(projectId);

        // 先删除
        new RetryActionWithOneParam<List<String>, Long>("delete key", retryTimes,
                Arrays.asList(environmentProjectIdKey)).action(
                (List<String> keys) -> cache.evict(keys)
        );

        // put
        if (isEmpty(environmentVos)) {
            return;
        }
        Map<String, ApiEnvironmentVo> map = new HashMap<>();
        for (ApiEnvironmentVo environmentVo : environmentVos) {
            map.put(environmentVo.getEnvironmentName(), environmentVo);
        }

        new RetryActionWithTwoParam<String, Map, Boolean>(
                "hmset",
                retryTimes,
                environmentProjectIdKey,
                map
        ).action(
                (String key, Map kvs) -> cache.hmset(key, kvs)
        );
    }

    // 加载版本
    @Override
    public void loadVersion(ApiVersionVo vo) {
        if (!cache.cacheEnable() || vo == null) {
            return;
        }
        Long environmentId = vo.getEnvironmentId();
        String versionName = vo.getVersionName();
        String versionEnvironmentIdKey = getVersionEnvironmentIdKey(environmentId);
        new RetryActionWithThrParam<String, String, Object, Boolean>(
                "hset",
                retryTimes,
                versionEnvironmentIdKey,
                versionName,
                vo
        ).action(
                (String key, String field, Object value) -> cache.hset(key, field, value)
        );
    }

    @Override
    public void loadVersionForId(ApiVersionVo apiVersionVo) {
        if (!cache.cacheEnable() || apiVersionVo == null) {
            return;
        }
        Long versionId = apiVersionVo.getVersionId();
        String versionIdKey = getVersionIdKey(versionId);
        new RetryActionWithTwoParam<String, Object, Boolean>(
                "put",
                retryTimes,
                versionIdKey,
                apiVersionVo
        ).action((key, val) -> cache.put(key, val));
    }

    // 加载版本
    @Override
    public void loadVersions(Long environmentId, List<ApiVersionVo> versionVos) {
        if (!cache.cacheEnable() || environmentId == null || environmentId <= 0) {
            return;
        }
        String versionEnvironmentIdKey = getVersionEnvironmentIdKey(environmentId);

        // 先删除
        new RetryActionWithOneParam<List<String>, Long>("delete key", retryTimes,
                Arrays.asList(versionEnvironmentIdKey)).action(
                (List<String> keys) -> cache.evict(keys)
        );

        // put
        if (isEmpty(versionVos)) {
            return;
        }
        Map<String, ApiVersionVo> map = new HashMap<>();
        for (ApiVersionVo versionVo : versionVos) {
            map.put(versionVo.getVersionName(), versionVo);
        }

        new RetryActionWithTwoParam<String, Map, Boolean>(
                "hmset",
                retryTimes,
                versionEnvironmentIdKey,
                map
        ).action(
                (String key, Map kvs) -> cache.hmset(key, kvs)
        );
    }

    @Override
    public void loadItem(Long versionId, ApiItemVo vo) {
        if (!cache.cacheEnable() || versionId == null || versionId <= 0 || vo == null) {
            return;
        }
        String itemName = vo.getKey();
        String itemVersionIdKey = getItemVersionIdKey(versionId);
        new RetryActionWithThrParam<String, String, Object, Boolean>(
                "hset",
                retryTimes,
                itemVersionIdKey,
                itemName,
                vo
        ).action(
                (String key, String field, Object value) -> cache.hset(key, field, value)
        );
    }

    // 加载配置
    @Override
    public void loadItems(Long versionId, List<ApiItemVo> itemVos, boolean clear) {
        if (!cache.cacheEnable() || versionId == null || versionId <= 0) {
            return;
        }
        String itemVersionIdKey = getItemVersionIdKey(versionId);

        if (clear) {
            // 删除
            new RetryActionWithOneParam<List<String>, Long>(
                    "evict",
                    retryTimes,
                    Arrays.asList(itemVersionIdKey)
            ).action(
                    (List<String> keys) -> cache.evict(keys)
            );
        }

        // put
        if (isEmpty(itemVos)) {
            return;
        }
        Map<String, ApiItemVo> map = new HashMap<>();
        for (ApiItemVo itemVo : itemVos) {
            map.put(itemVo.getKey(), itemVo);
        }

        new RetryActionWithTwoParam<String, Map, Boolean>(
                "hmset",
                retryTimes,
                itemVersionIdKey,
                map
        ).action(
                (String key, Map kvs) -> cache.hmset(key, kvs)
        );
    }

    @Override
    public void loadItemMap(Long versionId, Map<String, ConfigItem> itemMap, boolean clear) {
        if (!cache.cacheEnable() || versionId == null || versionId <= 0) {
            return;
        }
        String itemVersionIdKey = getItemVersionIdKey(versionId);

        if (clear) {
            // 删除
            new RetryActionWithOneParam<List<String>, Long>(
                    "evict",
                    retryTimes,
                    Arrays.asList(itemVersionIdKey)
            ).action(
                    (List<String> keys) -> cache.evict(keys)
            );
        }
        // put
        if (isEmpty(itemMap)) {
            return;
        }
        new RetryActionWithTwoParam<String, Map, Boolean>(
                "hmset",
                retryTimes,
                itemVersionIdKey,
                itemMap
        ).action(
                (String key, Map kvs) -> cache.hmset(key, kvs)
        );
    }
}
