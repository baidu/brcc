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
package com.baidu.brcc.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baidu.brcc.common.Constants;
import com.baidu.brcc.domain.Product;
import com.baidu.brcc.domain.exception.BizException;
import com.baidu.brcc.utils.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baidu.brcc.dao.ProductUserMapper;
import com.baidu.brcc.dao.base.BaseMapper;
import com.baidu.brcc.domain.ProductUser;
import com.baidu.brcc.domain.ProductUserExample;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.em.ProductUserAdmin;
import com.baidu.brcc.domain.em.UserRole;
import com.baidu.brcc.domain.meta.MetaProductUser;
import com.baidu.brcc.service.ProductUserService;
import com.baidu.brcc.service.base.GenericServiceImpl;

@Service("productUserService")
public class ProductUserServiceImpl extends GenericServiceImpl<ProductUser, Long, ProductUserExample>
        implements ProductUserService {

    @Autowired
    private ProductUserMapper productUserMapper;

    @Override
    public BaseMapper<ProductUser, Long, ProductUserExample> getMapper() {
        return productUserMapper;
    }

    @Override
    public ProductUserExample newExample() {
        return ProductUserExample.newBuilder().build();
    }

    @Override
    public ProductUserExample newIdInExample(List<Long> ids) {
        return ProductUserExample.newBuilder().build().createCriteria().andIdIn(ids).toExample();
    }

    @Override
    public ProductUser selectProductUserByUserIdAndProductId(Long userId, Long productId) {
        return selectOneByExample(ProductUserExample.newBuilder()
                .build()
                .createCriteria()
                .andUserIdEqualTo(userId)
                .andProductIdEqualTo(productId)
                .toExample()
        );
    }

    @Override
    public Map<Long, ProductUser> queryProductUserByProductId(Long productId) {
        return selectMapByExample(ProductUserExample.newBuilder()
                        .build()
                        .createCriteria()
                        .andProductIdEqualTo(productId)
                        .toExample(),
                ProductUser::getUserId
        );
    }

    @Override
    public boolean checkAuth(Long productId, User user) {
        if (user == null) {
            return false;
        }
        if (UserRole.SYSADMIN.getValue().equals(user.getRole())) {
            return true;
        }
        ProductUser productUser = selectOneByExample(ProductUserExample.newBuilder()
                        .build()
                        .createCriteria()
                        .andProductIdEqualTo(productId)
                        .andUserIdEqualTo(user.getId())
                        .andIsAdminEqualTo(ProductUserAdmin.YES.getValue())
                        .toExample(),
                MetaProductUser.COLUMN_NAME_ID
        );
        return productUser != null;
    }

    @Override
    public String selectProductManagerByProductId(Long productId) {
        List<ProductUser> productUserList = selectByExample(ProductUserExample.newBuilder()
                .build()
                .createCriteria()
                .andProductIdEqualTo(productId)
                .andIsAdminEqualTo(ProductUserAdmin.YES.getValue()).toExample());
        if (productUserList == null || productUserList.size() <= 0) {
            return null;
        }
        StringBuilder name = new StringBuilder();
        for(ProductUser item : productUserList) {
            name.append(item.getUserName());
            name.append(',');
        }
        return name.substring(0,name.length() - 1);
    }

    @Override
    public List<Long> queryProductsByUserNameAndAdmin(String username, byte isAdmin) {
        List<ProductUser> productUserList = productUserMapper.queryProductIdsByUserNameAndAdmin(username, isAdmin);
        if (CollectionUtils.isEmpty(productUserList)) {
            return new ArrayList<>();
        }
        List<Long> productIds = productUserList.stream()
                .map(ProductUser::getProductId)
                .collect(Collectors.toList());
        return productIds;
    }

}
