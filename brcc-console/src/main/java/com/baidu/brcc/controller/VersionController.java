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

import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.NON_LOGIN_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.NON_LOGIN_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PRIV_MIS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PRIV_MIS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_CHANGE_LOG_END_TIME_EMPTY_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_CHANGE_LOG_END_TIME_EMPTY_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_CHANGE_LOG_START_TIME_EMPTY_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_CHANGE_LOG_START_TIME_EMPTY_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_COPY_DEST_VERSION_ID_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_COPY_DEST_VERSION_ID_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_COPY_SRC_DEST_VERSION_ID_DUPLICATE_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_COPY_SRC_DEST_VERSION_ID_DUPLICATE_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_COPY_SRC_VERSION_ID_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_COPY_SRC_VERSION_ID_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_DEST_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_DEST_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_ID_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_ID_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_SRC_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_SRC_NOT_EXISTS_STATUS;
import static com.baidu.brcc.service.ConfigGroupService.ENVIRONMENT;
import static com.baidu.brcc.service.ConfigGroupService.PRODUCT;
import static com.baidu.brcc.service.ConfigGroupService.PROJECT;
import static com.baidu.brcc.service.ConfigGroupService.VERSION;
import static com.baidu.brcc.utils.collections.CollectionUtils.toMap;
import static com.baidu.brcc.utils.collections.CollectionUtils.toMapList;
import static org.apache.commons.lang3.StringUtils.isNotBlank;
import static org.apache.commons.lang3.StringUtils.trim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baidu.brcc.annotation.LoginUser;
import com.baidu.brcc.annotation.SaveLog;
import com.baidu.brcc.domain.ConfigChangeLogExample;
import com.baidu.brcc.domain.ConfigChangeLogWithBLOBs;
import com.baidu.brcc.domain.ConfigItem;
import com.baidu.brcc.domain.ConfigItemExample;
import com.baidu.brcc.domain.Environment;
import com.baidu.brcc.domain.TreeNode;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.Version;
import com.baidu.brcc.domain.VersionExample;
import com.baidu.brcc.domain.base.Pagination;
import com.baidu.brcc.domain.base.R;
import com.baidu.brcc.domain.em.Deleted;
import com.baidu.brcc.domain.exception.BizException;
import com.baidu.brcc.domain.meta.MetaVersion;
import com.baidu.brcc.domain.vo.ApiVersionVo;
import com.baidu.brcc.domain.vo.VersionNodeVo;
import com.baidu.brcc.domain.vo.VersionReq;
import com.baidu.brcc.domain.vo.VersionVo;
import com.baidu.brcc.dto.CopyVersionDto;
import com.baidu.brcc.service.ConfigChangeLogService;
import com.baidu.brcc.service.ConfigItemService;
import com.baidu.brcc.service.EnvironmentService;
import com.baidu.brcc.service.EnvironmentUserService;
import com.baidu.brcc.service.ProjectUserService;
import com.baidu.brcc.service.RccCache;
import com.baidu.brcc.service.VersionService;

/**
 * 管理端版本相关接口
 */
@RestController
@RequestMapping("version")
public class VersionController {

    @Autowired
    private VersionService versionService;

    @Autowired
    private EnvironmentService environmentService;

    @Autowired
    private EnvironmentUserService environmentUserService;

    @Autowired
    private ProjectUserService projectUserService;

    @Autowired
    private ConfigChangeLogService configChangeLogService;

    @Autowired
    private RccCache rccCache;

    @Autowired
    private ConfigItemService configItemService;

