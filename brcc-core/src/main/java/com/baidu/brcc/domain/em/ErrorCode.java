/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.domain.em;

public enum ErrorCode {

    OK(0, "success"),

    BUSINESS_ERROR(1, "业务异常"),

    PARAMS_ERROR(2, "参数异常"),

    E_UNKNOW_FAIL(500, "未知错误");

    private Integer code;
    private String msg;

    ErrorCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static String getMsgByCode(Integer code) {
        ErrorCode[] values = ErrorCode.values();
        for (ErrorCode ec : values) {
            if (ec.code.equals(code)) {
                return ec.msg;
            }
        }
        return "";
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public ErrorCode setMsg(String msg) {
        this.msg = msg;
        return this;
    }

}
