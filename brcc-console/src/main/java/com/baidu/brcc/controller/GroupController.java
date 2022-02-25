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
import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_ID_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_ID_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_NAME_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_NAME_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.ID_NULL_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.ID_NULL_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.NAME_NULL_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.NAME_NULL_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.NON_LOGIN_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.NON_LOGIN_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PARAM_ERROR_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PARAM_ERROR_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PRIV_MIS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PRIV_MIS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.TYPE_NULL_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.TYPE_NULL_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_ID_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_ID_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_NOT_EXISTS_STATUS;
import static org.apache.commons.lang3.StringUtils.isNotBlank;
import static org.apache.commons.lang3.StringUtils.trim;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.baidu.brcc.domain.Project;
import com.baidu.brcc.domain.em.SortType;
import com.baidu.brcc.domain.vo.FindTreeInfoReq;
import com.baidu.brcc.domain.vo.FindTreeInfoVo;
import com.baidu.brcc.service.ProjectService;
import com.baidu.brcc.utils.Name.NameUtils;
import com.baidu.brcc.utils.SqlUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baidu.brcc.annotation.LoginUser;
import com.baidu.brcc.annotation.SaveLog;
import com.baidu.brcc.domain.ConfigGroup;
import com.baidu.brcc.domain.ConfigGroupExample;
import com.baidu.brcc.domain.TreeNode;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.Version;
import com.baidu.brcc.domain.base.Pagination;
import com.baidu.brcc.domain.base.R;
import com.baidu.brcc.domain.em.Deleted;
import com.baidu.brcc.domain.meta.MetaConfigGroup;
import com.baidu.brcc.domain.vo.ConfigGroupReq;
import com.baidu.brcc.domain.vo.ConfigGroupVo;
import com.baidu.brcc.service.ConfigGroupService;
import com.baidu.brcc.service.EnvironmentUserService;
import com.baidu.brcc.service.VersionService;
import com.baidu.brcc.utils.time.DateTimeUtils;

/**
 * 管理端分组相关接口
 */
@RestController
@RequestMapping(path = {"console/group", "group"})
public class GroupController {

    @Autowired
    private ConfigGroupService groupService;

    @Autowired
    private EnvironmentUserService environmentUserService;

    @Autowired
    VersionService versionService;

    @Autowired
    ProjectService projectService;

    /**
     * 新增或修改分组
     *
     * @param req  req.id > 0 表示修改，否则新增
     * @param user
     * @return
     */
    @SaveLog(scene = "0005",
            paramsIdxes = {0},
            params = {"req"})
    @PostMapping("save")
    public R<Long> saveGroup(@RequestBody ConfigGroupReq req, @LoginUser User user) {
        if (user == null) {
            return R.error(NON_LOGIN_STATUS, NON_LOGIN_MSG);
        }
        Long id = req.getId();
        String name = trim(req.getName());
        if (NameUtils.containsChinese(name)) {
            return R.error(CHINESE_NOT_ALLOWED_STATUS, CHINESE_NOT_ALLOWED_MSG);
        }
        Date now = DateTimeUtils.now();
        if (id != null && id > 0) {
            // 修改
            ConfigGroup configGroup = groupService.selectByPrimaryKey(id);
            if (configGroup == null || Deleted.DELETE.getValue().equals(configGroup.getDeleted())) {
                return R.error(GROUP_NOT_EXISTS_STATUS, GROUP_NOT_EXISTS_MSG);
            }
            if (!environmentUserService.checkAuth(configGroup.getProductId(), configGroup.getProjectId(),
                    configGroup.getEnvironmentId(), user)) {
                return R.error(PRIV_MIS_STATUS, PRIV_MIS_MSG);
            }
            ConfigGroup update = new ConfigGroup();
            update.setId(id);
            update.setUpdateTime(now);
            if (StringUtils.isNotBlank(name)) {
                ConfigGroup exists = groupService.selectOneByExample(ConfigGroupExample.newBuilder()
                                .build()
                                .createCriteria()
                                .andIdNotEqualTo(id)
                                .andNameEqualTo(name)
                                .andVersionIdEqualTo(configGroup.getVersionId())
                                .andDeletedEqualTo(Deleted.OK.getValue())
                                .toExample(),
                        MetaConfigGroup.COLUMN_NAME_ID
                );
                if (exists != null) {
                    return R.error(GROUP_EXISTS_STATUS, GROUP_EXISTS_MSG);
                }
                update.setName(name);
            }
            update.setMemo(req.getMemo());
            groupService.updateByPrimaryKeySelective(update);
        } else {
            // 新增
            Long versionId = req.getVersionId();
            if (null == versionId || versionId <= 0) {
                return R.error(VERSION_ID_NOT_EXISTS_STATUS, VERSION_ID_NOT_EXISTS_MSG);
            }
            if (StringUtils.isBlank(name)) {
                return R.error(GROUP_NAME_NOT_EXISTS_STATUS, GROUP_NAME_NOT_EXISTS_MSG);
            }
            Version version = versionService.selectByPrimaryKey(versionId);
            if (version == null || Deleted.DELETE.getValue().equals(version.getDeleted())) {
                return R.error(VERSION_NOT_EXISTS_STATUS, VERSION_NOT_EXISTS_MSG);
            }
            if (!environmentUserService.checkAuth(version.getProductId(), version.getProjectId(),
                    version.getEnvironmentId(), user)) {
                return R.error(PRIV_MIS_STATUS, PRIV_MIS_MSG);
            }
            ConfigGroup configGroup = groupService.selectOneByExample(ConfigGroupExample.newBuilder()
                            .build()
                            .createCriteria()
                            .andDeletedEqualTo(Deleted.OK.getValue())
                            .andVersionIdEqualTo(versionId)
                            .andNameEqualTo(name)
                            .toExample(),
                    MetaConfigGroup.COLUMN_NAME_ID
            );
            if (configGroup != null) {
                return R.error(GROUP_EXISTS_STATUS, GROUP_EXISTS_MSG);
            }
            ConfigGroup insert = new ConfigGroup();
            insert.setUpdateTime(now);
            insert.setCreateTime(now);
            insert.setDeleted(Deleted.OK.getValue());
            insert.setName(name);
            insert.setMemo(req.getMemo());
            insert.setVersionId(versionId);
            insert.setEnvironmentId(version.getEnvironmentId());
            insert.setProjectId(version.getProjectId());
            insert.setProductId(version.getProductId());
            groupService.insertSelective(insert);
            id = insert.getId();
        }
        return R.ok(id);
    }

