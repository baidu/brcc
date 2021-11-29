package com.baidu.brcc.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

    @Value("${swagger.enable:true}")
    private boolean enable;

    @Bean
    public Docket api(){
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .enable(enable)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.baidu.brcc.controller"))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }
}
