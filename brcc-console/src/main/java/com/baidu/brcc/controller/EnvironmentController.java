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

import static com.baidu.brcc.common.Constants.CAN_WRITE;
import static com.baidu.brcc.common.ErrorStatusMsg.CHINESE_NOT_ALLOWED_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.CHINESE_NOT_ALLOWED_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_NAME_NOT_EMPTY_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_NAME_NOT_EMPTY_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.NON_LOGIN_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.NON_LOGIN_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.NO_ENVIRONMENT_PRI_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.NO_ENVIRONMENT_PRI_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PARAM_ERROR_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PARAM_ERROR_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PRIV_MIS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PRIV_MIS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_ID_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_ID_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_NOT_EXISTS_STATUS;
import static org.apache.commons.lang3.StringUtils.isNotBlank;
import static org.apache.commons.lang3.StringUtils.trim;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.baidu.brcc.domain.em.SortType;
import com.baidu.brcc.utils.Name.NameUtils;
import com.baidu.brcc.utils.SqlUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baidu.brcc.annotation.LoginUser;
import com.baidu.brcc.annotation.SaveLog;
import com.baidu.brcc.common.Constants;
import com.baidu.brcc.domain.Environment;
import com.baidu.brcc.domain.EnvironmentExample;
import com.baidu.brcc.domain.EnvironmentUser;
import com.baidu.brcc.domain.EnvironmentUserExample;
import com.baidu.brcc.domain.Project;
import com.baidu.brcc.domain.ProjectUser;
import com.baidu.brcc.domain.ProjectUserExample;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.base.Pagination;
import com.baidu.brcc.domain.base.R;
import com.baidu.brcc.domain.em.Deleted;
import com.baidu.brcc.domain.meta.MetaEnvironment;
import com.baidu.brcc.domain.meta.MetaEnvironmentUser;
import com.baidu.brcc.domain.vo.EnvironmentReq;
import com.baidu.brcc.domain.vo.ProjectUserEnv;
import com.baidu.brcc.domain.vo.ProjectUserEnvItem;
import com.baidu.brcc.service.EnvironmentService;
import com.baidu.brcc.service.EnvironmentUserService;
import com.baidu.brcc.service.ProjectService;
import com.baidu.brcc.service.ProjectUserService;
import com.baidu.brcc.service.RccCache;
import com.baidu.brcc.utils.time.DateTimeUtils;

/**
 * 管理端环境相关接口
 */
@RestController
@RequestMapping(path = {"console/environment", "environment"})
public class EnvironmentController {

    private static final Logger log = LoggerFactory.getLogger(EnvironmentController.class);

    @Autowired
    private EnvironmentService environmentService;

    @Autowired
    private ProjectService projectService;

    @Autowired
    private ProjectUserService projectUserService;

    @Autowired
    private EnvironmentUserService environmentUserService;

    @Autowired
    private RccCache rccCache;

