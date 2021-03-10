/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.domain;

import org.junit.Before;
import org.junit.Test;

public class ProductUserExampleTest {



    ProductUserExample productUserExample = ProductUserExample.newBuilder().build();

    @Before
    public void setUp() {

    }

    @Test
    public void testNewBuilder() throws Exception {
        ProductUserExample.Builder result = ProductUserExample.newBuilder();

    }

    @Test
    public void testOr() throws Exception {
        productUserExample.or(new ProductUserExample.Criteria(null));
    }

    @Test
    public void testOr2() throws Exception {
        ProductUserExample.Criteria result = productUserExample.or();

    }

    @Test
    public void testCreateCriteria() throws Exception {
        ProductUserExample.Criteria result = productUserExample.createCriteria();

    }

    @Test
    public void testCreateCriteriaInternal() throws Exception {
        ProductUserExample.Criteria result = productUserExample.createCriteriaInternal();

    }

    @Test
    public void testClear() throws Exception {
        productUserExample.clear();
    }

    @Test
    public void testAddColumns() throws Exception {
        productUserExample.addColumns("columns");
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev
// .com/forum#!/testme
