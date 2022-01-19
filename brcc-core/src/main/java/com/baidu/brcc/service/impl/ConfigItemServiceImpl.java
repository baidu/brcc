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
package com.baidu.brcc.service.impl;

import static com.baidu.brcc.common.ErrorStatusMsg.CONFIG_ITEM_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.CONFIG_ITEM_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.CONVERT_TO_STRING_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.CONVERT_TO_STRING_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.NON_LOGIN_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.NON_LOGIN_STATUS;
import static com.baidu.brcc.utils.collections.CollectionUtils.isEmpty;
import static org.apache.commons.lang3.StringUtils.isNotBlank;
import static org.apache.commons.lang3.StringUtils.trim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.baidu.brcc.domain.ConfigGroupExample;
import com.baidu.brcc.domain.em.FileImportType;
import com.baidu.brcc.utils.DataTransUtils;
import com.baidu.brcc.utils.NameTreadFactory;
import com.google.common.base.Splitter;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baidu.brcc.dao.ConfigItemMapper;
import com.baidu.brcc.dao.base.BaseMapper;
import com.baidu.brcc.domain.ConfigGroup;
import com.baidu.brcc.domain.ConfigItem;
import com.baidu.brcc.domain.ConfigItemExample;
import com.baidu.brcc.domain.Environment;
import com.baidu.brcc.domain.EnvironmentUser;
import com.baidu.brcc.domain.EnvironmentUserExample;
import com.baidu.brcc.domain.Product;
import com.baidu.brcc.domain.ProductUser;
import com.baidu.brcc.domain.ProductUserExample;
import com.baidu.brcc.domain.Project;
import com.baidu.brcc.domain.ProjectUser;
import com.baidu.brcc.domain.ProjectUserExample;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.Version;
import com.baidu.brcc.domain.base.Pagination;
import com.baidu.brcc.domain.em.Deleted;
import com.baidu.brcc.domain.em.ProjectUserAdmin;
import com.baidu.brcc.domain.em.UserRole;
import com.baidu.brcc.domain.exception.BizException;
import com.baidu.brcc.domain.meta.MetaConfigGroup;
import com.baidu.brcc.domain.meta.MetaConfigItem;
import com.baidu.brcc.domain.meta.MetaEnvironment;
import com.baidu.brcc.domain.meta.MetaEnvironmentUser;
import com.baidu.brcc.domain.meta.MetaProduct;
import com.baidu.brcc.domain.meta.MetaProductUser;
import com.baidu.brcc.domain.meta.MetaProject;
import com.baidu.brcc.domain.meta.MetaProjectUser;
import com.baidu.brcc.domain.meta.MetaVersion;
import com.baidu.brcc.domain.vo.ApiItemVo;
import com.baidu.brcc.domain.vo.BatchConfigItemReq;
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
import com.baidu.brcc.service.base.GenericServiceImpl;
import com.baidu.brcc.utils.collections.CollectionUtils;
import com.baidu.brcc.utils.time.DateTimeUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.PreDestroy;

