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

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySources;
import org.springframework.util.PropertiesPersister;
import org.springframework.util.ReflectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.util.StringValueResolver;

import com.baidu.brcc.ConfigLoader;

public class ConfigCenterPropertyPlaceholderConfigurerTest {
    @Mock
    Logger LOGGER;
    @Mock
    Environment environment;
    @Mock
    ApplicationContext applicationContext;
    @Mock
    Properties ccLoadedProps;
    @Mock
    Properties cachedProps;
    @Mock
    Properties rccProperties;
    @Mock
    ConfigLoader configLoader;
    @Mock
    MutablePropertySources propertySources;
    @Mock
    PropertySources appliedPropertySources;
    @Mock
    BeanFactory beanFactory;
    @Mock
    Log logger;
    @Mock
    PropertiesPersister propertiesPersister;
    @InjectMocks
    ConfigCenterPropertyPlaceholderConfigurer configCenterPropertyPlaceholderConfigurer;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSetProjectName() {
        configCenterPropertyPlaceholderConfigurer.setProjectName("project-name");
    }

    @Test
    public void testSetEnvName() {
        configCenterPropertyPlaceholderConfigurer.setEnvName("env-name");
    }

    @Test
    public void testSetEnvironment() throws Exception {
        configCenterPropertyPlaceholderConfigurer.setEnvironment(null);
        configCenterPropertyPlaceholderConfigurer.setEnvironment(mock(Environment.class));
    }

    @Test
    public void testSetLogProperties() {
        configCenterPropertyPlaceholderConfigurer.setLogProperties(true);
    }

    @Test
    public void testSetCallbackInteval() {
        configCenterPropertyPlaceholderConfigurer.setCallbackInteval(1L);
    }

    @Test
    public void testSetCcServerUrl() {
        configCenterPropertyPlaceholderConfigurer.setCcServerUrl("http://127.0.0.1:8080");
    }

    @Test
    public void testSetCcPassword() {
        configCenterPropertyPlaceholderConfigurer.setCcPassword("password");
    }

    @Test
    public void testSetCcVersion() {
        configCenterPropertyPlaceholderConfigurer.setCcVersion(1L);
    }

    @Test
    public void testCcVersionName() {
        configCenterPropertyPlaceholderConfigurer.setCcVersionName("ccversion");
    }

    @Test
    public void testCcEnvId() {
        configCenterPropertyPlaceholderConfigurer.setCcEnvId(1L);
    }

    @Test
    public void testSetReadTimeout() {
        configCenterPropertyPlaceholderConfigurer.setReadTimeout(1);
    }

    @Test
    public void testSetConnectionTimeout() {
        configCenterPropertyPlaceholderConfigurer.setConnectionTimeout(1);
    }

    @Test
    public void testSetEnableUpdateCallback() {
        configCenterPropertyPlaceholderConfigurer.setEnableUpdateCallback(true);
    }

    @Test
    public void testDoProcessProperties() throws Exception {
        ConfigurableEnvironment environment = mock(ConfigurableEnvironment.class);
        setFieldValue(configCenterPropertyPlaceholderConfigurer, "environment", environment);
        setFieldValue(configCenterPropertyPlaceholderConfigurer, "logProperties", true);
        Properties cachedProps = new Properties();
        cachedProps.put("key", "value");
        setFieldValue(configCenterPropertyPlaceholderConfigurer, "cachedProps", cachedProps);
        when(environment.getPropertySources()).thenReturn(propertySources);

        Map<String, String> map = new HashMap<>();
        map.put("k", "v");
        map.put("k2", "v3423f2346");
        map.put("k3", "");

        when(configLoader.getFromCC()).thenReturn(map);

        ConfigurableListableBeanFactory factory = mock(ConfigurableListableBeanFactory.class);
        when(factory.getBeanDefinitionNames()).thenReturn(new String[0]);
        StringValueResolver resolver = mock(StringValueResolver.class);
        configCenterPropertyPlaceholderConfigurer.doProcessProperties(factory, resolver);
    }

    @Test
    public void testDestory() throws Exception {
        ConfigCenterPropertyPlaceholderConfigurer configCenterPropertyPlaceholderConfigurer =
                new ConfigCenterPropertyPlaceholderConfigurer();
        setFieldValue(configCenterPropertyPlaceholderConfigurer, "configLoader", mock(ConfigLoader.class));
        configCenterPropertyPlaceholderConfigurer.destroy();
    }

    @Test
    public void testOnEvent() {
        ConfigCenterPropertyPlaceholderConfigurer configCenterPropertyPlaceholderConfigurer =
                new ConfigCenterPropertyPlaceholderConfigurer();
        configCenterPropertyPlaceholderConfigurer.setEnableUpdateCallback(true);
        configCenterPropertyPlaceholderConfigurer.setApplicationContext(mock(ApplicationContext.class));
        setFieldValue(configCenterPropertyPlaceholderConfigurer, "configLoader", mock(ConfigLoader.class));
        configCenterPropertyPlaceholderConfigurer.onApplicationEvent(mock(ContextRefreshedEvent.class));
    }

    @Test
    public void testGetProperties() {
        Properties cachedProps = new Properties();
        cachedProps.put("key", "value");
        setFieldValue(configCenterPropertyPlaceholderConfigurer, "cachedProps", cachedProps);

        configCenterPropertyPlaceholderConfigurer.getProperties();
    }

    public static void setFieldValue(Object target, String fieldName, Object value) {
        if (target == null || !StringUtils.hasText(fieldName)) {
            return;
        }
        Class<?> targetClass = target.getClass();
        Field field = ReflectionUtils.findField(targetClass, fieldName);
        if (field == null) {
            return;
        }
        boolean oldAccessible = field.isAccessible();
        field.setAccessible(true);
        ReflectionUtils.setField(field, target, value);
        field.setAccessible(oldAccessible);
    }
}
