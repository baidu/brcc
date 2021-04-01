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

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.baidu.brcc.model.R;
import com.baidu.brcc.model.RList;
import com.baidu.brcc.utils.gson.GsonUtils;

import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

@Service
public class OkHttpClientUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger(OkHttpClientUtils.class);
    private static final String HEADER_RCC_TS = "Rcc-Ts";
    private static final String HEADER_RCC_SERVER_IN_TS = "Rcc-Server-In-Ts";
    private static final String HEADER_RCC_SERVER_OUT_TS = "Rcc-Server-Out-Ts";
    private static final String HEADER_RCC_OUT_TS = "Rcc-Out-Ts";

    public static final MediaType JSON
            = MediaType.get("application/json; charset=utf-8");
    private OkHttpClient okHttpClient = null;

    public OkHttpClientUtils(long readTimeOut, long connectionTimeOut) {
        okHttpClient = new okhttp3.OkHttpClient
                .Builder()
                .readTimeout(readTimeOut, TimeUnit.MILLISECONDS)
                .connectTimeout(connectionTimeOut, TimeUnit.MILLISECONDS)
                .build();
    }

    public <T> R<T> get(
            String url,
            Class<T> type,
            Map<String, Object> param,
            Map<String, String> header
    ) throws IOException {
        Request.Builder builder = new Request.Builder().url(addParam(url, param));
        if (header != null && !header.isEmpty()) {
            for (Map.Entry<String, String> entry : header.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    continue;
                }
                String value = entry.getValue();
                builder.addHeader(key, value);
            }
        }
        Request request = builder.build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Unexpected code " + response);
            }
            ResponseBody body = response.body();
            String result = body.string();
            R<T> tr = GsonUtils.toRObject(result, type);
            tr.setHeader(header(response));
            return tr;
        }
    }

    public <T> RList<T> getList(
            String url,
            Class<T> type,
            Map<String, Object> param,
            Map<String, String> header
    ) throws IOException {
        Request.Builder builder = new Request.Builder().url(addParam(url, param));
        if (header != null && !header.isEmpty()) {
            for (Map.Entry<String, String> entry : header.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    continue;
                }
                String value = entry.getValue();
                builder.addHeader(key, value);
            }
        }
        Request request = builder.build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Unexpected code " + response);
            }
            ResponseBody body = response.body();
            String result = body.string();
            RList<T> tr = GsonUtils.toRList(result, type);
            tr.setHeader(header(response));
            return tr;
        }
    }

    private Map<String, Long> header(Response response) {
        Map<String, Long> header = new HashMap<>();
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
        } catch (Exception ex) {
            // ignore
        }
        header.put(HEADER_RCC_OUT_TS, System.currentTimeMillis());
        return header;
    }

    public <T> R<T> postJson(String url,
                             Class<T> type,
                             String body,
                             Map<String, Object> param,
                             Map<String, String> header) throws IOException {
        Request.Builder builder = new Request.Builder().url(addParam(url, param));
        if (header != null && !header.isEmpty()) {
            for (Map.Entry<String, String> entry : header.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    continue;
                }
                String value = entry.getValue();
                builder.addHeader(key, value);
            }
        }

        RequestBody bodyx = RequestBody.create(JSON, body);
        Request request = builder.post(bodyx).build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Unexpected code " + response);
            }
            ResponseBody responseBody = response.body();
            String result = responseBody.string();
            R<T> tr = GsonUtils.toRObject(result, type);
            tr.setHeader(header(response));
            return tr;
        }
    }

    private HttpUrl addParam(String url, Map<String, Object> param) {
        HttpUrl httpUrl = HttpUrl.parse(url);
        if (param == null || param.isEmpty()) {
            return httpUrl;
        }
        HttpUrl.Builder builder = httpUrl.newBuilder();
        for (Map.Entry<String, Object> entry : param.entrySet()) {
            String key = entry.getKey();
            if (key == null) {
                continue;
            }
            Object value = entry.getValue();
            builder.removeAllQueryParameters(key)
                    .addQueryParameter(key, value == null ? "" : value.toString());
        }
        return builder.build();
    }
}
