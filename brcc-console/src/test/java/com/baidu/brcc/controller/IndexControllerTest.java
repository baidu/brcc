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

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;

import com.baidu.brcc.domain.base.R;
import com.baidu.brcc.service.ConfigItemService;
import com.baidu.brcc.service.ProductService;
import com.baidu.brcc.service.ProjectService;
import com.baidu.brcc.service.UserService;
import com.google.common.cache.Cache;

public class IndexControllerTest {
    private static final int OK = 0;

    @Mock
    ProductService productService;
    @Mock
    ProjectService projectService;
    @Mock
    ConfigItemService configItemService;
    @Mock
    UserService userService;
    @Mock
    Cache<String, Long> cache;
    @Mock
    Logger log;
    @InjectMocks
    IndexController indexController;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testNotice() throws Exception {
        when(productService.countByExample(any())).thenReturn(0L);
        when(projectService.countByExample(any())).thenReturn(0L);
        when(configItemService.countByExample(any())).thenReturn(0L);
        when(userService.countByExample(any())).thenReturn(0L);

        R result = indexController.notice();
        Assert.assertEquals(OK, result.getStatus());
    }
}
