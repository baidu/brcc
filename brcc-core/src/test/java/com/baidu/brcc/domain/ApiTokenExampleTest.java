/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.domain;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

public class ApiTokenExampleTest {
    @InjectMocks
    ApiTokenExample apiTokenExample = ApiTokenExample.newBuilder().build();

    @Before
    public void setUp() {

    }

    @Test
    public void testNewBuilder() throws Exception {
        ApiTokenExample.Builder result = ApiTokenExample.newBuilder();
    }

    @Test
    public void testOr() throws Exception {
        apiTokenExample.or(new ApiTokenExample.Criteria(null));
    }

    @Test
    public void testOr2() throws Exception {
        ApiTokenExample.Criteria result = apiTokenExample.or();

    }

    @Test
    public void testCreateCriteria() throws Exception {
        ApiTokenExample.Criteria result = apiTokenExample.createCriteria();

    }

    @Test
    public void testCreateCriteriaInternal() throws Exception {
        ApiTokenExample.Criteria result = apiTokenExample.createCriteriaInternal();

    }

    @Test
    public void testClear() throws Exception {
        apiTokenExample.clear();
    }

    @Test
    public void testAddColumns() throws Exception {
        apiTokenExample.addColumns("columns");
    }
}
