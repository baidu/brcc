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

import java.io.IOException;
import java.text.MessageFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.baidu.brcc.utils.HttpClient;
import com.baidu.brcc.utils.HutoolHttpClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.CollectionUtils;

import com.baidu.brcc.exception.RccException;
import com.baidu.brcc.model.AuthVo;
import com.baidu.brcc.model.ChangedConfigItem;
import com.baidu.brcc.model.EnvVo;
import com.baidu.brcc.model.ItemVo;
import com.baidu.brcc.model.R;
import com.baidu.brcc.model.RList;
import com.baidu.brcc.model.VersionVo;
import com.baidu.brcc.utils.NetUtils;
import com.baidu.brcc.utils.StringUtils;
import com.baidu.brcc.utils.gson.GsonUtils;

@Slf4j
public class ConfigLoader {


    // 版本ID
    private static final String HEADER_VERSION_ID = "Rcc-Version-Id";
    private static final String HEADER_IDC = "Rcc-Idc";
    private static final String HEADER_CONTAINER_ID = "Rcc-Container-Id";
    private static final String HEADER_CLIENT_IP = "Rcc-Client-Ip";
    private static final String HEADER_APP_NAME = "Rcc-App-Name";
    private static final String HEADER_SDK_VERSION = "Rcc-Sdk-Version";
    private static final String HEADER_ENABLE_UPDATE_CALLBACK = "Rcc-Enable-Update-Callback";
    private static final String HEADER_CHECKSUM = "Rcc-Checksum";
    // 上次请求网络延迟
    private static final String HEADER_NET_COST = "Rcc-Net-Cost";
    // 客服端发起请求时时间戳
    private static final String HEADER_RCC_TS = "Rcc-Ts";
    private static final String HEADER_RCC_SERVER_IN_TS = "Rcc-Server-In-Ts";
    private static final String HEADER_RCC_OUT_TS = "Rcc-Out-Ts";

    private static final String AUTH_API = "/api/auth";
    private static final String ENV_API = "/api/environment/{0}";
    private static final String VERSION_API = "/api/v2/version/{0}";
    private static final String ITEM_API = "/api/item";

    private boolean enableInterruptService;
    private boolean enableGray;
    private String ccServerUrl;
    private String apiPassword;
    private String projectName;
    private String envName;
    private String ccVersionName;
    private boolean enableUpdateCallback;
    private long callbackInteval;

    private Properties rccProperties;
    private String currentToken;
    private Long envId;
    private Long versionId;
    private String lastCheckSum;
    private HttpClient httpClient;
    private Long netCost;

    private Collection<ConfigItemChangedCallable> changedCallable;
    private ConfigChangedListener configChangedListener;

    public ConfigLoader(String ccServerUrl, String apiPassword, String projectName,
                        String envName, String ccVersionName, boolean enableUpdateCallback, long connectionTimeOut,
                        long readTimeOut, long callbackInteval, boolean enableInterruptService, boolean enableGray) throws IOException {
        this.ccServerUrl = ccServerUrl;
        this.apiPassword = apiPassword;
        this.projectName = projectName;
        this.envName = envName;
        this.ccVersionName = ccVersionName;
        this.enableUpdateCallback = enableUpdateCallback;
        this.callbackInteval = callbackInteval;
        this.enableInterruptService = enableInterruptService;
        this.enableGray = enableGray;

        this.httpClient = new HutoolHttpClient((int)connectionTimeOut, (int)readTimeOut);

        init();
    }

    private void init() throws IOException {
        // 登录
        String res = login();
        if (!StringUtils.isBlank(res)) {

            // 获取环境
            getEnv();

            // 获取版本
            VersionVo version = getVersion();
            lastCheckSum = version.getCheckSum();
        }

    }

