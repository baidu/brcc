/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
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
