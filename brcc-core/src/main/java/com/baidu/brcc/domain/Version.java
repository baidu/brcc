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
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "版本")
public class Version implements Serializable {

    /**
     * column-name:id
     * 编号
     */
    @ApiModelProperty(value = "编号", position = 0)
    private Long id;

    /**
     * column-name:name
     * 版本名称
     */
    @ApiModelProperty(value = "版本名称", position = 1)
    private String name;

    /**
     * column-name:product_id
     * 所属产品线ID
     */
    @ApiModelProperty(value = "所属产品线ID", position = 2)
    private Long productId;

    /**
     * column-name:memo
     * 版本描述
     */
    @ApiModelProperty(value = "版本描述", position = 3)
    private String memo;

    /**
     * column-name:project_id
     * 工程ID
     */
    @ApiModelProperty(value = "工程ID", position = 4)
    private Long projectId;

    /**
     * column-name:environment_id
     * 环境id
     */
    @ApiModelProperty(value = "环境id", position = 5)
    private Long environmentId;

    /**
     * column-name:check_sum
     * 更新标识，由该标识识别是否有配置更新
     */
    @ApiModelProperty(value = "更新标识，由该标识识别是否有配置更新", position = 6)
    private String checkSum;

    /**
     * column-name:check_sum_date
     * check_sum最后提交时间
     */
    @ApiModelProperty(value = "check_sum最后提交时间", position = 7)
    private Date checkSumDate;

    /**
     * column-name:check_sum_enable
     * 是否运行check检查。1-检查, 0-不检查
     */
    @ApiModelProperty(value = "是否运行check检查。1-检查, 0-不检查", position = 8)
    private Byte checkSumEnable;

    /**
     * column-name:deleted
     * 删除标志，1-已删除
     */
    @ApiModelProperty(value = "删除标志，1-已删除", position = 9)
    private Byte deleted;

    /**
     * column-name:update_time
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间", position = 10)
    private Date updateTime;

    /**
     * column-name:create_time
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", position = 11)
    private Date createTime;

    /**
     * column-name:gray_flag
     * grayFlag
     */
    @ApiModelProperty(value = "灰度标识", position = 12)
    private Byte grayFlag;

    /**
     * column-name:gray_version_id
     * mainVersionId
     */
    @ApiModelProperty(value = "关联的主版本ID", position = 13)
    private Long mainVersionId;

    /**
     * column-name:dependency_ids
     * dependencyIds
     */
    @ApiModelProperty(value = "依赖的版本ID列表", position = 14)
    private String dependencyIds;

    /**
     * 版本
     */
    public Version() {

    }

