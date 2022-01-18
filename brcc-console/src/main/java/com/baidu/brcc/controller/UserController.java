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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baidu.brcc.annotation.LoginUser;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.base.R;
import com.baidu.brcc.dto.UserDto;
import com.baidu.brcc.service.UserService;

@RestController
@RequestMapping(path = {"console/user", "user"})
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 获取我的基本信息
     * @param user
     * @return
     */
    @GetMapping("profile")
    public R<UserDto> myProfile(@LoginUser User user) {
        if (user == null) {
            return R.error(NON_LOGIN_STATUS, NON_LOGIN_MSG);
        }
        UserDto userDto = new UserDto();
        userDto.setUserId(user.getId());
        userDto.setName(user.getName());
        userDto.setRole(user.getRole());
        userDto.setType(user.getType());
        return R.ok(userDto);
    }

}
