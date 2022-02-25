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


import static com.baidu.brcc.common.ErrorStatusMsg.CHINESE_NOT_ALLOWED_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.CHINESE_NOT_ALLOWED_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.NON_LOGIN_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.NON_LOGIN_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PARAM_ERROR_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PARAM_ERROR_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PRIV_MIS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PRIV_MIS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PRODUCT_ID_EMPTY_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PRODUCT_ID_EMPTY_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PRODUCT_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PRODUCT_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_PASSWORD_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_PASSWORD_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_ID_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_ID_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_NAME_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_NAME_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_NAME_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_NAME_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_REF_ID_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_REF_ID_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_TYPE_NOT_AVAILABLE_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_TYPE_NOT_AVAILABLE_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.TYPE_NULL_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.TYPE_NULL_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.USERID_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.USERID_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.USER_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.USER_NOT_EXISTS_STATUS;
import static org.apache.commons.lang3.StringUtils.isBlank;
import static org.apache.commons.lang3.StringUtils.isNotBlank;
import static org.apache.commons.lang3.StringUtils.trim;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;

import com.baidu.brcc.domain.em.SortType;
import com.baidu.brcc.domain.vo.ResetApiPasswordVo;
import com.baidu.brcc.utils.Name.NameUtils;
import com.baidu.brcc.utils.SqlUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baidu.brcc.annotation.LoginUser;
import com.baidu.brcc.annotation.MaskLog;
import com.baidu.brcc.annotation.SaveLog;
import com.baidu.brcc.common.Constants;
import com.baidu.brcc.common.ErrorStatusMsg;
import com.baidu.brcc.domain.ApiToken;
import com.baidu.brcc.domain.EnvironmentUser;
import com.baidu.brcc.domain.EnvironmentUserExample;
import com.baidu.brcc.domain.Product;
import com.baidu.brcc.domain.Project;
import com.baidu.brcc.domain.ProjectExample;
import com.baidu.brcc.domain.ProjectUser;
import com.baidu.brcc.domain.ProjectUserExample;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.base.Pagination;
import com.baidu.brcc.domain.base.R;
import com.baidu.brcc.domain.em.Deleted;
import com.baidu.brcc.domain.em.EnvironmentUserPriType;
import com.baidu.brcc.domain.em.ProjectType;
import com.baidu.brcc.domain.em.ProjectUserAdmin;
import com.baidu.brcc.domain.em.UserRole;
import com.baidu.brcc.domain.meta.MetaApiToken;
import com.baidu.brcc.domain.meta.MetaEnvironmentUser;
import com.baidu.brcc.domain.meta.MetaProject;
import com.baidu.brcc.domain.meta.MetaProjectUser;
import com.baidu.brcc.domain.vo.ProjectListVo;
import com.baidu.brcc.domain.vo.ProjectReq;
import com.baidu.brcc.dto.EnvPriDto;
import com.baidu.brcc.dto.ProjectUserDto;
import com.baidu.brcc.dto.RefProjectDto;
import com.baidu.brcc.service.ApiTokenService;
import com.baidu.brcc.service.EnvironmentUserService;
import com.baidu.brcc.service.ProductService;
import com.baidu.brcc.service.ProductUserService;
import com.baidu.brcc.service.ProjectService;
import com.baidu.brcc.service.ProjectUserService;
import com.baidu.brcc.service.RccCache;
import com.baidu.brcc.service.UserService;
import com.baidu.brcc.utils.bcrypt.Md5Util;
import com.baidu.brcc.utils.time.DateTimeUtils;

import lombok.extern.slf4j.Slf4j;

/**
 * 工程相关接口
 */
@RestController
@RequestMapping(path = {"console/project", "project"})
@Slf4j
public class ProjectController {

    @Value("${rcc.user.type.default}")
    private byte defaultUserType;

    @Autowired
    private ProjectService projectService;

    @Autowired
    private ProductService productService;

