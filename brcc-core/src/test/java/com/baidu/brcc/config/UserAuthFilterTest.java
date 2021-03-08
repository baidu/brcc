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
package com.baidu.brcc.config;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.mock.web.MockFilterChain;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import com.baidu.brcc.domain.User;
import com.baidu.brcc.service.UserCache;
import com.baidu.brcc.service.UserService;
import com.baidu.brcc.service.impl.UserCacheImpl;
import com.baidu.brcc.service.impl.UserServiceImpl;

public class UserAuthFilterTest {

    private String xtoken = "abc";
    UserAuthFilter userAuthFilter;

    @Before
    public void setUp() {
        UserCache userCache = mock(UserCache.class);
        when(userCache.getUserByToken(xtoken)).thenReturn(mock(User.class));
        UserService userService = mock(UserService.class);
        byte defaultUserType = (byte) 0;
        userAuthFilter = new UserAuthFilter(null, userCache, userService, defaultUserType);
    }

    @Test
    public void testNoAuth() throws Exception {
        List<String> noAuths = new ArrayList<>();
        noAuths.add("/test");
        UserCache userCache = mock(UserCache.class);
        UserService userService = mock(UserService.class);
        byte defaultUserType = (byte) 0;
        UserAuthFilter userAuthFilter = new UserAuthFilter(noAuths, userCache, userService, defaultUserType);
        boolean result = userAuthFilter.noAuth("/test");
        Assert.assertEquals(true, result);

        result = userAuthFilter.noAuth("/api");
        Assert.assertEquals(false, result);
    }

    @Test
    public void testDoFilter() throws Exception {
        MockHttpServletRequest request = mock(MockHttpServletRequest.class);
        MockHttpServletResponse response = new MockHttpServletResponse();
        MockFilterChain chain = new MockFilterChain();
        when(request.getParameter("rcc-token")).thenReturn(xtoken);
        userAuthFilter.doFilter(request, response, chain);
    }

    @Test
    public void testDoFilterNoToken() throws Exception {
        MockHttpServletRequest request = mock(MockHttpServletRequest.class);
        MockHttpServletResponse response = new MockHttpServletResponse();
        MockFilterChain chain = new MockFilterChain();
        when(request.getParameter("rcc-token")).thenReturn("");
        userAuthFilter.doFilter(request, response, chain);

        when(request.getRemoteUser()).thenReturn(xtoken);
        userAuthFilter.doFilter(request, response, chain);
    }

    @Test
    public void testInit() throws Exception {
        userAuthFilter.init(null);
    }

    @Test
    public void testDestroy() throws Exception {
        userAuthFilter.destroy();
    }
}
