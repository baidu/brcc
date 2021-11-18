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

import org.springframework.dao.DataAccessException;

import com.baidu.brcc.utils.gson.GsonUtils;

import lombok.extern.slf4j.Slf4j;

/**
 * 三参数重试类
 *
 * @param <P1> 第一参数类型
 * @param <P2> 第二参数类型
 * @param <P3> 第三参数类型
 * @param <R> 返回结果类型
 */
@Slf4j
public class RetryActionWithThrParam<P1, P2, P3, R> {
    // 操作名称
    private String actionName;
    // 重试次数
    private int retryTimes;
    // 执行所需第一参数
    private P1 p1;
    // 执行所需第二参数
    private P2 p2;
    // 执行所需第三参数
    private P3 p3;

    public RetryActionWithThrParam(String actionName, int retryTimes, P1 p1, P2 p2, P3 p3) {
        this.actionName = actionName;
        this.retryTimes = retryTimes;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public R action(ThrFunction<P1, P2, P3, R> func) {
        int times = 0;
        do {
            times++;
            try {
                return func.apply(p1, p2, p3);
            } catch (DataAccessException ex) {
                log.warn("{} arg0[{}] arg1[{}] arg2[{}] in redis happen DataAccessException, times[{}]",
                        actionName,
                        GsonUtils.toJsonString(p1),
                        GsonUtils.toJsonString(p2),
                        GsonUtils.toJsonString(p3),
                        times,
                        ex
                );
            } catch (Exception ex) {
                log.error("{} arg0[{}] arg1[{}] arg2[{}] in redis fail.",
                        actionName,
                        GsonUtils.toJsonString(p1),
                        GsonUtils.toJsonString(p2),
                        GsonUtils.toJsonString(p3),
                        ex);
                break;
            }
        } while (times < retryTimes);
        return null;
    }

}
