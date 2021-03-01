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
