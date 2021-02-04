/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.domain.vo;

import com.baidu.brcc.domain.Environment;

import lombok.Data;

@Data
public class ApiEnvironmentVo {

    // 工程ID
    private Long projectId;

    // 版本ID
    private Long environmentId;

    // 环境名称
    private String environmentName;

    public ApiEnvironmentVo copyFrom(Environment environment) {
        if (environment == null) {
            return this;
        }
        setProjectId(environment.getProjectId());
        setEnvironmentId(environment.getId());
        setEnvironmentName(environment.getName());
        return this;
    }
}
