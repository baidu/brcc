/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.domain;

import org.junit.Before;
import org.junit.Test;

public class ConfigChangeLogExampleTest {

    ConfigChangeLogExample configChangeLogExample = ConfigChangeLogExample.newBuilder().build();

    @Before
    public void setUp() {

    }

    @Test
    public void testNewBuilder() throws Exception {
        ConfigChangeLogExample.Builder result = ConfigChangeLogExample.newBuilder();

    }

    @Test
    public void testOr() throws Exception {
        configChangeLogExample.or(new ConfigChangeLogExample.Criteria(null));
    }

    @Test
    public void testOr2() throws Exception {
        ConfigChangeLogExample.Criteria result = configChangeLogExample.or();

    }

    @Test
    public void testCreateCriteria() throws Exception {
        ConfigChangeLogExample.Criteria result = configChangeLogExample.createCriteria();

    }

    @Test
    public void testCreateCriteriaInternal() throws Exception {
        ConfigChangeLogExample.Criteria result = configChangeLogExample.createCriteriaInternal();

    }

    @Test
    public void testClear() throws Exception {
        configChangeLogExample.clear();
    }

    @Test
    public void testAddColumns() throws Exception {
        configChangeLogExample.addColumns("columns");
    }
}
