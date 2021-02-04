/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.dao;

import org.apache.ibatis.annotations.Mapper;

import com.baidu.brcc.dao.base.BaseMapper;
import com.baidu.brcc.domain.OperationLog;
import com.baidu.brcc.domain.OperationLogExample;

@Mapper
public interface OperationLogMapper extends BaseMapper<OperationLog, Long, OperationLogExample> {
}
