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
