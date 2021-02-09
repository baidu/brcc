/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.baidu.brcc.service.UserCache;
import com.baidu.brcc.service.UserService;

@Configuration
@ConditionalOnWebApplication
public class WebMvcConfig implements WebMvcConfigurer {

    @Value("${rcc.noauths}")
    private List<String> noAuths;

    @Value("${rcc.user.type.default}")
    private byte defaultUserType;

    @Autowired
    UserCache userCache;

    @Autowired
    UserService userService;

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
        uriCostFilterBean.setFilter(new UriCostFilter());
        uriCostFilterBean.setOrder(99);
        uriCostFilterBean.addUrlPatterns("/*");
        return uriCostFilterBean;
    }
}
