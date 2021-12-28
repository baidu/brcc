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

import java.security.acl.Group;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.baidu.brcc.domain.VersionExample;
import com.baidu.brcc.domain.em.FileImportType;
import com.baidu.brcc.domain.em.LoadType;
import com.baidu.brcc.domain.exception.BizException;
import com.baidu.brcc.domain.vo.FindTreeInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baidu.brcc.annotation.LoginUser;
import com.baidu.brcc.dao.ConfigGroupMapper;
import com.baidu.brcc.dao.base.BaseMapper;
import com.baidu.brcc.domain.ConfigGroup;
import com.baidu.brcc.domain.ConfigGroupExample;
import com.baidu.brcc.domain.Environment;
import com.baidu.brcc.domain.EnvironmentExample;
import com.baidu.brcc.domain.EnvironmentUser;
import com.baidu.brcc.domain.EnvironmentUserExample;
import com.baidu.brcc.domain.Product;
import com.baidu.brcc.domain.ProductExample;
import com.baidu.brcc.domain.ProductUser;
import com.baidu.brcc.domain.ProductUserExample;
import com.baidu.brcc.domain.Project;
import com.baidu.brcc.domain.ProjectExample;
import com.baidu.brcc.domain.ProjectUser;
import com.baidu.brcc.domain.ProjectUserExample;
import com.baidu.brcc.domain.TreeNode;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.Version;
import com.baidu.brcc.domain.em.Deleted;
import com.baidu.brcc.domain.em.ProductUserAdmin;
import com.baidu.brcc.domain.em.ProjectUserAdmin;
import com.baidu.brcc.domain.em.UserRole;
import com.baidu.brcc.domain.meta.MetaConfigGroup;
import com.baidu.brcc.domain.meta.MetaEnvironment;
import com.baidu.brcc.domain.meta.MetaEnvironmentUser;
import com.baidu.brcc.domain.meta.MetaProduct;
import com.baidu.brcc.domain.meta.MetaProductUser;
import com.baidu.brcc.domain.meta.MetaProject;
import com.baidu.brcc.domain.meta.MetaProjectUser;
import com.baidu.brcc.domain.meta.MetaVersion;
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

import lombok.extern.slf4j.Slf4j;

import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_EXISTS_STATUS;

