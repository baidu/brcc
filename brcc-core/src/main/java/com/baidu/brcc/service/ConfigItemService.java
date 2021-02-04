/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.service;

import java.util.List;
import java.util.Map;

import com.baidu.brcc.domain.ConfigGroup;
import com.baidu.brcc.domain.ConfigItem;
import com.baidu.brcc.domain.ConfigItemExample;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.vo.ApiItemVo;
import com.baidu.brcc.domain.vo.BatchConfigItemReq;
import com.baidu.brcc.service.base.GenericService;

public interface ConfigItemService extends GenericService<ConfigItem, Long, ConfigItemExample> {

    ConfigItem selectByProjectIdAndVersionIdAndName(Long projectId, Long versionId, String name);

    List<ConfigItem> selectByProjectIdAndVersionId(Long projectId, Long versionId);

    List<ConfigItem> selectByProjectIdAndVersionIdAndNames(Long projectId, Long versionId, List<String> names);

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

    List<ApiItemVo> getItemsByVersionIdAndNamesInCache(Long projectId, Long versionId, List<String> names);
}