    @Autowired
    private ProjectUserService projectUserService;

    @Autowired
    private ProductUserService productUserService;

    @Autowired
    private EnvironmentUserService envUserService;

    @Autowired
    private UserService userService;

    @Autowired
    private ApiTokenService apiTokenService;

    @Autowired
    private EnvironmentUserService environmentUserService;

    @Autowired
    private RccCache rccCache;

    /**
     * 保存工程
     *
     * @param req
     * @return
     */
    @SaveLog(scene = "0009",
            paramsIdxes = {0},
            params = {"req"}
    )
    @PostMapping("save")
    public R addProject(@RequestBody ProjectReq req, @RequestParam(required = false) String apiPassword, @LoginUser User user) {
        if (user == null) {
            return R.error(NON_LOGIN_STATUS, NON_LOGIN_MSG);
        }
        Long id = req.getId();
        String name = trim(req.getName());
        if (NameUtils.containsChinese(name)) {
            return R.error(CHINESE_NOT_ALLOWED_STATUS, CHINESE_NOT_ALLOWED_MSG);
        }
        Date now = DateTimeUtils.now();
        Byte projectType = req.getProjectType();
        if (projectType == null) {
            return R.error(TYPE_NULL_STATUS, TYPE_NULL_MSG);
        }
        if (!ProjectType.PRIVATE.getValue().equals(projectType) && !ProjectType.PUBLIC.getValue()
                .equals(projectType)) {
            return R.error(PROJECT_TYPE_NOT_AVAILABLE_STATUS, PROJECT_TYPE_NOT_AVAILABLE_MSG);
        }
        String cacheEvictProjectName = null;
        List<String> cacheEvictApiTokens = null;
        String token = UUID.randomUUID().toString().replace("-", "");
        if (id != null && id > 0) {
            // 修改
            Project project = projectService.selectByPrimaryKey(id,
                    MetaProject.COLUMN_NAME_ID,
                    MetaProject.COLUMN_NAME_DELETED,
                    MetaProject.COLUMN_NAME_PRODUCTID,
                    MetaProject.COLUMN_NAME_NAME
            );
            if (project == null || Deleted.DELETE.getValue().equals(project.getDeleted())) {
                return R.error(PROJECT_NOT_EXISTS_STATUS, PROJECT_NOT_EXISTS_MSG);
            }
            if (!projectUserService.checkAuth(project.getProductId(), id, user)) {
                return R.error(PRIV_MIS_STATUS, PRIV_MIS_MSG);
            }
            // 修改的情况下需要失效缓存
            cacheEvictProjectName = project.getName();

            Project update = new Project();
            update.setId(id);
            update.setUpdateTime(now);
            if (StringUtils.isNotBlank(name)) {
                Project exists = projectService.selectOneByExample(ProjectExample.newBuilder()
                                .build()
                                .createCriteria()
                                .andIdNotEqualTo(id)
                                .andNameEqualTo(name)
                                .andDeletedEqualTo(Deleted.OK.getValue())
                                .toExample(),
                        MetaProject.COLUMN_NAME_ID
                );
                if (exists != null) {
                    return R.error(PROJECT_NAME_EXISTS_STATUS, PROJECT_NAME_EXISTS_MSG);
                }
                update.setName(name);
            }
            update.setMailReceiver(req.getMailReceiver());
            update.setMemo(req.getMemo());
            update.setProjectType(projectType);
            if (isNotBlank(apiPassword)) {
                update.setApiPassword(Md5Util.md5(apiPassword));
                update.setApiToken(token);
            }
            projectService.updateByPrimaryKeySelective(update);

            cacheEvictApiTokens = new ArrayList<>();
            if (!StringUtils.equals(name, project.getName()) || isNotBlank(apiPassword)) {
                List<ApiToken> apiTokens = apiTokenService.selectByProjectId(
                        project.getId(),
                        MetaApiToken.COLUMN_NAME_ID,
                        MetaApiToken.COLUMN_NAME_TOKEN
                );
                for (ApiToken apiToken : apiTokens) {
                    // 若修改了名称
                    if (!StringUtils.equals(name, project.getName())) {
                        apiToken.setProjectName(name);
                    }
                    // 若修改了API密码
                    if (isNotBlank(apiPassword)) {
                        apiToken.setToken(token);
                    }
                    apiToken.setUpdateTime(new Date());
                    apiTokenService.updateByPrimaryKeySelective(apiToken);
                    cacheEvictApiTokens.add(apiToken.getToken());
                }
            }
        } else {
            // 新增
            Long productId = req.getProductId();
            if (null == productId || productId <= 0) {
                return R.error(PRODUCT_ID_EMPTY_STATUS, PRODUCT_ID_EMPTY_MSG);
            }
            if (isBlank(name)) {
                return R.error(PROJECT_NAME_NOT_EXISTS_STATUS, PROJECT_NAME_NOT_EXISTS_MSG);
            }
            if (apiPassword == null || isBlank(apiPassword)) {
                return R.error(PROJECT_API_PASSWORD_NOT_EXISTS_STATUS, PROJECT_API_PASSWORD_NOT_EXISTS_MSG);
            }
            Product product = productService.selectByPrimaryKey(productId);
            if (product == null) {
                return R.error(PRODUCT_NOT_EXISTS_STATUS, PRODUCT_NOT_EXISTS_MSG);
            }
            if (!productUserService.checkAuth(productId, user)) {
                return R.error(PRIV_MIS_STATUS, PRIV_MIS_MSG);
            }
            Project project = projectService.selectOneByExample(ProjectExample.newBuilder()
                            .build()
                            .createCriteria()
                            .andDeletedEqualTo(Deleted.OK.getValue())
                            // 工程名全局唯一
                            // .andProductIdEqualTo(productId)
                            .andNameEqualTo(name)
                            .toExample(),
                    MetaProject.COLUMN_NAME_ID
            );
            if (project != null) {
                return R.error(PROJECT_NAME_EXISTS_STATUS, PROJECT_NAME_EXISTS_MSG);
            }

            String pwd = Md5Util.md5(apiPassword);
            Project insert = new Project();
            insert.setUpdateTime(now);
            insert.setCreateTime(now);
            insert.setDeleted(Deleted.OK.getValue());
            insert.setName(name);
            insert.setMemo(req.getMemo());
            insert.setProjectType(projectType);
            insert.setMailReceiver(req.getMailReceiver());
            insert.setProductId(productId);
            insert.setApiPassword(pwd);
            insert.setApiToken(token);
            projectService.insertSelective(insert);
            id = insert.getId();

            // 保存token
            apiTokenService.save(token, id, name);

        }

        // 失效缓存
        rccCache.evictProject(cacheEvictProjectName, cacheEvictApiTokens);

        return R.ok(id);
    }

