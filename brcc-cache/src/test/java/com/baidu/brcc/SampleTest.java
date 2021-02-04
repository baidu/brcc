/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import org.junit.Test;

import com.baidu.brcc.RccCacheImpl;

public class SampleTest {
    @Test
    public void test() {
        Method[] declaredMethods = RccCacheImpl.class.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            String returnClass = declaredMethod.getReturnType().getSimpleName();
            String name = declaredMethod.getName();
            Parameter[] parameters = declaredMethod.getParameters();
            System.out.println(declaredMethod.toString());

        }

    }
}
