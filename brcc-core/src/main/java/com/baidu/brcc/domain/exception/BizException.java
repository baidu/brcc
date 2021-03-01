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
package com.baidu.brcc.domain.exception;

import com.baidu.brcc.domain.em.ErrorCode;

public class BizException extends RuntimeException {
    private int code;

    public BizException() {
        super(ErrorCode.E_UNKNOW_FAIL.getMsg());
        this.code = ErrorCode.E_UNKNOW_FAIL.getCode();
    }

    public BizException(int code) {
        super();
        this.code = code;
    }
    public BizException(int code, String message) {
        super(message);
        this.code = code;
    }

    public BizException(String message) {
        super(message);
        this.code = ErrorCode.E_UNKNOW_FAIL.getCode();
    }

    public BizException(ErrorCode code) {
        super(code.getMsg());
        this.code = code.getCode();
    }

    public BizException(ErrorCode code, String message) {
        super(message);
        this.code = code.getCode();
    }

    public BizException(String message, int code) {
        super(message);
        this.code = code;
    }

    public int getErrorCode() {
        return code;
    }
}
