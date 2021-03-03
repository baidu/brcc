/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
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