    /**
     * 新增或修改版本
     *
     * @param req  req.id > 0 表示修改， 否则新增
     * @param user
     *
     * @return
     */
    @SaveLog(scene = "修改版本",
            paramsIdxes = {0},
            params = {"req"})
    @PostMapping("save")
    public R<Long> saveVersion(@RequestBody VersionReq req, @LoginUser User user) {
        if (user == null) {
            return R.error(NON_LOGIN_STATUS, NON_LOGIN_MSG);
        }
        Long id = req.getId();
        String name = trim(req.getName());
        String memo = trim(req.getMemo());
        Long cacheEvictEnvironmentId = null;

        if (id != null && id > 0) {
            Version version = versionService.selectByPrimaryKey(id);
            if (version == null || Deleted.DELETE.getValue().equals(version.getDeleted())) {
                throw new BizException(VERSION_NOT_EXISTS_STATUS, VERSION_NOT_EXISTS_MSG);
            }
            // 修改
            versionService.updateVersion(version, name, memo, user);
            cacheEvictEnvironmentId = version.getEnvironmentId();
        } else {
            // 新增
            Long environmentId = req.getEnvironmentId();
            id = versionService.saveVersion(environmentId, name, memo, user);
            cacheEvictEnvironmentId = environmentId;
        }
        // 失效缓存
        rccCache.evictVersion(cacheEvictEnvironmentId);
        return R.ok(id);
    }

    /**
     * 删除版本
     *
     * @param versionId
     * @param user
     *
     * @return
     */
    @SaveLog(scene = "删除版本",
            paramsIdxes = {0},
            params = {"versionId"})
    @PostMapping("delete/{versionId}")
    public R deleteVersion(@PathVariable("versionId") Long versionId, @LoginUser User user) {
        if (user == null) {
            return R.error(NON_LOGIN_STATUS, NON_LOGIN_MSG);
        }
        if (null == versionId || versionId <= 0) {
            return R.error(VERSION_ID_NOT_EXISTS_STATUS, VERSION_ID_NOT_EXISTS_MSG);
        }
        Version version = versionService.selectByPrimaryKey(versionId);
        if (version == null || Deleted.DELETE.getValue().equals(version.getDeleted())) {
            return R.error(VERSION_NOT_EXISTS_STATUS, VERSION_NOT_EXISTS_MSG);
        }
        if (!projectUserService.checkAuth(version.getProductId(), version.getProjectId(), user)) {
            return R.error(PRIV_MIS_STATUS, PRIV_MIS_MSG);
        }

        // 删除版本及失效缓存
        int del = versionService.deleteCascadeByVersionId(versionId);

        // 失效id->version的缓存
        rccCache.evictVersionById(Arrays.asList(versionId));
        return R.ok(del);
    }

    @GetMapping("list")
    public R<Pagination<VersionVo>> pagination(
            @RequestParam(value = "sortField", defaultValue = "id") String sortField,
            @RequestParam(value = "sortBy", defaultValue = "desc") String sortBy,
            @RequestParam("environmentId") Long environmentId,
            @RequestParam(value = "pageNo", defaultValue = "1") Integer pageNo,
            @RequestParam(value = "pageSize", defaultValue = "20") Integer pageSize,
            @LoginUser User user
    ) {
        if (user == null) {
            return R.error(NON_LOGIN_STATUS, NON_LOGIN_MSG);
        }
        if (null == environmentId || environmentId <= 0) {
            return R.error(VERSION_ID_NOT_EXISTS_STATUS, VERSION_ID_NOT_EXISTS_MSG);
        }
        Environment environment = environmentService.selectByPrimaryKey(environmentId);
        if (environment == null || Deleted.DELETE.getValue().equals(environment.getDeleted())) {
            return R.error(ENVIRONMENT_NOT_EXISTS_STATUS, ENVIRONMENT_NOT_EXISTS_MSG);
        }
        int offset = (pageNo - 1) * pageSize;
        Pagination<VersionVo> pagination = versionService.pagination(VersionExample.newBuilder()
                        .orderByClause(MetaVersion.getSafeColumnNameByField(sortField) + " " + sortBy,
                                isNotBlank(sortField))
                        .start(offset)
                        .limit(pageSize)
                        .build()
                        .createCriteria()
                        .andEnvironmentIdEqualTo(environmentId)
                        .andDeletedEqualTo(Deleted.OK.getValue())
                        .toExample(),
                item -> {
                    VersionVo versionVo = new VersionVo();
                    versionVo.setId(item.getId());
                    versionVo.setName(item.getName());
                    versionVo.setMemo(item.getMemo());
                    versionVo.setEnvironmentId(item.getEnvironmentId());
                    return versionVo;
                }
        );

        // 权限
        Map<String, Object> ext = new HashMap<>();
        boolean canManage = projectUserService.checkAuth(environment.getProductId(), environment.getProjectId(), user);
        ext.put("canManage", canManage);

        return R.ok(pagination, ext);
    }

