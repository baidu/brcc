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
package com.baidu.brcc.service;

import java.util.List;
import java.util.Map;

import com.baidu.brcc.annotation.LoginUser;
import com.baidu.brcc.domain.ConfigGroup;
import com.baidu.brcc.domain.ConfigGroupExample;
import com.baidu.brcc.domain.Environment;
import com.baidu.brcc.domain.Product;
import com.baidu.brcc.domain.Project;
import com.baidu.brcc.domain.TreeNode;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.Version;
import com.baidu.brcc.domain.vo.ApiGroupVo;
import com.baidu.brcc.domain.vo.FindTreeInfoVo;
import com.baidu.brcc.service.base.GenericService;

public interface ConfigGroupService extends GenericService<ConfigGroup, Long, ConfigGroupExample> {
    String DEFAULT_GROUP = "default_group";
    String DEFAULT_GROUP_MEMO = "default group";
    int PRODUCT = 1;
    int PROJECT = 2;
    int ENVIRONMENT = 3;
    int VERSION = 4;
    int GROUP = 5;

    int deleteCascadeByGroupId(Long groupId);

    int deleteByVersionId(Long versionId);

    int deleteByEnvId(Long envId);

    int deleteByProjectId(Long projectId);

    /**
     * @param user
     * @param step,            1-取product
     * @param productManageMap
     * @param projectManageMap
     * @param envAccessMap
     * @param versionAccessMap
     * @param groupAccessMap
     */
    void loadGroupByUser(User user,
                         int step,
                         Map<Long, Product> productManageMap,
                         Map<Long, Project> projectManageMap,
                         Map<Long, Project> projectMemberMap,
                         Map<Long, Environment> envAccessMap,
                         Map<Long, Version> versionAccessMap,
                         Map<Long, ConfigGroup> groupAccessMap
    );

    List<TreeNode> findTreeInfo(@LoginUser User user);

    List<FindTreeInfoVo> loadTreeInfo(Long id, Byte Type);

    List<ConfigGroup> listAllGroupByVersionId (Long projectId, Long versionId);

    Long updateGroupByImportType(Byte type, ConfigGroup configGroup, String groupName);
}
