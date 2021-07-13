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

import com.baidu.brcc.domain.ConfigItem;

import lombok.Data;

@Data
public class ApiItemVo {

    // 配置KEY
    private String key;

    // 配置值
    private String value;

    //分组id
    private Long groupId;

    public ApiItemVo copy(ConfigItem item) {
        if (item == null) {
            return this;
        }
        setKey(item.getName());
        setValue(item.getVal());
        setGroupId(item.getGroupId());
        return this;
    }
}
