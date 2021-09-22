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

import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.GRAY_RULE_NOT_SET_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.GRAY_VERSION_ID_NOT_EXIST_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.GRAY_VERSION_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.GRAY_VERSION_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.MAIN_VERSION_ID_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.NON_LOGIN_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PRIV_MIS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_CHANGE_LOG_END_TIME_EMPTY_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_CHANGE_LOG_START_TIME_EMPTY_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_COPY_DEST_VERSION_ID_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_COPY_SRC_DEST_VERSION_ID_DUPLICATE_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_COPY_SRC_VERSION_ID_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_DEST_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_ID_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_SRC_NOT_EXISTS_STATUS;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.anyVararg;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.baidu.brcc.domain.GrayInfo;
import com.baidu.brcc.domain.GrayRule;
import com.baidu.brcc.domain.em.Deleted;
import com.baidu.brcc.domain.em.GrayFlag;
import com.baidu.brcc.domain.vo.GrayAddReq;
import com.baidu.brcc.domain.vo.GrayRuleReq;
import com.baidu.brcc.domain.vo.GrayRuleVo;
import com.baidu.brcc.domain.vo.GrayVersionRuleVo;
import com.baidu.brcc.service.GrayInfoService;
import com.baidu.brcc.service.GrayRuleService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.baidu.brcc.domain.ConfigChangeLogWithBLOBs;
import com.baidu.brcc.domain.ConfigItem;
import com.baidu.brcc.domain.Environment;
import com.baidu.brcc.domain.TreeNode;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.Version;
import com.baidu.brcc.domain.base.Pagination;
import com.baidu.brcc.domain.base.R;
import com.baidu.brcc.domain.exception.BizException;
import com.baidu.brcc.domain.vo.VersionNodeVo;
import com.baidu.brcc.domain.vo.VersionReq;
import com.baidu.brcc.domain.vo.VersionVo;
import com.baidu.brcc.dto.CopyVersionDto;
import com.baidu.brcc.service.ConfigChangeLogService;
import com.baidu.brcc.service.ConfigItemService;
import com.baidu.brcc.service.EnvironmentService;
import com.baidu.brcc.service.EnvironmentUserService;
import com.baidu.brcc.service.ProjectUserService;
import com.baidu.brcc.service.RccCache;
import com.baidu.brcc.service.VersionService;

public class VersionControllerTest {
    private static final Long ID = 1L;
    private static final int OK = 0;
    private User user = null;

    @Mock
    VersionService versionService;
    @Mock
    EnvironmentService environmentService;
    @Mock
    EnvironmentUserService environmentUserService;
    @Mock
    ProjectUserService projectUserService;
    @Mock
    ConfigChangeLogService configChangeLogService;
    @Mock
    RccCache rccCache;
    @Mock
    ConfigItemService configItemService;
    @InjectMocks
    VersionController versionController;
    @Mock
    GrayRuleService grayRuleService;
    @Mock
    GrayInfoService grayInfoService;

