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

import static org.apache.commons.lang3.StringUtils.trim;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.baidu.brcc.common.Constants;
import com.baidu.brcc.dao.UserMapper;
import com.baidu.brcc.dao.base.BaseMapper;
import com.baidu.brcc.domain.ProjectUser;
import com.baidu.brcc.domain.ProjectUserExample;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.UserExample;
import com.baidu.brcc.domain.meta.MetaProjectUser;
import com.baidu.brcc.service.ProjectUserService;
import com.baidu.brcc.service.UserService;
import com.baidu.brcc.service.base.GenericServiceImpl;
import com.baidu.brcc.utils.bcrypt.Md5Util;

@Service("userService")
public class UserServiceImpl extends GenericServiceImpl<User, Long, UserExample> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ProjectUserService projectUserService;

    @Override
    public BaseMapper<User, Long, UserExample> getMapper() {
        return userMapper;
    }

    @Override
    public UserExample newExample() {
        return UserExample.newBuilder().build();
    }

    @Override
    public UserExample newIdInExample(List<Long> ids) {
        return UserExample.newBuilder().build().createCriteria().andIdIn(ids).toExample();
    }

    @Override
    public User selectUserByName(String name) {
        User user = selectOneByExample(UserExample.newBuilder()
                .build()
                .createCriteria()
                .andNameEqualTo(name)
                .toExample()
        );
        return user;
    }

    @Override
    public User selectUserByToken(String token) {
        User user = selectOneByExample(UserExample.newBuilder()
                .build()
                .createCriteria()
                .andTokenEqualTo(token)
                .toExample()
        );
        return user;
    }

    @Override
    public User addUserIfNotExist(String name, Byte role, Byte userType) {
        name = trim(name);
        User user = selectUserByName(name);

        // 用户不存在，直接添加
        if (user == null) {
            Date curTime = new Date();
            User userSave = User.newBuilder()
                    .password(Md5Util.md5(Constants.DEFAULT_PASSWORD))
                    .createTime(curTime)
                    .updateTime(curTime)
                    .role(role)
                    .name(name)
                    .status((byte) 0)
                    .type(userType)
                    .token(UUID.randomUUID().toString())
                    .build();

            insertSelective(userSave);
            return userSave;
        }

        return user;
    }

    @Override
    public List<Long> getProjectIdsByUserId(Long userId) {
        List<Long> resIdList = new ArrayList<>();
        // 获取projectUser表中的数据
        List<Long> projectIdList = projectUserService.selectByExample(
                ProjectUserExample.newBuilder()
                        .distinct(true)
                        .build()
                        .createCriteria()
                        .andUserIdEqualTo(userId)
                        .toExample(),
                ProjectUser :: getProjectId,
                MetaProjectUser.COLUMN_NAME_PROJECTID
        );

        if (!CollectionUtils.isEmpty(projectIdList)
                && projectIdList.size() > Constants.MAX_PROJECT_NUM_PER_USER) {
            resIdList = projectIdList.subList(0, Constants.MAX_PROJECT_NUM_PER_USER - 1);
        } else {
            resIdList = projectIdList;
        }

        return resIdList;
    }

    @Override
    public List<User> queryUsersByUserName(List<String> users) {
        if (CollectionUtils.isEmpty(users)) {
            return Lists.newArrayList();
        }
        List<String> queryUsers = Lists.newArrayList();
        users.forEach(x -> {
            if (!StringUtils.isBlank(x)) {
                queryUsers.add(x);
            }
        });
        return userMapper.queryUsersByUserName(queryUsers);
    }
}
