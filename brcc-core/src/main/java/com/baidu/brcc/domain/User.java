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

@ApiModel(description = "用户")
public class User implements Serializable {

    /**
     * column-name:id
     * 编号
     */
    @ApiModelProperty(value = "编号", position = 0)
    private Long id;

    /**
     * column-name:name
     * 用户名
     */
    @ApiModelProperty(value = "用户名", position = 1)
    private String name;

    /**
     * column-name:password
     * 操作台登录密码
     */
    @ApiModelProperty(value = "操作台登录密码", position = 2)
    private String password;

    /**
     * column-name:api_password
     * api访问密码
     */
    @ApiModelProperty(value = "api访问密码", position = 3)
    private String apiPassword;

    /**
     * column-name:status
     * 状态0-正常，1-禁用
     */
    @ApiModelProperty(value = "状态0-正常，1-禁用", position = 4)
    private Byte status;

    /**
     * column-name:type
     * 用户类型, 0-默认, 1-uuap
     */
    @ApiModelProperty(value = "用户类型, 0-默认, 1-uuap", position = 5)
    private Byte type;

    /**
     * column-name:role
     * 管理类型, 0-普通, 1-工程, 2-产品线, 3-系统管理员
     */
    @ApiModelProperty(value = "管理类型, 0-普通, 1-工程, 2-产品线, 3-系统管理员", position = 6)
    private Byte role;

    /**
     * column-name:token
     * token
     */
    @ApiModelProperty(value = "token", position = 7)
    private String token;

    /**
     * column-name:update_time
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间", position = 8)
    private Date updateTime;

    /**
     * column-name:create_time
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", position = 9)
    private Date createTime;

    /**
     * 用户
     */
    public User() {

    }

    /**
     * 用户
     */
    private User(XBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.password = builder.password;
        this.apiPassword = builder.apiPassword;
        this.status = builder.status;
        this.type = builder.type;
        this.role = builder.role;
        this.token = builder.token;
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
     * 用户名
     */
    public String getName() {
        return name;
    }

    /**
     * 用户名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 操作台登录密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 操作台登录密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * api访问密码
     */
    public String getApiPassword() {
        return apiPassword;
    }

    /**
     * api访问密码
     */
    public void setApiPassword(String apiPassword) {
        this.apiPassword = apiPassword == null ? null : apiPassword.trim();
    }

    /**
     * 状态0-正常，1-禁用
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 状态0-正常，1-禁用
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 用户类型, 0-默认, 1-uuap
     */
    public Byte getType() {
        return type;
    }

    /**
     * 用户类型, 0-默认, 1-uuap
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * 管理类型, 0-普通, 1-工程, 2-产品线, 3-系统管理员
     */
    public Byte getRole() {
        return role;
    }

    /**
     * 管理类型, 0-普通, 1-工程, 2-产品线, 3-系统管理员
     */
    public void setRole(Byte role) {
        this.role = role;
    }

    /**
     * token
     */
    public String getToken() {
        return token;
    }

    /**
     * token
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
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

    public User copyFrom(User other) {
        this.id = other.id;
        this.name = other.name;
        this.password = other.password;
        this.apiPassword = other.apiPassword;
        this.status = other.status;
        this.type = other.type;
        this.role = other.role;
        this.token = other.token;
        this.updateTime = other.updateTime;
        this.createTime = other.createTime;
        return this;
    }

    public static <T extends User> T copyFrom(User from, T to) {
        if (to == null){
            throw new RuntimeException("`to` must not be null");
        }
        to.setId(from.id);
        to.setName(from.name);
        to.setPassword(from.password);
        to.setApiPassword(from.apiPassword);
        to.setStatus(from.status);
        to.setType(from.type);
        to.setRole(from.role);
        to.setToken(from.token);
        to.setUpdateTime(from.updateTime);
        to.setCreateTime(from.createTime);
        return to;
    }

    public static String toEmptyJsonString() {
        /*
        {
            id: '',
            name: '',
            password: '',
            apiPassword: '',
            status: '',
            type: '',
            role: '',
            token: '',
            updateTime: '',
            createTime: ''
        }
        */

        return "{\"id\": \"\",\"name\": \"\",\"password\": \"\",\"apiPassword\": \"\",\"status\": \"\",\"type\": \"\",\"role\": \"\",\"token\": \"\",\"updateTime\": \"\",\"createTime\": \"\"}" ;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", password=").append(password);
        sb.append(", apiPassword=").append(apiPassword);
        sb.append(", status=").append(status);
        sb.append(", type=").append(type);
        sb.append(", role=").append(role);
        sb.append(", token=").append(token);
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
         * 用户名
         */
        private String name;

        /**
         * 操作台登录密码
         */
        private String password;

        /**
         * api访问密码
         */
        private String apiPassword;

        /**
         * 状态0-正常，1-禁用
         */
        private Byte status;

        /**
         * 用户类型, 0-默认, 1-uuap
         */
        private Byte type;

        /**
         * 管理类型, 0-普通, 1-工程, 2-产品线, 3-系统管理员
         */
        private Byte role;

        /**
         * token
         */
        private String token;

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
         * 用户名
         */
        public XBuilder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * 操作台登录密码
         */
        public XBuilder password(String password) {
            this.password = password;
            return this;
        }

        /**
         * api访问密码
         */
        public XBuilder apiPassword(String apiPassword) {
            this.apiPassword = apiPassword;
            return this;
        }

        /**
         * 状态0-正常，1-禁用
         */
        public XBuilder status(Byte status) {
            this.status = status;
            return this;
        }

        /**
         * 用户类型, 0-默认, 1-uuap
         */
        public XBuilder type(Byte type) {
            this.type = type;
            return this;
        }

        /**
         * 管理类型, 0-普通, 1-工程, 2-产品线, 3-系统管理员
         */
        public XBuilder role(Byte role) {
            this.role = role;
            return this;
        }

        /**
         * token
         */
        public XBuilder token(String token) {
            this.token = token;
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

        public User build() {
            return new User(this);
        }
    }
}
