/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.retry;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.dao.CannotAcquireLockException;

import com.baidu.brcc.domain.base.R;

public class RetryActionWithOneParamTest {

    @Test
    public void testAction() throws Exception {
        RetryActionWithOneParam<String, R> retryActionWithOneParam = new RetryActionWithOneParam<>(
                "print",
                3,
                "a"
        );
        R result = retryActionWithOneParam.action(
                a -> {
                    System.out.println("p1 is " + a);
                    return R.ok();
                }
        );
        Assert.assertEquals(0, result.getStatus());
    }

    @Test
    public void testActionDataAccessExceion() throws Exception {
        RetryActionWithOneParam<String, R> retryActionWithOneParam = new RetryActionWithOneParam<>(
                "print",
                3,
                "a"
        );
        R result = retryActionWithOneParam.action(
                a -> {
                    throw new CannotAcquireLockException("throw dae");
                }
        );
        Assert.assertEquals(null, result);
    }

    @Test
    public void testActionExceion() throws Exception {
        RetryActionWithOneParam<String, R> retryActionWithOneParam = new RetryActionWithOneParam<>(
                "print",
                3,
                "a"
        );
        R result = retryActionWithOneParam.action(
                a -> {
                    throw new RuntimeException("run time exception test");
                }
        );
        Assert.assertEquals(null, result);
    }
}
