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

import static com.baidu.brcc.common.ErrorStatusMsg.NON_LOGIN_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.NON_LOGIN_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PRIV_MIS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PRIV_MIS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PRODUCT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PRODUCT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PRODUCT_NAME_EMPTY_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PRODUCT_NAME_EMPTY_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PRODUCT_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PRODUCT_NOT_EXISTS_STATUS;
import static org.apache.commons.lang3.StringUtils.trim;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baidu.brcc.annotation.LoginUser;
import com.baidu.brcc.annotation.SaveLog;
import com.baidu.brcc.domain.Product;
import com.baidu.brcc.domain.ProductExample;
import com.baidu.brcc.domain.ProductUser;
import com.baidu.brcc.domain.ProductUserExample;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.base.Pagination;
import com.baidu.brcc.domain.base.R;
import com.baidu.brcc.domain.em.UserRole;
import com.baidu.brcc.domain.meta.MetaProduct;
import com.baidu.brcc.domain.meta.MetaProductUser;
import com.baidu.brcc.domain.meta.MetaProject;
import com.baidu.brcc.domain.vo.ProductReq;
import com.baidu.brcc.domain.vo.ProductVo;
import com.baidu.brcc.service.ProductService;
import com.baidu.brcc.service.ProductUserService;
import com.baidu.brcc.utils.time.DateTimeUtils;

/**
 * 产品线相关接口
 */
@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductUserService productUserService;

    /**
     * 添加或修改产品线
     *
     * @param req  req.id > 0 表示修改产品线， 否则新增产品线
     * @param user
     *
     * @return
     */
    @SaveLog(scene = "修改产品线",
            paramsIdxes = {0},
            params = {"req"})
    @PostMapping("save")
    public R saveProduct(@RequestBody ProductReq req, @LoginUser User user) {
        if (user == null) {
            return R.error(NON_LOGIN_STATUS, NON_LOGIN_MSG);
        }
        Long id = req.getId();
        String name = trim(req.getName());
        Date now = DateTimeUtils.now();
        if (id != null && id > 0) {
            // 修改
            Product product = productService.selectByPrimaryKey(id);
            if (product == null) {
                return R.error(PRODUCT_NOT_EXISTS_STATUS, PRODUCT_NOT_EXISTS_MSG);
            }
            if (!productUserService.checkAuth(id, user)) {
                return R.error(PRIV_MIS_STATUS, PRIV_MIS_MSG);
            }
            Product update = new Product();
            update.setId(id);
            update.setUpdateTime(now);
            if (StringUtils.isNotBlank(name)) {
                Product exists = productService.selectOneByExample(ProductExample.newBuilder()
                                .build()
                                .createCriteria()
                                .andIdNotEqualTo(id)
                                .andNameEqualTo(name)
                                .toExample(),
                        MetaProduct.COLUMN_NAME_ID
                );
                if (exists != null) {
                    return R.error(PRODUCT_EXISTS_STATUS, PRODUCT_EXISTS_MSG);
                }
                update.setName(name);
            }
            update.setMemo(req.getMemo());
            productService.updateByPrimaryKeySelective(update);
        } else {
            if (!UserRole.SYSADMIN.getValue().equals(user.getRole())) {
                return R.error(PRIV_MIS_STATUS, PRIV_MIS_MSG);
            }
            // 新增
            if (StringUtils.isBlank(name)) {
                return R.error(PRODUCT_NAME_EMPTY_STATUS, PRODUCT_NAME_EMPTY_MSG);
            }
            Product product = productService.selectOneByExample(ProductExample.newBuilder()
                            .build()
                            .createCriteria()
                            .andNameEqualTo(name)
                            .toExample(),
                    MetaProject.COLUMN_NAME_ID
            );
            if (product != null) {
                return R.error(PRODUCT_EXISTS_STATUS, PRODUCT_EXISTS_MSG);
            }
            Product insert = new Product();
            insert.setUpdateTime(now);
            insert.setCreateTime(now);
            insert.setName(name);
            insert.setMemo(req.getMemo());
            productService.insertSelective(insert);
            id = insert.getId();
        }
        return R.ok(id);
    }

    /**
     * 修改产品成员
     * @param members
     * @param productId
     * @param user
     * @return
     */
    @SaveLog(scene = "修改产品成员",
            paramsIdxes = {0, 1},
            params = {"members", "productId"})
    @PostMapping("addMember/{productId}")
    public R addMember(@RequestBody List<String> members,
                       @PathVariable("productId") Long productId,
                       @LoginUser User user
    ) {
        if (user == null) {
            return R.error(NON_LOGIN_STATUS, NON_LOGIN_MSG);
        }
        if (!productUserService.checkAuth(productId, user)) {
            return R.error(PRIV_MIS_STATUS, PRIV_MIS_MSG);
        }
        productService.addMember(members, productId);
        return R.ok();
    }

    /**
     * 我的产品线
     * @param name
     * @param sortField
     * @param sortBy
     * @param pageNo
     * @param pageSize
     * @param user
     * @return
     */
    @GetMapping("myProduct")
    public R<Pagination<ProductVo>> myProduct(
            @RequestParam(value = "name", defaultValue = "") String name,
            @RequestParam(value = "sortField", defaultValue = "id") String sortField,
            @RequestParam(value = "sortBy", defaultValue = "desc") String sortBy,
            @RequestParam(name = "pageNo", required = false, defaultValue = "1")
                                                    Integer pageNo,
                                              @RequestParam(name = "pageSize", required = false, defaultValue = "50")
                                                    Integer pageSize,
                                              @LoginUser User user
    ) {
        if (user == null) {
            return R.error(NON_LOGIN_STATUS, NON_LOGIN_MSG);
        }
        Pagination<ProductVo> productVoPagination =
                productService.queryProductByUser(name, sortField, sortBy, user, pageNo, pageSize);
        Map<String, Object> ext = new HashMap<>();
        ext.put("canManage", UserRole.SYSADMIN.getValue().equals(user.getRole()));
        return R.ok(productVoPagination, ext);
    }

    /**
     * 产品线成员
     * @param productId
     * @return
     */
    @GetMapping("members/{productId}")
    public R<List<String>> members(@PathVariable Long productId) {
        List<String> members = productUserService.selectByExample(ProductUserExample.newBuilder()
                        .build()
                        .createCriteria()
                        .andProductIdEqualTo(productId)
                        .toExample(),
                ProductUser :: getUserName,
                MetaProductUser.COLUMN_NAME_USERNAME
        );
        return R.ok(members);
    }

}
