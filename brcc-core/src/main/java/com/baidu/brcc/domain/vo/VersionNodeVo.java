/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.domain.vo;

import lombok.Data;

@Data
public class VersionNodeVo {

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

}
