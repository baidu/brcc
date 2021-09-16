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

import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_ID_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_ID_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_NAME_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_NAME_NOT_EXISTS_STATUS;
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
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.baidu.brcc.annotation.SaveLog;
import com.baidu.brcc.common.InstanceEventType;
import com.baidu.brcc.domain.ConfigGroup;
import com.baidu.brcc.domain.ConfigGroupExample;
import com.baidu.brcc.domain.Environment;
import com.baidu.brcc.domain.GrayInfo;
import com.baidu.brcc.domain.GrayRule;
import com.baidu.brcc.domain.Version;
import com.baidu.brcc.domain.VersionExample;
import com.baidu.brcc.domain.em.Deleted;
import com.baidu.brcc.domain.em.GrayFlag;
import com.baidu.brcc.domain.exception.BizException;
import com.baidu.brcc.domain.meta.MetaConfigGroup;
import com.baidu.brcc.domain.meta.MetaVersion;
import com.baidu.brcc.domain.vo.ApiGroupVo;
import com.baidu.brcc.domain.vo.ConfigGroupReq;
import com.baidu.brcc.domain.vo.VersionReq;
import com.baidu.brcc.dto.InstanceInfoEventDto;
import com.baidu.brcc.rule.GrayExcutor;
import com.baidu.brcc.service.BrccInstanceService;
import com.baidu.brcc.service.ConfigGroupService;
import com.baidu.brcc.service.EnvironmentService;
import com.baidu.brcc.service.GrayInfoService;
import com.baidu.brcc.service.GrayRuleService;
import com.baidu.brcc.utils.time.DateTimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    private GrayExcutor grayExcutor;

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

    @Autowired
    private GrayRuleService grayRuleService;

    @Autowired
    private GrayInfoService grayInfoService;

    @Autowired
    private BrccInstanceService brccInstanceService;

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

    @GetMapping("v2/version/{versionName}")
    public R<ApiVersionVo> getGrayVersion(
            @RequestParam(name = "token") String token,
            @RequestParam(name = "environmentId") Long environmentId,
            @RequestParam(name = "containerId", required = false, defaultValue = "") String containerId,
            @RequestParam(name = "idc", required = false, defaultValue = "") String idc,
            @RequestParam(name = "ip", required = false, defaultValue = "") String ip,
            @RequestParam(name = "enableGray", required = false) Boolean enableGray,
            @PathVariable("versionName") String name) {
        // 1、从数据库里根据grayversionid拿到rule 列表
        // 2、根据rule对象获得 spring的GrayHitRule列表
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
        Version version = versionService.selectByProjectIdAndEnvironmentIdAndName(apiToken.getProjectId(), environmentId
                , name);
        if (version == null || version.getDeleted().equals(Deleted.DELETE.getValue())) {
            return R.error(VERSION_NOT_EXISTS_STATUS, VERSION_NOT_EXISTS_MSG);
        }
        Map<String, String> contentMap = new HashMap<>();
        contentMap.put("count", "");
        contentMap.put("ip", ip);
        contentMap.put("idc", idc);
        contentMap.put("containerId", containerId);
        ApiVersionVo versionVo = new ApiVersionVo();
        versionVo.setVersionName(version.getName());
        versionVo.setCheckSum(version.getCheckSum());
        versionVo.setEnvironmentId(version.getEnvironmentId());
        versionVo.setProjectId(version.getProjectId());
        versionVo.setVersionId(version.getId());
        Long mainVersionId = version.getId();
        // 判断是否灰度
        if (enableGray != null && enableGray && version.getGrayFlag().equals(GrayFlag.GRAY.getValue())) {
            // 获取灰度版本
            Version grayVersion = versionService.selectByMainVersionId(mainVersionId);
            Long grayVersionId = grayVersion.getId();
            // 获取灰度规则
            List<GrayRule> grayRules = grayRuleService.selectByGrayVersionId(grayVersionId);
            if (grayRules != null && !grayRules.isEmpty()) {
                List<Long> ids = new ArrayList<>();
                for (GrayRule grayRule : grayRules) {
                    ids.add(grayRule.getRuleId());
                }
                // 获取灰度规则内容
                List<GrayInfo> grayInfos = grayInfoService.selectByIds(ids);
                if (grayExcutor.hit(grayInfos, grayVersionId, contentMap)) {
                    // 若命中，则返回灰度版本
                    versionVo.setVersionName(grayVersion.getName());
                    versionVo.setCheckSum(grayVersion.getCheckSum());
                    versionVo.setEnvironmentId(grayVersion.getEnvironmentId());
                    versionVo.setProjectId(grayVersion.getProjectId());
                    versionVo.setVersionId(grayVersion.getId());
                    // 命中后修改实例的灰度信息
                    brccInstanceService.updateInstance(ip, idc, containerId, mainVersionId, grayVersionId);
                }else{
                    // 把versionId改为主版本的ID
                    brccInstanceService.updateInvalidGrayInstance(ip, idc, containerId, mainVersionId, grayVersionId);
                }
            }
        }
        brccInstanceService.updateInstance(ip, idc, containerId, mainVersionId, 0L);
        return R.ok(versionVo);
    }

    /**
     * 获取环境下所有版本
     *
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
     *
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
        for (ConfigGroup item : configGroupList) {
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
     *
     * @param token
     * @param configGroupReq
     * @return
     */
    @SaveLog(scene = "0005",
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
     *
     * @param token
     * @param
     * @return
     */
    @SaveLog(scene = "0015",
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

    /**
     * push configuration changes, change checkSum
     *
     * @param versionId
     * @param token
     * @return
     */
    @SaveLog(scene = "0020",
            paramsIdxes = {0},
            params = {"versionId"})
    @PostMapping("version/pushChange")
    public R pushChange(String token, Long versionId) {
        // check token
        if (isBlank(token)) {
            return R.error(PROJECT_API_TOKEN_NOT_EMPTY_STATUS, PROJECT_API_TOKEN_NOT_EMPTY_MSG);
        }
        // check apiToken valid
        ApiToken apiToken = apiTokenCacheService.getApiToken(token);
        if (apiToken == null) {
            return R.error(PROJECT_API_TOKEN_NOT_EXISTS_STATUS, PROJECT_API_TOKEN_NOT_EXISTS_MSG);
        }
        if (versionId == null || versionId <= 0) {
            return R.error(VERSION_ID_NOT_EXISTS_STATUS, VERSION_ID_NOT_EXISTS_MSG);
        }
        // check version
        Version version = versionService.selectByPrimaryKey(versionId);
        if (version == null || Deleted.DELETE.getValue().equals(version.getDeleted())) {
            return R.error(VERSION_NOT_EXISTS_STATUS, VERSION_NOT_EXISTS_MSG);
        }
        Version update = new Version();
        update.setId(versionId);
        update.setCheckSum(UUID.randomUUID().toString());
        update.setCheckSumDate(new Date());
        update.setUpdateTime(new Date());
        int cnt = versionService.updateByPrimaryKeySelective(update);
        rccCache.evictVersion(version.getEnvironmentId());
        // 失效id->version的缓存
        rccCache.evictVersionById(Arrays.asList(versionId));
        return R.ok(cnt);
    }
}
