/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc;

import org.junit.Test;
import org.springframework.context.ApplicationContextException;

public class RccApplicationTest {

    @Test(expected = ApplicationContextException.class)
    public void testMain() throws Exception {
        RccApplication.main(new String[] {"args"});
    }
}
