/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.service;

import java.util.Map;

import com.baidu.brcc.service.base.GenericService;
import com.baidu.brcc.domain.ProductUser;
import com.baidu.brcc.domain.ProductUserExample;
import com.baidu.brcc.domain.User;

public interface ProductUserService extends GenericService<ProductUser, Long, ProductUserExample> {

    ProductUser selectProductUserByUserIdAndProductId(Long userId, Long productId);

    Map<Long, ProductUser> queryProductUserByProductId(Long productId);

    boolean checkAuth(Long productId, User user);
}
