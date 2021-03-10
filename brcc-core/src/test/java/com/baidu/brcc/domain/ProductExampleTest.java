/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.domain;

import org.junit.Before;
import org.junit.Test;

public class ProductExampleTest {



    ProductExample productExample = ProductExample.newBuilder().build();

    @Before
    public void setUp() {

    }

    @Test
    public void testNewBuilder() throws Exception {
        ProductExample.Builder result = ProductExample.newBuilder();

    }

    @Test
    public void testOr() throws Exception {
        productExample.or(new ProductExample.Criteria(null));
    }

    @Test
    public void testOr2() throws Exception {
        ProductExample.Criteria result = productExample.or();

    }

    @Test
    public void testCreateCriteria() throws Exception {
        ProductExample.Criteria result = productExample.createCriteria();

    }

    @Test
    public void testCreateCriteriaInternal() throws Exception {
        ProductExample.Criteria result = productExample.createCriteriaInternal();

    }

    @Test
    public void testClear() throws Exception {
        productExample.clear();
    }

    @Test
    public void testAddColumns() throws Exception {
        productExample.addColumns("columns");
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev
// .com/forum#!/testme
