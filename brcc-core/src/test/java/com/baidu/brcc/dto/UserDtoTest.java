/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
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