    // 我的可操作版本
    @GetMapping("myVersions")
    public R<List<VersionNodeVo>> myVersion(
            @LoginUser User user,
            @RequestParam(name = "productId", defaultValue = "0", required = false) Long productId,
            @RequestParam(name = "projectId", defaultValue = "0", required = false) Long projectId
    ) {
        return R.ok(versionService.myAllVersion(user, productId, projectId));
    }

    // 我的可操作版本
    @GetMapping("myVersionTree")
    public R<List<TreeNode>> myVersionTree(
            @LoginUser User user,
            @RequestParam(name = "productId", defaultValue = "0", required = false) Long productId,
            @RequestParam(name = "projectId", defaultValue = "0", required = false) Long projectId
    ) {
        List<TreeNode> treeNodes = new ArrayList<>();
        List<VersionNodeVo> versionNodeVos = versionService.myAllVersion(user, productId, projectId);
        if (CollectionUtils.isEmpty(versionNodeVos)) {
            return R.ok(new ArrayList<>(0));
        }

        Map<Long, String> productNameMap = toMap(versionNodeVos,
                VersionNodeVo :: getProductId, VersionNodeVo :: getProductName);
        Map<Long, TreeNode> productTreeNodeMap = new HashMap<>();
        if (!CollectionUtils.isEmpty(productNameMap)) {
            for (Map.Entry<Long, String> entry : productNameMap.entrySet()) {
                TreeNode treeNode = new TreeNode();
                treeNode.setId(entry.getKey());
                treeNode.setName(entry.getValue());
                treeNode.setType(PRODUCT);
                treeNodes.add(treeNode);
                productTreeNodeMap.put(entry.getKey(), treeNode);
            }
        }

        Map<Long, List<VersionNodeVo>> projectListMap = toMapList(versionNodeVos, VersionNodeVo :: getProjectId);
        Map<Long, TreeNode> projectTreeNodeMap = new HashMap<>();
        if (!CollectionUtils.isEmpty(projectListMap)) {
            for (List<VersionNodeVo> ps : projectListMap.values()) {
                if (!CollectionUtils.isEmpty(ps)) {
                    VersionNodeVo vo = ps.get(0);
                    Long id = vo.getProjectId();
                    String name = vo.getProjectName();
                    Long pid = vo.getProductId();
                    TreeNode treeNode = new TreeNode();
                    treeNode.setId(id);
                    treeNode.setName(name);
                    treeNode.setType(PROJECT);
                    projectTreeNodeMap.put(id, treeNode);

                    TreeNode pnode = productTreeNodeMap.get(pid);
                    if (pnode == null) {
                        continue;
                    }
                    if (pnode.getChildren() == null) {
                        pnode.setChildren(new ArrayList<>());
                        pnode.setHasChildren(true);
                    }
                    pnode.getChildren().add(treeNode);
                }
            }
        }

        Map<Long, List<VersionNodeVo>> envListMap = toMapList(versionNodeVos, VersionNodeVo :: getEnvironmentId);
        Map<Long, TreeNode> envTreeNodeMap = new HashMap<>();
        if (!CollectionUtils.isEmpty(envListMap)) {
            for (List<VersionNodeVo> es : envListMap.values()) {
                if (!CollectionUtils.isEmpty(es)) {
                    VersionNodeVo vo = es.get(0);
                    Long id = vo.getEnvironmentId();
                    String name = vo.getEnvironmentName();
                    Long pid = vo.getProjectId();
                    TreeNode treeNode = new TreeNode();
                    treeNode.setId(id);
                    treeNode.setName(name);
                    treeNode.setType(ENVIRONMENT);
                    envTreeNodeMap.put(id, treeNode);

                    TreeNode pnode = projectTreeNodeMap.get(pid);
                    if (pnode == null) {
                        continue;
                    }
                    if (pnode.getChildren() == null) {
                        pnode.setChildren(new ArrayList<>());
                        pnode.setHasChildren(true);
                    }
                    pnode.getChildren().add(treeNode);
                }
            }
        }

        Map<Long, List<VersionNodeVo>> versionListMap = toMapList(versionNodeVos, VersionNodeVo :: getVersionId);
        if (!CollectionUtils.isEmpty(versionListMap)) {
            for (List<VersionNodeVo> vs : versionListMap.values()) {
                if (!CollectionUtils.isEmpty(vs)) {
                    VersionNodeVo vo = vs.get(0);
                    Long id = vo.getVersionId();
                    String name = vo.getVersionName();
                    Long pid = vo.getEnvironmentId();
                    TreeNode treeNode = new TreeNode();
                    treeNode.setId(id);
                    treeNode.setName(name);
                    treeNode.setType(VERSION);

                    TreeNode pnode = envTreeNodeMap.get(pid);
                    if (pnode == null) {
                        continue;
                    }
                    if (pnode.getChildren() == null) {
                        pnode.setChildren(new ArrayList<>());
                        pnode.setHasChildren(true);
                    }
                    pnode.getChildren().add(treeNode);
                }
            }
        }

        return R.ok(treeNodes);
    }

