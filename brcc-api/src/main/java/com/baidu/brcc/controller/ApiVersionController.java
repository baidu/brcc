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
import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_ID_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_ID_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_NAME_NOT_EMPTY_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_NAME_NOT_EMPTY_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_NAME_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_NAME_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PRIV_MIS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PRIV_MIS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_TOKEN_NOT_EMPTY_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_TOKEN_NOT_EMPTY_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_TOKEN_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_TOKEN_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_ID_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_ID_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_NAME_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_NAME_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_NOT_EXISTS_STATUS;
import static org.apache.commons.lang3.StringUtils.isBlank;
import static org.apache.commons.lang3.StringUtils.trim;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.baidu.brcc.annotation.SaveLog;
import com.baidu.brcc.domain.ConfigGroup;
import com.baidu.brcc.domain.ConfigGroupExample;
import com.baidu.brcc.domain.Environment;
import com.baidu.brcc.domain.EnvironmentExample;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.Version;
import com.baidu.brcc.domain.VersionExample;
import com.baidu.brcc.domain.em.Deleted;
import com.baidu.brcc.domain.em.GrayFlag;
import com.baidu.brcc.domain.exception.BizException;
import com.baidu.brcc.domain.meta.MetaConfigGroup;
import com.baidu.brcc.domain.meta.MetaEnvironment;
import com.baidu.brcc.domain.meta.MetaVersion;
import com.baidu.brcc.domain.vo.ApiGroupVo;
import com.baidu.brcc.domain.vo.ConfigGroupReq;
import com.baidu.brcc.domain.vo.VersionReq;
import com.baidu.brcc.service.ConfigGroupService;
import com.baidu.brcc.service.EnvironmentService;
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

    @Autowired
    private ConfigGroupService configGroupService;

    @Autowired
    private EnvironmentService environmentService;

    /**
     * @param token
     * @param environmentId
     * @param name
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
     * @param token         api token
     * @param environmentId 环境ID
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

    /**
     * list all groups by versionId
     * @param token
     * @param versionId
     * @return
     */
    @GetMapping("group")
    public R<List<ApiGroupVo>> getAllGroup(String token, Long versionId) {
        // check project
        if (isBlank(token)) {
            return R.error(PROJECT_API_TOKEN_NOT_EMPTY_STATUS, PROJECT_API_TOKEN_NOT_EMPTY_MSG);
        }
        // check version id
        if (versionId == null || versionId <= 0) {
            return R.error(VERSION_ID_NOT_EXISTS_STATUS, VERSION_ID_NOT_EXISTS_MSG);
        }
        // check apiToken valid
        ApiToken apiToken = apiTokenCacheService.getApiToken(token);
        if (apiToken == null) {
            return R.error(PROJECT_API_TOKEN_NOT_EXISTS_STATUS, PROJECT_API_TOKEN_NOT_EXISTS_MSG);
        }
        // get all groups by versionId
        List<ConfigGroup> configGroupList = configGroupService.listAllGroupByVersionId(apiToken.getProjectId(), versionId);
        List<ApiGroupVo> apiGroupVos = new ArrayList<>();
        for (ConfigGroup item: configGroupList) {
            ApiGroupVo vo = new ApiGroupVo();
            vo.setGroupId(item.getId());
            vo.setGroupName(item.getName());
            apiGroupVos.add(vo);
        }
        if (CollectionUtils.isEmpty(apiGroupVos)) {
            return R.ok(new ArrayList<>(0));
        }
        return R.ok(apiGroupVos);
    }

    /**
     * add new group by versionId
     * @param token
     * @param configGroupReq
     * @return
     */
    @SaveLog(scene = "增加分组",
            paramsIdxes = {1},
            params = {"configGroupReq"})
    @PostMapping("groupAdd")
    public R<Long> addGroup(String token, @RequestBody ConfigGroupReq configGroupReq) {
        // check project
        if (isBlank(token)) {
            return R.error(PROJECT_API_TOKEN_NOT_EMPTY_STATUS, PROJECT_API_TOKEN_NOT_EMPTY_MSG);
        }
        // check groupName
        if (isBlank(configGroupReq.getName())) {
            return R.error(GROUP_NAME_NOT_EXISTS_STATUS, GROUP_NAME_NOT_EXISTS_MSG);
        }
        // check version id
        if (configGroupReq.getVersionId() == null || configGroupReq.getVersionId() <= 0) {
            return R.error(VERSION_ID_NOT_EXISTS_STATUS, VERSION_ID_NOT_EXISTS_MSG);
        }
        // check version
        Version version = versionService.selectByPrimaryKey(configGroupReq.getVersionId());
        if (version == null || Deleted.DELETE.getValue().equals(version.getDeleted())) {
            return R.error(VERSION_NOT_EXISTS_STATUS, VERSION_NOT_EXISTS_MSG);
        }
        // check apiToken valid
        ApiToken apiToken = apiTokenCacheService.getApiToken(token);
        if (apiToken == null) {
            return R.error(PROJECT_API_TOKEN_NOT_EXISTS_STATUS, PROJECT_API_TOKEN_NOT_EXISTS_MSG);
        }
        // check group exist
        ConfigGroup configGroup = configGroupService.selectOneByExample(ConfigGroupExample.newBuilder()
                        .build()
                        .createCriteria()
                        .andDeletedEqualTo(Deleted.OK.getValue())
                        .andVersionIdEqualTo(configGroupReq.getVersionId())
                        .andNameEqualTo(configGroupReq.getName())
                        .toExample(),
                MetaConfigGroup.COLUMN_NAME_ID
        );
        if (configGroup != null) {
            return R.error(GROUP_EXISTS_STATUS, GROUP_EXISTS_MSG);
        }
        // add new group
        Date now = DateTimeUtils.now();
        ConfigGroup insert = new ConfigGroup();
        insert.setUpdateTime(now);
        insert.setCreateTime(now);
        insert.setDeleted(Deleted.OK.getValue());
        insert.setName(configGroupReq.getName());
        insert.setMemo(configGroupReq.getMemo());
        insert.setVersionId(configGroupReq.getVersionId());
        insert.setEnvironmentId(version.getEnvironmentId());
        insert.setProjectId(version.getProjectId());
        insert.setProductId(version.getProductId());
        configGroupService.insertSelective(insert);
        Long id = insert.getId();
        return R.ok(id);
    }

    /**
     * add new version by environmentId
     * @param token
     * @param
     * @return
     */
    @SaveLog(scene = "增加版本",
            paramsIdxes = {1},
            params = {"versionReq"})
    @PostMapping("versionAdd")
    public R<Long> addVersion(String token, @RequestBody VersionReq versionReq) {
        String name = trim(versionReq.getName());
        String memo = trim(versionReq.getMemo());
        // check token
        if (isBlank(token)) {
            return R.error(PROJECT_API_TOKEN_NOT_EMPTY_STATUS, PROJECT_API_TOKEN_NOT_EMPTY_MSG);
        }
        // check apiToken valid
        ApiToken apiToken = apiTokenCacheService.getApiToken(token);
        if (apiToken == null) {
            return R.error(PROJECT_API_TOKEN_NOT_EXISTS_STATUS, PROJECT_API_TOKEN_NOT_EXISTS_MSG);
        }
        // check version name
        if (isBlank(name)) {
            return R.error(VERSION_NAME_NOT_EXISTS_STATUS, VERSION_NAME_NOT_EXISTS_MSG);
        }
        // check environmentId
        if (versionReq.getEnvironmentId() == null || versionReq.getEnvironmentId() <= 0) {
            return R.error(ENVIRONMENT_ID_NOT_EXISTS_STATUS, ENVIRONMENT_ID_NOT_EXISTS_MSG);
        }
        Environment environment = environmentService.selectByPrimaryKey(versionReq.getEnvironmentId());
        if (environment == null || Deleted.DELETE.getValue().equals(environment.getDeleted())) {
            return R.error(ENVIRONMENT_NOT_EXISTS_STATUS, ENVIRONMENT_NOT_EXISTS_MSG);
        }
        // check for duplicate
        Version version = versionService.selectOneByExample(VersionExample.newBuilder()
                        .build()
                        .createCriteria()
                        .andDeletedEqualTo(Deleted.OK.getValue())
                        .andEnvironmentIdEqualTo(versionReq.getEnvironmentId())
                        .andNameEqualTo(name)
                        .toExample(),
                MetaVersion.COLUMN_NAME_ID
        );
        if (version != null) {
            return R.error(VERSION_EXISTS_STATUS, VERSION_EXISTS_MSG);
        }
        // add new environment
        Version insert = new Version();
        insert.setUpdateTime(new Date());
        insert.setCreateTime(new Date());
        insert.setDeleted(Deleted.OK.getValue());
        insert.setName(name);
        insert.setMemo(memo);
        insert.setEnvironmentId(versionReq.getEnvironmentId());
        insert.setProjectId(environment.getProjectId());
        insert.setProductId(environment.getProductId());
        insert.setCheckSum(UUID.randomUUID().toString());
        insert.setCheckSumDate(new Date());
        versionService.insertSelective(insert);
        rccCache.evictVersion(versionReq.getEnvironmentId());
        return R.ok(insert.getId());
    }
}