    /**
     * 删除分组
     *
     * @param groupId
     * @param user
     * @return
     */
    @SaveLog(scene = "0006",
            paramsIdxes = {0},
            params = {"groupId"})
    @PostMapping("delete/{groupId}")
    public R<Integer> deleteGroup(@PathVariable("groupId") Long groupId, @LoginUser User user) {
        if (user == null) {
            return R.error(NON_LOGIN_STATUS, NON_LOGIN_MSG);
        }
        if (null == groupId || groupId <= 0) {
            return R.error(GROUP_ID_NOT_EXISTS_STATUS, GROUP_ID_NOT_EXISTS_MSG);
        }
        ConfigGroup configGroup = groupService.selectByPrimaryKey(groupId);
        if (configGroup == null || Deleted.DELETE.getValue().equals(configGroup.getDeleted())) {
            return R.error(GROUP_NOT_EXISTS_STATUS, GROUP_NOT_EXISTS_MSG);
        }
        if (!environmentUserService.checkAuth(configGroup.getProductId(), configGroup.getProjectId(),
                configGroup.getEnvironmentId(), user)) {
            return R.error(PRIV_MIS_STATUS, PRIV_MIS_MSG);
        }
        // 删除分组及失效缓存
        int del = groupService.deleteCascadeByGroupId(groupId);
        return R.ok(del);
    }

    /**
     * 根据版本ID分页查询分组
     *
     * @param sortField
     * @param sortBy
     * @param versionId
     * @param pageNo
     * @param pageSize
     * @param user
     * @return
     */
    @GetMapping("list")
    public R<Pagination<ConfigGroupVo>> pagination(
            @RequestParam(value = "sortField", defaultValue = "id") String sortField,
            @RequestParam(value = "sortBy", defaultValue = "desc") String sortBy,
            @RequestParam("versionId") Long versionId,
            @RequestParam(value = "pageNo", defaultValue = "1") Integer pageNo,
            @RequestParam(value = "pageSize", defaultValue = "20")
                    Integer pageSize,
            @LoginUser User user
    ) {
        if (null == versionId || versionId <= 0) {
            return R.error(VERSION_ID_NOT_EXISTS_STATUS, VERSION_ID_NOT_EXISTS_MSG);
        }
        Version version = versionService.selectByPrimaryKey(versionId);
        if (version == null || Deleted.DELETE.getValue().equals(version.getDeleted())) {
            return R.error(VERSION_NOT_EXISTS_STATUS, VERSION_NOT_EXISTS_MSG);
        }
        if (!SqlUtils.isValid(sortBy)) {
            return R.error(PARAM_ERROR_STATUS, PARAM_ERROR_MSG);
        }
        int offset = (pageNo - 1) * pageSize;
        Pagination<ConfigGroupVo> pagination = groupService.pagination(ConfigGroupExample.newBuilder()
                        .orderByClause(MetaConfigGroup.getSafeColumnNameByField(sortField) + " " + sortBy,
                                isNotBlank(sortField))
                        .start(offset)
                        .limit(pageSize)
                        .build()
                        .createCriteria()
                        .andVersionIdEqualTo(versionId)
                        .andDeletedEqualTo(Deleted.OK.getValue())
                        .toExample(),
                item -> {
                    ConfigGroupVo groupVo = new ConfigGroupVo();
                    groupVo.setId(item.getId());
                    groupVo.setName(item.getName());
                    groupVo.setMemo(item.getMemo());
                    groupVo.setVersionId(item.getVersionId());
                    return groupVo;
                }
        );

        // 权限
        Map<String, Object> ext = new HashMap<>();
        boolean canManage = environmentUserService.checkAuth(version.getProductId(), version.getProjectId(),
                version.getEnvironmentId(), user);
        ext.put("canManage", canManage);

        return R.ok(pagination, ext);
    }

    @GetMapping(value = "/treeDetail")
    public R<List<TreeNode>> findTreeInfo(@LoginUser User user) {
        return R.ok(groupService.findTreeInfo(user));
    }

    @PostMapping(value = "/findTreeInfo")
    public R<List<FindTreeInfoVo>> findTreeInfo(@RequestBody FindTreeInfoReq req, @LoginUser User user) {
        if (user == null) {
            return R.error(NON_LOGIN_STATUS, NON_LOGIN_MSG);
        }
        if (null == req.getType() || req.getType() < 0) {
            return R.error(TYPE_NULL_STATUS, TYPE_NULL_MSG);
        }
        if (null == req.getId() || req.getId() < 0) {
            return R.error(ID_NULL_STATUS, ID_NULL_MSG);
        }
        List<FindTreeInfoVo> res = groupService.loadTreeInfo(req.getId(), req.getType());
        return R.ok(res);
    }
}
