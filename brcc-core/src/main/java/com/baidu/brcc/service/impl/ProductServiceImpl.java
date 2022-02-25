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

import static com.baidu.brcc.common.ErrorStatusMsg.CHINESE_NOT_ALLOWED_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.CHINESE_NOT_ALLOWED_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PARAM_ERROR_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PARAM_ERROR_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PRIV_MIS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PRIV_MIS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PRODUCT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PRODUCT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PRODUCT_NAME_EMPTY_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PRODUCT_NAME_EMPTY_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PRODUCT_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PRODUCT_NOT_EXISTS_STATUS;
import static org.apache.commons.lang3.StringUtils.isNotBlank;
import static org.apache.commons.lang3.StringUtils.trim;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.baidu.brcc.domain.base.R;
import com.baidu.brcc.domain.em.SortType;
import com.baidu.brcc.domain.exception.BizException;
import com.baidu.brcc.domain.meta.MetaProject;
import com.baidu.brcc.utils.Name.NameUtils;
import com.baidu.brcc.utils.SqlUtils;
import com.baidu.brcc.utils.time.DateTimeUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.baidu.brcc.dao.ProductMapper;
import com.baidu.brcc.dao.base.BaseMapper;
import com.baidu.brcc.domain.EnvironmentUser;
import com.baidu.brcc.domain.EnvironmentUserExample;
import com.baidu.brcc.domain.Product;
import com.baidu.brcc.domain.ProductExample;
import com.baidu.brcc.domain.ProductUser;
import com.baidu.brcc.domain.ProductUserExample;
import com.baidu.brcc.domain.ProjectUser;
import com.baidu.brcc.domain.ProjectUserExample;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.base.Pagination;
import com.baidu.brcc.domain.em.ProductUserAdmin;
import com.baidu.brcc.domain.em.UserRole;
import com.baidu.brcc.domain.meta.MetaEnvironmentUser;
import com.baidu.brcc.domain.meta.MetaProduct;
import com.baidu.brcc.domain.meta.MetaProductUser;
import com.baidu.brcc.domain.meta.MetaProjectUser;
import com.baidu.brcc.domain.vo.ProductVo;
import com.baidu.brcc.service.EnvironmentUserService;
import com.baidu.brcc.service.ProductService;
import com.baidu.brcc.service.ProductUserService;
import com.baidu.brcc.service.ProjectUserService;
import com.baidu.brcc.service.UserService;
import com.baidu.brcc.service.base.GenericServiceImpl;

