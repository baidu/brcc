/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.service.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

import com.baidu.brcc.domain.base.BaseExample;
import com.baidu.brcc.domain.base.Pagination;

public interface GenericService<ENTRY, ID, EXAMPLE extends BaseExample> {
    int insert(ENTRY entity);

    int insertSelective(ENTRY entity);

    int updateByPrimaryKeySelective(ENTRY entity);

    int updateByPrimaryKey(ENTRY entity);

    int updateByExampleSelective(ENTRY entity, EXAMPLE example);

    int deleteByPrimaryKey(ID id);

    int deleteByExample(EXAMPLE example);

    long countByExample(EXAMPLE example);

    List<ENTRY> selectByExample(EXAMPLE example, String... columns);

    Map<ID, ENTRY> selectMapByExample(EXAMPLE example, Function<ENTRY, ID> keyConverter, String... columns);

    <KEY, T> Map<KEY, T> selectMapByExample(EXAMPLE example, Function<ENTRY, KEY> keyConverter,
                                            Function<ENTRY, T> converter,
                                            String... columns);

    <KEY, T> Map<KEY, List<T>> selectMapListByExample(EXAMPLE example, Function<ENTRY, KEY> keyConverter,
                                                      Function<ENTRY, T> converter,
                                                      String... columns);

    <T> List<T> selectByExample(EXAMPLE example, Function<ENTRY, T> converter, String... columns);

    ENTRY selectOneByExample(EXAMPLE example, String... columns);

    <T> T selectOneByExample(EXAMPLE example, Function<ENTRY, T> converter, String... columns);

    List<ENTRY> selectAll(String... columns);

    <T> List<T> selectAll(Function<ENTRY, T> converter, String... columns);

    ENTRY selectByPrimaryKey(ID id, String... columns);

    <T> T selectByPrimaryKey(ID id, Function<ENTRY, T> converter, String... columns);

    List<ENTRY> selectByPrimaryKeys(List<ID> ids, String... columns);

    List<ENTRY> selectByPrimaryKeys(Set<ID> ids, String... columns);

    <T> List<T> selectByPrimaryKeys(List<ID> ids, Function<ENTRY, T> converter, String... columns);

    Map<ID, ENTRY> selectMapByPrimaryKeys(List<ID> ids, Function<ENTRY, ID> keyConverter, String... columns);

    Map<ID, ENTRY> selectMapByPrimaryKeys(Set<ID> ids, Function<ENTRY, ID> keyConverter, String... columns);

    <KEY, T> Map<KEY, T> selectMapByPrimaryKeys(List<ID> ids, Function<ENTRY, KEY> keyConverter,
                                                Function<ENTRY, T> converter, String... columns);

    <KEY, T> Map<KEY, T> selectMapByPrimaryKeys(Set<ID> ids, Function<ENTRY, KEY> keyConverter,
                                                Function<ENTRY, T> converter, String... columns);

    <KEY, T> Map<KEY, List<T>> selectMapListByPrimaryKeys(List<ID> ids, Function<ENTRY, KEY> keyConverter,
                                                          Function<ENTRY, T> converter, String... columns);

    Pagination<ENTRY> pagination(EXAMPLE example, String... columns);

    <T> Pagination<T> pagination(EXAMPLE example, Function<ENTRY, T> converter, String... columns);

    default <T> List<T> set2List(Set<T> set) {
        if (set == null || set.isEmpty()) {
            return new ArrayList<>();
        }

        List<T> list = new ArrayList<>();
        for (T t : set) {
            list.add(t);
        }
        return list;
    }
}
