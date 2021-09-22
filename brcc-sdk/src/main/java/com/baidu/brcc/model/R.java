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
package com.baidu.brcc.model;

import java.io.Serializable;
import java.util.Map;

public class R<T> implements Serializable {

    /**
     * 返回状态码
     */
    private int status;

    /**
     * 返回信息
     */
    private String msg;

    /**
     * 返回结果数据
     */
    private T data;

    /**
     * 返回扩展数据
     */
    private Object ext;

    private Map<String, Long> header;

    private long sts = System.currentTimeMillis();

    public static <T> R<T> error() {
        return error(500, "fail");
    }

    public static <T> R<T> error(String msg) {
        return error(500, msg);
    }

    public static <T> R<T> error(Integer status, String msg) {
        R<T> r = new R<>();
        r.setStatus(status);
        r.setMsg(msg);
        return r;
    }

    public static <T> R<T> ok() {
        R<T> r = new R<>();
        r.setStatus(0);
        r.setMsg("success");
        return r;
    }

    public static <T> R<T> ok(T data) {
        R<T> r = new R<>();
        r.setStatus(0);
        r.setMsg("success");
        r.setData(data);
        return r;
    }

    public static <T> R<T> ok(T data, Object ext) {
        R<T> r = new R<>();
        r.setStatus(0);
        r.setMsg("success");
        r.setData(data);
        r.setExt(ext);
        return r;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Object getExt() {
        return ext;
    }

    public void setExt(Object ext) {
        this.ext = ext;
    }

    public Map<String, Long> getHeader() {
        return header;
    }

    public void setHeader(Map<String, Long> header) {
        this.header = header;
    }

    public long getSts() {
        return sts;
    }

    public void setSts(long sts) {
        this.sts = sts;
    }
}
