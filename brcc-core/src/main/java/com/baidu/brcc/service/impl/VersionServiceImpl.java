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

import static com.baidu.brcc.common.ErrorStatusMsg.CHILDREN_VERSION_NOT_EMPTY_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.CHILDREN_VERSION_NOT_EMPTY_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.COPY_CONFIG_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.COPY_CONFIG_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.COPY_GROUP_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.COPY_GROUP_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_ID_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_ID_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_NAME_NOT_EMPTY_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_NAME_NOT_EMPTY_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.GRAY_VERSION_EXIST_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.GRAY_VERSION_EXIST_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.GRAY_VERSION_MORE_THAN_ONE_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.GRAY_VERSION_MORE_THAN_ONE_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.GRAY_VERSION_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.GRAY_VERSION_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.GRAY_VERSION_RELETED_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.GRAY_VERSION_RELETED_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.MAIN_VERSION_ID_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.MAIN_VERSION_ID_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PRIV_MIS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PRIV_MIS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_COPY_DEST_VERSION_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_COPY_DEST_VERSION_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_COPY_SRC_VERSION_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_COPY_SRC_VERSION_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_NAME_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_NAME_NOT_EXISTS_STATUS;
import static com.baidu.brcc.domain.em.ProjectType.PUBLIC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;

import com.baidu.brcc.domain.ProductExample;
import com.baidu.brcc.domain.ProductUser;
import com.baidu.brcc.domain.ProductUserExample;
import com.baidu.brcc.domain.ProjectExample;
import com.baidu.brcc.domain.ProjectUser;
import com.baidu.brcc.domain.ProjectUserExample;
import com.baidu.brcc.domain.VersionExample;
import com.baidu.brcc.domain.em.ProductUserAdmin;
import com.baidu.brcc.domain.em.ProjectType;
import com.baidu.brcc.domain.em.ProjectUserAdmin;
import com.baidu.brcc.domain.em.UserRole;
import com.baidu.brcc.domain.meta.MetaConfigGroup;
import com.baidu.brcc.domain.meta.MetaConfigItem;
import com.baidu.brcc.domain.meta.MetaProductUser;
import com.baidu.brcc.domain.meta.MetaProjectUser;
import com.baidu.brcc.service.ProductUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.baidu.brcc.common.ErrorStatusMsg;
import com.baidu.brcc.dao.VersionMapper;
import com.baidu.brcc.dao.base.BaseMapper;
import com.baidu.brcc.domain.ConfigGroup;
import com.baidu.brcc.domain.ConfigGroupExample;
import com.baidu.brcc.domain.ConfigItem;
import com.baidu.brcc.domain.ConfigItemExample;
import com.baidu.brcc.domain.Environment;
import com.baidu.brcc.domain.Product;
import com.baidu.brcc.domain.Project;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.Version;
import com.baidu.brcc.domain.em.Deleted;
import com.baidu.brcc.domain.exception.BizException;
import com.baidu.brcc.domain.meta.MetaEnvironment;
import com.baidu.brcc.domain.meta.MetaProduct;
import com.baidu.brcc.domain.meta.MetaProject;
import com.baidu.brcc.domain.meta.MetaVersion;
import com.baidu.brcc.domain.vo.ApiVersionVo;
import com.baidu.brcc.domain.vo.VersionNodeVo;
import com.baidu.brcc.service.ConfigGroupService;
import com.baidu.brcc.service.ConfigItemService;
import com.baidu.brcc.service.EnvironmentService;
import com.baidu.brcc.service.EnvironmentUserService;
import com.baidu.brcc.service.ProductService;
import com.baidu.brcc.service.ProjectService;
import com.baidu.brcc.service.ProjectUserService;
import com.baidu.brcc.service.RccCache;
import com.baidu.brcc.service.VersionService;
import com.baidu.brcc.service.base.GenericServiceImpl;
import com.baidu.brcc.utils.time.DateTimeUtils;

@Service("versionService")
public class VersionServiceImpl extends GenericServiceImpl<Version, Long, VersionExample> implements VersionService {

    @Autowired
    private VersionMapper versionMapper;

    @Autowired
    private ConfigGroupService configGroupService;

    @Autowired
    private ConfigItemService configItemService;

    @Autowired
    private ProductService productService;

    @Autowired
    private ProjectService projectService;

    @Autowired
    private EnvironmentService environmentService;

    @Autowired
    private EnvironmentUserService environmentUserService;

    @Autowired
    private ProjectUserService projectUserService;

    @Autowired
    private RccCache rccCache;

    @Autowired
    private ProductUserService productUserService;

