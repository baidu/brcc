/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.service;

import com.baidu.brcc.domain.User;

public interface UserCache {

    User getUserByToken(String token);

    User getUserByName(String name);

    User reloadUserByToken(String token);

    void removeByName(String name);
}
