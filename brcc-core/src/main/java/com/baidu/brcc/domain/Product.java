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

@ApiModel(description = "产品线")
public class Product implements Serializable {

    /**
     * column-name:id
     * 编号
     */
    @ApiModelProperty(value = "编号", position = 0)
    private Long id;

    /**
     * column-name:name
     * 产品线名称
     */
    @ApiModelProperty(value = "产品线名称", position = 1)
    private String name;

    /**
     * column-name:memo
     * 产品线描述
     */
    @ApiModelProperty(value = "产品线描述", position = 2)
    private String memo;

    /**
     * column-name:update_time
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间", position = 3)
    private Date updateTime;

    /**
     * column-name:create_time
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", position = 4)
    private Date createTime;

    /**
     * 产品线
     */
    public Product() {

    }

    /**
     * 产品线
     */
    private Product(XBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.memo = builder.memo;
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
     * 产品线名称
     */
    public String getName() {
        return name;
    }

    /**
     * 产品线名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 产品线描述
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 产品线描述
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
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

    public Product copyFrom(Product other) {
        this.id = other.id;
        this.name = other.name;
        this.memo = other.memo;
        this.updateTime = other.updateTime;
        this.createTime = other.createTime;
        return this;
    }

    public static <T extends Product> T copyFrom(Product from, T to) {
        if (to == null){
            throw new RuntimeException("`to` must not be null");
        }
        to.setId(from.id);
        to.setName(from.name);
        to.setMemo(from.memo);
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
            updateTime: '',
            createTime: ''
        }
        */

        return "{\"id\": \"\",\"name\": \"\",\"memo\": \"\",\"updateTime\": \"\",\"createTime\": \"\"}" ;
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
         * 产品线名称
         */
        private String name;

        /**
         * 产品线描述
         */
        private String memo;

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
         * 产品线名称
         */
        public XBuilder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * 产品线描述
         */
        public XBuilder memo(String memo) {
            this.memo = memo;
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

        public Product build() {
            return new Product(this);
        }
    }
}
