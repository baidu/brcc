/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.domain.vo;

import com.baidu.brcc.domain.ConfigItem;

import lombok.Data;

@Data
public class ApiItemVo {

    // 配置KEY
    private String key;

    // 配置值
    private String value;

    public ApiItemVo copyFrom(ConfigItem item) {
        if (item == null) {
            return this;
        }
        setKey(item.getName());
        setValue(item.getVal());
        return this;
    }
}
