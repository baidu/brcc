/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
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
                log.error("{} arg0[{}] in redis fail.", GsonUtils.toJsonString(param), ex);
                break;
            }
        } while (times < retryTimes);
        return null;
    }

}
