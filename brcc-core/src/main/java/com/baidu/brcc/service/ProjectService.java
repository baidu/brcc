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

import com.baidu.brcc.service.base.GenericService;
import com.baidu.brcc.domain.Project;
import com.baidu.brcc.domain.ProjectExample;

import java.util.List;

public interface ProjectService extends GenericService<Project, Long, ProjectExample> {

    /**
     * 根据projectId删除本项目所有配置 env、version、config_group、config_item等全部.
     *
     * @param projectId projectId
     * @return true/false
     */

    int deleteCascadeById(Long projectId);

    Project selectByName(String name);

    List<Project> selectByProductId(Long productId);

    Project selectByToken(String token);


}
