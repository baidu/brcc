/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc;

import java.util.LinkedHashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
public class RccAutoConfig implements ApplicationContextAware {
    private static final Logger LOGGER = LoggerFactory.getLogger(RccAutoConfig.class);

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
                    LOGGER.error("load resources error when set locations value .the path is {}", path, ex);
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