@Service("configItemService")
public class ConfigItemServiceImpl extends GenericServiceImpl<ConfigItem, Long, ConfigItemExample>
        implements ConfigItemService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConfigItemServiceImpl.class);

    @Autowired
    private ConfigItemMapper configItemMapper;

    @Autowired
    private ConfigChangeLogService configChangeLogService;

    @Autowired
    private EnvironmentService environmentService;

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductUserService productUserService;

    @Autowired
    private ProjectUserService projectUserService;

    @Autowired
    private ConfigGroupService configGroupService;

    @Autowired
    private ProjectService projectService;

    @Autowired
    private VersionService versionService;

    @Autowired
    private EnvironmentUserService environmentUserService;

    @Autowired
    private RccCache rccCache;

    private static ThreadPoolExecutor executor = new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(), Runtime.getRuntime().availableProcessors() * 2
            , 30, TimeUnit.SECONDS, new LinkedBlockingQueue<>(), new NameTreadFactory(), new ThreadPoolExecutor.DiscardPolicy());

    @Override
    public BaseMapper<ConfigItem, Long, ConfigItemExample> getMapper() {
        return configItemMapper;
    }

    @Override
    public ConfigItemExample newExample() {
        return ConfigItemExample.newBuilder().build();
    }

    @Override
    public ConfigItemExample newIdInExample(List<Long> ids) {
        return ConfigItemExample.newBuilder().build().createCriteria().andIdIn(ids).toExample();
    }

    @Override
    public ConfigItem selectByProjectIdAndVersionIdAndName(Long projectId, Long versionId, String name) {
        return selectOneByExample(ConfigItemExample.newBuilder()
                .build()
                .createCriteria()
                .andDeletedEqualTo(Deleted.OK.getValue())
                .andProjectIdEqualTo(projectId)
                .andVersionIdEqualTo(versionId)
                .andNameEqualTo(name)
                .toExample()
        );
    }

    @Override
    public List<ConfigItem> selectByProjectIdAndVersionId(Long projectId, Long versionId) {
        return selectByExample(ConfigItemExample.newBuilder()
                .build()
                .createCriteria()
                .andDeletedEqualTo(Deleted.OK.getValue())
                .andProjectIdEqualTo(projectId)
                .andVersionIdEqualTo(versionId)
                .toExample()
        );
    }

    @Override
    public Map<String, ConfigItem> selectMapByProjectIdAndVersionId(Long projectId, Long versionId) {
        return selectMapByExample(ConfigItemExample.newBuilder()
                        .build()
                        .createCriteria()
                        .andDeletedEqualTo(Deleted.OK.getValue())
                        .andProjectIdEqualTo(projectId)
                        .andVersionIdEqualTo(versionId)
                        .toExample(),
                ConfigItem::getName,
                Function.identity()
        );
    }

    @Override
    public List<ConfigItem> selectByProjectIdAndVersionIdAndNames(Long projectId, Long versionId, List<String> names) {
        return selectByExample(ConfigItemExample.newBuilder()
                .build()
                .createCriteria()
                .andDeletedEqualTo(Deleted.OK.getValue())
                .andProjectIdEqualTo(projectId)
                .andVersionIdEqualTo(versionId)
                .andNameIn(names, !CollectionUtils.isEmpty(names))
                .toExample()
        );
    }

    @Override
    @Transactional
    public Integer batchSave(User user, BatchConfigItemReq itemReq, ConfigGroup configGroup) {
        final AtomicInteger result = new AtomicInteger(0);
        Long groupId = itemReq.getGroupId();
        Map<String, ConfigItem> itemMap =
                selectMapByExample(ConfigItemExample.newBuilder()
                                .build()
                                .createCriteria()
                                .andVersionIdEqualTo(configGroup.getVersionId())
                                .andDeletedEqualTo(Deleted.OK.getValue())
                                .toExample(),
                        ConfigItem::getName,
                        Function.identity(),
                        MetaConfigItem.COLUMN_NAME_ID,
                        MetaConfigItem.COLUMN_NAME_NAME,
                        MetaConfigItem.COLUMN_NAME_VAL,
                        MetaConfigItem.COLUMN_NAME_GROUPID
                );

        List<ItemReq> items = itemReq.getItems();
        Map<String, ItemReq> itemReqMap = CollectionUtils.toMap(items, ItemReq::getName);
        Date now = DateTimeUtils.now();
        if (!CollectionUtils.isEmpty(items)) {
            boolean itemMapEmpty = CollectionUtils.isEmpty(itemMap);
            items.forEach(req -> {
                // 如果不同分组已存在相同配置,返回错误
                String name = trim(req.getName());
                if (!itemMapEmpty && itemMap.get(name) != null) {
                    if (!itemMap.get(name).getGroupId().equals(groupId)) {
                        throw new BizException(CONFIG_ITEM_EXISTS_MSG, CONFIG_ITEM_EXISTS_STATUS);
                    }
                }
                executor.execute(() -> {
                            try {
                                if (itemMapEmpty || itemMap.get(name) == null) {
                                    // 新增的
                                    ConfigItem configItemInsert = ConfigItem.newBuilder()
                                            .createTime(now)
                                            .deleted(Deleted.OK.getValue())
                                            .memo(trim(req.getMemo()))
                                            .environmentId(configGroup.getEnvironmentId())
                                            .name(name)
                                            .groupId(groupId)
                                            .projectId(configGroup.getProjectId())
                                            .productId(configGroup.getProductId())
                                            .updateTime(now)
                                            .val(trim(req.getVal()))
                                            .versionId(configGroup.getVersionId())
                                            .build();
                                    insertSelective(configItemInsert);
                                    result.incrementAndGet();

                                } else {
                                    // 需要更新的
                                    ConfigItem configItem = itemMap.get(name);
                                    ConfigItem configItemUpdate = ConfigItem.newBuilder()
                                            .id(configItem.getId())
                                            .memo(trim(req.getMemo()))
                                            .updateTime(now)
                                            .val(trim(req.getVal()))
                                            .build();
                                    updateByPrimaryKeySelective(configItemUpdate);
                                    result.incrementAndGet();
                                }
                            } catch (Throwable e) {
                                LOGGER.error("batchSave error.", e);
                            }
                        }
                );
            });
        }
        if (!CollectionUtils.isEmpty(itemMap)) {
            boolean isItemsMapEmpty = CollectionUtils.isEmpty(itemReqMap);
            for (ConfigItem item : itemMap.values()) {
                Long id = item.getId();
                String name = trim(item.getName());
                if (isItemsMapEmpty || itemReqMap.get(name) == null) {
                    // 若现存和新增的分组ID相同，需要删除
                    if (item.getGroupId().equals(groupId)) {
                        ConfigItem configItemUpdate = ConfigItem.newBuilder()
                                .id(id)
                                .updateTime(now)
                                .deleted(Deleted.DELETE.getValue())
                                .build();
                        updateByPrimaryKeySelective(configItemUpdate);
                        result.incrementAndGet();
                    }
                }
            }
        }

        // 记录changeLog
        Map<String, String> oldConfigMap = new HashMap<>();
        if (!CollectionUtils.isEmpty(itemMap)) {
            for (ConfigItem item : itemMap.values()) {
                oldConfigMap.put(item.getName(), item.getVal());
            }
        }
        Map<String, String> newConfigMap = new HashMap<>();
        if (!CollectionUtils.isEmpty(items)) {
            for (ItemReq item : items) {
                newConfigMap.put(item.getName(), item.getVal());
            }
        }
        configChangeLogService.saveLogWithBackground(user.getId(), user.getName(), groupId, oldConfigMap, newConfigMap,
                new Date());
        return result.get();
    }

    @PreDestroy
    public void stop() {
        LOGGER.info("destory configItemService executor thread pool.");
        if (executor != null) {
            executor.shutdown();
        }
    }

    @Override
    public int deleteByGroupId(Long groupId) {
        return updateByExampleSelective(
                ConfigItem.newBuilder()
                        .deleted(Deleted.DELETE.getValue())
                        .updateTime(DateTimeUtils.now())
                        .build(),
                ConfigItemExample.newBuilder()
                        .build()
                        .createCriteria()
                        .andGroupIdEqualTo(groupId)
                        .andDeletedEqualTo(Deleted.OK.getValue())
                        .toExample());
    }

    @Override
    public int deleteByVersionId(Long versionId) {
        return updateByExampleSelective(
                ConfigItem.newBuilder()
                        .deleted(Deleted.DELETE.getValue())
                        .updateTime(DateTimeUtils.now())
                        .build(),
                ConfigItemExample.newBuilder()
                        .build()
                        .createCriteria()
                        .andVersionIdEqualTo(versionId)
                        .andDeletedEqualTo(Deleted.OK.getValue())
                        .toExample());
    }

    @Override
    public int deleteByEnvId(Long envId) {
        return updateByExampleSelective(
                ConfigItem.newBuilder()
                        .deleted(Deleted.DELETE.getValue())
                        .updateTime(DateTimeUtils.now())
                        .build(),
                ConfigItemExample.newBuilder()
                        .build()
                        .createCriteria()
                        .andEnvironmentIdEqualTo(envId)
                        .andDeletedEqualTo(Deleted.OK.getValue())
                        .toExample());
    }

    @Override
    public int deleteByProjectId(Long projectId) {
        return updateByExampleSelective(
                ConfigItem.newBuilder()
                        .deleted(Deleted.DELETE.getValue())
                        .updateTime(DateTimeUtils.now())
                        .build(),
                ConfigItemExample.newBuilder()
                        .build()
                        .createCriteria()
                        .andProjectIdEqualTo(projectId)
                        .andDeletedEqualTo(Deleted.OK.getValue())
                        .toExample());
    }

    @Override
    public Map<String, String> findConfigItemsByGroupId(Long groupId) {
        return selectMapByExample(ConfigItemExample.newBuilder()
                        .build()
                        .createCriteria()
                        .andDeletedEqualTo(Deleted.OK.getValue())
                        .andGroupIdEqualTo(groupId)
                        .toExample(),
                ConfigItem::getName,
                ConfigItem::getVal,
                MetaConfigItem.COLUMN_NAME_NAME,
                MetaConfigItem.COLUMN_NAME_VAL
        );
    }

    @Transactional
    @Override
    public void saveConfigItems(
            List<ConfigItem> insertConfigItemList,
            List<ConfigItem> updateConfigItemList,
            List<Long> delConfigItemIds
    ) {
        if (!CollectionUtils.isEmpty(delConfigItemIds)) {
            this.deleteByExample(ConfigItemExample.newBuilder()
                    .build()
                    .createCriteria()
                    .andIdIn(delConfigItemIds)
                    .toExample()
            );
        }
        if (!CollectionUtils.isEmpty(insertConfigItemList)) {
            for (ConfigItem configItem : insertConfigItemList) {
                this.insertSelective(configItem);
            }
        }

        if (!CollectionUtils.isEmpty(updateConfigItemList)) {
            for (ConfigItem configItem : updateConfigItemList) {
                this.updateByPrimaryKeySelective(configItem);
            }
        }
    }

    @Override
    public Map<String, String> findConfigItemsByVersionId(Long versionId) {
        return selectMapByExample(ConfigItemExample.newBuilder()
                        .build()
                        .createCriteria()
                        .andDeletedEqualTo(Deleted.OK.getValue())
                        .andVersionIdEqualTo(versionId)
                        .toExample(),
                ConfigItem::getName,
                ConfigItem::getVal,
                MetaConfigItem.COLUMN_NAME_NAME,
                MetaConfigItem.COLUMN_NAME_VAL
        );
    }

    @Override
    public ApiItemVo getByVersionIdAndName(Long projectId, Long versionId, String key) {
        ApiItemVo itemVo = rccCache.getItem(versionId, key);
        if (itemVo == null) {
            // 缓存可用且配置项的HKEY不存在，加载所有版本
            if (rccCache.cacheEnable() && !rccCache.existsItemHKey(versionId)) {
                List<ConfigItem> items = selectByProjectIdAndVersionId(
                        projectId,
                        versionId);
                if (!CollectionUtils.isEmpty(items)) {
                    List<ApiItemVo> itemsVos = new ArrayList<>(items.size());
                    for (ConfigItem item : items) {
                        ApiItemVo v = new ApiItemVo().copy(item);
                        itemsVos.add(v);
                        if (StringUtils.equals(item.getName(), key)) {
                            itemVo = v;
                        }
                    }
                    rccCache.loadItems(versionId, itemsVos, true);
                }
            } else {
                ConfigItem item = selectByProjectIdAndVersionIdAndName(
                        projectId,
                        versionId,
                        key);
                if (item != null) {
                    itemVo = new ApiItemVo().copy(item);
                    // 为了数据一致性，此处不重新加载缓存
                    // rccCache.loadItem(versionId, itemVo);
                }
            }
        }
        return itemVo;
    }

    @Override
    public List<ApiItemVo> getAllByVersionIdInCache(Long projectId, Long versionId) {
        List<ApiItemVo> itemsVos = rccCache.getItems(versionId);
        if (CollectionUtils.isEmpty(itemsVos)) {
            List<ConfigItem> items = selectByProjectIdAndVersionId(projectId, versionId);
            if (!CollectionUtils.isEmpty(items)) {
                itemsVos = new ArrayList<>(items.size());
                for (ConfigItem item : items) {
                    ApiItemVo vo = new ApiItemVo().copy(item);
                    itemsVos.add(vo);
                }
                rccCache.loadItems(versionId, itemsVos, true);
            }
        }
        return itemsVos;
    }

    @Override
    public List<ApiItemVo> getCommonAndPrivateByVersionIdInCache(Long projectId, Long versionId, Set<Long> resolved) {
        List<ApiItemVo> allConfig = rccCache.getItems(versionId);
//        Map<String, ConfigItem> allConfig = rccCache.getItemMap(versionId);
        if (CollectionUtils.isEmpty(allConfig)) {
            allConfig = new ArrayList<>();
            // get the original configuration
            List<ConfigItem> items = selectByProjectIdAndVersionId(projectId, versionId);
            if (!CollectionUtils.isEmpty(items)) {
                for (ConfigItem item : items) {
                    ApiItemVo vo = new ApiItemVo().copy(item);
                    allConfig.add(vo);
                }
            }
            // get the common configuration
            Version version = versionService.selectByPrimaryKey(versionId);
            resolved.add(versionId);
            if (version.getDependencyIds().isEmpty()) {
                rccCache.loadItems(versionId, allConfig, true);
                return allConfig;
            }
            List<Long> depIds = DataTransUtils.string2List(version.getDependencyIds());
            for (Long depId : depIds) {
                Version item = versionService.selectByPrimaryKey(depId);
                if (null != item) {
//                    Map<String, ConfigItem> depItem = new HashMap<>();
                    List<ApiItemVo> depItem = new ArrayList<>();
                    if (resolved.contains(depId)) {
                        continue;
                    }
                    // 递归调用，结束点：没有子版本或者该版本已被加载
                    depItem = getCommonAndPrivateByVersionIdInCache(item.getProjectId(), item.getId(), resolved);
                    if (!CollectionUtils.isEmpty(depItem)) {
//                        allConfig.putAll(depItem);
                        for (ApiItemVo itemVo : depItem) {
                            if (!DataTransUtils.listContainsConfigKey(allConfig, itemVo)) {
                                allConfig.add(itemVo);
                            }
                        }
                    }
                    resolved.add(depId);
                }
            }
            if (!CollectionUtils.isEmpty(allConfig)) {
                rccCache.loadItems(versionId, allConfig, true);
            }
        }
        return allConfig;
    }

    @Override
    public List<ApiItemVo> getItemsByVersionIdAndNamesInCache(Long projectId, Long versionId, List<String> names) {
        List<ApiItemVo> result = null;
        if (CollectionUtils.isEmpty(names)) {
            result = rccCache.getItems(versionId);
        } else {
            result = rccCache.getItems(versionId, names);
        }
        if (CollectionUtils.isEmpty(result)) {
            // 缓存可用且配置项的HKEY不存在，加载所有版本
            if (rccCache.cacheEnable() && !rccCache.existsItemHKey(versionId)) {
                result = new ArrayList<>();
                List<ConfigItem> items = selectByProjectIdAndVersionId(
                        projectId,
                        versionId);
                if (!CollectionUtils.isEmpty(items)) {
                    List<ApiItemVo> itemsVos = new ArrayList<>(items.size());
                    for (ConfigItem item : items) {
                        ApiItemVo vo = new ApiItemVo().copy(item);
                        itemsVos.add(vo);

                        if (CollectionUtils.isEmpty(names) || names.contains(item.getName())) {
                            result.add(vo);
                        }
                    }
                    rccCache.loadItems(versionId, itemsVos, true);
                }
            } else {
                List<ConfigItem> items = selectByProjectIdAndVersionIdAndNames(
                        projectId,
                        versionId,
                        names
                );
                if (!CollectionUtils.isEmpty(items)) {
                    result = new ArrayList<>(items.size());
                    for (ConfigItem item : items) {
                        ApiItemVo vo = new ApiItemVo().copy(item);
                        result.add(vo);
                    }
                    // rccCache.loadItems(versionId, result, CollectionUtils.isEmpty(names));
                }
            }
        }
        return result;
    }

    @Override
    public Pagination<ConfigItemVo> pagination(Integer offset, Integer pageSize, Long productId, Long projectId,
                                               String key, String val, User user) {
        if (user == null) {
            throw new BizException(NON_LOGIN_STATUS, NON_LOGIN_MSG);
        }
        Set<Long> productIdsByQuery = null;
        Set<Long> projectIdsByQuery = null;
        Set<Long> environmentIdsByQuery = null;
        if (!UserRole.SYSADMIN.getValue().equals(user.getRole())) {
            // 非管理员
            Map<String, Set<Long>> accessible = accessible(user);
            if (accessible != null) {
                productIdsByQuery = accessible.get(MetaProductUser.COLUMN_NAME_PRODUCTID);
                projectIdsByQuery = accessible.get(MetaProjectUser.COLUMN_NAME_PROJECTID);
                environmentIdsByQuery = accessible.get(MetaEnvironmentUser.COLUMN_NAME_ENVIRONMENTID);
            }
            if (isEmpty(productIdsByQuery) && isEmpty(projectIdsByQuery) && isEmpty(environmentIdsByQuery)) {
                return Pagination.empty();
            }
        }

        Set<Long> groupIds = new HashSet<>();
        Set<Long> versionIds = new HashSet<>();
        Set<Long> environmentIds = new HashSet<>();
        Set<Long> projectIds = new HashSet<>();
        Set<Long> productIds = new HashSet<>();

        ConfigItemExample configItemExample = ConfigItemExample.newBuilder()
                .orderByClause(MetaConfigItem.COLUMN_NAME_VERSIONID)
                .start(offset)
                .limit(pageSize)
                .build()
                .createCriteria()
                .andDeletedEqualTo(Deleted.OK.getValue())
                .andProductIdEqualTo(productId, productId != null && productId > 0)
                .andProjectIdEqualTo(projectId, projectId != null && projectId > 0)
                .andNameLikeBoth(key, isNotBlank(key))
                .andValLikeBoth(val, isNotBlank(val))
                .toExample();

        if (!isEmpty(productIdsByQuery) || !isEmpty(projectIdsByQuery) || !isEmpty(environmentIdsByQuery)) {
            ConfigItemExample.CriterionGroup criterionGroup = configItemExample.and().andGroupCriterion();
            if (!isEmpty(productIdsByQuery)) {
                criterionGroup = criterionGroup.orProductIdIn(productIdsByQuery);
            }
            if (!isEmpty(projectIdsByQuery)) {
                criterionGroup = criterionGroup.orProjectIdIn(projectIdsByQuery);
            }
            if (!isEmpty(environmentIdsByQuery)) {
                criterionGroup = criterionGroup.orEnvironmentIdIn(environmentIdsByQuery);
            }
            configItemExample = criterionGroup.toCriteria().toExample();
        }

        Pagination<ConfigItemVo> pagination = pagination(configItemExample,
                item -> {
                    ConfigItemVo vo = new ConfigItemVo();
                    Long groupId = item.getGroupId();
                    groupIds.add(groupId);
                    Long versionId = item.getVersionId();
                    versionIds.add(versionId);
                    Long environmentId = item.getEnvironmentId();
                    environmentIds.add(environmentId);
                    Long _projectId = item.getProjectId();
                    projectIds.add(_projectId);
                    Long _productId = item.getProductId();
                    productIds.add(_productId);
                    vo.setId(item.getId());
                    vo.setGroupId(groupId);
                    vo.setVersionId(versionId);
                    vo.setEnvironmentId(environmentId);
                    vo.setProjectId(_projectId);
                    vo.setProductId(_productId);
                    vo.setName(item.getName());
                    vo.setMemo(item.getMemo());
                    vo.setVal(item.getVal());
                    return vo;
                }
        );

        if (pagination != null && !CollectionUtils.isEmpty(pagination.getDataList())) {
            Map<Long, Product> productMap = productService.selectMapByPrimaryKeys(
                    productIds,
                    Product::getId,
                    MetaProduct.COLUMN_NAME_ID,
                    MetaProduct.COLUMN_NAME_NAME
            );

            Map<Long, Project> projectMap = projectService.selectMapByPrimaryKeys(
                    projectIds,
                    Project::getId,
                    MetaProject.COLUMN_NAME_ID,
                    MetaProject.COLUMN_NAME_NAME
            );

            Map<Long, Environment> environmentMap = environmentService.selectMapByPrimaryKeys(
                    environmentIds,
                    Environment::getId,
                    MetaEnvironment.COLUMN_NAME_ID,
                    MetaEnvironment.COLUMN_NAME_NAME
            );

            Map<Long, Version> versionMap = versionService.selectMapByPrimaryKeys(
                    versionIds,
                    Version::getId,
                    MetaVersion.COLUMN_NAME_ID,
                    MetaVersion.COLUMN_NAME_NAME
            );

            Map<Long, ConfigGroup> groupMap = configGroupService.selectMapByPrimaryKeys(
                    groupIds,
                    ConfigGroup::getId,
                    MetaConfigGroup.COLUMN_NAME_ID,
                    MetaConfigGroup.COLUMN_NAME_NAME
            );

            pagination.each(item -> {
                Long groupId = item.getGroupId();
                Long versionId = item.getVersionId();
                Long environmentId = item.getEnvironmentId();
                Long _projectId = item.getProjectId();
                Long _productId = item.getProductId();
                if (groupMap != null && groupMap.get(groupId) != null) {
                    item.setGroupName(groupMap.get(groupId).getName());
                }
                if (versionMap != null && versionMap.get(versionId) != null) {
                    item.setVersionName(versionMap.get(versionId).getName());
                }
                if (environmentMap != null && environmentMap.get(environmentId) != null) {
                    item.setEnvironmentName(environmentMap.get(environmentId).getName());
                }
                if (projectMap != null && projectMap.get(_projectId) != null) {
                    item.setProjectName(projectMap.get(_projectId).getName());
                }
                if (productMap != null && productMap.get(_productId) != null) {
                    item.setProductName(productMap.get(_productId).getName());
                }
            });
        }
        return pagination;
    }

    private Map<String, Set<Long>> accessible(User user) {
        if (user == null || UserRole.SYSADMIN.getValue().equals(user.getRole())) {
            return new HashMap<>(0);
        }
        Map<String, Set<Long>> map = new HashMap<>();
        List<ProductUser> products = productUserService.selectByExample(ProductUserExample.newBuilder()
                        .build()
                        .createCriteria()
                        .andUserIdEqualTo(user.getId())
                        .toExample(),
                MetaProductUser.COLUMN_NAME_PRODUCTID
        );
        if (!CollectionUtils.isEmpty(products)) {
            Set<Long> productIds = new HashSet<>();
            for (ProductUser product : products) {
                productIds.add(product.getProductId());
            }
            // 设置产品线管理员身份-产品线ID
            map.put(MetaProductUser.COLUMN_NAME_PRODUCTID, productIds);
        }
        List<ProjectUser> projectUsers = projectUserService.selectByExample(ProjectUserExample.newBuilder()
                        .distinct(true)
                        .build()
                        .createCriteria()
                        .andUserIdEqualTo(user.getId())
                        .andIsAdminEqualTo(ProjectUserAdmin.YES.getValue())
                        .toExample(),
                MetaProjectUser.COLUMN_NAME_PROJECTID);
        if (!CollectionUtils.isEmpty(projectUsers)) {
            Set<Long> projectIds = new HashSet<>();
            for (ProjectUser projectUser : projectUsers) {
                projectIds.add(projectUser.getProjectId());
            }
            // 设置工程管理员身份-工程ID
            map.put(MetaProjectUser.COLUMN_NAME_PROJECTID, projectIds);
        }

        List<EnvironmentUser> environmentUsers =
                environmentUserService.selectByExample(EnvironmentUserExample.newBuilder()
                                .distinct(true)
                                .build()
                                .createCriteria()
                                .andUserIdEqualTo(user.getId())
                                .toExample(),
                        MetaEnvironmentUser.COLUMN_NAME_ENVIRONMENTID
                );
        if (!CollectionUtils.isEmpty(environmentUsers)) {
            Set<Long> environmentIds = new HashSet<>();
            for (EnvironmentUser environmentUser : environmentUsers) {
                environmentIds.add(environmentUser.getEnvironmentId());
            }
            map.put(MetaEnvironmentUser.COLUMN_NAME_ENVIRONMENTID, environmentIds);
        }
        return map;
    }

    @Override
    public void parseProFile(MultipartFile file, ConfigGroup configGroup, Byte type) throws IOException {
        Long groupId = 0L;
        InputStream in = file.getInputStream();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
            Date now = DateTimeUtils.now();
            String fileContent = bufferedReader.lines().collect(Collectors.joining(System.lineSeparator()));
            List<String> conList = Splitter.on("\n").splitToList(fileContent);
            String memo = "";
            for (String content : conList) {
                if (content.trim().equals("")) {
                    continue;
                } else if (content.trim().startsWith("#") && content.charAt(1) != '*') {
                    memo = content.substring(1);
                } else if (content.trim().startsWith("#*")) {
                    groupId = configGroupService.updateGroupByImportType(type, configGroup, content.substring(2));
                } else {
                    // add a default group
                    List<String> configItem = Splitter.on("=").splitToList(content);
                    if (configItem.size() < 2) {
                        throw new BizException(CONVERT_TO_STRING_STATUS, CONVERT_TO_STRING_MSG);
                    }
                    if (groupId == 0L) {
                        groupId = configGroupService.updateGroupByImportType(type, configGroup, "default");
                    }
                    ConfigItem configItemInsert = ConfigItem.newBuilder()
                            .createTime(now)
                            .deleted(Deleted.OK.getValue())
                            .environmentId(configGroup.getEnvironmentId())
                            .name(configItem.get(0))
                            .groupId(groupId)
                            .memo(memo)
                            .projectId(configGroup.getProjectId())
                            .productId(configGroup.getProductId())
                            .updateTime(now)
                            .val(trim(configItem.get(1)))
                            .versionId(configGroup.getVersionId())
                            .build();
                    // check whether configuration exist
                    ConfigItem item = selectOneByExample(ConfigItemExample.newBuilder()
                                    .build()
                                    .createCriteria()
                                    .andDeletedEqualTo(Deleted.OK.getValue())
                                    .andVersionIdEqualTo(configGroup.getVersionId())
                                    .andNameEqualTo(configItemInsert.getName())
                                    .toExample(),
                            MetaConfigGroup.COLUMN_NAME_ID
                    );
                    if (item != null) {
                        if (type.equals(FileImportType.STOP.getValue())) {
                            configGroupService.deleteByPrimaryKey(groupId);
                            throw new BizException(CONFIG_ITEM_EXISTS_STATUS, CONFIG_ITEM_EXISTS_MSG);
                        } else {
                            // overwrite
                            item.setVal(configItemInsert.getVal());
                            item.setMemo(memo);
                            item.setGroupId(groupId);
                            updateByPrimaryKeySelective(item);
                            memo = "";
                        }
                    } else {
                        // add configuration
                        insertSelective(configItemInsert);
                        memo = "";
                    }
                }
            }
            in.close();
        } catch (IOException e) {
            throw new IOException("Parse file failed:{}", e);
        } finally {
            in.close();
        }
    }
}
