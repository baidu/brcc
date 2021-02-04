/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baidu.brcc.domain.ApiToken;
import com.baidu.brcc.service.ApiTokenCacheService;
import com.baidu.brcc.service.ApiTokenService;
import com.baidu.brcc.service.RccCache;

@Service("ApiTokenCacheService")
public class ApiTokenCacheServiceImpl implements ApiTokenCacheService {

    @Autowired
    private RccCache rccCache;

    @Autowired
    private ApiTokenService apiTokenService;

    @Override
    public ApiToken getApiToken(String token) {
        ApiToken apiToken = rccCache.getApiToken(token);
        if (apiToken == null) {
            apiToken = apiTokenService.selectByToken(token);
            if (apiToken != null) {
                rccCache.loadApiToken(apiToken);
            }
        }
        return apiToken;
    }
}
