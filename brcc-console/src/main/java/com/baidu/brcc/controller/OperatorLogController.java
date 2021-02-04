/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.controller;

import static org.apache.commons.lang3.StringUtils.isNotBlank;
import static org.apache.commons.lang3.StringUtils.trim;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baidu.brcc.domain.OperationLog;
import com.baidu.brcc.domain.OperationLogExample;
import com.baidu.brcc.domain.base.Pagination;
import com.baidu.brcc.domain.base.R;
import com.baidu.brcc.service.OperationLogService;

/**
 * 操作日志相关接口
 */
@RestController
@RequestMapping("logs")
public class OperatorLogController {
    @Autowired
    private OperationLogService operationLogService;

    /**
     * 首页加载，查询操作日志，默认20条
     * @param startTime
     * @param endTime
     * @param operator
     * @param pageNo
     * @param pageSize
     * @return
     */
    @GetMapping("list")
    public R<Pagination<OperationLog>> pagination(
            @RequestParam(name = "startTime", required = false) Long startTime,
            @RequestParam(name = "endTime", required = false) Long endTime,
            @RequestParam(name = "operator", required = false) String operator,
            @RequestParam(value = "pageNo", defaultValue = "1") Integer pageNo,
            @RequestParam(value = "pageSize", defaultValue = "20") Integer pageSize
    ) {
        pageNo = pageNo == null || pageNo < 0 ? 1 : pageNo;
        if (pageSize == null || pageSize < 0) {
            pageSize = 20;
        } else if (pageSize > 200) {
            pageSize = 200;
        }
        int offset = (pageNo - 1) * pageSize;
        Pagination<OperationLog> pagination = operationLogService.pagination(OperationLogExample.newBuilder()
                .orderByClause("id desc")
                .start(offset)
                .limit(pageSize)
                .build()
                .createCriteria()
                .andCreateTimeGreaterThanOrEqualTo(startTime == null ? null : new Date(startTime),
                        startTime != null && startTime > 0)
                .andCreateTimeLessThanOrEqualTo(endTime == null ? null : new Date(endTime),
                        endTime != null && endTime > 0)
                .andOperatorEqualTo(trim(operator), isNotBlank(operator))
                .toExample()
        );
        return R.ok(pagination);
    }

}
