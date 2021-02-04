/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
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
