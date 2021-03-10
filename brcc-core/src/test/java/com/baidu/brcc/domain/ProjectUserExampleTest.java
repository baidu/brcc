/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.domain;

import org.junit.Before;
import org.junit.Test;

public class ProjectUserExampleTest {



    ProjectUserExample projectUserExample = ProjectUserExample.newBuilder().build();

    @Before
    public void setUp() {

    }

    @Test
    public void testNewBuilder() throws Exception {
        ProjectUserExample.Builder result = ProjectUserExample.newBuilder();

    }

    @Test
    public void testOr() throws Exception {
        projectUserExample.or(new ProjectUserExample.Criteria(null));
    }

    @Test
    public void testOr2() throws Exception {
        ProjectUserExample.Criteria result = projectUserExample.or();

    }

    @Test
    public void testCreateCriteria() throws Exception {
        ProjectUserExample.Criteria result = projectUserExample.createCriteria();

    }

    @Test
    public void testCreateCriteriaInternal() throws Exception {
        ProjectUserExample.Criteria result = projectUserExample.createCriteriaInternal();

    }

    @Test
    public void testClear() throws Exception {
        projectUserExample.clear();
    }

    @Test
    public void testAddColumns() throws Exception {
        projectUserExample.addColumns("columns");
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev
// .com/forum#!/testme
