/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.service.impl;

import static org.apache.commons.lang3.StringUtils.trim;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baidu.brcc.dao.ConfigItemMapper;
import com.baidu.brcc.dao.base.BaseMapper;
import com.baidu.brcc.domain.ConfigGroup;
import com.baidu.brcc.domain.ConfigItem;
import com.baidu.brcc.domain.ConfigItemExample;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.em.Deleted;
import com.baidu.brcc.domain.meta.MetaConfigItem;
import com.baidu.brcc.domain.vo.ApiItemVo;
import com.baidu.brcc.domain.vo.BatchConfigItemReq;
import com.baidu.brcc.domain.vo.ItemReq;
import com.baidu.brcc.service.ConfigChangeLogService;
import com.baidu.brcc.service.ConfigItemService;
import com.baidu.brcc.service.RccCache;
import com.baidu.brcc.service.base.GenericServiceImpl;
import com.baidu.brcc.utils.collections.CollectionUtils;
import com.baidu.brcc.utils.time.DateTimeUtils;

@Service("configItemService")
public class ConfigItemServiceImpl extends GenericServiceImpl<ConfigItem, Long, ConfigItemExample>
        implements ConfigItemService {

    @Autowired
    private ConfigItemMapper configItemMapper;

    @Autowired
    private ConfigChangeLogService configChangeLogService;

    @Autowired
    private RccCache rccCache;

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
    public List<ConfigItem> selectByProjectIdAndVersionIdAndNames(Long projectId, Long versionId, List<String> names) {
        return selectByExample(ConfigItemExample.newBuilder()
                .build()
                .createCriteria()
                .andDeletedEqualTo(Deleted.OK.getValue())
                .andProjectIdEqualTo(projectId)
                .andVersionIdEqualTo(versionId)
                .andNameIn(names, !org.springframework.util.CollectionUtils.isEmpty(names))
                .toExample()
        );
    }

    @Override
    @Transactional
    public Integer batchSave(User user, BatchConfigItemReq itemReq, ConfigGroup configGroup) {
        int result = 0;
        Long groupId = itemReq.getGroupId();
        Map<String, ConfigItem> itemMap =
                selectMapByExample(ConfigItemExample.newBuilder()
                                .build()
                                .createCriteria()
                                .andGroupIdEqualTo(groupId)
                                .andDeletedEqualTo(Deleted.OK.getValue())
                                .toExample(),
                        ConfigItem :: getName,
                        Function.identity(),
                        MetaConfigItem.COLUMN_NAME_ID,
                        MetaConfigItem.COLUMN_NAME_NAME,
                        MetaConfigItem.COLUMN_NAME_VAL
                );

        List<ItemReq> items = itemReq.getItems();
        Map<String, ItemReq> itemReqMap = CollectionUtils.toMap(items, ItemReq :: getName);

        Date now = DateTimeUtils.now();
        if (!org.springframework.util.CollectionUtils.isEmpty(items)) {
            boolean itemMapEmpty = org.springframework.util.CollectionUtils.isEmpty(itemMap);
            for (ItemReq req : items) {
                String name = trim(req.getName());
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
                    result++;
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
                    result++;
                }
            }
        }
        if (!org.springframework.util.CollectionUtils.isEmpty(itemMap)) {
            boolean isItemsMapEmpty = org.springframework.util.CollectionUtils.isEmpty(itemReqMap);
            for (ConfigItem item : itemMap.values()) {
                Long id = item.getId();
                String name = trim(item.getName());
                if (isItemsMapEmpty || itemReqMap.get(name) == null) {
                    // 需要删除的
                    ConfigItem configItemUpdate = ConfigItem.newBuilder()
                            .id(id)
                            .updateTime(now)
                            .deleted(Deleted.DELETE.getValue())
                            .build();
                    updateByPrimaryKeySelective(configItemUpdate);
                    result++;
                }
            }
        }

        // 记录changeLog
        Map<String, String> oldConfigMap = new HashMap<>();
        if (!org.springframework.util.CollectionUtils.isEmpty(itemMap)) {
            for (ConfigItem item : itemMap.values()) {
                oldConfigMap.put(item.getName(), item.getVal());
            }
        }
        Map<String, String> newConfigMap = new HashMap<>();
        if (!org.springframework.util.CollectionUtils.isEmpty(items)) {
            for (ItemReq item : items) {
                newConfigMap.put(item.getName(), item.getVal());
            }
        }
        configChangeLogService.saveLogWithBackground(user.getId(), user.getName(), groupId, oldConfigMap, newConfigMap,
                new Date());
        return result;
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
                ConfigItem :: getName,
                ConfigItem :: getVal,
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
        if (!org.springframework.util.CollectionUtils.isEmpty(delConfigItemIds)) {
            this.deleteByExample(ConfigItemExample.newBuilder()
                    .build()
                    .createCriteria()
                    .andIdIn(delConfigItemIds)
                    .toExample()
            );
        }
        if (!org.springframework.util.CollectionUtils.isEmpty(insertConfigItemList)) {
            for (ConfigItem configItem : insertConfigItemList) {
                this.insertSelective(configItem);
            }
        }

        if (!org.springframework.util.CollectionUtils.isEmpty(updateConfigItemList)) {
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
                ConfigItem :: getName,
                ConfigItem :: getVal,
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
                if (!org.springframework.util.CollectionUtils.isEmpty(items)) {
                    List<ApiItemVo> itemsVos = new ArrayList<>(items.size());
                    for (ConfigItem item : items) {
                        ApiItemVo v = new ApiItemVo().copyFrom(item);
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
                    itemVo = new ApiItemVo().copyFrom(item);
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
        if (org.springframework.util.CollectionUtils.isEmpty(itemsVos)) {
            List<ConfigItem> items = selectByProjectIdAndVersionId(projectId, versionId);
            if (!org.springframework.util.CollectionUtils.isEmpty(items)) {
                itemsVos = new ArrayList<>(items.size());
                for (ConfigItem item : items) {
                    ApiItemVo vo = new ApiItemVo().copyFrom(item);
                    itemsVos.add(vo);
                }
                rccCache.loadItems(versionId, itemsVos, true);
            }
        }
        return itemsVos;
    }

    @Override
    public List<ApiItemVo> getItemsByVersionIdAndNamesInCache(Long projectId, Long versionId, List<String> names) {
        List<ApiItemVo> result = null;
        if (org.springframework.util.CollectionUtils.isEmpty(names)) {
            result = rccCache.getItems(versionId);
        } else {
            result = rccCache.getItems(versionId, names);
        }
        if (org.springframework.util.CollectionUtils.isEmpty(result)) {
            // 缓存可用且配置项的HKEY不存在，加载所有版本
            if (rccCache.cacheEnable() && !rccCache.existsItemHKey(versionId)) {
                result = new ArrayList<>();
                List<ConfigItem> items = selectByProjectIdAndVersionId(
                        projectId,
                        versionId);
                if (!org.springframework.util.CollectionUtils.isEmpty(items)) {
                    List<ApiItemVo> itemsVos = new ArrayList<>(items.size());
                    for (ConfigItem item : items) {
                        ApiItemVo vo = new ApiItemVo().copyFrom(item);
                        itemsVos.add(vo);

                        if (org.springframework.util.CollectionUtils.isEmpty(names) || names.contains(item.getName())) {
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
                if (!org.springframework.util.CollectionUtils.isEmpty(items)) {
                    result = new ArrayList<>(items.size());
                    for (ConfigItem item : items) {
                        ApiItemVo vo = new ApiItemVo().copyFrom(item);
                        result.add(vo);
                    }
                    // rccCache.loadItems(versionId, result, CollectionUtils.isEmpty(names));
                }
            }
        }
        return result;
    }
}
