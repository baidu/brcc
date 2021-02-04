/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.utils.bcrypt;

import org.springframework.util.DigestUtils;

public class Md5Util {

    public static String md5(String password) {
        return DigestUtils.md5DigestAsHex(password.getBytes());
    }
}
