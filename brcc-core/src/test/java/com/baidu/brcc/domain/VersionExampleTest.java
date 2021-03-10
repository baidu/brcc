/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.domain;

import org.junit.Before;
import org.junit.Test;

public class VersionExampleTest {



    VersionExample versionExample = VersionExample.newBuilder().build();

    @Before
    public void setUp() {

    }

    @Test
    public void testNewBuilder() throws Exception {
        VersionExample.Builder result = VersionExample.newBuilder();

    }

    @Test
    public void testOr() throws Exception {
        versionExample.or(new VersionExample.Criteria(null));
    }

    @Test
    public void testOr2() throws Exception {
        VersionExample.Criteria result = versionExample.or();

    }

    @Test
    public void testCreateCriteria() throws Exception {
        VersionExample.Criteria result = versionExample.createCriteria();

    }

    @Test
    public void testCreateCriteriaInternal() throws Exception {
        VersionExample.Criteria result = versionExample.createCriteriaInternal();

    }

    @Test
    public void testClear() throws Exception {
        versionExample.clear();
    }

    @Test
    public void testAddColumns() throws Exception {
        versionExample.addColumns("columns");
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev
// .com/forum#!/testme
