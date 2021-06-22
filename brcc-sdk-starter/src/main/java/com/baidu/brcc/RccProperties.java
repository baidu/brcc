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
package com.baidu.brcc;

import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.env.Environment;
import org.springframework.util.StringUtils;

@ConfigurationProperties(prefix = "rcc")
public class RccProperties {
    private static final String ENABLE_INTERRUPT_SERVICE = "rcc.enableInterruptService";
    private static final String ENABLE_UPDATE_CALLBACK = "rcc.enableUpdateCallback";

    private static final String CONNECTION_TIMEOUT = "rcc.connectionTimeout";
    private static final String READ_TIMEOUT = "rcc.readTimeout";
    private static final String CALLBACK_INTERVAL = "rcc.callbackInterval";
    private static final String SERVER_URL = "rcc.ccServerUrl";
    private static final String USER = "rcc.ccUser";
    private static final String PASSWORD = "rcc.ccPassword";
    private static final String VERSION = "rcc.ccVersion";
    private static final String VERSION_NAME = "rcc.ccVersionName";
    private static final String ENV_ID = "rcc.ccEnvId";
    private static final String LOCAL_RESOURCE = "rcc.localResource";
    private static final String LOG_PROPERTIES = "rcc.logProperties";
    private static final String PROJECT_NAME = "rcc.projectName";
    private static final String ENV_NAME = "rcc.envName";
    // 以下信息用于统计实例信息
    private static final String CONTAINER_ID_ENV_NAME = "rcc.containerIdEnvName";
    private static final String IDC_ENV_NAME = "rcc.idcEnvName";
    private static final String APP_NAME = "rcc.appName";
    private static final String USE_ONLY_SITE_LOCAL_INTERFACES = "rcc.useOnlySiteLocalInterfaces";
    private static final String PREFERRED_NETWORKS = "rcc.preferredNetworks";
    private static final String IGNORED_INTERFACES = "rcc.ignoredInterfaces";

    private Environment env;

    public void setEnvironment(Environment environment) {
        if (environment == null) {
            return;
        }
        env = environment;
        postAfterEnvironment();
    }

    /**
     * 将key的驼峰转换为中划线方式
     *
     * @param key
     *
     * @return
     */
    private String convertKey(String key) {
        if (StringUtils.hasText(key)) {
            char[] chars = key.toCharArray();
            StringBuilder sb = new StringBuilder();
            sb.append(chars[0]);
            for (int i = 1; i < chars.length; i++) {
                char aChar = chars[i];
                if (Character.isUpperCase(aChar)) {
                    sb.append("-");
                    sb.append(Character.toLowerCase(aChar));
                } else {
                    sb.append(aChar);
                }
            }
            return sb.toString();
        } else {
            return key;
        }
    }

