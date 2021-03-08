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
package com.baidu.brcc.model;

import org.junit.Assert;
import org.junit.Test;

public class AuthVoTest {

    @Test
    public void test() {
        AuthVo vo = new AuthVo();
        vo.setProjectId(1L);
        vo.setExpiredTime(1L);
        vo.setNeverExpired(true);
        vo.setToken("1");
        vo.setProjectName("1");

        Assert.assertEquals("1", vo.getProjectName());
        Assert.assertEquals("1", vo.getToken());
        Assert.assertEquals(true, vo.isNeverExpired());
        Assert.assertEquals(1, vo.getExpiredTime());
        Assert.assertEquals(1, vo.getProjectId().intValue());
    }
}
