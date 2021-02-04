/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.domain.vo;

import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class BatchConfigItemReq {

    // 配置项描述
    @ApiModelProperty(value = "组id", position = 1)
    private Long groupId;

    // 当前分组下的所有配置
    @ApiModelProperty(value = "分组下的配置列表", position = 2)
    private List<ItemReq> items;

}
