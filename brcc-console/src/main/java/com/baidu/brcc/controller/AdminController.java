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
package com.baidu.brcc.controller;

import static com.baidu.brcc.common.ErrorStatusMsg.NON_LOGIN_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.NON_LOGIN_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PRIV_MIS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PRIV_MIS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.SERVER_ERROR_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.SERVER_ERROR_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.USER_NAME_EMPTY_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.USER_NAME_EMPTY_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.USER_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.USER_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.USER_PASSWORD_EMPTY_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.USER_PASSWORD_EMPTY_STATUS;
import static org.apache.commons.lang3.StringUtils.trim;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baidu.brcc.annotation.LoginUser;
import com.baidu.brcc.common.ErrorStatusMsg;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.UserExample;
import com.baidu.brcc.domain.base.Pagination;
import com.baidu.brcc.domain.base.R;
import com.baidu.brcc.domain.em.Deleted;
import com.baidu.brcc.domain.em.UserRole;
import com.baidu.brcc.domain.vo.RestPasswordVo;
import com.baidu.brcc.domain.vo.UserVo;
import com.baidu.brcc.service.UserCache;
import com.baidu.brcc.service.UserService;
import com.baidu.brcc.utils.bcrypt.Md5Util;

import lombok.extern.slf4j.Slf4j;

/**
 * 管理员、用户先关接口
 */
