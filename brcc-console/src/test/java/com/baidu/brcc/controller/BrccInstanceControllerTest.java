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
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.base.R;
import com.baidu.brcc.service.BrccInstanceService;
import com.baidu.brcc.service.VersionService;

public class BrccInstanceControllerTest {
    @Mock
    BrccInstanceService brccInstanceService;
    @Mock
    VersionService versionService;
    @InjectMocks
    BrccInstanceController brccInstanceController;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testDelete() throws Exception {
        when(brccInstanceService.deleteByPrimaryKey(any())).thenReturn(1);

        // 未登录
        R result = brccInstanceController.delete(1L, null);
        Assert.assertEquals(443, result.getStatus());
        verify(brccInstanceService, never()).deleteByPrimaryKey(any());

        User user = new User();
        user.setId(1L);
        user.setName("user");
        result = brccInstanceController.delete(1L, user);
        Assert.assertEquals(0, result.getStatus());
        Assert.assertEquals(1, result.getData());
    }
}