    @Override
    public BaseMapper<Version, Long, VersionExample> getMapper() {
        return versionMapper;
    }

    @Override
    public VersionExample newExample() {
        return VersionExample.newBuilder().build();
    }

    @Override
    public VersionExample newIdInExample(List<Long> ids) {
        return VersionExample.newBuilder().build().createCriteria().andIdIn(ids).toExample();
    }

    @Override
    @Transactional
    public int updateVersion(@NonNull Version version, String name, String memo, User loginUser) {
        Long versionId = version.getId();
        Version update = new Version();
        update.setId(versionId);
        update.setUpdateTime(new Date());
        if (StringUtils.isNotBlank(name)) {
            Version exists = selectOneByExample(VersionExample.newBuilder()
                            .build()
                            .createCriteria()
                            .andIdNotEqualTo(versionId)
                            .andNameEqualTo(name)
                            .andEnvironmentIdEqualTo(version.getEnvironmentId())
                            .andDeletedEqualTo(Deleted.OK.getValue())
                            .toExample(),
                    MetaVersion.COLUMN_NAME_ID
            );
            if (exists != null) {
                throw new BizException(ErrorStatusMsg.PARAM_ERROR_STATUS, "版本已存在");
            }
            update.setName(name);
        }
        update.setMemo(memo);
        int cnt = updateByPrimaryKeySelective(update);

        version.getEnvironmentId();

        // 失效id->version的缓存
        rccCache.evictVersionById(Arrays.asList(versionId));

        return cnt;
    }

    @Override
    @Transactional
    public Long saveVersion(Long environmentId, String name, String memo, User loginUser) {
        // 新增
        if (null == environmentId || environmentId <= 0) {
            throw new BizException(ENVIRONMENT_ID_NOT_EXISTS_STATUS, ENVIRONMENT_ID_NOT_EXISTS_MSG);
        }
        if (StringUtils.isBlank(name)) {
            throw new BizException(VERSION_NAME_NOT_EXISTS_STATUS, VERSION_NAME_NOT_EXISTS_MSG);
        }
        Environment environment = environmentService.selectByPrimaryKey(environmentId);
        if (environment == null || Deleted.DELETE.getValue().equals(environment.getDeleted())) {
            throw new BizException(ENVIRONMENT_NOT_EXISTS_STATUS, ENVIRONMENT_NOT_EXISTS_MSG);
        }
        if (!environmentUserService.checkAuth(environment.getProductId(), environment.getProjectId(), environmentId, loginUser)) {
            throw new BizException(PRIV_MIS_STATUS, PRIV_MIS_MSG);
        }
        Version version = selectOneByExample(VersionExample.newBuilder()
                        .build()
                        .createCriteria()
                        .andDeletedEqualTo(Deleted.OK.getValue())
                        .andEnvironmentIdEqualTo(environmentId)
                        .andNameEqualTo(name)
                        .toExample(),
                MetaVersion.COLUMN_NAME_ID
        );
        if (version != null) {
            throw new BizException(VERSION_EXISTS_STATUS, VERSION_EXISTS_MSG);
        }

        Version insert = new Version();
        insert.setUpdateTime(new Date());
        insert.setCreateTime(new Date());
        insert.setDeleted(Deleted.OK.getValue());
        insert.setName(name);
        insert.setMemo(memo);
        insert.setEnvironmentId(environmentId);
        insert.setProjectId(environment.getProjectId());
        insert.setProductId(environment.getProductId());
        insert.setCheckSum(UUID.randomUUID().toString());
        insert.setCheckSumDate(new Date());
        insertSelective(insert);
        return insert.getId();
    }

