/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.dto;

import lombok.Data;

@Data
public class UserDto {

    // 用户ID
    private Long userId;

    // 用户名称
    private String name;

    // 用户类型, 0-默认, 1-uuap
    private Byte type;

    // 管理类型, 0-普通, 1-工程, 2-产品线, 3-系统管理员
    private Byte role;

}