@Slf4j
@Service("configGroupService")
public class ConfigGroupServiceImpl extends GenericServiceImpl<ConfigGroup, Long, ConfigGroupExample>
        implements ConfigGroupService {

    @Autowired
    private ConfigGroupMapper configGroupMapper;

    @Autowired
    private ConfigItemService configItemService;

    @Autowired
    private ProductUserService productUserService;

    @Autowired
    private ProductService productService;

    @Autowired
    private ProjectService projectService;

    @Autowired
    private ProjectUserService projectUserService;

    @Autowired
    private EnvironmentService environmentService;

    @Autowired
    private EnvironmentUserService environmentUserService;

    @Autowired
    private VersionService versionService;

    @Autowired
    private RccCache rccCache;

    @Override
    public BaseMapper<ConfigGroup, Long, ConfigGroupExample> getMapper() {
        return configGroupMapper;
    }

    @Override
    public ConfigGroupExample newExample() {
        return ConfigGroupExample.newBuilder().build();
    }

    @Override
    public ConfigGroupExample newIdInExample(List<Long> ids) {
        return ConfigGroupExample.newBuilder().build().createCriteria().andIdIn(ids).toExample();
    }

    @Override
    public int deleteCascadeByGroupId(Long groupId) {
        // 删除group
        Date now = DateTimeUtils.now();

        ConfigGroup configGroup = selectByPrimaryKey(groupId);
        if (configGroup == null || Deleted.DELETE.getValue().equals(configGroup.getDeleted())) {
            return 0;
        }
        Long versionId = configGroup.getVersionId();

        int del = updateByPrimaryKeySelective(ConfigGroup.newBuilder()
                .id(groupId)
                .deleted(Deleted.DELETE.getValue())
                .updateTime(now)
                .build());

        // 删除configItem
        configItemService.deleteByGroupId(groupId);
        // 失效缓存
        rccCache.deleteVersionCascade(versionService.selectByPrimaryKey(versionId));
        return del;
    }

    @Override
    public int deleteByVersionId(Long versionId) {
        return updateByExampleSelective(
                ConfigGroup.newBuilder()
                        .deleted(Deleted.DELETE.getValue())
                        .updateTime(DateTimeUtils.now())
                        .build(),
                ConfigGroupExample.newBuilder()
                        .build()
                        .createCriteria()
                        .andVersionIdEqualTo(versionId)
                        .andDeletedEqualTo(Deleted.OK.getValue())
                        .toExample());
    }

    @Override
    public int deleteByEnvId(Long envId) {
        return updateByExampleSelective(
                ConfigGroup.newBuilder()
                        .deleted(Deleted.DELETE.getValue())
                        .updateTime(DateTimeUtils.now())
                        .build(),
                ConfigGroupExample.newBuilder()
                        .build()
                        .createCriteria()
                        .andEnvironmentIdEqualTo(envId)
                        .andDeletedEqualTo(Deleted.OK.getValue())
                        .toExample());
    }

    @Override
    public int deleteByProjectId(Long projectId) {
        return updateByExampleSelective(
                ConfigGroup.newBuilder()
                        .deleted(Deleted.DELETE.getValue())
                        .updateTime(DateTimeUtils.now())
                        .build(),
                ConfigGroupExample.newBuilder()
                        .build()
                        .createCriteria()
                        .andProjectIdEqualTo(projectId)
                        .andDeletedEqualTo(Deleted.OK.getValue())
                        .toExample());
    }

    @Override
    public void loadGroupByUser(User user,
                                int step,
                                Map<Long, Product> productManageMap,
                                Map<Long, Project> projectManageMap,
                                Map<Long, Project> projectMemberMap,
                                Map<Long, Environment> envAccessMap,
                                Map<Long, Version> versionAccessMap,
                                Map<Long, ConfigGroup> groupAccessMap
    ) {
        int tmpStep = 0;
        if (tmpStep++ > step) {
            return;
        }
        // 产品线管理员
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

        if (tmpStep++ > step) {
            return;
        }
        // 工程管理员
        if (!org.springframework.util.CollectionUtils.isEmpty(productManageMap)) {
            Map<Long, Project> tmp = projectService.selectMapByExample(ProjectExample.newBuilder()
                            .build()
                            .createCriteria()
                            .andProductIdIn(productManageMap.keySet())
                            .andDeletedEqualTo(Deleted.OK.getValue())
                            .toExample(),
                    Project::getId,
                    MetaProject.COLUMN_NAME_ID,
                    MetaProject.COLUMN_NAME_NAME,
                    MetaProject.COLUMN_NAME_PRODUCTID
            );
            if (!org.springframework.util.CollectionUtils.isEmpty(tmp)) {
                projectManageMap.putAll(tmp);
            }
        }
        {
            List<Long> projectIds = projectUserService.selectByExample(ProjectUserExample.newBuilder()
                            .distinct(true)
                            .build()
                            .createCriteria()
                            .andUserIdEqualTo(user.getId())
                            .andIsAdminEqualTo(ProjectUserAdmin.YES.getValue())
                            .toExample(),
                    ProjectUser::getProjectId,
                    MetaProjectUser.COLUMN_NAME_PROJECTID

            );
            if (!org.springframework.util.CollectionUtils.isEmpty(projectIds)) {
                Map<Long, Project> tmp = projectService.selectMapByPrimaryKeys(
                        projectIds,
                        Project::getId,
                        MetaProject.COLUMN_NAME_ID,
                        MetaProject.COLUMN_NAME_NAME,
                        MetaProject.COLUMN_NAME_PRODUCTID
                );
                if (!org.springframework.util.CollectionUtils.isEmpty(tmp)) {
                    projectManageMap.putAll(tmp);
                }
            }
        }
        {
            // 工程成员
            List<Long> projectIds = projectUserService.selectByExample(ProjectUserExample.newBuilder()
                            .distinct(true)
                            .build()
                            .createCriteria()
                            .andUserIdEqualTo(user.getId())
                            .andIsAdminEqualTo(ProjectUserAdmin.NO.getValue())
                            .toExample(),
                    ProjectUser::getProjectId,
                    MetaProjectUser.COLUMN_NAME_PROJECTID

            );
            if (!org.springframework.util.CollectionUtils.isEmpty(projectIds)) {
                Map<Long, Project> tmp = projectService.selectMapByPrimaryKeys(
                        projectIds,
                        Project::getId,
                        MetaProject.COLUMN_NAME_ID,
                        MetaProject.COLUMN_NAME_NAME,
                        MetaProject.COLUMN_NAME_PRODUCTID
                );
                if (!org.springframework.util.CollectionUtils.isEmpty(tmp)) {
                    projectMemberMap.putAll(tmp);
                }
            }
        }

        if (tmpStep++ > step) {
            return;
        }
        // 可访问环境
        if (!org.springframework.util.CollectionUtils.isEmpty(projectManageMap)) {
            Map<Long, Environment> tmp = environmentService.selectMapByExample(EnvironmentExample.newBuilder()
                            .build()
                            .createCriteria()
                            .andProjectIdIn(projectManageMap.keySet())
                            .andDeletedEqualTo(Deleted.OK.getValue())
                            .toExample(),
                    Environment::getId,
                    MetaEnvironment.COLUMN_NAME_ID,
                    MetaEnvironment.COLUMN_NAME_NAME,
                    MetaEnvironment.COLUMN_NAME_PROJECTID,
                    MetaEnvironment.COLUMN_NAME_PRODUCTID
            );
            if (!org.springframework.util.CollectionUtils.isEmpty(tmp)) {
                envAccessMap.putAll(tmp);
            }
        }

        {
            List<Long> environmentIds = environmentUserService.selectByExample(EnvironmentUserExample.newBuilder()
                            .distinct(true)
                            .build()
                            .createCriteria()
                            .andUserIdEqualTo(user.getId())
                            .toExample(),
                    EnvironmentUser::getEnvironmentId,
                    MetaEnvironmentUser.COLUMN_NAME_ENVIRONMENTID
            );

            if (!org.springframework.util.CollectionUtils.isEmpty(environmentIds)) {
                Map<Long, Environment> tmp = environmentService.selectMapByPrimaryKeys(
                        environmentIds,
                        Environment::getId,
                        MetaEnvironment.COLUMN_NAME_ID,
                        MetaEnvironment.COLUMN_NAME_NAME,
                        MetaEnvironment.COLUMN_NAME_PROJECTID,
                        MetaEnvironment.COLUMN_NAME_PRODUCTID
                );
                if (!org.springframework.util.CollectionUtils.isEmpty(tmp)) {
                    envAccessMap.putAll(tmp);
                }
            }
        }

        if (tmpStep++ > step) {
            return;
        }
        // 可访问版本
        if (!org.springframework.util.CollectionUtils.isEmpty(envAccessMap)) {
            List<Set<Long>> partition = CollectionUtils.partition(envAccessMap.keySet(), 200);
            for (Set<Long> pEnvIds : partition) {
                if (pEnvIds == null || pEnvIds.isEmpty()) {
                    continue;
                }
                Map<Long, Version> tmp = versionService.selectMapByExample(VersionExample.newBuilder()
                                .build()
                                .createCriteria()
                                .andEnvironmentIdIn(pEnvIds)
                                .andDeletedEqualTo(Deleted.OK.getValue())
                                .toExample(),
                        Version::getId,
                        MetaVersion.COLUMN_NAME_ID,
                        MetaVersion.COLUMN_NAME_NAME,
                        MetaVersion.COLUMN_NAME_ENVIRONMENTID,
                        MetaVersion.COLUMN_NAME_PROJECTID,
                        MetaVersion.COLUMN_NAME_PRODUCTID
                );
                if (!org.springframework.util.CollectionUtils.isEmpty(tmp)) {
                    versionAccessMap.putAll(tmp);
                }
            }
        }

        if (tmpStep++ > step) {
            return;
        }
        // 可访问的group
        if (!org.springframework.util.CollectionUtils.isEmpty(versionAccessMap)) {
            List<Set<Long>> partition = CollectionUtils.partition(versionAccessMap.keySet(), 200);
            for (Set<Long> pVersionIds : partition) {
                if (pVersionIds == null || pVersionIds.isEmpty()) {
                    continue;
                }
                Map<Long, ConfigGroup> tmp = selectMapByExample(ConfigGroupExample.newBuilder()
                                .build()
                                .createCriteria()
                                .andVersionIdIn(pVersionIds)
                                .andDeletedEqualTo(Deleted.OK.getValue())
                                .toExample(),
                        ConfigGroup::getId,
                        MetaConfigGroup.COLUMN_NAME_ID,
                        MetaConfigGroup.COLUMN_NAME_NAME,
                        MetaConfigGroup.COLUMN_NAME_VERSIONID,
                        MetaConfigGroup.COLUMN_NAME_ENVIRONMENTID,
                        MetaConfigGroup.COLUMN_NAME_PROJECTID,
                        MetaConfigGroup.COLUMN_NAME_PRODUCTID
                );
                if (!org.springframework.util.CollectionUtils.isEmpty(tmp)) {
                    groupAccessMap.putAll(tmp);
                }
            }
        }
    }

    public List<TreeNode> findTreeInfo(@LoginUser User user) {
        long start = System.currentTimeMillis();
        Map<Long, Product> productManageMap = new HashMap<>();
        Map<Long, Project> projectManageMap = new HashMap<>();
        Map<Long, Project> projectMemberMap = new HashMap<>();
        Map<Long, Environment> envAccessMap = new HashMap<>();
        Map<Long, Version> versionAccessMap = new HashMap<>();
        Map<Long, ConfigGroup> groupAccessMap = new HashMap<>();

        loadGroupByUser(
                user,
                ConfigGroupService.GROUP,
                productManageMap,
                projectManageMap,
                projectMemberMap,
                envAccessMap,
                versionAccessMap,
                groupAccessMap
        );

        // 加载版本
        Set<Long> lostVersionIds = new HashSet<>();
        if (!org.springframework.util.CollectionUtils.isEmpty(groupAccessMap.values())) {
            for (ConfigGroup group : groupAccessMap.values()) {
                Long versionId = group.getVersionId();
                if (!versionAccessMap.containsKey(versionId)) {
                    lostVersionIds.add(versionId);
                }
            }
        }

        if (!org.springframework.util.CollectionUtils.isEmpty(lostVersionIds)) {
            List<Version> versions = versionService.selectByPrimaryKeys(
                    lostVersionIds,
                    MetaVersion.COLUMN_NAME_ID,
                    MetaVersion.COLUMN_NAME_NAME,
                    MetaVersion.COLUMN_NAME_ENVIRONMENTID,
                    MetaVersion.COLUMN_NAME_PROJECTID,
                    MetaVersion.COLUMN_NAME_PRODUCTID
            );

            if (!org.springframework.util.CollectionUtils.isEmpty(versions)) {
                for (Version version : versions) {
                    versionAccessMap.put(version.getId(), version);
                }
            }
        }

        // 加载环境
        Set<Long> lostEnvironmentIds = new HashSet<>();
        if (!org.springframework.util.CollectionUtils.isEmpty(versionAccessMap.values())) {
            for (Version version : versionAccessMap.values()) {
                Long environmentId = version.getEnvironmentId();
                if (!envAccessMap.containsKey(environmentId)) {
                    lostEnvironmentIds.add(environmentId);
                }
            }
        }

        if (!org.springframework.util.CollectionUtils.isEmpty(lostEnvironmentIds)) {
            List<Environment> environments = environmentService.selectByPrimaryKeys(
                    lostEnvironmentIds,
                    MetaEnvironment.COLUMN_NAME_ID,
                    MetaEnvironment.COLUMN_NAME_NAME,
                    MetaEnvironment.COLUMN_NAME_PROJECTID,
                    MetaEnvironment.COLUMN_NAME_PRODUCTID
            );

            if (!org.springframework.util.CollectionUtils.isEmpty(environments)) {
                for (Environment environment : environments) {
                    envAccessMap.put(environment.getId(), environment);
                }
            }
        }

        // 加载工程
        Set<Long> lostProjectIds = new HashSet<>();
        if (!org.springframework.util.CollectionUtils.isEmpty(envAccessMap.values())) {
            for (Environment environment : envAccessMap.values()) {
                Long projectId = environment.getProjectId();
                if (!projectManageMap.containsKey(projectId)) {
                    lostProjectIds.add(projectId);
                }
            }
        }
        for (Long projectId : projectMemberMap.keySet()) {
            lostProjectIds.add(projectId);
        }



        if (!org.springframework.util.CollectionUtils.isEmpty(lostProjectIds)) {
            List<Project> projects = projectService.selectByPrimaryKeys(
                    lostProjectIds,
                    MetaProject.COLUMN_NAME_ID,
                    MetaProject.COLUMN_NAME_NAME,
                    MetaProject.COLUMN_NAME_PRODUCTID
            );

            if (!org.springframework.util.CollectionUtils.isEmpty(projects)) {
                for (Project project : projects) {
                    projectManageMap.put(project.getId(), project);
                }
            }
        }

        // 加载产品线
        Set<Long> lostProductIds = new HashSet<>();
        if (!org.springframework.util.CollectionUtils.isEmpty(projectManageMap.values())) {
            for (Project project : projectManageMap.values()) {
                Long productId = project.getProductId();
                if (!productManageMap.containsKey(productId)) {
                    lostProductIds.add(productId);
                }
            }
        }

        if (!org.springframework.util.CollectionUtils.isEmpty(lostProductIds)) {
            List<Product> products = productService.selectByPrimaryKeys(
                    lostProductIds,
                    MetaProduct.COLUMN_NAME_ID,
                    MetaProduct.COLUMN_NAME_NAME
            );

            if (!org.springframework.util.CollectionUtils.isEmpty(products)) {
                for (Product product : products) {
                    productManageMap.put(product.getId(), product);
                }
            }
        }
        List<TreeNode> result = new ArrayList<>();
        Map<Long, TreeNode> productTreeNodeMap = new HashMap<>();
        if (!org.springframework.util.CollectionUtils.isEmpty(productManageMap)) {
            for (Product product : productManageMap.values()) {
                String name = product.getName();
                Long id = product.getId();
                TreeNode node = new TreeNode();
                node.setId(id);
                node.setType(PRODUCT);
                node.setName(name);
                productTreeNodeMap.put(id, node);
                result.add(node);
            }
        }

        Map<Long, TreeNode> projectTreeNodeMap = new HashMap<>();
        if (!org.springframework.util.CollectionUtils.isEmpty(projectManageMap.values())) {
            for (Project project : projectManageMap.values()) {
                String name = project.getName();
                Long id = project.getId();
                TreeNode node = new TreeNode();
                node.setId(id);
                node.setType(PROJECT);
                node.setName(name);

                projectTreeNodeMap.put(id, node);
                TreeNode parentNode = productTreeNodeMap.get(project.getProductId());
                if (parentNode == null) {
                    continue;
                }
                if (parentNode.getChildren() == null) {
                    parentNode.setChildren(new ArrayList<>());
                    parentNode.setHasChildren(true);
                }
                parentNode.getChildren().add(node);
            }
        }

        Map<Long, TreeNode> envTreeNodeMap = new HashMap<>();
        if (!org.springframework.util.CollectionUtils.isEmpty(envAccessMap.values())) {
            for (Environment environment : envAccessMap.values()) {
                String name = environment.getName();
                Long id = environment.getId();
                TreeNode node = new TreeNode();
                node.setId(id);
                node.setType(ENVIRONMENT);
                node.setName(name);

                envTreeNodeMap.put(id, node);
                TreeNode parentNode = projectTreeNodeMap.get(environment.getProjectId());
                if (parentNode == null) {
                    continue;
                }
                if (parentNode.getChildren() == null) {
                    parentNode.setChildren(new ArrayList<>());
                    parentNode.setHasChildren(true);
                }
                parentNode.getChildren().add(node);
            }
        }

        Map<Long, TreeNode> versionTreeNodeMap = new HashMap<>();
        if (!org.springframework.util.CollectionUtils.isEmpty(versionAccessMap.values())) {
            for (Version version : versionAccessMap.values()) {
                String name = version.getName();
                Long id = version.getId();
                TreeNode node = new TreeNode();
                node.setId(id);
                node.setType(VERSION);
                node.setName(name);

                versionTreeNodeMap.put(id, node);
                TreeNode parentNode = envTreeNodeMap.get(version.getEnvironmentId());
                if (parentNode == null) {
                    continue;
                }
                if (parentNode.getChildren() == null) {
                    parentNode.setChildren(new ArrayList<>());
                    parentNode.setHasChildren(true);
                }
                parentNode.getChildren().add(node);
            }
        }

        Map<Long, TreeNode> groupTreeNodeMap = new HashMap<>();
        if (!org.springframework.util.CollectionUtils.isEmpty(groupAccessMap.values())) {
            for (ConfigGroup group : groupAccessMap.values()) {
                String name = group.getName();
                Long id = group.getId();
                TreeNode node = new TreeNode();
                node.setId(id);
                node.setType(GROUP);
                node.setName(name);

                groupTreeNodeMap.put(id, node);
                TreeNode parentNode = versionTreeNodeMap.get(group.getVersionId());
                if (parentNode == null) {
                    continue;
                }
                if (parentNode.getChildren() == null) {
                    parentNode.setChildren(new ArrayList<>());
                    parentNode.setHasChildren(true);
                }
                parentNode.getChildren().add(node);
            }
        }

        log.info("findTreeInfo cost:{}ms, userId:{}", System.currentTimeMillis() - start, user.getId());
        return result;
    }

    @Override
    public List<ConfigGroup> listAllGroupByVersionId(Long projectId, Long versionId) {
        return selectByExample(ConfigGroupExample.newBuilder()
                .build()
                .createCriteria()
                .andDeletedEqualTo(Deleted.OK.getValue())
                .andProjectIdEqualTo(projectId)
                .andVersionIdEqualTo(versionId)
                .toExample()
        );


    }

    @Override
    public Long updateGroupByImportType(Byte type, ConfigGroup configGroup, String groupName) {
        Date now = DateTimeUtils.now();
        Long groupId = 0L;
        ConfigGroup item = selectOneByExample(ConfigGroupExample.newBuilder()
                        .build()
                        .createCriteria()
                        .andDeletedEqualTo(Deleted.OK.getValue())
                        .andVersionIdEqualTo(configGroup.getVersionId())
                        .andNameEqualTo(groupName)
                        .toExample(),
                MetaConfigGroup.COLUMN_NAME_ID
        );
        if (item != null) {
            if (type.equals(FileImportType.STOP.getValue())) {
                throw new BizException(GROUP_EXISTS_STATUS, GROUP_EXISTS_MSG);
            } else {
                groupId = item.getId();
                return groupId;
            }
        } else {
            ConfigGroup insert = new ConfigGroup();
            insert.setUpdateTime(now);
            insert.setCreateTime(now);
            insert.setDeleted(Deleted.OK.getValue());
            insert.setName(groupName);
            insert.setVersionId(configGroup.getVersionId());
            insert.setEnvironmentId(configGroup.getEnvironmentId());
            insert.setProjectId(configGroup.getProjectId());
            insert.setProductId(configGroup.getProductId());
            insertSelective(insert);
            groupId = insert.getId();
        }
        return groupId;
    }

    @Override
    public List<FindTreeInfoVo> loadTreeInfo(Long id, Byte type) {
        List<FindTreeInfoVo> res = new ArrayList<>();
        if (type.equals(LoadType.PROJECT.getValue())) {
            // load project
            List<Project> projects = projectService.selectByProductId(id);
            if (projects == null || projects.size() == 0) {
                return res;
            }
            for (Project item : projects) {
                FindTreeInfoVo findTreeInfoVo = new FindTreeInfoVo();
                findTreeInfoVo.setId(item.getId());
                findTreeInfoVo.setName(item.getName());
                res.add(findTreeInfoVo);
            }
        }
        if (type.equals(LoadType.ENVIRONMENT.getValue())) {
            // load environment
            List<Environment> environments = environmentService.selectByProjectId(id);
            if (environments == null || environments.size() == 0) {
                return res;
            }
            for (Environment item : environments) {
                FindTreeInfoVo findTreeInfoVo = new FindTreeInfoVo();
                findTreeInfoVo.setId(item.getId());
                findTreeInfoVo.setName(item.getName());
                res.add(findTreeInfoVo);
            }
        }
        if (type.equals(LoadType.VERSION.getValue())) {
            // load version
            List<Version> versions = versionService.selectByEnvironmentId(id);
            if (versions == null || versions.size() == 0) {
                return res;
            }
            for (Version item : versions) {
                FindTreeInfoVo findTreeInfoVo = new FindTreeInfoVo();
                findTreeInfoVo.setId(item.getId());
                findTreeInfoVo.setName(item.getName());
                res.add(findTreeInfoVo);
            }
        }
        if (type.equals(LoadType.GROUP.getValue())) {
            // load group
            List<ConfigGroup> groups = selectByExample(ConfigGroupExample.newBuilder()
                    .build()
                    .createCriteria()
                    .andVersionIdEqualTo(id)
                    .andDeletedEqualTo(Deleted.OK.getValue())
                    .toExample());
            if (groups == null || groups.size() == 0) {
                return res;
            }
            for (ConfigGroup item : groups) {
                FindTreeInfoVo findTreeInfoVo = new FindTreeInfoVo();
                findTreeInfoVo.setId(item.getId());
                findTreeInfoVo.setName(item.getName());
                res.add(findTreeInfoVo);
            }
        }
        return res;
    }
}
