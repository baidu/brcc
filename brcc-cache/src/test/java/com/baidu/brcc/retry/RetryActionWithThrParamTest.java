/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.retry;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.dao.CannotAcquireLockException;

import com.baidu.brcc.domain.base.R;

public class RetryActionWithThrParamTest {

    @Test
    public void testAction() throws Exception {
        RetryActionWithThrParam<String, String, String, R> retryActionWithThrParam = new RetryActionWithThrParam<>(
                "print",
                3,
                "a",
                "b",
                "c"
        );
        ThrFunction<String, String, String, R> thrFunction = (a, b, c) -> {
            System.out.println("p1 is " + a);
            System.out.println("p2 is " + b);
            System.out.println("p3 is " + c);
            return R.ok();
        };

        R result = retryActionWithThrParam.action(thrFunction);
        Assert.assertEquals(0, result.getStatus());
    }

    @Test
    public void testActionDataAccessException() throws Exception {
        RetryActionWithThrParam<String, String, String, R> retryActionWithThrParam = new RetryActionWithThrParam<>(
                "print",
                3,
                "a",
                "b",
                "c"
        );
        R result = retryActionWithThrParam.action(
                (a, b, c) -> {
                    throw new CannotAcquireLockException("throw dae");
                }
        );
        Assert.assertEquals(null, result);
    }

    @Test
    public void testActionException() throws Exception {
        RetryActionWithThrParam<String, String, String, R> retryActionWithThrParam = new RetryActionWithThrParam<>(
                "print",
                3,
                "a",
                "b",
                "c"
        );
        R result = retryActionWithThrParam.action(
                (a, b, c) -> {
                    throw new RuntimeException("run time exception");
                }
        );
        Assert.assertEquals(null, result);
    }
}
