/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.dao;

import org.apache.ibatis.annotations.Mapper;

import com.baidu.brcc.dao.base.BaseMapper;
import com.baidu.brcc.domain.Project;
import com.baidu.brcc.domain.ProjectExample;

@Mapper
public interface ProjectMapper extends BaseMapper<Project, Long, ProjectExample> {
}
