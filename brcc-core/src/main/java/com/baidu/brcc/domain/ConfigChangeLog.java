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

@ApiModel(description = "配置变更记录")
public class ConfigChangeLog implements Serializable {

    /**
     * column-name:id
     * 编号
     */
    @ApiModelProperty(value = "编号", position = 0)
    private Long id;

    /**
     * column-name:user_id
     * 操作人ID
     */
    @ApiModelProperty(value = "操作人ID", position = 1)
    private Long userId;

    /**
     * column-name:product_id
     * 所属产品线ID
     */
    @ApiModelProperty(value = "所属产品线ID", position = 2)
    private Long productId;

    /**
     * column-name:project_id
     * 工程ID
     */
    @ApiModelProperty(value = "工程ID", position = 3)
    private Long projectId;

    /**
     * column-name:environment_id
     * 环境id
     */
    @ApiModelProperty(value = "环境id", position = 4)
    private Long environmentId;

    /**
     * column-name:version_id
     * 版本id
     */
    @ApiModelProperty(value = "版本id", position = 5)
    private Long versionId;

    /**
     * column-name:group_id
     * 分组id
     */
    @ApiModelProperty(value = "分组id", position = 6)
    private Long groupId;

    /**
     * column-name:group_name
     * 分组名称
     */
    @ApiModelProperty(value = "分组名称", position = 7)
    private String groupName;

    /**
     * column-name:operator
     * 操作人名称
     */
    @ApiModelProperty(value = "操作人名称", position = 8)
    private String operator;

    /**
     * column-name:create_time
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", position = 9)
    private Date createTime;

    private String oldContent;

    private String newContent;

    /**
     * 配置变更记录
     */
    public ConfigChangeLog() {

    }

    /**
     * 配置变更记录
     */
    private ConfigChangeLog(XBuilder builder) {
        this.id = builder.id;
        this.userId = builder.userId;
        this.productId = builder.productId;
        this.projectId = builder.projectId;
        this.environmentId = builder.environmentId;
        this.versionId = builder.versionId;
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
        this.operator = builder.operator;
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
     * 操作人ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 操作人ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
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
     * 工程ID
     */
    public Long getProjectId() {
        return projectId;
    }

    /**
     * 工程ID
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
     * 版本id
     */
    public Long getVersionId() {
        return versionId;
    }

    /**
     * 版本id
     */
    public void setVersionId(Long versionId) {
        this.versionId = versionId;
    }

    /**
     * 分组id
     */
    public Long getGroupId() {
        return groupId;
    }

    /**
     * 分组id
     */
    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    /**
     * 分组名称
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * 分组名称
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    /**
     * 操作人名称
     */
    public String getOperator() {
        return operator;
    }

    /**
     * 操作人名称
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
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

    public String getOldContent() {
        return oldContent;
    }

    public void setOldContent(String oldContent) {
        this.oldContent = oldContent == null ? null : oldContent.trim();
    }

    public String getNewContent() {
        return newContent;
    }

    public void setNewContent(String newContent) {
        this.newContent = newContent == null ? null : newContent.trim();
    }

    public ConfigChangeLog copyFrom(ConfigChangeLog other) {
        this.id = other.id;
        this.userId = other.userId;
        this.productId = other.productId;
        this.projectId = other.projectId;
        this.environmentId = other.environmentId;
        this.versionId = other.versionId;
        this.groupId = other.groupId;
        this.groupName = other.groupName;
        this.operator = other.operator;
        this.createTime = other.createTime;
        return this;
    }

    public static <T extends ConfigChangeLog> T copyFrom(ConfigChangeLog from, T to) {
        if (to == null){
            throw new RuntimeException("`to` must not be null");
        }
        to.setId(from.id);
        to.setUserId(from.userId);
        to.setProductId(from.productId);
        to.setProjectId(from.projectId);
        to.setEnvironmentId(from.environmentId);
        to.setVersionId(from.versionId);
        to.setGroupId(from.groupId);
        to.setGroupName(from.groupName);
        to.setOperator(from.operator);
        to.setCreateTime(from.createTime);
        return to;
    }

    public static String toEmptyJsonString() {
        /*
        {
            id: '',
            userId: '',
            productId: '',
            projectId: '',
            environmentId: '',
            versionId: '',
            groupId: '',
            groupName: '',
            operator: '',
            createTime: ''
        }
        */

        return "{\"id\": \"\",\"userId\": \"\",\"productId\": \"\",\"projectId\": \"\",\"environmentId\": \"\",\"versionId\": \"\",\"groupId\": \"\",\"groupName\": \"\",\"operator\": \"\",\"createTime\": \"\"}" ;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", productId=").append(productId);
        sb.append(", projectId=").append(projectId);
        sb.append(", environmentId=").append(environmentId);
        sb.append(", versionId=").append(versionId);
        sb.append(", groupId=").append(groupId);
        sb.append(", groupName=").append(groupName);
        sb.append(", operator=").append(operator);
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
         * 操作人ID
         */
        private Long userId;

        /**
         * 所属产品线ID
         */
        private Long productId;

        /**
         * 工程ID
         */
        private Long projectId;

        /**
         * 环境id
         */
        private Long environmentId;

        /**
         * 版本id
         */
        private Long versionId;

        /**
         * 分组id
         */
        private Long groupId;

        /**
         * 分组名称
         */
        private String groupName;

        /**
         * 操作人名称
         */
        private String operator;

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
         * 操作人ID
         */
        public XBuilder userId(Long userId) {
            this.userId = userId;
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
         * 工程ID
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
         * 版本id
         */
        public XBuilder versionId(Long versionId) {
            this.versionId = versionId;
            return this;
        }

        /**
         * 分组id
         */
        public XBuilder groupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * 分组名称
         */
        public XBuilder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * 操作人名称
         */
        public XBuilder operator(String operator) {
            this.operator = operator;
            return this;
        }

        /**
         * 创建时间
         */
        public XBuilder createTime(Date createTime) {
            this.createTime = createTime;
            return this;
        }

        public ConfigChangeLog build() {
            return new ConfigChangeLog(this);
        }
    }
}
