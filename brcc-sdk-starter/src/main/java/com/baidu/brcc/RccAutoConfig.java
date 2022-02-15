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

import java.util.LinkedHashSet;
import java.util.Set;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.util.CollectionUtils;

import com.baidu.brcc.spring.ConfigCenterPropertyPlaceholderConfigurer;

@Configuration
@AutoConfigureBefore(PropertyPlaceholderAutoConfiguration.class)
@Slf4j
public class RccAutoConfig implements ApplicationContextAware {

    private static final String RCC_BEAN_NAME = "configCenterPropertySourcesPlaceholderConfigurer";

    Environment environment;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        environment = applicationContext.getEnvironment();
    }

    @Bean(name = RCC_BEAN_NAME)
    @ConditionalOnMissingBean
    public ConfigCenterPropertyPlaceholderConfigurer configCenterPropertyPlaceholderConfigurer() {

        RccProperties rccProperties = new RccProperties();
        if (rccProperties.getEnv() == null) {
            rccProperties.setEnvironment(environment);
        } else if (environment == null) {
            environment = rccProperties.getEnv();
        }

        ConfigCenterPropertyPlaceholderConfigurer configCenterPropertyPlaceholderConfigurer = new
                ConfigCenterPropertyPlaceholderConfigurer();

        configCenterPropertyPlaceholderConfigurer.setCallbackInteval(rccProperties.getCallbackInteval());
        configCenterPropertyPlaceholderConfigurer.setProjectName(rccProperties.getProjectName());
        configCenterPropertyPlaceholderConfigurer.setEnvName(rccProperties.getEnvName());
        configCenterPropertyPlaceholderConfigurer.setLogProperties(rccProperties.isLogProperties());
        configCenterPropertyPlaceholderConfigurer.setCcServerUrl(rccProperties.getCcServerUrl());
        configCenterPropertyPlaceholderConfigurer.setCcPassword(rccProperties.getCcPassword());
        configCenterPropertyPlaceholderConfigurer.setCcVersion(rccProperties.getCcVersion());
        configCenterPropertyPlaceholderConfigurer.setCcVersionName(rccProperties.getCcVersionName());
        configCenterPropertyPlaceholderConfigurer.setCcEnvId(rccProperties.getCcEnvId());
        configCenterPropertyPlaceholderConfigurer.setReadTimeout(rccProperties.getReadTimeout());
        configCenterPropertyPlaceholderConfigurer.setConnectionTimeout(rccProperties.getConnectionTimeout());
        configCenterPropertyPlaceholderConfigurer.setEnableUpdateCallback(rccProperties.isEnableUpdateCallback());
        configCenterPropertyPlaceholderConfigurer.setEnableInterruptService(rccProperties.isEnableInterruptService());
        configCenterPropertyPlaceholderConfigurer.setEnableGray(rccProperties.isEnableGray());

        configCenterPropertyPlaceholderConfigurer.setLocalOverride(rccProperties.isLocalOverride());
        PathMatchingResourcePatternResolver resolver = null;
        // locations 配置的时候
        if (!CollectionUtils.isEmpty(rccProperties.getLocations())) {
            resolver = new PathMatchingResourcePatternResolver();
            Set<Resource> resources = new LinkedHashSet<Resource>();
            for (String path : rccProperties.getLocations()) {
                try {
                    Resource[] sources = resolver.getResources(path);
                    for (Resource source : sources) {
                        resources.add(source);
                    }
                } catch (Exception ex) {
                    log.error("load resources error when set locations value .the path is {}", path, ex);
                    throw new RuntimeException("load resources error", ex);
                }
            }
            configCenterPropertyPlaceholderConfigurer.setLocations(resources.toArray(new Resource[0]));
        }
        configCenterPropertyPlaceholderConfigurer.setIgnoreResourceNotFound(rccProperties.isIgnoreResourceNotFound());
        configCenterPropertyPlaceholderConfigurer.setFileEncoding(rccProperties.getFileEncoding());

        configCenterPropertyPlaceholderConfigurer.setEnvironment(environment);
        return configCenterPropertyPlaceholderConfigurer;
    }
}
