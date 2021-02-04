/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.controller;

import static com.baidu.brcc.common.ErrorStatusMsg.CONFIG_ITEM_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.CONFIG_ITEM_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.CONFIG_ITEM_ID_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.CONFIG_ITEM_ID_NOT_EXISTS_STATUS;
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
import static com.baidu.brcc.common.ErrorStatusMsg.NON_LOGIN_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.NON_LOGIN_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PRIV_MIS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PRIV_MIS_STATUS;
import static org.apache.commons.lang3.StringUtils.isBlank;
import static org.apache.commons.lang3.StringUtils.isNotBlank;
import static org.apache.commons.lang3.StringUtils.trim;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baidu.brcc.annotation.LoginUser;
import com.baidu.brcc.annotation.SaveLog;
import com.baidu.brcc.domain.ConfigGroup;
import com.baidu.brcc.domain.ConfigItem;
import com.baidu.brcc.domain.ConfigItemExample;
import com.baidu.brcc.domain.Environment;
import com.baidu.brcc.domain.Product;
import com.baidu.brcc.domain.Project;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.Version;
import com.baidu.brcc.domain.base.Pagination;
import com.baidu.brcc.domain.base.R;
import com.baidu.brcc.domain.em.Deleted;
import com.baidu.brcc.domain.meta.MetaConfigGroup;
import com.baidu.brcc.domain.meta.MetaConfigItem;
import com.baidu.brcc.domain.meta.MetaEnvironment;
import com.baidu.brcc.domain.meta.MetaProduct;
import com.baidu.brcc.domain.meta.MetaProject;
import com.baidu.brcc.domain.meta.MetaVersion;
import com.baidu.brcc.domain.vo.BatchConfigItemReq;
import com.baidu.brcc.domain.vo.ConfigItemForGroupVo;
import com.baidu.brcc.domain.vo.ConfigItemReq;
import com.baidu.brcc.domain.vo.ConfigItemVo;
import com.baidu.brcc.service.ConfigChangeLogService;
import com.baidu.brcc.service.ConfigGroupService;
import com.baidu.brcc.service.ConfigItemService;
import com.baidu.brcc.service.EnvironmentService;
import com.baidu.brcc.service.EnvironmentUserService;
import com.baidu.brcc.service.ProductService;
import com.baidu.brcc.service.ProjectService;
import com.baidu.brcc.service.RccCache;
import com.baidu.brcc.service.VersionService;
import com.baidu.brcc.utils.time.DateTimeUtils;

/**
 * 管理端配置项相关接口
 */
