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
package com.baidu.brcc.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.baidu.brcc.dao.ConfigChangeLogMapper;
import com.baidu.brcc.dao.base.BaseMapper;
import com.baidu.brcc.domain.ConfigChangeLogExample;
import com.baidu.brcc.domain.ConfigChangeLogWithBLOBs;
import com.baidu.brcc.domain.ConfigGroup;
import com.baidu.brcc.service.ConfigChangeLogService;
import com.baidu.brcc.service.ConfigGroupService;
import com.baidu.brcc.service.base.GenericServiceImpl;
import com.baidu.brcc.utils.gson.GsonUtils;

@Service("configChangeLogService")
public class ConfigChangeLogServiceImpl extends GenericServiceImpl<ConfigChangeLogWithBLOBs, Long,
        ConfigChangeLogExample>
        implements ConfigChangeLogService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConfigChangeLogServiceImpl.class);
    /**
     * 执行器
     */
    private static ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();

    static {
        executor.setThreadNamePrefix("save-config-change-log-");
        executor.setCorePoolSize(Runtime.getRuntime().availableProcessors());
        executor.setMaxPoolSize(Runtime.getRuntime().availableProcessors()*2);
        // 设置队列容量
        executor.setQueueCapacity(5000);
        // 是否关闭的时候等待任务执行结束
        executor.setWaitForTasksToCompleteOnShutdown(true);
        // 默认是0，因此不等待，现设置为5秒
        executor.setAwaitTerminationSeconds(5);
        executor.setKeepAliveSeconds(600);
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        executor.initialize();

        LOGGER.info(
                "configChangeLogService start a ThreadPoolTaskExecutor with 2 core pool ,2 max pool size, 5000 queue"
                        + " capacity");
    }

    @Autowired
    private ConfigChangeLogMapper configChangeLogMapper;

    @Autowired
    private ConfigGroupService configGroupService;

    @Override
    public BaseMapper<ConfigChangeLogWithBLOBs, Long, ConfigChangeLogExample> getMapper() {
        return configChangeLogMapper;
    }

    @Override
    public ConfigChangeLogExample newExample() {
        return ConfigChangeLogExample.newBuilder().build();
    }

    @Override
    public ConfigChangeLogExample newIdInExample(List<Long> ids) {
        return ConfigChangeLogExample.newBuilder().build().createCriteria().andIdIn(ids).toExample();
    }

    @Override
    public void saveLogWithBackground(Long userId, String operator, Long groupId,
                                      Map<String, String> oldConfigMap, Map<String, String> newCofigMap,
                                      Date commitTime) {
        executor.submit(() -> {
            long start = System.currentTimeMillis();
            ConfigChangeLogWithBLOBs log = null;
            try {
                ConfigGroup configGroup = configGroupService.selectByPrimaryKey(groupId);
                if (configGroup == null) {
                    return;
                }
                StringBuilder oldSb = new StringBuilder();
                if (!CollectionUtils.isEmpty(oldConfigMap)) {
                    for (Map.Entry<String, String> entry : oldConfigMap.entrySet()) {
                        oldSb.append(entry.getKey()).append("=").append(entry.getValue()).append("\n");
                    }
                }

                StringBuilder newSb = new StringBuilder();
                if (!CollectionUtils.isEmpty(newCofigMap)) {
                    for (Map.Entry<String, String> entry : newCofigMap.entrySet()) {
                        newSb.append(entry.getKey()).append("=").append(entry.getValue()).append("\n");
                    }
                }
                log = new ConfigChangeLogWithBLOBs();
                log.setUserId(userId);
                log.setOperator(operator);
                log.setCreateTime(commitTime);
                log.setEnvironmentId(configGroup.getEnvironmentId());
                log.setGroupId(groupId);
                log.setGroupName(configGroup.getName());
                log.setProductId(configGroup.getProductId());
                log.setProjectId(configGroup.getProjectId());
                log.setVersionId(configGroup.getVersionId());
                log.setOldContent(oldSb.toString());
                log.setNewContent(newSb.toString());
                insertSelective(log);
                if (LOGGER.isDebugEnabled()) {
                    LOGGER.debug("saveLogWithBackground {} cast {}", GsonUtils.toJsonString(log),
                            System.currentTimeMillis() - start);
                }
            } catch (Throwable ex) {
                LOGGER.error("saveLogWithBackground error. {}", log, ex);
            }
        });
    }

    @PreDestroy
    public void stop() {
        LOGGER.info("destory configChangeLogService executor thread pool.");
        if (executor != null) {
            executor.shutdown();
        }
    }
}
