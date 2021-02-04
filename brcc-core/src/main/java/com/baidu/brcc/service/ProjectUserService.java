/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.service;

import java.util.List;

import com.baidu.brcc.service.base.GenericService;
import com.baidu.brcc.domain.ProjectUser;
import com.baidu.brcc.domain.ProjectUserExample;
import com.baidu.brcc.domain.User;

public interface ProjectUserService extends GenericService<ProjectUser, Long, ProjectUserExample> {

    Integer deleteByProjectId(Long projectId);

    Integer deleteByUserIds(Long productId, Long projectId, List<Long> userIds);

    ProjectUser selectByUserIdAndProjectId(Long userId, Long projectId, Long productId);

    boolean checkAuth(Long productId, Long projectId, User user);

    ProjectUser selectAdminByUserIdAndProjectId(Long userId, Long projectId);

}
