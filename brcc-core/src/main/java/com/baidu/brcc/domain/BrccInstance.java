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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

@ApiModel(description = "实例信息")
public class BrccInstance implements Serializable {

    /**
     * column-name:id
     * 编号
     */
    @ApiModelProperty(value = "编号", position = 0)
    private Long id;

    /**
     * column-name:idc
     * 机房名称
     */
    @ApiModelProperty(value = "机房名称", position = 1)
    private String idc;

    /**
     * column-name:container_id
     * 容器ID
     */
    @ApiModelProperty(value = "容器ID", position = 2)
    private String containerId;

    /**
     * column-name:app_name
     * 应用名
     */
    @ApiModelProperty(value = "应用名", position = 3)
    private String appName;

    /**
     * column-name:ip
     * ip地址
     */
    @ApiModelProperty(value = "ip地址", position = 4)
    private String ip;

    /**
     * column-name:client_version
     * 客户端版本
     */
    @ApiModelProperty(value = "客户端版本", position = 5)
    private String clientVersion;

    /**
     * column-name:enable_update_callback
     * 是否开启心跳功能
     */
    @ApiModelProperty(value = "是否开启心跳功能", position = 6)
    private Byte enableUpdateCallback;

    /**
     * column-name:last_checksum
     * 上一次checksum值
     */
    @ApiModelProperty(value = "上一次checksum值", position = 7)
    private String lastChecksum;

    /**
     * column-name:last_checksum_time
     * 上次生效时间
     */
    @ApiModelProperty(value = "上次生效时间", position = 8)
    private Date lastChecksumTime;

    /**
     * column-name:current_checksum
     * 当前checksum值
     */
    @ApiModelProperty(value = "当前checksum值", position = 9)
    private String currentChecksum;

    /**
     * column-name:current_checksum_time
     * 当前生效时间
     */
    @ApiModelProperty(value = "当前生效时间", position = 10)
    private Date currentChecksumTime;

    /**
     * column-name:version_id
     * 版本id
     */
    @ApiModelProperty(value = "版本id", position = 11)
    private Long versionId;

    /**
     * column-name:net_cost
     * 上一次网络开销
     */
    @ApiModelProperty(value = "上一次网络开销", position = 12)
    private Integer netCost;

    /**
     * column-name:heartbeat_time
     * 最后心跳时间
     */
    @ApiModelProperty(value = "最后心跳时间", position = 13)
    private Date heartbeatTime;

    /**
     * column-name:create_time
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", position = 14)
    private Date createTime;

    /**
     * column-name:gray_flag
     * grayFlag
     */
    @ApiModelProperty(value = "灰度标识", position = 15)
    private Byte grayFlag;

    /**
     * column-name:gray_version_id
     * grayVersionId
     */
    @ApiModelProperty(value = "灰度版本ID", position = 16)
    private Long grayVersionId;

    /**
     * 实例信息
     */
    public BrccInstance() {
        
    }

    /**
     * 实例信息
     */
    private BrccInstance(XBuilder builder) {
        this.id = builder.id;
        this.idc = builder.idc;
        this.containerId = builder.containerId;
        this.appName = builder.appName;
        this.ip = builder.ip;
        this.clientVersion = builder.clientVersion;
        this.enableUpdateCallback = builder.enableUpdateCallback;
        this.lastChecksum = builder.lastChecksum;
        this.lastChecksumTime = builder.lastChecksumTime;
        this.currentChecksum = builder.currentChecksum;
        this.currentChecksumTime = builder.currentChecksumTime;
        this.versionId = builder.versionId;
        this.netCost = builder.netCost;
        this.heartbeatTime = builder.heartbeatTime;
        this.createTime = builder.createTime;
        this.grayFlag = builder.grayFlag;
        this.grayVersionId = builder.grayVersionId;
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
     * 机房名称
     */
    public String getIdc() {
        return idc;
    }

    /**
     * 机房名称
     */
    public void setIdc(String idc) {
        this.idc = idc == null ? null : idc.trim();
    }

    /**
     * 容器ID
     */
    public String getContainerId() {
        return containerId;
    }

    /**
     * 容器ID
     */
    public void setContainerId(String containerId) {
        this.containerId = containerId == null ? null : containerId.trim();
    }

    /**
     * 应用名
     */
    public String getAppName() {
        return appName;
    }

    /**
     * 应用名
     */
    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }

    /**
     * ip地址
     */
    public String getIp() {
        return ip;
    }

    /**
     * ip地址
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * 客户端版本
     */
    public String getClientVersion() {
        return clientVersion;
    }