    @Before
    public void setUp() {
        user = new User();
        user.setId(ID);
        user.setName("test-user");
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSaveVersionNoLogin() throws Exception {
        R<Long> result = versionController.saveVersion(new VersionReq(), null);
        Assert.assertEquals(NON_LOGIN_STATUS, result.getStatus());
    }

    @Test
    public void testSaveVersionForUpdate() throws Exception {
        VersionReq req = new VersionReq();
        req.setId(ID);
        when(versionService.selectByPrimaryKey(any())).thenReturn(mock(Version.class));
        R<Long> result = versionController.saveVersion(req, user);
        Assert.assertEquals(OK, result.getStatus());
    }

    @Test(expected = BizException.class)
    public void testSaveVersionForUpdateException() throws Exception {
        VersionReq req = new VersionReq();
        req.setId(ID);
        versionController.saveVersion(req, user);
    }

    @Test
    public void testSaveVersionForInsert() throws Exception {
        VersionReq req = new VersionReq();
        versionController.saveVersion(req, user);
    }

    @Test
    public void testDeleteVersion() throws Exception {
        R result = versionController.deleteVersion(ID, null);
        Assert.assertEquals(NON_LOGIN_STATUS, result.getStatus());

        result = versionController.deleteVersion(0L, user);
        Assert.assertEquals(VERSION_ID_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        result = versionController.deleteVersion(ID, user);
        Assert.assertEquals(VERSION_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        Version version = new Version();
        version.setProductId(ID);
        version.setProjectId(ID);
        when(versionService.selectByPrimaryKey(any())).thenReturn(version);
        result = versionController.deleteVersion(ID, user);
        Assert.assertEquals(PRIV_MIS_STATUS.intValue(), result.getStatus());

        version.setGrayFlag(GrayFlag.NOT.getValue());
        when(versionService.selectByPrimaryKey(any())).thenReturn(version);
        when(projectUserService.checkAuth(any(), any(), any())).thenReturn(true);
        result = versionController.deleteVersion(ID, user);
        Assert.assertEquals(OK, result.getStatus());
    }

    @Test
    public void testPagination() throws Exception {
        R<Pagination<VersionVo>> result = versionController.pagination("id", "desc", ID, 0, 20, null);
        Assert.assertEquals(NON_LOGIN_STATUS, result.getStatus());

        result = versionController.pagination("id", "desc", 0L, 0, 20, user);
        Assert.assertEquals(VERSION_ID_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        result = versionController.pagination("id", "desc", ID, 0, 20, user);
        Assert.assertEquals(ENVIRONMENT_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        Environment environment = new Environment();
        when(environmentService.selectByPrimaryKey(any())).thenReturn(environment);
        result = versionController.pagination("id", "desc", ID, 0, 20, user);
        Assert.assertEquals(OK, result.getStatus());
    }

    @Test
    public void testMyVersion() throws Exception {
        R<List<VersionNodeVo>> result = versionController.myVersion(user, ID, ID);
        Assert.assertEquals(OK, result.getStatus());
    }

    @Test
    public void testMyVersionTree() throws Exception {
        R<List<TreeNode>> result = versionController.myVersionTree(user, ID, ID);
        Assert.assertEquals(0, result.getData().size());

        List<VersionNodeVo> versionNodeVos = new ArrayList<>();
        VersionNodeVo vo = new VersionNodeVo();
        versionNodeVos.add(vo);
        when(versionService.myAllVersion(user, ID, ID)).thenReturn(versionNodeVos);
        result = versionController.myVersionTree(user, ID, ID);
        Assert.assertEquals(OK, result.getStatus());
    }

    @Test
    public void testPushChange() throws Exception {
        R result = versionController.pushChange(ID, user);
        Assert.assertEquals(VERSION_NOT_EXISTS_STATUS.intValue(), result.getStatus());
        Version version = new Version();
        version.setEnvironmentId(ID);
        version.setProjectId(ID);
        version.setProductId(ID);
        when(versionService.selectByPrimaryKey(any())).thenReturn(version);
        result = versionController.pushChange(ID, user);
        Assert.assertEquals(PRIV_MIS_STATUS.intValue(), result.getStatus());
        when(environmentUserService.checkAuth(ID, ID, ID, user)).thenReturn(true);
        result = versionController.pushChange(ID, user);
        Assert.assertEquals(OK, result.getStatus());
    }

    @Test
    public void testGetChangeLogs() throws Exception {
        Long startDate = -1L;
        Long endDate = -1L;
        R<Pagination<ConfigChangeLogWithBLOBs>> result =
                versionController.getChangeLogs(ID, startDate, endDate, 0, 20, new User());
        Assert.assertEquals(VERSION_CHANGE_LOG_START_TIME_EMPTY_STATUS.intValue(), result.getStatus());

        startDate = 1L;
        result = versionController.getChangeLogs(ID, startDate, endDate, 0, 20, new User());
        Assert.assertEquals(VERSION_CHANGE_LOG_END_TIME_EMPTY_STATUS.intValue(), result.getStatus());

        endDate = 2L;
        result = versionController.getChangeLogs(ID, startDate, endDate, 0, 20, new User());
        Assert.assertEquals(VERSION_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        Version version = new Version();
        version.setEnvironmentId(ID);
        version.setProjectId(ID);
        version.setProductId(ID);
        when(versionService.selectByPrimaryKey(ID)).thenReturn(version);
        result = versionController.getChangeLogs(ID, startDate, endDate, 0, 20, new User());
        Assert.assertEquals(PRIV_MIS_STATUS.intValue(), result.getStatus());

        when(environmentUserService.checkAuth(any(), any(), any(), any())).thenReturn(true);
        result = versionController.getChangeLogs(ID, startDate, endDate, 0, 20, new User());
        Assert.assertEquals(OK, result.getStatus());

    }

    @Test
    public void testCopyConfigItemsByVersionId() throws Exception {
        CopyVersionDto dto = new CopyVersionDto();
        R<List<ConfigItem>> result = versionController.copyConfigItemsByVersionId(dto, user);
        Assert.assertEquals(VERSION_COPY_SRC_VERSION_ID_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        dto.setSrcVersionId(ID);
        result = versionController.copyConfigItemsByVersionId(dto, user);
        Assert.assertEquals(VERSION_COPY_DEST_VERSION_ID_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        dto.setDestVersionId(ID);
        result = versionController.copyConfigItemsByVersionId(dto, user);
        Assert.assertEquals(VERSION_COPY_SRC_DEST_VERSION_ID_DUPLICATE_STATUS.intValue(), result.getStatus());

        dto.setDestVersionId(2L);
        result = versionController.copyConfigItemsByVersionId(dto, user);
        Assert.assertEquals(VERSION_SRC_NOT_EXISTS_STATUS.intValue(), result.getStatus());
        List<Long> ids = new ArrayList<>();;
        ids.add(ID);
        ids.add(2L);

        Map<Long, Version> versionMap = new HashMap<>();
        versionMap.put(ID, mock(Version.class));
        when(versionService.selectMapByPrimaryKeys(anyList(), anyVararg())).thenReturn(versionMap);
        result = versionController.copyConfigItemsByVersionId(dto, user);
        Assert.assertEquals(VERSION_DEST_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        versionMap.put(2L, mock(Version.class));
        result = versionController.copyConfigItemsByVersionId(dto, user);
        Assert.assertEquals(PRIV_MIS_STATUS.intValue(), result.getStatus());

        when(versionService.checkAuth(any(), any(), any())).thenReturn(true);
        result = versionController.copyConfigItemsByVersionId(dto, user);
        Assert.assertEquals(OK, result.getStatus());
    }

    @Test
    public void testSaveGrayVersion() {
        VersionReq versionReq = new VersionReq();
        R<Long> result = versionController.saveGrayVersion(versionReq, null);
        Assert.assertEquals(NON_LOGIN_STATUS, result.getStatus());

        result = versionController.saveGrayVersion(versionReq, user);
        Assert.assertEquals(MAIN_VERSION_ID_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        versionReq.setId(1L);
        when(versionService.selectByPrimaryKey(anyLong())).thenReturn(null);
        result = versionController.saveGrayVersion(versionReq, user);
        Assert.assertEquals(VERSION_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        versionReq.setGrayVersionId(1L);
        when(versionService.selectByPrimaryKey(anyLong())).thenReturn(new Version());
        when(versionService.selectByPrimaryKey(anyLong())).thenReturn(null);
        result = versionController.saveGrayVersion(versionReq, user);
        Assert.assertEquals(VERSION_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        Version version = new Version();
        version.setMainVersionId(1L);
        when(versionService.selectByPrimaryKey(anyLong())).thenReturn(new Version());
        when(versionService.selectByPrimaryKey(anyLong())).thenReturn(version);
        result = versionController.saveGrayVersion(versionReq, user);
        Assert.assertEquals(0, result.getStatus());
    }

    @Test
    public void testDeleteGrayVersion() {
        VersionReq versionReq = new VersionReq();
        R result = versionController.deleteGrayVersion(ID, null);
        Assert.assertEquals(NON_LOGIN_STATUS, result.getStatus());

        result = versionController.deleteGrayVersion(null, user);
        Assert.assertEquals(GRAY_VERSION_ID_NOT_EXIST_STATUS.intValue(), result.getStatus());

        when(versionService.selectByPrimaryKey(ID)).thenReturn(null);
        result = versionController.deleteGrayVersion(ID, user);
        Assert.assertEquals(VERSION_NOT_EXISTS_STATUS.intValue(), result.getStatus());
    }

    @Test
    public void testSaveGrayRule() {
        GrayAddReq grayAddReq = new GrayAddReq();
        R<List<GrayRuleVo>> result = versionController.saveGrayRule(grayAddReq, null);
        Assert.assertEquals(NON_LOGIN_STATUS, result.getStatus());

        result = versionController.saveGrayRule(grayAddReq, user);
        Assert.assertEquals(GRAY_VERSION_ID_NOT_EXIST_STATUS.intValue(), result.getStatus());

        grayAddReq.setGrayVersionId(ID);
        when(versionService.selectByPrimaryKey(ID)).thenReturn(new Version());
        result = versionController.saveGrayRule(grayAddReq, user);
        Assert.assertEquals(GRAY_RULE_NOT_SET_STATUS.intValue(), result.getStatus());

        List<GrayRuleReq> grayRuleReqs = new ArrayList<>();
        grayAddReq.setGrayRuleReqs(grayRuleReqs);
        when(versionService.selectByPrimaryKey(ID)).thenReturn(new Version());
        result = versionController.saveGrayRule(grayAddReq, user);
        Assert.assertEquals(GRAY_RULE_NOT_SET_STATUS.intValue(), result.getStatus());
    }

    @Test
    public void testListGrayRules() {
        R<List<GrayVersionRuleVo>> result = versionController.listGrayRules(ID, null);
        Assert.assertEquals(NON_LOGIN_STATUS, result.getStatus());

        result = versionController.listGrayRules(null, user);
        Assert.assertEquals(GRAY_VERSION_ID_NOT_EXIST_STATUS.intValue(), result.getStatus());

        when(versionService.selectByPrimaryKey(ID)).thenReturn(null);
        result = versionController.listGrayRules(ID, user);
        Assert.assertEquals(GRAY_VERSION_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        when(versionService.selectByPrimaryKey(ID)).thenReturn(new Version());
        List<GrayRule> grayRules = new ArrayList<>();
        when(grayRuleService.selectByGrayVersionId(ID)).thenReturn(grayRules);
        List<Long> ids = new ArrayList<>();
        List<GrayInfo> grayInfos = new ArrayList<>();
        when(grayInfoService.selectByIds(ids)).thenReturn(grayInfos);
        result = versionController.listGrayRules(ID, user);
        Assert.assertEquals(OK, result.getStatus());
    }
}