    /**
     * 版本
     */
    private Version(XBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.productId = builder.productId;
        this.memo = builder.memo;
        this.projectId = builder.projectId;
        this.environmentId = builder.environmentId;
        this.checkSum = builder.checkSum;
        this.checkSumDate = builder.checkSumDate;
        this.checkSumEnable = builder.checkSumEnable;
        this.deleted = builder.deleted;
        this.updateTime = builder.updateTime;
        this.createTime = builder.createTime;
        this.grayFlag = builder.grayFlag;
        this.mainVersionId = builder.mainVersionId;
        this.dependencyIds = builder.dependencyIds;
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
     * 版本名称
     */
    public String getName() {
        return name;
    }

    /**
     * 版本名称
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
     * 版本描述
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 版本描述
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
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
     * 更新标识，由该标识识别是否有配置更新
     */
    public String getCheckSum() {
        return checkSum;
    }

    /**
     * 更新标识，由该标识识别是否有配置更新
     */
    public void setCheckSum(String checkSum) {
        this.checkSum = checkSum == null ? null : checkSum.trim();
    }

    /**
     * check_sum最后提交时间
     */
    public Date getCheckSumDate() {
        return checkSumDate;
    }

    /**
     * check_sum最后提交时间
     */
    public void setCheckSumDate(Date checkSumDate) {
        this.checkSumDate = checkSumDate;
    }

    /**
     * 是否运行check检查。1-检查, 0-不检查
     */
    public Byte getCheckSumEnable() {
        return checkSumEnable;
    }

    /**
     * 是否运行check检查。1-检查, 0-不检查
     */
    public void setCheckSumEnable(Byte checkSumEnable) {
        this.checkSumEnable = checkSumEnable;
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

    /**
     * grayFlag
     */
    public Byte getGrayFlag() {
        return grayFlag;
    }

    /**
     * grayFlag
     */
    public void setGrayFlag(Byte grayFlag) {
        this.grayFlag = grayFlag;
    }

    /**
     * mainVersionId
     */
    public Long getMainVersionId() {
        return mainVersionId;
    }

    /**
     * mainVersionId
     */
    public void setMainVersionId(Long mainVersionId) {
        this.mainVersionId = mainVersionId;
    }

    public String getDependencyIds() {
        return dependencyIds;
    }

    public void setDependencyIds(String dependencyIds) {
        this.dependencyIds = dependencyIds;
    }

    public Version copyFrom(Version other) {
        this.id = other.id;
        this.name = other.name;
        this.productId = other.productId;
        this.memo = other.memo;
        this.projectId = other.projectId;
        this.environmentId = other.environmentId;
        this.checkSum = other.checkSum;
        this.checkSumDate = other.checkSumDate;
        this.checkSumEnable = other.checkSumEnable;
        this.deleted = other.deleted;
        this.updateTime = other.updateTime;
        this.createTime = other.createTime;
        this.grayFlag = other.grayFlag;
        this.mainVersionId = other.mainVersionId;
        this.dependencyIds = other.dependencyIds;
        return this;
    }

    public static <T extends Version> T copyFrom(Version from, T to) {
        if (to == null) {
            throw new RuntimeException("`to` must not be null");
        }
        to.setId(from.id);
        to.setName(from.name);
        to.setProductId(from.productId);
        to.setMemo(from.memo);
        to.setProjectId(from.projectId);
        to.setEnvironmentId(from.environmentId);
        to.setCheckSum(from.checkSum);
        to.setCheckSumDate(from.checkSumDate);
        to.setCheckSumEnable(from.checkSumEnable);
        to.setDeleted(from.deleted);
        to.setUpdateTime(from.updateTime);
        to.setCreateTime(from.createTime);
        to.setGrayFlag(from.grayFlag);
        to.setMainVersionId(from.mainVersionId);
        to.setDependencyIds(from.dependencyIds);
        return to;
    }

    public static String toEmptyJsonString() {
        /*
        {
            id: '',
            name: '',
            productId: '',
            memo: '',
            projectId: '',
            environmentId: '',
            checkSum: '',
            checkSumDate: '',
            checkSumEnable: '',
            deleted: '',
            updateTime: '',
            createTime: ''
        }
        */

        return "{\"id\": \"\",\"name\": \"\",\"productId\": \"\",\"memo\": \"\",\"projectId\": \"\",\"environmentId\": \"\",\"checkSum\": \"\",\"checkSumDate\": \"\",\"checkSumEnable\": \"\",\"deleted\": \"\",\"updateTime\": \"\",\"createTime\": \"\",\"grayFlag\": \"\",\"mainVersionId\": \"\",\"dependencyIds\": \"\"}";
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
        sb.append(", projectId=").append(projectId);
        sb.append(", environmentId=").append(environmentId);
        sb.append(", checkSum=").append(checkSum);
        sb.append(", checkSumDate=").append(checkSumDate);
        sb.append(", checkSumEnable=").append(checkSumEnable);
        sb.append(", deleted=").append(deleted);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", grayFlag=").append(grayFlag);
        sb.append(", mainVersionId=").append(mainVersionId);
        sb.append(", dependencyIds=").append(dependencyIds);
        sb.append("]");
        return sb.toString();
    }

    public static final class XBuilder {

        /**
         * 编号
         */
        private Long id;

        /**
         * 版本名称
         */
        private String name;

        /**
         * 所属产品线ID
         */
        private Long productId;

        /**
         * 版本描述
         */
        private String memo;

        /**
         * 工程ID
         */
        private Long projectId;

        /**
         * 环境id
         */
        private Long environmentId;

        /**
         * 更新标识，由该标识识别是否有配置更新
         */
        private String checkSum;

        /**
         * check_sum最后提交时间
         */
        private Date checkSumDate;

        /**
         * 是否运行check检查。1-检查, 0-不检查
         */
        private Byte checkSumEnable;

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

        /**
         * grayFlag
         */
        private Byte grayFlag;

        /**
         * mainVersionId
         */
        private Long mainVersionId;

        /**
         * dependencyIds
         */
        private String dependencyIds;


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
         * 版本名称
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
         * 版本描述
         */
        public XBuilder memo(String memo) {
            this.memo = memo;
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
         * 更新标识，由该标识识别是否有配置更新
         */
        public XBuilder checkSum(String checkSum) {
            this.checkSum = checkSum;
            return this;
        }

        /**
         * check_sum最后提交时间
         */
        public XBuilder checkSumDate(Date checkSumDate) {
            this.checkSumDate = checkSumDate;
            return this;
        }

        /**
         * 是否运行check检查。1-检查, 0-不检查
         */
        public XBuilder checkSumEnable(Byte checkSumEnable) {
            this.checkSumEnable = checkSumEnable;
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

        /**
         * grayFlag
         */
        public XBuilder grayFlag(Byte grayFlag) {
            this.grayFlag = grayFlag;
            return this;
        }

        /**
         * mainVersionId
         */
        public XBuilder mainVersionId(Long mainVersionId) {
            this.mainVersionId = mainVersionId;
            return this;
        }

        public XBuilder dependencyIds(String dependencyIds) {
            this.dependencyIds = dependencyIds;
            return this;
        }

        public Version build() {
            return new Version(this);
        }
    }
}
