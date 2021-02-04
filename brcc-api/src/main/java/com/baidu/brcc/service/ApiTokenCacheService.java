/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.service;

import com.baidu.brcc.domain.ApiToken;

public interface ApiTokenCacheService {

    /**
     * 根据token获取ApiToken，并加载到缓存
     * @param token
     * @return
     */
    ApiToken getApiToken(String token);

}
