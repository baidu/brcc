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

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.baidu.brcc.dao.UserMapper;
import com.baidu.brcc.dao.base.CommonMapper;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.UserExample;
import com.baidu.brcc.service.ProjectUserService;

public class UserServiceImplTest {
    @Mock
    UserMapper userMapper;
    @Mock
    ProjectUserService projectUserService;
    @Mock
    CommonMapper commonMapper;
    @InjectMocks
    UserServiceImpl userServiceImpl;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testNewExample() throws Exception {
        UserExample result = userServiceImpl.newExample();
        result.setStart(1);
        Assert.assertEquals(1, result.getStart().intValue());
    }

    @Test
    public void testNewIdInExample() throws Exception {
        UserExample result = userServiceImpl.newIdInExample(Arrays.asList(Long.valueOf(1)));
        Assert.assertEquals(1, result.getOredCriteria().size());
    }

    @Test
    public void testSelectUserByName() throws Exception {
        User result = userServiceImpl.selectUserByName("name");
        Assert.assertEquals(null, result);
    }

    @Test
    public void testSelectUserByToken() throws Exception {
        User result = userServiceImpl.selectUserByToken("token");
        Assert.assertEquals(null, result);
    }

    @Test
    public void testAddUserIfNotExist() throws Exception {
        User result = userServiceImpl.addUserIfNotExist("name", Byte.valueOf("00110"), Byte.valueOf("00110"));
        Assert.assertEquals("name", result.getName());
    }

    @Test
    public void testGetProjectIdsByUserId() throws Exception {
        List<Long> result = userServiceImpl.getProjectIdsByUserId(Long.valueOf(1));
        Assert.assertEquals(0, result.size());
    }
}
