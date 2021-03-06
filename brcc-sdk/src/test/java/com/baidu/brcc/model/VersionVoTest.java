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

public class VersionVoTest {

    @Test
    public void test() {
        VersionVo vo = new VersionVo();
        vo.setProjectId(1L);
        vo.setEnvironmentId(1L);
        vo.setVersionId(1L);
        vo.setVersionName("name");
        vo.setCheckSum("checkSum");

        Assert.assertEquals("name", vo.getVersionName());
        Assert.assertEquals("checkSum", vo.getCheckSum());
        Assert.assertEquals(1, vo.getVersionId().intValue());
        Assert.assertEquals(1, vo.getEnvironmentId().intValue());
        Assert.assertEquals(1, vo.getProjectId().intValue());
    }

}
