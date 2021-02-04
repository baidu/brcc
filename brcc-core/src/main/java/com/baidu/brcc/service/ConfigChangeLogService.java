/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.service;

import java.util.Date;
import java.util.Map;

import com.baidu.brcc.domain.ConfigChangeLogExample;
import com.baidu.brcc.domain.ConfigChangeLogWithBLOBs;
import com.baidu.brcc.service.base.GenericService;

public interface ConfigChangeLogService extends GenericService<ConfigChangeLogWithBLOBs, Long,
        ConfigChangeLogExample> {

    void saveLogWithBackground(Long userId, String operator, Long groupId,
                               Map<String, String> oldConfigMap, Map<String, String> newCofigMap,
                               Date commitTime);
}
