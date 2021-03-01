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

import static java.net.URLDecoder.decode;
import static java.net.URLEncoder.encode;
import static org.apache.commons.lang3.StringUtils.isNotBlank;
import static org.apache.commons.lang3.StringUtils.trim;
import static org.springframework.util.CollectionUtils.isEmpty;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.cbor.MappingJackson2CborHttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.smile.MappingJackson2SmileHttpMessageConverter;
import org.springframework.util.CollectionUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.baidu.brcc.utils.gson.GsonFactory;
import com.baidu.brcc.utils.gson.GsonUtils;
import com.google.gson.Gson;

/**
 * Rest template tools.
 */
public class RestTemplateUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(RestTemplateUtils.class);

    // 链接超时
    private static final int connectTimeout = 15000;

    // 读超时
    private static final int readTimeout = 120000;

    private static volatile RestTemplate restTemplate;

    public static RestTemplate getRestTemplate() {
        if (restTemplate == null) {
            synchronized(RestTemplateUtils.class) {
                if (restTemplate == null) {
                    SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
                    requestFactory.setConnectTimeout(connectTimeout);
                    requestFactory.setReadTimeout(readTimeout);

                    restTemplate = new RestTemplate(requestFactory);

                    List<HttpMessageConverter<?>> converters = restTemplate.getMessageConverters();
                    if (!CollectionUtils.isEmpty(converters)) {
                        Gson gson = GsonFactory.createGson();
                        GsonHttpMessageConverter gsonHttpMessageConverter = new GsonHttpMessageConverter(gson);
                        gsonHttpMessageConverter
                                .setSupportedMediaTypes(Arrays.asList(
                                        MediaType.APPLICATION_JSON_UTF8,
                                        MediaType.APPLICATION_JSON,
                                        MediaType.TEXT_HTML,
                                        MediaType.valueOf("application/vnd.spring-boot.actuator.v2+json"))
                                );
                        converters.add(gsonHttpMessageConverter);

                        Iterator<HttpMessageConverter<?>> iterator = converters.iterator();
                        while (iterator.hasNext()) {
                            HttpMessageConverter<?> next = iterator.next();
                            if (next instanceof MappingJackson2HttpMessageConverter) {
                                iterator.remove();
                            } else if (next instanceof MappingJackson2SmileHttpMessageConverter) {
                                iterator.remove();
                            } else if (next instanceof MappingJackson2CborHttpMessageConverter) {
                                iterator.remove();
                            }
                        }
                    }
                    for (HttpMessageConverter<?> messageConverter : converters) {
                        if (messageConverter instanceof StringHttpMessageConverter) {
                            ((StringHttpMessageConverter) messageConverter).setDefaultCharset(Charset.forName("utf-8"));
                        }
                    }
                }
            }
        }
        return restTemplate;
    }

    public static String get(String url) throws MalformedURLException, URISyntaxException {
        return get(url, String.class, null, null, 0, 0);
    }
    public static <T> T get(
            String url,
            Class<T> returnClass
    ) throws MalformedURLException, URISyntaxException {
        return get(url, returnClass, null, null, 0, 0);
    }
    public static <T> T get(
            String url,
            Class<T> returnClass,
            Map<String, Object> queryStringParams
    ) throws MalformedURLException, URISyntaxException {
        return get(url, returnClass, queryStringParams, null, 0, 0);
    }
    public static <T> T get(
            String url,
            Class<T> returnClass,
            Map<String, Object> queryStringParams,
            Map<String, String> headers
    ) throws MalformedURLException, URISyntaxException {
        return get(url, returnClass, queryStringParams, headers, 0, 0);
    }

    public static <T> T get(
            String url,
            Class<T> returnClass,
            Map<String, Object> queryStringParams,
            Map<String, String> headers,
            int retryTimes,
            long retryDelayMs
    ) throws MalformedURLException, URISyntaxException {
        // 设置请求头
        MultiValueMap headerMaps = null;
        if (!CollectionUtils.isEmpty(headers)) {
            headerMaps = new HttpHeaders();
            headerMaps.putAll(headers);
        }
        URL executeUrl = appendQueryString(new URL(url), queryStringParams, true, true, true, false);
        RequestEntity<String> requestEntity = new RequestEntity(null, headerMaps, HttpMethod.GET, executeUrl.toURI(),
                returnClass);

        return execute(requestEntity,returnClass, retryTimes, retryDelayMs);
    }

    public static <REQ, RES> RES postJson(
            String url,
            Class<RES> returnClass,
            REQ req,
            Map<String, Object> queryStringParams,
            Map<String, String> headers,
            int retryTimes,
            long retryDelayMs
    ) throws MalformedURLException, URISyntaxException {
        // 设置请求头
        MultiValueMap headerMaps = new HttpHeaders();
        if (!CollectionUtils.isEmpty(headers)) {
            headerMaps.putAll(headers);
        }
        headerMaps.put(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_UTF8_VALUE);
        URL executeUrl = appendQueryString(new URL(url), queryStringParams, true, true, true, false);

        RequestEntity<String> requestEntity = new RequestEntity(
                GsonUtils.toJsonString(req), headerMaps,
                HttpMethod.POST,
                executeUrl.toURI(),
                returnClass
        );
        return execute(requestEntity,returnClass, retryTimes, retryDelayMs);
    }

    public static <T> T postForm(
            String url,
            Class<T> returnClass,
            Map<String, Object> formData,
            Map<String, Object> queryStringParams,
            Map<String, String> headers,
            int retryTimes,
            long retryDelayMs
    )  throws MalformedURLException, URISyntaxException{
        // 设置请求头
        MultiValueMap headerMaps = new HttpHeaders();
        if (!CollectionUtils.isEmpty(headers)) {
            headerMaps.putAll(headers);
        }

        MultiValueMap formValues = new LinkedMultiValueMap();
        if (!CollectionUtils.isEmpty(formData)) {
            formValues.putAll(formData);
        }
        headerMaps.put(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_FORM_URLENCODED_VALUE);
        URL executeUrl = appendQueryString(new URL(url), queryStringParams, true, true, true, false);

        RequestEntity<String> requestEntity = new RequestEntity(
                formValues,
                headerMaps,
                HttpMethod.POST,
                executeUrl.toURI(),
                returnClass
        );
        return execute(requestEntity,returnClass, retryTimes, retryDelayMs);
    }


    public static <T> T postFormFile(
            String url,
            Class<T> returnClass,
            String fileName,
            InputStream in,
            Map<String, Object> formData,
            Map<String, Object> queryStringParams,
            Map<String, String> headers,
            int retryTimes,
            long retryDelayMs
    )  throws MalformedURLException, URISyntaxException{
        // 设置请求头
        MultiValueMap headerMaps = new HttpHeaders();
        if (!CollectionUtils.isEmpty(headers)) {
            headerMaps.putAll(headers);
        }

        MultiValueMap formValues = new LinkedMultiValueMap();
        if (!CollectionUtils.isEmpty(formData)) {
            formValues.putAll(formData);
        }
        if (in != null) {
            formValues.add("file", new InputStreamResource(in));
            formValues.add("filename",fileName);
        }
        headerMaps.put(HttpHeaders.CONTENT_TYPE, MediaType.MULTIPART_FORM_DATA_VALUE);
        URL executeUrl = appendQueryString(new URL(url), queryStringParams, true, true, true, false);

        RequestEntity<String> requestEntity = new RequestEntity(
                formValues,
                headerMaps,
                HttpMethod.POST,
                executeUrl.toURI(),
                returnClass
        );
        return execute(requestEntity,returnClass, retryTimes, retryDelayMs);
    }

    public static <REQ, RES> RES execute(
            RequestEntity<REQ> request,
            Class<RES> returnClass,
            int retryTimes,
            long retryDelayMs
    ) {
        RestTemplate restTemplate = getRestTemplate();

        boolean success = false;
        ResponseEntity<RES> exchange = null;
        if (retryTimes > 1) {
            for (int i = 0; i < retryTimes; i++) {
                try {
                    exchange = restTemplate.exchange(request, returnClass);
                    if (LOGGER.isDebugEnabled()) {
                        LOGGER.debug("get url[{}] with header[{}], return[{}], http-status-code[{}], body[{}]",
                                request.getUrl(),
                                GsonUtils.toJsonString(request.getHeaders()),
                                exchange != null ? exchange.getStatusCodeValue() : 1000,
                                GsonUtils.toJsonString(exchange != null ? exchange.getBody() : null)
                        );
                    }
                    success = true;
                } catch (Exception ex) {
                    LOGGER.error("get url[{}] error, times[{}]", request.getHeaders(), i);
                    if (retryDelayMs > 0) {
                        try{
                            Thread.sleep(retryDelayMs);
                        }catch(InterruptedException ie){
                            LOGGER.error("thread sleep interrupted", ie);
                        }

                    }
                }
            }
        }
        if (!success) {
            exchange = restTemplate.exchange(request, returnClass);
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("get url[{}] with header[{}], return[{}], http-status-code[{}], body[{}]",
                        request.getUrl(),
                        GsonUtils.toJsonString(request.getHeaders()),
                        exchange != null ? exchange.getStatusCodeValue() : 1000,
                        GsonUtils.toJsonString(exchange != null ? exchange.getBody() : null)
                );
            }
        }

        RES body = exchange == null ? null : exchange.getBody();
        return body;
    }



    /**
     * 根据指定的URL，解析出它的queryString对，
     * 需要注意，在query string 中， 单key是允许出现的，
     * 例如 http://abc.com?u=qy&open, 其中open降被解析为true，
     * 但是，在此工具中，返回的Map中open对应的value为null，
     * 这对将map返转为queryString很重要，如果key对应value为null，翻译为单key
     *
     * @param url                                           需要解析的url
     * @param sortMap，是否返回排序map，值为true返回TreeMap，否则返回HashMap
     * @param needUrlDecode,                                是否需要对key与value进行url decode 操作， true为需要
     *
     * @return
     */
    public static Map<String, String> parseQueryString(URL url, boolean sortMap, boolean needUrlDecode) {
        Objects.requireNonNull(url);
        Map<String, String> map = null;
        if (sortMap) {
            map = new TreeMap<>();
        } else {
            map = new HashMap<>();
        }
        String query = url.getQuery();
        if (StringUtils.isNotBlank(query)) {
            String[] pairs = query.split("&");
            for (String pair : pairs) {
                int idx = pair.indexOf("=");
                String key = null;
                String value = null;
                if (idx != -1) {
                    try {
                        key = pair.substring(0, idx);
                        if (needUrlDecode) {
                            key = decode(key, "UTF-8");
                        }
                        value = pair.substring(idx + 1);
                        if (needUrlDecode) {
                            value = decode(value, "UTF-8");
                        }
                    } catch (UnsupportedEncodingException e) {
                        LOGGER.error("decode pair[{}] fail.", pair, e);
                    }
                } else {
                    try {
                        key = trim(pair);
                        if (needUrlDecode) {
                            key = decode(key, "UTF-8");
                        }
                        value = null;
                    } catch (UnsupportedEncodingException e) {
                        LOGGER.error("decode pair[{}] fail.", pair, e);
                    }
                }
                if (isNotBlank(key)) {
                    map.put(key, value);
                }
            }
        }
        return map;
    }

    /**
     * 对指定的URL添加queryString
     *
     * @param url
     * @param params
     * @param overwrite
     * @param needUrlDecodeForParseUrl
     * @param needUrlEncode
     * @param needSortQueryString
     *
     * @return
     */
    public static URL appendQueryString(URL url, Map<String, Object> params, boolean overwrite,
                                        boolean needUrlDecodeForParseUrl,
                                        boolean needUrlEncode, boolean needSortQueryString)
            throws MalformedURLException {
        Objects.requireNonNull(url);
        if (isEmpty(params)) {
            return url;
        }

        Map<String, String> queryStringMap = parseQueryString(url, needSortQueryString, needUrlDecodeForParseUrl);

        for (Map.Entry<String, Object> entry : params.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (overwrite || !queryStringMap.containsKey(key)) {
                queryStringMap.put(key, value != null ? value.toString() : null);
            }
        }

        if (isEmpty(queryStringMap)) {
            return url;
        }

        // map to queryString
        StringBuilder urlSb = new StringBuilder(url.toString().split("\\?")[0]);
        urlSb.append("?");
        boolean flag = false;
        for (Map.Entry<String, String> entry : queryStringMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (needUrlEncode) {
                try {
                    key = encode(key, "UTF-8");
                    if (value != null) {
                        value = encode(value, "UTF-8");
                    }
                } catch (UnsupportedEncodingException e) {
                    LOGGER.error("encode key[{}] value[{}] fail.", key, value, e);
                }
            }
            if (flag) {
                urlSb.append("&");
            }else {
                flag = true;
            }
            urlSb.append(key);
            if (value != null) {
                urlSb.append("=");
                urlSb.append(value);
            }
        }
        return new URL(urlSb.toString());
    }
}
