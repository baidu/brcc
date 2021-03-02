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
package com.baidu.brcc.controller;

import static com.baidu.brcc.common.ErrorStatusMsg.USER_LOGIN_NAME_EMPTY_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.USER_LOGIN_PASSWORD_EMPTY_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.USER_LOGIN_PASSWORD_ERROR_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.USER_NOT_EXISTS_STATUS;
import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.core.env.Environment;
import org.springframework.util.DigestUtils;

import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.base.R;
import com.baidu.brcc.domain.vo.UserLoginVo;
import com.baidu.brcc.service.UserCache;
import com.baidu.brcc.service.UserService;

public class LoginControllerTest {
    private static final int OK = 0;

    @Mock
    UserService userService;
    @Mock
    UserCache userCache;
    @Mock
    Environment env;
    @InjectMocks
    LoginController loginController;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testLogin() throws Exception {
        UserLoginVo req = new UserLoginVo();
        R<String> result = loginController.login(req);
        Assert.assertEquals(USER_LOGIN_NAME_EMPTY_STATUS.intValue(), result.getStatus());

        req.setName("test-user");
        result = loginController.login(req);
        Assert.assertEquals(USER_LOGIN_PASSWORD_EMPTY_STATUS.intValue(), result.getStatus());
        req.setPassword("password");
        result = loginController.login(req);
        Assert.assertEquals(USER_NOT_EXISTS_STATUS.intValue(), result.getStatus());
        User user = new User();
        when(userService.selectUserByName(anyString())).thenReturn(user);
        result = loginController.login(req);
        Assert.assertEquals(USER_LOGIN_PASSWORD_ERROR_STATUS.intValue(), result.getStatus());

        user.setPassword(DigestUtils.md5DigestAsHex("password".getBytes()));
        result = loginController.login(req);
        Assert.assertEquals(OK, result.getStatus());
    }

    @Test
    public void testLogout() throws Exception {
        HttpServletResponse response = mock(HttpServletResponse.class);
        when(response.getOutputStream()).thenReturn(mock(ServletOutputStream.class));
        loginController.logout(response, new User());
    }
}
