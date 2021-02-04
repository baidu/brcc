/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.dto;

import lombok.Data;

@Data
public class CopyVersionDto {

    // 源版本ID
    private Long srcVersionId;

    // 目标版本ID
    private Long destVersionId;
}
