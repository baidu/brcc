/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.retry;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.dao.CannotAcquireLockException;

import com.baidu.brcc.domain.base.R;

public class RetryActionWithTwoParamTest {

    @Test
    public void testAction() throws Exception {
        RetryActionWithTwoParam<String, String, R> retryActionWithTwoParam = new RetryActionWithTwoParam("print", 3,
                "a", "b");
        R result = retryActionWithTwoParam.action((a, b) -> {
            System.out.println("p1 is " + a);
            System.out.println("p2 is " + b);
            return R.ok();
        });
        Assert.assertEquals(0, result.getStatus());
    }

    @Test
    public void testActionDataAccessException() throws Exception {
        RetryActionWithTwoParam<String, String, R> retryActionWithTwoParam = new RetryActionWithTwoParam("print", 3,
                "a", "b");
        R result = retryActionWithTwoParam.action((a, b) -> {
            throw new CannotAcquireLockException("throw dae");
        });
        Assert.assertEquals(null, result);
    }

    @Test
    public void testActionException() throws Exception {
        RetryActionWithTwoParam<String, String, R> retryActionWithTwoParam = new RetryActionWithTwoParam("print", 3,
                "a", "b");
        R result = retryActionWithTwoParam.action((a, b) -> {
            throw new RuntimeException("run time exception");
        });
        Assert.assertEquals(null, result);
    }
}
