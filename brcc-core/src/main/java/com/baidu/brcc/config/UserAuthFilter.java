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
package com.baidu.brcc.config;

import static com.baidu.brcc.common.ErrorStatusMsg.NON_LOGIN_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.NON_LOGIN_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.USER_NOT_AVAILABLE_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.USER_NOT_AVAILABLE_STATUS;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.util.AntPathMatcher;

import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.base.R;
import com.baidu.brcc.domain.em.UserRole;
import com.baidu.brcc.service.UserCache;
import com.baidu.brcc.service.UserService;
import com.baidu.brcc.utils.UserThreadLocal;
import com.baidu.brcc.utils.gson.GsonUtils;

public class UserAuthFilter implements Filter {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserAuthFilter.class);

    private UserCache userCache;

    private UserService userService;

    private final static String XTOKEN = "rcc-token";

    private List<String> noAuths;

    private byte defaultUserType;

    private AntPathMatcher antPathMatcher = new AntPathMatcher();

    public UserAuthFilter(
            List<String> noAuths,
            UserCache userCache,
            UserService userService,
            byte defaultUserType
    ) {
        if (noAuths == null) {
            noAuths = new ArrayList<>();
        }
        this.noAuths = noAuths;
        this.userCache = userCache;
        this.userService = userService;
        this.defaultUserType = defaultUserType;
    }

    public boolean noAuth(String uri) {
        for (String noAuth : noAuths) {
            boolean match = antPathMatcher.match(noAuth, uri);
            if (match) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        try {
            String uri = httpServletRequest.getRequestURI();
            boolean noAuth = noAuth(uri);
            User user = null;
            if (!noAuth) {
                User currentUser = UserThreadLocal.currentUser();
                if (null == currentUser) {
                    String xtoken = httpServletRequest.getHeader(XTOKEN);
                    if (StringUtils.isBlank(xtoken)) {
                        xtoken = httpServletRequest.getParameter(XTOKEN);
                    }
                    R r = R.error(NON_LOGIN_STATUS, NON_LOGIN_MSG);
                    try {
                        boolean flag = true;
                        if (StringUtils.isBlank(xtoken)) {
                            String userName = httpServletRequest.getRemoteUser();
                            if (StringUtils.isBlank(userName)) {
                                write(httpServletResponse, r);
                                return;
                            }
                            user = userCache.getUserByName(userName);
                            if (user == null) {
                                userService.addUserIfNotExist(userName, UserRole.NORMAL.getValue(), defaultUserType);
                                user = userCache.getUserByName(userName);
                            }
                            flag = false;
                        }
                        if (flag) {
                            user = userCache.getUserByToken(xtoken);
                            if (user == null) {
                                write(httpServletResponse, r);
                                return;
                            }
                            // 禁用状态
                            if (user.getStatus() != 0) {
                                write(httpServletResponse, R.error(USER_NOT_AVAILABLE_STATUS, USER_NOT_AVAILABLE_MSG));
                                return;
                            }
                        }
                        UserThreadLocal.setUser(user);
                    } catch (Exception e) {
                        LOGGER.error("UserAuthFilter error", e);
                        write(httpServletResponse, r);
                        return;
                    }
                } else {
                    // 禁用状态
                    if (currentUser.getStatus() != 0) {
                        write(httpServletResponse, R.error(USER_NOT_AVAILABLE_STATUS, USER_NOT_AVAILABLE_MSG));
                        return;
                    }
                }
            }
            chain.doFilter(request, response);
        } finally {
            UserThreadLocal.removeUser();
        }
    }

    private void write(HttpServletResponse httpServletResponse, R r) throws IOException {
        httpServletResponse.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);

        httpServletResponse.getWriter().print(GsonUtils.toJsonString(r));
        httpServletResponse.getWriter().flush();
        httpServletResponse.getWriter().close();
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }
}
