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

import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_NAME_NOT_EMPTY_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_NAME_NOT_EMPTY_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_TOKEN_NOT_EMPTY_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_TOKEN_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_TOKEN_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_NOT_EXISTS_STATUS;
import static org.apache.commons.lang3.StringUtils.trim;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.baidu.brcc.domain.EnvironmentExample;
import com.baidu.brcc.domain.em.Deleted;
import com.baidu.brcc.domain.meta.MetaEnvironment;
import com.baidu.brcc.domain.vo.EnvironmentReq;
import com.baidu.brcc.service.ProjectService;
import com.baidu.brcc.utils.time.DateTimeUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.baidu.brcc.domain.ApiToken;
import com.baidu.brcc.domain.Environment;
import com.baidu.brcc.domain.Project;
import com.baidu.brcc.domain.base.R;
import com.baidu.brcc.domain.vo.ApiEnvironmentVo;
import com.baidu.brcc.service.ApiTokenCacheService;
import com.baidu.brcc.service.EnvironmentService;
import com.baidu.brcc.service.RccCache;

public class ApiEnvironmentControllerTest {
    @Mock
    ApiTokenCacheService apiTokenCacheService;
    @Mock
    EnvironmentService environmentService;
    @Mock
    RccCache rccCache;
    @Mock
    ProjectService projectService;
    @InjectMocks
    ApiEnvironmentController apiEnvironmentController;

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
    public void testGetEnvironment() throws Exception {
        when(apiTokenCacheService.getApiToken(anyString())).thenReturn(new ApiToken());
        when(environmentService.getByProjectIdAndNameInCache(any(), any()))
                .thenReturn(new ApiEnvironmentVo());

        R<ApiEnvironmentVo> result = apiEnvironmentController.getEnvironment("token", "name");
        Assert.assertEquals(0, result.getStatus());
    }

    @Test
    public void testGetAllEnvironment() throws Exception {
        when(apiTokenCacheService.getApiToken(anyString())).thenReturn(new ApiToken());
        when(environmentService.selectByProjectId(any())).thenReturn(Arrays.<Environment>asList(new Environment()));
        when(rccCache.getEnvironments(any())).thenReturn(null);

        R<List<ApiEnvironmentVo>> result = apiEnvironmentController.getAllEnvironment("token");
        Assert.assertEquals(0, result.getStatus());
    }

    @Test
    public void testAddEnvironment() {
        R<Long> result = apiEnvironmentController.addEnvironment(null, null);
        Assert.assertEquals(PROJECT_API_TOKEN_NOT_EMPTY_STATUS.intValue(), result.getStatus());

        String token = "token";
        EnvironmentReq environmentReq = new EnvironmentReq();
        when(apiTokenCacheService.getApiToken(token)).thenReturn(null);
        result = apiEnvironmentController.addEnvironment(token, environmentReq);
        Assert.assertEquals(PROJECT_API_TOKEN_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        environmentReq.setName("");
        when(apiTokenCacheService.getApiToken(token)).thenReturn(new ApiToken());
        result = apiEnvironmentController.addEnvironment(token, environmentReq);
        Assert.assertEquals(ENVIRONMENT_NAME_NOT_EMPTY_STATUS.intValue(), result.getStatus());

        environmentReq.setName("name");
        ApiToken apiToken = new ApiToken();
        apiToken.setProjectId(1L);
        when(apiTokenCacheService.getApiToken(token)).thenReturn(apiToken);
        when(projectService.selectByPrimaryKey(apiToken.getProjectId())).thenReturn(null);
        result = apiEnvironmentController.addEnvironment(token, environmentReq);
        Assert.assertEquals(PROJECT_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        when(apiTokenCacheService.getApiToken(token)).thenReturn(apiToken);
        when(projectService.selectByPrimaryKey(apiToken.getProjectId())).thenReturn(new Project());
        Environment environment = Environment.newBuilder().build();
        environment.setId(1L);
        environment.setName("na");
        environment.setCreateTime(DateTimeUtils.now());
        environment.setDeleted(Deleted.OK.getValue());
        environment.setProductId(1L);
        environment.setProjectId(2L);
        when(environmentService.selectOneByExample(EnvironmentExample.newBuilder().build().createCriteria().toExample())).thenReturn(environment);
        result = apiEnvironmentController.addEnvironment(token, environmentReq);
        Assert.assertEquals(0, result.getStatus());

        when(apiTokenCacheService.getApiToken(token)).thenReturn(apiToken);
        when(projectService.selectByPrimaryKey(apiToken.getProjectId())).thenReturn(new Project());
        when(environmentService.selectOneByExample(EnvironmentExample.newBuilder().build().createCriteria().toExample())).thenReturn(null);
        result = apiEnvironmentController.addEnvironment(token, environmentReq);
        Assert.assertEquals(0, result.getStatus());

    }



}
