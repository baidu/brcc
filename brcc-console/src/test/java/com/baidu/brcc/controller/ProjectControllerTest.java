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


import static com.baidu.brcc.common.ErrorStatusMsg.NON_LOGIN_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PARAM_ERROR_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PRIV_MIS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PRODUCT_ID_EMPTY_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PRODUCT_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_PASSWORD_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_ID_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_NAME_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_TYPE_NOT_AVAILABLE_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.USERID_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.USER_NOT_EXISTS_STATUS;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyByte;
import static org.mockito.Mockito.anyLong;
import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.anyVararg;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.baidu.brcc.domain.vo.ResetApiPasswordVo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;

import com.baidu.brcc.domain.ApiToken;
import com.baidu.brcc.domain.EnvironmentUser;
import com.baidu.brcc.domain.Product;
import com.baidu.brcc.domain.Project;
import com.baidu.brcc.domain.ProjectUser;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.base.R;
import com.baidu.brcc.domain.em.EnvironmentUserPriType;
import com.baidu.brcc.domain.em.ProjectUserAdmin;
import com.baidu.brcc.domain.vo.ProjectReq;
import com.baidu.brcc.dto.EnvPriDto;
import com.baidu.brcc.dto.ProjectUserDto;
import com.baidu.brcc.dto.RefProjectDto;
import com.baidu.brcc.service.ApiTokenService;
import com.baidu.brcc.service.EnvironmentUserService;
import com.baidu.brcc.service.ProductService;
import com.baidu.brcc.service.ProductUserService;
import com.baidu.brcc.service.ProjectService;
import com.baidu.brcc.service.ProjectUserService;
import com.baidu.brcc.service.RccCache;
import com.baidu.brcc.service.UserService;

public class ProjectControllerTest {
    private static final Long ID = 1L;
    private static final int OK = 0;
    private User user = null;

    @Mock
    ProjectService projectService;
    @Mock
    ProductService productService;
    @Mock
    ProjectUserService projectUserService;
    @Mock
    ProductUserService productUserService;
    @Mock
    EnvironmentUserService envUserService;
    @Mock
    UserService userService;
    @Mock
    ApiTokenService apiTokenService;
    @Mock
    EnvironmentUserService environmentUserService;
    @Mock
    RccCache rccCache;
    @Mock
    Logger log;
    @InjectMocks
    ProjectController projectController;

