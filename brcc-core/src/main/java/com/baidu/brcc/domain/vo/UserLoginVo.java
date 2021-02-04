/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.domain.vo;

import lombok.Data;

@Data
public class UserLoginVo {

    // 用户名称
    private String name;

    // 用户密码
    private String password;

}
