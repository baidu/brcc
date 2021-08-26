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

import static com.baidu.brcc.common.ErrorStatusMsg.CONFIG_ITEM_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.CONFIG_ITEM_ID_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.CONFIG_ITEM_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.CONFIG_KEY_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.CONFIG_KEY_VALUE_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_ID_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.NON_LOGIN_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PRIV_MIS_STATUS;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyLong;
import static org.mockito.Mockito.anyVararg;
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

import com.baidu.brcc.domain.ConfigGroup;
import com.baidu.brcc.domain.ConfigItem;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.base.Pagination;
import com.baidu.brcc.domain.base.R;
import com.baidu.brcc.domain.vo.BatchConfigItemReq;
import com.baidu.brcc.domain.vo.ConfigItemForGroupVo;
import com.baidu.brcc.domain.vo.ConfigItemReq;
import com.baidu.brcc.domain.vo.ConfigItemVo;
import com.baidu.brcc.domain.vo.ItemReq;
import com.baidu.brcc.service.ConfigChangeLogService;
import com.baidu.brcc.service.ConfigGroupService;
import com.baidu.brcc.service.ConfigItemService;
import com.baidu.brcc.service.EnvironmentService;
import com.baidu.brcc.service.EnvironmentUserService;
import com.baidu.brcc.service.ProductService;
import com.baidu.brcc.service.ProductUserService;
import com.baidu.brcc.service.ProjectService;
import com.baidu.brcc.service.ProjectUserService;
import com.baidu.brcc.service.RccCache;
import com.baidu.brcc.service.VersionService;

public class ConfigItemControllerTest {

    private static final Long ID = 1L;
    private static final int OK = 0;

    @Mock
    Logger LOGGER;
    @Mock
    ConfigItemService configItemService;
    @Mock
    EnvironmentUserService environmentUserService;
    @Mock
    ConfigGroupService groupService;
    @Mock
    ProjectService projectService;
    @Mock
    EnvironmentService environmentService;
    @Mock
    VersionService versionService;
    @Mock
    ConfigGroupService configGroupService;
    @Mock
    ProductService productService;
    @Mock
    ConfigChangeLogService configChangeLogService;
    @Mock
    RccCache rccCache;
    @Mock
    ProductUserService productUserService;
    @Mock
    ProjectUserService projectUserService;
    @InjectMocks
    ConfigItemController configItemController;

    private User user = null;

