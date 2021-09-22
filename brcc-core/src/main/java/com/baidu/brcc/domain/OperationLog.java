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

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "操作日志表")
public class OperationLog implements Serializable {

    /**
     * column-name:id
     * 自增ID
     */
    @ApiModelProperty(value = "自增ID", position = 0)
    private Long id;

    /**
     * column-name:user_id
     * 操作人ID
     */
    @ApiModelProperty(value = "操作人ID", position = 1)
    private Long userId;

    /**
     * column-name:operator
     * 操作人名称
     */
    @ApiModelProperty(value = "操作人名称", position = 2)
    private String operator;

    /**
     * column-name:scene
     * 场景
     */
    @ApiModelProperty(value = "场景", position = 3)
    private String scene;

    /**
     * column-name:response
     * 返回参数
     */
    @ApiModelProperty(value = "返回参数", position = 4)
    private String response;

    /**
     * column-name:remote_address
     * 操作地址
     */
    @JsonIgnore
    @ApiModelProperty(value = "操作地址", position = 5)
    private String remoteAddress;

    /**
     * column-name:create_time
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", position = 6)
    private Date createTime;

    /**
     * column-name:request
     * 请求参数
     */
    @ApiModelProperty(value = "请求参数", position = 7)
    private String request;

    /**
     * 操作日志表
     */
    public OperationLog() {

    }

    /**
     * 操作日志表
     */
    private OperationLog(XBuilder builder) {
        this.id = builder.id;
        this.userId = builder.userId;
        this.operator = builder.operator;
        this.scene = builder.scene;
        this.response = builder.response;
        this.remoteAddress = builder.remoteAddress;
        this.createTime = builder.createTime;
        this.request = builder.request;
    }

    public static XBuilder newBuilder() {
        return new XBuilder();
    }

    /**
     * 自增ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 自增ID
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
     * 场景
     */
    public String getScene() {
        return scene;
    }

    /**
     * 场景
     */
    public void setScene(String scene) {
        this.scene = scene == null ? null : scene.trim();
    }

    /**
     * 返回参数
     */
    public String getResponse() {
        return response;
    }

    /**
     * 返回参数
     */
    public void setResponse(String response) {
        this.response = response == null ? null : response.trim();
    }

    /**
     * 操作地址
     */
    public String getRemoteAddress() {
        return remoteAddress;
    }

    /**
     * 操作地址
     */
    public void setRemoteAddress(String remoteAddress) {
        this.remoteAddress = remoteAddress == null ? null : remoteAddress.trim();
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
     * 请求参数
     */
    public String getRequest() {
        return request;
    }

    /**
     * 请求参数
     */
    public void setRequest(String request) {
        this.request = request == null ? null : request.trim();
    }

    public OperationLog copyFrom(OperationLog other) {
        this.id = other.id;
        this.userId = other.userId;
        this.operator = other.operator;
        this.scene = other.scene;
        this.response = other.response;
        this.remoteAddress = other.remoteAddress;
        this.createTime = other.createTime;
        this.request = other.request;
        return this;
    }

    public static <T extends OperationLog> T copyFrom(OperationLog from, T to) {
        if (to == null){
            throw new RuntimeException("`to` must not be null");
        }
        to.setId(from.id);
        to.setUserId(from.userId);
        to.setOperator(from.operator);
        to.setScene(from.scene);
        to.setResponse(from.response);
        to.setRemoteAddress(from.remoteAddress);
        to.setCreateTime(from.createTime);
        to.setRequest(from.request);
        return to;
    }

    public static String toEmptyJsonString() {
        /*
        {
            id: '',
            userId: '',
            operator: '',
            scene: '',
            response: '',
            remoteAddress: '',
            createTime: '',
            request: ''
        }
        */

        return "{\"id\": \"\",\"userId\": \"\",\"operator\": \"\",\"scene\": \"\",\"response\": \"\",\"remoteAddress\": \"\",\"createTime\": \"\",\"request\": \"\"}" ;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", operator=").append(operator);
        sb.append(", scene=").append(scene);
        sb.append(", response=").append(response);
        sb.append(", remoteAddress=").append(remoteAddress);
        sb.append(", createTime=").append(createTime);
        sb.append(", request=").append(request);
        sb.append("]");
        return sb.toString();
    }

    public static final class XBuilder {

        /**
         * 自增ID
         */
        private Long id;

        /**
         * 操作人ID
         */
        private Long userId;

        /**
         * 操作人名称
         */
        private String operator;

        /**
         * 场景
         */
        private String scene;

        /**
         * 返回参数
         */
        private String response;

        /**
         * 操作地址
         */
        private String remoteAddress;

        /**
         * 创建时间
         */
        private Date createTime;

        /**
         * 请求参数
         */
        private String request;

        private XBuilder() {

        }

        /**
         * 自增ID
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
         * 操作人名称
         */
        public XBuilder operator(String operator) {
            this.operator = operator;
            return this;
        }

        /**
         * 场景
         */
        public XBuilder scene(String scene) {
            this.scene = scene;
            return this;
        }

        /**
         * 返回参数
         */
        public XBuilder response(String response) {
            this.response = response;
            return this;
        }

        /**
         * 操作地址
         */
        public XBuilder remoteAddress(String remoteAddress) {
            this.remoteAddress = remoteAddress;
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
         * 请求参数
         */
        public XBuilder request(String request) {
            this.request = request;
            return this;
        }

        public OperationLog build() {
            return new OperationLog(this);
        }
    }
}
