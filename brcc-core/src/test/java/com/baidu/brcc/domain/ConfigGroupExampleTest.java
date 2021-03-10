/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.domain;

import org.junit.Before;
import org.junit.Test;

public class ConfigGroupExampleTest {

    ConfigGroupExample configGroupExample = ConfigGroupExample.newBuilder().build();

    @Before
    public void setUp() {

    }

    @Test
    public void testNewBuilder() throws Exception {
        ConfigGroupExample.Builder result = ConfigGroupExample.newBuilder();

    }

    @Test
    public void testOr() throws Exception {
        configGroupExample.or(new ConfigGroupExample.Criteria(null));
    }

    @Test
    public void testOr2() throws Exception {
        ConfigGroupExample.Criteria result = configGroupExample.or();

    }

    @Test
    public void testCreateCriteria() throws Exception {
        ConfigGroupExample.Criteria result = configGroupExample.createCriteria();

    }

    @Test
    public void testCreateCriteriaInternal() throws Exception {
        ConfigGroupExample.Criteria result = configGroupExample.createCriteriaInternal();

    }

    @Test
    public void testClear() throws Exception {
        configGroupExample.clear();
    }

    @Test
    public void testAddColumns() throws Exception {
        configGroupExample.addColumns("columns");
    }
}
