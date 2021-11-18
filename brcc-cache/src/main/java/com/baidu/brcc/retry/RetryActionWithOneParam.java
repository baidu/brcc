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
package com.baidu.brcc.retry;

import java.util.function.Function;

import org.springframework.dao.DataAccessException;

import com.baidu.brcc.utils.gson.GsonUtils;

import lombok.extern.slf4j.Slf4j;

/**
 * 一个参数形式的重试类
 * @param <P>
 * @param <R>
 */
@Slf4j
public class RetryActionWithOneParam<P, R> {

    // 操作名称
    private String actionName;
    // 失败重试次数
    private int retryTimes;
    // 执行所需参数
    private P param;

    public RetryActionWithOneParam(String actionName, int retryTimes, P param) {
        this.actionName = actionName;
        this.retryTimes = retryTimes;
        this.param = param;
    }

    public R action(Function<P, R> func) {
        int times = 0;
        do {
            times++;
            try {
                return func.apply(param);
            } catch (DataAccessException ex) {
                log.warn("{} arg0[{}] in redis happen DataAccessException, times[{}]",
                        actionName,
                        GsonUtils.toJsonString(param),
                        times,
                        ex
                );
            } catch (Exception ex) {
                log.error("{} arg0[{}] in redis fail.", actionName, GsonUtils.toJsonString(param), ex);
                break;
            }
        } while (times < retryTimes);
        return null;
    }

}
