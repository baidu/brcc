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
import static com.baidu.brcc.common.ErrorStatusMsg.CONFIG_ITEM_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.CONFIG_ITEM_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.CONFIG_KEY_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.CONFIG_KEY_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.ENVIRONMENT_NOT_EXISTS_STATUS;

import static com.baidu.brcc.common.ErrorStatusMsg.FILE_IS_EMPTY_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.FILE_IS_EMPTY_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.GRAY_RULE_NOT_SET_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.GRAY_RULE_NOT_SET_STATUS;

import static com.baidu.brcc.common.ErrorStatusMsg.GRAY_VERSION_ID_NOT_EXIST_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.GRAY_VERSION_ID_NOT_EXIST_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.GRAY_VERSION_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.GRAY_VERSION_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_ID_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_ID_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.MAIN_VERSION_ID_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.MAIN_VERSION_ID_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.NON_LOGIN_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.NON_LOGIN_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PARAM_ERROR_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PARAM_ERROR_STATUS;
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

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;

import com.baidu.brcc.common.ErrorStatusMsg;
import com.baidu.brcc.domain.ConfigGroup;
import com.baidu.brcc.domain.GrayInfo;
import com.baidu.brcc.domain.GrayRule;
import com.baidu.brcc.domain.Project;
import com.baidu.brcc.domain.VersionExample;
import com.baidu.brcc.domain.em.FileFormat;
import com.baidu.brcc.domain.em.GrayFlag;
import com.baidu.brcc.domain.em.ProjectType;
import com.baidu.brcc.domain.meta.MetaConfigItem;
import com.baidu.brcc.domain.vo.ApiItemVo;
import com.baidu.brcc.domain.vo.BatchConfigItemReq;
import com.baidu.brcc.domain.vo.ConfigItemForGroupVo;
import com.baidu.brcc.domain.vo.GrayAddReq;
import com.baidu.brcc.domain.vo.GrayRuleReq;
import com.baidu.brcc.domain.vo.GrayRuleVo;
import com.baidu.brcc.domain.vo.GrayVersionRuleVo;
import com.baidu.brcc.domain.vo.ItemReq;
import com.baidu.brcc.dto.RefProjectDto;
import com.baidu.brcc.service.BrccInstanceService;
import com.baidu.brcc.service.ConfigGroupService;
import com.baidu.brcc.service.GrayInfoService;
import com.baidu.brcc.service.GrayRuleService;
import com.baidu.brcc.service.ProjectService;
import com.baidu.brcc.utils.DataTransUtils;
import com.baidu.brcc.utils.FileFormat.FileFormatUtils;
import com.baidu.brcc.utils.Name.NameUtils;
import com.baidu.brcc.utils.convert.ConvertFileUtil;
import com.google.common.base.Splitter;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.util.PropertiesUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
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
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

/**
 * 管理端版本相关接口
 */
