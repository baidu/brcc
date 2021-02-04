/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.dto;

import java.util.List;

import lombok.Data;

@Data
public class ProjectUserDto {

    // 是否管理员
    private Byte isAdmin;

    // 成员列表
    private List<String> memberNameList;

    // 权限列表
    private List<EnvPriDto> envPriDtoList;
}
