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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baidu.brcc.domain.ConfigGroup;
import com.baidu.brcc.domain.ConfigItem;
import com.baidu.brcc.domain.Environment;
import com.baidu.brcc.domain.Product;
import com.baidu.brcc.domain.Project;
import com.baidu.brcc.domain.Version;
import com.baidu.brcc.domain.base.R;
import com.baidu.brcc.domain.meta.MetaConfigGroup;
import com.baidu.brcc.domain.meta.MetaConfigItem;
import com.baidu.brcc.domain.meta.MetaEnvironment;
import com.baidu.brcc.domain.meta.MetaProduct;
import com.baidu.brcc.domain.meta.MetaProject;
import com.baidu.brcc.domain.meta.MetaVersion;
import com.baidu.brcc.service.ConfigGroupService;
import com.baidu.brcc.service.ConfigItemService;
import com.baidu.brcc.service.EnvironmentService;
import com.baidu.brcc.service.ProductService;
import com.baidu.brcc.service.ProjectService;
import com.baidu.brcc.service.VersionService;

/**
 * {"productId":11,"productName":"test2","projectId":11,"projectName":"ptest1","environmentId":46,
 * "environmentName":"e1","versionId":47,"versionName":"1","groupId":477,"groupName":"test1"}
 */
@RestController
@RequestMapping(path = {"console/parent", "parent"})
public class GetParentController {

    @Autowired
    private ConfigItemService configItemService;

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

