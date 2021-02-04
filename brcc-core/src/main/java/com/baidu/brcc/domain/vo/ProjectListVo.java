/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.domain.vo;

import com.baidu.brcc.domain.Project;

import lombok.Data;

@Data
public class ProjectListVo extends Project {
    /**
     * 是否管理员, 0-否，1-是
     */
    private Boolean admin;

    public ProjectListVo copyFrom(Project project) {
        return Project.copyFrom(project, this);
    }
}
