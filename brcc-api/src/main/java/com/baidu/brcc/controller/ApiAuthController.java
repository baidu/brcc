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

import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_PASSWORD_ERROR_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_PASSWORD_ERROR_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_PASSWORD_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_PASSWORD_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_TOKEN_ERROR_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_TOKEN_ERROR_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_TOKEN_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_TOKEN_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_NAME_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_NAME_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_NOT_EXISTS_STATUS;
import static org.apache.commons.lang3.StringUtils.isBlank;
import static org.apache.commons.lang3.StringUtils.trim;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baidu.brcc.domain.ApiToken;
import com.baidu.brcc.domain.Project;
import com.baidu.brcc.domain.base.R;
import com.baidu.brcc.domain.em.ApiTokenExpireNever;
import com.baidu.brcc.domain.vo.ApiAuthReqVo;
import com.baidu.brcc.domain.vo.ApiAuthVo;
import com.baidu.brcc.service.ApiTokenCacheService;
import com.baidu.brcc.service.ProjectService;
import com.baidu.brcc.service.RccCache;
import com.baidu.brcc.utils.bcrypt.Md5Util;

/**
 * open api 登录认证相关接口
 */
@RestController
@RequestMapping("api")
public class ApiAuthController {

    @Autowired
    ApiTokenCacheService apiTokenCacheService;

    @Autowired
    private RccCache rccCache;

    @Autowired
    private ProjectService projectService;

    /**
     * 获取open api 访问的token
     *
     * @param reqVo reqVo.projectName 工程名称
     *              reqVo.apiPassword 工程api密码
     *
     * @return
     */
    @PostMapping("auth")
    public R<ApiAuthVo> apiAuth(@RequestBody ApiAuthReqVo reqVo) {
        String projectName = reqVo.getProjectName();
        String apiPassword = reqVo.getApiPassword();
        if (isBlank(projectName)) {
            return R.error(PROJECT_NAME_NOT_EXISTS_STATUS, PROJECT_NAME_NOT_EXISTS_MSG);
        }
        if (isBlank(apiPassword)) {
            return R.error(PROJECT_API_PASSWORD_NOT_EXISTS_STATUS, PROJECT_API_PASSWORD_NOT_EXISTS_MSG);
        }

        projectName = trim(projectName);
        Project p = rccCache.getProject(projectName);
        if (p == null) {
            p = projectService.selectByName(projectName);
            if (p != null) {
                rccCache.loadProject(p);
            }
        }
        if (p == null) {
            return R.error(PROJECT_NOT_EXISTS_STATUS, PROJECT_NOT_EXISTS_MSG);
        }
        String passwordToCheck = p.getApiPassword();
        String md5 = Md5Util.md5(apiPassword);
        if (!passwordToCheck.equals(md5)) {
            return R.error(PROJECT_API_PASSWORD_ERROR_STATUS, PROJECT_API_PASSWORD_ERROR_MSG);
        }
        String token = p.getApiToken();

        ApiToken apiToken = apiTokenCacheService.getApiToken(token);

        if (apiToken == null) {
            return R.error(PROJECT_API_TOKEN_NOT_EXISTS_STATUS, PROJECT_API_TOKEN_NOT_EXISTS_MSG);
        }

        if (!apiToken.getProjectId().equals(p.getId())) {
            return R.error(PROJECT_API_TOKEN_ERROR_STATUS, PROJECT_API_TOKEN_ERROR_MSG);
        }

        boolean neverExpired = ApiTokenExpireNever.TRUE.getValue().equals(apiToken.getExpireNever());
        Long expiredTime = neverExpired || apiToken.getExpireTime() == null ? 0 : apiToken.getExpireTime().getTime();
        ApiAuthVo apiAuthVo = new ApiAuthVo();
        apiAuthVo.setProjectId(p.getId());
        apiAuthVo.setProjectName(p.getName());
        apiAuthVo.setToken(token);
        apiAuthVo.setNeverExpired(neverExpired);
        apiAuthVo.setExpiredTime(expiredTime);
        return R.ok(apiAuthVo);
    }
}
