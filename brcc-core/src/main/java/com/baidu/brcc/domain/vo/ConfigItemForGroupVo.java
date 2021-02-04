/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.domain.vo;

import lombok.Data;

@Data
public class ConfigItemForGroupVo {

    // 配置项ID
    private Long id;

    // 分组ID
    private Long groupId;

    // 分组名称
    private String groupName;

    // 配置项KEY
    private String name;

    // 配置项描述
    private String memo;

    // 配置项Val
    private String val;

}
