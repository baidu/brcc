/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.domain.vo;

import lombok.Data;

@Data
public class EnvironmentReq {

    // 环境ID
    private Long id;

    // 工程Id
    private Long projectId;

    // 环境名称
    private String name;

    // 环境介绍
    private String memo;

}
