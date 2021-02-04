/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.service.impl;

import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import com.baidu.brcc.dao.OperationLogMapper;
import com.baidu.brcc.dao.base.BaseMapper;
import com.baidu.brcc.domain.OperationLog;
import com.baidu.brcc.domain.OperationLogExample;
import com.baidu.brcc.service.OperationLogService;
import com.baidu.brcc.service.base.GenericServiceImpl;

@Service("operationLogService")
public class OperationLogServiceImpl extends GenericServiceImpl<OperationLog, Long, OperationLogExample>
        implements OperationLogService {

    private static final Logger LOGGER = LoggerFactory.getLogger(OperationLogServiceImpl.class);
    /**
     * 执行器
     */
    private static ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();

    static {
        executor.setThreadNamePrefix("save-operation-log-");
        executor.setCorePoolSize(2);
        executor.setMaxPoolSize(2);
        // 设置队列容量
        executor.setQueueCapacity(5000);
        // 是否关闭的时候等待任务执行结束
        executor.setWaitForTasksToCompleteOnShutdown(true);
        // 默认是0，因此不等待，现设置为5秒
        executor.setAwaitTerminationSeconds(5);
        executor.setKeepAliveSeconds(600);
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        executor.initialize();

        LOGGER.info("operationLogService start a ThreadPoolTaskExecutor with 2 core pool ,2 max pool size, 5000 queue"
                + " capacity");
    }

    @Autowired
    private OperationLogMapper operationLogMapper;

    @Override
    public BaseMapper<OperationLog, Long, OperationLogExample> getMapper() {
        return operationLogMapper;
    }

    @Override
    public OperationLogExample newExample() {
        return OperationLogExample.newBuilder().build();
    }

    @Override
    public OperationLogExample newIdInExample(List<Long> ids) {
        return OperationLogExample.newBuilder().build().createCriteria().andIdIn(ids).toExample();
    }

    @Override
    public void saveLogWithBackground(Long userId, String operator, String scene, String request, String response,
                                      String remoteAddress) {
        executor.submit(() -> {
            long start = System.currentTimeMillis();
            OperationLog log = OperationLog.newBuilder()
                    .userId(userId)
                    .operator(operator)
                    .scene(scene)
                    .request(request)
                    .response(response)
                    .createTime(new Date())
                    .remoteAddress(remoteAddress)
                    .build();
            try {
                insertSelective(log);
                if (LOGGER.isDebugEnabled()) {
                    LOGGER.debug("saveLogWithBackground {} cast {}", log, System.currentTimeMillis() - start);
                }
            } catch (Throwable ex) {
                LOGGER.error("saveLogWithBackground error. {}", log, ex);
            }
        });
    }

    @PreDestroy
    public void stop() {
        LOGGER.info("destory operationLogService executor thread pool.");
        if (executor != null) {
            executor.shutdown();
        }
    }
}
