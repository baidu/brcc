/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.dao;

import org.apache.ibatis.annotations.Mapper;

import com.baidu.brcc.dao.base.BaseMapper;
import com.baidu.brcc.domain.EnvironmentUser;
import com.baidu.brcc.domain.EnvironmentUserExample;

@Mapper
public interface EnvironmentUserMapper extends BaseMapper<EnvironmentUser, Long, EnvironmentUserExample> {
}
