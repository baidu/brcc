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
package com.baidu.brcc.aop;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.baidu.brcc.annotation.MaskLog;
import com.baidu.brcc.annotation.SaveLog;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.service.OperationLogService;
import com.baidu.brcc.utils.UserThreadLocal;
import com.baidu.brcc.utils.gson.GsonUtils;
import com.google.gson.JsonObject;

@Aspect
@Component
public class WebLogAspect {

    private final Logger logger = LoggerFactory.getLogger(WebLogAspect.class);

    @Autowired
    OperationLogService operationLogService;

    // 切入点
    @Pointcut("@annotation(com.baidu.mapp.rcc.annotation.SaveLog)")
    public void saveLogPointcut() {
    }

    // 在切入点的方法环绕执行
    @Around("@annotation(saveLog)")
    public Object logBeforeController(JoinPoint joinPoint, SaveLog saveLog) throws Throwable {
        Object result = null;

        // 这个RequestContextHolder是Springmvc提供来获得请求的东西
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = ((ServletRequestAttributes) requestAttributes).getRequest();
        // 获取远程调用信息
        String remoteAddress = request.getRemoteAddr() + ":" + request.getRemotePort();
        // 获取场景值
        String scene = saveLog.scene();
        // 掩码 saveLog
        Map<Integer, Set<String>> masks = maskMap(saveLog.masks());
        // 获取操作用户
        User user = UserThreadLocal.currentUser();
        Long userId = user == null ? 0 : user.getId();
        String operator = user == null ? "" : user.getName();

        Object[] args = joinPoint.getArgs();

        // 处理入参
        String requestBody = "";
        String[] params = saveLog.params();
        int[] indexes = saveLog.paramsIdxes();
        if (params != null && indexes != null && params.length == indexes.length) {
            Map<String, Object> reqMap = new HashMap<>();
            for (int i = 0; i < indexes.length; i++) {
                int idx = indexes[i];
                String reqName = params[i];
                Object param = args[idx];
                Set<String> fds = masks.get(idx);
                if (param == null) {
                    reqMap.put(reqName, "");
                } else if (param instanceof ServletRequest || param instanceof ServletResponse) {
                    reqMap.put(reqName, "");
                } else if (masks == null || !masks.containsKey(idx)) {
                    reqMap.put(reqName, param);
                } else if (fds == null || fds.isEmpty()) {
                    reqMap.put(reqName, "***");
                } else {
                    String reqStr = GsonUtils.toJsonString(param);
                    JsonObject jsonObject = GsonUtils.toJsonObject(reqStr);
                    if (jsonObject == null) {
                        reqMap.put(reqName, "");
                        continue;
                    }
                    for (String fd : fds) {
                        jsonObject.addProperty(fd, "***");
                    }
                    reqMap.put(reqName, GsonUtils.toJsonString(jsonObject));
                }
            }
            requestBody = GsonUtils.toJsonString(reqMap);
        }

        try {
            MethodInvocationProceedingJoinPoint mjoinpoint = (MethodInvocationProceedingJoinPoint) joinPoint;
            result = mjoinpoint.proceed(args);
            String res = result == null ? "" : GsonUtils.toJsonString(result);
            operationLogService.saveLogWithBackground(userId, operator, scene, requestBody, res, remoteAddress);
        } catch (Throwable throwable) {
            throw throwable;
        }
        return result;
    }

    private Map<Integer, Set<String>> maskMap(MaskLog[] masks) {
        if (masks == null || masks.length <= 0) {
            return new HashMap<>(0);
        } else {
            Map<Integer, Set<String>> map = new HashMap<>();
            for (MaskLog mask : masks) {
                Set<String> fields = map.get(mask.paramsIdx());
                if (fields == null) {
                    fields = new HashSet<>();
                    map.put(mask.paramsIdx(), fields);
                }
                String[] fds = mask.fields();
                if (fds != null && fds.length >= 0) {
                    for (String fd : fds) {
                        fields.add(fd);
                    }
                }
            }
            return map;
        }
    }
}