    private void postAfterEnvironment() {
        Boolean enableUpdateCallBack = getValueFromEnv(ENABLE_UPDATE_CALLBACK, Boolean.class);
        if (enableUpdateCallBack != null) {
            this.enableUpdateCallback = enableUpdateCallBack;
        }
        Boolean enableInterruptService = getValueFromEnv(ENABLE_INTERRUPT_SERVICE, Boolean.class);
        if (enableInterruptService != null) {
            this.enableInterruptService = enableInterruptService;
        }

        Integer connectionTimeout = getValueFromEnv(CONNECTION_TIMEOUT, Integer.class);
        if (connectionTimeout != null) {
            this.connectionTimeout = connectionTimeout;
        }

        Integer readTimeout = getValueFromEnv(READ_TIMEOUT, Integer.class);
        if (readTimeout != null) {
            this.readTimeout = readTimeout;
        }

        Integer callbackInterval = getValueFromEnv(CALLBACK_INTERVAL, Integer.class);
        if (callbackInterval != null) {
            this.callbackInteval = callbackInterval;
        }

        this.ccServerUrl = getValueFromEnv(SERVER_URL, String.class);

        this.ccUser = getValueFromEnv(USER, String.class);

        this.ccPassword = getValueFromEnv(PASSWORD, String.class);

        Long version = getValueFromEnv(VERSION, Long.class);
        if (version != null) {
            this.ccVersion = version;
        }

        this.ccVersionName = getValueFromEnv(VERSION_NAME, String.class);

        Long envId = getValueFromEnv(ENV_ID, Long.class);
        if (envId != null) {
            this.ccEnvId = envId;
        }

        this.localResource = getValueFromEnv(LOCAL_RESOURCE, String.class);

        Boolean logProperties = getValueFromEnv(LOG_PROPERTIES, Boolean.class);
        if (logProperties != null) {
            this.logProperties = logProperties;
        }

        this.projectName = getValueFromEnv(PROJECT_NAME, String.class);

        this.envName = getValueFromEnv(ENV_NAME, String.class);

        String idc = getValueFromEnv(IDC_ENV_NAME, String.class);
        if (idc != null) {
            this.idcEnvName = idc;
            System.setProperty(IDC_ENV_NAME, idc);
        }
        String containerId = getValueFromEnv(CONTAINER_ID_ENV_NAME, String.class);
        if (containerId != null) {
            this.containerIdEnvName = containerId;
            System.setProperty(CONTAINER_ID_ENV_NAME, containerId);
        }

        String appName = getValueFromEnv(APP_NAME, String.class);
        if (appName != null) {
            this.appName = appName;
            System.setProperty(APP_NAME, appName);
        }

        Boolean useOnlySiteLocalInterfaces = getValueFromEnv(USE_ONLY_SITE_LOCAL_INTERFACES, Boolean.class);
        if (useOnlySiteLocalInterfaces != null) {
            this.useOnlySiteLocalInterfaces = useOnlySiteLocalInterfaces;
            System.setProperty(USE_ONLY_SITE_LOCAL_INTERFACES, useOnlySiteLocalInterfaces ? "true" : "false");
        }

        String preferredNetworks = getValueFromEnv(PREFERRED_NETWORKS, String.class);
        if (preferredNetworks != null) {
            this.preferredNetworks = preferredNetworks;
            System.setProperty(PREFERRED_NETWORKS, preferredNetworks);
        }

        String ignoredInterfaces = getValueFromEnv(IGNORED_INTERFACES, String.class);
        if (ignoredInterfaces != null) {
            this.ignoredInterfaces = ignoredInterfaces;
            System.setProperty(IGNORED_INTERFACES, ignoredInterfaces);
        }
    }

    private <T> T getValueFromEnv(String key, Class<T> cls) {
        T result = null;
        if (env.containsProperty(key)) {
            result = env.getProperty(key, cls);
        } else if (env.containsProperty(convertKey(key))) {
            result = env.getProperty(convertKey(key), cls);
        }
        return result;
    }

    /**
     * set if enable update call back
     */
    private boolean enableUpdateCallback = false;

    /**
     * set if enable interrupt service when api password is wrong
     */
    private boolean enableInterruptService = true;

    /**
     * connection time out value to connect configuration center server.
     */
    private int connectionTimeout = 3000;

    /**
     * set read time out value on reading value from configuration center server.
     */
    private int readTimeout = 10000;

    /**
     * set call back listen call back interval
     */
    private long callbackInteval = 2000;

    /**
     * Configuration center server URI.
     */
    private String ccServerUrl;
    /**
     * Configuration center server ccUser name.
     */
    private String ccUser;
    /**
     * Configuration center server ccPassword.
     */
    private String ccPassword;
    /**
     * Request configuration versiono
     */
    private long ccVersion;

    /**
     * 版本名称，如果不为空，则忽略ccVersion
     */
    private String ccVersionName;
    /**
     * request configuration environment id under specified ccVersion.
     */
    private long ccEnvId;

    /**
     * local property file resource. if not null will loaded on configuration center connect failed.
     */
    private String localResource;

    /**
     * if log out loaded properties
     */
    private boolean logProperties = false;

    /**
     * project name
     */
    private String projectName;

    /**
     * environment name
     */
    private String envName;

    /**
     * Set locations of properties files to be loaded.
     * Can point to classic properties files or to XML files
     * that follow JDK 1.5's properties XML format.
     * Note: Properties defined in later files will override
     * properties defined earlier files, in case of overlapping keys.
     * Hence, make sure that the most specific files are the last
     * ones in the given list of locations.
     */
    protected boolean localOverride = false;

    /**
     * Set a location of a properties file to be loaded.
     * Can point to a classic properties file or to an XML file
     * that follows JDK 1.5's properties XML format.
     */
    private Set<String> locations;

    /**
     * Set if failure to find the property resource should be ignored.
     * "true" is appropriate if the properties file is completely optional.
     * Default is "false".
     */
    private boolean ignoreResourceNotFound = false;

    /**
     * Set the encoding to use for parsing properties files.
     * Default is none, using the java.util.Properties
     * default encoding.
     * Only applies to classic properties files, not to XML files.
     * see org.springframework.util.PropertiesPersister.load
     */
    private String fileEncoding;

    /**
     * 容器ID对应的环境变量名称
     */
    private String containerIdEnvName;

