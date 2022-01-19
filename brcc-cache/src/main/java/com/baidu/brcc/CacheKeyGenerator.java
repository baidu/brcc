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

import java.util.Objects;

public class CacheKeyGenerator {

    public static final String USER_NAME_KEY_PREFIX = "string.username.";
    public static final String USER_TOKEN_KEY_PREFIX = "string.usertoken.";
    public static final String PROJECT_NAME_KEY_PREFIX = "string.projectname.";
    public static final String API_TOKEN_KEY_PREFIX = "string.apitoken.";
    public static final String VERSION_ID_KEY_PREFIX = "string.versionid.";

    public static final String ENVIRONMENT_PROJECT_ID_KEY_PREFIX = "hash.environment.projectId.";
    public static final String VERSION_ENVIRONMENT_ID_KEY_PREFIX = "hash.version.environmentId.";
    public static final String ITEM_VERSION_ID_KEY_PREFIX = "hash.item.versionId.";
    public static final String ITEM_VERSION_ID_KEY_PREFIX_V2 = "hash.itemConfig.versionId.";

    public static String getUserNameKey(String userName) {
        Objects.requireNonNull(userName);
        return USER_NAME_KEY_PREFIX.concat(userName);
    }

    public static String getUserTokenKey(String userToken) {
        Objects.requireNonNull(userToken);
        return USER_TOKEN_KEY_PREFIX.concat(userToken);
    }

    public static String getProjectNameKey(String projectName) {
        Objects.requireNonNull(projectName);
        return PROJECT_NAME_KEY_PREFIX.concat(projectName);
    }

    public static String getApiTokenKey(String apiToken) {
        Objects.requireNonNull(apiToken);
        return API_TOKEN_KEY_PREFIX.concat(apiToken);
    }

    public static String getVersionIdKey(Long versionId) {
        Objects.requireNonNull(versionId);
        return VERSION_ID_KEY_PREFIX.concat(versionId.toString());
    }

    public static String getEnvironmentProjectIdKey(Long projectId) {
        Objects.requireNonNull(projectId);
        return ENVIRONMENT_PROJECT_ID_KEY_PREFIX.concat(projectId.toString());
    }

    public static String getVersionEnvironmentIdKey(Long environmentId) {
        Objects.requireNonNull(environmentId);
        return VERSION_ENVIRONMENT_ID_KEY_PREFIX.concat(environmentId.toString());
    }

    public static String getItemVersionIdKey(Long versionId) {
        Objects.requireNonNull(versionId);
        return ITEM_VERSION_ID_KEY_PREFIX.concat(versionId.toString());
    }

//    public static String getItemConfigVersionIdKey(Long versionId) {
//        Objects.requireNonNull(versionId);
//        return ITEM_VERSION_ID_KEY_PREFIX_V2.concat(versionId.toString());
//    }


}
