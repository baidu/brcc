/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc;

import org.apache.logging.log4j.core.async.AsyncLoggerContextSelector;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = {"com.baidu.brcc"})
@MapperScan(annotationClass = org.apache.ibatis.annotations.Mapper.class, basePackages = "com.baidu.brcc.dao")
@EnableTransactionManagement
@EnableAspectJAutoProxy
public class RccApplication {

    static {
        System.setProperty("javax.xml.parsers.DocumentBuilderFactory",
                "com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl");
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(RccApplication.class);

    public static void main(String[] args) {
        LOGGER.info("is async logger: {}", AsyncLoggerContextSelector.isSelected());
        System.out.println("is async logger: " + AsyncLoggerContextSelector.isSelected());
        new SpringApplicationBuilder()
                .sources(RccApplication.class)
                .web(WebApplicationType.SERVLET)
                .registerShutdownHook(true)
                .build().run(args);
    }
}