    /**
     * 重置工程的api密码
     *
     * @param resetApiPassword
     * @param loginUser
     * @param projectId
     * @return
     */
    @SaveLog(scene = "0010",
            paramsIdxes = {0},
            params = {"projectId"}
    )
    @PostMapping("/resetApiPassword/{projectId}")
    public R resetApiPassword(@PathVariable("projectId") Long projectId, @LoginUser User loginUser,
                              @RequestBody ResetApiPasswordVo resetApiPassword) {
        if (loginUser == null) {
            return R.error(NON_LOGIN_STATUS, NON_LOGIN_MSG);
        }
        Long productId = resetApiPassword.getId();
        String username = loginUser.getName();
        Date now = DateTimeUtils.now();
        if (null == projectId || projectId <= 0) {
            return R.error(PROJECT_ID_NOT_EXISTS_STATUS, PROJECT_ID_NOT_EXISTS_MSG);
        }
        Project project = projectService.selectByPrimaryKey(projectId);
        if (project == null || Deleted.DELETE.getValue().equals(project.getDeleted())) {
            return R.error(PROJECT_NOT_EXISTS_STATUS, PROJECT_NOT_EXISTS_MSG);
        }
        if (!productUserService.checkAuth(productId, loginUser)) {
            return R.error(PRIV_MIS_STATUS, PRIV_MIS_MSG);
        }
        String apiPassword = resetApiPassword.getApiPassword();
        if (StringUtils.isBlank(apiPassword)) {
            return R.error(PROJECT_API_PASSWORD_NOT_EXISTS_STATUS, PROJECT_API_PASSWORD_NOT_EXISTS_MSG);
        }
        try {
            String token = UUID.randomUUID().toString().replace("-", "");
            List<String> cacheEvictApiTokens = null;
            String cacheEvictProjectName = null;
            cacheEvictProjectName = project.getName();
            User user = userService.selectUserByName(username);
            if (user == null || Deleted.DELETE.getValue().equals(user.getStatus())) {
                return R.error(USER_NOT_EXISTS_STATUS, USER_NOT_EXISTS_MSG);
            }
            Project update = new Project();
            update.setId(projectId);
            update.setUpdateTime(now);
            update.setApiPassword(Md5Util.md5(resetApiPassword.getApiPassword()));
            update.setApiToken(token);
            projectService.updateByPrimaryKeySelective(update);
            cacheEvictApiTokens = new ArrayList<>();
            List<ApiToken> apiTokens = apiTokenService.selectByProjectId(
                    project.getId(),
                    MetaApiToken.COLUMN_NAME_ID,
                    MetaApiToken.COLUMN_NAME_TOKEN
            );
            apiTokenService.updateApiTokens(apiTokens, token, project.getName());
            for (ApiToken apiToken : apiTokens) {
                cacheEvictApiTokens.add(apiToken.getToken());
            }
            rccCache.evictProject(cacheEvictProjectName, cacheEvictApiTokens);
        } catch (Exception e) {
            return R.error();
        }
        return R.ok();
    }

