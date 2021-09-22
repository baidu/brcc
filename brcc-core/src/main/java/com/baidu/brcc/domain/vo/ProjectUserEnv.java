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

import java.util.List;

public class ProjectUserEnv {

    // 0: 普通成员， 1：管理员
    private Byte isAdmin;

    private List<ProjectUserEnvItem> itemList;

    public ProjectUserEnv() {

    }

    private ProjectUserEnv(Builder builder) {
        setIsAdmin(builder.isAdmin);
        setItemList(builder.itemList);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Byte getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Byte isAdmin) {
        this.isAdmin = isAdmin;
    }

    public List<ProjectUserEnvItem> getItemList() {
        return itemList;
    }

    public void setItemList(List<ProjectUserEnvItem> itemList) {
        this.itemList = itemList;
    }

    public static final class Builder {
        private Byte isAdmin;
        private List<ProjectUserEnvItem> itemList;

        private Builder() {
        }

        public Builder isAdmin(Byte val) {
            isAdmin = val;
            return this;
        }

        public Builder itemList(List<ProjectUserEnvItem> val) {
            itemList = val;
            return this;
        }

        public ProjectUserEnv build() {
            return new ProjectUserEnv(this);
        }
    }
}