@Service("productService")
public class ProductServiceImpl extends GenericServiceImpl<Product, Long, ProductExample> implements ProductService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductServiceImpl.class);

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private ProductUserService productUserService;

    @Autowired
    private ProjectUserService projectUserService;

    @Autowired
    private EnvironmentUserService environmentUserService;

    @Autowired
    private UserService userService;

    @Value("${rcc.user.type.default}")
    private byte defaultUserType;

    @Override
    public BaseMapper<Product, Long, ProductExample> getMapper() {
        return productMapper;
    }

    @Override
    public ProductExample newExample() {
        return ProductExample.newBuilder().build();
    }

    @Override
    public ProductExample newIdInExample(List<Long> ids) {
        return ProductExample.newBuilder().build().createCriteria().andIdIn(ids).toExample();
    }

    @Override
    public Pagination<ProductVo> queryProductByUser(String name,
                                                    String sortField,
                                                    String sortBy,
                                                    User user,
                                                    Integer pageNo,
                                                    Integer pageSize
    ) {
        int offset = (pageNo - 1) * pageSize;
        boolean isAdmin = UserRole.SYSADMIN.getValue().equals(user.getRole());
        if (!SqlUtils.isValid(sortBy)) {
            throw new BizException(PARAM_ERROR_STATUS, PARAM_ERROR_MSG);
        }
        Set<Long> productIds = null;
        // 不是系统管理员
        if (!isAdmin) {
            List<ProductUser> products = productUserService.selectByExample(ProductUserExample.newBuilder()
                            .build()
                            .createCriteria()
                            .andUserIdEqualTo(user.getId())
                            .toExample(),
                    MetaProductUser.COLUMN_NAME_PRODUCTID
            );

            productIds = CollectionUtils.isEmpty(products) ?
                    new HashSet<>() : products.stream().map(ProductUser :: getProductId).collect(Collectors.toSet());

            List<ProjectUser> projectUsers = projectUserService.selectByExample(ProjectUserExample.newBuilder()
                            .distinct(true)
                            .build()
                            .createCriteria()
                            .andUserIdEqualTo(user.getId())
                            .toExample(),
                    MetaProjectUser.COLUMN_NAME_PRODUCTID);
            if (!CollectionUtils.isEmpty(projectUsers)) {
                for (ProjectUser projectUser : projectUsers) {
                    productIds.add(projectUser.getProductId());
                }
            }

            List<EnvironmentUser> environmentUsers =
                    environmentUserService.selectByExample(EnvironmentUserExample.newBuilder()
                                    .distinct(true)
                                    .build()
                                    .createCriteria()
                                    .andUserIdEqualTo(user.getId())
                                    .toExample(),
                            MetaEnvironmentUser.COLUMN_NAME_PRODUCTID
                    );
            if (!CollectionUtils.isEmpty(environmentUsers)) {
                for (EnvironmentUser environmentUser : environmentUsers) {
                    productIds.add(environmentUser.getProductId());
                }
            }
            if (CollectionUtils.isEmpty(productIds)) {
                Pagination empty = new Pagination<>();
                empty.setDataList(new ArrayList(0));
                empty.setTotal(0L);
                return empty;
            }
        }

        Set<Long> pids = new HashSet<>();
        Pagination<ProductVo> products = pagination(ProductExample.newBuilder()
                        .orderByClause(MetaProduct.getSafeColumnNameByField(sortField) + " " + sortBy,
                                isNotBlank(sortField))
                        .start(offset)
                        .limit(pageSize)
                        .build()
                        .createCriteria()
                        .andIdIn(productIds, !isAdmin)
                        .andNameLikeBoth(name, isNotBlank(name))
                        .toExample(),
                item -> {
                    pids.add(item.getId());
                    return Product.copyFrom(item, new ProductVo());
                }
        );

        if (!CollectionUtils.isEmpty(pids)) {
            Map<Long, List<String>> memberMap =
                    productUserService.selectMapListByExample(ProductUserExample.newBuilder()
                                    .build()
                                    .createCriteria()
                                    .andProductIdIn(pids)
                                    .andIsAdminEqualTo(ProductUserAdmin.YES.getValue())
                                    .toExample(),
                            ProductUser :: getProductId,
                            ProductUser :: getUserName
                    );
            if (!CollectionUtils.isEmpty(memberMap)) {
                products.each(item -> {
                    Long pid = item.getId();
                    List<String> members = memberMap.get(pid);
                    item.setMembers(members);
                });
            }

        }
        return products;
    }

    @Override
    @Transactional
    public void addMember(List<String> members, Long productId) {

        Map<Long, ProductUser> userProductMap =
                productUserService.queryProductUserByProductId(productId);

        Map<Long, Boolean> tmp = new HashMap<>();
        for (String name : members) {
            User user = userService.addUserIfNotExist(name, UserRole.PRODUCT.getValue(), defaultUserType);
            if (user == null) {
                LOGGER.warn("user name[{}] cannot save.", name);
                continue;
            }

            Long userId = user.getId();
            tmp.put(userId, Boolean.TRUE);
            if (userProductMap.containsKey(userId)) {
                continue;
            }

            productUserService.insertSelective(ProductUser.newBuilder()
                    .createTime(new Date())
                    .productId(productId)
                    .updateTime(new Date())
                    .userId(userId)
                    .userName(user.getName())
                    .isAdmin((byte) 1)
                    .build()
            );
        }

        // 删除不存在的
        for (Long userId : userProductMap.keySet()) {
            if (!tmp.containsKey(userId)) {
                ProductUser productUser = userProductMap.get(userId);
                productUserService.deleteByPrimaryKey(productUser.getId());
            }
        }
    }

    @Override
    public Product selectByName(String name) {
        return selectOneByExample(ProductExample.newBuilder()
                .build()
                .createCriteria()
                .andNameEqualTo(name)
                .toExample()
        );
    }

    @Override
    public Long saveProduct(Product product, User user) {
        Long id = product.getId();
        String name = trim(product.getName());
        if (NameUtils.containsChinese(name)) {
            throw new BizException(CHINESE_NOT_ALLOWED_STATUS, CHINESE_NOT_ALLOWED_MSG);
        }
        Date now = DateTimeUtils.now();
        if (id != null && id > 0) {
            // 修改
            Product exist = selectByPrimaryKey(id);
            if (exist == null) {
                throw new BizException(PRODUCT_NOT_EXISTS_STATUS, PRODUCT_NOT_EXISTS_MSG);
            }

            if (!productUserService.checkAuth(id, user)) {
                 throw new BizException(PRIV_MIS_STATUS, PRIV_MIS_MSG);
            }
            product.setUpdateTime(now);
            if (StringUtils.isNotBlank(name)) {
                Product exists = selectOneByExample(ProductExample.newBuilder()
                                .build()
                                .createCriteria()
                                .andIdNotEqualTo(id)
                                .andNameEqualTo(name)
                                .toExample(),
                        MetaProduct.COLUMN_NAME_ID
                );
                if (exists != null) {
                    throw new BizException(PRODUCT_EXISTS_STATUS, PRODUCT_EXISTS_MSG);
                }
            }
            updateByPrimaryKeySelective(product);
        } else {
            // 新增
            if (StringUtils.isBlank(name)) {
                throw new BizException(PRODUCT_NAME_EMPTY_STATUS, PRODUCT_NAME_EMPTY_MSG);
            }
            Product item = selectOneByExample(ProductExample.newBuilder()
                            .build()
                            .createCriteria()
                            .andNameEqualTo(name)
                            .toExample(),
                    MetaProject.COLUMN_NAME_ID
            );
            if (item != null) {
                throw new BizException(PRODUCT_EXISTS_STATUS, PRODUCT_EXISTS_MSG);
            }
            product.setUpdateTime(now);
            product.setCreateTime(now);
            insertSelective(product);
            id = product.getId();
        }
        return id;
    }
}
