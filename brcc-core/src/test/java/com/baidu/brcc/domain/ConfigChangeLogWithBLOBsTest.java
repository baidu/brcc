/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
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
