/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.core.annotation.AliasFor;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SaveLog {

    // 需要保证和params 长度一致，并且对应上
    int[] paramsIdxes() default {};

    String[] params() default {};

    String scene() default "";

    @AliasFor("params")
    String[] value() default {};

}
