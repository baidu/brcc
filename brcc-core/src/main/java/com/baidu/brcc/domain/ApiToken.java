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

@ApiModel(description = "api token")
public class ApiToken implements Serializable {

    /**
     * column-name:id
     * 编号
     */
    @ApiModelProperty(value = "编号", position = 0)
    private Long id;

    /**
     * column-name:token
     * api token
     */
    @ApiModelProperty(value = "api token", position = 1)
    private String token;

    /**
     * column-name:project_id
     * 工程ID
     */
    @ApiModelProperty(value = "工程ID", position = 2)
    private Long projectId;

    /**
     * column-name:project_name
     * 工程名称
     */
    @ApiModelProperty(value = "工程名称", position = 3)
    private String projectName;

    /**
     * column-name:expire_never
     * 是否过期，1-永不过期，0-非永不过期
     */
    @ApiModelProperty(value = "是否过期，1-永不过期，0-非永不过期", position = 4)
    private Byte expireNever;

    /**
     * column-name:expire_time
     * 过期时间
     */
    @ApiModelProperty(value = "过期时间", position = 5)
    private Date expireTime;

    /**
     * column-name:deleted
     * 删除标志，1-已删除
     */
    @ApiModelProperty(value = "删除标志，1-已删除", position = 6)
    private Byte deleted;

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
     * api token
     */
    public ApiToken() {

    }

    /**
     * api token
     */
    private ApiToken(XBuilder builder) {
        this.id = builder.id;
        this.token = builder.token;
        this.projectId = builder.projectId;
        this.projectName = builder.projectName;
        this.expireNever = builder.expireNever;
        this.expireTime = builder.expireTime;
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
     * api token
     */
    public String getToken() {
        return token;
    }

    /**
     * api token
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
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
     * 工程名称
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * 工程名称
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    /**
     * 是否过期，1-永不过期，0-非永不过期
     */
    public Byte getExpireNever() {
        return expireNever;
    }

    /**
     * 是否过期，1-永不过期，0-非永不过期
     */
    public void setExpireNever(Byte expireNever) {
        this.expireNever = expireNever;
    }

    /**
     * 过期时间
     */
    public Date getExpireTime() {
        return expireTime;
    }

    /**
     * 过期时间
     */
    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
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

    public ApiToken copyFrom(ApiToken other) {
        this.id = other.id;
        this.token = other.token;
        this.projectId = other.projectId;
        this.projectName = other.projectName;
        this.expireNever = other.expireNever;
        this.expireTime = other.expireTime;
        this.deleted = other.deleted;
        this.updateTime = other.updateTime;
        this.createTime = other.createTime;
        return this;
    }

    public static <T extends ApiToken> T copyFrom(ApiToken from, T to) {
        if (to == null){
            throw new RuntimeException("`to` must not be null");
        }
        to.setId(from.id);
        to.setToken(from.token);
        to.setProjectId(from.projectId);
        to.setProjectName(from.projectName);
        to.setExpireNever(from.expireNever);
        to.setExpireTime(from.expireTime);
        to.setDeleted(from.deleted);
        to.setUpdateTime(from.updateTime);
        to.setCreateTime(from.createTime);
        return to;
    }

    public static String toEmptyJsonString() {
        /*
        {
            id: '',
            token: '',
            projectId: '',
            projectName: '',
            expireNever: '',
            expireTime: '',
            deleted: '',
            updateTime: '',
            createTime: ''
        }
        */

        return "{\"id\": \"\",\"token\": \"\",\"projectId\": \"\",\"projectName\": \"\",\"expireNever\": \"\",\"expireTime\": \"\",\"deleted\": \"\",\"updateTime\": \"\",\"createTime\": \"\"}" ;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", token=").append(token);
        sb.append(", projectId=").append(projectId);
        sb.append(", projectName=").append(projectName);
        sb.append(", expireNever=").append(expireNever);
        sb.append(", expireTime=").append(expireTime);
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
         * api token
         */
        private String token;

        /**
         * 工程ID
         */
        private Long projectId;

        /**
         * 工程名称
         */
        private String projectName;

        /**
         * 是否过期，1-永不过期，0-非永不过期
         */
        private Byte expireNever;

        /**
         * 过期时间
         */
        private Date expireTime;

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
         * api token
         */
        public XBuilder token(String token) {
            this.token = token;
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
         * 工程名称
         */
        public XBuilder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * 是否过期，1-永不过期，0-非永不过期
         */
        public XBuilder expireNever(Byte expireNever) {
            this.expireNever = expireNever;
            return this;
        }

        /**
         * 过期时间
         */
        public XBuilder expireTime(Date expireTime) {
            this.expireTime = expireTime;
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

        public ApiToken build() {
            return new ApiToken(this);
        }
    }
}
