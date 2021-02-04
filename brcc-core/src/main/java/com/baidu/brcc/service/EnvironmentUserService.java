/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.service;

import com.baidu.brcc.domain.EnvironmentUser;
import com.baidu.brcc.domain.EnvironmentUserExample;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.service.base.GenericService;

public interface EnvironmentUserService extends GenericService<EnvironmentUser, Long, EnvironmentUserExample> {

    EnvironmentUser selectByUserIdAndEnvironmentId(Long userId, Long projectId, Long environmentId);

    boolean checkAuth(Long productId, Long projectId, Long environmentId, User user);
}
