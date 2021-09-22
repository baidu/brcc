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

@ApiModel(description = "环境用户关系")
public class EnvironmentUser implements Serializable {

    /**
     * column-name:id
     * 自增主键
     */
    @ApiModelProperty(value = "自增主键", position = 0)
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
     * column-name:environment_id
     * 环境id
     */
    @ApiModelProperty(value = "环境id", position = 3)
    private Long environmentId;

    /**
     * column-name:user_id
     * 用户id
     */
    @ApiModelProperty(value = "用户id", position = 4)
    private Long userId;

    /**
     * column-name:user_name
     * 用户名
     */
    @ApiModelProperty(value = "用户名", position = 5)
    private String userName;

    /**
     * column-name:pri_type
     * 权限，1-读，2-写
     */
    @ApiModelProperty(value = "权限，1-读，2-写", position = 6)
    private Byte priType;

    /**
     * column-name:update_time
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间", position = 7)
    private Date updateTime;

    /**
     * column-name:create_time
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", position = 8)
    private Date createTime;

    /**
     * 环境用户关系
     */
    public EnvironmentUser() {

    }

    /**
     * 环境用户关系
     */
    private EnvironmentUser(XBuilder builder) {
        this.id = builder.id;
        this.productId = builder.productId;
        this.projectId = builder.projectId;
        this.environmentId = builder.environmentId;
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.priType = builder.priType;
        this.updateTime = builder.updateTime;
        this.createTime = builder.createTime;
    }

    public static XBuilder newBuilder() {
        return new XBuilder();
    }

    /**
     * 自增主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 自增主键
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
     * 环境id
     */
    public Long getEnvironmentId() {
        return environmentId;
    }

    /**
     * 环境id
     */
    public void setEnvironmentId(Long environmentId) {
        this.environmentId = environmentId;
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
     * 权限，1-读，2-写
     */
    public Byte getPriType() {
        return priType;
    }

    /**
     * 权限，1-读，2-写
     */
    public void setPriType(Byte priType) {
        this.priType = priType;
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

    public EnvironmentUser copyFrom(EnvironmentUser other) {
        this.id = other.id;
        this.productId = other.productId;
        this.projectId = other.projectId;
        this.environmentId = other.environmentId;
        this.userId = other.userId;
        this.userName = other.userName;
        this.priType = other.priType;
        this.updateTime = other.updateTime;
        this.createTime = other.createTime;
        return this;
    }

    public static <T extends EnvironmentUser> T copyFrom(EnvironmentUser from, T to) {
        if (to == null){
            throw new RuntimeException("`to` must not be null");
        }
        to.setId(from.id);
        to.setProductId(from.productId);
        to.setProjectId(from.projectId);
        to.setEnvironmentId(from.environmentId);
        to.setUserId(from.userId);
        to.setUserName(from.userName);
        to.setPriType(from.priType);
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
            environmentId: '',
            userId: '',
            userName: '',
            priType: '',
            updateTime: '',
            createTime: ''
        }
        */

        return "{\"id\": \"\",\"productId\": \"\",\"projectId\": \"\",\"environmentId\": \"\",\"userId\": \"\",\"userName\": \"\",\"priType\": \"\",\"updateTime\": \"\",\"createTime\": \"\"}" ;
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
        sb.append(", environmentId=").append(environmentId);
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", priType=").append(priType);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }

    public static final class XBuilder {

        /**
         * 自增主键
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
         * 环境id
         */
        private Long environmentId;

        /**
         * 用户id
         */
        private Long userId;

        /**
         * 用户名
         */
        private String userName;

        /**
         * 权限，1-读，2-写
         */
        private Byte priType;

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
         * 自增主键
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
         * 环境id
         */
        public XBuilder environmentId(Long environmentId) {
            this.environmentId = environmentId;
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
         * 权限，1-读，2-写
         */
        public XBuilder priType(Byte priType) {
            this.priType = priType;
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

        public EnvironmentUser build() {
            return new EnvironmentUser(this);
        }
    }
}
