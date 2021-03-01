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
package com.baidu.brcc.dto;

import org.junit.Assert;
import org.junit.Test;

public class UserDtoTest {
    UserDto userDto = new UserDto();

    @Test
    public void testSetUserId() throws Exception {
        userDto.setUserId(Long.valueOf(1));
    }

    @Test
    public void testSetName() throws Exception {
        userDto.setName("name");
    }

    @Test
    public void testSetType() throws Exception {
        userDto.setType(Byte.valueOf("00110"));
    }

    @Test
    public void testSetRole() throws Exception {
        userDto.setRole(Byte.valueOf("00110"));
    }

    @Test
    public void testEquals() throws Exception {
        boolean result = userDto.equals("o");
        Assert.assertEquals(false, result);
    }

    @Test
    public void testCanEqual() throws Exception {
        boolean result = userDto.canEqual("other");
        Assert.assertEquals(false, result);
    }

    @Test
    public void testHashCode() throws Exception {
        UserDto userDto = new UserDto();
        userDto.setUserId(1L);
        int result = userDto.hashCode();
        Assert.assertEquals(12475003, result);
    }

    @Test
    public void testToString() throws Exception {
        UserDto userDto = new UserDto();
        userDto.setUserId(1L);
        String result = userDto.toString();
        Assert.assertEquals("UserDto(userId=1, name=null, type=null, role=null)", result);
    }
}
