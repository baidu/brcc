/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.baidu.brcc.dao.EnvironmentMapper;
import com.baidu.brcc.dao.base.BaseMapper;
import com.baidu.brcc.domain.Environment;
import com.baidu.brcc.domain.EnvironmentExample;
import com.baidu.brcc.domain.EnvironmentUser;
import com.baidu.brcc.domain.EnvironmentUserExample;
import com.baidu.brcc.domain.ProductUser;
import com.baidu.brcc.domain.ProjectUser;
import com.baidu.brcc.domain.em.Deleted;
import com.baidu.brcc.domain.meta.MetaEnvironment;
import com.baidu.brcc.domain.vo.ApiEnvironmentVo;
import com.baidu.brcc.service.ConfigGroupService;
import com.baidu.brcc.service.ConfigItemService;
import com.baidu.brcc.service.EnvironmentService;
import com.baidu.brcc.service.EnvironmentUserService;
import com.baidu.brcc.service.ProductUserService;
import com.baidu.brcc.service.ProjectUserService;
import com.baidu.brcc.service.RccCache;
import com.baidu.brcc.service.VersionService;
import com.baidu.brcc.service.base.GenericServiceImpl;
import com.baidu.brcc.utils.time.DateTimeUtils;

@Service("environmentService")
public class EnvironmentServiceImpl extends GenericServiceImpl<Environment, Long, EnvironmentExample>
        implements EnvironmentService {

    @Autowired
    private EnvironmentMapper environmentMapper;

    @Autowired
    EnvironmentUserService environmentUserService;

    @Autowired
    ProjectUserService projectUserService;

    @Autowired
    ProductUserService productUserService;

    @Autowired
    private VersionService versionService;

    @Autowired
    private ConfigGroupService configGroupService;

    @Autowired
    private ConfigItemService configItemService;

    @Autowired
    private RccCache rccCache;

    @Override
    public BaseMapper<Environment, Long, EnvironmentExample> getMapper() {
        return environmentMapper;
    }

    @Override
    public EnvironmentExample newExample() {
        return EnvironmentExample.newBuilder().build();
    }

    @Override
    public EnvironmentExample newIdInExample(List<Long> ids) {
        return EnvironmentExample.newBuilder().build().createCriteria().andIdIn(ids).toExample();
    }

    @Override
    public List<Environment> selectByProjectId(Long projectId) {
        return environmentMapper.selectByExample(EnvironmentExample.newBuilder()
                .build()
                .createCriteria()
                .andProjectIdEqualTo(projectId)
                .andDeletedEqualTo(Deleted.OK.getValue())
                .toExample()
        );
    }

    @Override
    public Environment selectByProjectIdAndName(Long projectId, String name) {
        return selectOneByExample(EnvironmentExample.newBuilder()
                .build()
                .createCriteria()
                .andDeletedEqualTo(Deleted.OK.getValue())
                .andProjectIdEqualTo(projectId)
                .andNameEqualTo(name)
                .toExample()
        );
    }

    @Override
    public ApiEnvironmentVo getByProjectIdAndNameInCache(Long projectId, String name) {
        ApiEnvironmentVo vo = rccCache.getEnvironment(projectId, name);
        if (vo == null) {
            // 缓存可用且环境的HKEY不存在，加载所有环境
            if (rccCache.cacheEnable() && !rccCache.existsEnvironmentHKey(projectId)) {
                List<Environment> environments = selectByProjectId(projectId);
                if (!CollectionUtils.isEmpty(environments)) {
                    List<ApiEnvironmentVo> environmentVos = new ArrayList<>(environments.size());
                    for (Environment environment : environments) {
                        ApiEnvironmentVo environmentVo = new ApiEnvironmentVo();
                        environmentVo.setProjectId(environment.getProjectId());
                        environmentVo.setEnvironmentId(environment.getId());
                        environmentVo.setEnvironmentName(environment.getName());
                        environmentVos.add(environmentVo);
                        if (StringUtils.equals(name, environment.getName())) {
                            vo = environmentVo;
                        }
                    }
                    rccCache.loadEnvironments(projectId, environmentVos);
                }
            } else {
                // 缓存不可用或环境HKEY已经存在
                Environment environment = selectByProjectIdAndName(projectId, name);
                if (environment != null) {
                    vo = new ApiEnvironmentVo().copyFrom(environment);
                    // 不能加载，分布式环境下可能会导致获取所有环境出现数据不一致的情况
                    // 例如，缓存可用HKEY已存在的情况下，管理端清空当前HKEY，
                    // 此时重新加载会导致HKEY的数据只有当前一条数据，此时如果请求所有环境，数据返回就只有一条
                    // rccCache.loadEnvironment(vo);
                }
            }
        }
        return vo;
    }

    @Override
    public List<ApiEnvironmentVo> getAllByProjectIdInCache(Long projectId) {
        List<ApiEnvironmentVo> environmentVos = rccCache.getEnvironments(projectId);
        if (CollectionUtils.isEmpty(environmentVos)) {
            List<Environment> environments = selectByProjectId(projectId);
            if (!CollectionUtils.isEmpty(environments)) {
                environmentVos = new ArrayList<>(environments.size());
                for (Environment environment : environments) {
                    ApiEnvironmentVo vo = new ApiEnvironmentVo().copyFrom(environment);
                    environmentVos.add(vo);
                }
                rccCache.loadEnvironments(projectId, environmentVos);
            }
        }
        return environmentVos;
    }

    @Override
    public List<Long> selectIdsByProjectId(Long projectId) {
        if (projectId == null || projectId <= 0) {
            return null;
        }
        return selectByExample(EnvironmentExample.newBuilder()
                .build()
                .createCriteria()
                .andDeletedEqualTo(Deleted.OK.getValue())
                .andProjectIdEqualTo(projectId)
                .toExample(),
                Environment::getId,
                MetaEnvironment.COLUMN_NAME_ID
        );
    }

    @Override
    @Transactional
    public Integer deleteCascadeByEnvId(Long envId) {
        Date now = DateTimeUtils.now();
        Environment environment = selectByPrimaryKey(envId);
        if (environment == null) {
            return 0;
        }
        List<Long> versionIds = versionService.selectIdsByEnvironmentIds(environment.getProjectId(), Arrays.asList(envId));
        // 删除环境
        int del = updateByPrimaryKeySelective(Environment.newBuilder()
                .id(envId)
                .deleted(Deleted.DELETE.getValue())
                .updateTime(now)
                .build());

        // 删除版本
        versionService.deleteByEnvId(envId);

        // 删除分组
        configGroupService.deleteByEnvId(envId);

        // 删除配置项
        configItemService.deleteByEnvId(envId);

        // 删除用户环境关系表
        environmentUserService.deleteByExample(EnvironmentUserExample.newBuilder()
                .build()
                .createCriteria()
                .andEnvironmentIdEqualTo(envId)
                .toExample()
        );

        // 失效缓存
        rccCache.deleteEnvironmentCascade(environment, versionIds);
        return del;
    }

    @Override
    public int deleteByProjectId(Long projectId) {
        return updateByExampleSelective(
                Environment.newBuilder()
                        .deleted(Deleted.DELETE.getValue())
                        .updateTime(DateTimeUtils.now())
                        .build(),
                EnvironmentExample.newBuilder()
                        .build()
                        .createCriteria()
                        .andProjectIdEqualTo(projectId)
                        .andDeletedEqualTo(Deleted.OK.getValue())
                        .toExample()
        );
    }

    @Override
    public boolean accessibleEnv(Long userId, Long envId) {
        Environment environment = selectByPrimaryKey(envId);
        // 环境不存在
        if (environment == null || Deleted.DELETE.getValue().equals(environment.getDeleted())) {
            return false;
        }
        // 环境可访问
        EnvironmentUser environmentUser =
                environmentUserService.selectByUserIdAndEnvironmentId(userId, environment.getProjectId(), envId);
        if (environmentUser != null) {
            return true;
        }

        // 工程管理员
        ProjectUser projectUser =
                projectUserService.selectAdminByUserIdAndProjectId(userId, environment.getProjectId());
        if (projectUser != null) {
            return true;
        }

        // 流水线管理员
        ProductUser productUser =
                productUserService.selectProductUserByUserIdAndProductId(userId, environment.getProductId());
        if (productUser != null) {
            return true;
        }

        return false;
    }
}
