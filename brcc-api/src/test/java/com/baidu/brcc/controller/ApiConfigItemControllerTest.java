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

import static com.baidu.brcc.common.ErrorStatusMsg.CONFIG_ITEM_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.CONFIG_ITEM_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.CONFIG_ITEM_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.CONFIG_KEY_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.CONFIG_KEY_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.CONFIG_KEY_VALUE_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.CONFIG_KEY_VALUE_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_ID_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_ID_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_ID_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_ID_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_TOKEN_NOT_EMPTY_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_TOKEN_NOT_EMPTY_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_TOKEN_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_TOKEN_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_ID_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_ID_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_NAME_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_NAME_NOT_EXISTS_STATUS;
import static org.apache.commons.lang3.StringUtils.trim;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyLong;
import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.baidu.brcc.domain.ConfigGroup;
import com.baidu.brcc.domain.ConfigItem;
import com.baidu.brcc.domain.vo.APiItemAddReqVo;
import com.baidu.brcc.domain.vo.ApiItemDeleteVo;
import com.baidu.brcc.domain.vo.ApiItemEditVo;
import com.baidu.brcc.domain.vo.BatchEditItemVo;
import com.baidu.brcc.domain.vo.ItemReq;
import com.baidu.brcc.service.ConfigGroupService;
import com.baidu.brcc.utils.time.DateTimeUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.baidu.brcc.domain.ApiToken;
import com.baidu.brcc.domain.Project;
import com.baidu.brcc.domain.base.R;
import com.baidu.brcc.domain.vo.ApiBatchItemReqVo;
import com.baidu.brcc.domain.vo.ApiItemVo;
import com.baidu.brcc.service.ApiTokenCacheService;
import com.baidu.brcc.service.ConfigItemService;
import com.baidu.brcc.service.RccCache;

public class ApiConfigItemControllerTest {
    @Mock
    ApiTokenCacheService apiTokenCacheService;
    @Mock
    ConfigItemService configItemService;
    @Mock
    RccCache rccCache;
    @Mock
    ConfigGroupService groupService;
    @InjectMocks
    ApiConfigItemController apiConfigItemController;

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
    public void testGetItem() throws Exception {
        when(configItemService.getByVersionIdAndName(anyLong(), anyLong(), anyString())).thenReturn(new ApiItemVo());

        R<ApiItemVo> result = apiConfigItemController.getItem("token", Long.valueOf(1), "name");
        Assert.assertEquals(0, result.getStatus());
    }

    @Test
    public void testGetAllItem() throws Exception {
        when(apiTokenCacheService.getApiToken(anyString())).thenReturn(new ApiToken());
        when(configItemService.getAllByVersionIdInCache(any(), any()))
                .thenReturn(Arrays.<ApiItemVo>asList(new ApiItemVo()));

        R<List<ApiItemVo>> result = apiConfigItemController.getAllItem("token", Long.valueOf(1));
        Assert.assertEquals(0, result.getStatus());
    }

    @Test
    public void testGetBatchItem() throws Exception {
        when(apiTokenCacheService.getApiToken(anyString())).thenReturn(new ApiToken());
        when(configItemService.getItemsByVersionIdAndNamesInCache(any(), any(), any())).thenReturn(
                Arrays.<ApiItemVo>asList(new ApiItemVo()));

        ApiBatchItemReqVo apiBatchItemReqVo = new ApiBatchItemReqVo();

        apiBatchItemReqVo.setVersionId(1L);

        R<List<ApiItemVo>> result = apiConfigItemController.getBatchItem("token", apiBatchItemReqVo);
        Assert.assertEquals(0, result.getStatus());
    }

