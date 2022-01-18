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

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.baidu.brcc.domain.ConfigGroup;
import com.baidu.brcc.domain.ConfigItem;
import com.baidu.brcc.domain.ConfigItemExample;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.base.Pagination;
import com.baidu.brcc.domain.vo.ApiItemVo;
import com.baidu.brcc.domain.vo.BatchConfigItemReq;
import com.baidu.brcc.domain.vo.ConfigItemVo;
import com.baidu.brcc.service.base.GenericService;
import org.springframework.web.multipart.MultipartFile;

public interface ConfigItemService extends GenericService<ConfigItem, Long, ConfigItemExample> {

    ConfigItem selectByProjectIdAndVersionIdAndName(Long projectId, Long versionId, String name);

    List<ConfigItem> selectByProjectIdAndVersionId(Long projectId, Long versionId);

    List<ConfigItem> selectByProjectIdAndVersionIdAndNames(Long projectId, Long versionId, List<String> names);

    Map<String, ConfigItem> selectMapByProjectIdAndVersionId(Long projectId, Long versionId);

    Integer batchSave(User user, BatchConfigItemReq itemReq, ConfigGroup configGroup);

    int deleteByGroupId(Long groupId);

    int deleteByVersionId(Long versionId);

    int deleteByEnvId(Long envId);

    int deleteByProjectId(Long projectId);

    Map<String, String> findConfigItemsByGroupId(Long groupId);

    void saveConfigItems(List<ConfigItem> insertConfigItemList, List<ConfigItem> updateConfigItemList,
                         List<Long> delConfigItemIds);

    Map<String, String> findConfigItemsByVersionId(Long versionId);

    ApiItemVo getByVersionIdAndName(Long projectId, Long versionId, String name);

    List<ApiItemVo> getAllByVersionIdInCache(Long projectId, Long versionId);

    List<ApiItemVo> getCommonAndPrivateByVersionIdInCache(Long projectId, Long versionId, Set<Long> resolved);

    List<ApiItemVo> getItemsByVersionIdAndNamesInCache(Long projectId, Long versionId, List<String> names);

    Pagination<ConfigItemVo> pagination(Integer offset, Integer pageSize, Long productId, Long projectId, String key,
                                        String val, User user);
    void parseProFile(MultipartFile file, ConfigGroup configGroup, Byte type) throws IOException;
}
