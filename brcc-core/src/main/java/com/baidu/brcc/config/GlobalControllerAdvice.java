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

import static com.baidu.brcc.common.ErrorStatusMsg.SERVER_ERROR_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.SERVER_ERROR_STATUS;

import com.baidu.brcc.domain.exception.BrccException;
import org.springframework.http.ResponseEntity;
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

    @ExceptionHandler(BrccException.class)
    @ResponseBody
    public ResponseEntity customizeExceptionHandler(BrccException e) {
        log.error("service customize error.", e);
        return ResponseEntity.status(e.getRespCode()).body(e.getMsg());
    }
}
