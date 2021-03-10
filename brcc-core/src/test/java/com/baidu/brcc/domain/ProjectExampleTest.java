/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.domain;

import org.junit.Before;
import org.junit.Test;

public class ProjectExampleTest {



    ProjectExample projectExample = ProjectExample.newBuilder().build();

    @Before
    public void setUp() {

    }

    @Test
    public void testNewBuilder() throws Exception {
        ProjectExample.Builder result = ProjectExample.newBuilder();

    }

    @Test
    public void testOr() throws Exception {
        projectExample.or(new ProjectExample.Criteria(null));
    }

    @Test
    public void testOr2() throws Exception {
        ProjectExample.Criteria result = projectExample.or();

    }

    @Test
    public void testCreateCriteria() throws Exception {
        ProjectExample.Criteria result = projectExample.createCriteria();

    }

    @Test
    public void testCreateCriteriaInternal() throws Exception {
        ProjectExample.Criteria result = projectExample.createCriteriaInternal();

    }

    @Test
    public void testClear() throws Exception {
        projectExample.clear();
    }

    @Test
    public void testAddColumns() throws Exception {
        projectExample.addColumns("columns");
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev
// .com/forum#!/testme
