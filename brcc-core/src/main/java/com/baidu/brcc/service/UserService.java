/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.service;

import java.util.List;

import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.UserExample;
import com.baidu.brcc.service.base.GenericService;

public interface UserService extends GenericService<User, Long, UserExample> {

    User selectUserByName(String name);

    User selectUserByToken(String token);

    User addUserIfNotExist(String name, Byte role, Byte userType);

    List<Long> getProjectIdsByUserId(Long userId);

}
