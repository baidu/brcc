/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.domain;

import org.junit.Before;
import org.junit.Test;

public class UserExampleTest {



    UserExample userExample = UserExample.newBuilder().build();

    @Before
    public void setUp() {

    }

    @Test
    public void testNewBuilder() throws Exception {
        UserExample.Builder result = UserExample.newBuilder();

    }

    @Test
    public void testOr() throws Exception {
        userExample.or(new UserExample.Criteria(null));
    }

    @Test
    public void testOr2() throws Exception {
        UserExample.Criteria result = userExample.or();

    }

    @Test
    public void testCreateCriteria() throws Exception {
        UserExample.Criteria result = userExample.createCriteria();

    }

    @Test
    public void testCreateCriteriaInternal() throws Exception {
        UserExample.Criteria result = userExample.createCriteriaInternal();

    }

    @Test
    public void testClear() throws Exception {
        userExample.clear();
    }

    @Test
    public void testAddColumns() throws Exception {
        userExample.addColumns("columns");
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev
// .com/forum#!/testme
