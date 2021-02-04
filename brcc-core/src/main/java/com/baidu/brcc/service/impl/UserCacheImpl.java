/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baidu.brcc.domain.User;
import com.baidu.brcc.service.RccCache;
import com.baidu.brcc.service.UserCache;
import com.baidu.brcc.service.UserService;

@Service
public class UserCacheImpl implements UserCache {

    @Autowired
    private UserService userService;

    @Autowired
    private RccCache rccCache;

    @Override
    public User getUserByToken(String token) {
        User user = rccCache.getUserByToken(token);
        if (user == null) {
            user = userService.selectUserByToken(token);
            if (user != null) {
                rccCache.loadUser(user);
            }
        }
        return user;
    }

    @Override
    public User reloadUserByToken(String token) {
        User user = userService.selectUserByToken(token);
        if (user != null) {
            rccCache.loadUser(user);
        }
        return user;
    }

    @Override
    public User getUserByName(String name) {
        User user = rccCache.getUserByName(name);
        if (user == null) {
            user = userService.selectUserByName(name);
            if (user != null) {
                rccCache.loadUser(user);
            }
        }
        return user;
    }

    @Override
    public void removeByName(String name) {
        User user = rccCache.getUserByName(name);
        if (user == null) {
            user = userService.selectUserByName(name);
        }
        rccCache.evictUser(user);
    }
}
