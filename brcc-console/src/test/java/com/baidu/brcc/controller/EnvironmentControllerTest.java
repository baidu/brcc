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

import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_NAME_NOT_EMPTY_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.NON_LOGIN_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PRIV_MIS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_ID_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_NOT_EXISTS_STATUS;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyLong;
import static org.mockito.Mockito.anyVararg;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;

import com.baidu.brcc.common.Constants;
import com.baidu.brcc.domain.Environment;
import com.baidu.brcc.domain.EnvironmentUser;
import com.baidu.brcc.domain.Project;
import com.baidu.brcc.domain.ProjectUser;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.base.Pagination;
import com.baidu.brcc.domain.base.R;
import com.baidu.brcc.domain.em.Deleted;
import com.baidu.brcc.domain.vo.EnvironmentReq;
import com.baidu.brcc.domain.vo.ProjectUserEnv;
import com.baidu.brcc.service.EnvironmentService;
import com.baidu.brcc.service.EnvironmentUserService;
import com.baidu.brcc.service.ProjectService;
import com.baidu.brcc.service.ProjectUserService;
import com.baidu.brcc.service.RccCache;

public class EnvironmentControllerTest {
    private static final Long ID = 1L;
    private static final int OK = 0;

    @Mock
    Logger log;
    @Mock
    EnvironmentService environmentService;
    @Mock
    ProjectService projectService;
    @Mock
    ProjectUserService projectUserService;
    @Mock
    EnvironmentUserService environmentUserService;
    @Mock
    RccCache rccCache;
    @InjectMocks
    EnvironmentController environmentController;
    private User user = null;

    @Before
    public void setUp() {
        user = new User();
        user.setId(ID);
        user.setName("test-user");
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSaveNoLogin() throws Exception {
        R result = environmentController.save(new EnvironmentReq(), null);
        Assert.assertEquals(NON_LOGIN_STATUS, result.getStatus());
    }

    @Test
    public void testSaveForUpdate() throws Exception {
        EnvironmentReq req = new EnvironmentReq();
        req.setId(ID);
        req.setName("env");
        req.setMemo("memo");
        req.setProjectId(ID);

        Environment environment = new Environment();
        environment.setId(ID);
        environment.setProjectId(ID);
        environment.setProductId(ID);
        environment.setDeleted(Deleted.DELETE.getValue());
        when(environmentService.selectByPrimaryKey(any())).thenReturn(environment);
        R result = environmentController.save(req, user);
        Assert.assertEquals(ENVIRONMENT_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        environment.setDeleted(Deleted.OK.getValue());
        result = environmentController.save(req, user);
        Assert.assertEquals(PRIV_MIS_STATUS.intValue(), result.getStatus());

        when(projectUserService.checkAuth(anyLong(), anyLong(), any())).thenReturn(true);
        result = environmentController.save(req, user);
        Assert.assertEquals(OK, result.getStatus());
    }

    @Test
    public void testSaveForInsert() throws Exception {

        EnvironmentReq req = new EnvironmentReq();
        req.setId(null);
        req.setMemo("memo");
        R result = environmentController.save(req, user);
        Assert.assertEquals(PROJECT_ID_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        req.setProjectId(ID);
        result = environmentController.save(req, user);
        Assert.assertEquals(ENVIRONMENT_NAME_NOT_EMPTY_STATUS.intValue(), result.getStatus());

        req.setName("env");
        Project project = new Project();
        project.setId(ID);
        project.setProductId(ID);
        project.setDeleted(Deleted.DELETE.getValue());
        when(projectService.selectByPrimaryKey(any())).thenReturn(project);
        result = environmentController.save(req, user);
        Assert.assertEquals(PROJECT_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        project.setDeleted(Deleted.OK.getValue());
        result = environmentController.save(req, user);
        Assert.assertEquals(PRIV_MIS_STATUS.intValue(), result.getStatus());

        when(projectUserService.checkAuth(anyLong(), anyLong(), any())).thenReturn(true);
        result = environmentController.save(req, user);
        Assert.assertEquals(OK, result.getStatus());
    }

    @Test
    public void testDelEnv() throws Exception {
        R result = environmentController.delEnv(ID, null);
        Assert.assertEquals(NON_LOGIN_STATUS, result.getStatus());
        Environment environment = new Environment();
        environment.setId(ID);
        environment.setProjectId(ID);
        environment.setProductId(ID);
        environment.setDeleted(Deleted.DELETE.getValue());
        when(environmentService.selectByPrimaryKey(any())).thenReturn(environment);
        result = environmentController.delEnv(ID, user);
        Assert.assertEquals(ENVIRONMENT_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        environment.setDeleted(Deleted.OK.getValue());
        result = environmentController.delEnv(ID, user);
        Assert.assertEquals(PRIV_MIS_STATUS.intValue(), result.getStatus());

        when(projectUserService.checkAuth(anyLong(), anyLong(), any())).thenReturn(true);
        result = environmentController.delEnv(ID, user);
        Assert.assertEquals(OK, result.getStatus());
    }

    @Test
    public void testGetEnvList() throws Exception {
        R<Pagination<Environment>> result = environmentController.getEnvList("id", "desc", ID, 0, 20, null);
        Assert.assertEquals(NON_LOGIN_STATUS, result.getStatus());

        result = environmentController.getEnvList("id", "desc", 0L, 0, 20, user);
        Assert.assertEquals(PROJECT_ID_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        result = environmentController.getEnvList("id", "desc", ID, 0, 20, user);
        Assert.assertEquals(PROJECT_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        Project project = new Project();
        project.setId(ID);
        project.setProductId(ID);
        when(projectService.selectByPrimaryKey(any(), anyVararg())).thenReturn(project);
        when(environmentUserService.selectByExample(any(), anyVararg()))
                .thenReturn(Arrays.asList(mock(EnvironmentUser.class)));
        result = environmentController.getEnvList("id", "desc", ID, 0, 20, user);
        Assert.assertEquals(OK, result.getStatus());
    }

    @Test
    public void testGetEnvListByUserId() throws Exception {
        R<ProjectUserEnv> result = environmentController.getEnvListByUserId(ID, ID, ID , null);
        Assert.assertEquals(NON_LOGIN_STATUS, result.getStatus());

        Map<Long, Environment> map = new HashMap<>();
        map.put(ID, mock(Environment.class));
        when(environmentService.selectMapByExample(any(), any())).thenReturn(map);

        EnvironmentUser envuser = mock(EnvironmentUser.class);
        when(environmentUserService.selectByExample(any(), anyVararg()))
                .thenReturn(Arrays.asList(envuser));
        result = environmentController.getEnvListByUserId(ID, ID, ID , user);
        Assert.assertEquals(OK, result.getStatus());

        ProjectUser projectUser = mock(ProjectUser.class);
        when(projectUserService.selectOneByExample(any())).thenReturn(projectUser);
        when(projectUser.getIsAdmin()).thenReturn(Constants.IS_ADMIN);
        result = environmentController.getEnvListByUserId(ID, ID, ID , user);
        Assert.assertEquals(OK, result.getStatus());
    }
}
