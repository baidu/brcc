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

@ApiModel(description = "配置项")
public class ConfigItem implements Serializable {

    /**
     * column-name:id
     * 编号
     */
    @ApiModelProperty(value = "编号", position = 0)
    private Long id;

    /**
     * column-name:name
     * 配置项名称
     */
    @ApiModelProperty(value = "配置项名称", position = 1)
    private String name;

    /**
     * column-name:memo
     * 配置项描述
     */
    @ApiModelProperty(value = "配置项描述", position = 2)
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
     * column-name:environment_id
     * 环境id
     */
    @ApiModelProperty(value = "环境id", position = 5)
    private Long environmentId;

    /**
     * column-name:version_id
     * 版本id
     */
    @ApiModelProperty(value = "版本id", position = 6)
    private Long versionId;

    /**
     * column-name:group_id
     * 组id
     */
    @ApiModelProperty(value = "组id", position = 7)
    private Long groupId;

    /**
     * column-name:type_id
     * 配置类型id
     */
    @ApiModelProperty(value = "配置类型id", position = 8)
    private Integer typeId;

    /**
     * column-name:val
     * 配置值
     */
    @ApiModelProperty(value = "配置值", position = 9)
    private String val;

    /**
     * column-name:shareable
     * 是否共享
     */
    @ApiModelProperty(value = "是否共享", position = 10)
    private Byte shareable;

    /**
     * column-name:ref
     * 是否引用值
     */
    @ApiModelProperty(value = "是否引用值", position = 11)
    private Byte ref;

    /**
     * column-name:deleted
     * 删除标志，1-已删除
     */
    @ApiModelProperty(value = "删除标志，1-已删除", position = 12)
    private Byte deleted;

    /**
     * column-name:update_time
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间", position = 13)
    private Date updateTime;

    /**
     * column-name:create_time
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", position = 14)
    private Date createTime;

    /**
     * 配置项
     */
    public ConfigItem() {

    }

    /**
     * 配置项
     */
    private ConfigItem(XBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.memo = builder.memo;
        this.productId = builder.productId;
        this.projectId = builder.projectId;
        this.environmentId = builder.environmentId;
        this.versionId = builder.versionId;
        this.groupId = builder.groupId;
        this.typeId = builder.typeId;
        this.val = builder.val;
        this.shareable = builder.shareable;
        this.ref = builder.ref;
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
     * 配置项名称
     */
    public String getName() {
        return name;
    }

    /**
     * 配置项名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 配置项描述
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 配置项描述
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
     * 组id
     */
    public Long getGroupId() {
        return groupId;
    }

    /**
     * 组id
     */
    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    /**
     * 配置类型id
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * 配置类型id
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * 配置值
     */
    public String getVal() {
        return val;
    }

    /**
     * 配置值
     */
    public void setVal(String val) {
        this.val = val == null ? null : val.trim();
    }

    /**
     * 是否共享
     */
    public Byte getShareable() {
        return shareable;
    }

    /**
     * 是否共享
     */
    public void setShareable(Byte shareable) {
        this.shareable = shareable;
    }

    /**
     * 是否引用值
     */
    public Byte getRef() {
        return ref;
    }

    /**
     * 是否引用值
     */
    public void setRef(Byte ref) {
        this.ref = ref;
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

    public ConfigItem copyFrom(ConfigItem other) {
        this.id = other.id;
        this.name = other.name;
        this.memo = other.memo;
        this.productId = other.productId;
        this.projectId = other.projectId;
        this.environmentId = other.environmentId;
        this.versionId = other.versionId;
        this.groupId = other.groupId;
        this.typeId = other.typeId;
        this.val = other.val;
        this.shareable = other.shareable;
        this.ref = other.ref;
        this.deleted = other.deleted;
        this.updateTime = other.updateTime;
        this.createTime = other.createTime;
        return this;
    }

    public static <T extends ConfigItem> T copyFrom(ConfigItem from, T to) {
        if (to == null){
            throw new RuntimeException("`to` must not be null");
        }
        to.setId(from.id);
        to.setName(from.name);
        to.setMemo(from.memo);
        to.setProductId(from.productId);
        to.setProjectId(from.projectId);
        to.setEnvironmentId(from.environmentId);
        to.setVersionId(from.versionId);
        to.setGroupId(from.groupId);
        to.setTypeId(from.typeId);
        to.setVal(from.val);
        to.setShareable(from.shareable);
        to.setRef(from.ref);
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
            environmentId: '',
            versionId: '',
            groupId: '',
            typeId: '',
            val: '',
            shareable: '',
            ref: '',
            deleted: '',
            updateTime: '',
            createTime: ''
        }
        */

        return "{\"id\": \"\",\"name\": \"\",\"memo\": \"\",\"productId\": \"\",\"projectId\": \"\",\"environmentId\": \"\",\"versionId\": \"\",\"groupId\": \"\",\"typeId\": \"\",\"val\": \"\",\"shareable\": \"\",\"ref\": \"\",\"deleted\": \"\",\"updateTime\": \"\",\"createTime\": \"\"}" ;
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
        sb.append(", environmentId=").append(environmentId);
        sb.append(", versionId=").append(versionId);
        sb.append(", groupId=").append(groupId);
        sb.append(", typeId=").append(typeId);
        sb.append(", val=").append(val);
        sb.append(", shareable=").append(shareable);
        sb.append(", ref=").append(ref);
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
         * 配置项名称
         */
        private String name;

        /**
         * 配置项描述
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
         * 环境id
         */
        private Long environmentId;

        /**
         * 版本id
         */
        private Long versionId;

        /**
         * 组id
         */
        private Long groupId;

        /**
         * 配置类型id
         */
        private Integer typeId;

        /**
         * 配置值
         */
        private String val;

        /**
         * 是否共享
         */
        private Byte shareable;

        /**
         * 是否引用值
         */
        private Byte ref;

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
         * 配置项名称
         */
        public XBuilder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * 配置项描述
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
         * 组id
         */
        public XBuilder groupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * 配置类型id
         */
        public XBuilder typeId(Integer typeId) {
            this.typeId = typeId;
            return this;
        }

        /**
         * 配置值
         */
        public XBuilder val(String val) {
            this.val = val;
            return this;
        }

        /**
         * 是否共享
         */
        public XBuilder shareable(Byte shareable) {
            this.shareable = shareable;
            return this;
        }

        /**
         * 是否引用值
         */
        public XBuilder ref(Byte ref) {
            this.ref = ref;
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

        public ConfigItem build() {
            return new ConfigItem(this);
        }
    }
}
