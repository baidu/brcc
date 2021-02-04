/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.config;

import static org.mockito.Mockito.mock;

import org.junit.Assert;
import org.junit.Test;

import com.baidu.brcc.domain.User;
import com.baidu.brcc.utils.UserThreadLocal;

public class LoginUserHandlerMethodArgumentResolverTest {
    LoginUserHandlerMethodArgumentResolver loginUserHandlerMethodArgumentResolver =
            new LoginUserHandlerMethodArgumentResolver();

    @Test
    public void testResolveArgument() throws Exception {
        User u = mock(User.class);
        UserThreadLocal.setUser(u);
        Object result = loginUserHandlerMethodArgumentResolver.resolveArgument(null, null, null, null);
        Assert.assertEquals(u, result);
    }
}
