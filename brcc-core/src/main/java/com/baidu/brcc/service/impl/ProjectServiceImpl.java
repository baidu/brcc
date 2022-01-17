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
package com.baidu.brcc.service.impl;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.baidu.brcc.domain.exception.BizException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.baidu.brcc.dao.ProjectMapper;
import com.baidu.brcc.dao.base.BaseMapper;
import com.baidu.brcc.domain.ApiToken;
import com.baidu.brcc.domain.EnvironmentUserExample;
import com.baidu.brcc.domain.Project;
import com.baidu.brcc.domain.ProjectExample;
import com.baidu.brcc.domain.ProjectUserExample;
import com.baidu.brcc.domain.em.Deleted;
import com.baidu.brcc.domain.meta.MetaApiToken;
import com.baidu.brcc.service.ApiTokenService;
import com.baidu.brcc.service.ConfigGroupService;
import com.baidu.brcc.service.ConfigItemService;
import com.baidu.brcc.service.EnvironmentService;
import com.baidu.brcc.service.EnvironmentUserService;
import com.baidu.brcc.service.ProjectService;
import com.baidu.brcc.service.ProjectUserService;
import com.baidu.brcc.service.RccCache;
import com.baidu.brcc.service.VersionService;
import com.baidu.brcc.service.base.GenericServiceImpl;
import com.baidu.brcc.utils.time.DateTimeUtils;

import static com.baidu.brcc.common.ErrorStatusMsg.CHILDREN_VERSION_NOT_EMPTY_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.CHILDREN_VERSION_NOT_EMPTY_STATUS;

@Service("projectService")
public class ProjectServiceImpl extends GenericServiceImpl<Project, Long, ProjectExample> implements ProjectService {

    @Autowired
    private ProjectMapper projectMapper;

    @Autowired
    private EnvironmentService environmentService;

    @Autowired
    private ProjectUserService projectUserService;

    @Autowired
    private EnvironmentUserService environmentUserService;

    @Autowired
    private VersionService versionService;

    @Autowired
    private ConfigGroupService configGroupService;

    @Autowired
    private ConfigItemService configItemService;

    @Autowired
    private ApiTokenService apiTokenService;

    @Autowired
    private RccCache rccCache;

    @Override
    public BaseMapper<Project, Long, ProjectExample> getMapper() {
        return projectMapper;
    }

    @Override
    public ProjectExample newExample() {
        return ProjectExample.newBuilder().build();
    }

    @Override
    public ProjectExample newIdInExample(List<Long> ids) {
        return ProjectExample.newBuilder().build().createCriteria().andIdIn(ids).toExample();
    }

    @Override
    @Transactional
    public int deleteCascadeById(Long projectId) {

        Project project = selectByPrimaryKey(projectId);

        if (project == null) {
            return 0;
        }

        Date now = DateTimeUtils.now();

        List<Long> environmentIds = environmentService.selectIdsByProjectId(projectId);

        List<Long> versionIds = versionService.selectIdsByEnvironmentIds(projectId, environmentIds);

        for(Long versionId : versionIds) {
            if(!CollectionUtils.isEmpty(versionService.getChildrenVersionById(versionId))) {
                throw new BizException(CHILDREN_VERSION_NOT_EMPTY_STATUS, CHILDREN_VERSION_NOT_EMPTY_MSG);
            }
        }


        List<String> apiTokenTokens = null;

        List<ApiToken> apiTokens = apiTokenService.selectByProjectId(
                projectId,
                MetaApiToken.COLUMN_NAME_ID,
                MetaApiToken.COLUMN_NAME_TOKEN
        );

        // 删除token
        if (!CollectionUtils.isEmpty(apiTokens)) {
            apiTokenService.deleteByIds(apiTokens.stream().map(ApiToken::getId).collect(Collectors.toSet()));
            apiTokenTokens = apiTokens.stream().map(ApiToken::getToken).collect(Collectors.toList());
        }

        // 删除工程
        int del = updateByPrimaryKeySelective(Project.newBuilder()
                .id(projectId)
                .deleted(Deleted.DELETE.getValue())
                .updateTime(now)
                .build());

        // 删除环境
        environmentService.deleteByProjectId(projectId);

        // 删除版本
        versionService.deleteByProjectId(projectId);

        // 删除分组
        configGroupService.deleteByProjectId(projectId);

        // 删除配置项
        configItemService.deleteByProjectId(projectId);

        // 删除用户环境关系表
        environmentUserService.deleteByExample(EnvironmentUserExample.newBuilder()
                .build()
                .createCriteria()
                .andProjectIdEqualTo(projectId)
                .toExample()
        );

        // 删除用户工程关系表
        projectUserService.deleteByExample(ProjectUserExample.newBuilder()
                .build()
                .createCriteria()
                .andProjectIdEqualTo(projectId)
                .toExample()
        );

        // 失效缓存
        rccCache.deleteProjectCascade(project, environmentIds, versionIds, apiTokenTokens);

        return del;
    }

    @Override
    public Project selectByName(String name) {
        return selectOneByExample(ProjectExample.newBuilder()
                .build()
                .createCriteria()
                .andDeletedEqualTo(Deleted.OK.getValue())
                .andNameEqualTo(name)
                .toExample()
        );
    }

    @Override
    public List<Project> selectByProductId(Long productId) {
        return selectByExample(ProjectExample.newBuilder()
                .build()
                .createCriteria()
                .andProductIdEqualTo(productId)
                .andDeletedEqualTo(Deleted.OK.getValue())
                .toExample());
    }
}
