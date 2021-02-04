/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
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

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;

import com.baidu.brcc.exception.RccException;
import com.baidu.brcc.model.AuthVo;
import com.baidu.brcc.model.ChangedConfigItem;
import com.baidu.brcc.model.EnvVo;
import com.baidu.brcc.model.ItemVo;
import com.baidu.brcc.model.R;
import com.baidu.brcc.model.RList;
import com.baidu.brcc.model.VersionVo;
import com.baidu.brcc.utils.OkHttpClientUtils;
import com.baidu.brcc.utils.gson.GsonUtils;

public class ConfigLoader {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConfigLoader.class);

    private static final String AUTH_API = "/api/auth";
    private static final String ENV_API = "/api/environment/{0}";
    private static final String VERSION_API = "/api/version/{0}";
    private static final String ITEM_API = "/api/item";

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
    private OkHttpClientUtils okHttpClientUtils;

    private Collection<ConfigItemChangedCallable> changedCallable;
    private ConfigChangedListener configChangedListener;

    public ConfigLoader(String ccServerUrl, String apiPassword, String projectName, String envName,
                        String ccVersionName, boolean enableUpdateCallback, long connectionTimeOut,
                        long readTimeOut, long callbackInteval) throws IOException {
        this.ccServerUrl = ccServerUrl;
        this.apiPassword = apiPassword;
        this.projectName = projectName;
        this.envName = envName;
        this.ccVersionName = ccVersionName;
        this.enableUpdateCallback = enableUpdateCallback;
        this.callbackInteval = callbackInteval;

        okHttpClientUtils = new OkHttpClientUtils(readTimeOut, connectionTimeOut);

        init();
    }

    private void init() throws IOException {
        // 登录
        login();

        // 获取环境
        getEnv();

        // 获取版本
        VersionVo version = getVersion();
        lastCheckSum = version.getCheckSum();
    }

    // 登录
    public String login() throws IOException {
        String authUrl = ccServerUrl.concat(AUTH_API);
        Map<String, String> body = new HashMap<>();
        body.put("projectName", projectName);
        body.put("apiPassword", apiPassword);
        R<AuthVo> vo = okHttpClientUtils.postJson(authUrl, AuthVo.class, GsonUtils.toJsonString(body), null, null);
        if (vo == null || vo.getData() == null || vo.getStatus() != 0) {
            String msg = null;
            if (vo == null) {
                msg = "get rcc token fail.";
            } else {
                msg = vo.getMsg();
            }
            throw new RccException(msg);
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
        R<EnvVo> result = okHttpClientUtils.get(envUrl, EnvVo.class, param, null);
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

    // 根据版本名称获取版本
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
        R<VersionVo> result = okHttpClientUtils.get(versionUrl, VersionVo.class, param, null);
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
        return result.getData();
    }

    public Map<String, String> getFromCC() throws IOException {
        if (StringUtils.isBlank(currentToken)) {
            login();
        }
        String itemUrl = ccServerUrl.concat(ITEM_API);
        Map<String, Object> param = new HashMap<>();
        param.put("token", currentToken);
        param.put("versionId", versionId);
        RList<ItemVo> r = okHttpClientUtils.getList(itemUrl, ItemVo.class, param, null);
        Map<String, String> map = new HashMap<>();
        if (!CollectionUtils.isEmpty(r.getData())) {
            for (ItemVo itemVo : r.getData()) {
                map.put(itemVo.getKey(), itemVo.getValue());
            }
        }
        return map;
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
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("Empty changed config items call back.");
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
                    LOGGER.error(e.getMessage(), e);
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

    }
}
