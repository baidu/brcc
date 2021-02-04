/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.domain.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ConfigItemReq {

    // 配置项ID
    private Long id;

    // 配置项描述
    @ApiModelProperty(value = "组id", position = 1)
    private Long groupId;

    // 配置项名称
    @ApiModelProperty(value = "配置项名称", position = 2)
    private String name;

    // 配置项描述
    @ApiModelProperty(value = "配置项描述", position = 3)
    private String memo;

    // 配置值
    @ApiModelProperty(value = "配置值", position = 4)
    private String val;

}
