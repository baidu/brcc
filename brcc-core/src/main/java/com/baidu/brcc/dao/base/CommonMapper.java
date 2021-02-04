/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.dao.base;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;

@Mapper
public interface CommonMapper {
    /**
     *
     * @param baseSql -> BaseSQL
     * @param sqlParam -> SQLParam
     * @return
     */
    @SelectProvider(type = CommonProvider.class, method = "select")
    List<Map<String, Object>> selectListMap(@Param("sql") Object baseSql, @Param("param") Object sqlParam);

    /**
     *
     * @param baseSql -> BaseSQL
     * @param sqlParam -> SQLParam
     * @return
     */
    @SelectProvider(type = CommonProvider.class, method = "select")
    Map<String, Object> selectOneMap(@Param("sql") Object baseSql, @Param("param") Object sqlParam);

    /**
     *
     * @param baseSql -> BaseSQL
     * @param sqlParam -> SQLParam
     * @return
     */
    @SelectProvider(type = CommonProvider.class, method = "select")
    String selectOneString(@Param("sql") Object baseSql, @Param("param") Object sqlParam);

    /**
     *
     * @param baseSql -> BaseSQL
     * @param sqlParam -> SQLParam
     * @return
     */
    @SelectProvider(type = CommonProvider.class, method = "select")
    Long selectOneLong(@Param("sql") Object baseSql, @Param("param") Object sqlParam);

    /**
     *
     * @param baseSql -> BaseSQL
     * @param sqlParam -> SQLParam
     * @return
     */
    @SelectProvider(type = CommonProvider.class, method = "select")
    Integer selectOneInteger(@Param("sql") Object baseSql, @Param("param") Object sqlParam);

    /**
     *
     * @param baseSql -> BaseSQL
     * @param sqlParam -> SQLParam
     * @return
     */
    @SelectProvider(type = CommonProvider.class, method = "select")
    Byte selectOneByte(@Param("sql") Object baseSql, @Param("param") Object sqlParam);

    /**
     *
     * @param baseSql -> BaseSQL
     * @param sqlParam -> SQLParam
     * @return
     */
    @SelectProvider(type = CommonProvider.class, method = "select")
    Date selectOneDate(@Param("sql") Object baseSql, @Param("param") Object sqlParam);
}
