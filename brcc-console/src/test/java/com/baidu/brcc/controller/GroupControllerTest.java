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

import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_ID_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_NAME_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.NON_LOGIN_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PRIV_MIS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_ID_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_NOT_EXISTS_STATUS;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyLong;
import static org.mockito.Mockito.anyVararg;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.baidu.brcc.domain.ConfigGroup;
import com.baidu.brcc.domain.TreeNode;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.Version;
import com.baidu.brcc.domain.base.Pagination;
import com.baidu.brcc.domain.base.R;
import com.baidu.brcc.domain.em.Deleted;
import com.baidu.brcc.domain.vo.ConfigGroupReq;
import com.baidu.brcc.domain.vo.ConfigGroupVo;
import com.baidu.brcc.service.ConfigGroupService;
import com.baidu.brcc.service.EnvironmentUserService;
import com.baidu.brcc.service.VersionService;

public class GroupControllerTest {
    private static final Long ID = 1L;
    private static final int OK = 0;
    private User user = null;
    @Mock
    ConfigGroupService groupService;
    @Mock
    EnvironmentUserService environmentUserService;
    @Mock
    VersionService versionService;
    @InjectMocks
    GroupController groupController;

    @Before
    public void setUp() {
        user = new User();
        user.setId(ID);
        user.setName("test-user");
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSaveGroupNoLogin() throws Exception {
        R<Long> result = groupController.saveGroup(null, null);
        Assert.assertEquals(NON_LOGIN_STATUS, result.getStatus());
    }

    @Test
    public void testSaveGroupForUpdate() throws Exception {
        ConfigGroupReq req = new ConfigGroupReq();
        req.setId(ID);
        req.setName("group");
        ConfigGroup configGroup = new ConfigGroup();
        configGroup.setId(ID);
        configGroup.setVersionId(ID);
        configGroup.setEnvironmentId(ID);
        configGroup.setProjectId(ID);
        configGroup.setProductId(ID);
        configGroup.setDeleted(Deleted.DELETE.getValue());
        when(groupService.selectByPrimaryKey(any(), anyVararg())).thenReturn(configGroup);
        R<Long> result = groupController.saveGroup(req, user);
        Assert.assertEquals(GROUP_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        configGroup.setDeleted(Deleted.OK.getValue());
        result = groupController.saveGroup(req, user);
        Assert.assertEquals(PRIV_MIS_STATUS.intValue(), result.getStatus());

        when(environmentUserService.checkAuth(anyLong(), anyLong(), anyLong(), any())).thenReturn(true);
        result = groupController.saveGroup(req, user);
        Assert.assertEquals(OK, result.getStatus());
    }

    @Test
    public void testSaveGroupForInsert() throws Exception {
        ConfigGroupReq req = new ConfigGroupReq();
        req.setId(null);
        R<Long> result = groupController.saveGroup(req, user);
        Assert.assertEquals(VERSION_ID_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        req.setVersionId(ID);
        result = groupController.saveGroup(req, user);
        Assert.assertEquals(GROUP_NAME_NOT_EXISTS_STATUS.intValue(), result.getStatus());
        req.setName("group");

        Version version = new Version();
        version.setId(ID);
        version.setEnvironmentId(ID);
        version.setProjectId(ID);
        version.setProductId(ID);
        version.setDeleted(Deleted.DELETE.getValue());
        when(versionService.selectByPrimaryKey(any(), anyVararg())).thenReturn(version);
        result = groupController.saveGroup(req, user);
        Assert.assertEquals(VERSION_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        version.setDeleted(Deleted.OK.getValue());
        result = groupController.saveGroup(req, user);
        Assert.assertEquals(PRIV_MIS_STATUS.intValue(), result.getStatus());

        when(environmentUserService.checkAuth(anyLong(), anyLong(), anyLong(), any())).thenReturn(true);
        result = groupController.saveGroup(req, user);
        Assert.assertEquals(OK, result.getStatus());
    }

    @Test
    public void testDeleteGroup() throws Exception {
        R<Integer> result = groupController.deleteGroup(ID, null);
        Assert.assertEquals(NON_LOGIN_STATUS, result.getStatus());

        result = groupController.deleteGroup(null, user);
        Assert.assertEquals(GROUP_ID_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        ConfigGroup configGroup = new ConfigGroup();
        configGroup.setId(ID);
        configGroup.setEnvironmentId(ID);
        configGroup.setProjectId(ID);
        configGroup.setProductId(ID);
        configGroup.setDeleted(Deleted.DELETE.getValue());
        when(groupService.selectByPrimaryKey(any(), anyVararg())).thenReturn(configGroup);
        result = groupController.deleteGroup(ID, user);
        Assert.assertEquals(GROUP_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        configGroup.setDeleted(Deleted.OK.getValue());
        result = groupController.deleteGroup(ID, user);
        Assert.assertEquals(PRIV_MIS_STATUS.intValue(), result.getStatus());

        when(environmentUserService.checkAuth(anyLong(), anyLong(), anyLong(), any())).thenReturn(true);
        result = groupController.deleteGroup(ID, user);
        Assert.assertEquals(OK, result.getStatus());
    }

    @Test
    public void testPagination() throws Exception {
        R<Pagination<ConfigGroupVo>> result = groupController.pagination("id", "desc", 0L, 0, 20, user);
        Assert.assertEquals(VERSION_ID_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        Version version = new Version();
        version.setId(ID);
        version.setEnvironmentId(ID);
        version.setProjectId(ID);
        version.setProductId(ID);
        version.setDeleted(Deleted.DELETE.getValue());
        when(versionService.selectByPrimaryKey(any(), anyVararg())).thenReturn(version);
        result = groupController.pagination("id", "desc", ID, 0, 20, user);
        Assert.assertEquals(VERSION_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        version.setDeleted(Deleted.OK.getValue());
        result = groupController.pagination("id", "desc", ID, 0, 20, user);
        Assert.assertEquals(OK, result.getStatus());
    }
    
}
