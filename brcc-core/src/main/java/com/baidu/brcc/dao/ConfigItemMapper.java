/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.dao;

import org.apache.ibatis.annotations.Mapper;

import com.baidu.brcc.dao.base.BaseMapper;
import com.baidu.brcc.domain.ConfigItem;
import com.baidu.brcc.domain.ConfigItemExample;

@Mapper
public interface ConfigItemMapper extends BaseMapper<ConfigItem, Long, ConfigItemExample> {
}
