/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.common;

import static com.baidu.brcc.common.Constants.CAN_READ;
import static com.baidu.brcc.common.Constants.CAN_WRITE;
import static com.baidu.brcc.common.Constants.DEFAULT_PASSWORD;
import static com.baidu.brcc.common.Constants.IS_ADMIN;
import static com.baidu.brcc.common.Constants.IS_MEMBER;
import static com.baidu.brcc.common.Constants.MAX_PROJECT_NUM_PER_USER;
import static com.baidu.brcc.common.Constants.PROJECT_PRIVATE;
import static com.baidu.brcc.common.Constants.PROJECT_PUBLIC;

import org.junit.Assert;
import org.junit.Test;

public class ConstantsTest {
    @Test
    public void testConstantsValues() {
        Assert.assertEquals(Byte.valueOf("0"), PROJECT_PUBLIC);
        Assert.assertEquals(Byte.valueOf("1"), PROJECT_PRIVATE);
        Assert.assertEquals("123456", DEFAULT_PASSWORD);
        Assert.assertEquals(Byte.valueOf("1"), IS_ADMIN);
        Assert.assertEquals(Byte.valueOf("0"), IS_MEMBER);
        Assert.assertEquals(Integer.valueOf(50), MAX_PROJECT_NUM_PER_USER);
        Assert.assertEquals(Byte.valueOf("1"), CAN_READ);
        Assert.assertEquals(Byte.valueOf("2"), CAN_WRITE);
    }
}