    /**
     * 删除工程及相关的环境、版本、配置等
     *
     * @return
     */
    @SaveLog(scene = "0011",
            paramsIdxes = {0},
            params = {"projectId"})
    @PostMapping("delete/{projectId}")
    public R deleteProject(@PathVariable("projectId") Long projectId, @LoginUser User user) {
        if (user == null) {
            return R.error(NON_LOGIN_STATUS, NON_LOGIN_MSG);
        }
        if (null == projectId || projectId <= 0) {
            return R.error(PROJECT_ID_NOT_EXISTS_STATUS, PROJECT_ID_NOT_EXISTS_MSG);
        }
        Project project = projectService.selectByPrimaryKey(projectId);
        if (project == null || Deleted.DELETE.getValue().equals(project.getDeleted())) {
            return R.error(PROJECT_NOT_EXISTS_STATUS, PROJECT_NOT_EXISTS_MSG);
        }
        if (!productUserService.checkAuth(project.getProductId(), user)) {
            return R.error(PRIV_MIS_STATUS, PRIV_MIS_MSG);
        }

        // 级联删除工程及失效缓存
        int del = projectService.deleteCascadeById(projectId);
        return R.ok(del);
    }

    /**
     * 获取工程list
     *
     * @param productId
     * @return
     */
    @GetMapping("list")
    public R getProjectList(
            @RequestParam(value = "sortField", defaultValue = "id") String sortField,
            @RequestParam(value = "sortBy", defaultValue = "desc") String sortBy,
            @RequestParam("productId") Long productId,
            @RequestParam(value = "pageNo", defaultValue = "1") Integer pageNo,
            @RequestParam(value = "pageSize", defaultValue = "20") Integer pageSize,
            @LoginUser User user
    ) {
        if (null == productId || productId <= 0) {
            return R.error(PRODUCT_ID_EMPTY_STATUS, PRODUCT_ID_EMPTY_MSG);
        }
        if (!SqlUtils.isValid(sortBy)) {
            return R.error(PARAM_ERROR_STATUS, PARAM_ERROR_MSG);
        }
        int offset = (pageNo - 1) * pageSize;
        Map<Long, Boolean> adminProjectMap = new HashMap<>();
        boolean canManage = productUserService.checkAuth(productId, user);
        Set<Long> projectIds = new HashSet<>();
        if (!canManage) {
            List<ProjectUser> projectUsers = projectUserService.selectByExample(ProjectUserExample.newBuilder()
                            .distinct(true)
                            .build()
                            .createCriteria()
                            .andUserIdEqualTo(user.getId())
                            .andProductIdEqualTo(productId)
                            .toExample(),
                    MetaProjectUser.COLUMN_NAME_PROJECTID,
                    MetaProjectUser.COLUMN_NAME_ISADMIN);
            if (!CollectionUtils.isEmpty(projectUsers)) {
                for (ProjectUser projectUser : projectUsers) {
                    if (ProjectUserAdmin.YES.getValue().equals(projectUser.getIsAdmin())) {
                        adminProjectMap.put(projectUser.getProjectId(), Boolean.TRUE);
                    }
                    projectIds.add(projectUser.getProjectId());
                }
            }

            List<EnvironmentUser> environmentUsers =
                    environmentUserService.selectByExample(EnvironmentUserExample.newBuilder()
                                    .distinct(true)
                                    .build()
                                    .createCriteria()
                                    .andUserIdEqualTo(user.getId())
                                    .andProductIdEqualTo(productId)
                                    .toExample(),
                            MetaEnvironmentUser.COLUMN_NAME_PROJECTID
                    );
            if (!CollectionUtils.isEmpty(environmentUsers)) {
                for (EnvironmentUser environmentUser : environmentUsers) {
                    projectIds.add(environmentUser.getProjectId());
                }
            }
        }

        Pagination<ProjectListVo> pagination = projectService.pagination(ProjectExample.newBuilder()
                        .orderByClause(MetaProject.getSafeColumnNameByField(sortField) + " " + sortBy,
                                isNotBlank(sortField))
                        .start(offset)
                        .limit(pageSize)
                        .build()
                        .createCriteria()
                        .andProductIdEqualTo(productId)
                        .andDeletedEqualTo(Deleted.OK.getValue())
                        .andIdIn(projectIds, !canManage)
                        .toExample(),
                item -> {
                    ProjectListVo projectListVo = new ProjectListVo().copyFrom(item);
                    boolean isAdmin = adminProjectMap.containsKey(item.getId());
                    projectListVo.setAdmin(isAdmin ? Boolean.TRUE : canManage);
                    projectListVo.setMembers(projectUserService.selectUsersByProjectIdAndType(item.getId(),
                            ProjectUserAdmin.NO.getValue()));
                    projectListVo.setManagers(projectUserService.selectUsersByProjectIdAndType(item.getId(),
                            ProjectUserAdmin.YES.getValue()));
                    return projectListVo;
                }
        );

        Map<String, Object> ext = new HashMap<>();
        ext.put("canManage", canManage);
        return R.ok(pagination, ext);
    }