@RestController
@RequestMapping("item")
public class ConfigItemController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConfigItemController.class);

    @Autowired
    private ConfigItemService configItemService;

    @Autowired
    private EnvironmentUserService environmentUserService;

    @Autowired
    private ConfigGroupService groupService;

    @Autowired
    private ProjectService projectService;

    @Autowired
    private EnvironmentService environmentService;

    @Autowired
    private VersionService versionService;

    @Autowired
    private ConfigGroupService configGroupService;

    @Autowired
    private ProductService productService;

    @Autowired
    private ConfigChangeLogService configChangeLogService;

    @Autowired
    private RccCache rccCache;

    /**
     * 新增或修改配置
     *
     * @param req  req.id > 0 表示修改配置，否则新增
     * @param user
     *
     * @return
     */
    @SaveLog(scene = "修改配置",
            paramsIdxes = {0},
            params = {"req"})
    @PostMapping("save")
    public R<Long> saveItem(@RequestBody ConfigItemReq req, @LoginUser User user) {
        if (user == null) {
            return R.error(NON_LOGIN_STATUS, NON_LOGIN_MSG);
        }
        Long id = req.getId();
        String name = trim(req.getName());
        Date now = DateTimeUtils.now();
        Long cacheEvictVersionId = null;
        if (id != null && id > 0) {
            // 修改
            ConfigItem configItem = configItemService.selectByPrimaryKey(id);
            if (configItem == null || Deleted.DELETE.getValue().equals(configItem.getDeleted())) {
                return R.error(CONFIG_ITEM_NOT_EXISTS_STATUS, CONFIG_ITEM_NOT_EXISTS_MSG);
            }
            if (!environmentUserService.checkAuth(configItem.getProductId(), configItem.getProjectId(),
                    configItem.getEnvironmentId(), user)) {
                return R.error(PRIV_MIS_STATUS, PRIV_MIS_MSG);
            }
            ConfigItem update = new ConfigItem();
            update.setId(id);
            update.setUpdateTime(now);
            String newName = configItem.getName();
            if (isNotBlank(name)) {
                ConfigItem exists = configItemService.selectOneByExample(ConfigItemExample.newBuilder()
                                .build()
                                .createCriteria()
                                .andIdNotEqualTo(id)
                                .andNameEqualTo(name)
                                .andVersionIdEqualTo(configItem.getVersionId())
                                .toExample(),
                        MetaConfigItem.COLUMN_NAME_ID
                );
                if (exists != null) {
                    return R.error(CONFIG_ITEM_EXISTS_STATUS, CONFIG_ITEM_EXISTS_MSG);
                }
                update.setName(name);
                newName = name;
            }
            update.setVal(trim(req.getVal()));
            update.setMemo(trim(req.getMemo()));

            // 采集configChangeLog
            Long groupId = configItem.getGroupId();
            Map<String, String> oldConfigMap = configItemService.findConfigItemsByGroupId(groupId);

            // 更新
            configItemService.updateByPrimaryKeySelective(update);

            // 保存更新日志
            Map<String, String> newConfigMap = new HashMap<>();
            if (!CollectionUtils.isEmpty(oldConfigMap)) {
                newConfigMap.putAll(oldConfigMap);
                newConfigMap.remove(configItem.getName());
                newConfigMap.put(newName, update.getVal());
            }
            configChangeLogService.saveLogWithBackground(user.getId(), user.getName(), configItem.getGroupId(),
                    oldConfigMap, newConfigMap, new Date());

            cacheEvictVersionId = configItem.getVersionId();
        } else {
            // 新增
            Long groupId = req.getGroupId();
            if (null == groupId || groupId <= 0) {
                return R.error(GROUP_ID_NOT_EXISTS_STATUS, GROUP_ID_NOT_EXISTS_MSG);
            }
            if (StringUtils.isBlank(name)) {
                return R.error(CONFIG_KEY_NOT_EXISTS_STATUS, CONFIG_KEY_NOT_EXISTS_MSG);
            }
            ConfigGroup configGroup = groupService.selectByPrimaryKey(groupId);
            if (configGroup == null || Deleted.DELETE.getValue().equals(configGroup.getDeleted())) {
                return R.error(GROUP_NOT_EXISTS_STATUS, GROUP_NOT_EXISTS_MSG);
            }
            if (!environmentUserService.checkAuth(configGroup.getProductId(), configGroup.getProjectId(),
                    configGroup.getEnvironmentId(), user)) {
                return R.error(PRIV_MIS_STATUS, PRIV_MIS_MSG);
            }
            ConfigItem configItem = configItemService.selectOneByExample(ConfigItemExample.newBuilder()
                            .build()
                            .createCriteria()
                            .andDeletedEqualTo(Deleted.OK.getValue())
                            .andGroupIdEqualTo(groupId)
                            .andNameEqualTo(name)
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
                    .name(name)
                    .memo(trim(req.getMemo()))
                    .groupId(groupId)
                    .versionId(configGroup.getVersionId())
                    .environmentId(configGroup.getEnvironmentId())
                    .projectId(configGroup.getProjectId())
                    .productId(configGroup.getProductId())
                    .val(trim(req.getVal()))
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
            configChangeLogService.saveLogWithBackground(user.getId(), user.getName(), groupId,
                    oldConfigMap, newConfigMap, new Date());

            cacheEvictVersionId = configGroup.getVersionId();
            id = insert.getId();
        }

        if (cacheEvictVersionId != null && cacheEvictVersionId > 0) {
            rccCache.evictConfigItem(cacheEvictVersionId);
        }

        return R.ok(id);
    }

    /**
     * 批量修改配置项
     *
     * @param itemReq
     * @param user
     *
     * @return
     */
    @SaveLog(scene = "批量修改配置",
            paramsIdxes = {0},
            params = {"itemReq"})
    @PostMapping("batchSave")
    public R<Integer> batchSaveItems(@RequestBody BatchConfigItemReq itemReq, @LoginUser User user) {
        Long groupId = itemReq.getGroupId();
        if (groupId == null || groupId <= 0) {
            return R.error(GROUP_ID_NOT_EXISTS_STATUS, GROUP_ID_NOT_EXISTS_MSG);
        }
        ConfigGroup configGroup = groupService.selectByPrimaryKey(groupId);
        if (configGroup == null || Deleted.DELETE.getValue().equals(configGroup.getDeleted())) {
            return R.error(GROUP_NOT_EXISTS_STATUS, GROUP_NOT_EXISTS_MSG);
        }
        if (!environmentUserService.checkAuth(configGroup.getProductId(), configGroup.getProjectId(),
                configGroup.getEnvironmentId(), user)) {
            return R.error(PRIV_MIS_STATUS, PRIV_MIS_MSG);
        }
        int cnt = configItemService.batchSave(user, itemReq, configGroup);

        // 失效版本下的配置
        rccCache.evictConfigItem(configGroup.getVersionId());
        return R.ok(cnt);
    }

    /**
     * 删除配置
     *
     * @param itemId
     * @param user
     *
     * @return
     */
    @SaveLog(scene = "删除配置",
            paramsIdxes = {0},
            params = {"itemId"})
    @PostMapping("delete/{itemId}")
    public R delete(@PathVariable("itemId") Long itemId, @LoginUser User user) {
        if (user == null) {
            return R.error(NON_LOGIN_STATUS, NON_LOGIN_MSG);
        }
        if (itemId == null || itemId <= 0) {
            return R.error(CONFIG_ITEM_ID_NOT_EXISTS_STATUS, CONFIG_ITEM_ID_NOT_EXISTS_MSG);
        }
        ConfigItem configItem = configItemService.selectByPrimaryKey(
                itemId,
                MetaConfigItem.COLUMN_NAME_ID,
                MetaConfigItem.COLUMN_NAME_NAME,
                MetaConfigItem.COLUMN_NAME_GROUPID,
                MetaConfigItem.COLUMN_NAME_VERSIONID,
                MetaConfigItem.COLUMN_NAME_DELETED,
                MetaConfigItem.COLUMN_NAME_PRODUCTID,
                MetaConfigItem.COLUMN_NAME_PROJECTID,
                MetaConfigItem.COLUMN_NAME_ENVIRONMENTID);
        if (configItem == null || Deleted.DELETE.getValue().equals(configItem.getDeleted())) {
            return R.error(CONFIG_ITEM_NOT_EXISTS_STATUS, CONFIG_ITEM_NOT_EXISTS_MSG);
        }
        if (!environmentUserService.checkAuth(configItem.getProductId(), configItem.getProjectId(),
                configItem.getEnvironmentId(), user)) {
            return R.error(PRIV_MIS_STATUS, PRIV_MIS_MSG);
        }

        // 采集configChangeLog
        Map<String, String> oldConfigMap = configItemService.findConfigItemsByGroupId(configItem.getGroupId());

        int cnt = configItemService.updateByPrimaryKeySelective(ConfigItem.newBuilder()
                .id(itemId)
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
        configChangeLogService.saveLogWithBackground(user.getId(), user.getName(), configItem.getGroupId(),
                oldConfigMap, newConfigMap, new Date());

        // 失效版本下的配置
        rccCache.evictConfigItem(configItem.getVersionId());

        return R.ok(cnt);
    }

    /**
     * 根据分组查询配置
     * @param groupId
     * @param user
     * @return
     */
    @GetMapping("list")
    public R<List<ConfigItemForGroupVo>> listByGroup(@RequestParam("groupId") Long groupId, @LoginUser User user) {
        if (groupId == null || groupId <= 0) {
            return R.error(GROUP_ID_NOT_EXISTS_STATUS, GROUP_ID_NOT_EXISTS_MSG);
        }
        ConfigGroup configGroup = groupService.selectByPrimaryKey(groupId);
        if (configGroup == null || Deleted.DELETE.getValue().equals(configGroup.getDeleted())) {
            return R.error(GROUP_NOT_EXISTS_STATUS, GROUP_NOT_EXISTS_MSG);
        }
        List<ConfigItemForGroupVo> items =
                configItemService.selectByExample(ConfigItemExample.newBuilder()
                                .build()
                                .createCriteria()
                                .andDeletedEqualTo(Deleted.OK.getValue())
                                .andGroupIdEqualTo(groupId)
                                .toExample(),
                        item -> {
                            ConfigItemForGroupVo vo = new ConfigItemForGroupVo();
                            vo.setId(item.getId());
                            vo.setGroupId(groupId);
                            vo.setGroupName(configGroup.getName());
                            vo.setName(item.getName());
                            vo.setMemo(item.getMemo());
                            vo.setVal(item.getVal());
                            return vo;
                        },
                        MetaConfigItem.COLUMN_NAME_ID,
                        MetaConfigItem.COLUMN_NAME_NAME,
                        MetaConfigItem.COLUMN_NAME_MEMO,
                        MetaConfigItem.COLUMN_NAME_VAL
                );

        // 权限
        Map<String, Object> ext = new HashMap<>();
        boolean canManage = environmentUserService.checkAuth(configGroup.getProductId(), configGroup.getProjectId(),
                configGroup.getVersionId(), user);
        ext.put("canManage", canManage);

        return R.ok(items, ext);
    }

    /**
     * 配置检索，支持key， value模糊匹配查询
     * @param productId
     * @param projectId
     * @param key
     * @param val
     * @param pageNo
     * @param pageSize
     * @param user
     * @return
     */
    @GetMapping("query")
    public R<Pagination<ConfigItemVo>> query(
            @RequestParam(name = "productId", required = false) Long productId,
            @RequestParam(name = "projectId", required = false) Long projectId,
            @RequestParam(name = "key", required = false) String key,
            @RequestParam(name = "val", required = false) String val,
            @RequestParam(name = "pageNo", required = false, defaultValue = "1")
                    Integer pageNo,
            @RequestParam(name = "pageSize", required = false, defaultValue = "50")
                    Integer pageSize,
            @LoginUser User user

    ) {
        if (isBlank(val) && isBlank(key)) {
            return R.error(CONFIG_KEY_VALUE_NOT_EXISTS_STATUS, CONFIG_KEY_VALUE_NOT_EXISTS_MSG);
        }
        int offset = (pageNo - 1) * pageSize;
        Set<Long> groupIds = new HashSet<>();
        Set<Long> versionIds = new HashSet<>();
        Set<Long> environmentIds = new HashSet<>();
        Set<Long> projectIds = new HashSet<>();
        Set<Long> productIds = new HashSet<>();
        Pagination<ConfigItemVo> pagination = configItemService.pagination(ConfigItemExample.newBuilder()
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
                        .toExample(),
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
                    Product :: getId,
                    MetaProduct.COLUMN_NAME_ID,
                    MetaProduct.COLUMN_NAME_NAME
            );

            Map<Long, Project> projectMap = projectService.selectMapByPrimaryKeys(
                    projectIds,
                    Project :: getId,
                    MetaProject.COLUMN_NAME_ID,
                    MetaProject.COLUMN_NAME_NAME
            );

            Map<Long, Environment> environmentMap = environmentService.selectMapByPrimaryKeys(
                    environmentIds,
                    Environment :: getId,
                    MetaEnvironment.COLUMN_NAME_ID,
                    MetaEnvironment.COLUMN_NAME_NAME
            );

            Map<Long, Version> versionMap = versionService.selectMapByPrimaryKeys(
                    versionIds,
                    Version :: getId,
                    MetaVersion.COLUMN_NAME_ID,
                    MetaVersion.COLUMN_NAME_NAME
            );

            Map<Long, ConfigGroup> groupMap = configGroupService.selectMapByPrimaryKeys(
                    groupIds,
                    ConfigGroup :: getId,
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
        return R.ok(pagination);
    }

}