    /**
     * 推送变更，修改checkSum
     *
     * @param versionId
     * @param user
     *
     * @return
     */
    @SaveLog(scene = "推送变更",
            paramsIdxes = {0},
            params = {"versionId"})
    @PostMapping("pushChange/{versionId}")
    public R pushChange(@PathVariable("versionId") Long versionId, @LoginUser User user) {
        Version version = versionService.selectByPrimaryKey(versionId);
        if (version == null || Deleted.DELETE.getValue().equals(version.getDeleted())) {
            return R.error(VERSION_NOT_EXISTS_STATUS, VERSION_NOT_EXISTS_MSG);
        }
        if (!environmentUserService.checkAuth(version.getProductId(), version.getProjectId(),
                version.getEnvironmentId(), user)) {
            return R.error(PRIV_MIS_STATUS, PRIV_MIS_MSG);
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

    /**
     * 查询配置变更记录
     *
     * @param versionId
     * @param startDate
     * @param endDate
     * @param pageNo
     * @param pageSize
     * @param user
     *
     * @return
     */
    @GetMapping("{versionId}/getChangeLogs")
    public R<Pagination<ConfigChangeLogWithBLOBs>> getChangeLogs(
            @PathVariable("versionId") Long versionId,
            @RequestParam(name = "startDate", required = false) Long startDate,
            @RequestParam(name = "endDate", required = false) Long endDate,
            @RequestParam(value = "pageNo", defaultValue = "1") Integer pageNo,
            @RequestParam(value = "pageSize", defaultValue = "20")
                    Integer pageSize,
            @LoginUser User user
    ) {
        if (startDate == null || startDate < 0) {
            return R.error(VERSION_CHANGE_LOG_START_TIME_EMPTY_STATUS, VERSION_CHANGE_LOG_START_TIME_EMPTY_MSG);
        }
        if (endDate == null || endDate < 0) {
            return R.error(VERSION_CHANGE_LOG_END_TIME_EMPTY_STATUS, VERSION_CHANGE_LOG_END_TIME_EMPTY_MSG);
        }
        Version version = versionService.selectByPrimaryKey(versionId);
        if (version == null || Deleted.DELETE.getValue().equals(version.getDeleted())) {
            return R.error(VERSION_NOT_EXISTS_STATUS, VERSION_NOT_EXISTS_MSG);
        }
        if (!environmentUserService.checkAuth(version.getProductId(), version.getProjectId(),
                version.getEnvironmentId(), user)) {
            return R.error(PRIV_MIS_STATUS, PRIV_MIS_MSG);
        }
        pageSize = pageSize <= 0 ? 20 : pageSize;
        int offset = (pageNo - 1) * pageSize;
        Pagination<ConfigChangeLogWithBLOBs> logs =
                configChangeLogService.pagination(ConfigChangeLogExample.newBuilder()
                        .orderByClause("id desc")
                        .start(offset)
                        .limit(pageSize)
                        .build()
                        .createCriteria()
                        .andVersionIdEqualTo(versionId)
                        .andCreateTimeGreaterThanOrEqualTo(new Date(startDate))
                        .andCreateTimeLessThanOrEqualTo(new Date(endDate))
                        .toExample());

        return R.ok(logs);

    }

    /**
     * 版本复制
     *
     * @param copyVersionDto
     * @param user
     *
     * @return
     */
    @RequestMapping(value = "/copy", method = RequestMethod.POST)
    public R<List<ConfigItem>> copyConfigItemsByVersionId(@RequestBody CopyVersionDto copyVersionDto,
                                                          @LoginUser User user) {
        Long srcVersionId = copyVersionDto.getSrcVersionId();
        Long destVersionId = copyVersionDto.getDestVersionId();

        if (srcVersionId == null || srcVersionId <= 0) {
            return R.error(VERSION_COPY_SRC_VERSION_ID_NOT_EXISTS_STATUS, VERSION_COPY_SRC_VERSION_ID_NOT_EXISTS_MSG);
        }

        if (destVersionId == null || destVersionId <= 0) {
            return R.error(VERSION_COPY_DEST_VERSION_ID_NOT_EXISTS_STATUS, VERSION_COPY_DEST_VERSION_ID_NOT_EXISTS_MSG);
        }

        if (srcVersionId.equals(destVersionId)) {
            return R.error(VERSION_COPY_SRC_DEST_VERSION_ID_DUPLICATE_STATUS,
                    VERSION_COPY_SRC_DEST_VERSION_ID_DUPLICATE_MSG);
        }

        Map<Long, Version> map =
                versionService.selectMapByPrimaryKeys(Arrays.asList(srcVersionId, destVersionId), Version :: getId);

        if (map == null || map.get(srcVersionId) == null) {
            return R.error(VERSION_SRC_NOT_EXISTS_STATUS, VERSION_SRC_NOT_EXISTS_MSG);
        }

        if (map == null || map.get(destVersionId) == null) {
            return R.error(VERSION_DEST_NOT_EXISTS_STATUS, VERSION_DEST_NOT_EXISTS_MSG);
        }

        if (!versionService.checkAuth(user, srcVersionId, destVersionId)) {
            return R.error(PRIV_MIS_STATUS, PRIV_MIS_MSG);
        }

        // 从一个version复制所有的配置项到另一个存在的version里
        versionService.copyConfigItemsFromVersion(srcVersionId, destVersionId);

        rccCache.deleteVersionCascade(map.get(destVersionId));
        rccCache.loadVersion(new ApiVersionVo().copyFrom(map.get(destVersionId)));
        // 失效id->version的缓存
        rccCache.evictVersionById(Arrays.asList(destVersionId));

        List<ConfigItem> configItemList = configItemService.selectByExample(ConfigItemExample.newBuilder()
                .build()
                .createCriteria()
                .andVersionIdEqualTo(destVersionId)
                .andDeletedEqualTo(Deleted.OK.getValue())
                .toExample());

        return R.ok(configItemList);
    }

}
