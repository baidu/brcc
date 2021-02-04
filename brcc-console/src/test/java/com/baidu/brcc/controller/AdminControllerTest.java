/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.controller;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.anyVararg;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.baidu.brcc.common.ErrorStatusMsg;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.base.Pagination;
import com.baidu.brcc.domain.base.R;
import com.baidu.brcc.domain.em.UserRole;
import com.baidu.brcc.domain.vo.RestPasswordVo;
import com.baidu.brcc.service.UserCache;
import com.baidu.brcc.service.UserService;

public class AdminControllerTest {
    @Mock
    UserService userService;
    @Mock
    UserCache userCache;
    @InjectMocks
    AdminController adminController;

    private User user = null;

    private User adminLoginUser = null;
    private User normalLoginUser = null;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        user = new User();
        user.setName("user");
        user.setToken("token");
        user.setId(1L);
        user.setRole(UserRole.NORMAL.getValue());

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
    public void testAddAdmin() throws Exception {
        when(userService.selectUserByName(anyString())).thenReturn(new User());
        when(userService.insertSelective(any())).thenReturn(1);
        when(userService.updateByPrimaryKeySelective(any())).thenReturn(1);
        R result = adminController.addAdmin(null, user);
        Assert.assertEquals(443, result.getStatus());

        result = adminController.addAdmin(normalLoginUser, user);
        Assert.assertEquals(403, result.getStatus());

        // 参数不完整
        result = adminController.addAdmin(adminLoginUser, user);
        Assert.assertEquals(ErrorStatusMsg.PARAM_MIS_STATUS.intValue(), result.getStatus());

        user.setPassword("123");
        result = adminController.addAdmin(adminLoginUser, user);
        Assert.assertEquals(0, result.getStatus());

        when(userService.selectUserByName(anyString())).thenReturn(null);
        result = adminController.addAdmin(adminLoginUser, user);
        Assert.assertEquals(0, result.getStatus());
    }

    @Test
    public void testDelAdmin() throws Exception {
        when(userService.updateByPrimaryKeySelective(any())).thenReturn(0);
        when(userService.selectByPrimaryKey(any(), anyVararg())).thenReturn(user);

        R result = adminController.addAdmin(null, user);
        Assert.assertEquals(443, result.getStatus());

        result = adminController.addAdmin(normalLoginUser, user);
        Assert.assertEquals(403, result.getStatus());

        result = adminController.delAdmin(Long.valueOf(1), adminLoginUser);
        Assert.assertEquals(0, result.getStatus());
    }

    @Test
    public void testUpdateAdmin() throws Exception {
        when(userService.updateByPrimaryKeySelective(any())).thenReturn(0);
        when(userService.selectByPrimaryKey(any(), anyVararg())).thenReturn(user);

        R result = adminController.updateAdmin(Long.valueOf(1), null, user);
        Assert.assertEquals(443, result.getStatus());

        result = adminController.updateAdmin(Long.valueOf(1), normalLoginUser, user);
        Assert.assertEquals(403, result.getStatus());

        // 参数不完整
        result = adminController.updateAdmin(Long.valueOf(1), adminLoginUser, user);
        Assert.assertEquals(0, result.getStatus());
    }

    @Test
    public void testResetPassword() throws Exception {
        when(userService.selectUserByName(anyString())).thenReturn(new User());
        when(userService.updateByPrimaryKeySelective(any())).thenReturn(0);
        RestPasswordVo restPasswordVo = new RestPasswordVo();
        R result = adminController.resetPassword(null, restPasswordVo);
        Assert.assertEquals(443, result.getStatus());

        // 参数不完整
        result = adminController.resetPassword(adminLoginUser, restPasswordVo);
        Assert.assertEquals(ErrorStatusMsg.USER_NAME_EMPTY_STATUS.intValue(), result.getStatus());
        restPasswordVo.setPassword("abc123");
        result = adminController.resetPassword(adminLoginUser, restPasswordVo);
        Assert.assertEquals(ErrorStatusMsg.USER_NAME_EMPTY_STATUS.intValue(), result.getStatus());
        restPasswordVo.setName("abc");
        result = adminController.resetPassword(adminLoginUser, restPasswordVo);
        Assert.assertEquals(0, result.getStatus());
    }

    @Test
    public void testQueryUser() throws Exception {
        Pagination<User> pagination = mock(Pagination.class);
        when(pagination.getDataList()).thenReturn(Arrays.asList(mock(User.class)));
        when(userService.<User>pagination(any(), any(), anyVararg())).thenReturn(pagination);
        R result = adminController.queryUser(1, 20, UserRole.SYSADMIN.getValue(), "name");
        Assert.assertEquals(0, result.getStatus());
    }
}