    /**
     * add project dependency
     *
     * @param refProjectDto
     * @param user
     * @param projectId
     * @return
     */
    @SaveLog(scene = "0012",
            paramsIdxes = {0, 1},
            params = {"projectId", "refProjectDto"})
    @PostMapping(value = "/{projectId}/ref")
    public R addRef(@PathVariable Long projectId, @RequestBody RefProjectDto refProjectDto, @LoginUser User user) {
        if (user == null) {
            return R.error(NON_LOGIN_STATUS, NON_LOGIN_MSG);
        }
        if (null == projectId || projectId <= 0) {
            return R.error(PROJECT_ID_NOT_EXISTS_STATUS, PROJECT_ID_NOT_EXISTS_MSG);
        }
        Project exists = projectService.selectByPrimaryKey(projectId);
        if (exists == null || Deleted.DELETE.getValue().equals(exists.getDeleted())) {
            return R.error(PROJECT_NOT_EXISTS_STATUS, PROJECT_NOT_EXISTS_MSG);
        }
        if (!productUserService.checkAuth(exists.getProductId(), user)) {
            return R.error(PRIV_MIS_STATUS, PRIV_MIS_MSG);
        }
        List<Long> refIdList = refProjectDto.getRefIds();
        if (CollectionUtils.isEmpty(refIdList)) {
            return R.error(PARAM_ERROR_STATUS, ErrorStatusMsg.PARAM_ERROR_MSG);
        }
        //提出掉当前工程自己id
        refIdList.remove(projectId);
        // 根据refIdList获取工程信息
        List<Project> projects = projectService.selectByPrimaryKeys(refIdList);
        String refIds = "";
        String refNames = "";
        for (Project project : projects) {
            refIds += project.getId() + ",";
            refNames += project.getName() + ",";
        }
        // 如果有依赖的工程，则去除最后的逗号
        if (StringUtils.isEmpty(refIds)) {
            return R.error(PROJECT_REF_ID_NOT_EXISTS_STATUS, PROJECT_REF_ID_NOT_EXISTS_MSG);
        }
        refIds = refIds.substring(0, refIds.length() - 1);
        refNames = refNames.substring(0, refNames.length() - 1);
        int cnt = projectService.updateByPrimaryKeySelective(Project.newBuilder()
                .updateTime(new Date())
                .dependencyIds(refIds)
                .dependencyNames(refNames)
                .id(projectId)
                .build());
        return R.ok(cnt);
    }

