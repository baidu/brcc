/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.config;

import static com.baidu.brcc.common.ErrorStatusMsg.SERVER_ERROR_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.SERVER_ERROR_STATUS;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baidu.brcc.domain.base.R;
import com.baidu.brcc.domain.exception.BizException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ControllerAdvice
public class GlobalControllerAdvice {

    @ExceptionHandler(BizException.class)
    @ResponseBody
    public R bizExceptionHandler(BizException e) {
        return R.error(e.getErrorCode(), e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R exceptionHandler(Exception e) {
        log.error("service error.", e);
        return R.error(SERVER_ERROR_STATUS, SERVER_ERROR_MSG);
    }
}
