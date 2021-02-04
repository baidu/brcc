/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.domain.vo;

import lombok.Data;

/**
 * 工程登录认证
 */
@Data
public class ApiAuthReqVo {

    // 工程名称
    private String projectName;

    // 工程的api password
    private String apiPassword;

}
