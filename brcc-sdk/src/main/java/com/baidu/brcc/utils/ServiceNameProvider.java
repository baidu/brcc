/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.utils;

import java.util.List;

public interface ServiceNameProvider {

    /**
     * 返回提供服务地址
     *
     * @return
     */
    List<String> getServiceNames();

}
