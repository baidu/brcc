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
package com.baidu.brcc.controller;

import static com.baidu.brcc.common.ErrorStatusMsg.NON_LOGIN_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PRIV_MIS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PRODUCT_NAME_EMPTY_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PRODUCT_NOT_EXISTS_STATUS;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyLong;
import static org.mockito.Mockito.anyVararg;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.baidu.brcc.domain.Product;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.base.Pagination;
import com.baidu.brcc.domain.base.R;
import com.baidu.brcc.domain.em.UserRole;
import com.baidu.brcc.domain.vo.ProductReq;
import com.baidu.brcc.domain.vo.ProductVo;
import com.baidu.brcc.service.ProductService;
import com.baidu.brcc.service.ProductUserService;

public class ProductControllerTest {
    private static final Long ID = 1L;
    private static final int OK = 0;
    private User user = null;

    @Mock
    ProductService productService;
    @Mock
    ProductUserService productUserService;
    @InjectMocks
    ProductController productController;

    @Before
    public void setUp() {
        user = new User();
        user.setId(ID);
        user.setName("test-user");
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSaveProductNoLogin() throws Exception {
        R result = productController.saveProduct(new ProductReq(), null);
        Assert.assertEquals(NON_LOGIN_STATUS, result.getStatus());
    }

    @Test
    public void testSaveProductForUpdate() throws Exception {
        ProductReq req = new ProductReq();
        req.setId(ID);
        req.setName("product");
        R result = productController.saveProduct(req, user);
        Assert.assertEquals(PRODUCT_NOT_EXISTS_STATUS.intValue(), result.getStatus());

        Product product = new Product();
        product.setId(ID);
        when(productService.selectByPrimaryKey(any(), anyVararg())).thenReturn(product);
        result = productController.saveProduct(req, user);
        Assert.assertEquals(PRIV_MIS_STATUS.intValue(), result.getStatus());

        when(productUserService.checkAuth(anyLong(), any())).thenReturn(true);
        result = productController.saveProduct(req, user);
        Assert.assertEquals(OK, result.getStatus());
    }

    @Test
    public void testSaveProductForInsert() throws Exception {
        ProductReq req = new ProductReq();
        req.setId(null);
        R result = productController.saveProduct(req, user);
        Assert.assertEquals(PRIV_MIS_STATUS.intValue(), result.getStatus());

        user.setRole(UserRole.SYSADMIN.getValue());
        result = productController.saveProduct(req, user);
        Assert.assertEquals(PRODUCT_NAME_EMPTY_STATUS.intValue(), result.getStatus());

        req.setName("product");
        Product product = new Product();
        product.setId(ID);
        when(productService.selectByPrimaryKey(any(), anyVararg())).thenReturn(product);
        result = productController.saveProduct(req, user);
        Assert.assertEquals(OK, result.getStatus());
    }

    @Test
    public void testAddMember() throws Exception {

        R result = productController.addMember(null, ID, null);
        Assert.assertEquals(NON_LOGIN_STATUS, result.getStatus());

        result = productController.addMember(Arrays.asList("prd1"), ID, user);
        Assert.assertEquals(PRIV_MIS_STATUS.intValue(), result.getStatus());

        when(productUserService.checkAuth(anyLong(), any())).thenReturn(true);
        result = productController.addMember(Arrays.asList("prd1"), ID, user);

        Assert.assertEquals(OK, result.getStatus());
    }

    @Test
    public void testMyProduct() throws Exception {
        R<Pagination<ProductVo>> result = productController.myProduct("name", "id", "desc", 0, 20, null);
        Assert.assertEquals(NON_LOGIN_STATUS, result.getStatus());

        result = productController.myProduct("name", "id", "desc", 0, 20, user);
        Assert.assertEquals(OK, result.getStatus());
    }

    @Test
    public void testMembers() throws Exception {
        R<List<String>> result = productController.members(ID);
        Assert.assertEquals(OK, result.getStatus());
    }
}
