/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.domain;

import org.junit.Before;
import org.junit.Test;

public class OperationLogExampleTest {



    OperationLogExample operationLogExample = OperationLogExample.newBuilder().build();

    @Before
    public void setUp() {

    }

    @Test
    public void testNewBuilder() throws Exception {
        OperationLogExample.Builder result = OperationLogExample.newBuilder();

    }

    @Test
    public void testOr() throws Exception {
        operationLogExample.or(new OperationLogExample.Criteria(null));
    }

    @Test
    public void testOr2() throws Exception {
        OperationLogExample.Criteria result = operationLogExample.or();

    }

    @Test
    public void testCreateCriteria() throws Exception {
        OperationLogExample.Criteria result = operationLogExample.createCriteria();

    }

    @Test
    public void testCreateCriteriaInternal() throws Exception {
        OperationLogExample.Criteria result = operationLogExample.createCriteriaInternal();

    }

    @Test
    public void testClear() throws Exception {
        operationLogExample.clear();
    }

    @Test
    public void testAddColumns() throws Exception {
        operationLogExample.addColumns("columns");
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev
// .com/forum#!/testme
