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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


import com.baidu.brcc.annotation.SaveLog;
import com.baidu.brcc.domain.ConfigGroup;
import com.baidu.brcc.domain.ConfigItem;
import com.baidu.brcc.domain.ConfigItemExample;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.em.Deleted;
import com.baidu.brcc.domain.em.ProjectType;
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
import com.baidu.brcc.service.ProjectService;
import com.baidu.brcc.service.UserService;
import com.baidu.brcc.service.VersionService;
import com.baidu.brcc.utils.DataTransUtils;
import com.baidu.brcc.utils.time.DateTimeUtils;
import io.swagger.annotations.Api;
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

    @Autowired
    private ProjectService projectService;

    @Autowired
    private VersionService versionService;

    /**
     * 根据配置名称获取指定配置项
     *
     * @param token     api token
     * @param versionId 版本ID
     * @param name      配置名称
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
        Set<Long> resolved = new HashSet<>();
        List<ApiItemVo> items = configItemService.getCommonAndPrivateByVersionIdInCache(apiToken.getProjectId(), versionId, resolved);
        ApiItemVo itemVo = new ApiItemVo();
        itemVo.setKey(name);
        Boolean flag = false;
        for (ApiItemVo apiItemVo : items) {
            if (apiItemVo.getKey().equals(name)) {
                itemVo.setValue(apiItemVo.getValue());
                itemVo.setGroupId(apiItemVo.getGroupId());
                flag = true;
            }
        }
        if (flag) {
            return R.ok(itemVo);
        }
        return R.error(CONFIG_ITEM_NOT_EXISTS_STATUS, CONFIG_ITEM_NOT_EXISTS_MSG);
    }


    /**
     * 获取所有配置项
     *
     * @param token     api token
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
        Set<Long> resolved = new HashSet<>();
        List<ApiItemVo> itemsVos = configItemService.getCommonAndPrivateByVersionIdInCache(apiToken.getProjectId(), versionId, resolved);

        if (CollectionUtils.isEmpty(itemsVos)) {
            return R.ok(new ArrayList<>(0));
        }
        return R.ok(itemsVos);
    }

    /**
     * get configItem by groupId
     *
     * @param token   api token
     * @param groupId groupID
     * @return
     */
    @GetMapping("groupItem")
    public R<List<ApiItemVo>> getItemByGroupId(String token, Long groupId) {
        // check token
        if (isBlank(token)) {
            return R.error(PROJECT_API_TOKEN_NOT_EMPTY_STATUS, PROJECT_API_TOKEN_NOT_EMPTY_MSG);
        }
        // check group
        if (groupId == null || groupId <= 0) {
            return R.error(GROUP_ID_NOT_EXISTS_STATUS, GROUP_ID_NOT_EXISTS_MSG);
        }
        // check apiToken valid
        ApiToken apiToken = apiTokenCacheService.getApiToken(token);
        if (apiToken == null) {
            return R.error(PROJECT_API_TOKEN_NOT_EXISTS_STATUS, PROJECT_API_TOKEN_NOT_EXISTS_MSG);
        }
        // get all configItems by groupId
        Map<String, String> itemMap = configItemService.findConfigItemsByGroupId(groupId);
        List<ApiItemVo> apiItemVos = new ArrayList<>();
        for (Map.Entry<String, String> entry : itemMap.entrySet()) {
            ApiItemVo item = new ApiItemVo();
            item.setKey(entry.getKey());
            item.setValue(entry.getValue());
            apiItemVos.add(item);
        }
        if (CollectionUtils.isEmpty(apiItemVos)) {
            return R.ok(new ArrayList<>(0));
        }
        return R.ok(apiItemVos);
    }

    /**
     * 批量获取指定配置项
     *
     * @param token api token
     * @param reqVo reqVo.versionId 版本ID
     *              reqVo.keys 配置KEY列表，如果为空则获取版本下的所有配置项
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
        Set<Long> resolved = new HashSet<>();
        List<ApiItemVo> result = configItemService.getCommonAndPrivateByVersionIdInCache(apiToken.getProjectId(),
                versionId, resolved);
        if (CollectionUtils.isEmpty(result)) {
            return R.ok(new ArrayList<>(0));
        }
        List<String> keys = reqVo.getKeys();
        if (CollectionUtils.isEmpty(keys)) {
            return R.ok(result);
        }
        List<ApiItemVo> apiItemVos = new ArrayList<>();
        for (ApiItemVo apiItemVo : result) {
                if (keys.contains(apiItemVo.getKey())) {
                    ApiItemVo itemVo = new ApiItemVo();
                    itemVo.setKey(apiItemVo.getKey());
                    itemVo.setValue(apiItemVo.getValue());
                    itemVo.setGroupId(apiItemVo.getGroupId());
                    apiItemVos.add(itemVo);
                }
            }
        return R.ok(apiItemVos);
    }

    /**
     * 增加配置
     *
     * @param token        api token
     * @param itemAddReqVo 新增配置信息
     *                     itemAddReqVo.versionId 版本ID
     *                     itemAddReqVo.key 配置KEY
     *                     itemAddReqVo.value 配置值
     *                     itemAddReqVo.groupId 分组ID
     *                     itemAddReqVo.memo 配置简介
     * @return ？
     */
    @SaveLog(scene = "0000",
            paramsIdxes = {1},
            params = {"itemAddReqVo"})
    @PostMapping("itemAdd")
    public R<Long> addItem(String token, @RequestBody APiItemAddReqVo itemAddReqVo) {
        if (isBlank(token)) {
            return R.error(PROJECT_API_TOKEN_NOT_EMPTY_STATUS, PROJECT_API_TOKEN_NOT_EMPTY_MSG);
        }
        Long versionId = itemAddReqVo.getVersionId();
        if (versionId == null || versionId <= 0) {
            return R.error(VERSION_ID_NOT_EXISTS_STATUS, VERSION_ID_NOT_EXISTS_MSG);
        }
        ApiToken tokenVo = apiTokenCacheService.getApiToken(token);
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
        //检查新增配置项是否为空
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
            //新增配置
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
            //检查配置是否已经存在
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
            Set<Long> resolved = new HashSet<>();
            List<Long> versionIds = new ArrayList<>();
            versionIds.add(cacheEvictVersionId);
            if (projectService.selectByPrimaryKey(tokenVo.getProjectId()).getProjectType().equals(ProjectType.PUBLIC.getValue())) {
                versionIds.addAll(versionService.getChildrenVersionById(versionId, resolved));
            }
            rccCache.evictConfigItem(versionIds);
        }
        return R.ok(id);
    }

    /**
     * 删除配置
     *
     * @param token           api token
     * @param apiItemDeleteVo 删除配置信息
     *                        apiItemDeleteVo.versionId 版本ID
     *                        apiItemDeleteVo.key 配置key
     * @return
     */
    @SaveLog(scene = "0002",
            paramsIdxes = {1},
            params = {"apiItemDeleteVo"})
    @PostMapping("itemDelete")
    public R deleteItem(String token, @RequestBody ApiItemDeleteVo apiItemDeleteVo) {
        // 鉴权token
        if (isBlank(token)) {
            return R.error(PROJECT_API_TOKEN_NOT_EMPTY_STATUS, PROJECT_API_TOKEN_NOT_EMPTY_MSG);
        }
        // 鉴定版本
        Long versionId = apiItemDeleteVo.getVersionId();
        if (versionId == null || versionId <= 0) {
            return R.error(VERSION_ID_NOT_EXISTS_STATUS, VERSION_ID_NOT_EXISTS_MSG);
        }
        // 鉴定工程
        ApiToken tokenVo = apiTokenCacheService.getApiToken(token);
        if (tokenVo == null) {
            return R.error(PROJECT_API_TOKEN_NOT_EXISTS_STATUS, PROJECT_API_TOKEN_NOT_EXISTS_MSG);
        }
        // 鉴定配置项
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
        List<Long> versionIds = new ArrayList<>();
        versionIds.add(configItem.getVersionId());
        Set<Long> resolved = new HashSet<>();
        if (projectService.selectByPrimaryKey(tokenVo.getProjectId()).getProjectType().equals(ProjectType.PUBLIC.getValue())) {
            versionIds.addAll(versionService.getChildrenVersionById(versionId, resolved));
        }
        rccCache.evictConfigItem(versionIds);
        return R.ok(cnt);
    }

    /**
     * 修改配置
     *
     * @param token         api token
     * @param apiItemEditVo 配置信息
     *                      apiItemEditVo.versionId 版本ID
     *                      apiItemEditVo.key 配置key
     *                      apiItemEditVo.value 配置值
     *                      apiItemEditVo.memo 配置简介
     * @return
     */
    @SaveLog(scene = "0000",
            paramsIdxes = {1},
            params = {"apiItemEditVo"})
    @PostMapping("itemEdit")
    public R<Long> EditItem(String token, @RequestBody ApiItemEditVo apiItemEditVo) {
        // 鉴权token
        if (isBlank(token)) {
            return R.error(PROJECT_API_TOKEN_NOT_EMPTY_STATUS, PROJECT_API_TOKEN_NOT_EMPTY_MSG);
        }
        // 鉴定版本
        Long versionId = apiItemEditVo.getVersionId();
        if (versionId == null || versionId <= 0) {
            return R.error(VERSION_ID_NOT_EXISTS_STATUS, VERSION_ID_NOT_EXISTS_MSG);
        }
        // 鉴定工程
        ApiToken tokenVo = apiTokenCacheService.getApiToken(token);
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
            // 更新配置信息
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
            Set<Long> resolved = new HashSet<>();
            List<Long> versionIds = new ArrayList<>();
            versionIds.add(cacheEvictVersionId);
            if (projectService.selectByPrimaryKey(tokenVo.getProjectId()).getProjectType().equals(ProjectType.PUBLIC.getValue())) {
                versionIds.addAll(versionService.getChildrenVersionById(versionId, resolved));
            }
            rccCache.evictConfigItem(versionIds);
        }
        return R.ok(configItem.getId());
    }

    /**
     * 批量修改配置
     *
     * @param token           api token
     * @param batchEditItemVo 配置信息
     *                        batchEditItemVo.groupId 分组ID
     *                        batchEditItemVo.versionId 版本ID
     *                        batchEditItemVo.items 分组下的配置列表
     * @return
     */
    @SaveLog(scene = "0001",
            paramsIdxes = {0},
            params = {"itemReq"})
    @PostMapping("batchSave")
    public R<Integer> batchSaveItems(String token, @RequestBody BatchEditItemVo batchEditItemVo) {
        // 鉴权token
        if (isBlank(token)) {
            return R.error(PROJECT_API_TOKEN_NOT_EMPTY_STATUS, PROJECT_API_TOKEN_NOT_EMPTY_MSG);
        }
        // 鉴定版本
        Long versionId = batchEditItemVo.getVersionId();
        if (versionId == null || versionId <= 0) {
            return R.error(VERSION_ID_NOT_EXISTS_STATUS, VERSION_ID_NOT_EXISTS_MSG);
        }
        // 鉴定工程
        ApiToken tokenVo = apiTokenCacheService.getApiToken(token);
        if (tokenVo == null) {
            return R.error(PROJECT_API_TOKEN_NOT_EXISTS_STATUS, PROJECT_API_TOKEN_NOT_EXISTS_MSG);
        }
        // 鉴定分组
        Long groupId = batchEditItemVo.getGroupId();
        if (groupId == null || groupId <= 0) {
            return R.error(GROUP_ID_NOT_EXISTS_STATUS, GROUP_ID_NOT_EXISTS_MSG);
        }
        // 鉴定分组是否存在
        ConfigGroup configGroup = groupService.selectByPrimaryKey(groupId);
        if (configGroup == null || Deleted.DELETE.getValue().equals(configGroup.getDeleted())) {
            return R.error(GROUP_NOT_EXISTS_STATUS, GROUP_NOT_EXISTS_MSG);
        }
        // 鉴定配置项信息
        if (!CollectionUtils.isEmpty(batchEditItemVo.getItems())) {
            for (ItemReq req : batchEditItemVo.getItems()) {
                String name = req.getName();
                if (StringUtils.isBlank(name)) {
                    return R.error(CONFIG_KEY_NOT_EXISTS_STATUS, CONFIG_KEY_NOT_EXISTS_MSG);
                }
            }
        }
        Date now = DateTimeUtils.now();
        User user = new User();
        user.setName("openApi_user");
        user.setUpdateTime(now);
        BatchConfigItemReq batchConfigItemReq = new BatchConfigItemReq();
        batchConfigItemReq.setGroupId(batchEditItemVo.getGroupId());
        batchConfigItemReq.setItems(batchEditItemVo.getItems());

        // 更新配置信息
        int cnt = configItemService.batchSave(user, batchConfigItemReq, configGroup);

        // 失效版本下的配置
        if (configGroup.getVersionId() != null && configGroup.getVersionId() > 0) {
            Set<Long> resolved = new HashSet<>();
            List<Long> versionIds = new ArrayList<>();
            versionIds.add(configGroup.getVersionId());
            if (projectService.selectByPrimaryKey(tokenVo.getProjectId()).getProjectType().equals(ProjectType.PUBLIC.getValue())) {
                versionIds.addAll(versionService.getChildrenVersionById(versionId, resolved));
            }
            rccCache.evictConfigItem(versionIds);
        }
        return R.ok(cnt);
    }
}