    /**
     * 添加工程成员
     *
     * @param productId
     * @param projectId
     * @param projectUserDto
     * @param user
     * @return
     */
    @SaveLog(scene = "0013",
            paramsIdxes = {0, 1, 2},
            params = {"productId", "projectId", "projectUserDto"})
    @PostMapping("addMember/{productId}/{projectId}")
    public R addMember(@PathVariable Long productId,
                       @PathVariable Long projectId,
                       @RequestBody ProjectUserDto projectUserDto,
                       @LoginUser User user) {
        if (user == null) {
            return R.error(NON_LOGIN_STATUS, NON_LOGIN_MSG);
        }
        // 更新rcc_user表
        List<String> members = projectUserDto.getMemberNameList();
        if (CollectionUtils.isEmpty(members)) {
            return R.ok();
        }
        if (!projectUserService.checkAuth(productId, projectId, user)) {
            return R.error(PRIV_MIS_STATUS, PRIV_MIS_MSG);
        }
        Map<String, User> userNameMap = new HashMap<>();
        List<Long> userIdList = new ArrayList<>();
        Byte isAdmin = projectUserDto.getIsAdmin() == null ? (byte) 0 : projectUserDto.getIsAdmin();
        Byte role = (isAdmin == 0) ? UserRole.NORMAL.getValue() : UserRole.PROJECT.getValue();
        for (String name : members) {
            name = trim(name);
            User userTemp = userService.addUserIfNotExist(name, role, defaultUserType);
            userNameMap.put(name, userTemp);
            userIdList.add(userTemp.getId());
        }
        Date curTime = new Date();

        // 工程和user的关系表都要存储
        for (String name : members) {
            name = trim(name);
            // 更新project_user表
            ProjectUser projectUser = projectUserService.selectByUserIdAndProjectId(
                    userNameMap.get(name).getId(),
                    projectId,
                    productId
            );
            if (projectUser == null) {
                projectUserService.insertSelective(ProjectUser.newBuilder()
                        .userName(name)
                        .productId(productId)
                        .projectId(projectId)
                        .userId(userNameMap.get(name).getId())
                        .isAdmin(isAdmin == 1 ? Constants.IS_ADMIN : Constants.IS_MEMBER)
                        .updateTime(curTime)
                        .createTime(curTime)
                        .build()
                );
            } else {
                projectUser.setUpdateTime(curTime);
                projectUser.setIsAdmin(Constants.IS_MEMBER);
                if (isAdmin == 1) {
                    projectUser.setIsAdmin(Constants.IS_ADMIN);
                }
                projectUserService.updateByPrimaryKeySelective(
                        projectUser
                );
            }
        }
        if (isAdmin == 0) {
            // 更新env_user表
            for (String name : members) {
                name = trim(name);
                // 先删除
                envUserService.deleteByExample(EnvironmentUserExample.newBuilder()
                        .build()
                        .createCriteria()
                        .andProductIdEqualTo(productId)
                        .andProjectIdEqualTo(projectId)
                        .andUserIdEqualTo(userNameMap.get(name).getId())
                        .toExample()
                );
                // 再插入
                List<EnvPriDto> envPriDtos = projectUserDto.getEnvPriDtoList();
                if (!CollectionUtils.isEmpty(envPriDtos)) {
                    for (EnvPriDto envPriDto : envPriDtos) {
                        if (!EnvironmentUserPriType.READ.getValue().equals(envPriDto.getPriType())
                                && !EnvironmentUserPriType.WRITE.getValue().equals(envPriDto.getPriType())
                        ) {
                            continue;
                        }
                        envUserService.insertSelective(EnvironmentUser.newBuilder()
                                .productId(productId)
                                .projectId(projectId)
                                .environmentId(envPriDto.getEnvId())
                                .userId(userNameMap.get(name).getId())
                                .userName(name)
                                .priType(envPriDto.getPriType())
                                .updateTime(curTime)
                                .createTime(curTime)
                                .build());
                    }
                }
            }
        }
        return R.ok();
    }

