/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.dao.base;

import java.io.Serializable;
import java.util.Objects;

import org.apache.ibatis.jdbc.AbstractSQL;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

public class BaseSQL extends AbstractSQL<BaseSQL> implements Serializable {

    private static final String PARAM_HEADER = "param.";

    public static BaseSQL newInstance() {
        return new BaseSQL();
    }

    @Override
    public BaseSQL getSelf() {
        return this;
    }

    /**
     *
     * @param columnOperatorParamkey 格式为字符串column operator paramKey组合
     * @return
     *
     */
    public BaseSQL whereParamKey(String columnOperatorParamkey) {
        String[] paramKeys = columnOperatorParamkey.split("\\s+");
        Assert.isTrue(Objects.isNull(paramKeys) || paramKeys.length != 3,
                "condition 不合法,正确格式为 'column operatorType paramKey'");
        return whereParamKey(paramKeys[0], paramKeys[1], paramKeys[2]);
    }

    /**
     *
     * @param column : 字段名
     * @param operateType : 操作符,默认为=
     * @param paramKey ： 参数可以
     * @return
     *
     */
    public BaseSQL whereParamKey(String column, String operateType, String paramKey) {
        if (!StringUtils.hasText(operateType)){
            operateType = "=";
        }
        String conditions = column
                .concat(" ")
                .concat(operateType)
                .concat(" #{")
                .concat(PARAM_HEADER)
                .concat(paramKey)
                .concat("}");
        return WHERE(conditions);
    }

    /**
     *
     * @param paramKeys : 参数个数是3的N倍,N为条件组数,一组条件分别由,column, operateType(默认为=), paramKey 组成
     *                  例如：id,=,id,name,like,name,
     * @return
     *
     */
    public BaseSQL whereParamKeys(String ...paramKeys) {
        Assert.isTrue(Objects.isNull(paramKeys) || paramKeys.length == 0 || paramKeys.length % 3 != 0,
                "参数不能为空,且是成3出现的");
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < paramKeys.length / 3; i++ ){
            String column = paramKeys[i*3];
            String operateType = paramKeys[i*3 + 1];
            if (!StringUtils.hasText(operateType)){
                operateType = "=";
            }
            String paramKey = paramKeys[i*3 + 2];
            sb.append(column).append(" ").append(operateType).append(" #{").append(PARAM_HEADER).append(paramKey).append("}");
        }
        return WHERE(sb.toString());
    }
}
