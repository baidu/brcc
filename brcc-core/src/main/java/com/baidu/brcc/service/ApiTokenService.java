/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.service;

import java.util.Collection;
import java.util.List;

import com.baidu.brcc.domain.ApiToken;
import com.baidu.brcc.domain.ApiTokenExample;
import com.baidu.brcc.service.base.GenericService;

public interface ApiTokenService extends GenericService<ApiToken, Long, ApiTokenExample> {

    Long save(String token, Long projectId, String projectName);

    ApiToken selectByToken(String token);

    List<ApiToken> selectByProjectId(Long projectId, String... columns);

    int deleteByIds(Collection<Long> ids);

}
