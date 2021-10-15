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
package com.baidu.brcc.utils;

import java.io.IOException;
import java.io.InputStream;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.rmi.server.ExportException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NetUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger(NetUtils.class);
    private static final String DEFAULT_LOCAL_IP = "127.0.0.1";
    private static final String DEFAULT_LOCAL_HOSTNAME = "localhost";

    // SDK版本
    private static String SDK_VERSION = "";

    // IP 信息
    private static String localIp = null;

    // 容器ID 如果rcc.containerIdEnvName不为空，则读取此变量对应的环境变量的值， 否则获取本机的hostName最为容器名
    private static String containerId = null;
    // 机房信息 如果rcc.idcEnvName不为空，则读取此变量对应的环境变量的值，默认为-
    private static String idcName = null;
    // appName 有 rcc.appName配置指定，如果不指定默认-
    private static String appName = null;

    // 是否只用局域网地址，配置key -> rcc.useOnlySiteLocalInterfaces
    private static Boolean useOnlySiteLocalInterfaces = null;

    // 首选网络，配置key -> rcc.preferredNetworks, 英文逗号分隔
    private static List<String> preferredNetworks = null;

    // 忽略网络，配置key -> rcc.ignoredInterfaces, 英文逗号分隔
    private static List<String> ignoredInterfaces = null;

    /**
     * 获取本地IP
     *
     * @return
     */
    public static String getLocalIp() {
        if (localIp != null) {
            return localIp;
        }
        InetAddress address = findFirstNonLoopbackAddress();
        if (address == null) {
            try {
                address = InetAddress.getLocalHost();
            } catch (UnknownHostException e) {
                LOGGER.error("getLocalIp error.", e);
            }
        }
        if (address == null) {
            localIp = DEFAULT_LOCAL_IP;
            containerId = DEFAULT_LOCAL_HOSTNAME;
        } else {
            localIp = address.getHostAddress();
            containerId = address.getHostName();
        }
        return localIp;
    }

    /**
     * 获取IDC
     */
    public static String getIdc() {
        if (idcName != null) {
            return idcName;
        }

        // 判断 rcc.containerIdEnvName是否有值
        String envName = System.getProperty("rcc.idcEnvName");
        if (envName == null) {
            envName = System.getProperty("rcc.idc-env-name");
        }
        if (!StringUtils.isBlank(envName)) {
            String idc = System.getenv(StringUtils.trimToEmpty(envName));
            if (!StringUtils.isBlank(idc)) {
                idcName = idc;
                return idc;
            }
        }
        idcName = "-";
        return idcName;
    }

    /**
     * 获取ContainerId
     *
     * @return
     */
    public static String getContainerId() {
        if (containerId != null) {
            return containerId;
        }

        // 判断 rcc.containerIdEnvName是否有值
        String envName = System.getProperty("rcc.containerIdEnvName");
        if (envName == null) {
            envName = System.getProperty("rcc.container-id-env-name");
        }
        if (!StringUtils.isBlank(envName)) {
            String cid = System.getenv(StringUtils.trimToEmpty(envName));
            if (!StringUtils.isBlank(cid)) {
                containerId = cid;
                return cid;
            }
        }

        // 没有指定, 将获取机器的hostName
        InetAddress address = findFirstNonLoopbackAddress();
        if (address == null) {
            try {
                address = InetAddress.getLocalHost();
            } catch (UnknownHostException e) {
                LOGGER.error("getLocalHostName error.", e);
            }
        }
        if (address == null) {
            localIp = DEFAULT_LOCAL_IP;
            containerId = DEFAULT_LOCAL_HOSTNAME;
        } else {
            localIp = address.getHostAddress();
            containerId = address.getHostName();
        }
        return containerId;
    }

    private static InetAddress findFirstNonLoopbackAddress() {
        InetAddress result = null;
        try {
            int lowest = Integer.MAX_VALUE;
            for (Enumeration<NetworkInterface> nics = NetworkInterface
                    .getNetworkInterfaces(); nics.hasMoreElements(); ) {
                NetworkInterface ifc = nics.nextElement();
                if (ifc.isUp()) {
                    if (LOGGER.isDebugEnabled()) {
                        LOGGER.debug("Testing interface: " + ifc.getDisplayName());
                    }
                    if (ifc.getIndex() < lowest || result == null) {
                        lowest = ifc.getIndex();
                    } else if (result != null) {
                        continue;
                    }

                    // @formatter:off
                    // 是否忽略的网卡，比如en0
                    if (!ignoreInterface(ifc.getDisplayName())) {
                        for (Enumeration<InetAddress> addrs = ifc
                                .getInetAddresses(); addrs.hasMoreElements(); ) {
                            InetAddress address = addrs.nextElement();
                            if (
                                // 只取IPV4的
                                    address instanceof Inet4Address
                                            // 非 127.0.0.1
                                            && !address.isLoopbackAddress()
                                            // 是否首选
                                            && isPreferredAddress(address)) {
                                if (LOGGER.isDebugEnabled()) {
                                    LOGGER.debug("Found non-loopback interface: "
                                            + ifc.getDisplayName());
                                }
                                result = address;
                            }
                        }
                    }
                    // @formatter:on
                }
            }
        } catch (IOException ex) {
            LOGGER.error("Cannot get first non-loopback address", ex);
        }

        if (result != null) {
            return result;
        }

        try {
            return InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            LOGGER.warn("Unable to retrieve localhost");
        }

        return null;
    }

    private static boolean ignoreInterface(String interfaceName) {
        for (String regex : getIgnoredInterfaces()) {
            if (interfaceName.matches(regex)) {
                if (LOGGER.isDebugEnabled()) {
                    LOGGER.debug("Ignoring interface: " + interfaceName);
                }
                return true;
            }
        }
        return false;
    }

    private static boolean isPreferredAddress(InetAddress address) {

        if (isUseOnlySiteLocalInterfaces()) {
            final boolean siteLocalAddress = address.isSiteLocalAddress();
            if (!siteLocalAddress && LOGGER.isDebugEnabled()) {
                LOGGER.debug("Ignoring address: " + address.getHostAddress());
            }
            return siteLocalAddress;
        }
        final List<String> preferredNetworks = getPreferredNetworks();
        if (preferredNetworks.isEmpty()) {
            return true;
        }
        for (String regex : preferredNetworks) {
            final String hostAddress = address.getHostAddress();
            if (hostAddress.matches(regex) || hostAddress.startsWith(regex)) {
                return true;
            }
        }
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Ignoring address: " + address.getHostAddress());
        }
        return false;
    }

    private static boolean isUseOnlySiteLocalInterfaces() {
        if (useOnlySiteLocalInterfaces != null) {
            return useOnlySiteLocalInterfaces;
        }
        String property = System.getProperty("rcc.useOnlySiteLocalInterfaces");
        if (property == null) {
            property = System.getProperty("rcc.use-only-site-local-interfaces");
        }
        if (property != null && "TRUE".equalsIgnoreCase(property.trim())) {
            useOnlySiteLocalInterfaces = true;
            return true;
        }
        useOnlySiteLocalInterfaces = false;
        return false;
    }

    private static List<String> getPreferredNetworks() {
        if (preferredNetworks != null) {
            return preferredNetworks;
        }
        String property = System.getProperty("rcc.preferredNetworks");
        if (property == null) {
            property = System.getProperty("rcc.preferred-networks");
        }
        List<String> result = new ArrayList<>();
        if (property != null && property.trim().length() > 0) {
            String[] addresses = property.trim().split("\\,");
            for (String address : addresses) {
                if (address != null && address.trim().length() > 0) {
                    result.add(address.trim());
                }
            }
        }
        preferredNetworks = result;
        return result;
    }

    private static List<String> getIgnoredInterfaces() {
        if (ignoredInterfaces != null) {
            return ignoredInterfaces;
        }

        String property = System.getProperty("rcc.ignoredInterfaces");
        if (property == null) {
            property = System.getProperty("rcc.ignored-interfaces");
        }
        List<String> result = new ArrayList<>();
        if (property != null && property.trim().length() > 0) {
            String[] addresses = property.trim().split("\\,");
            for (String address : addresses) {
                if (address != null && address.trim().length() > 0) {
                    result.add(address.trim());
                }
            }
        }
        ignoredInterfaces = result;
        return result;
    }

    public static String getAppName() {
        if (appName != null) {
            return appName;
        }
        String property = System.getProperty("rcc.appName");
        if (property == null) {
            property = System.getProperty("rcc.app-name");
        }
        if (property == null || "".equals(property.trim())) {
            appName = "-";
        } else {
            appName = property;
        }
        return appName;
    }

    public static String getSdkVersion() {
        if (!SDK_VERSION.equals("")) {
            return SDK_VERSION;
        }
        InputStream is = null;
        try {
            is = LOGGER.getClass().getResourceAsStream("/META-INF/maven/com.baidu.mapp/brcc-sdk/pom.properties");
            Properties p = new Properties();
            if (is != null) {
                p.load(is);
                SDK_VERSION = p.getProperty("version", "unknown");
            }
        } catch (IOException e) {
            LOGGER.error("Cannot get SDK version:", e);
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException ex) {
                LOGGER.error("Cannot get SDK version:", ex);
            }
        }
        return SDK_VERSION;
    }
}
