/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.dao;

import org.apache.ibatis.annotations.Mapper;

import com.baidu.brcc.dao.base.BaseMapper;
import com.baidu.brcc.domain.Version;
import com.baidu.brcc.domain.VersionExample;

@Mapper
public interface VersionMapper extends BaseMapper<Version, Long, VersionExample> {
}
