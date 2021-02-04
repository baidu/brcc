/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
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
        when(apiTokenCacheService.getApiToken(anyString())).thenReturn(new ApiToken());
        when(versionService.getByEnvironmentAndNameInCache(any(), any(), anyString()))
                .thenReturn(new ApiVersionVo());

        R<ApiVersionVo> result = apiVersionController.getVersion("token", Long.valueOf(1), "name");
        Assert.assertEquals(0, result.getStatus());
    }

    @Test
    public void testGetAllVersion() throws Exception {
        when(apiTokenCacheService.getApiToken(anyString())).thenReturn(new ApiToken());
        when(versionService.getAllByEnvironmentIdInCache(anyLong(), anyLong()))
                .thenReturn(Arrays.<ApiVersionVo>asList(new ApiVersionVo()));

        R<List<ApiVersionVo>> result = apiVersionController.getAllVersion("token", Long.valueOf(1));
        Assert.assertEquals(0, result.getStatus());
    }
}
