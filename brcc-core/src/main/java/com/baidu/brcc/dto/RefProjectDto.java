/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.dto;

import java.util.List;

import lombok.Data;

@Data
public class RefProjectDto {

    // 依赖工程
    private List<Long> refIds;

}
