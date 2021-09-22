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
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * 首页树形结构数据
 */
@Data
public class TreeNode implements Serializable {
    @JsonProperty(index = 1)
    private Long id;

    @JsonProperty(index = 2)
    private String name;

    // 类型 1-产品线，2-工程，3-环境，4-版本，5-分组
    @JsonProperty(index = 3)
    private int type;

    @JsonProperty(index = 4)
    private boolean hasChildren = false;

    @JsonProperty(index = 5)
    private List<TreeNode> children;
}
