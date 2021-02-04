/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.controller;

import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_ID_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_ID_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_TOKEN_NOT_EMPTY_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_TOKEN_NOT_EMPTY_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_TOKEN_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_TOKEN_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_NAME_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_NAME_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_NOT_EXISTS_STATUS;
import static org.apache.commons.lang3.StringUtils.isBlank;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baidu.brcc.domain.ApiToken;
import com.baidu.brcc.domain.base.R;
import com.baidu.brcc.domain.vo.ApiVersionVo;
import com.baidu.brcc.service.ApiTokenCacheService;
import com.baidu.brcc.service.RccCache;
import com.baidu.brcc.service.VersionService;

@RestController
@RequestMapping("api")
public class ApiVersionController {

    @Autowired
    ApiTokenCacheService apiTokenCacheService;

    @Autowired
    private VersionService versionService;

    @Autowired
    private RccCache rccCache;

    /**
     * @param token
     * @param environmentId
     * @param name
     *
     * @return
     */
    @GetMapping("version/{versionName}")
    public R<ApiVersionVo> getVersion(
            String token,
            Long environmentId,
            @PathVariable("versionName") String name
    ) {
        if (isBlank(token)) {
            return R.error(PROJECT_API_TOKEN_NOT_EMPTY_STATUS, PROJECT_API_TOKEN_NOT_EMPTY_MSG);
        }
        if (environmentId == null || environmentId <= 0) {
            return R.error(ENVIRONMENT_ID_NOT_EXISTS_STATUS, ENVIRONMENT_ID_NOT_EXISTS_MSG);
        }
        if (isBlank(name)) {
            return R.error(VERSION_NAME_NOT_EXISTS_STATUS, VERSION_NAME_NOT_EXISTS_MSG);
        }
        ApiToken apiToken = apiTokenCacheService.getApiToken(token);
        if (apiToken == null) {
            return R.error(PROJECT_API_TOKEN_NOT_EXISTS_STATUS, PROJECT_API_TOKEN_NOT_EXISTS_MSG);
        }
        ApiVersionVo versionVo = versionService.getByEnvironmentAndNameInCache(apiToken.getProjectId(), environmentId
                , name);

        if (versionVo == null) {
            return R.error(VERSION_NOT_EXISTS_STATUS, VERSION_NOT_EXISTS_MSG);
        }
        return R.ok(versionVo);
    }

    /**
     * 获取环境下所有版本
     *
     * @param token         api token
     * @param environmentId 环境ID
     *
     * @return
     */
    @GetMapping("version")
    public R<List<ApiVersionVo>> getAllVersion(String token, Long environmentId) {
        if (isBlank(token)) {
            return R.error(PROJECT_API_TOKEN_NOT_EMPTY_STATUS, PROJECT_API_TOKEN_NOT_EMPTY_MSG);
        }
        if (environmentId == null || environmentId <= 0) {
            return R.error(ENVIRONMENT_ID_NOT_EXISTS_STATUS, ENVIRONMENT_ID_NOT_EXISTS_MSG);
        }
        ApiToken apiToken = apiTokenCacheService.getApiToken(token);
        if (apiToken == null) {
            return R.error(PROJECT_API_TOKEN_NOT_EXISTS_STATUS, PROJECT_API_TOKEN_NOT_EXISTS_MSG);
        }
        List<ApiVersionVo> versionVos = versionService.getAllByEnvironmentIdInCache(apiToken.getProjectId(),
                environmentId);
        if (CollectionUtils.isEmpty(versionVos)) {
            return R.ok(new ArrayList<>(0));
        }
        return R.ok(versionVos);
    }

}
