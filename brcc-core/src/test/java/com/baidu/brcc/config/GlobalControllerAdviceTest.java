/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.config;

import org.junit.Assert;
import org.junit.Test;

import com.baidu.brcc.domain.base.R;
import com.baidu.brcc.domain.exception.BizException;

public class GlobalControllerAdviceTest {
    GlobalControllerAdvice globalControllerAdvice = new GlobalControllerAdvice();

    @Test
    public void testExHandler() throws Exception {
        R result = globalControllerAdvice.bizExceptionHandler(new BizException(500, "message"));
        Assert.assertEquals(500, result.getStatus());
        Assert.assertEquals("message", result.getMsg());
    }
}
