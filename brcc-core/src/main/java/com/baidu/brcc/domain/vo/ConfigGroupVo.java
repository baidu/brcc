/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.domain.vo;

import lombok.Data;

@Data
public class ConfigGroupVo {

    // 分组ID
    private Long id;

    // 分组名称
    private String name;

    // 分组描述
    private String memo;

    // 版本ID
    private Long versionId;

}
