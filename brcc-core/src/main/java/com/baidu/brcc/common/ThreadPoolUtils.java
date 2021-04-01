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
package com.baidu.brcc.common;

import java.util.concurrent.ThreadPoolExecutor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

public class ThreadPoolUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(ThreadPoolUtils.class);
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

    public static void submitTask(Runnable task) {
        executor.submit(task);
    }

    public static void stop() {
        LOGGER.info("destory operationLogService executor thread pool.");
        if (executor != null) {
            executor.shutdown();
        }
    }
}