    @Override
    @Transactional
    public Long saveGrayVersion(Long mainVersionId, Long environmentId, String name, String memo, User loginUser) {
        // 新增
        if (null == mainVersionId || mainVersionId <= 0) {
            throw new BizException(MAIN_VERSION_ID_NOT_EXISTS_STATUS, MAIN_VERSION_ID_NOT_EXISTS_MSG);
        }
        if (null == environmentId || environmentId <= 0) {
            throw new BizException(ENVIRONMENT_ID_NOT_EXISTS_STATUS, ENVIRONMENT_ID_NOT_EXISTS_MSG);
        }
        if (StringUtils.isBlank(name)) {
            throw new BizException(VERSION_NAME_NOT_EXISTS_STATUS, VERSION_NAME_NOT_EXISTS_MSG);
        }
        Environment environment = environmentService.selectByPrimaryKey(environmentId);
        if (environment == null || Deleted.DELETE.getValue().equals(environment.getDeleted())) {
            throw new BizException(ENVIRONMENT_NOT_EXISTS_STATUS, ENVIRONMENT_NOT_EXISTS_MSG);
        }
        if (!environmentUserService.checkAuth(environment.getProductId(), environment.getProjectId(), environmentId, loginUser)) {
            throw new BizException(PRIV_MIS_STATUS, PRIV_MIS_MSG);
        }
        // 灰度版本名称不能重复
        Version version = selectOneByExample(VersionExample.newBuilder()
                        .build()
                        .createCriteria()
                        .andDeletedEqualTo(Deleted.OK.getValue())
                        .andEnvironmentIdEqualTo(environmentId)
                        .andNameEqualTo(name)
                        .toExample(),
                MetaVersion.COLUMN_NAME_ID
        );
        if (version != null) {
            throw new BizException(GRAY_VERSION_EXIST_STATUS, GRAY_VERSION_EXIST_MSG);
        }
        Version grayVersion = selectOneByExample(VersionExample.newBuilder()
                        .build()
                        .createCriteria()
                        .andDeletedEqualTo(Deleted.OK.getValue())
                        .andEnvironmentIdEqualTo(environmentId)
                        .andMainVersionIdEqualTo(mainVersionId)
                        .toExample(),
                MetaVersion.COLUMN_NAME_ID
        );
        if (grayVersion != null) {
            throw new BizException(GRAY_VERSION_RELETED_STATUS, GRAY_VERSION_RELETED_MSG);
        }
        Version insert = new Version();
        insert.setUpdateTime(new Date());
        insert.setCreateTime(new Date());
        insert.setDeleted(Deleted.OK.getValue());
        insert.setName(name);
        insert.setMemo(memo);
        insert.setEnvironmentId(environmentId);
        insert.setProjectId(environment.getProjectId());
        insert.setProductId(environment.getProductId());
        insert.setCheckSum(UUID.randomUUID().toString());
        insert.setCheckSumDate(new Date());
        insert.setMainVersionId(mainVersionId);
        insertSelective(insert);
        return insert.getId();
    }

    @Override
    public Version selectByMainVersionId(Long mainVersionId) {
        List<Version> grayVersions = selectByExample(VersionExample.newBuilder()
                .build()
                .createCriteria()
                .andDeletedEqualTo(Deleted.OK.getValue())
                .andMainVersionIdEqualTo(mainVersionId)
                .toExample()
        );
        if (grayVersions == null) {
            throw new BizException(GRAY_VERSION_NOT_EXISTS_STATUS, GRAY_VERSION_NOT_EXISTS_MSG);
        }
        if (grayVersions.size() != 1) {
            throw new BizException(GRAY_VERSION_MORE_THAN_ONE_STATUS, GRAY_VERSION_MORE_THAN_ONE_MSG);
        }
        return grayVersions.get(0);
    }

    @Override
    public Integer deleteCascadeByVersionId(Long versionId) {

        Date now = DateTimeUtils.now();
        Version version = selectByPrimaryKey(versionId);

        if (version == null) {
            return 0;
        }
        Set<Long> resolved = new HashSet<>();
        if (!CollectionUtils.isEmpty(getChildrenVersionById(versionId, resolved))) {
            throw new BizException(CHILDREN_VERSION_NOT_EMPTY_STATUS, CHILDREN_VERSION_NOT_EMPTY_MSG);
        }
        // 删除版本
        int del = updateByPrimaryKeySelective(Version.newBuilder()
                .id(versionId)
                .deleted(Deleted.DELETE.getValue())
                .updateTime(now)
                .build());

        // 删除分组
        configGroupService.deleteByVersionId(versionId);

        // 删除配置项
        configItemService.deleteByVersionId(versionId);

        // 失效缓存
        rccCache.deleteVersionCascade(version);

        return del;
    }

    @Override
    public int deleteByEnvId(Long envId) {
        return updateByExampleSelective(
                Version.newBuilder()
                        .deleted(Deleted.DELETE.getValue())
                        .updateTime(DateTimeUtils.now())
                        .build(),
                VersionExample.newBuilder()
                        .build()
                        .createCriteria()
                        .andEnvironmentIdEqualTo(envId)
                        .andDeletedEqualTo(Deleted.DELETE.getValue())
                        .toExample());
    }

