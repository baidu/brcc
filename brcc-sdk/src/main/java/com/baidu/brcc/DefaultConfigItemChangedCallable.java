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

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;

import com.baidu.brcc.model.ChangedConfigItem;

public class DefaultConfigItemChangedCallable implements ConfigItemChangedCallable {
    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultConfigItemChangedCallable.class);

    @Override
    public void changed(List<ChangedConfigItem> items) {
        if (!CollectionUtils.isEmpty(items)) {
            for (ChangedConfigItem item : items) {
                LOGGER.info("changed key={} oldValue={} newValue={}", item.getKey(), item.getOldValue(),
                        item.getNewValue());
            }
        }
    }
}
