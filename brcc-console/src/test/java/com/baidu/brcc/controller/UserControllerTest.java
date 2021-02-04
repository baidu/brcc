/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.base.R;
import com.baidu.brcc.domain.em.UserRole;
import com.baidu.brcc.dto.UserDto;
import com.baidu.brcc.service.UserService;

public class UserControllerTest {
    @Mock
    UserService userService;
    @InjectMocks
    UserController userController;
    private User adminLoginUser = null;
    private User normalLoginUser = null;
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        adminLoginUser = new User();
        adminLoginUser.setName("admin");
        adminLoginUser.setToken("token2");
        adminLoginUser.setId(2L);
        adminLoginUser.setRole(UserRole.SYSADMIN.getValue());

        normalLoginUser = new User();
        normalLoginUser.setName("normal");
        normalLoginUser.setToken("token3");
        normalLoginUser.setId(3L);
        normalLoginUser.setRole(UserRole.NORMAL.getValue());
    }

    @Test
    public void testMyProfile() throws Exception {
        R<UserDto> result = userController.myProfile(adminLoginUser);
        Assert.assertEquals(0, result.getStatus());
    }
}
