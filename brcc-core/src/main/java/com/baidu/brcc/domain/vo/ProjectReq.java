/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.domain.vo;

import lombok.Data;

@Data
public class ProjectReq {

    // 工程ID
    private Long id;

    // 产品Id
    private Long productId;

    // 工程名称
    private String name;

    // API密码
    private String apiPassword;

    // 邮件接收
    private String mailReceiver;

    // 工程介绍
    private String memo;

    // 工程类型,0:公共 1:私有
    private Byte projectType;

}
