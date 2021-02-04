/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
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

}