    /**
     * 删除工程成员
     *
     * @param productId
     * @param projectId
     * @param userIds
     * @param user
     * @return
     */
    @SaveLog(scene = "0014",
            paramsIdxes = {0, 1, 2},
            params = {"productId", "projectId", "userIds"})
    @Transactional
    @PostMapping("delMember/{productId}/{projectId}")
    public R delMember(@PathVariable Long productId,
                       @PathVariable Long projectId,
                       @RequestBody List<Long> userIds,
                       @LoginUser User user) {
        if (user == null) {
            return R.error(NON_LOGIN_STATUS, NON_LOGIN_MSG);
        }
        if (CollectionUtils.isEmpty(userIds)) {
            return R.error(USERID_NOT_EXISTS_STATUS, USERID_NOT_EXISTS_MSG);
        }
        if (!projectUserService.checkAuth(productId, projectId, user)) {
            return R.error(PRIV_MIS_STATUS, PRIV_MIS_MSG);
        }
        // 删除环境关系表
        envUserService.deleteByExample(
                EnvironmentUserExample.newBuilder()
                        .build()
                        .createCriteria()
                        .andUserIdIn(userIds)
                        .andProjectIdEqualTo(projectId)
                        .andProductIdEqualTo(productId)
                        .toExample()
        );
        // 删除projectuser表
        projectUserService.deleteByUserIds(productId, projectId, userIds);
        return R.ok();
    }

    /**
     * 获取成员列表
     *
     * @param projectId
     * @return
     */
    @GetMapping("getMemberList")
    public R getMemberList(@RequestParam("projectId") Long projectId) {
        if (projectId == null || projectId <= 0) {
            return R.error(PROJECT_ID_NOT_EXISTS_STATUS, PROJECT_ID_NOT_EXISTS_MSG);
        }
        List<ProjectUser> projectUsers = projectUserService.selectByExample(ProjectUserExample.newBuilder()
                .limit(10000)
                .build()
                .createCriteria()
                .andProjectIdEqualTo(projectId)
                .toExample()
        );
        return R.ok(projectUsers);
    }
}
