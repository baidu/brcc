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

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.lang.reflect.Field;
import java.util.Properties;
import java.util.concurrent.ExecutorService;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.springframework.util.ReflectionUtils;

import com.baidu.brcc.model.VersionVo;

public class ConfigChangedListenerTest {
    @Mock
    Logger LOGGER;
    @Mock
    ExecutorService es;
    @Mock
    Properties properties;
    @Mock
    ConfigLoader configLoader;
    @InjectMocks
    ConfigChangedListener configChangedListener;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testStart() throws Exception {
        configChangedListener.start();
    }

    @Test
    public void testClose() throws Exception {
        configChangedListener.start();
        configChangedListener.close();
    }

    @Test
    public void testRun() throws Exception {
        setField(configChangedListener, "stop", false);
        when(configLoader.getLastCheckSum()).thenReturn("check-sum");
        when(configLoader.getVersion()).thenReturn(mock(VersionVo.class));
        new Thread(() -> {
            try {
                Thread.sleep(100l);
                setField(configChangedListener, "stop", true);
            } catch (InterruptedException e) {
                LOGGER.error("-", e);
            }
        }).start();
        Properties properties = new Properties();
        properties.put("k1", "v1");
        setField(configChangedListener, "properties", properties);
        configChangedListener.run();
    }

    @Test
    public void testIsStop() {
        configChangedListener.isStop();
    }

    private void setField(Object target, String field, Object value) {
        Field f = ReflectionUtils.findField(target.getClass(), field);
        boolean accessible = f.isAccessible();
        f.setAccessible(true);
        ReflectionUtils.setField(f, target, value);
        f.setAccessible(accessible);
    }
}
