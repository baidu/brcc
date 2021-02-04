/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.dao;

import org.apache.ibatis.annotations.Mapper;

import com.baidu.brcc.dao.base.BaseMapper;
import com.baidu.brcc.domain.ApiToken;
import com.baidu.brcc.domain.ApiTokenExample;

@Mapper
public interface ApiTokenMapper extends BaseMapper<ApiToken, Long, ApiTokenExample> {
}
