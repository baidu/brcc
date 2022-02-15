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
package com.baidu.brcc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import com.baidu.brcc.model.ChangedConfigItem;
import com.baidu.brcc.model.VersionVo;
import com.baidu.brcc.utils.StringUtils;
import lombok.extern.slf4j.Slf4j;

/**
 * Configuration changed listener.
 *
 * @author xiemalin
 * @since 1.0.0.0
 */
@Slf4j
public class ConfigChangedListener implements Runnable {

    /**
     * if true means listener thread is stopped.
     */
    private boolean stop = true;
    /**
     * listener thread executor instance.
     */
    private ExecutorService es;

    /**
     * get stop status.
     *
     * @return the stop
     */
    public boolean isStop() {
        return stop;
    }

    /**
     * start listener thread
     */
    public synchronized void start() {
        if (es == null) {
            ThreadFactory threadFactory = new ThreadFactory() {
                @Override
                public Thread newThread(Runnable r) {
                    return new Thread(r, "ConfigChangedListener-Thread");
                }
            };
            es = Executors.newSingleThreadExecutor(threadFactory);
        }
        stop = false;
        es.execute(this);
    }

    /**
     * do close and shut down listener thread
     */
    public synchronized void close() {
        if (es != null) {
            stop = true;
            es.shutdown();
            es = null;
        }
    }

    /**
     * old configuration items to check.
     */
    private Properties properties;
    /**
     * {@link ConfigLoader} instance.
     */
    private ConfigLoader configLoader;

    /**
     * default constructor.
     *
     * @param properties   all loaded properties
     * @param configLoader {@link ConfigLoader} instance.
     */
    public ConfigChangedListener(Properties properties, ConfigLoader configLoader) {
        super();
        this.properties = properties;
        this.configLoader = configLoader;
    }

    /**
     * create a new {@link ChangedConfigItem} instance.
     *
     * @param key      item key
     * @param oldValue old value
     * @param newValue new value
     *
     * @return a new {@link ChangedConfigItem} instance.
     */
    private ChangedConfigItem newChangedConfigItem(String key, String oldValue, String newValue) {
        ChangedConfigItem changedConfigItem = new ChangedConfigItem();
        changedConfigItem.setKey(key);
        changedConfigItem.setOldValue(oldValue);
        changedConfigItem.setNewValue(newValue);
        return changedConfigItem;
    }

    /**
     * get changed item list compare with current.
     *
     * @return changed item list
     */
    private List<ChangedConfigItem> checkChangedItems() {

        Map<String, String> configItems = null;
        try {
            configItems = configLoader.getFromCC();
        } catch (Exception ex) {
            log.warn("load from cc fail.");
            // 调用异常
            return new ArrayList<>(0);
        }

        if (configItems == null) {
            return Collections.emptyList();
        }

        Map copied = new HashMap(properties);

        // find different from old
        Iterator<Entry<Object, Object>> iterator = copied.entrySet().iterator();
        List<ChangedConfigItem> changedConfigItems = new LinkedList<ChangedConfigItem>();
        while (iterator.hasNext()) {
            Entry<Object, Object> entry = iterator.next();
            String key = entry.getKey().toString();
            String oldValue = entry.getValue().toString();
            String newValue = configItems.get(key);
            if (newValue == null) {
                changedConfigItems.add(newChangedConfigItem(key, oldValue, null));
                // remove deleted
                properties.remove(key);
            } else {
                if (!oldValue.equals(newValue)) {
                    changedConfigItems.add(newChangedConfigItem(key, oldValue, newValue));

                    // update value
                    properties.put(key, newValue);
                }
            }

            configItems.remove(key);
        }

        // add new added
        Iterator<Entry<String, String>> newAdded = configItems.entrySet().iterator();
        while (newAdded.hasNext()) {
            Entry<String, String> entry = newAdded.next();
            changedConfigItems.add(newChangedConfigItem(entry.getKey(), null, entry.getValue()));

            // add new value
            properties.put(entry.getKey(), entry.getValue());
        }

        return changedConfigItems;
    }

    /**
     * 心跳探测
     * do start listener thread.
     */
    public void run() {
        while (!stop) {
            try {
                Thread.sleep(configLoader.getCallbackInteval());

                // check version tag. tag should not be null
                String versionTag = configLoader.getLastCheckSum();
                if (StringUtils.isBlank(versionTag)) {
                    log.warn("Found local version tag is null, it could be a error "
                            + "from configuration center server. ");
                    continue;
                } else {
                    if (log.isDebugEnabled()) {
                        log.debug("Checking version tag to server... current tag:" + versionTag);
                    }
                }

                // check tag
                VersionVo isLastTag = configLoader.getVersion();
                String checkSum = isLastTag == null ? "" : isLastTag.getCheckSum();
                if (!StringUtils.equals(checkSum, versionTag)) {
                    List<ChangedConfigItem> changedItems = checkChangedItems();
                    configLoader.doCallback(changedItems);
                    configLoader.setLastCheckSum(checkSum);
                }
            } catch (Exception e) {
                log.warn(
                        "Change verify callback failed will retry at next interval. error message:" + e.getMessage(),
                        e);
            }
        }

    }

}
