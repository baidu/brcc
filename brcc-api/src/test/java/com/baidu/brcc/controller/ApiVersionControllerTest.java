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
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_TOKEN_NOT_EMPTY_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_TOKEN_NOT_EXISTS_STATUS;
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
}
