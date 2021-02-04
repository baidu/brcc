/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.domain.vo;

import java.util.List;

import lombok.Data;

@Data
public class ApiBatchItemReqVo {

    // 版本ID
    private Long versionId;

    // 配置Key列表
    private List<String> keys;

}
