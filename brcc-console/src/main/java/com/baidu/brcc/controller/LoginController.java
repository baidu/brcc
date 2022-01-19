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

import static com.baidu.brcc.common.ErrorStatusMsg.USER_LOGIN_NAME_EMPTY_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.USER_LOGIN_NAME_EMPTY_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.USER_LOGIN_PASSWORD_EMPTY_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.USER_LOGIN_PASSWORD_EMPTY_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.USER_LOGIN_PASSWORD_ERROR_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.USER_LOGIN_PASSWORD_ERROR_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.USER_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.USER_NOT_EXISTS_STATUS;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baidu.brcc.annotation.LoginUser;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.base.R;
import com.baidu.brcc.domain.vo.UserLoginVo;
import com.baidu.brcc.service.UserCache;
import com.baidu.brcc.service.UserService;

/**
 * 用户登录登出相关接口
 */
@Controller
@RequestMapping(path = {"console/user", "user"})
public class LoginController {

    private static final String LOGOUT_HTML_CONTENT1 = "<!DOCTYPE html> <html lang=\"en\"> <body onload=\"logout()\">"
            + " </body> <script type=\"text/javascript\"> function logout() {localStorage.setItem('rcc-token', ''); "
            + "localStorage.setItem('rcc-name', ''); localStorage.setItem('rcc-info', JSON.stringify({})); window"
            + ".location.href = \"";
    private static final String LOGOUT_HTML_CONTENT2 = "\"; } </script> </html>";

    @Autowired
    private UserService userService;

    @Autowired
    private UserCache userCache;

    @Autowired
    Environment env;

    /**
     * 登录
     *
     * @param loginVo
     *
     * @return
     */
    @PostMapping("login")
    @ResponseBody
    public R<String> login(@RequestBody UserLoginVo loginVo) {
        String username = loginVo.getName();
        if (StringUtils.isBlank(username)) {
            return R.error(USER_LOGIN_NAME_EMPTY_STATUS, USER_LOGIN_NAME_EMPTY_MSG);
        }

        String password = loginVo.getPassword();
        if (StringUtils.isBlank(password)) {
            return R.error(USER_LOGIN_PASSWORD_EMPTY_STATUS, USER_LOGIN_PASSWORD_EMPTY_MSG);
        }

        User user = userService.selectUserByName(username);
        if (user == null) {
            return R.error(USER_NOT_EXISTS_STATUS, USER_NOT_EXISTS_MSG);
        }

        String md5Password = DigestUtils.md5DigestAsHex(password.getBytes());

        if (StringUtils.equals(md5Password, user.getPassword())
                || StringUtils.equals(md5Password, user.getApiPassword())) {
            return R.ok(user.getToken());
        }

        return R.error(USER_LOGIN_PASSWORD_ERROR_STATUS, USER_LOGIN_PASSWORD_ERROR_MSG);
    }

    /**
     * 登出并清理登录信息
     *
     * @param response
     * @param user
     *
     * @throws IOException
     */
    @GetMapping("logout")
    public void logout(HttpServletResponse response, @LoginUser User user) throws IOException {
        userCache.removeByName(user.getName());
        OutputStream outputStream = response.getOutputStream();

        response.setHeader("Content-Type", MediaType.TEXT_HTML_VALUE);
        StringBuilder sb = new StringBuilder();
        sb.append(LOGOUT_HTML_CONTENT1);
        sb.append("/#/login");
        sb.append(LOGOUT_HTML_CONTENT2);
        byte[] dataByteArr = sb.toString().getBytes("UTF-8");
        outputStream.write(dataByteArr);
    }
}