    /**
     * 客户端版本
     */
    public void setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion == null ? null : clientVersion.trim();
    }

    /**
     * 是否开启心跳功能
     */
    public Byte getEnableUpdateCallback() {
        return enableUpdateCallback;
    }

    /**
     * 是否开启心跳功能
     */
    public void setEnableUpdateCallback(Byte enableUpdateCallback) {
        this.enableUpdateCallback = enableUpdateCallback;
    }

    /**
     * 上一次checksum值
     */
    public String getLastChecksum() {
        return lastChecksum;
    }

    /**
     * 上一次checksum值
     */
    public void setLastChecksum(String lastChecksum) {
        this.lastChecksum = lastChecksum == null ? null : lastChecksum.trim();
    }

    /**
     * 上次生效时间
     */
    public Date getLastChecksumTime() {
        return lastChecksumTime;
    }

    /**
     * 上次生效时间
     */
    public void setLastChecksumTime(Date lastChecksumTime) {
        this.lastChecksumTime = lastChecksumTime;
    }

    /**
     * 当前checksum值
     */
    public String getCurrentChecksum() {
        return currentChecksum;
    }

    /**
     * 当前checksum值
     */
    public void setCurrentChecksum(String currentChecksum) {
        this.currentChecksum = currentChecksum == null ? null : currentChecksum.trim();
    }

    /**
     * 当前生效时间
     */
    public Date getCurrentChecksumTime() {
        return currentChecksumTime;
    }

    /**
     * 当前生效时间
     */
    public void setCurrentChecksumTime(Date currentChecksumTime) {
        this.currentChecksumTime = currentChecksumTime;
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
     * 上一次网络开销
     */
    public Integer getNetCost() {
        return netCost;
    }

    /**
     * 上一次网络开销
     */
    public void setNetCost(Integer netCost) {
        this.netCost = netCost;
    }

    /**
     * 最后心跳时间
     */
    public Date getHeartbeatTime() {
        return heartbeatTime;
    }

    /**
     * 最后心跳时间
     */
    public void setHeartbeatTime(Date heartbeatTime) {
        this.heartbeatTime = heartbeatTime;
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
     * grayVersionId
     */
    public Long getGrayVersionId() {
        return grayVersionId;
    }

    /**
     * grayVersionId
     */
    public void setGrayVersionId(Long grayVersionId) {
        this.grayVersionId = grayVersionId;
    }


    public BrccInstance copyFrom(BrccInstance other) {
        this.id = other.id;
        this.idc = other.idc;
        this.containerId = other.containerId;
        this.appName = other.appName;
        this.ip = other.ip;
        this.clientVersion = other.clientVersion;
        this.enableUpdateCallback = other.enableUpdateCallback;
        this.lastChecksum = other.lastChecksum;
        this.lastChecksumTime = other.lastChecksumTime;
        this.currentChecksum = other.currentChecksum;
        this.currentChecksumTime = other.currentChecksumTime;
        this.versionId = other.versionId;
        this.netCost = other.netCost;
        this.heartbeatTime = other.heartbeatTime;
        this.createTime = other.createTime;
        this.grayFlag = other.grayFlag;
        this.grayVersionId = other.grayVersionId;
        return this;
    }

    public static <T extends BrccInstance> T copyFrom(BrccInstance from, T to) {
        if (to == null){
            throw new RuntimeException("`to` must not be null");
        }
        to.setId(from.id);
        to.setIdc(from.idc);
        to.setContainerId(from.containerId);
        to.setAppName(from.appName);
        to.setIp(from.ip);
        to.setClientVersion(from.clientVersion);
        to.setEnableUpdateCallback(from.enableUpdateCallback);
        to.setLastChecksum(from.lastChecksum);
        to.setLastChecksumTime(from.lastChecksumTime);
        to.setCurrentChecksum(from.currentChecksum);
        to.setCurrentChecksumTime(from.currentChecksumTime);
        to.setVersionId(from.versionId);
        to.setNetCost(from.netCost);
        to.setHeartbeatTime(from.heartbeatTime);
        to.setCreateTime(from.createTime);
        to.setGrayFlag(from.grayFlag);
        to.setGrayVersionId(from.grayVersionId);
        return to;
    }

    public static String toEmptyJsonString() {
        /*
        {
            id: '',
            idc: '',
            containerId: '',
            appName: '',
            ip: '',
            clientVersion: '',
            enableUpdateCallback: '',
            lastChecksum: '',
            lastChecksumTime: '',
            currentChecksum: '',
            currentChecksumTime: '',
            versionId: '',
            netCost: '',
            heartbeatTime: '',
            createTime: ''
        }
        */
        
        return "{\"id\": \"\",\"idc\": \"\",\"containerId\": \"\",\"appName\": \"\",\"ip\": \"\",\"clientVersion\": \"\",\"enableUpdateCallback\": \"\",\"lastChecksum\": \"\",\"lastChecksumTime\": \"\",\"currentChecksum\": \"\",\"currentChecksumTime\": \"\",\"versionId\": \"\",\"netCost\": \"\",\"heartbeatTime\": \"\",\"createTime\": \"\",\"grayFlag\": \"\",\"grayVersionId\": \"\"}" ;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", idc=").append(idc);
        sb.append(", containerId=").append(containerId);
        sb.append(", appName=").append(appName);
        sb.append(", ip=").append(ip);
        sb.append(", clientVersion=").append(clientVersion);
        sb.append(", enableUpdateCallback=").append(enableUpdateCallback);
        sb.append(", lastChecksum=").append(lastChecksum);
        sb.append(", lastChecksumTime=").append(lastChecksumTime);
        sb.append(", currentChecksum=").append(currentChecksum);
        sb.append(", currentChecksumTime=").append(currentChecksumTime);
        sb.append(", versionId=").append(versionId);
        sb.append(", netCost=").append(netCost);
        sb.append(", heartbeatTime=").append(heartbeatTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", grayFlag=").append(grayFlag);
        sb.append(", grayVersionId=").append(grayVersionId);
        sb.append("]");
        return sb.toString();
    }

    public static final class XBuilder {

        /**
         * 编号
         */
        private Long id;

        /**
         * 机房名称
         */
        private String idc;

        /**
         * 容器ID
         */
        private String containerId;

        /**
         * 应用名
         */
        private String appName;

        /**
         * ip地址
         */
        private String ip;

        /**
         * 客户端版本
         */
        private String clientVersion;

        /**
         * 是否开启心跳功能
         */
        private Byte enableUpdateCallback;

        /**
         * 上一次checksum值
         */
        private String lastChecksum;

        /**
         * 上次生效时间
         */
        private Date lastChecksumTime;

        /**
         * 当前checksum值
         */
        private String currentChecksum;

        /**
         * 当前生效时间
         */
        private Date currentChecksumTime;

        /**
         * 版本id
         */
        private Long versionId;

        /**
         * 上一次网络开销
         */
        private Integer netCost;

        /**
         * 最后心跳时间
         */
        private Date heartbeatTime;

        /**
         * 创建时间
         */
        private Date createTime;

        /**
         * grayFlag
         */
        private Byte grayFlag;

        /**
         * grayVersionId
         */
        private Long grayVersionId;

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
         * 机房名称
         */
        public XBuilder idc(String idc) {
            this.idc = idc;
            return this;
        }

        /**
         * 容器ID
         */
        public XBuilder containerId(String containerId) {
            this.containerId = containerId;
            return this;
        }

        /**
         * 应用名
         */
        public XBuilder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * ip地址
         */
        public XBuilder ip(String ip) {
            this.ip = ip;
            return this;
        }

        /**
         * 客户端版本
         */
        public XBuilder clientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }

        /**
         * 是否开启心跳功能
         */
        public XBuilder enableUpdateCallback(Byte enableUpdateCallback) {
            this.enableUpdateCallback = enableUpdateCallback;
            return this;
        }

        /**
         * 上一次checksum值
         */
        public XBuilder lastChecksum(String lastChecksum) {
            this.lastChecksum = lastChecksum;
            return this;
        }

        /**
         * 上次生效时间
         */
        public XBuilder lastChecksumTime(Date lastChecksumTime) {
            this.lastChecksumTime = lastChecksumTime;
            return this;
        }

        /**
         * 当前checksum值
         */
        public XBuilder currentChecksum(String currentChecksum) {
            this.currentChecksum = currentChecksum;
            return this;
        }

        /**
         * 当前生效时间
         */
        public XBuilder currentChecksumTime(Date currentChecksumTime) {
            this.currentChecksumTime = currentChecksumTime;
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
         * 上一次网络开销
         */
        public XBuilder netCost(Integer netCost) {
            this.netCost = netCost;
            return this;
        }

        /**
         * 最后心跳时间
         */
        public XBuilder heartbeatTime(Date heartbeatTime) {
            this.heartbeatTime = heartbeatTime;
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
         * grayVersionId
         */
        public XBuilder grayVersionId(Long grayVersionId) {
            this.grayVersionId = grayVersionId;
            return this;
        }

        public BrccInstance build() {
            return new BrccInstance(this);
        }
    }
}