/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.domain;

import org.junit.Before;
import org.junit.Test;

public class EnvironmentUserExampleTest {
    EnvironmentUserExample environmentUserExample = EnvironmentUserExample.newBuilder().build();

    @Before
    public void setUp() {
    }

    @Test
    public void testNewBuilder() throws Exception {
        EnvironmentUserExample.Builder result = EnvironmentUserExample.newBuilder();

    }

    @Test
    public void testOr() throws Exception {
        environmentUserExample.or(new EnvironmentUserExample.Criteria(null));
    }

    @Test
    public void testOr2() throws Exception {
        EnvironmentUserExample.Criteria result = environmentUserExample.or();

    }

    @Test
    public void testCreateCriteria() throws Exception {
        EnvironmentUserExample.Criteria result = environmentUserExample.createCriteria();

    }

    @Test
    public void testCreateCriteriaInternal() throws Exception {
        EnvironmentUserExample.Criteria result = environmentUserExample.createCriteriaInternal();

    }

    @Test
    public void testClear() throws Exception {
        environmentUserExample.clear();
    }

    @Test
    public void testAddColumns() throws Exception {
        environmentUserExample.addColumns("columns");
    }
}
