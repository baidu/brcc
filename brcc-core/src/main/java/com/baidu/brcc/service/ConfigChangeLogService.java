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
