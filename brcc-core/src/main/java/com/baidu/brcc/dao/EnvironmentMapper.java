/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.dao;

import org.apache.ibatis.annotations.Mapper;

import com.baidu.brcc.dao.base.BaseMapper;
import com.baidu.brcc.domain.Environment;
import com.baidu.brcc.domain.EnvironmentExample;

@Mapper
public interface EnvironmentMapper extends BaseMapper<Environment, Long, EnvironmentExample> {
}
