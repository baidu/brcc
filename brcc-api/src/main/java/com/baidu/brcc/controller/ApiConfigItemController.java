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
import static com.baidu.brcc.common.ErrorStatusMsg.CONFIG_ITEM_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.CONFIG_ITEM_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.CONFIG_KEY_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.CONFIG_KEY_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.CONFIG_KEY_VALUE_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.CONFIG_KEY_VALUE_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_ID_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_ID_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PRIV_MIS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PRIV_MIS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_TOKEN_NOT_EMPTY_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_TOKEN_NOT_EMPTY_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_TOKEN_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_TOKEN_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_ID_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_ID_NOT_EXISTS_STATUS;
import static org.apache.commons.lang3.StringUtils.isBlank;
import static org.apache.commons.lang3.StringUtils.isNotBlank;
import static org.apache.commons.lang3.StringUtils.trim;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.baidu.brcc.annotation.LoginUser;
import com.baidu.brcc.annotation.SaveLog;
import com.baidu.brcc.domain.ConfigGroup;
import com.baidu.brcc.domain.ConfigItem;
import com.baidu.brcc.domain.ConfigItemExample;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.em.Deleted;
import com.baidu.brcc.domain.meta.MetaConfigItem;
import com.baidu.brcc.domain.vo.APiItemAddReqVo;
import com.baidu.brcc.domain.vo.ApiItemDeleteVo;
import com.baidu.brcc.domain.vo.ApiItemEditVo;
import com.baidu.brcc.domain.vo.BatchConfigItemReq;
import com.baidu.brcc.domain.vo.BatchEditItemVo;
import com.baidu.brcc.domain.vo.ItemReq;
import com.baidu.brcc.service.ConfigChangeLogService;
import com.baidu.brcc.service.ConfigGroupService;
import com.baidu.brcc.service.EnvironmentUserService;
import com.baidu.brcc.service.UserService;
import com.baidu.brcc.utils.time.DateTimeUtils;
import org.apache.commons.lang3.StringUtils;
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

    @Autowired
    private UserService userService;

    @Autowired
    private EnvironmentUserService environmentUserService;

    @Autowired
    private ConfigChangeLogService configChangeLogService;

    @Autowired
    private ConfigGroupService groupService;

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

    /**
     * 增加配置
     */
    @SaveLog(scene = "增加配置",
            paramsIdxes = {1},
            params = {"itemAddReqVo"})
    @PostMapping("itemAdd")
    public R<Long> addItem(String apiToken, @RequestBody APiItemAddReqVo itemAddReqVo) {
        if (isBlank(apiToken)) {
            return R.error(PROJECT_API_TOKEN_NOT_EMPTY_STATUS, PROJECT_API_TOKEN_NOT_EMPTY_MSG);
        }
        Long versionId = itemAddReqVo.getVersionId();
        if (versionId == null || versionId <= 0) {
            return R.error(VERSION_ID_NOT_EXISTS_STATUS, VERSION_ID_NOT_EXISTS_MSG);
        }
        ApiToken tokenVo = apiTokenCacheService.getApiToken(apiToken);
        if (tokenVo == null) {
            return R.error(PROJECT_API_TOKEN_NOT_EXISTS_STATUS, PROJECT_API_TOKEN_NOT_EXISTS_MSG);
        }
        String key = itemAddReqVo.getKey();
        String value = itemAddReqVo.getValue();
        Date now = DateTimeUtils.now();
        Long groupId = itemAddReqVo.getGroupId();
        if (null == groupId || groupId <= 0) {
            return R.error(GROUP_ID_NOT_EXISTS_STATUS, GROUP_ID_NOT_EXISTS_MSG);
        }
        Long cacheEvictVersionId = null;
        if (key == null) {
            if (value == null) {
                return R.error(CONFIG_KEY_VALUE_NOT_EXISTS_STATUS, CONFIG_KEY_VALUE_NOT_EXISTS_MSG);
            } else {
                return R.error(CONFIG_KEY_NOT_EXISTS_STATUS, CONFIG_KEY_NOT_EXISTS_MSG);
            }
        }
        ApiItemVo itemVo = configItemService.getByVersionIdAndName(tokenVo.getProjectId(), versionId, key);
        Long id = null;
        if (itemVo == null) {
            //新增
            ConfigGroup configGroup = groupService.selectByPrimaryKey(groupId);
            if (configGroup == null || Deleted.DELETE.getValue().equals(configGroup.getDeleted())) {
                return R.error(GROUP_NOT_EXISTS_STATUS, GROUP_NOT_EXISTS_MSG);
            }
            ConfigItem configItem = configItemService.selectOneByExample(ConfigItemExample.newBuilder()
                            .build()
                            .createCriteria()
                            .andDeletedEqualTo(Deleted.OK.getValue())
                            .andGroupIdEqualTo(groupId)
                            .andNameEqualTo(key)
                            .toExample(),
                    MetaConfigItem.COLUMN_NAME_ID
            );
            if (configItem != null) {
                return R.error(CONFIG_ITEM_EXISTS_STATUS, CONFIG_ITEM_EXISTS_MSG);
            }

            ConfigItem insert = ConfigItem.newBuilder()
                    .createTime(now)
                    .updateTime(now)
                    .deleted(Deleted.OK.getValue())
                    .name(key)
                    .memo(trim(itemAddReqVo.getMemo()))
                    .groupId(groupId)
                    .versionId(configGroup.getVersionId())
                    .environmentId(configGroup.getEnvironmentId())
                    .projectId(configGroup.getProjectId())
                    .productId(configGroup.getProductId())
                    .val(trim(itemAddReqVo.getValue()))
                    .build();

            // 采集configChangeLog
            Map<String, String> oldConfigMap = configItemService.findConfigItemsByGroupId(groupId);

            configItemService.insertSelective(insert);

            // 保存更新日志
            Map<String, String> newConfigMap = new HashMap<>();
            if (!CollectionUtils.isEmpty(oldConfigMap)) {
                newConfigMap.putAll(oldConfigMap);
                newConfigMap.put(insert.getName(), insert.getVal());
            }
            configChangeLogService.saveLogWithBackground(null, "openApi_user", groupId,
                    oldConfigMap, newConfigMap, new Date());

            cacheEvictVersionId = configGroup.getVersionId();
            id = insert.getId();
        } else {
            return R.error(CONFIG_ITEM_EXISTS_STATUS, CONFIG_ITEM_EXISTS_MSG);
        }
        if (cacheEvictVersionId != null && cacheEvictVersionId > 0) {
            rccCache.evictConfigItem(cacheEvictVersionId);
        }
        return R.ok(id);
    }

    /**
     * 删除配置
     */
    @SaveLog(scene = "删除配置",
            paramsIdxes = {1},
            params = {"apiItemDeleteVo"})
    @PostMapping("itemDelete")
    public R deleteItem(String apiToken, @RequestBody ApiItemDeleteVo apiItemDeleteVo) {
        if (isBlank(apiToken)) {
            return R.error(PROJECT_API_TOKEN_NOT_EMPTY_STATUS, PROJECT_API_TOKEN_NOT_EMPTY_MSG);
        }
        Long versionId = apiItemDeleteVo.getVersionId();
        if (versionId == null || versionId <= 0) {
            return R.error(VERSION_ID_NOT_EXISTS_STATUS, VERSION_ID_NOT_EXISTS_MSG);
        }
        ApiToken tokenVo = apiTokenCacheService.getApiToken(apiToken);
        if (tokenVo == null) {
            return R.error(PROJECT_API_TOKEN_NOT_EXISTS_STATUS, PROJECT_API_TOKEN_NOT_EXISTS_MSG);
        }
        String key = apiItemDeleteVo.getKey();
        if (key == null) {
            return R.error(CONFIG_KEY_NOT_EXISTS_STATUS, CONFIG_KEY_NOT_EXISTS_MSG);
        }
        ConfigItem configItem = configItemService.selectByProjectIdAndVersionIdAndName(tokenVo.getProjectId(), versionId, key);
        if (configItem == null || Deleted.DELETE.getValue().equals(configItem.getDeleted())) {
            return R.error(CONFIG_ITEM_NOT_EXISTS_STATUS, CONFIG_ITEM_NOT_EXISTS_MSG);
        }

        // 采集configChangeLog
        Map<String, String> oldConfigMap = configItemService.findConfigItemsByGroupId(configItem.getGroupId());

        int cnt = configItemService.updateByPrimaryKeySelective(ConfigItem.newBuilder()
                .id(configItem.getId())
                .updateTime(DateTimeUtils.now())
                .deleted(Deleted.DELETE.getValue())
                .build()
        );

        // 保存更新日志
        Map<String, String> newConfigMap = new HashMap<>();
        if (!CollectionUtils.isEmpty(oldConfigMap)) {
            newConfigMap.putAll(oldConfigMap);
            newConfigMap.remove(configItem.getName());
        }
        configChangeLogService.saveLogWithBackground(null, "openApi_user", configItem.getGroupId(),
                oldConfigMap, newConfigMap, new Date());

        // 失效版本下的配置
        rccCache.evictConfigItem(configItem.getVersionId());

        return R.ok(cnt);
    }

    /**
     * 修改配置
     */
    @SaveLog(scene = "修改配置",
            paramsIdxes = {1},
            params = {"apiItemEditVo"})
    @PostMapping("itemEdit")
    public R<Long> EditItem(String apiToken, @RequestBody ApiItemEditVo apiItemEditVo) {
        if (isBlank(apiToken)) {
            return R.error(PROJECT_API_TOKEN_NOT_EMPTY_STATUS, PROJECT_API_TOKEN_NOT_EMPTY_MSG);
        }
        Long versionId = apiItemEditVo.getVersionId();
        if (versionId == null || versionId <= 0) {
            return R.error(VERSION_ID_NOT_EXISTS_STATUS, VERSION_ID_NOT_EXISTS_MSG);
        }
        ApiToken tokenVo = apiTokenCacheService.getApiToken(apiToken);
        if (tokenVo == null) {
            return R.error(PROJECT_API_TOKEN_NOT_EXISTS_STATUS, PROJECT_API_TOKEN_NOT_EXISTS_MSG);
        }
        String name = apiItemEditVo.getKey();
        Date now = DateTimeUtils.now();
        Long cacheEvictVersionId = null;
        if (name == null) {
                return R.error(CONFIG_KEY_NOT_EXISTS_STATUS, CONFIG_KEY_NOT_EXISTS_MSG);
            }
        ConfigItem configItem = configItemService.selectByProjectIdAndVersionIdAndName(tokenVo.getProjectId(), versionId, name);
        if (configItem == null || Deleted.DELETE.getValue().equals(configItem.getDeleted())) {
            return R.error(CONFIG_ITEM_NOT_EXISTS_STATUS, CONFIG_ITEM_NOT_EXISTS_MSG);
        } else {
            ConfigItem update = new ConfigItem();
            update.setId(configItem.getId());
            update.setUpdateTime(now);
            String newName = configItem.getName();
            if (isNotBlank(name)) {
                ConfigItem exists = configItemService.selectOneByExample(ConfigItemExample.newBuilder()
                                .build()
                                .createCriteria()
                                .andIdNotEqualTo(configItem.getId())
                                .andNameEqualTo(name)
                                .andVersionIdEqualTo(configItem.getVersionId())
                                .andDeletedEqualTo(Deleted.OK.getValue())
                                .toExample(),
                        MetaConfigItem.COLUMN_NAME_ID
                );
                if (exists != null) {
                    return R.error(CONFIG_ITEM_EXISTS_STATUS, CONFIG_ITEM_EXISTS_MSG);
                }
                update.setName(name);
                newName = name;
            }
            update.setVal(trim(apiItemEditVo.getValue()));
            update.setMemo(trim(apiItemEditVo.getMemo()));

            // 采集configChangeLog
            Map<String, String> oldConfigMap = configItemService.findConfigItemsByGroupId(configItem.getGroupId());

            // 更新
            configItemService.updateByPrimaryKeySelective(update);

            // 保存更新日志
            Map<String, String> newConfigMap = new HashMap<>();
            if (!CollectionUtils.isEmpty(oldConfigMap)) {
                newConfigMap.putAll(oldConfigMap);
                newConfigMap.remove(configItem.getName());
                newConfigMap.put(newName, update.getVal());
            }
            configChangeLogService.saveLogWithBackground(null, "openApi_user", configItem.getGroupId(),
                    oldConfigMap, newConfigMap, new Date());

            cacheEvictVersionId = configItem.getVersionId();

        }
        if (cacheEvictVersionId != null && cacheEvictVersionId > 0) {
            rccCache.evictConfigItem(cacheEvictVersionId);
        }
        return R.ok(configItem.getId());
    }

    /**
     * 批量修改配置
     */
    @SaveLog(scene = "批量新增或修改配置",
            paramsIdxes = {0},
            params = {"itemReq"})
    @PostMapping("batchSave")
    public R<Integer> batchSaveItems(String apiToken, @RequestBody BatchEditItemVo batchEditItemVo) {
        if (isBlank(apiToken)) {
            return R.error(PROJECT_API_TOKEN_NOT_EMPTY_STATUS, PROJECT_API_TOKEN_NOT_EMPTY_MSG);
        }
        Long versionId = batchEditItemVo.getVersionId();
        if (versionId == null || versionId <= 0) {
            return R.error(VERSION_ID_NOT_EXISTS_STATUS, VERSION_ID_NOT_EXISTS_MSG);
        }
        ApiToken tokenVo = apiTokenCacheService.getApiToken(apiToken);
        if (tokenVo == null) {
            return R.error(PROJECT_API_TOKEN_NOT_EXISTS_STATUS, PROJECT_API_TOKEN_NOT_EXISTS_MSG);
        }
        Long groupId = batchEditItemVo.getGroupId();
        if (groupId == null || groupId <= 0) {
            return R.error(GROUP_ID_NOT_EXISTS_STATUS, GROUP_ID_NOT_EXISTS_MSG);
        }
        ConfigGroup configGroup = groupService.selectByPrimaryKey(groupId);
        if (!CollectionUtils.isEmpty(batchEditItemVo.getItems())) {
            for (ItemReq req : batchEditItemVo.getItems()) {
                String name = req.getName();
                if (StringUtils.isBlank(name)) {
                    return R.error(CONFIG_KEY_NOT_EXISTS_STATUS, CONFIG_KEY_NOT_EXISTS_MSG);
                }
                ApiItemVo apiItemVo =  configItemService.getByVersionIdAndName(configGroup.getProjectId(), configGroup.getVersionId(), name);
                if (apiItemVo !=null && !apiItemVo.getId().equals(groupId)) {
                    return R.error(CONFIG_ITEM_EXISTS_STATUS, CONFIG_ITEM_EXISTS_MSG);
                }
            }
        }
        if (configGroup == null || Deleted.DELETE.getValue().equals(configGroup.getDeleted())) {
            return R.error(GROUP_NOT_EXISTS_STATUS, GROUP_NOT_EXISTS_MSG);
        }
        Date now = DateTimeUtils.now();
        User user= new User();
        user.setName("openApi_user");
        user.setUpdateTime(now);
        BatchConfigItemReq batchConfigItemReq = new BatchConfigItemReq();
        batchConfigItemReq.setGroupId(batchEditItemVo.getGroupId());
        batchConfigItemReq.setItems(batchEditItemVo.getItems());

        int cnt = configItemService.batchSave(user, batchConfigItemReq, configGroup);

        // 失效版本下的配置
        rccCache.evictConfigItem(configGroup.getVersionId());
        return R.ok(cnt);
    }




}