@Slf4j
@RestController
@RequestMapping(path={"/console/admin","/admin"})
public class AdminController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserCache userCache;

    /**
     * 添加管理员、用户
     *
     * @param loginUser
     * @param newUser
     *
     * @return
     */
    @PostMapping("addAdmin")
    public R addAdmin(@LoginUser User loginUser, @RequestBody User newUser) {

        if (null == loginUser) {
            return R.error(NON_LOGIN_STATUS, NON_LOGIN_MSG);
        }
        if (!UserRole.SYSADMIN.getValue().equals(loginUser.getRole())) {
            return R.error(PRIV_MIS_STATUS, PRIV_MIS_MSG);
        }

        String curName = trim(newUser.getName());
        String curPassword = trim(newUser.getPassword());
        if (Strings.isEmpty(curName) || Strings.isEmpty(curPassword)) {
            return R.error(ErrorStatusMsg.PARAM_MIS_STATUS, ErrorStatusMsg.PARAM_MIS_MSG);
        }
        newUser.setName(curName);
        Date now = new Date();
        newUser.setUpdateTime(now);
        newUser.setPassword(Md5Util.md5(newUser.getPassword()));
        newUser.setToken(UUID.randomUUID().toString());

        try {

            // 判断是否存在
            User user = userService.selectUserByName(curName);
            if (user == null) {
                newUser.setCreateTime(now);
                Integer cnt = userService.insertSelective(newUser);
                if (cnt <= 0) {
                    return R.error(SERVER_ERROR_STATUS, SERVER_ERROR_MSG);
                }
            } else {
                user.setStatus(Deleted.OK.getValue());
                user.setUpdateTime(now);
                userService.updateByPrimaryKeySelective(user);
                return R.ok(user.getId());
            }

        } catch (Exception e) {
            log.error("add user error.", e);
            return R.error(SERVER_ERROR_STATUS, SERVER_ERROR_MSG);
        }
        userCache.removeByName(curName);
        return R.ok(newUser.getId());
    }

    /**
     * 删除管理员、用户
     *
     * @param userId
     * @param loginUser
     *
     * @return
     */
    @PostMapping("delAdmin/{userId}")
    public R delAdmin(@PathVariable Long userId, @LoginUser User loginUser) {
        if (loginUser == null) {
            return R.error(NON_LOGIN_STATUS, NON_LOGIN_MSG);
        }
        if (!UserRole.SYSADMIN.getValue().equals(loginUser.getRole())) {
            return R.error(PRIV_MIS_STATUS, PRIV_MIS_MSG);
        }
        try {
            User user = userService.selectByPrimaryKey(userId);
            if (user == null || Deleted.DELETE.getValue().equals(user.getStatus())) {
                return R.error(USER_NOT_EXISTS_STATUS, USER_NOT_EXISTS_MSG);
            }
            userService.updateByPrimaryKeySelective(User.newBuilder()
                    .status(Deleted.DELETE.getValue())
                    .id(userId)
                    .build());
            userCache.removeByName(user.getName());
            return R.ok();

        } catch (Exception e) {
            log.error("delete user error.", e);
            return R.error(SERVER_ERROR_STATUS, SERVER_ERROR_MSG);
        }
    }

    /**
     * 更新用户
     *
     * @param userId
     * @param loginUser
     * @param newUser
     *
     * @return
     */
    @PostMapping("updateAdmin/{userId}")
    public R updateAdmin(@PathVariable Long userId,
                         @LoginUser User loginUser,
                         @RequestBody User newUser) {

        if (loginUser == null) {
            return R.error(NON_LOGIN_STATUS, NON_LOGIN_MSG);
        }

        if (userId == null) {
            return R.error(ErrorStatusMsg.PARAM_MIS_STATUS, ErrorStatusMsg.PARAM_MIS_MSG);
        }

        try {
            User user = userService.selectByPrimaryKey(userId);
            if (user == null || Deleted.DELETE.getValue().equals(user.getStatus())) {
                return R.error(USER_NOT_EXISTS_STATUS, USER_NOT_EXISTS_MSG);
            }
            if (!UserRole.SYSADMIN.getValue().equals(loginUser.getRole())
                    || (user.getId() == null || !user.getId().equals(loginUser.getId()))) {
                return R.error(PRIV_MIS_STATUS, PRIV_MIS_MSG);
            }
            newUser.setId(userId);
            // 不更新密码
            newUser.setPassword(null);
            newUser.setUpdateTime(new Date());
            userService.updateByPrimaryKeySelective(newUser);
            userCache.removeByName(user.getName());
            return R.ok(newUser.getId());

        } catch (Exception e) {
            log.error("delete user error.", e);
            return R.error(SERVER_ERROR_STATUS, SERVER_ERROR_MSG);
        }
    }

    /**
     * 重置密码
     *
     * @param loginUser
     * @param restUser
     *
     * @return
     */
    @PostMapping("resetPassword")
    public R resetPassword(@LoginUser User loginUser,
                           @RequestBody RestPasswordVo restUser) {

        if (loginUser == null) {
            return R.error(NON_LOGIN_STATUS, NON_LOGIN_MSG);
        }
        String username = restUser.getName();
        if (StringUtils.isBlank(username)) {
            return R.error(USER_NAME_EMPTY_STATUS, USER_NAME_EMPTY_MSG);
        }
        String password = restUser.getPassword();
        if (StringUtils.isBlank(password)) {
            return R.error(USER_PASSWORD_EMPTY_STATUS, USER_PASSWORD_EMPTY_MSG);
        }
        try {
            User user = userService.selectUserByName(username);
            if (user == null || Deleted.DELETE.getValue().equals(user.getStatus())) {
                return R.error(USER_NOT_EXISTS_STATUS, USER_NOT_EXISTS_MSG);
            }
            if (!UserRole.SYSADMIN.getValue().equals(loginUser.getRole())
                    && (user.getId() == null || !user.getId().equals(loginUser.getId()))) {
                return R.error(PRIV_MIS_STATUS, PRIV_MIS_MSG);
            }
            User restPasswordUser = new User();
            restPasswordUser.setId(user.getId());
            Date now = new Date();
            restPasswordUser.setUpdateTime(now);
            restPasswordUser.setPassword(Md5Util.md5(restUser.getPassword()));
            restPasswordUser.setToken(UUID.randomUUID().toString());
            userService.updateByPrimaryKeySelective(restPasswordUser);
            userCache.removeByName(user.getName());
        } catch (Exception e) {
            return R.error();
        }
        return R.ok();
    }

    /**
     * 分页查询用户
     *
     * @param pageNo
     * @param pageSize
     * @param userRole
     * @param name
     *
     * @return
     */
    @GetMapping("queryUser")
    public R queryUser(@RequestParam(value = "pageNo", defaultValue = "1") Integer pageNo,
                       @RequestParam(value = "pageSize", defaultValue = "20") Integer pageSize,
                       @RequestParam(value = "userRole", required = false) Byte userRole,
                       @RequestParam(value = "name", defaultValue = "", required = false) String name) {

        int offset = (pageNo - 1) * pageSize;
        Pagination<UserVo> pagination = userService.pagination(
                UserExample.newBuilder()
                        .start(offset)
                        .limit(pageSize)
                        .build()
                        .createCriteria()
                        .andNameLikeBoth(name, StringUtils.isNotBlank(name))
                        .andStatusEqualTo(Deleted.OK.getValue())
                        .andRoleEqualTo(userRole, Objects.nonNull(userRole))
                        .toExample(),
                item -> {
                    UserVo userVo = new UserVo();
                    userVo.setCreateTime(item.getCreateTime());
                    userVo.setUserId(item.getId());
                    userVo.setUserName(item.getName());
                    userVo.setStatus(item.getStatus());
                    userVo.setUserRole(item.getRole());
                    userVo.setUpdateTime(item.getUpdateTime());
                    return userVo;
                }
        );
        return R.ok(pagination);
    }

}
