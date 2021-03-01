/*
 * Copyright (c) Baidu Inc. All rights reserved.
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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
