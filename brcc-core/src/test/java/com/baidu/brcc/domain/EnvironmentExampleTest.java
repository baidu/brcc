/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.domain;

import org.junit.Before;
import org.junit.Test;

public class EnvironmentExampleTest {

    EnvironmentExample environmentExample = EnvironmentExample.newBuilder().build();

    @Before
    public void setUp() {
    }

    @Test
    public void testNewBuilder() throws Exception {
        EnvironmentExample.Builder result = EnvironmentExample.newBuilder();

    }

    @Test
    public void testOr() throws Exception {
        environmentExample.or(new EnvironmentExample.Criteria(null));
    }

    @Test
    public void testOr2() throws Exception {
        EnvironmentExample.Criteria result = environmentExample.or();

    }

    @Test
    public void testCreateCriteria() throws Exception {
        EnvironmentExample.Criteria result = environmentExample.createCriteria();

    }

    @Test
    public void testCreateCriteriaInternal() throws Exception {
        EnvironmentExample.Criteria result = environmentExample.createCriteriaInternal();

    }

    @Test
    public void testClear() throws Exception {
        environmentExample.clear();
    }

    @Test
    public void testAddColumns() throws Exception {
        environmentExample.addColumns("columns");
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev
// .com/forum#!/testme
