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

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;

import com.baidu.brcc.domain.ApiToken;
import com.baidu.brcc.domain.Environment;
import com.baidu.brcc.domain.Project;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.Version;
import com.baidu.brcc.domain.vo.ApiEnvironmentVo;
import com.baidu.brcc.domain.vo.ApiItemVo;
import com.baidu.brcc.domain.vo.ApiVersionVo;

public class RccCacheImplTest {
    @Mock
    Cache cache;
    @Mock
    Logger log;
    @InjectMocks
    RccCacheImpl rccCacheImpl;

    ApiEnvironmentVo envVo = null;

    ApiToken apiToken = null;

    User user = null;

    ApiVersionVo apiVersionVo = null;

    Version version = null;

    Project project = null;

    ApiItemVo apiItemVo = null;

    Environment environment = null;

    ApiEnvironmentVo apiEnvironmentVo = null;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        RccReflectionUtils.setFieldValue(cache, "keyPrefix", "mapp.newrcc.");
        RccReflectionUtils.setFieldValue(cache, "cacheEnable", true);
        RccReflectionUtils.setFieldValue(cache, "expireTime", 7200L);

        RccReflectionUtils.setFieldValue(rccCacheImpl, "retryTimes", 0);
        envVo = new ApiEnvironmentVo();
        envVo.setEnvironmentId(1L);
        envVo.setProjectId(1L);
        envVo.setEnvironmentName("dev");

        apiToken = new ApiToken();
        apiToken.setToken("token");
        apiToken.setId(1L);
        apiToken.setProjectId(1L);
        apiToken.setProjectName("example");

        user = new User();
        user.setId(1L);
        user.setToken("token");
        user.setName("user");

        apiVersionVo = new ApiVersionVo();
        apiVersionVo.setVersionId(1L);
        apiVersionVo.setProjectId(1L);
        apiVersionVo.setVersionName("version");
        apiVersionVo.setEnvironmentId(1L);
        apiVersionVo.setCheckSum("checkSum");

        version = new Version();
        version.setCheckSum("checkSum");
        version.setId(1L);
        version.setEnvironmentId(1L);

        project = new Project();
        project.setApiToken("apiToken");
        project.setId(1L);
        project.setProductId(1L);
        project.setName("name");

        apiItemVo = new ApiItemVo();
        apiItemVo.setKey("key");
        apiItemVo.setValue("value");

        environment = new Environment();
        environment.setId(1L);
        environment.setName("env");
        environment.setProductId(1L);
        environment.setProjectId(1L);

