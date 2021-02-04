/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.service;

import com.baidu.brcc.service.base.GenericService;
import com.baidu.brcc.domain.Project;
import com.baidu.brcc.domain.ProjectExample;

public interface ProjectService extends GenericService<Project, Long, ProjectExample> {

    /**
     * 根据projectId删除本项目所有配置 env、version、config_group、config_item等全部.
     *
     * @param projectId projectId
     * @return true/false
     */

    int deleteCascadeById(Long projectId);

    Project selectByName(String name);


}
