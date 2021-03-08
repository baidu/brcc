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

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UriCostFilter implements Filter {
    private Logger LOGGER = LoggerFactory.getLogger(UriCostFilter.class);

    private final static String RCC_TS = "rcc-ts";

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        String uri = httpServletRequest.getRequestURI();
        if (LOGGER.isDebugEnabled() && !StringUtils.startsWith(uri, "/actuator")) {
            long start = System.currentTimeMillis();
            long rccTs = 0;

            try {
                String xtoken = httpServletRequest.getHeader(RCC_TS);
                if (StringUtils.isNumeric(xtoken)) {
                    try {
                        rccTs = Long.parseLong(xtoken);
                    } catch (Exception ex) {
                        LOGGER.error("parseLong [{}] error.", xtoken);
                    }
                }
                chain.doFilter(request, response);
            } finally {
                LOGGER.debug(
                        "request_uri\t[{}]\tnet_cost[{}]\tserver_cost[{}]\tremote_addr[{}]",
                        uri,
                        rccTs > 0 ? start - rccTs : -1,
                        System.currentTimeMillis() - start,
                        request.getRemoteAddr()
                );
            }
        } else {
            chain.doFilter(request, response);
        }
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }
}