    @GetMapping("{type}/{id}")
    public R<List<Object>> getParentInfo(@PathVariable("type") String type, @PathVariable("id") Long id) {
        Long productId = null;
        Long projectId = null;
        Long environmentId = null;
        Long versionId = null;
        Long groupId = null;
        Long itemId = null;
        String productName = null;
        String projectName = null;
        String environmentName = null;
        String versionName = null;
        String groupName = null;
        String itemName = null;
        List<Object> result = new ArrayList<>();
        if (EntryType.product.name().equals(type)) {
            productId = id;
        } else if (EntryType.project.name().equals(type)) {
            Project project = projectService.selectByPrimaryKey(
                    id,
                    MetaProject.COLUMN_NAME_ID,
                    MetaProject.COLUMN_NAME_NAME,
                    MetaProject.COLUMN_NAME_PRODUCTID
            );

            if (project == null) {
                // 返回空数据
                return R.ok();
            }
            productId = project.getProductId();
            projectName = project.getName();
            projectId = id;
            Map<String, Object> map = new HashMap<>();
            map.put("projectId", projectId);
            map.put("projectName", projectName);
            result.add(map);
        } else if (EntryType.environment.name().equals(type)) {
            Environment environment = environmentService.selectByPrimaryKey(
                    id,
                    MetaEnvironment.COLUMN_NAME_ID,
                    MetaEnvironment.COLUMN_NAME_PRODUCTID,
                    MetaEnvironment.COLUMN_NAME_PROJECTID,
                    MetaEnvironment.COLUMN_NAME_NAME
            );
            if (environment == null) {
                // 返回空数据
                return R.ok();
            }
            productId = environment.getProductId();
            projectId = environment.getProjectId();
            environmentName = environment.getName();
            environmentId = id;
            Map<String, Object> map = new HashMap<>();
            map.put("environmentId", environmentId);
            map.put("environmentName", environmentName);
            result.add(map);
        } else if (EntryType.version.name().equals(type)) {
            Version version = versionService.selectByPrimaryKey(
                    id,
                    MetaVersion.COLUMN_NAME_ID,
                    MetaVersion.COLUMN_NAME_PRODUCTID,
                    MetaVersion.COLUMN_NAME_PROJECTID,
                    MetaVersion.COLUMN_NAME_ENVIRONMENTID,
                    MetaVersion.COLUMN_NAME_NAME
            );
            if (version == null) {
                // 返回空数据
                return R.ok();
            }
            productId = version.getProductId();
            projectId = version.getProjectId();
            environmentId = version.getEnvironmentId();
            versionName = version.getName();
            versionId = id;
            Map<String, Object> map = new HashMap<>();
            map.put("versionId", versionId);
            map.put("versionName", versionName);
            result.add(map);
        } else if (EntryType.group.name().equals(type)) {
            ConfigGroup group = groupService.selectByPrimaryKey(
                    id,
                    MetaConfigGroup.COLUMN_NAME_ID,
                    MetaConfigGroup.COLUMN_NAME_PRODUCTID,
                    MetaConfigGroup.COLUMN_NAME_PROJECTID,
                    MetaConfigGroup.COLUMN_NAME_ENVIRONMENTID,
                    MetaConfigGroup.COLUMN_NAME_VERSIONID,
                    MetaConfigGroup.COLUMN_NAME_NAME
            );
            if (group == null) {
                // 返回空数据
                return R.ok();
            }
            productId = group.getProductId();
            projectId = group.getProjectId();
            environmentId = group.getEnvironmentId();
            versionId = group.getVersionId();
            groupName = group.getName();
            groupId = id;
            Map<String, Object> map = new HashMap<>();
            map.put("groupId", groupId);
            map.put("groupName", groupName);
            result.add(map);
        } else if (EntryType.item.name().equals(type)) {
            ConfigItem item = configItemService.selectByPrimaryKey(
                    id,
                    MetaConfigItem.COLUMN_NAME_ID,
                    MetaConfigItem.COLUMN_NAME_PRODUCTID,
                    MetaConfigItem.COLUMN_NAME_PROJECTID,
                    MetaConfigItem.COLUMN_NAME_ENVIRONMENTID,
                    MetaConfigItem.COLUMN_NAME_VERSIONID,
                    MetaConfigItem.COLUMN_NAME_GROUPID,
                    MetaConfigItem.COLUMN_NAME_NAME
            );
            if (item == null) {
                // 返回空数据
                return R.ok();
            }
            productId = item.getProductId();
            projectId = item.getProjectId();
            environmentId = item.getEnvironmentId();
            versionId = item.getVersionId();
            groupId = item.getGroupId();
            itemName = item.getName();
            itemId = id;
            Map<String, Object> map = new HashMap<>();
            map.put("itemId", itemId);
            map.put("itemName", itemName);
            result.add(map);
        }

        if (productId != null && productName == null) {
            Product product =
                    productService
                            .selectByPrimaryKey(productId, MetaProduct.COLUMN_NAME_ID, MetaProduct.COLUMN_NAME_NAME);
            if (product == null) {
                // 返回空数据
                return R.ok();
            }
            productName = product.getName();
            Map<String, Object> map = new HashMap<>();
            map.put("productId", productId);
            map.put("productName", productName);
            result.add(map);
        }
        if (projectId != null && projectName == null) {
            Project project =
                    projectService
                            .selectByPrimaryKey(projectId, MetaProject.COLUMN_NAME_ID, MetaProject.COLUMN_NAME_NAME);
            if (project == null) {
                // 返回空数据
                return R.ok();
            }
            projectName = project.getName();
            Map<String, Object> map = new HashMap<>();
            map.put("projectId", projectId);
            map.put("projectName", projectName);
            result.add(map);
        }
        if (environmentId != null && environmentName == null) {
            Environment environment =
                    environmentService
                            .selectByPrimaryKey(environmentId, MetaEnvironment.COLUMN_NAME_ID,
                                    MetaEnvironment.COLUMN_NAME_NAME);
            if (environment == null) {
                // 返回空数据
                return R.ok();
            }
            environmentName = environment.getName();
            Map<String, Object> map = new HashMap<>();
            map.put("environmentId", environmentId);
            map.put("environmentName", environmentName);
            result.add(map);
        }
        if (versionId != null && versionName == null) {
            Version version =
                    versionService
                            .selectByPrimaryKey(versionId, MetaVersion.COLUMN_NAME_ID, MetaVersion.COLUMN_NAME_NAME);
            if (version == null) {
                // 返回空数据
                return R.ok();
            }
            versionName = version.getName();
            Map<String, Object> map = new HashMap<>();
            map.put("versionId", versionId);
            map.put("versionName", versionName);
            result.add(map);
        }
        if (groupId != null && groupName == null) {
            ConfigGroup group =
                    groupService
                            .selectByPrimaryKey(groupId, MetaConfigGroup.COLUMN_NAME_ID,
                                    MetaConfigGroup.COLUMN_NAME_NAME);
            if (group == null) {
                // 返回空数据
                return R.ok();
            }
            groupName = group.getName();
            Map<String, Object> map = new HashMap<>();
            map.put("groupId", groupId);
            map.put("groupName", groupName);
            result.add(map);
        }
        if (itemId != null && itemName == null) {
            ConfigItem item =
                    configItemService
                            .selectByPrimaryKey(itemId, MetaConfigItem.COLUMN_NAME_ID, MetaConfigItem.COLUMN_NAME_NAME);
            if (item == null) {
                // 返回空数据
                return R.ok();
            }
            itemName = item.getName();
            Map<String, Object> map = new HashMap<>();
            map.put("itemId", itemId);
            map.put("itemName", itemName);
            result.add(map);
        }
        return R.ok(result);
    }

    private enum EntryType {
        product, project, environment, version, group, item;
    }
}
