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

import lombok.Data;

@Data
public class ConfigItemVo {

    // 配置项ID
    private Long id;

    // 产品线ID
    private Long productId;

    // 产品线名称
    private String productName;

    // 工程ID
    private Long projectId;

    // 工程名称
    private String projectName;

    // 环境ID
    private Long environmentId;

    // 环境名称
    private String environmentName;

    // 版本ID
    private Long versionId;

    // 版本名称
    private String versionName;

    // 分组ID
    private Long groupId;

    // 分组名称
    private String groupName;

    // 配置项KEY
    private String name;

    // 配置项Val
    private String val;

    // 配置项描述
    private String memo;

}
