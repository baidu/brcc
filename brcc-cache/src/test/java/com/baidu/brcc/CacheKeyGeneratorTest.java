/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc;

import static com.baidu.brcc.CacheKeyGenerator.API_TOKEN_KEY_PREFIX;
import static com.baidu.brcc.CacheKeyGenerator.ENVIRONMENT_PROJECT_ID_KEY_PREFIX;
import static com.baidu.brcc.CacheKeyGenerator.ITEM_VERSION_ID_KEY_PREFIX;
import static com.baidu.brcc.CacheKeyGenerator.PROJECT_NAME_KEY_PREFIX;
import static com.baidu.brcc.CacheKeyGenerator.USER_NAME_KEY_PREFIX;
import static com.baidu.brcc.CacheKeyGenerator.USER_TOKEN_KEY_PREFIX;
import static com.baidu.brcc.CacheKeyGenerator.VERSION_ENVIRONMENT_ID_KEY_PREFIX;
import static com.baidu.brcc.CacheKeyGenerator.VERSION_ID_KEY_PREFIX;

import org.junit.Assert;
import org.junit.Test;

import com.baidu.brcc.CacheKeyGenerator;

public class CacheKeyGeneratorTest {

    @Test
    public void testConstantsValues() {
        Assert.assertEquals("string.username.", USER_NAME_KEY_PREFIX);
        Assert.assertEquals("string.usertoken.", USER_TOKEN_KEY_PREFIX);
        Assert.assertEquals("string.projectname.", PROJECT_NAME_KEY_PREFIX);
        Assert.assertEquals("string.apitoken.", API_TOKEN_KEY_PREFIX);
        Assert.assertEquals("string.versionid.", VERSION_ID_KEY_PREFIX);
        Assert.assertEquals("hash.environment.projectId.", ENVIRONMENT_PROJECT_ID_KEY_PREFIX);
        Assert.assertEquals("hash.version.environmentId.", VERSION_ENVIRONMENT_ID_KEY_PREFIX);
        Assert.assertEquals("hash.item.versionId.", ITEM_VERSION_ID_KEY_PREFIX);
    }

    @Test
    public void testGetUserNameKey() throws Exception {
        String result = CacheKeyGenerator.getUserNameKey("userName");
        Assert.assertEquals("string.username.userName", result);
    }

    @Test
    public void testGetUserTokenKey() throws Exception {
        String result = CacheKeyGenerator.getUserTokenKey("userToken");
        Assert.assertEquals("string.usertoken.userToken", result);
    }

    @Test
    public void testGetProjectNameKey() throws Exception {
        String result = CacheKeyGenerator.getProjectNameKey("projectName");
        Assert.assertEquals("string.projectname.projectName", result);
    }

    @Test
    public void testGetApiTokenKey() throws Exception {
        String result = CacheKeyGenerator.getApiTokenKey("apiToken");
        Assert.assertEquals("string.apitoken.apiToken", result);
    }

    @Test
    public void testGetVersionIdKey() throws Exception {
        String result = CacheKeyGenerator.getVersionIdKey(Long.valueOf(1));
        Assert.assertEquals("string.versionid.1", result);
    }

    @Test
    public void testGetEnvironmentProjectIdKey() throws Exception {
        String result = CacheKeyGenerator.getEnvironmentProjectIdKey(Long.valueOf(1));
        Assert.assertEquals("hash.environment.projectId.1", result);
    }

    @Test
    public void testGetVersionEnvironmentIdKey() throws Exception {
        String result = CacheKeyGenerator.getVersionEnvironmentIdKey(Long.valueOf(1));
        Assert.assertEquals("hash.version.environmentId.1", result);
    }

    @Test
    public void testGetItemVersionIdKey() throws Exception {
        String result = CacheKeyGenerator.getItemVersionIdKey(Long.valueOf(1));
        Assert.assertEquals("hash.item.versionId.1", result);
    }
}
