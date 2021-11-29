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

import org.apache.logging.log4j.core.async.AsyncLoggerContextSelector;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = {"com.baidu.brcc"})
@MapperScan(annotationClass = org.apache.ibatis.annotations.Mapper.class, basePackages = "com.baidu.brcc.dao")
@EnableTransactionManagement
@EnableAspectJAutoProxy
@EnableSwagger2
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
