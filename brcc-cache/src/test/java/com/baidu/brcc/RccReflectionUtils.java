/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
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
