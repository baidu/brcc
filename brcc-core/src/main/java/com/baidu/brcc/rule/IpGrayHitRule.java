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
package com.baidu.brcc.rule;

import org.springframework.stereotype.Component;
import static org.apache.commons.lang3.StringUtils.trim;

import java.util.Map;

@Component("ip")
public class IpGrayHitRule implements GrayHitRule {
    @Override
    public boolean hit(Long grayVersionId, String ruleContent, Map<String, String> content) {
        // IP判断
        String ip = content.get("ip");
        String[] spilt = ruleContent.split(",");
        for (String item : spilt) {
            if (ip.equals(trim(item))) {
                return true;
            }
        }
        return false;
        }
    }

