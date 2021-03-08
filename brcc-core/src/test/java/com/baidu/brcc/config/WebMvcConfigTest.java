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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.web.servlet.FilterRegistrationBean;

import com.baidu.brcc.service.UserCache;
import com.baidu.brcc.service.UserService;
import com.baidu.brcc.service.impl.UserCacheImpl;
import com.baidu.brcc.service.impl.UserServiceImpl;

public class WebMvcConfigTest {
    @Mock
    List<String> noAuths;
    @Mock
    UserCache userCache;
    @Mock
    UserService userService;
    @InjectMocks
    WebMvcConfig webMvcConfig;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAddArgumentResolvers() throws Exception {
        webMvcConfig.addArgumentResolvers(new ArrayList<>());
    }

    @Test
    public void testCrossDomainFilter() throws Exception {
        FilterRegistrationBean result = webMvcConfig.crossDomainFilter();
        Assert.assertNotNull(result);
    }

    @Test
    public void testUserAuthFilter() throws Exception {
        UserAuthFilter result = webMvcConfig.userAuthFilter();

    }

    @Test
    public void testUserAuthFilterRegistration() throws Exception {
        FilterRegistrationBean result = webMvcConfig.userAuthFilterRegistration(
                new UserAuthFilter(Arrays.<String>asList("String"), new UserCacheImpl(), new UserServiceImpl(),
                        (byte) 0));
        Assert.assertNotNull(result);
    }

    @Test
    public void testUriCostFilterRegistration() throws Exception {
        FilterRegistrationBean result = webMvcConfig.uriCostFilterRegistration();
        Assert.assertNotNull(result);
    }
}
