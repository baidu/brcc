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

public class ConfigChangeLogWithBLOBsTest {

    ConfigChangeLogWithBLOBs configChangeLogWithBLOBs = new ConfigChangeLogWithBLOBs();

    @Before
    public void setUp() {

    }

    @Test
    public void testSetOldContent() throws Exception {
        configChangeLogWithBLOBs.setOldContent("oldContent");
    }

    @Test
    public void testSetNewContent() throws Exception {
        configChangeLogWithBLOBs.setNewContent("newContent");
    }

    @Test
    public void testToString() throws Exception {
        String result = configChangeLogWithBLOBs.toString();

    }

    @Test
    public void testNewBuilder() throws Exception {
        ConfigChangeLog.XBuilder result = ConfigChangeLogWithBLOBs.newBuilder();

    }

    @Test
    public void testSetGroupName() throws Exception {
        configChangeLogWithBLOBs.setGroupName("groupName");
    }

    @Test
    public void testSetOperator() throws Exception {
        configChangeLogWithBLOBs.setOperator("operator");
    }

    @Test
    public void testCopyFrom() throws Exception {
        ConfigChangeLog result = configChangeLogWithBLOBs.copyFrom(new ConfigChangeLog());

    }

    @Test
    public void testCopyFrom2() throws Exception {
        ConfigChangeLog result = ConfigChangeLogWithBLOBs.copyFrom(new ConfigChangeLog(), new ConfigChangeLog());
    }

    @Test
    public void testToEmptyJsonString() throws Exception {
        String result = ConfigChangeLogWithBLOBs.toEmptyJsonString();

    }
}