    @Override
    public int deleteByProjectId(Long projectId) {
        // if common, check the children versions
        if (projectService.selectByPrimaryKey(projectId).getProjectType().equals(PUBLIC.getValue())) {
            List<Version> versions = selectByExample(VersionExample.newBuilder()
                    .build()
                    .createCriteria()
                    .andProjectIdEqualTo(projectId)
                    .andDeletedEqualTo(Deleted.OK.getValue())
                    .toExample());
            for (Version item : versions) {
                Set<Long> resolved = new HashSet<>();
                if (!CollectionUtils.isEmpty(getChildrenVersionById(item.getId(), resolved))) {
                    throw new BizException(CHILDREN_VERSION_NOT_EMPTY_STATUS, CHILDREN_VERSION_NOT_EMPTY_MSG);
                }
            }
        }
        return updateByExampleSelective(
                Version.newBuilder()
                        .deleted(Deleted.DELETE.getValue())
                        .updateTime(DateTimeUtils.now())
                        .build(),
                VersionExample.newBuilder()
                        .build()
                        .createCriteria()
                        .andProjectIdEqualTo(projectId)
                        .andDeletedEqualTo(Deleted.OK.getValue())
                        .toExample());
    }

    @Transactional
    @Override
    public void copyConfigItemsFromVersion(Long srcVerId, Long destVerId) {

        Version destVersion = selectByPrimaryKey(destVerId);
        if (destVersion == null) {
            throw new BizException(VERSION_COPY_DEST_VERSION_NOT_EXISTS_STATUS,
                    VERSION_COPY_DEST_VERSION_NOT_EXISTS_MSG);
        }
        Version srcVersion = selectByPrimaryKey(srcVerId);
        if (srcVersion == null) {
            throw new BizException(VERSION_COPY_SRC_VERSION_NOT_EXISTS_STATUS, VERSION_COPY_SRC_VERSION_NOT_EXISTS_MSG);
        }

        // 根据源versionId查找所有group，使用新增的versionId,复制一份
        List<ConfigGroup> configGroupList = configGroupService.selectByExample(
                ConfigGroupExample.newBuilder()
                        .build()
                        .createCriteria()
                        .andVersionIdEqualTo(srcVerId)
                        .andDeletedEqualTo(Deleted.OK.getValue())
                        .toExample());

        // find all groups by destVerId
        Map<String, ConfigGroup> destMap =
                configGroupService.selectMapByExample(ConfigGroupExample.newBuilder()
                                .build()
                                .createCriteria()
                                .andVersionIdEqualTo(destVerId)
                                .andDeletedEqualTo(Deleted.OK.getValue())
                                .toExample(),
                        ConfigGroup::getName,
                        Function.identity(),
                        MetaConfigGroup.COLUMN_NAME_ID,
                        MetaConfigGroup.COLUMN_NAME_NAME
                );
        // if groupName exist
        if (!CollectionUtils.isEmpty(configGroupList)) {
            for (ConfigGroup configGroup : configGroupList) {
                if (!CollectionUtils.isEmpty(destMap) && destMap.get(configGroup.getName()) != null) {
                    throw new BizException(COPY_GROUP_EXISTS_STATUS, COPY_GROUP_EXISTS_MSG);
                }
            }
        }
        Date now = new Date();
        for (ConfigGroup configGroup : configGroupList) {
            Long srcGroupId = configGroup.getId();
            configGroup.setId(null);
            configGroup.setMemo("");
            configGroup.setCreateTime(now);
            configGroup.setUpdateTime(now);
            configGroup.setVersionId(destVerId);
            configGroup.setDeleted(Deleted.OK.getValue());
            configGroup.setEnvironmentId(destVersion.getEnvironmentId());
            configGroup.setProjectId(destVersion.getProjectId());
            configGroup.setProductId(destVersion.getProductId());
            configGroupService.insertSelective(configGroup);
            configGroup.setId(configGroup.getId());

            // 从一个分组复制到另一个分组
            copyConfigItemsFromGroup(srcGroupId, configGroup);
        }

    }

