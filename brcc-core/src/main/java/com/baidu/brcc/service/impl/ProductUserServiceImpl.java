/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.service.impl;

import java.util.List;
import java.util.Map;

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
                ProductUser :: getUserId
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
}
