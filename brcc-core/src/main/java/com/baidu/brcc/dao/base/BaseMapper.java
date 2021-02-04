/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.dao.base;

import java.util.List;

import org.apache.ibatis.annotations.Flush;
import org.apache.ibatis.annotations.Param;

public interface BaseMapper<ENTRY, ID, EXAMPLE> {
    long countByExample(EXAMPLE example);

    int deleteByExample(EXAMPLE example);

    int deleteByPrimaryKey(ID id);

    int insert(ENTRY entity);

    int insertSelective(ENTRY entity);

    List<ENTRY> selectByExample(EXAMPLE example);

    ENTRY selectByPrimaryKey(ID id);

    int updateByExampleSelective(@Param("record") ENTRY record, @Param("example") EXAMPLE example);

    int updateByExample(@Param("record") ENTRY record, @Param("example") EXAMPLE example);

    int updateByPrimaryKeySelective(ENTRY entity);

    int updateByPrimaryKey(ENTRY entity);

    @Flush
    List flush();
}
