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

@ApiModel(description = "工程用户关系")
public class ProjectUser implements Serializable {

    /**
     * column-name:id
     * 编号
     */
    @ApiModelProperty(value = "编号", position = 0)
    private Long id;

    /**
     * column-name:product_id
     * 所属产品线ID
     */
    @ApiModelProperty(value = "所属产品线ID", position = 1)
    private Long productId;

    /**
     * column-name:project_id
     * 工程id
     */
    @ApiModelProperty(value = "工程id", position = 2)
    private Long projectId;

    /**
     * column-name:user_id
     * 用户id
     */
    @ApiModelProperty(value = "用户id", position = 3)
    private Long userId;

    /**
     * column-name:user_name
     * 用户名
     */
    @ApiModelProperty(value = "用户名", position = 4)
    private String userName;

    /**
     * column-name:is_admin
     * 是否管理员, 0-否，1-是
     */
    @ApiModelProperty(value = "是否管理员, 0-否，1-是", position = 5)
    private Byte isAdmin;

    /**
     * column-name:update_time
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间", position = 6)
    private Date updateTime;

    /**
     * column-name:create_time
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", position = 7)
    private Date createTime;

    /**
     * 工程用户关系
     */
    public ProjectUser() {

    }

    /**
     * 工程用户关系
     */
    private ProjectUser(XBuilder builder) {
        this.id = builder.id;
        this.productId = builder.productId;
        this.projectId = builder.projectId;
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
     * 所属产品线ID
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * 所属产品线ID
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * 工程id
     */
    public Long getProjectId() {
        return projectId;
    }

    /**
     * 工程id
     */
    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    /**
     * 用户id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 用户id
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
     * 是否管理员, 0-否，1-是
     */
    public Byte getIsAdmin() {
        return isAdmin;
    }

    /**
     * 是否管理员, 0-否，1-是
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

    public ProjectUser copyFrom(ProjectUser other) {
        this.id = other.id;
        this.productId = other.productId;
        this.projectId = other.projectId;
        this.userId = other.userId;
        this.userName = other.userName;
        this.isAdmin = other.isAdmin;
        this.updateTime = other.updateTime;
        this.createTime = other.createTime;
        return this;
    }

    public static <T extends ProjectUser> T copyFrom(ProjectUser from, T to) {
        if (to == null){
            throw new RuntimeException("`to` must not be null");
        }
        to.setId(from.id);
        to.setProductId(from.productId);
        to.setProjectId(from.projectId);
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
            projectId: '',
            userId: '',
            userName: '',
            isAdmin: '',
            updateTime: '',
            createTime: ''
        }
        */

        return "{\"id\": \"\",\"productId\": \"\",\"projectId\": \"\",\"userId\": \"\",\"userName\": \"\",\"isAdmin\": \"\",\"updateTime\": \"\",\"createTime\": \"\"}" ;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", projectId=").append(projectId);
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
         * 所属产品线ID
         */
        private Long productId;

        /**
         * 工程id
         */
        private Long projectId;

        /**
         * 用户id
         */
        private Long userId;

        /**
         * 用户名
         */
        private String userName;

        /**
         * 是否管理员, 0-否，1-是
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
         * 所属产品线ID
         */
        public XBuilder productId(Long productId) {
            this.productId = productId;
            return this;
        }

        /**
         * 工程id
         */
        public XBuilder projectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * 用户id
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
         * 是否管理员, 0-否，1-是
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

        public ProjectUser build() {
            return new ProjectUser(this);
        }
    }
}
