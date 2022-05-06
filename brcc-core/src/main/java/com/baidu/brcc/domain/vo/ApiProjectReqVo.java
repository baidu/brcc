package com.baidu.brcc.domain.vo;

import lombok.Data;

import java.util.List;

@Data
public class ApiProjectReqVo {

    // 产品线名称
    private String productName;

    // 用户名
    private String userName;

    // 工程名称
    private String name;

    // 工程密码
    private String apiPassword;

    // 工程介绍
    private String memo;

    // 工程类型,0:公共 1:私有
    private Byte projectType;
}