    // 登录
    public String login() throws IOException {
        String authUrl = ccServerUrl.concat(AUTH_API);
        Map<String, String> body = new HashMap<>();
        body.put("projectName", projectName);
        body.put("apiPassword", apiPassword);
        R<AuthVo> vo = this.httpClient.postJson(authUrl, AuthVo.class, GsonUtils.toJsonString(body), null, null);
        if (vo == null || vo.getData() == null || vo.getStatus() != 0) {
            String msg = null;
            if (vo == null) {
                msg = "get rcc token fail.";
            } else {
                msg = vo.getMsg();
            }
            if (vo.getStatus() == 100204 && !enableInterruptService) {
                return null;
            } else {
                throw new RccException(msg);
            }
        }
        this.currentToken = vo.getData().getToken();
        return this.currentToken;
    }

    // 根据环境名称获取环境
    public Long getEnv() throws IOException {
        if (StringUtils.isBlank(currentToken)) {
            login();
        }
        String envUrl = ccServerUrl.concat(MessageFormat.format(ENV_API, envName));
        Map<String, Object> param = new HashMap<>();
        param.put("token", currentToken);
        R<EnvVo> result = this.httpClient.get(envUrl, EnvVo.class, param, null);
        if (result == null || result.getData() == null || result.getStatus() != 0) {
            String msg = null;
            if (result == null) {
                msg = "get rcc env by name fail.";
            } else {
                msg = result.getMsg();
            }
            throw new RccException(msg);
        }
        envId = result.getData().getEnvironmentId();
        return envId;
    }

    /**
     * 心跳接口
     * 根据版本名称获取版本
     *
     * @return
     * @throws IOException
     */
    public VersionVo getVersion() throws IOException {
        if (StringUtils.isBlank(currentToken)) {
            login();
        }
        if (envId == null) {
            getEnv();
        }
        String versionUrl = ccServerUrl.concat(MessageFormat.format(VERSION_API, ccVersionName));
        Map<String, Object> param = new HashMap<>();
        param.put("token", currentToken);
        param.put("environmentId", envId);

        // 获取头部信息
        Map<String, String> header = getHeaderInfo();
        param.put("ip", header.get(HEADER_CLIENT_IP));
        param.put("containerId", header.get(HEADER_CONTAINER_ID));
        param.put("idc", header.get(HEADER_IDC));
        param.put("enableGray", enableGray);
        R<VersionVo> result = null;
        result = this.httpClient.get(versionUrl, VersionVo.class, param, header);
        if (result == null || result.getData() == null || result.getStatus() != 0) {
            String msg = null;
            if (result == null) {
                msg = "get rcc version by name fail.";
            } else {
                msg = result.getMsg();
            }
            throw new RccException(msg);
        }
        versionId = result.getData().getVersionId();
        // 计算netCost
        netCost(result);
        return result.getData();
    }

    private void netCost(R<?> r) {
        if (r == null || r.getHeader() == null) {
            return;
        }
        Long t1 = r.getHeader().get(HEADER_RCC_TS);
        Long t2 = r.getHeader().get(HEADER_RCC_SERVER_IN_TS);
        Long t3 = r.getSts();
        Long t4 = r.getHeader().get(HEADER_RCC_OUT_TS);
        if (t1 == null || t2 == null || t3 == null || t4 == null) {
            return;
        }
        this.netCost = (t2 - t1 + t4 - t3) / 2;
    }

    /**
     * 拉取得配置
     *
     * @return
     * @throws IOException
     */
    public Map<String, String> getFromCC() throws IOException {
        if (StringUtils.isBlank(currentToken)) {
            login();
        }
        String itemUrl = ccServerUrl.concat(ITEM_API);
        Map<String, Object> param = new HashMap<>();
        param.put("token", currentToken);
        param.put("versionId", versionId);

        // 获取头部信息
        Map<String, String> header = getHeaderInfo();

        RList<ItemVo> r = this.httpClient.getList(itemUrl, ItemVo.class, param, header);
        // 计算netCost
        netCost(r);
        Map<String, String> map = new HashMap<>();
        if (!CollectionUtils.isEmpty(r.getData())) {
            for (ItemVo itemVo : r.getData()) {
                map.put(itemVo.getKey(), itemVo.getValue());
            }
        }
        return map;
    }

