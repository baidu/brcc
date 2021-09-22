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

@ApiModel(description = "工程")
public class Project implements Serializable {

    /**
     * column-name:id
     * 编号
     */
    @ApiModelProperty(value = "编号", position = 0)
    private Long id;

    /**
     * column-name:name
     * 工程名称
     */
    @ApiModelProperty(value = "工程名称", position = 1)
    private String name;

    /**
     * column-name:product_id
     * 所属产品线ID
     */
    @ApiModelProperty(value = "所属产品线ID", position = 2)
    private Long productId;

    /**
     * column-name:memo
     * 工程描述
     */
    @ApiModelProperty(value = "工程描述", position = 3)
    private String memo;

    /**
     * column-name:project_type
     * 工程类型,0:公共 1:私有
     */
    @ApiModelProperty(value = "工程类型,0:公共 1:私有", position = 4)
    private Byte projectType;

    /**
     * column-name:dependency_ids
     * 依赖工程id列表
     */
    @ApiModelProperty(value = "依赖工程id列表", position = 5)
    private String dependencyIds;

    /**
     * column-name:dependency_names
     * 依赖工程名
     */
    @ApiModelProperty(value = "依赖工程名", position = 6)
    private String dependencyNames;

    /**
     * column-name:mail_receiver
     * 变更邮件接收人
     */
    @ApiModelProperty(value = "变更邮件接收人", position = 7)
    private String mailReceiver;

    /**
     * column-name:api_password
     */
    @ApiModelProperty(value = "", position = 8)
    private String apiPassword;

    /**
     * column-name:api_token
     * api token
     */
    @ApiModelProperty(value = "api token", position = 9)
    private String apiToken;

    /**
     * column-name:deleted
     * 删除标志，1-已删除
     */
    @ApiModelProperty(value = "删除标志，1-已删除", position = 10)
    private Byte deleted;

    /**
     * column-name:update_time
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间", position = 11)
    private Date updateTime;

    /**
     * column-name:create_time
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", position = 12)
    private Date createTime;

    /**
     * 工程
     */
    public Project() {

    }

