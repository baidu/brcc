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

import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baidu.brcc.common.ThreadPoolUtils;
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
        ThreadPoolUtils.submitTask(() -> {
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
        ThreadPoolUtils.stop();
    }
}
