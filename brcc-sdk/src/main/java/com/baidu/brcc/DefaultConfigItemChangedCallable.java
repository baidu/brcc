/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
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
