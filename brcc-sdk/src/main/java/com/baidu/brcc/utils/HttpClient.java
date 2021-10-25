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

import com.baidu.brcc.model.R;
import com.baidu.brcc.model.RList;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public interface HttpClient {
    String HEADER_RCC_TS = "Rcc-Ts";
    String HEADER_RCC_SERVER_IN_TS = "Rcc-Server-In-Ts";
    String HEADER_RCC_SERVER_OUT_TS = "Rcc-Server-Out-Ts";
    String HEADER_RCC_OUT_TS = "Rcc-Out-Ts";

    int getConnectionTimeOut();

    int getReadTimeOut();

    default Map<String, String> encodeParam(Map<String, Object> param) throws UnsupportedEncodingException {
        if (param != null && !param.isEmpty()) {
            Map<String, String> result = new HashMap();
            Iterator var3 = param.entrySet().iterator();

            while(var3.hasNext()) {
                Entry<String, Object> entry = (Entry)var3.next();
                String key = (String)entry.getKey();
                Object value = entry.getValue();
                if (key != null) {
                    String encodeKey = URLEncoder.encode(key, "UTF-8");
                    String encodeValue = value == null ? "" : URLEncoder.encode(value.toString(), "UTF-8");
                    result.put(encodeKey, encodeValue);
                }
            }

            return result;
        } else {
            return new HashMap(0);
        }
    }

    default String payLoadQueryString(String url, Map<String, String> param) throws MalformedURLException {
        if (param != null && !param.isEmpty()) {
            URL urlObj = new URL(url);
            String query = urlObj.getQuery();
            StringBuilder sb = new StringBuilder(url);
            Iterator<Entry<String, String>> iterator = param.entrySet().iterator();
            Entry<String, String> first = (Entry)iterator.next();
            if (StringUtils.isBlank(query)) {
                sb.append("?").append((String)first.getKey()).append("=").append((String)first.getValue());
            } else {
                sb.append("&").append((String)first.getKey()).append("=").append((String)first.getValue());
            }

            while(iterator.hasNext()) {
                Entry<String, String> next = (Entry)iterator.next();
                sb.append("&").append((String)next.getKey()).append("=").append((String)next.getValue());
            }

            return sb.toString();
        } else {
            return url;
        }
    }

    <T> R<T> get(String var1, Class<T> var2, Map<String, Object> var3, Map<String, String> var4) throws IOException;

    <T> RList<T> getList(String var1, Class<T> var2, Map<String, Object> var3, Map<String, String> var4) throws IOException;

    <T> R<T> postJson(String var1, Class<T> var2, String var3, Map<String, Object> var4, Map<String, String> var5) throws IOException;
}
