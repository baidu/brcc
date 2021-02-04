/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.dao.base;

import java.util.HashMap;

public class SQLParam extends HashMap<String, Object> {


    public static SQLParam newInstance() {
        return new SQLParam();
    }

    public SQLParam append(String key, Object value) {
        put(key, value);
        return this;
    }
}
