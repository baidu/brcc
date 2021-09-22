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
 */package com.baidu.brcc.service;

import com.baidu.brcc.domain.GrayInfo;
import com.baidu.brcc.domain.GrayInfoExample;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.vo.GrayRuleReq;
import com.baidu.brcc.service.base.GenericService;

import java.util.List;

public interface GrayInfoService extends GenericService<GrayInfo, Long, GrayInfoExample> {
    List<GrayInfo> selectByIds(List<Long> ids);

    Long saveGrayInfo(GrayRuleReq grayRuleReq, User loginUser);


}
