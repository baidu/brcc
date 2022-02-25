package com.baidu.brcc.utils;

import com.baidu.brcc.domain.base.R;
import com.baidu.brcc.domain.em.SortType;

import static com.baidu.brcc.common.ErrorStatusMsg.PARAM_ERROR_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PARAM_ERROR_STATUS;

public class SqlUtils {
    public static boolean isValid(String sortBy) {
        return sortBy.equals(SortType.DESC.getValue()) || sortBy.equals(SortType.ASC.getValue());
    }
}
