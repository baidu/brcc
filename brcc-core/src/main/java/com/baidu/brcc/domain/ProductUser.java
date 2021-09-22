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
package com.baidu.brcc.domain;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "产品线用户关系")
public class ProductUser implements Serializable {

    /**
     * column-name:id
     * 编号
     */
    @ApiModelProperty(value = "编号", position = 0)
    private Long id;

    /**
     * column-name:product_id
     * 产品线id
     */
    @ApiModelProperty(value = "产品线id", position = 1)
    private Long productId;

    /**
     * column-name:user_id
     * 用户ID
     */
    @ApiModelProperty(value = "用户ID", position = 2)
    private Long userId;

    /**
     * column-name:user_name
     * 用户名
     */
    @ApiModelProperty(value = "用户名", position = 3)
    private String userName;

    /**
     * column-name:is_admin
     * 角色，0：非管理员，1管理员
     */
    @ApiModelProperty(value = "角色，0：非管理员，1管理员", position = 4)
    private Byte isAdmin;

    /**
     * column-name:update_time
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间", position = 5)
    private Date updateTime;

    /**
     * column-name:create_time
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", position = 6)
    private Date createTime;

    /**
     * 产品线用户关系
     */
    public ProductUser() {

    }

    /**
     * 产品线用户关系
     */
    private ProductUser(XBuilder builder) {
        this.id = builder.id;
        this.productId = builder.productId;
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.isAdmin = builder.isAdmin;
        this.updateTime = builder.updateTime;
        this.createTime = builder.createTime;
    }

    public static XBuilder newBuilder() {
        return new XBuilder();
    }

    /**
     * 编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 编号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 产品线id
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * 产品线id
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * 用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 角色，0：非管理员，1管理员
     */
    public Byte getIsAdmin() {
        return isAdmin;
    }

    /**
     * 角色，0：非管理员，1管理员
     */
    public void setIsAdmin(Byte isAdmin) {
        this.isAdmin = isAdmin;
    }

    /**
     * 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public ProductUser copyFrom(ProductUser other) {
        this.id = other.id;
        this.productId = other.productId;
        this.userId = other.userId;
        this.userName = other.userName;
        this.isAdmin = other.isAdmin;
        this.updateTime = other.updateTime;
        this.createTime = other.createTime;
        return this;
    }

    public static <T extends ProductUser> T copyFrom(ProductUser from, T to) {
        if (to == null){
            throw new RuntimeException("`to` must not be null");
        }
        to.setId(from.id);
        to.setProductId(from.productId);
        to.setUserId(from.userId);
        to.setUserName(from.userName);
        to.setIsAdmin(from.isAdmin);
        to.setUpdateTime(from.updateTime);
        to.setCreateTime(from.createTime);
        return to;
    }

    public static String toEmptyJsonString() {
        /*
        {
            id: '',
            productId: '',
            userId: '',
            userName: '',
            isAdmin: '',
            updateTime: '',
            createTime: ''
        }
        */

        return "{\"id\": \"\",\"productId\": \"\",\"userId\": \"\",\"userName\": \"\",\"isAdmin\": \"\",\"updateTime\": \"\",\"createTime\": \"\"}" ;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", isAdmin=").append(isAdmin);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }

    public static final class XBuilder {

        /**
         * 编号
         */
        private Long id;

        /**
         * 产品线id
         */
        private Long productId;

        /**
         * 用户ID
         */
        private Long userId;

        /**
         * 用户名
         */
        private String userName;

        /**
         * 角色，0：非管理员，1管理员
         */
        private Byte isAdmin;

        /**
         * 更新时间
         */
        private Date updateTime;

        /**
         * 创建时间
         */
        private Date createTime;

        private XBuilder() {

        }

        /**
         * 编号
         */
        public XBuilder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * 产品线id
         */
        public XBuilder productId(Long productId) {
            this.productId = productId;
            return this;
        }

        /**
         * 用户ID
         */
        public XBuilder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        /**
         * 用户名
         */
        public XBuilder userName(String userName) {
            this.userName = userName;
            return this;
        }

        /**
         * 角色，0：非管理员，1管理员
         */
        public XBuilder isAdmin(Byte isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }

        /**
         * 更新时间
         */
        public XBuilder updateTime(Date updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * 创建时间
         */
        public XBuilder createTime(Date createTime) {
            this.createTime = createTime;
            return this;
        }

        public ProductUser build() {
            return new ProductUser(this);
        }
    }
}
