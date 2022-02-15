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
package com.baidu.brcc.spring;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.env.PropertySourcesPropertyResolver;
import org.springframework.util.ReflectionUtils;
import org.springframework.util.StringValueResolver;
import org.springframework.util.SystemPropertyUtils;

import com.baidu.brcc.ConfigItemChangedCallable;
import com.baidu.brcc.ConfigLoader;
import com.baidu.brcc.exception.RccException;
import com.baidu.brcc.utils.StringUtils;

/**
 * A extend utility class for spring property configuration resolve from configuration center server.<br>
 */
@Slf4j
public class ConfigCenterPropertyPlaceholderConfigurer extends PropertySourcesPlaceholderConfigurer implements
        ApplicationContextAware, DisposableBean, ApplicationListener {

    /**
     * Logger for this class
     */
    private Environment environment;

    /**
     * spring bean factory
     */
    private ApplicationContext applicationContext;

    /**
     * rccProperties
     */
    public static final String RCC_PROPERTIES_PROPERTY_SOURCE_NAME = "rccProperties";

    /**
     * local cached props load from configuration center
     */
    protected Properties ccLoadedProps;

    protected Properties cachedProps = new Properties();

    private boolean rccLoaded = false;
    protected Properties rccProperties = null;

    /**
     * set if enable interrupt service when api password is wrong
     */
    private boolean enableInterruptService = true;

    /**
     * set if enable gray publish
     */
    private boolean enableGray = false;

    /**
     * set if enable update call back
     */
    private boolean enableUpdateCallback = false;

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
     * Configuration center server password.
     */
    private String ccPassword;
    /**
     * Request configuration version
     */
    private long ccVersion;

    /**
     * 版本名称，如果不为空，则忽略ccVersion
     */
    private String ccVersionName;
    /**
     * request configuration environment id under specified version.
     */
    private long ccEnvId;

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

    private ConfigLoader configLoader;

    /**
     * set project name
     *
     * @param projectName the projectName to set
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    private volatile boolean callbackStarted = false;

    /**
     * set environment name
     *
     * @param envName the envName to set
     */
    public void setEnvName(String envName) {
        this.envName = envName;
    }

    @Override
    public void setEnvironment(Environment environment) {
        if (environment == null) {
            return;
        }
        super.setEnvironment(environment);
        this.environment = environment;
    }

    /**
     * set logProperties
     *
     * @param logProperties the logProperties to set
     */
    public void setLogProperties(boolean logProperties) {
        this.logProperties = logProperties;
    }

    /**
     * set call back listen call back interval
     *
     * @param callbackInteval the callbackInteval to set
     */
    public void setCallbackInteval(long callbackInteval) {
        this.callbackInteval = callbackInteval;
    }


    public void setEnableInterruptService(boolean enableInterruptService) {
        this.enableInterruptService = enableInterruptService;
    }

    public void setEnableGray(boolean enableGray) {
        this.enableGray = enableGray;
    }
    /**
     * set server url
     *
     * @param ccServerUrl the ccServerUrl to set
     */
    public void setCcServerUrl(String ccServerUrl) {
        this.ccServerUrl = ccServerUrl;
    }

    /**
     * set password
     *
     * @param ccPassword the ccPassword to set
     */
    public void setCcPassword(String ccPassword) {
        this.ccPassword = ccPassword;
    }

    /**
     * set version
     *
     * @param ccVersion the ccVersion to set
     */
    public void setCcVersion(long ccVersion) {
        this.ccVersion = ccVersion;
    }

    /**
     * set version name
     *
     * @param ccVersionName the ccVersionName to set
     */
    public void setCcVersionName(String ccVersionName) {
        this.ccVersionName = ccVersionName;
    }

    /**
     * set environment id
     *
     * @param ccEnvId the ccEnvId to set
     */
    public void setCcEnvId(long ccEnvId) {
        this.ccEnvId = ccEnvId;
    }

    /**
     * set read time out value
     *
     * @param readTimeout the readTimeout to set
     */
    public void setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
    }

    /**
     * set connection time out value
     *
     * @param connectionTimeout the connectionTimeout to set
     */
    public void setConnectionTimeout(int connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    /**
     * set enableUpdateCallback value
     *
     * @param enableUpdateCallback value
     */
    public void setEnableUpdateCallback(boolean enableUpdateCallback) {
        this.enableUpdateCallback = enableUpdateCallback;
    }

    @Override
    protected void doProcessProperties(ConfigurableListableBeanFactory beanFactoryToProcess,
                                       final StringValueResolver valueResolver) {

        Properties ccProperty = new Properties();
        try {
            // 避免多次加载
            if (!rccLoaded || rccProperties == null) {
                this.rccProperties = loadPropertiesFromCC(cachedProps);
            }
            ccProperty.putAll(this.rccProperties);
        } catch (IOException ex) {
            throw new RccException("load rcc fail");
        }

        PropertySource rccPropertySource =
                new PropertiesPropertySource(RCC_PROPERTIES_PROPERTY_SOURCE_NAME, ccProperty);
        MutablePropertySources rccPropertySources = new MutablePropertySources();
        rccPropertySources.addFirst(rccPropertySource);

        if (environment instanceof ConfigurableEnvironment) {
            ConfigurableEnvironment configurableEnvironment = (ConfigurableEnvironment) environment;
            configurableEnvironment.getPropertySources().addFirst(rccPropertySource);
        }

        final PropertySourcesPropertyResolver rccPropertySourcesPropertyResolver =
                new PropertySourcesPropertyResolver(rccPropertySources);

        String valueSeparatorTmp = null;
        try {
            valueSeparatorTmp = getFieldValue(rccPropertySourcesPropertyResolver, "valueSeparator", String.class);
        } catch (Exception ex) {
                logger.error("get field valueSeparator by feflection error", ex);
        }
        if (valueSeparatorTmp == null) {
            valueSeparatorTmp = SystemPropertyUtils.VALUE_SEPARATOR;
        }
        final String valueSeparator = valueSeparatorTmp;
        final StringValueResolver rccValueResolver = new StringValueResolver() {
            @Override
            public String resolveStringValue(String strVal) {
                if (strVal.contains(valueSeparator)) {
                    if (!rccPropertySourcesPropertyResolver
                            .containsProperty(strVal.split(valueSeparator)[0].trim())) {
                        return strVal;
                    }
                }
                String resolved = rccPropertySourcesPropertyResolver.resolvePlaceholders(strVal);
                if (resolved == null) {
                    return null;
                }
                return (resolved.equals(nullValue) ? null : resolved);
            }
        };
        final StringValueResolver delegateStringResolver = new StringValueResolver() {
            @Override
            public String resolveStringValue(String strVal) {
                String resolved = rccValueResolver.resolveStringValue(strVal);
                if (resolved == null) {
                    return null;
                }
                if (resolved.equals(strVal)) {
                    // if equals means no resolve place holder
                    resolved = valueResolver.resolveStringValue(strVal);
                    return (resolved.equals(nullValue) ? null : resolved);
                }

                return resolved;
            }
        };
        super.doProcessProperties(beanFactoryToProcess, delegateStringResolver);
    }

    /**
     * log out loaded properties.<br>
     * For safety consider all value will print out only include partial string. example a result "key=jdbcpassword"
     * will finally print out as "key=jdbcpa..."
     *
     * @param props properties to log out
     */
    protected void doLogLoadedProperties(Properties props) {

        Iterator<Entry<Object, Object>> iterator = props.entrySet().iterator();
        StringBuilder logContent = new StringBuilder();
        logContent.append("Loaded property list:\n");
        while (iterator.hasNext()) {
            Entry<Object, Object> next = iterator.next();
            logContent.append(next.getKey()).append("=");

            String value = String.valueOf(next.getValue());
            if (value == null) {
                logContent.append("\n");
                continue;
            }

            int length = value.length();
            if (length < 2) {
                logContent.append("...");
            } else {
                int sub = length / 2;
                logContent.append(StringUtils.substring(value, 0, sub));
                logContent.append("...");
            }

            logContent.append("\n");

        }

        logger.info(logContent.toString());
    }

    private Map<String, String> loadFromCC() throws IOException {
        checkValid();
        return configLoader.getFromCC();
    }

    private void checkValid() throws IOException {
        if (configLoader == null) {
            configLoader = new ConfigLoader(
                    ccServerUrl,
                    ccPassword,
                    projectName,
                    envName,
                    ccVersionName,
                    enableUpdateCallback,
                    connectionTimeout,
                    readTimeout,
                    callbackInteval,
                    enableInterruptService,
                    enableGray
            );
        }

    }

    /**
     * Load configuration properties from configuration center server
     *
     * @param props properties to merge.
     */
    private Properties loadPropertiesFromCC(Properties props) throws IOException {

        Map<String, String> configItems = loadFromCC();
        Properties rccProperties = new Properties();
        // do merge
        if (configItems != null) {
            // set to cached config
            ccLoadedProps = new Properties();
            ccLoadedProps.putAll(configItems);
            rccProperties.putAll(configItems);
            props.putAll(configItems);

        }
        if (logProperties) {
            doLogLoadedProperties(rccProperties);
        }
        this.rccLoaded = true;
        return rccProperties;
    }

    @Override
    protected void loadProperties(Properties props) throws IOException {
        if (cachedProps != null) {
            props.putAll(cachedProps);
            return;
        } else {
            cachedProps = new Properties(props);
        }

        super.loadProperties(props);
    }

    /**
     * set {@link ApplicationContext} instance after it created in spring container.<br>
     * this method is call back by {@link ApplicationContextAware} interface.<br>
     *
     * @param applicationContext spring application context instance
     *
     * @throws BeansException bean create exception
     */
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    /**
     * Stop {@link ConfigLoader} listener and destroy proxy bean on spring container closing.
     *
     * @throws Exception throws any exception.
     */
    public void destroy() throws Exception {
        if (configLoader != null) {
            configLoader.destory();
        }
    }

    /**
     * listen all spring application event
     *
     * @param event spring application event
     */
    public void onApplicationEvent(ApplicationEvent event) {
        if (!callbackStarted && event instanceof ContextRefreshedEvent) {
            // start call back listening thread
            if (enableUpdateCallback) {
                Map<String, ConfigItemChangedCallable> map =
                        applicationContext.getBeansOfType(ConfigItemChangedCallable.class);

                if (map != null && !map.isEmpty()) {
                    configLoader.setChangedCallable(map.values());
                }
                configLoader.startListening(ccLoadedProps);

            }
            callbackStarted = true;
        }

    }

    /**
     * Get all loaded properties.
     *
     * @return loaded properties
     */
    public Map<String, String> getProperties() {
        if (cachedProps == null) {
            return Collections.emptyMap();
        }
        Map<String, String> ret = new HashMap(cachedProps);
        return ret;
    }

    public static <T> T getFieldValue(Object target, String fieldName, Class<T> returnType)
            throws IllegalAccessException {
        if (target == null || !StringUtils.hasText(fieldName)) {
            return null;
        }
        Class<?> targetClass = target.getClass();
        Field field = ReflectionUtils.findField(targetClass, fieldName);
        if (field == null) {
            return null;
        }
        boolean oldAccessible = field.isAccessible();
        boolean change = false;
        if (!oldAccessible) {
            field.setAccessible(true);
            change = true;
        }
        Object o = field.get(target);
        if (change) {
            field.setAccessible(oldAccessible);
        }
        return returnType.cast(o);
    }
}
