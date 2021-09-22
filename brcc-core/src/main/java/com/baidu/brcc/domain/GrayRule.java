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

import javax.print.DocFlavor;

@ApiModel(description = "灰度规则")
public class GrayRule implements Serializable {

    /**
     * column-name:id
     * 编号
     */
    @ApiModelProperty(value = "编号", position = 0)
    private Long id;

    /**
     * column-name:gray_version_id
     * 灰度版本ID
     */
    @ApiModelProperty(value = "灰度版本ID", position = 1)
    private Long grayVersionId;

    /**
     * column-name:rule_id
     * 灰度规则ID
     */
    @ApiModelProperty(value = "灰度规则ID", position = 2)
    private Long ruleId;

    /**
     * column-name:rule_content
     * 规则内容
     */
    @ApiModelProperty(value = "规则内容", position = 3)
    private String ruleContent;

    /**
     * column-name:deleted
     * 是否删除
     */
    @ApiModelProperty(value = "是否删除", position = 4)
    private Byte deleted;

    /**
     * column-name:update_time
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间", position = 4)
    private Date updateTime;

    /**
     * column-name:create_time
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", position = 5)
    private Date createTime;


    /**
     * 版本
     */
    public GrayRule() {

    }

    /**
     * 版本
     */
    private GrayRule(XBuilder builder) {
        this.id = builder.id;
        this.grayVersionId = builder.grayVersionId;
        this.ruleId = builder.ruleId;
        this.ruleContent = builder.ruleContent;
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
     * 灰度版本ID
     */
    public Long getGrayVersionId() {
        return grayVersionId;
    }

    /**
     * 灰度版本ID
     */
    public void setGrayVersionId(Long grayVersionId) {
        this.grayVersionId = grayVersionId;
    }

    /**
     * 灰度规则ID
     */
    public Long getRuleId() {
        return ruleId;
    }

    /**
     * 灰度规则ID
     */
    public void setRuleId(Long ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * 灰度规则内容
     */
    public String getRuleContent() {
        return ruleContent;
    }

    /**
     * 灰度规则内容
     */
    public void setRuleContent(String ruleContent) {
        this.ruleContent = ruleContent;
    }

    public Byte getDeleted() {
        return deleted;
    }

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


    public GrayRule copyFrom(GrayRule other) {
        this.id = other.id;
        this.grayVersionId = other.grayVersionId;
        this.ruleId = other.ruleId;
        this.ruleContent = other.ruleContent;
        this.deleted = other.deleted;
        this.updateTime = other.updateTime;
        this.createTime = other.createTime;
        return this;
    }

    public static <T extends GrayRule> T copyFrom(GrayRule from, T to) {
        if (to == null){
            throw new RuntimeException("`to` must not be null");
        }
        to.setId(from.id);
        to.setGrayVersionId(from.grayVersionId);
        to.setRuleId(from.ruleId);
        to.setRuleContent(from.ruleContent);
        to.setDeleted(from.deleted);
        to.setUpdateTime(from.updateTime);
        to.setCreateTime(from.createTime);
        return to;
    }

    public static String toEmptyJsonString() {
        /*
        {
            id: '',
            grayVersionId: '',
            ruleId: '',
            ruleContent: '',
            deleted: '',
            updateTime: '',
            createTime: ''
        }
        */

        return "{\"id\": \"\",\"grayVersionId\": \"\",\"ruleId\": \"\",\"ruleContent\": \"\",\"deleted\": \"\",\"updateTime\": \"\",\"createTime\": \"\"}" ;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", grayVersionId=").append(grayVersionId);
        sb.append(", ruleId=").append(ruleId);
        sb.append(", ruleContent=").append(ruleContent);
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
         * 灰度版本ID
         */
        private Long grayVersionId;

        /**
         * 灰度规则ID
         */
        private Long ruleId;

        /**
         * 灰度规则内容
         */
        private String ruleContent;

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
         * 灰度版本ID
         */
        public XBuilder grayVersionId(Long grayVersionId) {
            this.grayVersionId = grayVersionId;
            return this;
        }

        /**
         * 灰度规则ID
         */
        public XBuilder ruleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }

        /**
         * 灰度规则内容
         */
        public XBuilder ruleContent(String ruleContent) {
            this.ruleContent = ruleContent;
            return this;
        }

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


        public GrayRule build() {
            return new GrayRule(this);
        }
    }
}
