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
package com.baidu.brcc.utils.convert;

import com.baidu.brcc.domain.exception.BizException;
import com.baidu.brcc.domain.vo.ConfigItemForGroupVo;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import static com.baidu.brcc.common.ErrorStatusMsg.CONVERT_TO_STRING_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.CONVERT_TO_STRING_STATUS;

public class ConvertFileUtil {
    public static String convert2FileContent(List<ConfigItemForGroupVo> items, String groupName) {
        final String configContent;
        Properties properties = new Properties();
        for (ConfigItemForGroupVo item : items) {
            properties.put(item.getName(), item.getVal());
        }
        try {
            configContent = PropertiesUtil.toString(properties, groupName);
        } catch (IOException e) {
            throw new BizException(CONVERT_TO_STRING_STATUS, CONVERT_TO_STRING_MSG);
        }
        return configContent;
    }
}

