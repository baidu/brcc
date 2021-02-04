/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.config;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;

public class CrossDomainFilterTest {
    CrossDomainFilter crossDomainFilter = new CrossDomainFilter();

    @Test
    public void testInit() throws Exception {
        crossDomainFilter.init(mock(FilterConfig.class));
    }

    @Test
    public void testOptionDoFilter() throws Exception {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        FilterChain filterChain = mock(FilterChain.class);
        when(request.getHeader("Origin")).thenReturn("xxx.com");
        when(request.getMethod()).thenReturn("OPTIONS");
        crossDomainFilter.doFilter(request, response, filterChain);
    }
    @Test
    public void testDoFilter() throws Exception {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        FilterChain filterChain = mock(FilterChain.class);
        when(request.getMethod()).thenReturn("POST");
        crossDomainFilter.doFilter(request, response, filterChain);
    }

    @Test
    public void testDestroy() throws Exception {
        crossDomainFilter.destroy();
    }
}
