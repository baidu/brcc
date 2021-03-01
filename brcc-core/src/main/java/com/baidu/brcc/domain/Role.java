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

public class Role {

    //管理员
    public static final String ADMIN = "ADMIN";

    // 产品线拥有者
    public static final String PRODUCT_OWNER = "PRODUCT_OWNER";

    // 工程拥有者
    public static final String PROJECT_OWNER = "PROJECT_OWNER";

    // 工程写权限者， 写权限需要配合config配置，决定环境、版本的写入权限。
    public static final String PROJECT_WRITER = "PROJECT_WRITER";

    // 工程读权限者
    public static final String PROJECT_READER = "PROJECT_READER";
}
