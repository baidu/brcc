/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.domain;

import org.junit.Before;
import org.junit.Test;

public class ItemTypeExampleTest {



    ItemTypeExample itemTypeExample = ItemTypeExample.newBuilder().build();

    @Before
    public void setUp() {

    }

    @Test
    public void testNewBuilder() throws Exception {
        ItemTypeExample.Builder result = ItemTypeExample.newBuilder();

    }

    @Test
    public void testOr() throws Exception {
        itemTypeExample.or(new ItemTypeExample.Criteria(null));
    }

    @Test
    public void testOr2() throws Exception {
        ItemTypeExample.Criteria result = itemTypeExample.or();

    }

    @Test
    public void testCreateCriteria() throws Exception {
        ItemTypeExample.Criteria result = itemTypeExample.createCriteria();

    }

    @Test
    public void testCreateCriteriaInternal() throws Exception {
        ItemTypeExample.Criteria result = itemTypeExample.createCriteriaInternal();

    }

    @Test
    public void testClear() throws Exception {
        itemTypeExample.clear();
    }

    @Test
    public void testAddColumns() throws Exception {
        itemTypeExample.addColumns("columns");
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev
// .com/forum#!/testme
