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

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import org.springframework.util.ReflectionUtils;
import org.springframework.util.StringUtils;

public class RccReflectionUtils {

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


    public static <T> T getFiled(Object target, String fieldName, Class<T> returnType) throws IllegalAccessException {
        if (target == null || !StringUtils.hasText(fieldName)) {
            return null;
        }
        Class<?> targetClass = target.getClass();
        Field field = ReflectionUtils.findField(targetClass, fieldName);
        if (field == null) {
            return null;
        }
        boolean oldAccessible = field.isAccessible();
        field.setAccessible(true);

        Object o = field.get(target);

        field.setAccessible(oldAccessible);

        return returnType.cast(o);
    }

    /**
     * 对象转map
     * @param target
     * @return
     * @throws IllegalAccessException
     */
    public static Map<String, Object> objectToMap(Object target) throws IllegalAccessException {
        if (target == null) {
            return new HashMap<>(0);
        }

        Map<String, Object> result = new HashMap<>();
        ReflectionUtils.doWithFields(target.getClass(), field -> {
            boolean oldAccessible = field.isAccessible();
            field.setAccessible(true);
            Object o = field.get(target);
            field.setAccessible(oldAccessible);
            result.put(field.getName(), o);
        });
        return result;
    }
}
