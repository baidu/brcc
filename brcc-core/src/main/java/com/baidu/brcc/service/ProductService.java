/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.service;

import java.util.List;

import com.baidu.brcc.domain.Product;
import com.baidu.brcc.domain.ProductExample;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.base.Pagination;
import com.baidu.brcc.domain.vo.ProductVo;
import com.baidu.brcc.service.base.GenericService;

public interface ProductService extends GenericService<Product, Long, ProductExample> {

    Pagination<ProductVo> queryProductByUser(String name,
                                             String sortField,
                                             String sortBy,
                                             User user,
                                             Integer pageNo,
                                             Integer pageSize);

    void addMember(List<String> members, Long productId);

    Product selectByName(String name);
}
