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
import java.util.Arrays;
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

    // 与 brcc-server application.yml 中 rcc.noauths 一致
    private static final List<String> STOCK_NO_AUTHS = Arrays.asList(
            "/", "/api/**/*", "/index.html", "/check", "/console/user/login", "/user/loginByUuap",
            "/rpc/ExtConfigServerService", "/img/**/*", "/js/**/*", "/css/**/*", "/swagger-ui.html",
            "/webjars/**", "/v2/**", "/swagger-resources/**", "/csrf");

    private String xtoken = "abc";
    UserAuthFilter userAuthFilter;

    @Before
    public void setUp() {
        UserCache userCache = mock(UserCache.class);
        User user = new User();
        user.setId(1L);
        user.setName("user");
        user.setStatus((byte) 0);
        when(userCache.getUserByToken(xtoken)).thenReturn(user);
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
        MockHttpServletRequest request = new MockHttpServletRequest("GET", "/admin/queryUser");
        MockHttpServletResponse response = new MockHttpServletResponse();
        MockFilterChain chain = new MockFilterChain();
        request.setParameter("rcc-token", xtoken);
        userAuthFilter.doFilter(request, response, chain);
        Assert.assertNotNull(chain.getRequest());
    }

    @Test
    public void testDoFilterNoToken() throws Exception {
        MockHttpServletRequest request = new MockHttpServletRequest("GET", "/admin/queryUser");
        MockHttpServletResponse response = new MockHttpServletResponse();
        MockFilterChain chain = new MockFilterChain();
        userAuthFilter.doFilter(request, response, chain);
        Assert.assertNull(chain.getRequest());

        request.setRemoteUser(xtoken);
        chain = new MockFilterChain();
        userAuthFilter.doFilter(request, response, chain);
    }

    /**
     * context path 被 noauths 覆盖时（如 /v2、/api），控制台接口仍需鉴权
     */
    @Test
    public void testDoFilterWithContextPath() throws Exception {
        UserAuthFilter filter = new UserAuthFilter(STOCK_NO_AUTHS, mock(UserCache.class),
                mock(UserService.class), (byte) 0);
        String[][] cases = {
                {"/v2", "/v2/admin/queryUser"},
                {"/v2", "/v2/console/admin/queryUser"},
                {"/api", "/api/admin/queryUser"},
                {"/v2", "/v2/instance/delete/1"},
                {"", "/admin/queryUser"},
                {"", "/admin/queryUser;/v2/x"},
        };
        for (String[] c : cases) {
            MockHttpServletRequest request = new MockHttpServletRequest("GET", c[1]);
            request.setContextPath(c[0]);
            MockHttpServletResponse response = new MockHttpServletResponse();
            MockFilterChain chain = new MockFilterChain();
            filter.doFilter(request, response, chain);
            Assert.assertNull(c[1] + " should be blocked", chain.getRequest());
            Assert.assertTrue(c[1], response.getContentAsString().contains("\"status\":443"));
        }
    }

    /**
     * context path 下的白名单接口不受影响
     */
    @Test
    public void testDoFilterWhitelistWithContextPath() throws Exception {
        UserAuthFilter filter = new UserAuthFilter(STOCK_NO_AUTHS, mock(UserCache.class),
                mock(UserService.class), (byte) 0);
        String[][] cases = {
                {"/v2", "/v2/check"},
                {"/v2", "/v2/v2/api-docs"},
                {"/api", "/api/api/auth"},
                {"", "/check"},
                {"", "/v2/api-docs"},
        };
        for (String[] c : cases) {
            MockHttpServletRequest request = new MockHttpServletRequest("GET", c[1]);
            request.setContextPath(c[0]);
            MockFilterChain chain = new MockFilterChain();
            filter.doFilter(request, new MockHttpServletResponse(), chain);
            Assert.assertNotNull(c[1] + " should pass", chain.getRequest());
        }
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
