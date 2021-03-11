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
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.baidu.brcc.dao.ApiTokenMapper;
import com.baidu.brcc.dao.base.BaseMapper;
import com.baidu.brcc.dao.base.CommonMapper;
import com.baidu.brcc.domain.ApiToken;
import com.baidu.brcc.domain.ApiTokenExample;

public class ApiTokenServiceImplTest {
    @Mock
    ApiTokenMapper apiTokenMapper;
    @Mock
    CommonMapper commonMapper;
    @InjectMocks
    ApiTokenServiceImpl apiTokenServiceImpl;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetMapper() throws Exception {
        BaseMapper<ApiToken, Long, ApiTokenExample> result = apiTokenServiceImpl.getMapper();

    }

    @Test
    public void testNewExample() throws Exception {
        ApiTokenExample result = apiTokenServiceImpl.newExample();

    }

    @Test
    public void testNewIdInExample() throws Exception {
        ApiTokenExample result = apiTokenServiceImpl.newIdInExample(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testSave() throws Exception {
        Long result = apiTokenServiceImpl.save("token", Long.valueOf(1), "projectName");

    }

    @Test
    public void testSelectByToken() throws Exception {
        ApiToken result = apiTokenServiceImpl.selectByToken("token");

    }

    @Test
    public void testSelectByProjectId() throws Exception {
        List<ApiToken> result = apiTokenServiceImpl.selectByProjectId(Long.valueOf(1), "columns");

    }

    @Test
    public void testDeleteByIds() throws Exception {
        int result = apiTokenServiceImpl.deleteByIds(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testCountByExample() throws Exception {
        when(apiTokenMapper.countByExample(any())).thenReturn(0L);

        long result = apiTokenServiceImpl.countByExample(null);

    }

    @Test
    public void testDeleteByPrimaryKey() throws Exception {
        when(apiTokenMapper.deleteByPrimaryKey(any())).thenReturn(0);

        int result = apiTokenServiceImpl.deleteByPrimaryKey(Long.valueOf(1));

    }

    @Test
    public void testDeleteByExample() throws Exception {
        when(apiTokenMapper.deleteByExample(any())).thenReturn(0);

        int result = apiTokenServiceImpl.deleteByExample(ApiTokenExample
                .newBuilder()
                .build()
                .createCriteria()
                .andIdEqualTo(1L)
                .toExample()
        );

    }

    @Test
    public void testInsert() throws Exception {
        when(apiTokenMapper.insert(any())).thenReturn(0);

        int result = apiTokenServiceImpl.insert(ApiToken.newBuilder().id(1L).token("abc").build());

    }

    @Test
    public void testInsertSelective() throws Exception {
        when(apiTokenMapper.insertSelective(any())).thenReturn(0);

        int result = apiTokenServiceImpl.insertSelective(new ApiToken());

    }

    @Test
    public void testUpdateByPrimaryKeySelective() throws Exception {
        when(apiTokenMapper.updateByPrimaryKeySelective(any())).thenReturn(0);

        int result = apiTokenServiceImpl.updateByPrimaryKeySelective(new ApiToken());

    }

    @Test
    public void testUpdateByPrimaryKey() throws Exception {
        when(apiTokenMapper.updateByPrimaryKey(any())).thenReturn(0);

        int result = apiTokenServiceImpl.updateByPrimaryKey(new ApiToken());

    }

    @Test
    public void testUpdateByExampleSelective() throws Exception {
        when(apiTokenMapper.updateByExampleSelective(any(), any())).thenReturn(0);

        int result = apiTokenServiceImpl.updateByExampleSelective(new ApiToken(),
                ApiTokenExample.newBuilder().build().createCriteria().andIdEqualTo(1L).toExample());

    }
}
