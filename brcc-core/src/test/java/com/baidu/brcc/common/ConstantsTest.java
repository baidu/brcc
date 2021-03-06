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
