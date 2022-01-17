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
package com.baidu.brcc.service;

import java.util.List;

import com.baidu.brcc.domain.VersionExample;
import com.baidu.brcc.service.base.GenericService;
import com.baidu.brcc.domain.ConfigGroup;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.Version;
import com.baidu.brcc.domain.vo.ApiVersionVo;
import com.baidu.brcc.domain.vo.VersionNodeVo;

public interface VersionService extends GenericService<Version, Long, VersionExample> {

    int updateVersion(Version version, String name, String memo, User loginUser);

    Long saveVersion(Long environmentId, String name, String memo, User loginUser);

    Long saveGrayVersion(Long mainVersionId, Long environmentId, String name, String memo, User loginUser);

    Version selectByMainVersionId(Long mainVersionId);

    Integer deleteCascadeByVersionId(Long versionId);

    int deleteByEnvId(Long envId);

    int deleteByProjectId(Long projectId);

    Boolean checkAuth(User user, Long srcVerId, Long destVerId);

    Boolean checkAuths(User user, Long versionId, List<Long> depIds);

    void copyConfigItemsFromVersion(Long srcVerId, Long destVerId);

    void copyConfigItemsFromGroup(Long srcGroupId, ConfigGroup destGroup);

    List<VersionNodeVo> myAllVersion(User user, Long productId, Long projectId);

    List<VersionNodeVo> myCommonVersion(User user, Long productId, Long projectId, Long versionId);

    Version selectByProjectIdAndEnvironmentIdAndName(Long projectId, Long environmentId, String name);

    List<Version> selectByProjectIdAndEnvironment(Long projectId, Long environmentId);

    List<Long> selectIdsByEnvironmentIds(Long projectId, List<Long> environmentIds);

    ApiVersionVo getByEnvironmentByIdInCache(Long versionId);

    ApiVersionVo getByEnvironmentAndNameInCache(Long projectId, Long environmentId, String versionName);

    List<ApiVersionVo> getAllByEnvironmentIdInCache(Long projectId, Long environmentId);

    List<Version> selectByEnvironmentId(Long environmentId);

    List<String> getDepInfosByDepIds(List<Long> depIds);

    List<Long> getChildrenVersionById(Long versionId);
}