        apiEnvironmentVo = new ApiEnvironmentVo();
        apiEnvironmentVo.setEnvironmentName("env");
        apiEnvironmentVo.setEnvironmentId(1L);
        apiEnvironmentVo.setProjectId(1L);
    }

    @Test
    public void testCacheEnable() throws Exception {
        when(cache.cacheEnable()).thenReturn(true);

        boolean result = rccCacheImpl.cacheEnable();
        Assert.assertEquals(true, result);
    }

    @Test
    public void testExistsEnvironmentHKey() throws Exception {
        when(cache.cacheEnable()).thenReturn(true);
        when(cache.exists(anyString())).thenReturn(Boolean.TRUE);

        boolean result = rccCacheImpl.existsEnvironmentHKey(Long.valueOf(1));
        Assert.assertEquals(true, result);
    }

    @Test
    public void testExistsVersionHKey() throws Exception {
        when(cache.cacheEnable()).thenReturn(true);
        when(cache.exists(anyString())).thenReturn(Boolean.TRUE);

        boolean result = rccCacheImpl.existsVersionHKey(Long.valueOf(1));
        Assert.assertEquals(true, result);
    }

    @Test
    public void testExistsItemHKey() throws Exception {
        when(cache.cacheEnable()).thenReturn(true);
        when(cache.exists(anyString())).thenReturn(Boolean.TRUE);

        boolean result = rccCacheImpl.existsItemHKey(Long.valueOf(1));
        Assert.assertEquals(true, result);
    }

    @Test
    public void testEvictProject() throws Exception {
        when(cache.cacheEnable()).thenReturn(true);
        when(cache.evict(anyString())).thenReturn(Long.valueOf(1));

        rccCacheImpl.evictProject("projectName", Arrays.<String>asList("String"));
    }

    @Test
    public void testEvictEnvironment() throws Exception {
        when(cache.cacheEnable()).thenReturn(true);
        when(cache.evict(anyString())).thenReturn(Long.valueOf(1));

        rccCacheImpl.evictEnvironment(Long.valueOf(1));
    }

    @Test
    public void testEvictVersion() throws Exception {
        when(cache.cacheEnable()).thenReturn(true);
        when(cache.evict(anyString())).thenReturn(Long.valueOf(1));

        rccCacheImpl.evictVersion(Long.valueOf(1));
    }

    @Test
    public void testEvictConfigItem() throws Exception {
        when(cache.cacheEnable()).thenReturn(true);
        when(cache.evict(anyString())).thenReturn(Long.valueOf(1));

        rccCacheImpl.evictConfigItem(Arrays.<Long>asList(Long.valueOf(1)));
    }

    @Test
    public void testEvictVersionById() throws Exception {
        when(cache.cacheEnable()).thenReturn(true);
        when(cache.evict(anyString())).thenReturn(Long.valueOf(1));

        rccCacheImpl.evictVersionById(Arrays.<Long>asList(Long.valueOf(1)));
    }

    @Test
    public void testDeleteProjectCascade() throws Exception {
        when(cache.cacheEnable()).thenReturn(true);
        when(cache.evict(anyString())).thenReturn(Long.valueOf(1));

        rccCacheImpl.deleteProjectCascade(project, Arrays.asList(Long.valueOf(1)),
                Arrays.asList(Long.valueOf(1)), Arrays.asList("String"));
    }

    @Test
    public void testDeleteEnvironmentCascade() throws Exception {
        when(cache.cacheEnable()).thenReturn(true);
        when(cache.evict(anyString())).thenReturn(Long.valueOf(1));
        when(cache.hdel(anyString(), anyString())).thenReturn(Boolean.TRUE);

        rccCacheImpl.deleteEnvironmentCascade(environment, Arrays.asList(Long.valueOf(1)));
    }

    @Test
    public void testDeleteVersionCascade() throws Exception {
        when(cache.cacheEnable()).thenReturn(true);
        when(cache.evict(anyString())).thenReturn(Long.valueOf(1));
        when(cache.hdel(anyString(), anyString())).thenReturn(Boolean.TRUE);

        rccCacheImpl.deleteVersionCascade(version);
    }

    @Test
    public void testDeleteItems() throws Exception {
        when(cache.cacheEnable()).thenReturn(true);
        when(cache.hmdel(anyString(), any())).thenReturn(Boolean.TRUE);

        rccCacheImpl.deleteItems(Long.valueOf(1), Arrays.<String>asList("String"));
    }

    @Test
    public void testEvictUser() throws Exception {
        when(cache.cacheEnable()).thenReturn(true);

        when(cache.evict(anyString(), anyString())).thenReturn(Long.valueOf(1));

        rccCacheImpl.evictUser(user);
    }

    @Test
    public void testGetProject() throws Exception {
        when(cache.cacheEnable()).thenReturn(true);
        when(cache.get(anyString(), any())).thenReturn(project);

        Project result = rccCacheImpl.getProject("name");
        Assert.assertEquals(project, result);
    }

    @Test
    public void testGetApiToken() throws Exception {
        when(cache.cacheEnable()).thenReturn(true);
        when(cache.get(anyString(), any())).thenReturn(apiToken);

        ApiToken result = rccCacheImpl.getApiToken("token");
        Assert.assertEquals(apiToken, result);
    }

    @Test
    public void testGetUserByToken() throws Exception {
        when(cache.cacheEnable()).thenReturn(true);
        when(cache.get(anyString(), any())).thenReturn(user);

        User result = rccCacheImpl.getUserByToken("token");
        Assert.assertEquals(user, result);
    }

    @Test
    public void testGetUserByName() throws Exception {
        when(cache.cacheEnable()).thenReturn(true);
        when(cache.get(anyString(), any())).thenReturn(user);

        User result = rccCacheImpl.getUserByName("name");
        Assert.assertEquals(user, result);
    }

    @Test
    public void testGetEnvironments() throws Exception {
        when(cache.cacheEnable()).thenReturn(true);
        Map<String, ApiEnvironmentVo> map = new HashMap<>();
        map.put("key", apiEnvironmentVo);
        when(cache.<ApiEnvironmentVo>hgetall(anyString(), any())).thenReturn(map);
        List<ApiEnvironmentVo> result = rccCacheImpl.getEnvironments(Long.valueOf(1));
        Assert.assertEquals(apiEnvironmentVo, result.get(0));
    }

    @Test
    public void testGetEnvironment() throws Exception {
        when(cache.cacheEnable()).thenReturn(true);
        when(cache.hget(anyString(), anyString(), any()))
                .thenReturn(envVo);

        ApiEnvironmentVo result = rccCacheImpl.getEnvironment(Long.valueOf(1), "name");

        Assert.assertEquals(envVo, result);
    }

    @Test
    public void testGetVersions() throws Exception {
        when(cache.cacheEnable()).thenReturn(true);
        Map<String, ApiVersionVo> map = new HashMap<>();
        map.put("key", apiVersionVo);
        when(cache.<ApiVersionVo>hgetall(anyString(), any())).thenReturn(map);
        List<ApiVersionVo> result = rccCacheImpl.getVersions(Long.valueOf(1));
        Assert.assertEquals(apiVersionVo, result.get(0));
    }

    @Test
    public void testGetVersion() throws Exception {
        when(cache.cacheEnable()).thenReturn(true);
        when(cache.hget(anyString(), anyString(), any())).thenReturn(apiVersionVo);

        ApiVersionVo result = rccCacheImpl.getVersion(Long.valueOf(1), "name");
        Assert.assertEquals(apiVersionVo, result);
    }

    @Test
    public void testGetVersionById() throws Exception {
        when(cache.cacheEnable()).thenReturn(true);
        when(cache.get(anyString(), any())).thenReturn(apiVersionVo);

        ApiVersionVo result = rccCacheImpl.getVersionById(Long.valueOf(1));
        Assert.assertEquals(apiVersionVo, result);
    }

        @Test
        public void testGetItems() throws Exception {
            when(cache.cacheEnable()).thenReturn(true);
            Map<String, ApiItemVo> map = new HashMap<>();
            map.put("key", apiItemVo);
            when(cache.<ApiItemVo>hgetall(anyString(), any())).thenReturn(map);

            List<ApiItemVo> result = rccCacheImpl.getItems(Long.valueOf(1));
            Assert.assertEquals(apiItemVo, result.get(0));
        }

        @Test
        public void testGetItems2() throws Exception {
            when(cache.cacheEnable()).thenReturn(true);
            Map<String, ApiItemVo> map = new HashMap<>();
            map.put("key", apiItemVo);
            when(cache.<ApiItemVo>hmget(anyString(), any(), any())).thenReturn(map);

            List<ApiItemVo> result = rccCacheImpl.getItems(Long.valueOf(1), Arrays.<String>asList("String"));
            Assert.assertEquals(apiItemVo, result.get(0));
        }

    @Test
    public void testGetItem() throws Exception {
        when(cache.cacheEnable()).thenReturn(true);
        when(cache.hget(anyString(), anyString(), any())).thenReturn(apiItemVo);

        ApiItemVo result = rccCacheImpl.getItem(Long.valueOf(1), "name");
        Assert.assertEquals(apiItemVo, result);
    }

    @Test
    public void testLoadProject() throws Exception {
        when(cache.cacheEnable()).thenReturn(true);
        when(cache.put(anyString(), any())).thenReturn(Boolean.TRUE);

        rccCacheImpl.loadProject(project);
    }

    @Test
    public void testLoadUser() throws Exception {
        when(cache.cacheEnable()).thenReturn(true);
        when(cache.put(anyString(), any())).thenReturn(Boolean.TRUE);

        rccCacheImpl.loadUser(user);
    }

    @Test
    public void testLoadApiToken() throws Exception {
        when(cache.cacheEnable()).thenReturn(true);
        when(cache.put(anyString(), any())).thenReturn(Boolean.TRUE);

        rccCacheImpl.loadApiToken(apiToken);
    }

    @Test
    public void testLoadEnvironment() throws Exception {
        when(cache.cacheEnable()).thenReturn(true);
        when(cache.hset(anyString(), anyString(), any())).thenReturn(Boolean.TRUE);

        rccCacheImpl.loadEnvironment(envVo);
    }

    @Test
    public void testLoadEnvironments() throws Exception {
        when(cache.cacheEnable()).thenReturn(true);
        when(cache.evict(anyString())).thenReturn(Long.valueOf(1));
        when(cache.hmset(anyString(), any())).thenReturn(Boolean.TRUE);

        rccCacheImpl.loadEnvironments(Long.valueOf(1), Arrays.<ApiEnvironmentVo>asList(new ApiEnvironmentVo()));
    }

    @Test
    public void testLoadVersion() throws Exception {
        when(cache.cacheEnable()).thenReturn(true);
        when(cache.hset(anyString(), anyString(), any())).thenReturn(Boolean.TRUE);

        rccCacheImpl.loadVersion(apiVersionVo);
    }

    @Test
    public void testLoadVersionForId() throws Exception {
        when(cache.cacheEnable()).thenReturn(true);
        when(cache.put(anyString(), any())).thenReturn(Boolean.TRUE);

        rccCacheImpl.loadVersionForId(apiVersionVo);
    }

    @Test
    public void testLoadVersions() throws Exception {
        when(cache.cacheEnable()).thenReturn(true);
        when(cache.evict(anyString())).thenReturn(Long.valueOf(1));
        when(cache.hmset(anyString(), any())).thenReturn(Boolean.TRUE);

        rccCacheImpl.loadVersions(Long.valueOf(1), Arrays.<ApiVersionVo>asList(new ApiVersionVo()));
    }

    @Test
    public void testLoadItem() throws Exception {
        when(cache.cacheEnable()).thenReturn(true);
        when(cache.hset(anyString(), anyString(), any())).thenReturn(Boolean.TRUE);

        rccCacheImpl.loadItem(Long.valueOf(1), new ApiItemVo());
    }

    @Test
    public void testLoadItems() throws Exception {
        when(cache.cacheEnable()).thenReturn(true);
        when(cache.evict(anyString())).thenReturn(Long.valueOf(1));
        when(cache.hmset(anyString(), any())).thenReturn(Boolean.TRUE);

        rccCacheImpl.loadItems(Long.valueOf(1), Arrays.<ApiItemVo>asList(new ApiItemVo()), true);
    }
}
