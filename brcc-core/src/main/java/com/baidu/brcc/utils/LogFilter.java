package com.baidu.brcc.utils;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.HandlerMapping;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

public class LogFilter {
    public static String getUrl (ServletRequest request) {
        String pattern = (String) request.getAttribute(HandlerMapping.BEST_MATCHING_PATTERN_ATTRIBUTE);
        HttpServletRequest req = (HttpServletRequest) request;
        if (StringUtils.isEmpty(pattern)) {
            return req.getRequestURI();
        }
        return pattern;
    }
}
