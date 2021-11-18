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
import javax.servlet.http.HttpServletResponse;

import com.baidu.brcc.utils.LogFilter;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.baidu.brcc.common.InstanceEventType;
import com.baidu.brcc.dto.InstanceInfoEventDto;
import com.baidu.brcc.service.BrccInstanceService;

public class UriCostFilter implements Filter {
    private Logger LOGGER = LoggerFactory.getLogger(UriCostFilter.class);

    private static final String HEADER_VERSION_ID = "Rcc-Version-Id";
    private static final String HEADER_IDC = "Rcc-Idc";
    private static final String HEADER_CONTAINER_ID = "Rcc-Container-Id";
    private static final String HEADER_CLIENT_IP = "Rcc-Client-Ip";
    private static final String HEADER_APP_NAME = "Rcc-App-Name";
    private static final String HEADER_SDK_VERSION = "Rcc-Sdk-Version";
    private static final String HEADER_ENABLE_UPDATE_CALLBACK = "Rcc-Enable-Update-Callback";
    private static final String HEADER_CHECKSUM = "Rcc-Checksum";
    private static final String HEADER_NET_COST = "Rcc-Net-Cost";
    private final static String HEADER_RCC_TS = "Rcc-Ts";
    private static final String HEADER_RCC_SERVER_IN_TS = "Rcc-Server-In-Ts";

    private static final String ACCESS_CONTROL_EXPOSE_HEADERS = "Rcc-Ts, Rcc-Server-In-Ts, Rcc-Server-Out-Ts";

    private BrccInstanceService brccInstanceService;

    public UriCostFilter(BrccInstanceService brccInstanceService) {
        this.brccInstanceService = brccInstanceService;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        String uri = httpServletRequest.getRequestURI();
        if (StringUtils.startsWith(uri, "//")) {
            uri = uri.substring(1);
        }
        httpServletResponse.setHeader("Access-Control-Expose-Headers", ACCESS_CONTROL_EXPOSE_HEADERS);
        collectionHeaderInfo(uri, httpServletRequest);
        long start = System.currentTimeMillis();
        // 设置入场时间戳
        httpServletResponse.setHeader(HEADER_RCC_SERVER_IN_TS, start + "");
        long rccTs = 0;
        String frontStartTs = httpServletRequest.getHeader(HEADER_RCC_TS);
        // 透传前端调用时间戳
        httpServletResponse.setHeader(HEADER_RCC_TS, frontStartTs);
        if (StringUtils.isNumeric(frontStartTs)) {
            try {
                rccTs = Long.parseLong(frontStartTs);
            } catch (Exception ex) {
                LOGGER.error("parseLong [{}] error.", frontStartTs);
            }
        }
        if (LOGGER.isDebugEnabled() && !StringUtils.startsWith(uri, "/actuator")) {
            try {
                chain.doFilter(request, response);
            } finally {
                long end = System.currentTimeMillis();
                // doFilter后写header将无效
                // httpServletResponse.setHeader(HEADER_RCC_SERVER_OUT_TS, end + "");
                if(!uri.endsWith(".js") && !uri.endsWith(".css") && !uri.startsWith("/img/")
                        && !uri.startsWith("/index/") && !uri.endsWith(".png")) {
                    uri = LogFilter.getUrl(request);
                    LOGGER.debug(
                            "request_uri\t[{}]\tnet_cost[{}]\tserver_cost[{}]\tremote_addr[{}]",
                            uri,
                            rccTs > 0 ? start - rccTs : -1,
                            end - start,
                            request.getRemoteAddr()
                    );
                }
            }
        } else {
            chain.doFilter(request, response);
        }
    }

    private void collectionHeaderInfo(String uri, HttpServletRequest httpServletRequest) {
        if (StringUtils.startsWith(uri, "/api/v2/version/") || StringUtils.equals(uri, "/api/item")) {
            InstanceInfoEventDto event = new InstanceInfoEventDto();
            // 心跳接口 || 拉取配置接口
            String versionId = httpServletRequest.getHeader(HEADER_VERSION_ID);
            event.setVersionId(versionId);
            String idc = httpServletRequest.getHeader(HEADER_IDC);
            event.setIdc(idc);
            String containerId = httpServletRequest.getHeader(HEADER_CONTAINER_ID);
            event.setContainerId(containerId);
            String clientIp = httpServletRequest.getHeader(HEADER_CLIENT_IP);
            event.setClientIp(clientIp);
            String appName = httpServletRequest.getHeader(HEADER_APP_NAME);
            event.setAppName(appName);
            String sdkVersion = httpServletRequest.getHeader(HEADER_SDK_VERSION);
            event.setSdkVersion(sdkVersion);
            String updateCallback = httpServletRequest.getHeader(HEADER_ENABLE_UPDATE_CALLBACK);
            event.setUpdateCallback(updateCallback);
            String checkSum = httpServletRequest.getHeader(HEADER_CHECKSUM);
            event.setCheckSum(checkSum);
            String netCost = httpServletRequest.getHeader(HEADER_NET_COST);
            event.setNetCost(netCost);
            String versionName = "";
            String envId = "";
            if (StringUtils.startsWith(uri, "/api/v2/version/")) {
                if (StringUtils.isBlank(versionId)) {
                    versionName = uri.substring(13);
                    event.setVersionName(versionName);
                    envId = httpServletRequest.getParameter("environmentId");
                    event.setEnvId(envId);
                }
                event.setEventType(InstanceEventType.Heartbeat);
            } else {
                event.setEventType(InstanceEventType.ConfigPull);
            }
            brccInstanceService.submitEvent(event);
        }
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }
}