    @Transactional
    @Override
    public void copyConfigItemsFromGroup(Long srcGroupId, ConfigGroup destGroup) {
        Date now = new Date();

        List<ConfigItem> srcConfigItems = configItemService.selectByExample(ConfigItemExample.newBuilder()
                .build()
                .createCriteria()
                .andGroupIdEqualTo(srcGroupId)
                .andDeletedEqualTo(Deleted.OK.getValue())
                .toExample());

        // find configItems by destGroup
        Map<String, ConfigItem> destMap =
                configItemService.selectMapByExample(ConfigItemExample.newBuilder()
                                .build()
                                .createCriteria()
                                .andVersionIdEqualTo(destGroup.getVersionId())
                                .andDeletedEqualTo(Deleted.OK.getValue())
                                .toExample(),
                        ConfigItem::getName,
                        Function.identity(),
                        MetaConfigItem.COLUMN_NAME_ID,
                        MetaConfigItem.COLUMN_NAME_NAME,
                        MetaConfigItem.COLUMN_NAME_VAL
                );
        if (!CollectionUtils.isEmpty(srcConfigItems)) {
            for (ConfigItem configItem : srcConfigItems) {
                if (!CollectionUtils.isEmpty(destMap) && destMap.get(configItem.getName()) != null) {
                    throw new BizException(COPY_CONFIG_EXISTS_STATUS, COPY_CONFIG_EXISTS_MSG);
                }
            }
        }
        for (ConfigItem srcConfigItem : srcConfigItems) {
            srcConfigItem.setId(null);
            srcConfigItem.setMemo("");
            srcConfigItem.setGroupId(destGroup.getId());
            srcConfigItem.setCreateTime(now);
            srcConfigItem.setUpdateTime(now);
            srcConfigItem.setVersionId(destGroup.getVersionId());
            srcConfigItem.setGroupId(destGroup.getId());
            srcConfigItem.setVersionId(destGroup.getVersionId());
            srcConfigItem.setEnvironmentId(destGroup.getEnvironmentId());
            srcConfigItem.setProjectId(destGroup.getProjectId());
            srcConfigItem.setProductId(destGroup.getProductId());
        }
        configItemService.saveConfigItems(srcConfigItems, null, null);

    }

    @Override
    public List<VersionNodeVo> myAllVersion(User user, Long productId, Long projectId) {
        Map<Long, Product> productManageMap = new HashMap<>();
        Map<Long, Project> projectManageMap = new HashMap<>();
        Map<Long, Project> projectMemberMap = new HashMap<>();
        Map<Long, Environment> envAccessMap = new HashMap<>();
        Map<Long, Version> versionAccessMap = new HashMap<>();
        Map<Long, ConfigGroup> groupAccessMap = new HashMap<>();

        configGroupService.loadGroupByUser(
                user,
                ConfigGroupService.VERSION,
                productManageMap,
                projectManageMap,
                projectMemberMap,
                envAccessMap,
                versionAccessMap,
                groupAccessMap
        );

        List<VersionNodeVo> versionNodeVos = new ArrayList<>();
        if (!CollectionUtils.isEmpty(versionAccessMap)) {
            Set<Long> lostEnvironmentIds = new HashSet<>();
            Set<Long> lostProjectIds = new HashSet<>();
            Set<Long> lostProductIds = new HashSet<>();
            for (Version version : versionAccessMap.values()) {
                if (productId != null && productId > 0 && !productId.equals(version.getProductId())) {
                    continue;
                }
                if (projectId != null && projectId > 0 && !projectId.equals(version.getProjectId())) {
                    continue;
                }
                VersionNodeVo vo = new VersionNodeVo();
                vo.setVersionId(version.getId());
                vo.setVersionName(version.getName());
                vo.setEnvironmentId(version.getEnvironmentId());
                vo.setProjectId(version.getProjectId());
                vo.setProductId(version.getProductId());
                versionNodeVos.add(vo);

                if (!envAccessMap.containsKey(version.getEnvironmentId())) {
                    lostEnvironmentIds.add(version.getEnvironmentId());
                }

                if (!projectManageMap.containsKey(version.getProjectId())) {
                    lostProjectIds.add(version.getProjectId());
                }

                if (!productManageMap.containsKey(version.getProductId())) {
                    lostProductIds.add(version.getProductId());
                }
            }

            if (!CollectionUtils.isEmpty(lostProductIds)) {
                List<Product> products = productService.selectByPrimaryKeys(
                        lostProductIds,
                        MetaProduct.COLUMN_NAME_ID,
                        MetaProduct.COLUMN_NAME_NAME
                );

                if (!CollectionUtils.isEmpty(products)) {
                    for (Product product : products) {
                        productManageMap.put(product.getId(), product);
                    }
                }
            }

            if (!CollectionUtils.isEmpty(lostProjectIds)) {
                List<Project> projects = projectService.selectByPrimaryKeys(
                        lostProjectIds,
                        MetaProject.COLUMN_NAME_ID,
                        MetaProject.COLUMN_NAME_NAME,
                        MetaProject.COLUMN_NAME_PRODUCTID
                );

                if (!CollectionUtils.isEmpty(projects)) {
                    for (Project project : projects) {
                        projectManageMap.put(project.getId(), project);
                    }
                }
            }

            if (!CollectionUtils.isEmpty(lostEnvironmentIds)) {
                List<Environment> environments = environmentService.selectByPrimaryKeys(
                        lostEnvironmentIds,
                        MetaEnvironment.COLUMN_NAME_ID,
                        MetaEnvironment.COLUMN_NAME_NAME,
                        MetaEnvironment.COLUMN_NAME_PROJECTID,
                        MetaEnvironment.COLUMN_NAME_PRODUCTID
                );

                if (!CollectionUtils.isEmpty(environments)) {
                    for (Environment environment : environments) {
                        envAccessMap.put(environment.getId(), environment);
                    }
                }
            }

            for (VersionNodeVo vo : versionNodeVos) {
                Environment environment = envAccessMap.get(vo.getEnvironmentId());
                if (environment != null) {
                    vo.setEnvironmentName(environment.getName());
                }
                Project project = projectManageMap.get(vo.getProjectId());
                if (project != null) {
                    vo.setProjectName(project.getName());
                }
                Product product = productManageMap.get(vo.getProductId());
                if (product != null) {
                    vo.setProductName(product.getName());
                }
            }
        }
        return versionNodeVos;
    }

