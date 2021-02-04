/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.controller;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.baidu.brcc.domain.ApiToken;
import com.baidu.brcc.domain.Project;
import com.baidu.brcc.domain.base.R;
import com.baidu.brcc.domain.vo.ApiAuthReqVo;
import com.baidu.brcc.domain.vo.ApiAuthVo;
import com.baidu.brcc.service.ApiTokenCacheService;
import com.baidu.brcc.service.ProjectService;
import com.baidu.brcc.service.RccCache;

public class ApiAuthControllerTest {
    @Mock
    ApiTokenCacheService apiTokenCacheService;
    @Mock
    RccCache rccCache;
    @Mock
    ProjectService projectService;
    @InjectMocks
    ApiAuthController apiAuthController;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testApiAuth() throws Exception {
        ApiToken apiToken = new ApiToken();
        apiToken.setProjectId(1L);
        when(apiTokenCacheService.getApiToken(any())).thenReturn(apiToken);
        Project project = new Project();
        project.setId(1L);
        project.setApiPassword("5f4dcc3b5aa765d61d8327deb882cf99");
        when(rccCache.getProject(anyString())).thenReturn(project);
        when(projectService.selectByName(anyString())).thenReturn(project);

        ApiAuthReqVo apiAuthReqVo = new ApiAuthReqVo();
        apiAuthReqVo.setProjectName("project");
        apiAuthReqVo.setApiPassword("password");
        R<ApiAuthVo> result = apiAuthController.apiAuth(apiAuthReqVo);
        Assert.assertEquals(0, result.getStatus());
    }
}