    @Test
    public void testAddItem() {
        R<Long> result = apiConfigItemController.addItem(null, null);
        Assert.assertEquals(PROJECT_API_TOKEN_NOT_EMPTY_STATUS.intValue(), result.getStatus());

        String token = "token";
        APiItemAddReqVo apiItemAddReqVo = new APiItemAddReqVo();
        result = apiConfigItemController.addItem(token, apiItemAddReqVo);
        Assert.assertEquals(VERSION_ID_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        apiItemAddReqVo.setVersionId(1L);
        when(apiTokenCacheService.getApiToken(token)).thenReturn(null);
        result = apiConfigItemController.addItem(token, apiItemAddReqVo);
        Assert.assertEquals(PROJECT_API_TOKEN_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        ApiToken apiToken = new ApiToken();
        when(apiTokenCacheService.getApiToken(token)).thenReturn(apiToken);
        result = apiConfigItemController.addItem(token, apiItemAddReqVo);
        Assert.assertEquals(GROUP_ID_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        apiItemAddReqVo.setGroupId(1L);
        when(apiTokenCacheService.getApiToken(token)).thenReturn(apiToken);
        result = apiConfigItemController.addItem(token, apiItemAddReqVo);
        Assert.assertEquals(CONFIG_KEY_VALUE_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        apiItemAddReqVo.setValue("a");
        when(apiTokenCacheService.getApiToken(token)).thenReturn(apiToken);
        result = apiConfigItemController.addItem(token, apiItemAddReqVo);
        Assert.assertEquals(CONFIG_KEY_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        apiItemAddReqVo.setKey("a");
        when(apiTokenCacheService.getApiToken(token)).thenReturn(apiToken);
        when(configItemService.getByVersionIdAndName(1L, 1L, "a")).thenReturn(null);
        when(groupService.selectByPrimaryKey(1L)).thenReturn(null);
        result = apiConfigItemController.addItem(token, apiItemAddReqVo);
        Assert.assertEquals(GROUP_NOT_EXISTS_STATUS.intValue(), result.getStatus());
    }

    @Test
    public void testBatchSaveItems() {
        R<Integer> result = apiConfigItemController.batchSaveItems(null, null);
        Assert.assertEquals(PROJECT_API_TOKEN_NOT_EMPTY_STATUS.intValue(), result.getStatus());

        String token = "token";
        BatchEditItemVo batchEditItemVo = new BatchEditItemVo();
        result = apiConfigItemController.batchSaveItems(token, batchEditItemVo);
        Assert.assertEquals(VERSION_ID_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        batchEditItemVo.setVersionId(1L);
        when(apiTokenCacheService.getApiToken(token)).thenReturn(null);
        result = apiConfigItemController.batchSaveItems(token, batchEditItemVo);
        Assert.assertEquals(PROJECT_API_TOKEN_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        ApiToken apiToken = new ApiToken();
        when(apiTokenCacheService.getApiToken(token)).thenReturn(apiToken);
        result = apiConfigItemController.batchSaveItems(token, batchEditItemVo);
        Assert.assertEquals(GROUP_ID_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        batchEditItemVo.setGroupId(1L);
        when(apiTokenCacheService.getApiToken(token)).thenReturn(apiToken);
        when(groupService.selectByPrimaryKey(1L)).thenReturn(new ConfigGroup());
        result = apiConfigItemController.batchSaveItems(token, batchEditItemVo);
        Assert.assertEquals(0, result.getStatus());
    }

    @Test
    public void testDeleteItem() {
        R result = apiConfigItemController.deleteItem(null, null);
        Assert.assertEquals(PROJECT_API_TOKEN_NOT_EMPTY_STATUS.intValue(), result.getStatus());

        String token = "token";
        ApiItemDeleteVo apiItemDeleteVo = new ApiItemDeleteVo();
        result = apiConfigItemController.deleteItem(token, apiItemDeleteVo);
        Assert.assertEquals(VERSION_ID_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        apiItemDeleteVo.setVersionId(1L);
        when(apiTokenCacheService.getApiToken(token)).thenReturn(null);
        result = apiConfigItemController.deleteItem(token, apiItemDeleteVo);
        Assert.assertEquals(PROJECT_API_TOKEN_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        ApiToken apiToken = new ApiToken();
        when(apiTokenCacheService.getApiToken(token)).thenReturn(apiToken);
        result = apiConfigItemController.deleteItem(token, apiItemDeleteVo);
        Assert.assertEquals(CONFIG_KEY_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        apiItemDeleteVo.setKey("key");
        when(configItemService.selectByProjectIdAndVersionIdAndName(1L, 1L, "a")).thenReturn(null);
        result = apiConfigItemController.deleteItem(token, apiItemDeleteVo);
        Assert.assertEquals(CONFIG_ITEM_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        when(configItemService.selectByProjectIdAndVersionIdAndName(1L, 1L, "a")).thenReturn(new ConfigItem());
        Map<String, String> oldConfigMap = new HashMap<>();
        when(configItemService.findConfigItemsByGroupId(1L)).thenReturn(oldConfigMap);
        when(configItemService.updateByPrimaryKeySelective(ConfigItem.newBuilder().build())).thenReturn(1);
        result = apiConfigItemController.deleteItem(token, apiItemDeleteVo);
        Assert.assertEquals(CONFIG_ITEM_NOT_EXISTS_STATUS.intValue(), result.getStatus());
    }

    @Test
    public void testEditItem() {
        R result = apiConfigItemController.EditItem(null, null);
        Assert.assertEquals(PROJECT_API_TOKEN_NOT_EMPTY_STATUS.intValue(), result.getStatus());

        String token = "token";
        ApiItemEditVo apiItemEditVo = new ApiItemEditVo();
        result = apiConfigItemController.EditItem(token, apiItemEditVo);
        Assert.assertEquals(VERSION_ID_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        apiItemEditVo.setVersionId(1L);
        when(apiTokenCacheService.getApiToken(token)).thenReturn(null);
        result = apiConfigItemController.EditItem(token, apiItemEditVo);
        Assert.assertEquals(PROJECT_API_TOKEN_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        ApiToken apiToken = new ApiToken();
        when(apiTokenCacheService.getApiToken(token)).thenReturn(apiToken);
        result = apiConfigItemController.EditItem(token, apiItemEditVo);
        Assert.assertEquals(CONFIG_KEY_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        apiItemEditVo.setKey("a");
        when(configItemService.selectByProjectIdAndVersionIdAndName(1L, 1L, "a")).thenReturn(null);
        result = apiConfigItemController.EditItem(token, apiItemEditVo);
        Assert.assertEquals(CONFIG_ITEM_NOT_EXISTS_STATUS.intValue(), result.getStatus());
    }

}
