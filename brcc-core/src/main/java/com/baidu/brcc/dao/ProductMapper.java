/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.dao;

import org.apache.ibatis.annotations.Mapper;

import com.baidu.brcc.dao.base.BaseMapper;
import com.baidu.brcc.domain.Product;
import com.baidu.brcc.domain.ProductExample;

@Mapper
public interface ProductMapper extends BaseMapper<Product, Long, ProductExample> {
}
