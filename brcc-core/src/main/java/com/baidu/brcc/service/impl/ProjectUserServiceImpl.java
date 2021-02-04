/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.service.impl;

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
}