    private Map<String, String> getHeaderInfo() {
        Map<String, String> header = new HashMap<>();
        header.put(HEADER_RCC_TS, System.currentTimeMillis() + "");
        header.put(HEADER_APP_NAME, NetUtils.getAppName());
        header.put(HEADER_CHECKSUM, lastCheckSum == null ? "-" : lastCheckSum);
        header.put(HEADER_CLIENT_IP, NetUtils.getLocalIp());
        header.put(HEADER_IDC, NetUtils.getIdc());
        header.put(HEADER_CONTAINER_ID, NetUtils.getContainerId());
        header.put(HEADER_VERSION_ID, versionId == null ? "" : versionId.toString());
        header.put(HEADER_SDK_VERSION, NetUtils.getSdkVersion());
        header.put(HEADER_ENABLE_UPDATE_CALLBACK, enableUpdateCallback ? "1" : "0");
        header.put(HEADER_NET_COST, netCost == null ? "-1" : netCost.toString());

        return header;
    }

    public synchronized void startListening(Properties props) {
        if (configChangedListener == null) {
            configChangedListener = new ConfigChangedListener(props, this);
        }

        if (configChangedListener.isStop()) {
            configChangedListener.start();
        }
    }

    protected void doCallback(List<ChangedConfigItem> changedConfigItems) {
        if (CollectionUtils.isEmpty(changedConfigItems)) {
            if (log.isDebugEnabled()) {
                log.debug("Empty changed config items call back.");
            }
            return;
        }
        if (changedCallable != null && !changedCallable.isEmpty()) {
            //for safety consider
            List<ChangedConfigItem> changedItems = Collections.unmodifiableList(changedConfigItems);

            //do call back to each call
            for (ConfigItemChangedCallable configItemChangedCallable : changedCallable) {
                try {
                    configItemChangedCallable.changed(changedItems);
                } catch (Exception e) {
                    log.error(e.getMessage(), e);
                }
            }
        }

    }

    public String getCcServerUrl() {
        return ccServerUrl;
    }

    public void setCcServerUrl(String ccServerUrl) {
        this.ccServerUrl = ccServerUrl;
    }

    public String getApiPassword() {
        return apiPassword;
    }

    public void setApiPassword(String apiPassword) {
        this.apiPassword = apiPassword;
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

    public String getCcVersionName() {
        return ccVersionName;
    }

    public void setCcVersionName(String ccVersionName) {
        this.ccVersionName = ccVersionName;
    }

    public boolean isEnableUpdateCallback() {
        return enableUpdateCallback;
    }

    public void setEnableUpdateCallback(boolean enableUpdateCallback) {
        this.enableUpdateCallback = enableUpdateCallback;
    }

    public boolean isEnableGray() {
        return enableGray;
    }

    public void setEnableGray(boolean enableGray) {
        this.enableGray = enableGray;
    }

    public Properties getRccProperties() {
        return rccProperties;
    }

    public void setRccProperties(Properties rccProperties) {
        this.rccProperties = rccProperties;
    }

    public String getCurrentToken() {
        return currentToken;
    }

    public String getLastCheckSum() {
        return lastCheckSum;
    }

    public void setLastCheckSum(String lastCheckSum) {
        this.lastCheckSum = lastCheckSum;
    }

    public void setCurrentToken(String currentToken) {
        this.currentToken = currentToken;
    }

    public long getCallbackInteval() {
        return callbackInteval;
    }

    public void setChangedCallable(Collection<ConfigItemChangedCallable> changedCallable) {
        this.changedCallable = changedCallable;
    }

    public void destory() {
        if (null != configChangedListener) {
            configChangedListener.close();
        }

    }
}
