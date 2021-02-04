/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.domain.vo;

import java.util.List;

import com.baidu.brcc.domain.Product;

import lombok.Data;

@Data
public class ProductVo extends Product {

    // 成员
    private List<String> members;

}
