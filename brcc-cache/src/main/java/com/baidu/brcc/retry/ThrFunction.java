/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.retry;

/**
 * 三参数功能接口定义
 * @param <P1>
 * @param <P2>
 * @param <P3>
 * @param <R>
 */
@FunctionalInterface
public interface ThrFunction<P1, P2, P3, R> {
    R apply(P1 p1, P2 p2, P3 p3);
}
