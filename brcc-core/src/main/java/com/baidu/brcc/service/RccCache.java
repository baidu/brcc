/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.service;

import java.util.List;

import com.baidu.brcc.domain.ApiToken;
import com.baidu.brcc.domain.Environment;
import com.baidu.brcc.domain.Project;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.Version;
import com.baidu.brcc.domain.vo.ApiEnvironmentVo;
import com.baidu.brcc.domain.vo.ApiItemVo;
import com.baidu.brcc.domain.vo.ApiVersionVo;

/**
 * 业务相关
 */
public interface RccCache {

    boolean cacheEnable();

    // 判断环境hkey是否存在
    boolean existsEnvironmentHKey(Long projectId);

    // 判断版本hkey是否存在
    boolean existsVersionHKey(Long environmentId);

    // 判断配置项hkey是否存在
    boolean existsItemHKey(Long versionId);

    // 失效用户
    void evictUser(User user);

    // 失效工程
    void evictProject(String projectName, List<String> apiTokens);

    // 失效工程下的环境
    void evictEnvironment(Long projectId);

    // 失效环境下的版本
    void evictVersion(Long environmentId);

    // 失效版本下的配置
    void evictConfigItem(Long versionId);

    // 失效版本
    void evictVersionById(List<Long> versionIds);

    // 级联删除工程
    void deleteProjectCascade(Project project, List<Long> environmentIds, List<Long> versionIds,
                              List<String> apiTokens);

    // 级联删除环境
    void deleteEnvironmentCascade(Environment environment, List<Long> versionIds);

    // 级联删除版本
    void deleteVersionCascade(Version version);

    // 删除配置
    void deleteItems(Long versionId, List<String> itemNames);

    // 查询工程
    Project getProject(String name);

    // 查询api token
    ApiToken getApiToken(String token);

    // 查询用户
    User getUserByToken(String token);

    User getUserByName(String name);

    // 查询环境
    List<ApiEnvironmentVo> getEnvironments(Long projectId);

    ApiEnvironmentVo getEnvironment(Long projectId, String name);

    // 读版本
    List<ApiVersionVo> getVersions(Long environmentId);

    ApiVersionVo getVersion(Long environmentId, String name);

    ApiVersionVo getVersionById(Long versionId);

    // 读取配置项
    List<ApiItemVo> getItems(Long versionId);

    List<ApiItemVo> getItems(Long versionId, List<String> names);

    ApiItemVo getItem(Long versionId, String name);

    // 加载工程
    void loadProject(Project project);

    // 加载用户
    void loadUser(User user);

    // 加载Api token
    void loadApiToken(ApiToken apiToken);

    // 加载环境

    void loadEnvironment(ApiEnvironmentVo vo);

    // 加载环境
    void loadEnvironments(Long projectId, List<ApiEnvironmentVo> environmentVos);

    // 加载版本
    void loadVersion(ApiVersionVo apiVersionVo);

    // 加载版本
    void loadVersionForId(ApiVersionVo apiVersionVo);

    // 加载版本
    void loadVersions(Long environmentId, List<ApiVersionVo> versionVos);

    // 加载配置
    void loadItem(Long versionId, ApiItemVo itemVo);
    // 加载配置
    void loadItems(Long versionId, List<ApiItemVo> itemVos, boolean clear);

}
