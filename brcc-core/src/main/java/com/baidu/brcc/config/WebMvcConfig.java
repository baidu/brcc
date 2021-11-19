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

import java.util.List;

import com.baidu.brcc.interceptor.ApiCountInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.baidu.brcc.service.BrccInstanceService;
import com.baidu.brcc.service.UserCache;
import com.baidu.brcc.service.UserService;

@Configuration
@ConditionalOnWebApplication
public class WebMvcConfig implements WebMvcConfigurer {

    @Value("${rcc.noauths}")
    private List<String> noAuths;

    @Value("${rcc.user.type.default}")
    private byte defaultUserType;

    /**
     * 是否开启api调用次数统计
     */
    @Value("${rcc.enableApiCount:false}")
    private boolean enableApiCount;

    @Autowired
    UserCache userCache;

    @Autowired
    UserService userService;

    @Autowired
    BrccInstanceService brccInstanceService;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(apiCountInterceptor()).addPathPatterns("/api/**");
        WebMvcConfigurer.super.addInterceptors(registry);
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public ApiCountInterceptor apiCountInterceptor() {
        return new ApiCountInterceptor(this.enableApiCount);
    }

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
        resolvers.add(new LoginUserHandlerMethodArgumentResolver());
    }

    @Bean
    public FilterRegistrationBean crossDomainFilter() {
        FilterRegistrationBean cross = new FilterRegistrationBean();
        cross.setFilter(new CrossDomainFilter());
        cross.setOrder(98);
        cross.addUrlPatterns("/*");
        return cross;
    }

    @Bean
    public UserAuthFilter userAuthFilter() {
        return new UserAuthFilter(noAuths, userCache, userService, defaultUserType);
    }

    @Bean
    public FilterRegistrationBean userAuthFilterRegistration(
            UserAuthFilter userAuthFilter) {
        FilterRegistrationBean userAuth = new FilterRegistrationBean();
        userAuth.setFilter(userAuthFilter);
        userAuth.setOrder(101);
        userAuth.addUrlPatterns("/*");
        return userAuth;
    }

    @Bean
    public FilterRegistrationBean uriCostFilterRegistration() {
        FilterRegistrationBean uriCostFilterBean = new FilterRegistrationBean();
        uriCostFilterBean.setFilter(new UriCostFilter(brccInstanceService));
        uriCostFilterBean.setOrder(99);
        uriCostFilterBean.addUrlPatterns("/*");
        return uriCostFilterBean;
    }
}
