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

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

public class RccAutoConfigTest {
    @Mock
    Logger LOGGER;
    @Mock
    Environment environment;
    @InjectMocks
    RccAutoConfig rccAutoConfig;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSetApplicationContext() throws Exception {
        ApplicationContext applicationContext = Mockito.mock(ApplicationContext.class);
        rccAutoConfig.setApplicationContext(applicationContext);
    }

    @Test
    public void testConfigCenterPropertyPlaceholderConfigurer() throws Exception {
        rccAutoConfig.configCenterPropertyPlaceholderConfigurer();
    }
}