    @Before
    public void setUp() {
        user = new User();
        user.setId(ID);
        user.setName("test-user");
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSaveItemNoLogin() throws Exception {
        R<Long> result = configItemController.saveItem(new ConfigItemReq(), null);
        Assert.assertEquals(NON_LOGIN_STATUS, result.getStatus());
    }

    @Test
    public void testSaveItemForUpdate() throws Exception {
        ConfigItemReq req = new ConfigItemReq();
        req.setId(ID);
        req.setName("key");
        req.setVal("value");
        req.setGroupId(ID);

        // 更新数据不存在
        R<Long> result = configItemController.saveItem(req, user);
        Assert.assertEquals(CONFIG_ITEM_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        // 无权限修改
        ConfigItem item = new ConfigItem();
        item.setId(ID);
        item.setName("key");
        item.setVal("v1");
        item.setProductId(ID);
        item.setProjectId(ID);
        item.setEnvironmentId(ID);
        item.setVersionId(ID);
        item.setGroupId(ID);
        when(configItemService.selectByPrimaryKey(any(), anyVararg())).thenReturn(item);
        result = configItemController.saveItem(req, user);
        Assert.assertEquals(PRIV_MIS_STATUS.intValue(), result.getStatus());

        // 存在
        Map<String, String> map = new HashMap<>();
        map.put("key", "v2");
        when(configItemService.findConfigItemsByGroupId(anyLong())).thenReturn(map);
        when(environmentUserService.checkAuth(anyLong(), anyLong(), anyLong(), any())).thenReturn(true);
        result = configItemController.saveItem(req, user);
        Assert.assertEquals(OK, result.getStatus());

        //
        when(configItemService.selectOneByExample(any(), anyVararg())).thenReturn(new ConfigItem());
        result = configItemController.saveItem(req, user);
        Assert.assertEquals(CONFIG_ITEM_EXISTS_STATUS.intValue(), result.getStatus());

    }

    @Test
    public void testSaveItemForInsert() throws Exception {
        ConfigItemReq req = new ConfigItemReq();
        req.setId(null);
        req.setName("");
        req.setVal("value");
        req.setGroupId(null);
        // 更新数据不存在
        R<Long> result = configItemController.saveItem(req, user);
        Assert.assertEquals(GROUP_ID_NOT_EXISTS_STATUS.intValue(), result.getStatus());
        req.setGroupId(ID);
        result = configItemController.saveItem(req, user);
        Assert.assertEquals(CONFIG_KEY_NOT_EXISTS_STATUS.intValue(), result.getStatus());
        req.setName("key");
        // 更新数据不存在
        result = configItemController.saveItem(req, user);
        Assert.assertEquals(GROUP_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        // 无权限修改
        ConfigItem item = new ConfigItem();
        item.setId(ID);
        item.setName("key");
        item.setVal("v1");
        item.setProductId(ID);
        item.setProjectId(ID);
        item.setEnvironmentId(ID);
        item.setVersionId(ID);
        item.setGroupId(ID);

        ConfigGroup group = new ConfigGroup();
        group.setProductId(ID);
        group.setProjectId(ID);
        group.setEnvironmentId(ID);
        group.setVersionId(ID);

        when(groupService.selectByPrimaryKey(any(), anyVararg())).thenReturn(group);
        result = configItemController.saveItem(req, user);
        Assert.assertEquals(PRIV_MIS_STATUS.intValue(), result.getStatus());

        // 存在
        Map<String, String> map = new HashMap<>();
        map.put("key", "v2");
        when(environmentUserService.checkAuth(anyLong(), anyLong(), anyLong(), any())).thenReturn(true);
        result = configItemController.saveItem(req, user);
        Assert.assertEquals(OK, result.getStatus());
    }

    @Test
    public void testBatchSaveItems() throws Exception {
        R<Integer> result = configItemController.batchSaveItems(new BatchConfigItemReq(), user);
        Assert.assertEquals(GROUP_ID_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        ItemReq itemReq = new ItemReq();
        itemReq.setName("key");
        itemReq.setVal("value");
        BatchConfigItemReq req = new BatchConfigItemReq();
        req.setGroupId(ID);
        req.setItems(Arrays.asList(itemReq));

        result = configItemController.batchSaveItems(req, user);
        Assert.assertEquals(GROUP_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        ConfigGroup group = new ConfigGroup();
        group.setProductId(ID);
        group.setProjectId(ID);
        group.setEnvironmentId(ID);
        group.setVersionId(ID);
        when(groupService.selectByPrimaryKey(any(), anyVararg())).thenReturn(group);
        result = configItemController.batchSaveItems(req, user);
        Assert.assertEquals(PRIV_MIS_STATUS.intValue(), result.getStatus());

        when(environmentUserService.checkAuth(anyLong(), anyLong(), anyLong(), any())).thenReturn(true);
        result = configItemController.batchSaveItems(req, user);
        Assert.assertEquals(OK, result.getStatus());
    }

    @Test
    public void testDelete() throws Exception {
        R result = configItemController.delete(ID, null);
        Assert.assertEquals(NON_LOGIN_STATUS, result.getStatus());

        result = configItemController.delete(0L, user);
        Assert.assertEquals(CONFIG_ITEM_ID_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        result = configItemController.delete(ID, user);
        Assert.assertEquals(CONFIG_ITEM_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        ConfigItem item = new ConfigItem();
        item.setId(ID);
        item.setName("key");
        item.setVal("v1");
        item.setProductId(ID);
        item.setProjectId(ID);
        item.setEnvironmentId(ID);
        item.setVersionId(ID);
        item.setGroupId(ID);
        when(configItemService.selectByPrimaryKey(any(), anyVararg())).thenReturn(item);
        result = configItemController.delete(ID, user);
        Assert.assertEquals(PRIV_MIS_STATUS.intValue(), result.getStatus());

        when(environmentUserService.checkAuth(anyLong(), anyLong(), anyLong(), any())).thenReturn(true);
        result = configItemController.delete(ID, user);
        Assert.assertEquals(OK, result.getStatus());
    }

    @Test
    public void testListByGroup() throws Exception {
        R<List<ConfigItemForGroupVo>> result = configItemController.listByGroup(0L, user);
        Assert.assertEquals(GROUP_ID_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        result = configItemController.listByGroup(ID, user);
        Assert.assertEquals(GROUP_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        ConfigGroup group = new ConfigGroup();
        group.setProductId(ID);
        group.setProjectId(ID);
        group.setEnvironmentId(ID);
        group.setVersionId(ID);
        when(groupService.selectByPrimaryKey(any())).thenReturn(group);

        when(configItemService.selectByExample(any(), any(), anyVararg())).thenReturn(Arrays.asList(new ConfigItem()));
        result = configItemController.listByGroup(ID, user);
        Assert.assertEquals(OK, result.getStatus());
    }

    @Test
    public void testQuery() throws Exception {
        R<Pagination<ConfigItemVo>> result = configItemController.query(ID, ID, null, null, 0, 20, user);
        Assert.assertEquals(CONFIG_KEY_VALUE_NOT_EXISTS_STATUS.intValue(), result.getStatus());
        result = configItemController.query(ID, ID, "key", null, 0, 20, user);
        Assert.assertEquals(OK, result.getStatus());
    }
}