    @Override
    public List<VersionNodeVo> myCommonVersion(User user, Long productId, Long projectId, Long versionId) {
        List<VersionNodeVo> res = new ArrayList<>();
        Map<Long, Product> productManageMap = new HashMap<>();
        Map<Long, Project> projectMap = new HashMap<>();
        // 系统管理员
        if (UserRole.SYSADMIN.getValue().equals(user.getRole())) {
            Map<Long, Product> tmp = productService.selectMapByExample(ProductExample.newBuilder()
                            .build()
                            .createCriteria()
                            .toExample(),
                    Product::getId,
                    MetaProduct.COLUMN_NAME_ID,
                    MetaProduct.COLUMN_NAME_NAME
            );
            if (!org.springframework.util.CollectionUtils.isEmpty(tmp)) {
                productManageMap.putAll(tmp);
            }
        } else {
            // 产品线管理员
            List<Long> productIds = productUserService.selectByExample(ProductUserExample.newBuilder()
                            .distinct(true)
                            .build()
                            .createCriteria()
                            .andUserIdEqualTo(user.getId())
                            .andIsAdminEqualTo(ProductUserAdmin.YES.getValue())
                            .toExample(),
                    ProductUser::getProductId,
                    MetaProductUser.COLUMN_NAME_PRODUCTID

            );
            if (!org.springframework.util.CollectionUtils.isEmpty(productIds)) {
                Map<Long, Product> tmp = productService.selectMapByPrimaryKeys(
                        productIds,
                        Product::getId,
                        MetaProduct.COLUMN_NAME_ID,
                        MetaProduct.COLUMN_NAME_NAME
                );
                if (!org.springframework.util.CollectionUtils.isEmpty(tmp)) {
                    productManageMap.putAll(tmp);
                }
            }
        }
        if (!org.springframework.util.CollectionUtils.isEmpty(productManageMap)) {
            for (Map.Entry<Long, Product> entry : productManageMap.entrySet()) {
                Map<Long, Project> commonProject = projectService.selectMapByExample(ProjectExample.newBuilder()
                                .build()
                                .createCriteria()
                                .andProductIdEqualTo(entry.getKey())
                                .andProjectTypeEqualTo(ProjectType.PUBLIC.getValue())
                                .andDeletedEqualTo(Deleted.OK.getValue())
                                .toExample(),
                        Project::getId,
                        MetaProject.COLUMN_NAME_ID,
                        MetaProject.COLUMN_NAME_NAME);
                if (!org.springframework.util.CollectionUtils.isEmpty(commonProject)) {
                    projectMap.putAll(commonProject);
                }
            }
        }
        // 工程管理员
        List<ProjectUser> projectUserMap = projectUserService.selectByExample(ProjectUserExample.newBuilder()
                .build()
                .createCriteria()
                .andUserIdEqualTo(user.getId())
                .andIsAdminEqualTo(ProjectUserAdmin.YES.getValue())
                .toExample());
        List<Long> projectIds = new ArrayList<>();
        if (projectUserMap.size() > 0) {
            for (ProjectUser item : projectUserMap) {
                projectIds.add(item.getProjectId());
            }
        }
        if (projectIds.size() > 0) {
            Map<Long, Project> items = projectService.selectMapByPrimaryKeys(projectIds,
                    Project::getId,
                    MetaProject.COLUMN_NAME_ID,
                    MetaProject.COLUMN_NAME_NAME);
            if (!org.springframework.util.CollectionUtils.isEmpty(items)) {
                projectMap.putAll(items);
            }
        }
        List<Version> versionList = new ArrayList<>();
        if (!org.springframework.util.CollectionUtils.isEmpty(projectMap)) {
            for (Map.Entry<Long, Project> entry : projectMap.entrySet()) {
                List<Version> versions = this.selectByExample(VersionExample.newBuilder()
                        .build()
                        .createCriteria()
                        .andProjectIdEqualTo(entry.getKey())
                        .toExample());
                if (versions.size() > 0) {
                    versionList.addAll(versions);
                }
            }
        }
        if (versionList.size() > 0) {
            for (Version version : versionList) {
                if (version.getId().equals(versionId)) {
                    continue;
                }
                VersionNodeVo versionNodeVo = new VersionNodeVo();
                versionNodeVo.setVersionId(version.getId());
                versionNodeVo.setVersionName(version.getName());
                versionNodeVo.setEnvironmentId(version.getEnvironmentId());
                versionNodeVo.setEnvironmentName(environmentService.selectByPrimaryKey(version.getEnvironmentId()).getName());
                versionNodeVo.setProductId(version.getProductId());
                versionNodeVo.setProductName(productService.selectByPrimaryKey(version.getProductId()).getName());
                versionNodeVo.setProjectId(version.getProjectId());
                versionNodeVo.setProjectName(projectService.selectByPrimaryKey(version.getProjectId()).getName());
                res.add(versionNodeVo);
            }
        }
        return res;
    }

