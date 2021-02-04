/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.dao.base;

import java.util.Map;

import org.springframework.util.Assert;

public class CommonProvider {


    public String select(Map map) {
        Assert.notNull(map, "CommonProvider.select param error, map is null");
        Assert.notNull(map.get("sql"), "CommonProvider.select param error, map is not containsKey 'sql'");
        Object sql = map.get("sql");
        return sql.toString();
    }
}
