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
import static org.mockito.Mockito.anyLong;
import static org.mockito.Mockito.anyVararg;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;

import com.baidu.brcc.dao.ConfigGroupMapper;
import com.baidu.brcc.dao.base.BaseMapper;
import com.baidu.brcc.dao.base.CommonMapper;
import com.baidu.brcc.domain.ConfigGroup;
import com.baidu.brcc.domain.ConfigGroupExample;
import com.baidu.brcc.domain.ConfigItem;
import com.baidu.brcc.domain.Environment;
import com.baidu.brcc.domain.EnvironmentUser;
import com.baidu.brcc.domain.Product;
import com.baidu.brcc.domain.ProductUser;
import com.baidu.brcc.domain.Project;
import com.baidu.brcc.domain.ProjectUser;
import com.baidu.brcc.domain.Version;
import com.baidu.brcc.domain.em.Deleted;
import com.baidu.brcc.service.ConfigItemService;
import com.baidu.brcc.service.EnvironmentService;
import com.baidu.brcc.service.EnvironmentUserService;
import com.baidu.brcc.service.ProductService;
import com.baidu.brcc.service.ProductUserService;
import com.baidu.brcc.service.ProjectService;
import com.baidu.brcc.service.ProjectUserService;
import com.baidu.brcc.service.RccCache;
import com.baidu.brcc.service.VersionService;

public class ConfigGroupServiceImplTest {
    @Mock
    ConfigGroupMapper configGroupMapper;
    @Mock
    ConfigItemService configItemService;
    @Mock
    ProductUserService productUserService;
    @Mock
    ProductService productService;
    @Mock
    ProjectService projectService;
    @Mock
    ProjectUserService projectUserService;
    @Mock
    EnvironmentService environmentService;
    @Mock
    EnvironmentUserService environmentUserService;
    @Mock
    VersionService versionService;
    @Mock
    RccCache rccCache;
    @Mock
    Logger log;
    @Mock
    CommonMapper commonMapper;
    @InjectMocks
    ConfigGroupServiceImpl configGroupServiceImpl;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetMapper() throws Exception {
        BaseMapper<ConfigGroup, Long, ConfigGroupExample> result = configGroupServiceImpl.getMapper();

    }

    @Test
    public void testNewExample() throws Exception {
        ConfigGroupExample result = configGroupServiceImpl.newExample();

    }

    @Test
    public void testNewIdInExample() throws Exception {
        ConfigGroupExample result = configGroupServiceImpl.newIdInExample(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testDeleteCascadeByGroupId() throws Exception {
        ConfigGroup group = new ConfigGroup();
        group.setVersionId(1L);
        group.setDeleted(Deleted.OK.getValue());
        group.setProjectId(1L);
        group.setEnvironmentId(1L);
        group.setProductId(1L);
        when(configGroupMapper.selectByPrimaryKey(any())).thenReturn(group);
        when(configItemService.deleteByGroupId(anyLong())).thenReturn(0);
        when(configItemService.selectByPrimaryKey(any(), anyVararg())).thenReturn(new ConfigItem());
        when(productUserService.selectByPrimaryKey(any(), anyVararg())).thenReturn(new ProductUser());
        when(productService.selectByPrimaryKey(any(), anyVararg())).thenReturn(new Product());
        when(projectService.selectByPrimaryKey(any(), anyVararg())).thenReturn(new Project());
        when(projectUserService.selectByPrimaryKey(any(), anyVararg())).thenReturn(new ProjectUser());
        when(environmentService.selectByPrimaryKey(any(), anyVararg())).thenReturn(new Environment());
        when(environmentUserService.selectByPrimaryKey(any(), anyVararg())).thenReturn(new EnvironmentUser());
        when(versionService.selectByPrimaryKey(any(), anyVararg())).thenReturn(new Version());

        int result = configGroupServiceImpl.deleteCascadeByGroupId(Long.valueOf(1));

    }

    @Test
    public void testDeleteByVersionId() throws Exception {
        int result = configGroupServiceImpl.deleteByVersionId(Long.valueOf(1));

    }

    @Test
    public void testDeleteByEnvId() throws Exception {
        int result = configGroupServiceImpl.deleteByEnvId(Long.valueOf(1));

    }

    @Test
    public void testDeleteByProjectId() throws Exception {
        int result = configGroupServiceImpl.deleteByProjectId(Long.valueOf(1));

    }
}
