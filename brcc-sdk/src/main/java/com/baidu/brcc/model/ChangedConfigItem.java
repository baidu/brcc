/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.model;

import java.io.Serializable;

public class ChangedConfigItem implements Serializable {

    private static final long serialVersionUID = 8760573498030245046L;

    // 配置key
    private String key;

    // 变更前的配置值
    private String oldValue;

    // 变更后的配置值
    private String newValue;

    public ChangedConfigItem() {
    }

    public String getKey() {
        return this.key;
    }

    public String getOldValue() {
        return this.oldValue;
    }

    public String getNewValue() {
        return this.newValue;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }
}
