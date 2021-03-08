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
package com.baidu.brcc.config;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.springframework.mock.web.MockFilterChain;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import com.baidu.brcc.utils.RccReflectionUtils;

public class UriCostFilterTest {
    @InjectMocks
    UriCostFilter uriCostFilter;

    @Before
    public void setUp() throws IllegalAccessException {
        MockitoAnnotations.initMocks(this);
        Logger logger = mock(Logger.class);
        when(logger.isDebugEnabled()).thenReturn(true);
        RccReflectionUtils.setFieldValue(uriCostFilter, "LOGGER", logger);
    }

    @Test
    public void testDoFilter() throws Exception {
        MockHttpServletRequest request = mock(MockHttpServletRequest.class);
        MockHttpServletResponse response = new MockHttpServletResponse();
        MockFilterChain chain = new MockFilterChain();
        when(request.getHeader("rcc-ts")).thenReturn("13423");
        uriCostFilter.doFilter(request, response, chain);
    }

    @Test
    public void testInit() throws Exception {
        uriCostFilter.init(null);
    }

    @Test
    public void testDestroy() throws Exception {
        uriCostFilter.destroy();
    }

}
