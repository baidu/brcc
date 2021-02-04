/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
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
