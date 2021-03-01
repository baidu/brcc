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

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baidu.brcc.dao.EnvironmentUserMapper;
import com.baidu.brcc.dao.base.BaseMapper;
import com.baidu.brcc.domain.EnvironmentUser;
import com.baidu.brcc.domain.EnvironmentUserExample;
import com.baidu.brcc.domain.ProductUser;
import com.baidu.brcc.domain.ProductUserExample;
import com.baidu.brcc.domain.ProjectUser;
import com.baidu.brcc.domain.ProjectUserExample;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.em.EnvironmentUserPriType;
import com.baidu.brcc.domain.em.ProductUserAdmin;
import com.baidu.brcc.domain.em.ProjectUserAdmin;
import com.baidu.brcc.domain.em.UserRole;
import com.baidu.brcc.domain.meta.MetaEnvironmentUser;
import com.baidu.brcc.domain.meta.MetaProductUser;
import com.baidu.brcc.domain.meta.MetaProjectUser;
import com.baidu.brcc.service.EnvironmentUserService;
import com.baidu.brcc.service.ProductUserService;
import com.baidu.brcc.service.ProjectUserService;
import com.baidu.brcc.service.base.GenericServiceImpl;

@Service("environmentUserService")
public class EnvironmentUserServiceImpl extends GenericServiceImpl<EnvironmentUser, Long, EnvironmentUserExample>
        implements EnvironmentUserService {

    @Autowired
    private EnvironmentUserMapper environmentUserMapper;

    @Autowired
    ProductUserService productUserService;

    @Autowired
    ProjectUserService projectUserService;

    @Override
    public BaseMapper<EnvironmentUser, Long, EnvironmentUserExample> getMapper() {
        return environmentUserMapper;
    }

    @Override
    public EnvironmentUserExample newExample() {
        return EnvironmentUserExample.newBuilder().build();
    }

    @Override
    public EnvironmentUserExample newIdInExample(List<Long> ids) {
        return EnvironmentUserExample.newBuilder().build().createCriteria().andIdIn(ids).toExample();
    }

    @Override
    public EnvironmentUser selectByUserIdAndEnvironmentId(Long userId, Long projectId, Long environmentId) {
        return selectOneByExample(EnvironmentUserExample.newBuilder()
                .build()
                .createCriteria()
                .andUserIdEqualTo(userId)
                .andProjectIdEqualTo(projectId)
                .andEnvironmentIdEqualTo(environmentId)
                .toExample()
        );
    }

    @Override
    public boolean checkAuth(Long productId, Long projectId, Long environmentId, User user) {
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
        ProjectUser projectUser = projectUserService.selectOneByExample(ProjectUserExample.newBuilder()
                        .build()
                        .createCriteria()
                        .andProjectIdEqualTo(projectId)
                        .andUserIdEqualTo(user.getId())
                        .andIsAdminEqualTo(ProjectUserAdmin.YES.getValue())
                        .toExample(),
                MetaProjectUser.COLUMN_NAME_ID
        );
        if (projectUser != null) {
            return true;
        }

        // 环境写权限
        EnvironmentUser environmentUser = selectOneByExample(EnvironmentUserExample.newBuilder()
                        .build()
                        .createCriteria()
                        .andProjectIdEqualTo(projectId)
                        .andUserIdEqualTo(user.getId())
                        .andEnvironmentIdEqualTo(environmentId)
                        .andPriTypeEqualTo(EnvironmentUserPriType.WRITE.getValue())
                        .toExample(),
                MetaEnvironmentUser.COLUMN_NAME_ID
        );

        return environmentUser != null;
    }
}
