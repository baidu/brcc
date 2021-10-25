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
package com.baidu.brcc.utils;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import com.baidu.brcc.model.R;
import com.baidu.brcc.model.RList;
import com.baidu.brcc.utils.gson.GsonUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HutoolHttpClient implements HttpClient{
    private int connectionTimeOut;
    private int readTimeOut;

    public HutoolHttpClient(int connectionTimeOut, int readTimeOut) {
        this.connectionTimeOut = connectionTimeOut;
        this.readTimeOut = readTimeOut;
    }

    public int getConnectionTimeOut() {
        return this.connectionTimeOut;
    }

    public int getReadTimeOut() {
        return this.readTimeOut;
    }

    public <T> R<T> get(String url, Class<T> type, Map<String, Object> param, Map<String, String> header) throws IOException {
        HttpRequest httpRequest = HttpRequest.get(this.payLoadQueryString(url, this.encodeParam(param))).setReadTimeout(this.readTimeOut).setConnectionTimeout(this.connectionTimeOut);
        if (header != null && !header.isEmpty()) {
            Iterator var6 = header.entrySet().iterator();

            while(var6.hasNext()) {
                Entry<String, String> entry = (Entry)var6.next();
                String key = (String)entry.getKey();
                if (key != null) {
                    String value = (String)entry.getValue();
                    httpRequest.header(key, value);
                }
            }
        }

        HttpResponse execute = httpRequest.execute();
        if (execute.isOk()) {
            R<T> tr = GsonUtils.toRObject(execute.body(), type);
            tr.setHeader(this.header(execute));
            return tr;
        } else {
            throw new IOException("Unexpected code: " + execute.getStatus());
        }
    }

    public <T> RList<T> getList(String url, Class<T> type, Map<String, Object> param, Map<String, String> header) throws IOException {
        HttpRequest httpRequest = HttpRequest.get(this.payLoadQueryString(url, this.encodeParam(param))).setReadTimeout(this.readTimeOut).setConnectionTimeout(this.connectionTimeOut);
        if (header != null && !header.isEmpty()) {
            Iterator var6 = header.entrySet().iterator();

            while(var6.hasNext()) {
                Entry<String, String> entry = (Entry)var6.next();
                String key = (String)entry.getKey();
                if (key != null) {
                    String value = (String)entry.getValue();
                    httpRequest.header(key, value);
                }
            }
        }

        HttpResponse execute = httpRequest.execute();
        if (execute.isOk()) {
            RList<T> tr = GsonUtils.toRList(execute.body(), type);
            tr.setHeader(this.header(execute));
            return tr;
        } else {
            throw new IOException("Unexpected code: " + execute.getStatus());
        }
    }

    public <T> R<T> postJson(String url, Class<T> type, String body, Map<String, Object> param, Map<String, String> header) throws IOException {
        HttpRequest httpRequest = HttpRequest.post(this.payLoadQueryString(url, this.encodeParam(param))).body(body).setReadTimeout(this.readTimeOut).setConnectionTimeout(this.connectionTimeOut);
        if (header != null && !header.isEmpty()) {
            Iterator var7 = header.entrySet().iterator();

            while(var7.hasNext()) {
                Entry<String, String> entry = (Entry)var7.next();
                String key = (String)entry.getKey();
                if (key != null) {
                    String value = (String)entry.getValue();
                    httpRequest.header(key, value);
                }
            }
        }

        HttpResponse execute = httpRequest.execute();
        if (execute.isOk()) {
            R<T> tr = GsonUtils.toRObject(execute.body(), type);
            tr.setHeader(this.header(execute));
            return tr;
        } else {
            throw new IOException("Unexpected code: " + execute.getStatus());
        }
    }

    private Map<String, Long> header(HttpResponse response) {
        Map<String, Long> header = new HashMap();
        String rccTs = response.header(HEADER_RCC_TS);
        String serverInTs = response.header(HEADER_RCC_SERVER_IN_TS);
        String serverOutTs = response.header(HEADER_RCC_SERVER_OUT_TS);

        try {
            if (!StringUtils.isBlank(rccTs)) {
                header.put(HEADER_RCC_TS, Long.valueOf(rccTs));
            }

            if (!StringUtils.isBlank(serverInTs)) {
                header.put(HEADER_RCC_SERVER_IN_TS, Long.valueOf(serverInTs));
            }

            if (!StringUtils.isBlank(serverOutTs)) {
                header.put(HEADER_RCC_SERVER_OUT_TS, Long.valueOf(serverOutTs));
            }
        } catch (Exception var7) {
        }

        header.put(HEADER_RCC_OUT_TS, System.currentTimeMillis());
        return header;
    }
}
