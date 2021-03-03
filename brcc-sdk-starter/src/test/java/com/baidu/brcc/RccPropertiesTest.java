/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc;

import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.core.env.Environment;

import static org.mockito.Mockito.*;

public class RccPropertiesTest {
    @Mock
    Environment env;
    @Mock
    Set<String> locations;
    @InjectMocks
    RccProperties rccProperties;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSetEnvironment() throws Exception {
        rccProperties.setEnvironment(mock(Environment.class));
    }
}
