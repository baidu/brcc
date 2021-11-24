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

    Long saveProduct(Product product, User user);
}
