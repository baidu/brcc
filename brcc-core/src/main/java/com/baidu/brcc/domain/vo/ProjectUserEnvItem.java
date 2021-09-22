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
package com.baidu.brcc.domain.vo;

public class ProjectUserEnvItem {

    // 环境ID
    private Long envId;

    // 环境名称
    private String envName;

    // 0：默认， 1：可读，2：可写
    private Byte priType;

    private ProjectUserEnvItem(Builder builder) {
        setEnvId(builder.envId);
        setEnvName(builder.envName);
        setPriType(builder.priType);
    }

    public ProjectUserEnvItem() {

    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Long getEnvId() {
        return envId;
    }

    public void setEnvId(Long envId) {
        this.envId = envId;
    }

    public String getEnvName() {
        return envName;
    }

    public void setEnvName(String envName) {
        this.envName = envName;
    }

    public Byte getPriType() {
        return priType;
    }

    public void setPriType(Byte priType) {
        this.priType = priType;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProjectUserEnvItem{");
        sb.append("envId=").append(envId);
        sb.append(", envName='").append(envName).append('\'');
        sb.append(", priType=").append(priType);
        sb.append('}');
        return sb.toString();
    }

    public static final class Builder {
        private Long envId;
        private String envName;
        private Byte priType;

        private Builder() {
        }

        public Builder envId(Long val) {
            envId = val;
            return this;
        }

        public Builder envName(String val) {
            envName = val;
            return this;
        }

        public Builder priType(Byte val) {
            priType = val;
            return this;
        }

        public ProjectUserEnvItem build() {
            return new ProjectUserEnvItem(this);
        }
    }
}
