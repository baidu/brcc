/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.example;

import org.junit.Test;

import com.baidu.brcc.exception.RccException;

public class ApplicationTest {

    @Test(expected = RccException.class)
    public void testMain() throws Exception {
        Application.main(new String[] {"1"});
    }
}