    /**
     * 新增或修改环境
     *
     * @param req
     * @param user
     *
     * @return
     */
    @SaveLog(scene = "0003",
            paramsIdxes = {0},
            params = {"req"})
    @PostMapping(value = "save")
    public R save(@RequestBody EnvironmentReq req, @LoginUser User user) {
        if (user == null) {
            return R.error(NON_LOGIN_STATUS, NON_LOGIN_MSG);
        }
        Long id = req.getId();
        String name = trim(req.getName());
        if (NameUtils.containsChinese(name)) {
            return R.error(CHINESE_NOT_ALLOWED_STATUS, CHINESE_NOT_ALLOWED_MSG);
        }
        Date now = DateTimeUtils.now();

        Long cacheEvictProjectId = null;
        if (id != null && id > 0) {
            // 修改
            Environment environment = environmentService.selectByPrimaryKey(id);
            if (environment == null || Deleted.DELETE.getValue().equals(environment.getDeleted())) {
                return R.error(ENVIRONMENT_NOT_EXISTS_STATUS, ENVIRONMENT_NOT_EXISTS_MSG);
            }
            if (!projectUserService.checkAuth(environment.getProductId(), environment.getProjectId(), user)) {
                return R.error(PRIV_MIS_STATUS, PRIV_MIS_MSG);
            }
            Environment update = new Environment();
            update.setId(id);
            update.setUpdateTime(now);
            if (StringUtils.isNotBlank(name)) {
                Environment exists = environmentService.selectOneByExample(EnvironmentExample.newBuilder()
                                .build()
                                .createCriteria()
                                .andIdNotEqualTo(id)
                                .andNameEqualTo(name)
                                .andProjectIdEqualTo(environment.getProjectId())
                                .andDeletedEqualTo(Deleted.OK.getValue())
                                .toExample(),
                        MetaEnvironment.COLUMN_NAME_ID
                );
                if (exists != null) {
                    return R.error(ENVIRONMENT_EXISTS_STATUS, ENVIRONMENT_EXISTS_MSG);
                }
                update.setName(name);
            }
            update.setMemo(req.getMemo());
            environmentService.updateByPrimaryKeySelective(update);

            cacheEvictProjectId = environment.getProjectId();
        } else {
            // 新增
            Long projectId = req.getProjectId();
            if (null == projectId || projectId <= 0) {
                return R.error(PROJECT_ID_NOT_EXISTS_STATUS, PROJECT_ID_NOT_EXISTS_MSG);
            }
            if (StringUtils.isBlank(name)) {
                return R.error(ENVIRONMENT_NAME_NOT_EMPTY_STATUS, ENVIRONMENT_NAME_NOT_EMPTY_MSG);
            }
            Project project = projectService.selectByPrimaryKey(projectId);
            if (project == null || Deleted.DELETE.getValue().equals(project.getDeleted())) {
                return R.error(PROJECT_NOT_EXISTS_STATUS, PROJECT_NOT_EXISTS_MSG);
            }
            if (!projectUserService.checkAuth(project.getProductId(), projectId, user)) {
                return R.error(PRIV_MIS_STATUS, PRIV_MIS_MSG);
            }
            Environment environment = environmentService.selectOneByExample(EnvironmentExample.newBuilder()
                            .build()
                            .createCriteria()
                            .andDeletedEqualTo(Deleted.OK.getValue())
                            .andProjectIdEqualTo(projectId)
                            .andNameEqualTo(name)
                            .toExample(),
                    MetaEnvironment.COLUMN_NAME_ID
            );
            if (environment != null) {
                return R.error(ENVIRONMENT_EXISTS_STATUS, ENVIRONMENT_EXISTS_MSG);
            }

            Environment insert = new Environment();
            insert.setUpdateTime(now);
            insert.setCreateTime(now);
            insert.setDeleted(Deleted.OK.getValue());
            insert.setName(name);
            insert.setMemo(req.getMemo());
            insert.setProjectId(projectId);
            insert.setProductId(project.getProductId());
            environmentService.insertSelective(insert);
            id = insert.getId();

            cacheEvictProjectId = projectId;
        }

        // 失效缓存
        rccCache.evictEnvironment(cacheEvictProjectId);

        return R.ok(id);
    }

    /**
     * 删除环境
     *
     * @param envId
     * @param user
     *
     * @return
     */
    @SaveLog(scene = "0004",
            paramsIdxes = {0},
            params = {"envId"})
    @PostMapping(value = "delete/{envId}")
    public R delEnv(@PathVariable Long envId, @LoginUser User user) {
        if (user == null) {
            return R.error(NON_LOGIN_STATUS, NON_LOGIN_MSG);
        }
        Environment environment = environmentService.selectByPrimaryKey(envId);
        if (environment == null || Deleted.DELETE.getValue().equals(environment.getDeleted())) {
            return R.error(ENVIRONMENT_NOT_EXISTS_STATUS, ENVIRONMENT_NOT_EXISTS_MSG);
        }
        if (!projectUserService.checkAuth(environment.getProductId(), environment.getProjectId(), user)) {
            return R.error(PRIV_MIS_STATUS, PRIV_MIS_MSG);
        }
        // 级联删除环境及失效缓存
        int del = environmentService.deleteCascadeByEnvId(envId);
        return R.ok(del);
    }

    /**
     * 分页获取指定工程下的所有环境
     *
     * @param projectId
     * @param pageNo
     * @param pageSize
     *
     * @return
     */
    @GetMapping("list")
    public R<Pagination<Environment>> getEnvList(
            @RequestParam(value = "sortField", defaultValue = "id") String sortField,
            @RequestParam(value = "sortBy", defaultValue = "desc") String sortBy,
            @RequestParam("projectId") Long projectId,
            @RequestParam(value = "pageNo", defaultValue = "1") Integer pageNo,
            @RequestParam(value = "pageSize", defaultValue = "20") Integer pageSize,
            @LoginUser User user
    ) {

        if (user == null) {
            return R.error(NON_LOGIN_STATUS, NON_LOGIN_MSG);
        }
        if (null == projectId || projectId <= 0) {
            return R.error(PROJECT_ID_NOT_EXISTS_STATUS, PROJECT_ID_NOT_EXISTS_MSG);
        }
        if (!SqlUtils.isValid(sortBy)) {
            return R.error(PARAM_ERROR_STATUS, PARAM_ERROR_MSG);
        }
        Project project = projectService.selectByPrimaryKey(projectId);
        if (project == null || Deleted.DELETE.getValue().equals(project.getDeleted())) {
            return R.error(PROJECT_NOT_EXISTS_STATUS, PROJECT_NOT_EXISTS_MSG);
        }

        int offset = (pageNo - 1) * pageSize;

        boolean canManage = projectUserService.checkAuth(project.getProductId(), projectId, user);
        Set<Long> environmentIds = new HashSet<>();
        if (!canManage) {
            List<EnvironmentUser> environmentUsers =
                    environmentUserService.selectByExample(EnvironmentUserExample.newBuilder()
                                    .distinct(true)
                                    .build()
                                    .createCriteria()
                                    .andUserIdEqualTo(user.getId())
                                    .andProjectIdEqualTo(projectId)
                                    .toExample(),
                            MetaEnvironmentUser.COLUMN_NAME_ENVIRONMENTID
                    );
            if (!CollectionUtils.isEmpty(environmentUsers)) {
                for (EnvironmentUser environmentUser : environmentUsers) {
                    environmentIds.add(environmentUser.getEnvironmentId());
                }
            }
            if (environmentIds.isEmpty()) {
                return R.error(NO_ENVIRONMENT_PRI_STATUS, NO_ENVIRONMENT_PRI_MSG);
            }
        }

        Pagination<Environment> pagination = environmentService.pagination(EnvironmentExample.newBuilder()
                .orderByClause(MetaEnvironment.getSafeColumnNameByField(sortField) + " " + sortBy,
                        isNotBlank(sortField))
                .start(offset)
                .limit(pageSize)
                .build()
                .createCriteria()
                .andProjectIdEqualTo(projectId)
                .andDeletedEqualTo(Deleted.OK.getValue())
                .andIdIn(environmentIds, !canManage)
                .toExample()
        );

        // 权限
        Map<String, Object> ext = new HashMap<>();
        ext.put("canManage", canManage);

        return R.ok(pagination, ext);

    }

