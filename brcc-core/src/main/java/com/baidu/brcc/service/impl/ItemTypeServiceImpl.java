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

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baidu.brcc.dao.ItemTypeMapper;
import com.baidu.brcc.dao.base.BaseMapper;
import com.baidu.brcc.domain.ItemType;
import com.baidu.brcc.domain.ItemTypeExample;
import com.baidu.brcc.service.ItemTypeService;
import com.baidu.brcc.service.base.GenericServiceImpl;

@Service("itemTypeService")
public class ItemTypeServiceImpl extends GenericServiceImpl<ItemType, Long, ItemTypeExample> implements ItemTypeService {

    @Autowired
    private ItemTypeMapper itemTypeMapper;

    @Override
    public BaseMapper<ItemType, Long, ItemTypeExample> getMapper() {
        return itemTypeMapper;
    }

    @Override
    public ItemTypeExample newExample() {
        return ItemTypeExample.newBuilder().build();
    }

    @Override
    public ItemTypeExample newIdInExample(List<Long> ids) {
        return ItemTypeExample.newBuilder().build().createCriteria().andIdIn(ids).toExample();
    }
}
