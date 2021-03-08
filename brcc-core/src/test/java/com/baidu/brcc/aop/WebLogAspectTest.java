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

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.baidu.brcc.annotation.MaskLog;
import com.baidu.brcc.annotation.SaveLog;
import com.baidu.brcc.service.OperationLogService;

public class WebLogAspectTest {
    @Mock
    Logger logger;
    @Mock
    OperationLogService operationLogService;
    @InjectMocks
    WebLogAspect webLogAspect;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSaveLogPointcut() throws Exception {
        webLogAspect.saveLogPointcut();
    }

    @Test
    public void testLogBeforeController() throws Throwable {
        MethodInvocationProceedingJoinPoint joinPoint = mock(MethodInvocationProceedingJoinPoint.class);
        SaveLog saveLog = mock(SaveLog.class);
        String[] params = new String[] {"a", "b"};
        int[] indexes = new int[]{0, 1};
        when(saveLog.params()).thenReturn(params);
        when(saveLog.paramsIdxes()).thenReturn(indexes);


        MaskLog[] maskLogs = new MaskLog[2];

        MaskLog maskLog1 = mock(MaskLog.class);
        when(maskLog1.paramsIdx()).thenReturn(0);
        maskLogs[0] = maskLog1;

        MaskLog maskLog2 = mock(MaskLog.class);
        when(maskLog2.paramsIdx()).thenReturn(1);
        when(maskLog2.fields()).thenReturn(new String[]{"password"});
        maskLogs[1] = maskLog2;


        when(saveLog.masks()).thenReturn(maskLogs);

        Object[] args = new Object[2];
        args[0] = 1L;

        Map<String,String> map = new HashMap<>();
        map.put("user", "mark");
        map.put("password", "we4sdf12r");
        args[1] = map;
        when(joinPoint.getArgs()).thenReturn(args);

        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        Object result = webLogAspect.logBeforeController(joinPoint, saveLog);
        Assert.assertEquals(null, result);
    }
}
