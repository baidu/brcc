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

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyVararg;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import com.baidu.brcc.dao.ConfigChangeLogMapper;
import com.baidu.brcc.dao.base.BaseMapper;
import com.baidu.brcc.dao.base.CommonMapper;
import com.baidu.brcc.domain.ConfigChangeLogExample;
import com.baidu.brcc.domain.ConfigChangeLogWithBLOBs;
import com.baidu.brcc.domain.ConfigGroup;
import com.baidu.brcc.service.ConfigGroupService;

public class ConfigChangeLogServiceImplTest {
    @Mock
    Logger LOGGER;
    @Mock
    ThreadPoolTaskExecutor executor;
    @Mock
    ConfigChangeLogMapper configChangeLogMapper;
    @Mock
    ConfigGroupService configGroupService;
    @Mock
    CommonMapper commonMapper;
    @InjectMocks
    ConfigChangeLogServiceImpl configChangeLogServiceImpl;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetMapper() throws Exception {
        BaseMapper<ConfigChangeLogWithBLOBs, Long, ConfigChangeLogExample> result =
                configChangeLogServiceImpl.getMapper();

    }

    @Test
    public void testNewExample() throws Exception {
        ConfigChangeLogExample result = configChangeLogServiceImpl.newExample();

    }

    @Test
    public void testNewIdInExample() throws Exception {
        ConfigChangeLogExample result = configChangeLogServiceImpl.newIdInExample(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testSaveLogWithBackground() throws Exception {
        when(configGroupService.selectByPrimaryKey(any(), anyVararg())).thenReturn(new ConfigGroup());

        configChangeLogServiceImpl
                .saveLogWithBackground(Long.valueOf(1), "operator", Long.valueOf(1), new HashMap<String, String>() {{
                    put("String", "String");
                }}, new HashMap<String, String>() {{
                    put("String", "String");
                }}, new GregorianCalendar(2021, Calendar.MARCH, 10, 14, 45).getTime());
    }

    @Test
    public void testStop() throws Exception {
        configChangeLogServiceImpl.stop();
    }

    @Test
    public void testCountByExample() throws Exception {
        when(configChangeLogMapper.countByExample(any())).thenReturn(0L);

        long result = configChangeLogServiceImpl.countByExample(null);

    }

    @Test
    public void testDeleteByPrimaryKey() throws Exception {
        when(configChangeLogMapper.deleteByPrimaryKey(any())).thenReturn(0);

        int result = configChangeLogServiceImpl.deleteByPrimaryKey(Long.valueOf(1));

    }

    @Test
    public void testDeleteByExample() throws Exception {
        when(configChangeLogMapper.deleteByExample(any())).thenReturn(0);

        int result = configChangeLogServiceImpl.deleteByExample(null);

    }

    @Test
    public void testInsert() throws Exception {
        when(configChangeLogMapper.insert(any())).thenReturn(0);

        int result = configChangeLogServiceImpl.insert(new ConfigChangeLogWithBLOBs());

    }

    @Test
    public void testInsertSelective() throws Exception {
        when(configChangeLogMapper.insertSelective(any())).thenReturn(0);

        int result = configChangeLogServiceImpl.insertSelective(new ConfigChangeLogWithBLOBs());

    }

    @Test
    public void testUpdateByPrimaryKeySelective() throws Exception {
        when(configChangeLogMapper.updateByPrimaryKeySelective(any())).thenReturn(0);

        int result = configChangeLogServiceImpl.updateByPrimaryKeySelective(new ConfigChangeLogWithBLOBs());

    }

    @Test
    public void testUpdateByPrimaryKey() throws Exception {
        when(configChangeLogMapper.updateByPrimaryKey(any())).thenReturn(0);

        int result = configChangeLogServiceImpl.updateByPrimaryKey(new ConfigChangeLogWithBLOBs());

    }

    @Test
    public void testUpdateByExampleSelective() throws Exception {
        when(configChangeLogMapper.updateByExampleSelective(any(), any())).thenReturn(0);

        int result = configChangeLogServiceImpl.updateByExampleSelective(new ConfigChangeLogWithBLOBs(), null);

    }
}
