/*
 * Copyright (c) Baidu Inc. All rights reserved.
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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
