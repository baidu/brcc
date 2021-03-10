/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.domain;

import org.junit.Before;
import org.junit.Test;

public class ConfigItemExampleTest {

    ConfigItemExample configItemExample = ConfigItemExample.newBuilder().build();

    @Before
    public void setUp() {

    }

    @Test
    public void testNewBuilder() throws Exception {
        ConfigItemExample.Builder result = ConfigItemExample.newBuilder();

    }

    @Test
    public void testOr() throws Exception {
        configItemExample.or(new ConfigItemExample.Criteria(null));
    }

    @Test
    public void testOr2() throws Exception {
        ConfigItemExample.Criteria result = configItemExample.or();

    }

    @Test
    public void testAnd() throws Exception {
        configItemExample.and(new ConfigItemExample.Criteria(null));
    }

    @Test
    public void testAnd2() throws Exception {
        ConfigItemExample.Criteria result = configItemExample.and();

    }

    @Test
    public void testCreateCriteria() throws Exception {
        ConfigItemExample.Criteria result = configItemExample.createCriteria();

    }

    @Test
    public void testCreateCriteriaInternal() throws Exception {
        ConfigItemExample.Criteria result = configItemExample.createCriteriaInternal();

    }

    @Test
    public void testClear() throws Exception {
        configItemExample.clear();
    }

    @Test
    public void testAddColumns() throws Exception {
        configItemExample.addColumns("columns");
    }
}

