/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.example.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baidu.brcc.ConfigItemChangedCallable;
import com.baidu.brcc.DefaultConfigItemChangedCallable;

@Configuration
public class ExampleConfiguration {

    @Value("${a}")
    private String a;

    @PostConstruct
    public void init() {
        System.out.println("load properties a from rcc, the value is " + a);
    }

    @Bean
    public ConfigItemChangedCallable configItemChangedCallable() {
        return new DefaultConfigItemChangedCallable();
    }


}
