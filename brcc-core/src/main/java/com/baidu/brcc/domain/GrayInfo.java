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
 */package com.baidu.brcc.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

@ApiModel(description = "灰度规则内容")
public class GrayInfo implements Serializable {
    /**
     * column-name:id
     * 编号
     */
    @ApiModelProperty(value = "编号", position = 0)
    private Long id;

    /**
     * column-name:rule_name
     * 规则名称
     */
    @ApiModelProperty(value = "灰度规则名称", position = 1)
    private String ruleName;

    /**
     * column-name:rule_content
     * 规则内容
     */
    @ApiModelProperty(value = "灰度规则内容", position = 2)
    private String ruleContent;

    /**
     * column-name:rule_bean
     * 灰度实例个数
     */
    @ApiModelProperty(value = "规则spring bean name", position = 3)
    private String ruleBean;

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
    public GrayInfo() {

    }

    /**
     * 版本
     */
    private GrayInfo(GrayInfo.XBuilder builder) {
        this.id = builder.id;
        this.ruleName = builder.ruleName;
        this.ruleContent = builder.ruleContent;
        this.ruleBean = builder.ruleBean;
        this.updateTime = builder.updateTime;
        this.createTime = builder.createTime;

    }

    public static GrayInfo.XBuilder newBuilder() {
        return new GrayInfo.XBuilder();
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
     * 规则名称
     */
    public String getRuleName() {
        return ruleName;
    }

    /**
     * 规则名称
     */
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * 规则内容
     */
    public String getRuleContent() {
        return ruleContent;
    }

    /**
     * 规则内容
     */
    public void setRuleContent(String ruleContent) {
        this.ruleContent = ruleContent;
    }

    /**
     * 规则spring bean name
     */
    public String getRuleBean() {
        return ruleBean;
    }

    /**
     * 规则spring bean name
     */
    public void setRuleBean(String ruleBean) {
        this.ruleBean = ruleBean;
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


    public GrayInfo copyFrom(GrayInfo other) {
        this.id = other.id;
        this.ruleName = other.ruleName;
        this.ruleContent = other.ruleContent;
        this.ruleBean = other.ruleBean;
        this.updateTime = other.updateTime;
        this.createTime = other.createTime;
        return this;
    }

    public static <T extends GrayInfo> T copyFrom(GrayInfo from, T to) {
        if (to == null){
            throw new RuntimeException("`to` must not be null");
        }
        to.setId(from.id);
        to.setRuleName(from.ruleName);
        to.setRuleContent(from.ruleContent);
        to.setRuleBean(from.ruleBean);
        to.setUpdateTime(from.updateTime);
        to.setCreateTime(from.createTime);
        return to;
    }

    public static String toEmptyJsonString() {
        /*
        {
            id: '',
            versionId: '',
            ruleName: '',
            ruleContent: '',
            ruleBean: '',
            deleted: '',
            updateTime: '',
            createTime: ''
        }
        */

        return "{\"id\": \"\",\"versionId\": \"\",\"ruleName\": \"\",\"ruleContent\": \"\",\"ruleBean\": \"\",\"deleted\": \"\",\"updateTime\": \"\",\"createTime\": \"\"}" ;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ruleName=").append(ruleName);
        sb.append(", ruleContent=").append(ruleContent);
        sb.append(", ruleBean=").append(ruleBean);
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
         * 规则名称
         */
        private String ruleName;

        /**
         * 灰度规则内容
         */
        private String ruleContent;

        /**
         * 规则spring bean name
         */
        private String ruleBean;

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
        public GrayInfo.XBuilder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * 规则名称
         */
        public GrayInfo.XBuilder ruleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }

        /**
         * 灰度规则内容
         */
        public GrayInfo.XBuilder ruleContent(String ruleContent) {
            this.ruleContent = ruleContent;
            return this;
        }

        /**
         * 规则spring bean name
         */
        public GrayInfo.XBuilder ruleBean(String ruleBean) {
            this.ruleBean = ruleBean;
            return this;
        }

        /**
         * 更新时间
         */
        public GrayInfo.XBuilder updateTime(Date updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * 创建时间
         */
        public GrayInfo.XBuilder createTime(Date createTime) {
            this.createTime = createTime;
            return this;
        }


        public GrayInfo build() {
            return new GrayInfo(this);
        }
    }

}
