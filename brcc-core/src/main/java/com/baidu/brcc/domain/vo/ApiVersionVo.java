/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.domain.vo;

import com.baidu.brcc.domain.Version;

import lombok.Data;

@Data
public class ApiVersionVo {

    // 工程ID
    private Long projectId;

    // 环境ID
    private Long environmentId;

    // 版本ID
    private Long versionId;

    // 版本名称
    private String versionName;

    // checkSum
    private String checkSum;

    public ApiVersionVo copyFrom(Version v) {
        if (v == null) {
            return this;
        }
        setProjectId(v.getProjectId());
        setEnvironmentId(v.getEnvironmentId());
        setVersionId(v.getId());
        setVersionName(v.getName());
        setCheckSum(v.getCheckSum());
        return this;
    }
}
