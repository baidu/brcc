/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.service.interceptor;

import java.sql.Statement;
import java.text.DateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.regex.Matcher;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.ParameterMapping;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.TypeHandlerRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 对MyBatis进行拦截，添加log监控
 *
 * @author Steven
 */

@Component
@Intercepts({
        @Signature(method = "query", type = Executor.class,
                args = {MappedStatement.class, Object.class, RowBounds.class,
                        ResultHandler.class}),
        @Signature(method = "batch", type = StatementHandler.class,
                args = {Statement.class}),
        @Signature(method = "update", type = Executor.class,
                args = {MappedStatement.class, Object.class})})
public class MybatisLogPlugin implements Interceptor {

    private static final Logger LOGGER = LoggerFactory.getLogger(MybatisLogPlugin.class);

    private DateFormat formatter = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT, Locale.CHINA);
    @Value("${mybatis.configuration.print.realSql: true}")
    private boolean printRealSql = true;

    @Value("${mybatis.configuration.print.bindSql: true}")
    private boolean printBindSql = true;

    private Object proceed(Invocation invocation) throws Throwable {
        long startTime = System.currentTimeMillis();
        try {
            return invocation.proceed();
        } finally {
            LOGGER.debug("INVOKE_SQL cost[{} ms]", System.currentTimeMillis() - startTime);
        }
    }

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        // 日志级别不足
        if (!LOGGER.isDebugEnabled()) {
            return invocation.proceed();
        }
        // 日志开关关闭
        if (!printRealSql && !printBindSql) {
            return invocation.proceed();
        }
        // 开始记录日志
        Object returnObj = null;
        try {
            returnObj = proceed(invocation);
            endSqlTrace(invocation, returnObj);
        } catch (Exception e) {
            throw e;
        }
        return returnObj;
    }

    private void endSqlTrace(Invocation invocation, Object returnObj) {
        MappedStatement mappedStatement = (MappedStatement) invocation.getArgs()[0];
        // 得到类名，方法
        String sqlId = mappedStatement.getId();
        // 获取SQL类型
        SqlCommandType sqlCommandType = mappedStatement.getSqlCommandType();

        // 得到sql语句
        Object parameter = null;
        if (invocation.getArgs().length > 1) {
            parameter = invocation.getArgs()[1];
        }

        String sql = getRealSql(mappedStatement, parameter);

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug(" ==>  Preparing[{}][{}]: {}", sqlCommandType, sqlId, sql);
            if (returnObj == null) {
                LOGGER.debug(" ==> returns: no record.");
            } else if (returnObj instanceof Collection) {
                LOGGER.debug(" ==> returns: {} records.", ((Collection) returnObj).size());
            } else if (returnObj instanceof Number) {
                LOGGER.debug(" ==> returns: {}", returnObj);
            } else {
                LOGGER.debug(" ==> returns: 1 record.");
            }

        }

    }

    private Object[] getRealParams(Object parameter) {
        Object[] realParams = null;
        if (parameter != null) {
            if (parameter instanceof Object[]) {
                realParams = (Object[]) parameter;
            } else {
                realParams = new Object[1];
                realParams[0] = parameter;
            }
        }
        return realParams;
    }

    private String getRealSql(MappedStatement mappedStatement, Object parameter) {
        String sql = "";
        if (mappedStatement == null) {
            return sql;
        }
        try {
            BoundSql boundSql = mappedStatement.getBoundSql(parameter);
            if (!printRealSql) {
                return boundSql.getSql().replaceAll("[\\s]+", " ");
            }
            Configuration configuration = mappedStatement.getConfiguration();
            sql = showSql(configuration, boundSql);
        } catch (Exception e) {
            LOGGER.warn("MyLogMybatisPluginException: get sql exception", e);
        }
        return sql;
    }

    /**
     * 解析sql语句
     *
     * @param configuration
     * @param boundSql
     *
     * @return
     */
    public String showSql(Configuration configuration, BoundSql boundSql) {
        Object parameterObject = boundSql.getParameterObject();
        List<ParameterMapping> parameterMappings = boundSql.getParameterMappings();
        String sql = boundSql.getSql().replaceAll("[\\s]+", " ");
        if (parameterMappings.size() > 0 && parameterObject != null) {
            TypeHandlerRegistry typeHandlerRegistry = configuration.getTypeHandlerRegistry();
            if (typeHandlerRegistry.hasTypeHandler(parameterObject.getClass())) {
                sql = sql.replaceFirst("\\?",
                        Matcher.quoteReplacement(getParameterValue(parameterObject)));

            } else {
                MetaObject metaObject = configuration.newMetaObject(parameterObject);
                for (ParameterMapping parameterMapping : parameterMappings) {
                    String propertyName = parameterMapping.getProperty();
                    if (metaObject.hasGetter(propertyName)) {
                        Object obj = metaObject.getValue(propertyName);
                        sql = sql.replaceFirst("\\?",
                                Matcher.quoteReplacement(getParameterValue(obj)));
                    } else if (boundSql.hasAdditionalParameter(propertyName)) {
                        Object obj = boundSql.getAdditionalParameter(propertyName);
                        sql = sql.replaceFirst("\\?",
                                Matcher.quoteReplacement(getParameterValue(obj)));
                    }
                }
            }
        }
        return sql;
    }

    /**
     * 参数解析
     *
     * @param obj
     *
     * @return
     */
    private String getParameterValue(Object obj) {
        String value = null;
        if (obj instanceof String) {
            value = "'" + obj.toString() + "'";
        } else if (obj instanceof Date) {
            value = "'" + formatter.format(obj) + "'";
        } else {
            if (obj != null) {
                value = obj.toString();
            } else {
                value = "";
            }

        }
        return value;
    }

    @Override
    public Object plugin(Object target) {
        if (target instanceof Executor) {
            return Plugin.wrap(target, this);
        }
        return target;
    }

    @Override
    public void setProperties(Properties properties) {
    }

}
