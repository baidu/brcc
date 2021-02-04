/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.domain.vo;

import lombok.Data;

@Data
public class ProductReq {

    // 产品线ID
    private Long id;

    // 产品线名称
    private String name;

    // 产品线介绍
    private String memo;

}
