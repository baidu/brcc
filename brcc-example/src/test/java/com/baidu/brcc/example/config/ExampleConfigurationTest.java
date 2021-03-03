/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.example.config;

import org.junit.Assert;
import org.junit.Test;

import com.baidu.brcc.ConfigItemChangedCallable;
import com.baidu.brcc.DefaultConfigItemChangedCallable;

public class ExampleConfigurationTest {
    ExampleConfiguration exampleConfiguration = new ExampleConfiguration();

    @Test
    public void testInit() throws Exception {
        exampleConfiguration.init();
    }

    @Test
    public void testConfigItemChangedCallable() throws Exception {
        ConfigItemChangedCallable result = exampleConfiguration.configItemChangedCallable();
        Assert.assertEquals(DefaultConfigItemChangedCallable.class, result.getClass());
    }
}
