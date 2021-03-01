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
package com.baidu.brcc.service.base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;

import com.baidu.brcc.dao.base.BaseMapper;
import com.baidu.brcc.dao.base.CommonMapper;
import com.baidu.brcc.domain.base.BaseExample;
import com.baidu.brcc.domain.base.Pagination;

public abstract class GenericServiceImpl<ENTRY, ID, EXAMPLE extends BaseExample>
        implements GenericService<ENTRY, ID, EXAMPLE> {

    @Autowired
    protected CommonMapper commonMapper;

    public abstract BaseMapper<ENTRY, ID, EXAMPLE> getMapper();

    public abstract EXAMPLE newExample();

    public abstract EXAMPLE newIdInExample(List<ID> ids);

    @Override
    public long countByExample(EXAMPLE example) {
        long count = getMapper().countByExample(example);
        return count;
    }

    @Override
    public int deleteByPrimaryKey(ID id) {
        int deleteCount = getMapper().deleteByPrimaryKey(id);
        return deleteCount;
    }

    @Override
    public int deleteByExample(EXAMPLE example) {
        int deleteCount = getMapper().deleteByExample(example);
        return deleteCount;
    }

    @Override
    public int insert(ENTRY entity) {
        int insertCount = getMapper().insert(entity);
        return insertCount;
    }

    @Override
    public int insertSelective(ENTRY entity) {
        int insertCount = getMapper().insertSelective(entity);
        return insertCount;
    }

    @Override
    public int updateByPrimaryKeySelective(ENTRY entity) {
        int updateCount = getMapper().updateByPrimaryKeySelective(entity);
        return updateCount;
    }

    @Override
    public int updateByPrimaryKey(ENTRY entity) {
        int updateCount = getMapper().updateByPrimaryKey(entity);
        return updateCount;
    }

    @Override
    public int updateByExampleSelective(ENTRY entity, EXAMPLE example) {
        int updateCount = getMapper().updateByExampleSelective(entity, example);
        return updateCount;
    }

    @Override
    public List<ENTRY> selectByExample(EXAMPLE example, String... columns) {
        if (columns != null && columns.length > 0) {
            example.addColumns(columns);
        }
        List<ENTRY> entries = getMapper().selectByExample(example);
        return entries;
    }

    @Override
    public Map<ID, ENTRY> selectMapByExample(EXAMPLE example, Function<ENTRY, ID> keyConverter, String... columns) {
        List<ENTRY> entries = selectByExample(example, columns);
        if (entries == null || entries.isEmpty()) {
            return new HashMap<>(0);
        }
        Map<ID, ENTRY> map = new HashMap<>();
        for (ENTRY entry : entries) {
            if (entry != null) {
                map.put(keyConverter.apply(entry), entry);
            }
        }
        return map;
    }

    @Override
    public <KEY, T> Map<KEY, T> selectMapByExample(EXAMPLE example, Function<ENTRY, KEY> keyConverter,
                                                   Function<ENTRY, T> converter, String... columns) {
        List<ENTRY> entries = selectByExample(example, columns);
        if (entries == null || entries.isEmpty()) {
            return new HashMap<>(0);
        }
        Map<KEY, T> map = new HashMap<>();
        for (ENTRY entry : entries) {
            if (entry != null) {
                map.put(keyConverter.apply(entry), converter.apply(entry));
            }
        }
        return map;
    }

    @Override
    public <KEY, T> Map<KEY, List<T>> selectMapListByExample(EXAMPLE example, Function<ENTRY, KEY> keyConverter,
                                                             Function<ENTRY, T> converter, String... columns) {
        List<ENTRY> entries = selectByExample(example, columns);
        if (entries == null || entries.isEmpty()) {
            return new HashMap<>(0);
        }
        Map<KEY, List<T>> map = new HashMap<>();
        for (ENTRY entry : entries) {
            if (entry != null) {
                KEY key = keyConverter.apply(entry);
                if (!map.containsKey(key)) {
                    map.put(key, new ArrayList<>());
                }
                map.get(key).add(converter.apply(entry));
            }
        }
        return map;
    }

    @Override
    public <T> List<T> selectByExample(EXAMPLE example, Function<ENTRY, T> converter, String... columns) {
        List<ENTRY> dataList = selectByExample(example, columns);
        List<T> list = new ArrayList<>();
        if (dataList != null && !dataList.isEmpty()) {
            for (ENTRY entry : dataList) {
                list.add(converter.apply(entry));
            }
        }
        return list;
    }

    @Override
    public ENTRY selectOneByExample(EXAMPLE example, String... columns) {
        example.setLimit(1);
        List<ENTRY> entries = selectByExample(example, columns);
        if (entries == null || entries.isEmpty()) {
            return null;
        }
        return entries.get(0);
    }

    @Override
    public <T> T selectOneByExample(EXAMPLE example, Function<ENTRY, T> converter, String... columns) {
        ENTRY entry = selectOneByExample(example, columns);
        if (entry == null) {
            return null;
        }
        return converter.apply(entry);
    }

    @Override
    public List<ENTRY> selectAll(String... columns) {
        EXAMPLE example = newExample();
        return selectByExample(example, columns);
    }

    @Override
    public <T> List<T> selectAll(Function<ENTRY, T> converter, String... columns) {
        List<ENTRY> dataList = selectAll(columns);
        List<T> list = new ArrayList<>();
        if (dataList != null && !dataList.isEmpty()) {
            for (ENTRY entry : dataList) {
                list.add(converter.apply(entry));
            }
        }
        return list;
    }

    @Override
    public ENTRY selectByPrimaryKey(ID id, String... columns) {
        if (id == null) {
            return null;
        }
        List<ENTRY> entries = selectByPrimaryKeys(Arrays.asList(id), columns);
        if (entries == null || entries.isEmpty()) {
            return null;
        }
        return entries.get(0);
    }

    @Override
    public <T> T selectByPrimaryKey(ID id, Function<ENTRY, T> converter, String... columns) {
        ENTRY entry = selectByPrimaryKey(id, columns);
        if (entry == null) {
            return null;
        }
        return converter.apply(entry);
    }

    @Override
    public List<ENTRY> selectByPrimaryKeys(List<ID> ids, String... columns) {
        if (ids == null || ids.isEmpty()) {
            return new ArrayList<>(0);
        }
        EXAMPLE example = newIdInExample(ids);
        List<ENTRY> entries = selectByExample(example, columns);
        if (entries == null) {
            entries = new ArrayList<>(0);
        }
        return entries;
    }

    @Override
    public List<ENTRY> selectByPrimaryKeys(Set<ID> ids, String... columns) {
        return selectByPrimaryKeys(set2List(ids), columns);
    }

    @Override
    public <T> List<T> selectByPrimaryKeys(List<ID> ids, Function<ENTRY, T> converter, String... columns) {
        List<ENTRY> entries = selectByPrimaryKeys(ids, columns);
        if (entries == null || entries.isEmpty()) {
            return new ArrayList<>(0);
        }
        List<T> list = new ArrayList<>();
        for (ENTRY entry : entries) {
            if (entry != null) {
                list.add(converter.apply(entry));
            }
        }
        return list;
    }

    @Override
    public Map<ID, ENTRY> selectMapByPrimaryKeys(List<ID> ids, Function<ENTRY, ID> keyConverter, String... columns) {
        List<ENTRY> entries = selectByPrimaryKeys(ids, columns);
        if (entries == null || entries.isEmpty()) {
            return new HashMap<>(0);
        }
        Map<ID, ENTRY> map = new HashMap<>();
        for (ENTRY entry : entries) {
            if (entry != null) {
                map.put(keyConverter.apply(entry), entry);
            }
        }
        return map;
    }

    @Override
    public Map<ID, ENTRY> selectMapByPrimaryKeys(Set<ID> ids, Function<ENTRY, ID> keyConverter, String... columns) {
        return selectMapByPrimaryKeys(set2List(ids), keyConverter, columns);
    }

    @Override
    public <KEY, T> Map<KEY, T> selectMapByPrimaryKeys(List<ID> ids, Function<ENTRY, KEY> keyConverter, Function<ENTRY,
            T> converter, String... columns) {

        List<ENTRY> entries = selectByPrimaryKeys(ids, columns);
        if (entries == null || entries.isEmpty()) {
            return new HashMap<>(0);
        }
        Map<KEY, T> map = new HashMap<>();
        for (ENTRY entry : entries) {
            if (entry != null) {
                map.put(keyConverter.apply(entry), converter.apply(entry));
            }
        }
        return map;
    }

    @Override
    public <KEY, T> Map<KEY, T> selectMapByPrimaryKeys(Set<ID> ids, Function<ENTRY, KEY> keyConverter,
                                                       Function<ENTRY, T> converter, String... columns) {
        return selectMapByPrimaryKeys(set2List(ids), keyConverter, converter, columns);
    }

    @Override
    public <KEY, T> Map<KEY, List<T>> selectMapListByPrimaryKeys(List<ID> ids, Function<ENTRY, KEY> keyConverter,
                                                                 Function<ENTRY, T> converter, String... columns) {

        List<ENTRY> entries = selectByPrimaryKeys(ids, columns);
        if (entries == null || entries.isEmpty()) {
            return new HashMap<>(0);
        }
        Map<KEY, List<T>> map = new HashMap<>();
        for (ENTRY entry : entries) {
            if (entry != null) {
                KEY key = keyConverter.apply(entry);
                if (!map.containsKey(key)) {
                    map.put(key, new ArrayList<>());
                }
                map.get(key).add(converter.apply(entry));
            }
        }
        return map;
    }

    public Pagination<ENTRY> pagination(EXAMPLE example, String... columns) {
        long total = countByExample(example);
        List<ENTRY> dataList = selectByExample(example, columns);
        Pagination pagination = new Pagination();
        pagination.setTotal(total);
        pagination.setDataList(dataList);
        return pagination;
    }

    public <T> Pagination<T> pagination(EXAMPLE example, Function<ENTRY, T> converter, String... columns) {
        long total = countByExample(example);
        List<ENTRY> dataList = selectByExample(example, columns);
        List<T> list = new ArrayList<>();
        if (dataList != null && !dataList.isEmpty()) {
            for (ENTRY entry : dataList) {
                list.add(converter.apply(entry));
            }
        }
        Pagination pagination = new Pagination();
        pagination.setTotal(total);
        pagination.setDataList(list);
        return pagination;
    }
}
