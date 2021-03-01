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

import static com.baidu.brcc.common.ErrorStatusMsg.CONFIG_ITEM_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.CONFIG_ITEM_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.CONFIG_KEY_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.CONFIG_KEY_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_TOKEN_NOT_EMPTY_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_TOKEN_NOT_EMPTY_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_TOKEN_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_TOKEN_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_ID_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_ID_NOT_EXISTS_STATUS;
import static org.apache.commons.lang3.StringUtils.isBlank;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baidu.brcc.domain.ApiToken;
import com.baidu.brcc.domain.base.R;
import com.baidu.brcc.domain.vo.ApiBatchItemReqVo;
import com.baidu.brcc.domain.vo.ApiItemVo;
import com.baidu.brcc.service.ApiTokenCacheService;
import com.baidu.brcc.service.ConfigItemService;
import com.baidu.brcc.service.RccCache;

/**
 * open api 配置项相关接口
 */
@RestController
@RequestMapping("api")
public class ApiConfigItemController {

    @Autowired
    ApiTokenCacheService apiTokenCacheService;

    @Autowired
    private ConfigItemService configItemService;

    @Autowired
    private RccCache rccCache;

    /**
     * 根据配置名称获取指定配置项
     * @param token api token
     * @param versionId 版本ID
     * @param name 配置名称
     * @return
     */
    @GetMapping("item/{key}")
    public R<ApiItemVo> getItem(
            String token,
            Long versionId,
            @PathVariable("key") String name
    ) {
        if (isBlank(token)) {
            return R.error(PROJECT_API_TOKEN_NOT_EMPTY_STATUS, PROJECT_API_TOKEN_NOT_EMPTY_MSG);
        }
        if (versionId == null || versionId <= 0) {
            return R.error(VERSION_ID_NOT_EXISTS_STATUS, VERSION_ID_NOT_EXISTS_MSG);
        }
        if (isBlank(name)) {
            return R.error(CONFIG_KEY_NOT_EXISTS_STATUS, CONFIG_KEY_NOT_EXISTS_MSG);
        }
        ApiToken apiToken = apiTokenCacheService.getApiToken(token);
        if (apiToken == null) {
            return R.error(PROJECT_API_TOKEN_NOT_EXISTS_STATUS, PROJECT_API_TOKEN_NOT_EXISTS_MSG);
        }
        ApiItemVo itemVo = configItemService.getByVersionIdAndName(apiToken.getProjectId(), versionId, name);
        if (itemVo == null) {
            return R.error(CONFIG_ITEM_NOT_EXISTS_STATUS, CONFIG_ITEM_NOT_EXISTS_MSG);
        }

        return R.ok(itemVo);
    }

    /**
     * 获取所有配置项
     * @param token api token
     * @param versionId 版本ID
     * @return
     */
    @GetMapping("item")
    public R<List<ApiItemVo>> getAllItem(String token, Long versionId) {
        if (isBlank(token)) {
            return R.error(PROJECT_API_TOKEN_NOT_EMPTY_STATUS, PROJECT_API_TOKEN_NOT_EMPTY_MSG);
        }
        if (versionId == null || versionId <= 0) {
            return R.error(VERSION_ID_NOT_EXISTS_STATUS, VERSION_ID_NOT_EXISTS_MSG);
        }
        ApiToken apiToken = apiTokenCacheService.getApiToken(token);
        if (apiToken == null) {
            return R.error(PROJECT_API_TOKEN_NOT_EXISTS_STATUS, PROJECT_API_TOKEN_NOT_EXISTS_MSG);
        }
        List<ApiItemVo> itemsVos = configItemService.getAllByVersionIdInCache(apiToken.getProjectId(), versionId);

        if (CollectionUtils.isEmpty(itemsVos)) {
            return R.ok(new ArrayList<>(0));
        }
        return R.ok(itemsVos);
    }

    /**
     * 批量获取指定配置项
     * @param token api token
     * @param reqVo
     *  reqVo.versionId 版本ID
     *  reqVo.keys 配置KEY列表，如果为空则获取版本下的所有配置项
     * @return
     */
    @PostMapping("batchItem")
    public R<List<ApiItemVo>> getBatchItem(String token, @RequestBody ApiBatchItemReqVo reqVo) {
        if (isBlank(token)) {
            return R.error(PROJECT_API_TOKEN_NOT_EMPTY_STATUS, PROJECT_API_TOKEN_NOT_EMPTY_MSG);
        }
        Long versionId = reqVo.getVersionId();
        if (versionId == null || versionId <= 0) {
            return R.error(VERSION_ID_NOT_EXISTS_STATUS, VERSION_ID_NOT_EXISTS_MSG);
        }
        ApiToken apiToken = apiTokenCacheService.getApiToken(token);
        if (apiToken == null) {
            return R.error(PROJECT_API_TOKEN_NOT_EXISTS_STATUS, PROJECT_API_TOKEN_NOT_EXISTS_MSG);
        }
        List<ApiItemVo> result = configItemService.getItemsByVersionIdAndNamesInCache(apiToken.getProjectId(),
                versionId, reqVo.getKeys());
        if (CollectionUtils.isEmpty(result)) {
            return R.ok(new ArrayList<>(0));
        }
        return R.ok(result);
    }

}
