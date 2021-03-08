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
package com.baidu.brcc.domain.vo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class UserVoTest {
    @Mock
    Date createTime;
    @Mock
    Date updateTime;
    @InjectMocks
    UserVo userVo;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSetUserId() throws Exception {
        userVo.setUserId(Long.valueOf(1));
    }

    @Test
    public void testSetUserName() throws Exception {
        userVo.setUserName("userName");
    }

    @Test
    public void testSetUserRole() throws Exception {
        userVo.setUserRole(Byte.valueOf("00110"));
    }

    @Test
    public void testSetCreateTime() throws Exception {
        userVo.setCreateTime(new GregorianCalendar(2021, Calendar.MARCH, 8, 10, 2).getTime());
    }

    @Test
    public void testSetUpdateTime() throws Exception {
        userVo.setUpdateTime(new GregorianCalendar(2021, Calendar.MARCH, 8, 10, 2).getTime());
    }

    @Test
    public void testSetStatus() throws Exception {
        userVo.setStatus(Byte.valueOf("00110"));
    }
}
