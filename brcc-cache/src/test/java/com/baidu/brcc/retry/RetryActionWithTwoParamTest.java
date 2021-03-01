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