    @Override
    public Boolean checkAuth(User user, Long srcVerId, Long destVerId) {

        List<Version> versions = this.selectByExample(VersionExample.newBuilder()
                .build()
                .createCriteria()
                .andIdIn(new ArrayList<Long>() {{
                    add(srcVerId);
                    add(destVerId);
                }})
                .toExample());
        if (CollectionUtils.isEmpty(versions) || versions.size() != 2) {

            return false;
        }

        boolean checkRet = false;
        for (Version version : versions) {
            checkRet = environmentUserService.checkAuth(version.getProductId(),
                    version.getProjectId(),
                    version.getEnvironmentId(),
                    user);
        }

        return checkRet;

    }

    @Override
    public Boolean checkAuths(User user, Long versionId, List<Long> depIds) {
        List<Long> ids = new ArrayList<>();
        ids.add(versionId);
        List<Version> versions = this.selectByExample(VersionExample.newBuilder()
                .build()
                .createCriteria()
                .andIdIn(ids)
                .toExample());
        if (CollectionUtils.isEmpty(versions)) {

            return false;
        }

        boolean checkRet = false;
        for (Version version : versions) {
            checkRet = environmentUserService.checkAuth(version.getProductId(),
                    version.getProjectId(),
                    version.getEnvironmentId(),
                    user);
        }

        return checkRet;
    }

    @Override
    public Version selectByProjectIdAndEnvironmentIdAndName(Long projectId, Long environmentId, String name) {
        return selectOneByExample(VersionExample.newBuilder()
                .build()
                .createCriteria()
                .andDeletedEqualTo(Deleted.OK.getValue())
                .andProjectIdEqualTo(projectId)
                .andEnvironmentIdEqualTo(environmentId)
                .andNameEqualTo(name)
                .toExample()
        );
    }

    @Override
    public List<Version> selectByProjectIdAndEnvironment(Long projectId, Long environmentId) {
        return selectByExample(VersionExample.newBuilder()
                .build()
                .createCriteria()
                .andDeletedEqualTo(Deleted.OK.getValue())
                .andProjectIdEqualTo(projectId)
                .andEnvironmentIdEqualTo(environmentId)
                .toExample()
        );
    }

    @Override
    public List<Long> selectIdsByEnvironmentIds(Long projectId, List<Long> environmentIds) {
        if (projectId == null || projectId <= 0 || CollectionUtils.isEmpty(environmentIds)) {
            return null;
        }
        return selectByExample(VersionExample.newBuilder()
                        .build()
                        .createCriteria()
                        .andDeletedEqualTo(Deleted.OK.getValue())
                        .andProjectIdEqualTo(projectId)
                        .andEnvironmentIdIn(environmentIds)
                        .toExample(),
                Version::getId,
                MetaVersion.COLUMN_NAME_ID
        );
    }

    @Override
    public ApiVersionVo getByEnvironmentByIdInCache(Long versionId) {
        ApiVersionVo vo = rccCache.getVersionById(versionId);
        if (vo == null) {
            Version v = selectByPrimaryKey(versionId);
            if (v != null) {
                vo = new ApiVersionVo().copyFrom(v);
                rccCache.loadVersionForId(vo);
            }
        }
        return vo;
    }