    /**
     * 机房ID对应的环境变量名称
     */
    private String idcEnvName;

    /**
     * 应用名称
     */
    private String appName;

    /**
     * 上报IP只读局域网卡
     */
    private Boolean useOnlySiteLocalInterfaces;

    /**
     * 上报IP来源网卡列表，英文逗号分隔
     */
    private String preferredNetworks;

    /**
     * 上报IP来源忽略网卡列表，英文逗号分隔
     */
    private String ignoredInterfaces;

    public boolean isEnableUpdateCallback() {
        return enableUpdateCallback;
    }

    public void setEnableUpdateCallback(boolean enableUpdateCallback) {
        this.enableUpdateCallback = enableUpdateCallback;
    }

    public boolean isEnableInterruptService() {return enableInterruptService;}

    public void setEnableInterruptService(boolean enableInterruptService) {
        this.enableInterruptService = enableInterruptService;
    }

    public int getConnectionTimeout() {
        return connectionTimeout;
    }

    public void setConnectionTimeout(int connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    public int getReadTimeout() {
        return readTimeout;
    }

    public void setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
    }

    public long getCallbackInteval() {
        return callbackInteval;
    }

    public void setCallbackInteval(long callbackInteval) {
        this.callbackInteval = callbackInteval;
    }

    public String getCcServerUrl() {
        return ccServerUrl;
    }

    public void setCcServerUrl(String ccServerUrl) {
        this.ccServerUrl = ccServerUrl;
    }

    public String getCcUser() {
        return ccUser;
    }

    public void setCcUser(String ccUser) {
        this.ccUser = ccUser;
    }

    public String getCcPassword() {
        return ccPassword;
    }

    public void setCcPassword(String ccPassword) {
        this.ccPassword = ccPassword;
    }

    public long getCcVersion() {
        return ccVersion;
    }

    public void setCcVersion(long ccVersion) {
        this.ccVersion = ccVersion;
    }

    public String getCcVersionName() {
        return ccVersionName;
    }

    public void setCcVersionName(String ccVersionName) {
        this.ccVersionName = ccVersionName;
    }

    public long getCcEnvId() {
        return ccEnvId;
    }

    public void setCcEnvId(long ccEnvId) {
        this.ccEnvId = ccEnvId;
    }

    public String getLocalResource() {
        return localResource;
    }

    public void setLocalResource(String localResource) {
        this.localResource = localResource;
    }

    public boolean isLogProperties() {
        return logProperties;
    }

    public void setLogProperties(boolean logProperties) {
        this.logProperties = logProperties;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getEnvName() {
        return envName;
    }

    public void setEnvName(String envName) {
        this.envName = envName;
    }

    public boolean isLocalOverride() {
        return localOverride;
    }

    public void setLocalOverride(boolean localOverride) {
        this.localOverride = localOverride;
    }

    public Set<String> getLocations() {
        return locations;
    }

    public void setLocations(Set<String> locations) {
        this.locations = locations;
    }

    public boolean isIgnoreResourceNotFound() {
        return ignoreResourceNotFound;
    }

    public void setIgnoreResourceNotFound(boolean ignoreResourceNotFound) {
        this.ignoreResourceNotFound = ignoreResourceNotFound;
    }

    public String getFileEncoding() {
        return fileEncoding;
    }

    public void setFileEncoding(String fileEncoding) {
        this.fileEncoding = fileEncoding;
    }

    public Environment getEnv() {
        return env;
    }

    public String getContainerIdEnvName() {
        return containerIdEnvName;
    }

    public void setContainerIdEnvName(String containerIdEnvName) {
        this.containerIdEnvName = containerIdEnvName;
    }

    public String getIdcEnvName() {
        return idcEnvName;
    }

    public void setIdcEnvName(String idcEnvName) {
        this.idcEnvName = idcEnvName;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public Boolean getUseOnlySiteLocalInterfaces() {
        return useOnlySiteLocalInterfaces;
    }

    public void setUseOnlySiteLocalInterfaces(Boolean useOnlySiteLocalInterfaces) {
        this.useOnlySiteLocalInterfaces = useOnlySiteLocalInterfaces;
    }

    public String getPreferredNetworks() {
        return preferredNetworks;
    }

    public void setPreferredNetworks(String preferredNetworks) {
        this.preferredNetworks = preferredNetworks;
    }

    public String getIgnoredInterfaces() {
        return ignoredInterfaces;
    }

    public void setIgnoredInterfaces(String ignoredInterfaces) {
        this.ignoredInterfaces = ignoredInterfaces;
    }
}
