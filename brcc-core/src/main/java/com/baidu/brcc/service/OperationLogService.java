/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.service;

import com.baidu.brcc.service.base.GenericService;
import com.baidu.brcc.domain.OperationLog;
import com.baidu.brcc.domain.OperationLogExample;

public interface OperationLogService extends GenericService<OperationLog, Long, OperationLogExample> {

    void saveLogWithBackground(Long userId, String operator, String scene, String request, String response,
                               String remoteAddress);
}
