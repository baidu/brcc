/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.dto;

import lombok.Data;

/**
 * 环境权限类
 */
@Data
public class EnvPriDto {

    // 环境ID
    private Long envId;

    // 环境名称
    private String envName;

    // 权限，1-读，2-写
    private Byte priType;
}
