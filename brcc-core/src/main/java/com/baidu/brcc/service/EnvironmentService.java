/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.service;

import java.util.List;

import com.baidu.brcc.domain.Environment;
import com.baidu.brcc.domain.EnvironmentExample;
import com.baidu.brcc.domain.vo.ApiEnvironmentVo;
import com.baidu.brcc.service.base.GenericService;

public interface EnvironmentService extends GenericService<Environment, Long, EnvironmentExample> {

    /**
     * 根据projectId查询工程列表.
     *
     * @param projectId projectId
     *
     * @return List<Environment>
     */
    List<Environment> selectByProjectId(Long projectId);

    Environment selectByProjectIdAndName(Long projectId, String name);

    List<Long> selectIdsByProjectId(Long projectId);

    Integer deleteCascadeByEnvId(Long envId);

    int deleteByProjectId(Long projectId);

    boolean accessibleEnv(Long userId, Long envId);

    ApiEnvironmentVo getByProjectIdAndNameInCache(Long projectId, String name);

    List<ApiEnvironmentVo> getAllByProjectIdInCache(Long projectId);
}
