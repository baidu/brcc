/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.domain.vo;

import lombok.Data;

/**
 * 工程登录认证
 */
@Data
public class ApiAuthVo {

    // 工程ID
    private Long projectId;

    // 工程名称
    private String projectName;

    // 工程的api token
    private String token;

    // 是否永不过期
    private boolean neverExpired;

    // 过期时间戳
    private Long expiredTime;

}