    @Before
    public void setUp() {
        user = new User();
        user.setId(ID);
        user.setName("test-user");
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAddProjectNoLogin() throws Exception {
        R result = projectController.addProject(new ProjectReq(), null);
        Assert.assertEquals(NON_LOGIN_STATUS, result.getStatus());
    }

    @Test
    public void testAddProjectForUpdate() throws Exception {
        ProjectReq req = new ProjectReq();
        req.setId(ID);
        req.setName("project");
        req.setProjectType((byte) 100);
        R result = projectController.addProject(req, user);
        Assert.assertEquals(PROJECT_TYPE_NOT_AVAILABLE_STATUS.intValue(), result.getStatus());

        req.setProjectType(null);
        result = projectController.addProject(req, user);
        Assert.assertEquals(PROJECT_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        Project project = new Project();
        project.setProductId(ID);
        project.setId(ID);
        when(projectService.selectByPrimaryKey(any(), anyVararg())).thenReturn(project);
        result = projectController.addProject(req, user);
        Assert.assertEquals(PRIV_MIS_STATUS.intValue(), result.getStatus());

        when(apiTokenService.selectByProjectId(anyLong(), anyVararg()))
                .thenReturn(Arrays.asList(new ApiToken()));
        when(projectUserService.checkAuth(anyLong(), anyLong(), any())).thenReturn(true);
        result = projectController.addProject(req, user);
        Assert.assertEquals(OK, result.getStatus());
    }

    @Test
    public void testResetApiPassword() throws Exception{
        ResetApiPasswordVo resetApiPassword = new ResetApiPasswordVo();
        resetApiPassword.setApiPassword("pwd");
        resetApiPassword.setId(ID);
        //String name = user.getName();
        R result = projectController.resetApiPassword(ID, null, resetApiPassword);
        Assert.assertEquals(NON_LOGIN_STATUS, result.getStatus());
        //resetApiPassword.setId(null);

        result = projectController.resetApiPassword(null, user, resetApiPassword);
        Assert.assertEquals(PROJECT_ID_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        when(projectService.selectByPrimaryKey(any())).thenReturn(null);
        result = projectController.resetApiPassword(ID, user, resetApiPassword);
        Assert.assertEquals(PROJECT_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        Project project = new Project();
        project.setProductId(ID);
        project.setId(ID);
        when(projectService.selectByPrimaryKey(any())).thenReturn(project);
        when(productUserService.checkAuth(anyLong(), any())).thenReturn(false);
        result = projectController.resetApiPassword(ID, user, resetApiPassword);
        Assert.assertEquals(PRIV_MIS_STATUS.intValue(), result.getStatus());

        resetApiPassword.setApiPassword(null);
        when(productUserService.checkAuth(anyLong(), any())).thenReturn(true);
        result = projectController.resetApiPassword(ID, user, resetApiPassword);
        Assert.assertEquals(PROJECT_API_PASSWORD_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        resetApiPassword.setApiPassword("pwd");
        when(userService.selectUserByName(any())).thenReturn(null);
        result = projectController.resetApiPassword(ID, user, resetApiPassword);
        Assert.assertEquals(USER_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        when(userService.selectUserByName(any())).thenReturn(user);
        projectService.updateByPrimaryKeySelective(project);
        List<ApiToken> apiTokens = new ArrayList<>();
        when(apiTokenService.selectByProjectId(anyLong(), anyVararg())).thenReturn(apiTokens);
        apiTokenService.updateByPrimaryKeySelective(new ApiToken());
        rccCache.evictProject(anyString(), any());
        result = projectController.resetApiPassword(ID, user, resetApiPassword);
        Assert.assertEquals(OK, result.getStatus());


    }

    @Test
    public void testAddProjectForInsert() throws Exception {
        ProjectReq req = new ProjectReq();
        req.setId(null);
        R result = projectController.addProject(req, user);
        Assert.assertEquals(PRODUCT_ID_EMPTY_STATUS.intValue(), result.getStatus());

        req.setProductId(ID);
        result = projectController.addProject(req, user);
        Assert.assertEquals(PROJECT_NAME_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        req.setName("project");
        result = projectController.addProject(req, user);
        Assert.assertEquals(PROJECT_API_PASSWORD_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        req.setApiPassword("pwd");
        result = projectController.addProject(req, user);
        Assert.assertEquals(PRODUCT_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        Product product = new Product();
        product.setId(ID);
        when(productService.selectByPrimaryKey(any())).thenReturn(product);
        result = projectController.addProject(req, user);
        Assert.assertEquals(PRIV_MIS_STATUS.intValue(), result.getStatus());

        when(productUserService.checkAuth(any(), any())).thenReturn(true);
        result = projectController.addProject(req, user);
        Assert.assertEquals(OK, result.getStatus());
    }

    @Test
    public void testDeleteProject() throws Exception {
        R result = projectController.deleteProject(ID, null);
        Assert.assertEquals(NON_LOGIN_STATUS, result.getStatus());

        result = projectController.deleteProject(0L, user);
        Assert.assertEquals(PROJECT_ID_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        result = projectController.deleteProject(ID, user);
        Assert.assertEquals(PROJECT_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        Project project = new Project();
        project.setProductId(ID);
        project.setId(ID);
        when(projectService.selectByPrimaryKey(any())).thenReturn(project);
        result = projectController.deleteProject(ID, user);
        Assert.assertEquals(PRIV_MIS_STATUS.intValue(), result.getStatus());

        when(productUserService.checkAuth(any(), any())).thenReturn(true);
        result = projectController.deleteProject(ID, user);
        Assert.assertEquals(OK, result.getStatus());
    }

    @Test
    public void testGetProjectList() throws Exception {
        R result = projectController.getProjectList("id", "desc", 0L, 0, 20, user);
        Assert.assertEquals(PRODUCT_ID_EMPTY_STATUS.intValue(), result.getStatus());

        ProjectUser projectUser = new ProjectUser();
        projectUser.setIsAdmin(ProjectUserAdmin.YES.getValue());
        when(projectUserService.selectByExample(any(), anyVararg())).thenReturn(Arrays.asList(projectUser));

        EnvironmentUser environmentUser = new EnvironmentUser();
        when(environmentUserService.selectByExample(any(), anyVararg())).thenReturn(Arrays.asList(environmentUser));
        result = projectController.getProjectList("id", "desc", ID, 0, 20, user);
        Assert.assertEquals(OK, result.getStatus());

    }

    @Test
    public void testAddRef() throws Exception {
        RefProjectDto refDto = new RefProjectDto();
        R result = projectController.addRef(ID, refDto, null);
        Assert.assertEquals(NON_LOGIN_STATUS, result.getStatus());

        result = projectController.addRef(0L, refDto, user);
        Assert.assertEquals(PROJECT_ID_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        result = projectController.addRef(ID, refDto, user);
        Assert.assertEquals(PROJECT_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        Project project = new Project();
        project.setProductId(ID);
        when(projectService.selectByPrimaryKey(any())).thenReturn(project);
        result = projectController.addRef(ID, refDto, user);
        Assert.assertEquals(PRIV_MIS_STATUS.intValue(), result.getStatus());

        when(productUserService.checkAuth(any(), any())).thenReturn(true);
        result = projectController.addRef(ID, refDto, user);
        Assert.assertEquals(PARAM_ERROR_STATUS.intValue(), result.getStatus());

        List<Long> refIdList = new ArrayList<>();
        refIdList.add(ID);
        refIdList.add(2L);
        refDto.setRefIds(refIdList);
        when(projectService.selectByPrimaryKeys(refIdList)).thenReturn(Arrays.asList(mock(Project.class)));

        result = projectController.addRef(ID, refDto, user);
        Assert.assertEquals(OK, result.getStatus());
    }

    @Test
    public void testAddMember() throws Exception {
        ProjectUserDto dto = new ProjectUserDto();
        R result = projectController.addMember(ID, ID, dto, null);
        Assert.assertEquals(NON_LOGIN_STATUS, result.getStatus());

        result = projectController.addMember(ID, ID, dto, user);
        Assert.assertEquals(OK, result.getStatus());

        dto.setMemberNameList(Arrays.asList("m1"));
        result = projectController.addMember(ID, ID, dto, user);
        Assert.assertEquals(PRIV_MIS_STATUS.intValue(), result.getStatus());

        when(projectUserService.checkAuth(ID, ID, user)).thenReturn(true);
        User u1 = new User();
        u1.setName("m1");
        u1.setId(2L);
        when(userService.addUserIfNotExist(anyString(), anyByte(), anyByte())).thenReturn(u1);
        EnvPriDto envPriDto = new EnvPriDto();
        envPriDto.setPriType(EnvironmentUserPriType.READ.getValue());
        dto.setEnvPriDtoList(Arrays.asList(envPriDto));
        result = projectController.addMember(ID, ID, dto, user);
        Assert.assertEquals(OK, result.getStatus());
    }

    @Test
    public void testDelMember() throws Exception {

        R result =  projectController.delMember(ID, ID, Arrays.asList(ID), null);
        Assert.assertEquals(NON_LOGIN_STATUS, result.getStatus());

        result =  projectController.delMember(ID, ID, null, user);
        Assert.assertEquals(USERID_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        result =  projectController.delMember(ID, ID, Arrays.asList(ID), user);
        Assert.assertEquals(PRIV_MIS_STATUS.intValue(), result.getStatus());

        when(projectUserService.checkAuth(ID, ID, user)).thenReturn(true);
        result =  projectController.delMember(ID, ID, Arrays.asList(ID), user);
        Assert.assertEquals(OK, result.getStatus());
    }

    @Test
    public void testGetMemberList() throws Exception {
        R result = projectController.getMemberList(null);
        Assert.assertEquals(PROJECT_ID_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        result = projectController.getMemberList(ID);
        Assert.assertEquals(OK, result.getStatus());

    }
}
