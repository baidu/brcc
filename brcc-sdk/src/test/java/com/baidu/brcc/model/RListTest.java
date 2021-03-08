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

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class RListTest {

    @Test
    public void test() {
        R<Object> error = RList.error();
        Assert.assertNotNull(error);
        R<Object> ok = RList.ok();
        Assert.assertNotNull(ok);

        R<Object> error1 = RList.error("error");
        Assert.assertEquals("error", error1.getMsg());

        R<Object> error2 = RList.error(1, "error");
        Assert.assertEquals(1, error2.getStatus());

        R<Integer> ok1 = RList.ok(1);
        Assert.assertEquals(new Integer(1), ok1.getData());

        R<Integer> ok2 = RList.ok(1, 2);
        Assert.assertEquals(new Integer(2), ok2.getExt());

        RList<Integer> rList = new RList<>();
        rList.setData(Arrays.asList(1));
        Assert.assertEquals(1, rList.getData().size());
    }

}