    /**
     * 获取环境列表
     *
     * @param productId
     * @param projectId
     *
     * @return
     */
    @GetMapping("listByUser/{productId}/{projectId}/{userId}")
    public R<ProjectUserEnv> getEnvListByUserId(@PathVariable("productId") Long productId,
                                                @PathVariable("projectId") Long projectId,
                                                @PathVariable("userId") Long userId,
                                                @LoginUser User user) {
        if (user == null) {
            return R.error(NON_LOGIN_STATUS, NON_LOGIN_MSG);
        }

        // 查询project_user表
        ProjectUser projectUser = projectUserService.selectOneByExample(ProjectUserExample.newBuilder()
                .build()
                .createCriteria()
                .andProductIdEqualTo(productId)
                .andProjectIdEqualTo(projectId)
                .andUserIdEqualTo(userId)
                .toExample());
        ProjectUserEnv projectUserEnv = ProjectUserEnv.newBuilder()
                .itemList(new ArrayList<>())
                .build();

        // 查询改project下的环境list
        Map<Long, Environment> environmentMap = environmentService.selectMapByExample(
                EnvironmentExample.newBuilder()
                        .build()
                        .createCriteria()
                        .andProductIdEqualTo(productId)
                        .andProjectIdEqualTo(projectId)
                        .andDeletedEqualTo(Deleted.OK.getValue())
                        .toExample(),
                Environment :: getId
        );

        if (projectUser != null && Constants.IS_ADMIN.equals(projectUser.getIsAdmin())) {
            projectUserEnv.setIsAdmin(Constants.IS_ADMIN);
            if (!CollectionUtils.isEmpty(environmentMap)) {
                for (Map.Entry<Long, Environment> entry : environmentMap.entrySet()) {
                    ProjectUserEnvItem projectUserEnvItem = ProjectUserEnvItem.newBuilder()
                            .envId(entry.getKey())
                            .envName(entry.getValue().getName())
                            .priType(CAN_WRITE)
                            .build();
                    projectUserEnv.getItemList().add(projectUserEnvItem);
                }
            }

        } else {
            projectUserEnv.setIsAdmin(Constants.IS_MEMBER);
            // 普通成员查询env_user关系表
            Map<Long, EnvironmentUser> environmentUserMap = environmentUserService.selectMapByExample(
                    EnvironmentUserExample.newBuilder()
                            .build()
                            .createCriteria()
                            .andUserIdEqualTo(userId)
                            .andProductIdEqualTo(productId)
                            .andProjectIdEqualTo(projectId)
                            .toExample(),
                    EnvironmentUser :: getEnvironmentId
            );

            if (!CollectionUtils.isEmpty(environmentMap)) {
                for (Map.Entry<Long, Environment> entry : environmentMap.entrySet()) {

                    ProjectUserEnvItem projectUserEnvItem = ProjectUserEnvItem.newBuilder()
                            .envId(entry.getKey())
                            .envName(entry.getValue().getName())
                            .priType((byte) 0)
                            .build();
                    EnvironmentUser environmentUser = environmentUserMap.get(entry.getKey());
                    if (null != environmentUser) {
                        projectUserEnvItem.setPriType(environmentUser.getPriType());
                    }
                    projectUserEnv.getItemList().add(projectUserEnvItem);
                }
            }
        }

        // 权限
        Map<String, Object> ext = new HashMap<>();
        boolean canManage = projectUserService.checkAuth(productId, projectId, user);
        ext.put("canManage", canManage);

        return R.ok(projectUserEnv, ext);
    }
}
