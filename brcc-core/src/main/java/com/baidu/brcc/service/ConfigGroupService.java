/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
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
                         Map<Long, Environment> envAccessMap,
                         Map<Long, Version> versionAccessMap,
                         Map<Long, ConfigGroup> groupAccessMap
    );

    List<TreeNode> findTreeInfo(@LoginUser User user);
}
