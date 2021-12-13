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

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baidu.brcc.dao.ProjectUserMapper;
import com.baidu.brcc.dao.base.BaseMapper;
import com.baidu.brcc.domain.ProductUser;
import com.baidu.brcc.domain.ProductUserExample;
import com.baidu.brcc.domain.ProjectUser;
import com.baidu.brcc.domain.ProjectUserExample;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.em.ProductUserAdmin;
import com.baidu.brcc.domain.em.ProjectUserAdmin;
import com.baidu.brcc.domain.em.UserRole;
import com.baidu.brcc.domain.meta.MetaProductUser;
import com.baidu.brcc.domain.meta.MetaProjectUser;
import com.baidu.brcc.service.ProductUserService;
import com.baidu.brcc.service.ProjectUserService;
import com.baidu.brcc.service.base.GenericServiceImpl;

@Service("projectUserService")
public class ProjectUserServiceImpl extends GenericServiceImpl<ProjectUser, Long, ProjectUserExample> implements ProjectUserService {

    @Autowired
    private ProjectUserMapper projectUserMapper;

    @Autowired
    private ProductUserService productUserService;

    @Override
    public BaseMapper<ProjectUser, Long, ProjectUserExample> getMapper() {
        return projectUserMapper;
    }

    @Override
    public ProjectUserExample newExample() {
        return ProjectUserExample.newBuilder().build();
    }

    @Override
    public ProjectUserExample newIdInExample(List<Long> ids) {
        return ProjectUserExample.newBuilder().build().createCriteria().andIdIn(ids).toExample();
    }

    @Override
    public Integer deleteByProjectId(Long projectId) {
        return projectUserMapper.deleteByExample(
                ProjectUserExample.newBuilder()
                        .build()
                        .createCriteria()
                        .andProjectIdEqualTo(projectId)
                        .toExample()
        );
    }

    @Override
    public Integer deleteByUserIds(Long productId, Long projectId, List<Long> userIds) {
        return projectUserMapper.deleteByExample(
                ProjectUserExample.newBuilder()
                        .build()
                        .createCriteria()
                        .andProductIdEqualTo(productId)
                        .andProjectIdEqualTo(projectId)
                        .andUserIdIn(userIds)
                        .toExample()
        );
    }

    @Override
    public ProjectUser selectByUserIdAndProjectId(Long userId, Long projectId, Long productId) {
        return selectOneByExample(ProjectUserExample.newBuilder()
                .build()
                .createCriteria()
                .andUserIdEqualTo(userId)
                .andProjectIdEqualTo(projectId)
                .andProductIdEqualTo(productId)
                .toExample()
        );
    }

    @Override
    public boolean checkAuth(Long productId, Long projectId, User user) {
        if (user == null) {
            return false;
        }

        // 系统管理员
        if (UserRole.SYSADMIN.getValue().equals(user.getRole())) {
            return true;
        }

        // 产品线管理员
        ProductUser productUser = productUserService.selectOneByExample(ProductUserExample.newBuilder()
                        .build()
                        .createCriteria()
                        .andProductIdEqualTo(productId)
                        .andUserIdEqualTo(user.getId())
                        .andIsAdminEqualTo(ProductUserAdmin.YES.getValue())
                        .toExample(),
                MetaProductUser.COLUMN_NAME_ID
        );

        if (productUser != null) {
            return true;
        }

        // 工程管理员
        ProjectUser projectUser = selectOneByExample(ProjectUserExample.newBuilder()
                        .build()
                        .createCriteria()
                        .andProjectIdEqualTo(projectId)
                        .andUserIdEqualTo(user.getId())
                        .andIsAdminEqualTo(ProjectUserAdmin.YES.getValue())
                        .toExample(),
                MetaProjectUser.COLUMN_NAME_ID
        );

        return projectUser != null;
    }

    @Override
    public ProjectUser selectAdminByUserIdAndProjectId(Long userId, Long projectId) {
        return selectOneByExample(ProjectUserExample.newBuilder()
                .build()
                .createCriteria()
                .andUserIdEqualTo(userId)
                .andProjectIdEqualTo(projectId)
                .andIsAdminEqualTo(ProjectUserAdmin.YES.getValue())
                .toExample()
        );
    }

    @Override
    public List<String> selectUsersByProjectIdAndType(Long projectId, Byte type) {
        List<String> users = new ArrayList<>();
        List<ProjectUser> projectUsers = new ArrayList<>();
        if (type.equals(ProjectUserAdmin.YES.getValue())) {
            projectUsers = selectByExample(ProjectUserExample.newBuilder()
                    .limit(10000)
                    .build()
                    .createCriteria()
                    .andProjectIdEqualTo(projectId)
                    .andIsAdminEqualTo(ProjectUserAdmin.YES.getValue())
                    .toExample()
            );
        }
        if (type.equals(ProjectUserAdmin.NO.getValue())) {
            projectUsers = selectByExample(ProjectUserExample.newBuilder()
                    .limit(10000)
                    .build()
                    .createCriteria()
                    .andProjectIdEqualTo(projectId)
                    .andIsAdminEqualTo(ProjectUserAdmin.NO.getValue())
                    .toExample()
            );
        }
        for (ProjectUser item : projectUsers) {
            users.add(item.getUserName());
        }
        return users;
    }
}
