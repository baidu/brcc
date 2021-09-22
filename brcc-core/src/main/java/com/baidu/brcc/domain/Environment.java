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

@ApiModel(description = "环境")
public class Environment implements Serializable {

    /**
     * column-name:id
     * 编号
     */
    @ApiModelProperty(value = "编号", position = 0)
    private Long id;

    /**
     * column-name:name
     * 环境名称
     */
    @ApiModelProperty(value = "环境名称", position = 1)
    private String name;

    /**
     * column-name:memo
     * 环境描述
     */
    @ApiModelProperty(value = "环境描述", position = 2)
    private String memo;

    /**
     * column-name:product_id
     * 所属产品线ID
     */
    @ApiModelProperty(value = "所属产品线ID", position = 3)
    private Long productId;

    /**
     * column-name:project_id
     * 工程ID
     */
    @ApiModelProperty(value = "工程ID", position = 4)
    private Long projectId;

    /**
     * column-name:deleted
     * 删除标志，1-已删除
     */
    @ApiModelProperty(value = "删除标志，1-已删除", position = 5)
    private Byte deleted;

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
     * 环境
     */
    public Environment() {

    }

    /**
     * 环境
     */
    private Environment(XBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.memo = builder.memo;
        this.productId = builder.productId;
        this.projectId = builder.projectId;
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
     * 环境名称
     */
    public String getName() {
        return name;
    }

    /**
     * 环境名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 环境描述
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 环境描述
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
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

    public Environment copyFrom(Environment other) {
        this.id = other.id;
        this.name = other.name;
        this.memo = other.memo;
        this.productId = other.productId;
        this.projectId = other.projectId;
        this.deleted = other.deleted;
        this.updateTime = other.updateTime;
        this.createTime = other.createTime;
        return this;
    }

    public static <T extends Environment> T copyFrom(Environment from, T to) {
        if (to == null){
            throw new RuntimeException("`to` must not be null");
        }
        to.setId(from.id);
        to.setName(from.name);
        to.setMemo(from.memo);
        to.setProductId(from.productId);
        to.setProjectId(from.projectId);
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
            memo: '',
            productId: '',
            projectId: '',
            deleted: '',
            updateTime: '',
            createTime: ''
        }
        */

        return "{\"id\": \"\",\"name\": \"\",\"memo\": \"\",\"productId\": \"\",\"projectId\": \"\",\"deleted\": \"\",\"updateTime\": \"\",\"createTime\": \"\"}" ;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", memo=").append(memo);
        sb.append(", productId=").append(productId);
        sb.append(", projectId=").append(projectId);
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
         * 环境名称
         */
        private String name;

        /**
         * 环境描述
         */
        private String memo;

        /**
         * 所属产品线ID
         */
        private Long productId;

        /**
         * 工程ID
         */
        private Long projectId;

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
         * 环境名称
         */
        public XBuilder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * 环境描述
         */
        public XBuilder memo(String memo) {
            this.memo = memo;
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

        public Environment build() {
            return new Environment(this);
        }
    }
}
