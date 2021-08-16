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
package com.baidu.brcc.controller;

import java.util.Arrays;
import java.util.List;

import com.baidu.brcc.domain.ConfigGroup;
import com.baidu.brcc.domain.Environment;
import com.baidu.brcc.domain.Version;
import com.baidu.brcc.domain.em.Deleted;
import com.baidu.brcc.domain.vo.ApiGroupVo;
import com.baidu.brcc.domain.vo.ConfigGroupReq;
import com.baidu.brcc.domain.vo.VersionReq;
import com.baidu.brcc.service.ConfigGroupService;
import com.baidu.brcc.service.EnvironmentService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.baidu.brcc.domain.ApiToken;
import com.baidu.brcc.domain.Project;
import com.baidu.brcc.domain.base.R;
import com.baidu.brcc.domain.vo.ApiVersionVo;
import com.baidu.brcc.service.ApiTokenCacheService;
import com.baidu.brcc.service.RccCache;
import com.baidu.brcc.service.VersionService;

import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_ID_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_NAME_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_TOKEN_NOT_EMPTY_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_TOKEN_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_ID_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_NAME_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_NOT_EXISTS_STATUS;
import static org.mockito.Mockito.*;

public class ApiVersionControllerTest {
    @Mock
    ApiTokenCacheService apiTokenCacheService;
    @Mock
    VersionService versionService;
    @Mock
    RccCache rccCache;
    @Mock
    ConfigGroupService configGroupService;
    @Mock
    EnvironmentService environmentService;
    @InjectMocks
    ApiVersionController apiVersionController;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        ApiToken apiToken = new ApiToken();
        apiToken.setProjectId(1L);
        when(apiTokenCacheService.getApiToken(any())).thenReturn(apiToken);
        Project project = new Project();
        project.setId(1L);
        project.setApiPassword("5f4dcc3b5aa765d61d8327deb882cf99");
        when(rccCache.getProject(anyString())).thenReturn(project);
    }

    @Test
    public void testGetVersion() throws Exception {
        R<ApiVersionVo> result = apiVersionController.getVersion("", Long.valueOf(1), "name");
        Assert.assertEquals(PROJECT_API_TOKEN_NOT_EMPTY_STATUS.intValue(), result.getStatus());

        result = apiVersionController.getVersion("token", Long.valueOf(-1), "name");
        Assert.assertEquals(ENVIRONMENT_ID_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        result = apiVersionController.getVersion("token", Long.valueOf(1), "");
        Assert.assertEquals(VERSION_NAME_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        when(apiTokenCacheService.getApiToken(anyString())).thenReturn(null);
        result = apiVersionController.getVersion("token", Long.valueOf(1), "name");
        Assert.assertEquals(PROJECT_API_TOKEN_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        when(apiTokenCacheService.getApiToken(anyString())).thenReturn(new ApiToken());
        when(versionService.getByEnvironmentAndNameInCache(any(), any(), anyString()))
                .thenReturn(null);
        result = apiVersionController.getVersion("token", Long.valueOf(1), "name");
        Assert.assertEquals(VERSION_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        when(versionService.getByEnvironmentAndNameInCache(any(), any(), anyString()))
                .thenReturn(new ApiVersionVo());
        result = apiVersionController.getVersion("token", Long.valueOf(1), "name");
        Assert.assertEquals(0, result.getStatus());
    }

    @Test
    public void testGetAllVersion() throws Exception {
        R<List<ApiVersionVo>> result = apiVersionController.getAllVersion("", Long.valueOf(1));
        Assert.assertEquals(PROJECT_API_TOKEN_NOT_EMPTY_STATUS.intValue(), result.getStatus());

        result = apiVersionController.getAllVersion("token", Long.valueOf(-1));
        Assert.assertEquals(ENVIRONMENT_ID_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        when(apiTokenCacheService.getApiToken(anyString())).thenReturn(null);
        result = apiVersionController.getAllVersion("token", Long.valueOf(1));
        Assert.assertEquals(PROJECT_API_TOKEN_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        when(apiTokenCacheService.getApiToken(anyString())).thenReturn(new ApiToken());
        result = apiVersionController.getAllVersion("token", Long.valueOf(1));
        Assert.assertEquals(0, result.getStatus());

        ApiToken apiToken = new ApiToken();
        apiToken.setProjectId(1L);
        when(apiTokenCacheService.getApiToken(anyString())).thenReturn(apiToken);
        when(versionService.getAllByEnvironmentIdInCache(anyLong(), anyLong()))
                .thenReturn(Arrays.asList(new ApiVersionVo()));
        result = apiVersionController.getAllVersion("token", Long.valueOf(1));
        Assert.assertEquals(0, result.getStatus());
    }

    @Test
    public void testGetGrayVersion() throws Exception {
        R<ApiVersionVo> result = apiVersionController.getGrayVersion("", Long.valueOf(1), "", "", "", Boolean.valueOf(false),"name");
        Assert.assertEquals(PROJECT_API_TOKEN_NOT_EMPTY_STATUS.intValue(), result.getStatus());

        result = apiVersionController.getGrayVersion("token", Long.valueOf(-1), "", "", "", Boolean.valueOf(false),"name");
        Assert.assertEquals(ENVIRONMENT_ID_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        result = apiVersionController.getGrayVersion("token", Long.valueOf(1), "", "", "", Boolean.valueOf(false),"");
        Assert.assertEquals(VERSION_NAME_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        result = apiVersionController.getGrayVersion("token", Long.valueOf(1), "", "", "", Boolean.valueOf(false),"");
        Assert.assertEquals(VERSION_NAME_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        when(apiTokenCacheService.getApiToken(anyString())).thenReturn(null);
        result = apiVersionController.getGrayVersion("token", Long.valueOf(1), "", "", "", Boolean.valueOf(false),"name");
        Assert.assertEquals(PROJECT_API_TOKEN_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        when(apiTokenCacheService.getApiToken(anyString())).thenReturn(new ApiToken());
        when(versionService.selectByProjectIdAndEnvironmentIdAndName(anyLong(), anyLong(), anyString())).thenReturn(null);
        result = apiVersionController.getGrayVersion("token", Long.valueOf(1), "", "", "", Boolean.valueOf(false),"name");
        Assert.assertEquals(VERSION_NOT_EXISTS_STATUS.intValue(), result.getStatus());

    }

    @Test
    public void testAddGroup() {
        R<Long> result = apiVersionController.addGroup("", null);
        Assert.assertEquals(PROJECT_API_TOKEN_NOT_EMPTY_STATUS.intValue(), result.getStatus());

        ConfigGroupReq configGroupReq = new ConfigGroupReq();
        result = apiVersionController.addGroup("token", configGroupReq);
        Assert.assertEquals(GROUP_NAME_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        configGroupReq.setName("aaa");
        result = apiVersionController.addGroup("token", configGroupReq);
        Assert.assertEquals(VERSION_ID_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        configGroupReq.setVersionId(1L);
        result = apiVersionController.addGroup("token", configGroupReq);
        when(versionService.selectByPrimaryKey(anyLong())).thenReturn(null);
        Assert.assertEquals(VERSION_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        Version version = new Version();
        version.setId(1L);
        version.setDeleted(Deleted.OK.getValue());
        when(versionService.selectByPrimaryKey(anyLong())).thenReturn(version);
        when(apiTokenCacheService.getApiToken(anyString())).thenReturn(null);
        result = apiVersionController.addGroup("token", configGroupReq);
        Assert.assertEquals(PROJECT_API_TOKEN_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        when(versionService.selectByPrimaryKey(anyLong())).thenReturn(version);
        when(apiTokenCacheService.getApiToken(anyString())).thenReturn(new ApiToken());
        when(configGroupService.selectOneByExample(any())).thenReturn(null);
        result = apiVersionController.addGroup("token", configGroupReq);
        Assert.assertEquals(0, result.getStatus());
    }

    @Test
    public void testAddVersion() {
        VersionReq versionReq = new VersionReq();
        R<Long> result = apiVersionController.addVersion("", versionReq);
        Assert.assertEquals(PROJECT_API_TOKEN_NOT_EMPTY_STATUS.intValue(), result.getStatus());

        when(apiTokenCacheService.getApiToken(anyString())).thenReturn(null);
        result = apiVersionController.addVersion("token", versionReq);
        Assert.assertEquals(PROJECT_API_TOKEN_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        ApiToken apiToken = new ApiToken();
        when(apiTokenCacheService.getApiToken(anyString())).thenReturn(apiToken);
        result = apiVersionController.addVersion("token", versionReq);
        Assert.assertEquals(VERSION_NAME_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        when(apiTokenCacheService.getApiToken(anyString())).thenReturn(apiToken);
        versionReq.setName("n");
        result = apiVersionController.addVersion("token", versionReq);
        Assert.assertEquals(ENVIRONMENT_ID_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        when(apiTokenCacheService.getApiToken(anyString())).thenReturn(apiToken);
        versionReq.setName("n");
        versionReq.setEnvironmentId(1L);
        Environment environment = new Environment();
        when(environmentService.selectByPrimaryKey(any())).thenReturn(null);
        result = apiVersionController.addVersion("token", versionReq);
        Assert.assertEquals(ENVIRONMENT_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        when(environmentService.selectByPrimaryKey(any())).thenReturn(environment);
        when(versionService.selectOneByExample(any())).thenReturn(null);
        result = apiVersionController.addVersion("token", versionReq);
        Assert.assertEquals(0, result.getStatus());
    }

    @Test
    public void testGetAllGroup() {
        R<List<ApiGroupVo>> result = apiVersionController.getAllGroup(null, anyLong());
        Assert.assertEquals(PROJECT_API_TOKEN_NOT_EMPTY_STATUS.intValue(), result.getStatus());

        String token = "token";
        result = apiVersionController.getAllGroup(token, null);
        Assert.assertEquals(VERSION_ID_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        Long id = 1L;
        when(apiTokenCacheService.getApiToken(token)).thenReturn(null);
        result = apiVersionController.getAllGroup(token, id);
        Assert.assertEquals(0, result.getStatus());

        when(apiTokenCacheService.getApiToken(token)).thenReturn(new ApiToken());
        result = apiVersionController.getAllGroup(token, id);
        Assert.assertEquals(0, result.getStatus());

    }




}
