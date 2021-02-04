/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
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