    /**
     * 工程
     */
    private Project(XBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.productId = builder.productId;
        this.memo = builder.memo;
        this.projectType = builder.projectType;
        this.dependencyIds = builder.dependencyIds;
        this.dependencyNames = builder.dependencyNames;
        this.mailReceiver = builder.mailReceiver;
        this.apiPassword = builder.apiPassword;
        this.apiToken = builder.apiToken;
        this.deleted = builder.deleted;
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
     * 工程名称
     */
    public String getName() {
        return name;
    }

    /**
     * 工程名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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
     * 工程描述
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 工程描述
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * 工程类型,0:公共 1:私有
     */
    public Byte getProjectType() {
        return projectType;
    }

    /**
     * 工程类型,0:公共 1:私有
     */
    public void setProjectType(Byte projectType) {
        this.projectType = projectType;
    }

    /**
     * 依赖工程id列表
     */
    public String getDependencyIds() {
        return dependencyIds;
    }

    /**
     * 依赖工程id列表
     */
    public void setDependencyIds(String dependencyIds) {
        this.dependencyIds = dependencyIds == null ? null : dependencyIds.trim();
    }

    /**
     * 依赖工程名
     */
    public String getDependencyNames() {
        return dependencyNames;
    }

    /**
     * 依赖工程名
     */
    public void setDependencyNames(String dependencyNames) {
        this.dependencyNames = dependencyNames == null ? null : dependencyNames.trim();
    }

    /**
     * 变更邮件接收人
     */
    public String getMailReceiver() {
        return mailReceiver;
    }

    /**
     * 变更邮件接收人
     */
    public void setMailReceiver(String mailReceiver) {
        this.mailReceiver = mailReceiver == null ? null : mailReceiver.trim();
    }

    public String getApiPassword() {
        return apiPassword;
    }

    public void setApiPassword(String apiPassword) {
        this.apiPassword = apiPassword == null ? null : apiPassword.trim();
    }

    /**
     * api token
     */
    public String getApiToken() {
        return apiToken;
    }

    /**
     * api token
     */
    public void setApiToken(String apiToken) {
        this.apiToken = apiToken == null ? null : apiToken.trim();
    }

    /**
     * 删除标志，1-已删除
     */
    public Byte getDeleted() {
        return deleted;
    }

    /**
     * 删除标志，1-已删除
     */
    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
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

    public Project copyFrom(Project other) {
        this.id = other.id;
        this.name = other.name;
        this.productId = other.productId;
        this.memo = other.memo;
        this.projectType = other.projectType;
        this.dependencyIds = other.dependencyIds;
        this.dependencyNames = other.dependencyNames;
        this.mailReceiver = other.mailReceiver;
        this.apiPassword = other.apiPassword;
        this.apiToken = other.apiToken;
        this.deleted = other.deleted;
        this.updateTime = other.updateTime;
        this.createTime = other.createTime;
        return this;
    }

    public static <T extends Project> T copyFrom(Project from, T to) {
        if (to == null){
            throw new RuntimeException("`to` must not be null");
        }
        to.setId(from.id);
        to.setName(from.name);
        to.setProductId(from.productId);
        to.setMemo(from.memo);
        to.setProjectType(from.projectType);
        to.setDependencyIds(from.dependencyIds);
        to.setDependencyNames(from.dependencyNames);
        to.setMailReceiver(from.mailReceiver);
        to.setApiPassword(from.apiPassword);
        to.setApiToken(from.apiToken);
        to.setDeleted(from.deleted);
        to.setUpdateTime(from.updateTime);
        to.setCreateTime(from.createTime);
        return to;
    }

    public static String toEmptyJsonString() {
        /*
        {
            id: '',
            name: '',
            productId: '',
            memo: '',
            projectType: '',
            dependencyIds: '',
            dependencyNames: '',
            mailReceiver: '',
            apiPassword: '',
            apiToken: '',
            deleted: '',
            updateTime: '',
            createTime: ''
        }
        */

        return "{\"id\": \"\",\"name\": \"\",\"productId\": \"\",\"memo\": \"\",\"projectType\": \"\",\"dependencyIds\": \"\",\"dependencyNames\": \"\",\"mailReceiver\": \"\",\"apiPassword\": \"\",\"apiToken\": \"\",\"deleted\": \"\",\"updateTime\": \"\",\"createTime\": \"\"}" ;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", productId=").append(productId);
        sb.append(", memo=").append(memo);
        sb.append(", projectType=").append(projectType);
        sb.append(", dependencyIds=").append(dependencyIds);
        sb.append(", dependencyNames=").append(dependencyNames);
        sb.append(", mailReceiver=").append(mailReceiver);
        sb.append(", apiPassword=").append(apiPassword);
        sb.append(", apiToken=").append(apiToken);
        sb.append(", deleted=").append(deleted);
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
         * 工程名称
         */
        private String name;

        /**
         * 所属产品线ID
         */
        private Long productId;

        /**
         * 工程描述
         */
        private String memo;

        /**
         * 工程类型,0:公共 1:私有
         */
        private Byte projectType;

        /**
         * 依赖工程id列表
         */
        private String dependencyIds;

        /**
         * 依赖工程名
         */
        private String dependencyNames;

        /**
         * 变更邮件接收人
         */
        private String mailReceiver;

        private String apiPassword;

        /**
         * api token
         */
        private String apiToken;

        /**
         * 删除标志，1-已删除
         */
        private Byte deleted;

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
         * 工程名称
         */
        public XBuilder name(String name) {
            this.name = name;
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
         * 工程描述
         */
        public XBuilder memo(String memo) {
            this.memo = memo;
            return this;
        }

        /**
         * 工程类型,0:公共 1:私有
         */
        public XBuilder projectType(Byte projectType) {
            this.projectType = projectType;
            return this;
        }

        /**
         * 依赖工程id列表
         */
        public XBuilder dependencyIds(String dependencyIds) {
            this.dependencyIds = dependencyIds;
            return this;
        }

        /**
         * 依赖工程名
         */
        public XBuilder dependencyNames(String dependencyNames) {
            this.dependencyNames = dependencyNames;
            return this;
        }

        /**
         * 变更邮件接收人
         */
        public XBuilder mailReceiver(String mailReceiver) {
            this.mailReceiver = mailReceiver;
            return this;
        }

        public XBuilder apiPassword(String apiPassword) {
            this.apiPassword = apiPassword;
            return this;
        }

        /**
         * api token
         */
        public XBuilder apiToken(String apiToken) {
            this.apiToken = apiToken;
            return this;
        }

        /**
         * 删除标志，1-已删除
         */
        public XBuilder deleted(Byte deleted) {
            this.deleted = deleted;
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

        public Project build() {
            return new Project(this);
        }
    }
}
