/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.service;

import java.util.List;

import com.baidu.brcc.service.base.GenericService;
import com.baidu.brcc.domain.ConfigGroup;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.Version;
import com.baidu.brcc.domain.VersionExample;
import com.baidu.brcc.domain.vo.ApiVersionVo;
import com.baidu.brcc.domain.vo.VersionNodeVo;

public interface VersionService extends GenericService<Version, Long, VersionExample> {

    int updateVersion(Version version, String name, String memo, User loginUser);

    Long saveVersion(Long environmentId, String name, String memo, User loginUser);

    Integer deleteCascadeByVersionId(Long versionId);

    int deleteByEnvId(Long envId);

    int deleteByProjectId(Long projectId);

    Boolean checkAuth(User user, Long srcVerId, Long destVerId);

    void copyConfigItemsFromVersion(Long srcVerId, Long destVerId);

    void copyConfigItemsFromGroup(Long srcGroupId, ConfigGroup destGroup);

    List<VersionNodeVo> myAllVersion(User user, Long productId, Long projectId);

    Version selectByProjectIdAndEnvironmentIdAndName(Long projectId, Long environmentId, String name);

    List<Version> selectByProjectIdAndEnvironment(Long projectId, Long environmentId);

    List<Long> selectIdsByEnvironmentIds(Long projectId, List<Long> environmentIds);

    ApiVersionVo getByEnvironmentByIdInCache(Long versionId);

    ApiVersionVo getByEnvironmentAndNameInCache(Long projectId, Long environmentId, String versionName);

    List<ApiVersionVo> getAllByEnvironmentIdInCache(Long projectId, Long environmentId);
}