    @Override
    public ApiVersionVo getByEnvironmentAndNameInCache(Long projectId, Long environmentId, String name) {
        ApiVersionVo versionVo = rccCache.getVersion(environmentId, name);
        if (versionVo == null) {
            // 缓存可用且版本的HKEY不存在，加载所有版本
            if (rccCache.cacheEnable() && !rccCache.existsVersionHKey(environmentId)) {
                List<Version> versions = selectByProjectIdAndEnvironment(
                        projectId,
                        environmentId
                );
                if (!CollectionUtils.isEmpty(versions)) {
                    List<ApiVersionVo> versionVos = new ArrayList<>(versions.size());
                    for (Version version : versions) {
                        ApiVersionVo vo = new ApiVersionVo().copyFrom(version);
                        versionVos.add(vo);
                        if (StringUtils.equals(name, version.getName())) {
                            versionVo = vo;
                        }
                    }
                    rccCache.loadVersions(environmentId, versionVos);
                }
            } else {
                Version version = selectByProjectIdAndEnvironmentIdAndName(
                        projectId,
                        environmentId,
                        name);
                if (version != null) {
                    versionVo = new ApiVersionVo().copyFrom(version);
                    // 为了数据一致性，此处不能重载缓存
                    // rccCache.loadVersion(versionVo);
                }
            }
        }
        return versionVo;
    }

    @Override
    public List<ApiVersionVo> getAllByEnvironmentIdInCache(Long projectId, Long environmentId) {
        List<ApiVersionVo> versionVos = rccCache.getVersions(environmentId);
        if (CollectionUtils.isEmpty(versionVos)) {
            List<Version> versions = selectByProjectIdAndEnvironment(
                    projectId,
                    environmentId
            );
            if (!CollectionUtils.isEmpty(versions)) {
                versionVos = new ArrayList<>(versions.size());
                for (Version version : versions) {
                    ApiVersionVo vo = new ApiVersionVo();
                    vo.setProjectId(version.getProjectId());
                    vo.setEnvironmentId(version.getEnvironmentId());
                    vo.setVersionId(version.getId());
                    vo.setVersionName(version.getName());
                    vo.setCheckSum(version.getCheckSum());
                    versionVos.add(vo);
                }
                rccCache.loadVersions(environmentId, versionVos);
            }
        }
        return versionVos;
    }

    @Override
    public List<Version> selectByEnvironmentId(Long environmentId) {
        return selectByExample(VersionExample.newBuilder()
                .build()
                .createCriteria()
                .andEnvironmentIdEqualTo(environmentId)
                .andDeletedEqualTo(Deleted.OK.getValue())
                .toExample());
    }

    @Override
    public List<String> getDepInfosByDepIds(List<Long> depIds) {
        List<String> res = new ArrayList<>();
        if (depIds == null || depIds.size() <= 0) {
            return res;
        }
        for (Long id : depIds) {
            Version version = selectByPrimaryKey(id);
            String depInfo = projectService.selectByPrimaryKey(version.getProjectId()).getName() + "/" +
                    environmentService.selectByPrimaryKey(version.getEnvironmentId()).getName() + "/" +
                    selectByPrimaryKey(id).getName();
            res.add(depInfo);
        }
        return res;
    }

    @Override
    public List<Long> getChildrenVersionById(Long versionId, Set<Long> resolved) {
        List<Long> res = new ArrayList<>();
        List<Version> versions = selectByExample(VersionExample.newBuilder()
                .build()
                .createCriteria()
                .andDependencyIdsLike(versionId.toString())
                .andDeletedEqualTo(Deleted.OK.getValue())
                .toExample()
        );
        versions.addAll(selectByExample(VersionExample.newBuilder()
                .build()
                .createCriteria()
                .andDependencyIdsLikeBoth(versionId.toString() + ",")
                .andDeletedEqualTo(Deleted.OK.getValue())
                .toExample()
        ));
        versions.addAll(selectByExample(VersionExample.newBuilder()
                .build()
                .createCriteria()
                .andDependencyIdsLikeBoth("," + versionId.toString() + ",")
                .andDeletedEqualTo(Deleted.OK.getValue())
                .toExample()
        ));
        versions.addAll(selectByExample(VersionExample.newBuilder()
                .build()
                .createCriteria()
                .andDependencyIdsLikeBoth("," + versionId.toString())
                .andDeletedEqualTo(Deleted.OK.getValue())
                .toExample()
        ));
        if (CollectionUtils.isEmpty(versions)) {
            return res;
        }
        for (Version item : versions) {
            if (resolved.contains(item.getId())) {
                continue;
            }
            res.add(item.getId());
            resolved.add(item.getId());
            List<Long> childrenIds = getChildrenVersionById(item.getId(), resolved);
            res.addAll(childrenIds);
        }
        return res;
    }
}
