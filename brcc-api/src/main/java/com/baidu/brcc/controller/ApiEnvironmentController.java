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
package com.baidu.brcc.controller;

import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_NAME_NOT_EMPTY_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_NAME_NOT_EMPTY_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PRIV_MIS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PRIV_MIS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_TOKEN_NOT_EMPTY_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_TOKEN_NOT_EMPTY_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_TOKEN_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_TOKEN_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_ID_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_ID_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_NOT_EXISTS_STATUS;
import static org.apache.commons.lang3.StringUtils.isBlank;
import static org.apache.commons.lang3.StringUtils.trim;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.baidu.brcc.annotation.SaveLog;
import com.baidu.brcc.domain.EnvironmentExample;
import com.baidu.brcc.domain.Project;
import com.baidu.brcc.domain.em.Deleted;
import com.baidu.brcc.domain.meta.MetaEnvironment;
import com.baidu.brcc.domain.vo.EnvironmentReq;
import com.baidu.brcc.service.ProjectService;
import com.baidu.brcc.utils.time.DateTimeUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baidu.brcc.domain.ApiToken;
import com.baidu.brcc.domain.Environment;
import com.baidu.brcc.domain.base.R;
import com.baidu.brcc.domain.vo.ApiEnvironmentVo;
import com.baidu.brcc.service.ApiTokenCacheService;
import com.baidu.brcc.service.EnvironmentService;
import com.baidu.brcc.service.RccCache;

/**
 * open api 环境相关接口
 */
@RestController
@RequestMapping("api")
public class ApiEnvironmentController {

    @Autowired
    ApiTokenCacheService apiTokenCacheService;

    @Autowired
    private EnvironmentService environmentService;

    @Autowired
    private RccCache rccCache;

    @Autowired
    private ProjectService projectService;

    /**
     * 根据环境名称获取指定环境
     *
     * @param token 工程的 api token
     * @param name  环境名称
     *
     * @return
     */
    @GetMapping("environment/{environmentName}")
    public R<ApiEnvironmentVo> getEnvironment(String token, @PathVariable("environmentName") String name) {
        if (isBlank(token)) {
            return R.error(PROJECT_API_TOKEN_NOT_EMPTY_STATUS, PROJECT_API_TOKEN_NOT_EMPTY_MSG);
        }
        if (isBlank(name)) {
            return R.error(ENVIRONMENT_NAME_NOT_EMPTY_STATUS, ENVIRONMENT_NAME_NOT_EMPTY_MSG);
        }
        ApiToken apiToken = apiTokenCacheService.getApiToken(token);
        if (apiToken == null) {
            return R.error(PROJECT_API_TOKEN_NOT_EXISTS_STATUS, PROJECT_API_TOKEN_NOT_EXISTS_MSG);
        }
        ApiEnvironmentVo vo =
                environmentService.getByProjectIdAndNameInCache(apiToken.getProjectId(), name);

        if (vo == null) {
            return R.error(ENVIRONMENT_NOT_EXISTS_STATUS,
                    "您请求的环境 " + name + " 环境在工程 " + apiToken.getProjectName() + " 下不存在");
        }
        return R.ok(vo);
    }

    /**
     * 获取工程下的所有环境
     *
     * @param token 工程的 api token
     *
     * @return
     */
    @GetMapping("environment")
    public R<List<ApiEnvironmentVo>> getAllEnvironment(String token) {
        if (isBlank(token)) {
            return R.error(PROJECT_API_TOKEN_NOT_EMPTY_STATUS, PROJECT_API_TOKEN_NOT_EMPTY_MSG);
        }
        ApiToken apiToken = apiTokenCacheService.getApiToken(token);
        if (apiToken == null) {
            return R.error(PROJECT_API_TOKEN_NOT_EXISTS_STATUS, PROJECT_API_TOKEN_NOT_EXISTS_MSG);
        }
        List<ApiEnvironmentVo> environmentVos = rccCache.getEnvironments(apiToken.getProjectId());
        if (!CollectionUtils.isEmpty(environmentVos)) {
            return R.ok(environmentVos);
        }
        List<Environment> environments = environmentService.selectByProjectId(apiToken.getProjectId());
        if (!CollectionUtils.isEmpty(environments)) {
            environmentVos = new ArrayList<>(environments.size());
            for (Environment environment : environments) {
                ApiEnvironmentVo vo = new ApiEnvironmentVo();
                vo.setProjectId(environment.getProjectId());
                vo.setEnvironmentId(environment.getId());
                vo.setEnvironmentName(environment.getName());
                environmentVos.add(vo);
            }
            rccCache.loadEnvironments(apiToken.getProjectId(), environmentVos);
        }
        if (CollectionUtils.isEmpty(environmentVos)) {
            return R.ok(new ArrayList<>(0));
        }
        return R.ok(environmentVos);
    }

    /**
     * add environment by apiToken
     *
     * @param token api token
     * @param environmentReq environment info
     * @return
     */
    @SaveLog(scene = "0003",
            paramsIdxes = {1},
            params = {"environmentReq"})
    @PostMapping("environmentAdd")
    public R<Long> addEnvironment(String token, @RequestBody EnvironmentReq environmentReq) {
        // check token
        if (isBlank(token)) {
            return R.error(PROJECT_API_TOKEN_NOT_EMPTY_STATUS, PROJECT_API_TOKEN_NOT_EMPTY_MSG);
        }
        // check token valid
        ApiToken apiToken = apiTokenCacheService.getApiToken(token);
        if (apiToken == null) {
            return R.error(PROJECT_API_TOKEN_NOT_EXISTS_STATUS, PROJECT_API_TOKEN_NOT_EXISTS_MSG);
        }
        String name = trim(environmentReq.getName());
        String memo = trim(environmentReq.getMemo());
        Date now = DateTimeUtils.now();
        // check environment name
        if (StringUtils.isBlank(name)) {
            return R.error(ENVIRONMENT_NAME_NOT_EMPTY_STATUS, ENVIRONMENT_NAME_NOT_EMPTY_MSG);
        }
        // check project
        Project project = projectService.selectByPrimaryKey(apiToken.getProjectId());
        if (project == null || Deleted.DELETE.getValue().equals(project.getDeleted())) {
            return R.error(PROJECT_NOT_EXISTS_STATUS, PROJECT_NOT_EXISTS_MSG);
        }
        // check for duplicate
        Environment environment = environmentService.selectOneByExample(EnvironmentExample.newBuilder()
                        .build()
                        .createCriteria()
                        .andDeletedEqualTo(Deleted.OK.getValue())
                        .andProjectIdEqualTo(apiToken.getProjectId())
                        .andNameEqualTo(name)
                        .toExample(),
                MetaEnvironment.COLUMN_NAME_ID
        );
        if (environment != null) {
            return R.error(ENVIRONMENT_EXISTS_STATUS, ENVIRONMENT_EXISTS_MSG);
        }
        // add new environment
        Environment insert = new Environment();
        insert.setUpdateTime(now);
        insert.setCreateTime(now);
        insert.setDeleted(Deleted.OK.getValue());
        insert.setName(name);
        insert.setMemo(memo);
        insert.setProjectId(apiToken.getProjectId());
        insert.setProductId(project.getProductId());
        environmentService.insertSelective(insert);
        Long id = insert.getId();
        rccCache.evictEnvironment(apiToken.getProjectId());
        return R.ok(id);
    }

}