@RestController
@RequestMapping("console/version")
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


    @Autowired
    private GrayRuleService grayRuleService;

    @Autowired
    private GrayInfoService grayInfoService;

    @Autowired
    private BrccInstanceService brccInstanceService;

    @Autowired
    private ConfigGroupService groupService;

    @Autowired
    private ProjectService projectService;

    /**
     * 新增或修改版本
     *
     * @param req  req.id > 0 表示修改， 否则新增
     * @param user
     * @return
     */
    @SaveLog(scene = "0015",
            paramsIdxes = {0},
            params = {"req"})
    @PostMapping("save")
    public R<Long> saveVersion(@RequestBody VersionReq req, @LoginUser User user) {
        if (user == null) {
            return R.error(NON_LOGIN_STATUS, NON_LOGIN_MSG);
        }
        Long id = req.getId();
        String name = trim(req.getName());
        if (NameUtils.containsChinese(name)) {
            return R.error(CHINESE_NOT_ALLOWED_STATUS, CHINESE_NOT_ALLOWED_MSG);
        }
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
     * 新增或修改灰度版本
     *
     * @param req
     * @param user
     * @return
     */
    @SaveLog(scene = "0016",
            paramsIdxes = {0},
            params = {"req"})
    @PostMapping("saveGray")
    public R<Long> saveGrayVersion(@RequestBody VersionReq req, @LoginUser User user) {
        if (user == null) {
            return R.error(NON_LOGIN_STATUS, NON_LOGIN_MSG);
        }
        Long mainVersionId = req.getId();
        String name = trim(req.getName());
        if (NameUtils.containsChinese(name)) {
            return R.error(CHINESE_NOT_ALLOWED_STATUS, CHINESE_NOT_ALLOWED_MSG);
        }
        String memo = trim(req.getMemo());
        Long grayVersionId = req.getGrayVersionId();
        Long cacheEvictEnvironmentId = null;
        Long id = null;
        if (mainVersionId != null && mainVersionId > 0) {
            // 检查主版本是否存在
            Version version = versionService.selectByPrimaryKey(mainVersionId);
            if (version == null || Deleted.DELETE.getValue().equals(version.getDeleted())) {
                return R.error(VERSION_NOT_EXISTS_STATUS, VERSION_NOT_EXISTS_MSG);
            }
            if (grayVersionId != null && grayVersionId > 0) {
                // 更新
                Version grayVersion = versionService.selectByPrimaryKey(grayVersionId);
                if (grayVersion == null || Deleted.DELETE.getValue().equals(grayVersion.getDeleted()) || grayVersion.getMainVersionId() <= 0) {
                    return R.error(GRAY_VERSION_NOT_EXISTS_STATUS, GRAY_VERSION_NOT_EXISTS_MSG);
                }
                versionService.updateVersion(grayVersion, name, memo, user);
                cacheEvictEnvironmentId = version.getEnvironmentId();
            } else {
                // 新增
                version.setGrayFlag(GrayFlag.GRAY.getValue());
                versionService.updateByPrimaryKey(version);
                id = versionService.saveGrayVersion(mainVersionId, req.getEnvironmentId(), name, memo, user);
                cacheEvictEnvironmentId = req.getEnvironmentId();
            }
        } else {
            return R.error(MAIN_VERSION_ID_NOT_EXISTS_STATUS, MAIN_VERSION_ID_NOT_EXISTS_MSG);
        }
        // 失效缓存
        rccCache.evictVersion(cacheEvictEnvironmentId);
        return R.ok(id);
    }

    /**
     * 删除灰度版本
     *
     * @param grayVersionId
     * @param user
     * @return
     */
    @SaveLog(scene = "0017",
            paramsIdxes = {0},
            params = {"grayVersionId"})
    @PostMapping("deleteGray/{grayVersionId}")
    public R deleteGrayVersion(@PathVariable("grayVersionId") Long grayVersionId, @LoginUser User user) {
        if (user == null) {
            return R.error(NON_LOGIN_STATUS, NON_LOGIN_MSG);
        }
        if (null == grayVersionId || grayVersionId <= 0) {
            return R.error(GRAY_VERSION_ID_NOT_EXIST_STATUS, GRAY_VERSION_ID_NOT_EXIST_MSG);
        }
        Version grayVersion = versionService.selectByPrimaryKey(grayVersionId);
        if (grayVersion == null || Deleted.DELETE.getValue().equals(grayVersion.getDeleted())) {
            return R.error(VERSION_NOT_EXISTS_STATUS, VERSION_NOT_EXISTS_MSG);
        }
        if (!projectUserService.checkAuth(grayVersion.getProductId(), grayVersion.getProjectId(), user)) {
            return R.error(PRIV_MIS_STATUS, PRIV_MIS_MSG);
        }
        // 主版本灰度标识置0
        Version version = versionService.selectByPrimaryKey(grayVersion.getMainVersionId());
        version.setGrayFlag(GrayFlag.NOT.getValue());
        versionService.updateByPrimaryKey(version);
        // 删除版本及失效缓存
        int del = versionService.deleteCascadeByVersionId(grayVersionId);

        // 失效id->version的缓存
        rccCache.evictVersionById(Arrays.asList(grayVersionId));
        return R.ok(del);
    }

    /**
     * 新增或者修改灰度规则
     */
    @SaveLog(scene = "0018",
            paramsIdxes = {0},
            params = {"grayVersionReq"})
    @PostMapping("saveGrayRule")
    public R<List<GrayRuleVo>> saveGrayRule(@RequestBody GrayAddReq grayVersionReq, @LoginUser User user) {
        if (user == null) {
            return R.error(NON_LOGIN_STATUS, NON_LOGIN_MSG);
        }
        // 检查灰度版本是否存在
        Long grayVersionId = grayVersionReq.getGrayVersionId();
        if (grayVersionId == null || grayVersionId < 0) {
            return R.error(GRAY_VERSION_ID_NOT_EXIST_STATUS, GRAY_VERSION_ID_NOT_EXIST_MSG);
        }
        Version grayVersion = versionService.selectByPrimaryKey(grayVersionId);
        if (grayVersion == null || Deleted.DELETE.getValue().equals(grayVersion.getDeleted())) {
            return R.error(GRAY_VERSION_NOT_EXISTS_STATUS, GRAY_VERSION_NOT_EXISTS_MSG);
        }
        if (grayVersionReq.getGrayRuleReqs() == null || grayVersionReq.getGrayRuleReqs().isEmpty()) {
            return R.error(GRAY_RULE_NOT_SET_STATUS, GRAY_RULE_NOT_SET_MSG);
        }
        List<GrayRuleVo> grayRuleVos = new ArrayList<>();
        for (GrayRuleReq item : grayVersionReq.getGrayRuleReqs()) {
            GrayRuleVo grayRuleVo = new GrayRuleVo();
            Long grayInfoId = grayInfoService.saveGrayInfo(item, user);
            item.setGrayInfoId(grayInfoId);
            Long grayRuleId = grayRuleService.saveGrayRule(grayVersionId, item, user);
            grayRuleVo.setGrayInfoId(grayInfoId);
            grayRuleVo.setGrayRuleId(grayRuleId);
            grayRuleVos.add(grayRuleVo);
        }
        return R.ok(grayRuleVos);
    }

    /**
     * 列出灰度规则
     */
    @GetMapping("grayRule")
    public R<List<GrayVersionRuleVo>> listGrayRules(Long grayVersionId, @LoginUser User user) {
        if (user == null) {
            return R.error(NON_LOGIN_STATUS, NON_LOGIN_MSG);
        }
        if (grayVersionId == null || grayVersionId <= 0) {
            return R.error(GRAY_VERSION_ID_NOT_EXIST_STATUS, GRAY_VERSION_ID_NOT_EXIST_MSG);
        }
        Version grayVersion = versionService.selectByPrimaryKey(grayVersionId);
        if (grayVersion == null || Deleted.DELETE.getValue().equals(grayVersion.getDeleted())) {
            return R.error(GRAY_VERSION_NOT_EXISTS_STATUS, GRAY_VERSION_NOT_EXISTS_MSG);
        }
        List<GrayRule> grayRules = grayRuleService.selectByGrayVersionId(grayVersionId);
        List<Long> grayInfoIds = new ArrayList<>();
        for (GrayRule item : grayRules) {
            grayInfoIds.add(item.getRuleId());
        }
        List<GrayInfo> grayInfos = grayInfoService.selectByIds(grayInfoIds);
        List<GrayVersionRuleVo> res = new ArrayList<>();
        if (grayInfos != null && !grayInfos.isEmpty()) {
            for (GrayInfo grayInfo : grayInfos) {
                GrayVersionRuleVo grayVersionRuleVo = new GrayVersionRuleVo();
                grayVersionRuleVo.setGrayInfoId(grayInfo.getId());
                grayVersionRuleVo.setRuleContent(grayInfo.getRuleContent());
                grayVersionRuleVo.setRuleName(grayInfo.getRuleName());
                res.add(grayVersionRuleVo);
            }
        }
        return R.ok(res);
    }

    /**
     * 删除版本
     *
     * @param versionId
     * @param user
     * @return
     */
    @SaveLog(scene = "0019",
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
        if (version.getGrayFlag().equals(GrayFlag.GRAY.getValue())) {
            version.setGrayFlag(GrayFlag.NOT.getValue());
            versionService.updateByPrimaryKey(version);
            Version grayVersion = versionService.selectByMainVersionId(version.getId());
            versionService.deleteCascadeByVersionId(grayVersion.getId());
        }

        // 删除版本及失效缓存
        int del = versionService.deleteCascadeByVersionId(versionId);

        // 失效id->version的缓存
        rccCache.evictVersionById(Arrays.asList(versionId));
        return R.ok(del);
    }

    /**
     * 列出版本
     *
     * @param environmentId
     * @param user
     * @return
     */
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
                    List<Long> depIds = DataTransUtils.string2List(item.getDependencyIds());
                    versionVo.setDependencyIds(depIds);
                    versionVo.setDependencyInfos(versionService.getDepInfosByDepIds(depIds));
                    if (item.getMainVersionId() > 0) {
                        versionVo.setGrayFlag(GrayFlag.GRAY.getValue());
                        versionVo.setMainVersionId(item.getMainVersionId());
                    } else {
                        versionVo.setGrayFlag(GrayFlag.NOT.getValue());
                    }
                    return versionVo;
                }
        );

        // 权限
        Map<String, Object> ext = new HashMap<>();
        boolean canManage = environmentUserService
                .checkAuth(environment.getProductId(), environment.getProjectId(), environmentId, user);
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
                VersionNodeVo::getProductId, VersionNodeVo::getProductName);
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

        Map<Long, List<VersionNodeVo>> projectListMap = toMapList(versionNodeVos, VersionNodeVo::getProjectId);
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

        Map<Long, List<VersionNodeVo>> envListMap = toMapList(versionNodeVos, VersionNodeVo::getEnvironmentId);
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

        Map<Long, List<VersionNodeVo>> versionListMap = toMapList(versionNodeVos, VersionNodeVo::getVersionId);
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

    // 我的公共版本
    @GetMapping("myCommonVersionTree")
    public R<List<VersionNodeVo>> myCommonVersionTree(
            @LoginUser User user,
            @RequestParam(name = "productId", defaultValue = "0", required = false) Long productId,
            @RequestParam(name = "projectId", defaultValue = "0", required = false) Long projectId,
            @RequestParam(name = "versionId") Long versionId
    ) {
        List<VersionNodeVo> versionNodeVos = versionService.myCommonVersion(user, productId, projectId, versionId);
        if (CollectionUtils.isEmpty(versionNodeVos)) {
            return R.ok(new ArrayList<>(0));
        }
        return R.ok(versionNodeVos);

//        Map<Long, String> productNameMap = toMap(versionNodeVos,
//                VersionNodeVo::getProductId, VersionNodeVo::getProductName);
//        Map<Long, TreeNode> productTreeNodeMap = new HashMap<>();
//        if (!CollectionUtils.isEmpty(productNameMap)) {
//            for (Map.Entry<Long, String> entry : productNameMap.entrySet()) {
//                TreeNode treeNode = new TreeNode();
//                treeNode.setId(entry.getKey());
//                treeNode.setName(entry.getValue());
//                treeNode.setType(PRODUCT);
//                treeNodes.add(treeNode);
//                productTreeNodeMap.put(entry.getKey(), treeNode);
//            }
//        }
//
//        Map<Long, List<VersionNodeVo>> projectListMap = toMapList(versionNodeVos, VersionNodeVo::getProjectId);
//        Map<Long, TreeNode> projectTreeNodeMap = new HashMap<>();
//        if (!CollectionUtils.isEmpty(projectListMap)) {
//            for (List<VersionNodeVo> ps : projectListMap.values()) {
//                if (!CollectionUtils.isEmpty(ps)) {
//                    VersionNodeVo vo = ps.get(0);
//                    Long id = vo.getProjectId();
//                    String name = vo.getProjectName();
//                    Long pid = vo.getProductId();
//                    TreeNode treeNode = new TreeNode();
//                    treeNode.setId(id);
//                    treeNode.setName(name);
//                    treeNode.setType(PROJECT);
//                    projectTreeNodeMap.put(id, treeNode);
//
//                    TreeNode pnode = productTreeNodeMap.get(pid);
//                    if (pnode == null) {
//                        continue;
//                    }
//                    if (pnode.getChildren() == null) {
//                        pnode.setChildren(new ArrayList<>());
//                        pnode.setHasChildren(true);
//                    }
//                    pnode.getChildren().add(treeNode);
//                }
//            }
//        }
//
//        Map<Long, List<VersionNodeVo>> envListMap = toMapList(versionNodeVos, VersionNodeVo::getEnvironmentId);
//        Map<Long, TreeNode> envTreeNodeMap = new HashMap<>();
//        if (!CollectionUtils.isEmpty(envListMap)) {
//            for (List<VersionNodeVo> es : envListMap.values()) {
//                if (!CollectionUtils.isEmpty(es)) {
//                    VersionNodeVo vo = es.get(0);
//                    Long id = vo.getEnvironmentId();
//                    String name = vo.getEnvironmentName();
//                    Long pid = vo.getProjectId();
//                    TreeNode treeNode = new TreeNode();
//                    treeNode.setId(id);
//                    treeNode.setName(name);
//                    treeNode.setType(ENVIRONMENT);
//                    envTreeNodeMap.put(id, treeNode);
//
//                    TreeNode pnode = projectTreeNodeMap.get(pid);
//                    if (pnode == null) {
//                        continue;
//                    }
//                    if (pnode.getChildren() == null) {
//                        pnode.setChildren(new ArrayList<>());
//                        pnode.setHasChildren(true);
//                    }
//                    pnode.getChildren().add(treeNode);
//                }
//            }
//        }
//
//        Map<Long, List<VersionNodeVo>> versionListMap = toMapList(versionNodeVos, VersionNodeVo::getVersionId);
//        if (!CollectionUtils.isEmpty(versionListMap)) {
//            for (List<VersionNodeVo> vs : versionListMap.values()) {
//                if (!CollectionUtils.isEmpty(vs)) {
//                    VersionNodeVo vo = vs.get(0);
//                    Long id = vo.getVersionId();
//                    String name = vo.getVersionName();
//                    Long pid = vo.getEnvironmentId();
//                    TreeNode treeNode = new TreeNode();
//                    treeNode.setId(id);
//                    treeNode.setName(name);
//                    treeNode.setType(VERSION);
//
//                    TreeNode pnode = envTreeNodeMap.get(pid);
//                    if (pnode == null) {
//                        continue;
//                    }
//                    if (pnode.getChildren() == null) {
//                        pnode.setChildren(new ArrayList<>());
//                        pnode.setHasChildren(true);
//                    }
//                    pnode.getChildren().add(treeNode);
//                }
//            }
//        }
//
//        return R.ok(treeNodes);
    }

    /**
     * 推送变更，修改checkSum
     *
     * @param versionId
     * @param user
     * @return
     */
    @SaveLog(scene = "0020",
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
                versionService.selectMapByPrimaryKeys(Arrays.asList(srcVersionId, destVersionId), Version::getId);

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

    /**
     * 配置回滚
     *
     * @param
     * @param user
     * @return
     */
    @PostMapping("rollBack/{versionId}")
    public R rollBack(@PathVariable("versionId") Long versionId,
                      @RequestBody BatchConfigItemReq batchConfigItemReq, @LoginUser User user) {
        Version version = versionService.selectByPrimaryKey(versionId);
        if (version == null || Deleted.DELETE.getValue().equals(version.getDeleted())) {
            return R.error(VERSION_NOT_EXISTS_STATUS, VERSION_NOT_EXISTS_MSG);
        }
        if (!environmentUserService.checkAuth(version.getProductId(), version.getProjectId(),
                version.getEnvironmentId(), user)) {
            return R.error(PRIV_MIS_STATUS, PRIV_MIS_MSG);
        }
        Long groupId = batchConfigItemReq.getGroupId();
        if (groupId == null || groupId <= 0) {
            return R.error(GROUP_ID_NOT_EXISTS_STATUS, GROUP_ID_NOT_EXISTS_MSG);
        }
        ConfigGroup configGroup = groupService.selectByPrimaryKey(groupId);
        if (configGroup == null || Deleted.DELETE.getValue().equals(configGroup.getDeleted())) {
            return R.error(GROUP_NOT_EXISTS_STATUS, GROUP_NOT_EXISTS_MSG);
        }
        if (!CollectionUtils.isEmpty(batchConfigItemReq.getItems())) {
            for (ItemReq req : batchConfigItemReq.getItems()) {
                String name = req.getName();
                if (StringUtils.isBlank(name)) {
                    return R.error(CONFIG_KEY_NOT_EXISTS_STATUS, CONFIG_KEY_NOT_EXISTS_MSG);
                }
                ApiItemVo apiItemVo = configItemService.getByVersionIdAndName(configGroup.getProjectId(), configGroup.getVersionId(), name);
                if (apiItemVo != null && !apiItemVo.getGroupId().equals(groupId)) {
                    return R.error(CONFIG_ITEM_EXISTS_STATUS, CONFIG_ITEM_EXISTS_MSG);
                }
            }
        }
        if (!environmentUserService.checkAuth(configGroup.getProductId(), configGroup.getProjectId(),
                configGroup.getEnvironmentId(), user)) {
            return R.error(PRIV_MIS_STATUS, PRIV_MIS_MSG);
        }
        int cnt = configItemService.batchSave(user, batchConfigItemReq, configGroup);

        // 失效版本下的配置
        if (configGroup.getVersionId() != null && configGroup.getVersionId() > 0) {
            List<Long> versionIds = new ArrayList<>();
            versionIds.add(configGroup.getVersionId());
            if (projectService.selectByPrimaryKey(configGroup.getProjectId()).getProjectType().equals(ProjectType.PUBLIC.getValue())) {
                versionIds.addAll(versionService.getChildrenVersionById(versionId));
            }
            rccCache.evictConfigItem(versionIds);
        }
        return R.ok(cnt);
    }

    /**
     * configuration export
     *
     * @param
     * @param user
     * @param versionId
     * @return
     */
    @SaveLog(scene = "0022",
            paramsIdxes = {0},
            params = {"groupId"})
    @PostMapping("export/{versionId}")
    public void export(@PathVariable("versionId") Long versionId, @LoginUser User user, HttpServletResponse res) throws IOException {
        // check version
        Version version = versionService.selectByPrimaryKey(versionId);
        if (version == null || Deleted.DELETE.getValue().equals(version.getDeleted())) {
            throw new BizException(VERSION_NOT_EXISTS_STATUS, VERSION_NOT_EXISTS_MSG);
        }
        // authentication
        if (!environmentUserService.checkAuth(version.getProductId(), version.getProjectId(),
                version.getEnvironmentId(), user)) {
            throw new BizException(PRIV_MIS_STATUS, PRIV_MIS_MSG);
        }
        // list all groups by versionId
        List<ConfigGroup> configGroupList = groupService.listAllGroupByVersionId(version.getProjectId(), versionId);
        // check group list
        if (configGroupList.isEmpty()) {
            throw new BizException(GROUP_NOT_EXISTS_STATUS, GROUP_NOT_EXISTS_MSG);
        }
        // define file
        String fileName = version.getName() + ".properties";
        String fileContent = "";
        for (ConfigGroup configGroup : configGroupList) {
            // find all configurations
            List<ConfigItemForGroupVo> items =
                    configItemService.selectByExample(ConfigItemExample.newBuilder()
                                    .build()
                                    .createCriteria()
                                    .andDeletedEqualTo(Deleted.OK.getValue())
                                    .andGroupIdEqualTo(configGroup.getId())
                                    .toExample(),
                            item -> {
                                ConfigItemForGroupVo vo = new ConfigItemForGroupVo();
                                vo.setName(item.getName());
                                vo.setVal(item.getVal());
                                return vo;
                            },
                            MetaConfigItem.COLUMN_NAME_ID,
                            MetaConfigItem.COLUMN_NAME_NAME,
                            MetaConfigItem.COLUMN_NAME_MEMO,
                            MetaConfigItem.COLUMN_NAME_VAL
                    );
            res.setHeader(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + fileName);
            // get fileContent
            String tem = ConvertFileUtil.convert2FileContent(items, configGroup.getName());
            fileContent = tem + fileContent;
        }
        try {
            // write content
            res.getOutputStream().write(fileContent.getBytes());
        } catch (Exception e) {
            throw new IOException("export configurations failed:{}", e);
        }
    }

    /**
     * configuration import
     *
     * @param
     * @param user
     * @return
     */
    @SaveLog(scene = "0023",
            paramsIdxes = {0},
            params = {"groupId"})
    @PostMapping("import/{versionId}")
    public R importFile(@PathVariable("versionId") Long versionId,
                        @RequestParam Byte type,
                        @RequestParam("file") MultipartFile file,
                        @LoginUser User user) throws IOException {
        // check version
        Version version = versionService.selectByPrimaryKey(versionId);
        if (version == null || Deleted.DELETE.getValue().equals(version.getDeleted())) {
            throw new BizException(VERSION_NOT_EXISTS_STATUS, VERSION_NOT_EXISTS_MSG);
        }
        // authentication
        if (!environmentUserService.checkAuth(version.getProductId(), version.getProjectId(),
                version.getEnvironmentId(), user)) {
            throw new BizException(PRIV_MIS_STATUS, PRIV_MIS_MSG);
        }
        // check file
        FileFormatUtils.checkFile(file);
        ConfigGroup configGroup = new ConfigGroup();
        configGroup.setVersionId(versionId);
        configGroup.setEnvironmentId(version.getEnvironmentId());
        configGroup.setProductId(version.getProductId());
        configGroup.setProjectId(version.getProjectId());
        // read file
        configItemService.parseProFile(file, configGroup, type);
        return R.ok();
    }

    @PostMapping("ref")
    public R addRef(@RequestBody RefProjectDto refProjectDto, @LoginUser User user) {
        if (user == null) {
            return R.error(NON_LOGIN_STATUS, NON_LOGIN_MSG);
        }
        if (null == refProjectDto.getVersionId() || refProjectDto.getVersionId() <= 0) {
            return R.error(VERSION_ID_NOT_EXISTS_STATUS, VERSION_ID_NOT_EXISTS_MSG);
        }
        if (null == refProjectDto.getRefIds()) {
            return R.error(PARAM_ERROR_STATUS, PARAM_ERROR_MSG);
        }
        List<Long> refIdList = refProjectDto.getRefIds();
        Long versionId = refProjectDto.getVersionId();
        Version exists = versionService.selectByPrimaryKey(versionId);
        if (exists == null || Deleted.DELETE.getValue().equals(exists.getDeleted())) {
            return R.error(VERSION_NOT_EXISTS_STATUS, VERSION_NOT_EXISTS_MSG);
        }
        if (!versionService.checkAuths(user, versionId, refProjectDto.getRefIds())) {
            return R.error(PRIV_MIS_STATUS, PRIV_MIS_MSG);
        }
        int cnt = 0;
        if (refIdList.isEmpty()) {
            cnt = versionService.updateByPrimaryKeySelective(Version.newBuilder()
                    .updateTime(new Date())
                    .dependencyIds("")
                    .id(versionId)
                    .build());
        } else {
            //剔除掉当前版本自己id
            refIdList.remove(versionId);
            // 根据refIdList获取版本信息
            List<Version> versions = versionService.selectByPrimaryKeys(refIdList);
            String refIds = "";
            for (Version version : versions) {
                refIds += version.getId() + ",";
            }
            // 去除最后的逗号
            refIds = refIds.substring(0, refIds.length() - 1);
            cnt = versionService.updateByPrimaryKeySelective(Version.newBuilder()
                    .updateTime(new Date())
                    .dependencyIds(refIds)
                    .id(versionId)
                    .build());
        }
        // 失效版本下的配置
        List<Long> versionIds = new ArrayList<>();
        versionIds.add(versionId);
        if (projectService.selectByPrimaryKey(exists.getProjectId()).getProjectType().equals(ProjectType.PUBLIC.getValue())) {
            versionIds.addAll(versionService.getChildrenVersionById(versionId));
        }
        rccCache.evictConfigItem(versionIds);
        return R.ok(cnt);
    }
}
