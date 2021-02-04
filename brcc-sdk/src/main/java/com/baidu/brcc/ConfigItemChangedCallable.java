/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc;

import java.util.List;

import com.baidu.brcc.model.ChangedConfigItem;

public interface ConfigItemChangedCallable {
    void changed(List<ChangedConfigItem> items);
}
