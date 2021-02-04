package com.baidu.brcc.domain.base;

import java.util.HashSet;
import java.util.Set;

public abstract class BaseExampleBuilder<BUILDER extends BaseExampleBuilder, EXAMPLE extends BaseExample> {

    /**
     * 分页偏移量
     */
    protected Integer start;

    /**
     * 每页显示条数
     */
    protected Integer limit;

    /**
     * 排序
     */
    protected String orderByClause;

    /**
     * 是否去重
     */
    protected boolean distinct;

    /**
     * 返回列
     */
    protected Set<String> columns;

    /**
     * 分页偏移量
     */
    public Integer getStart() {
        return this.start;
    }

    /**
     * 每页显示条数
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * 排序
     */
    public String getOrderByClause() {
        return this.orderByClause;
    }

    /**
     * 是否去重
     */
    public boolean isDistinct() {
        return this.distinct;
    }

    /**
     * 返回列
     */
    public Set<String> getColumns() {
        return this.columns;
    }

    public BUILDER thisT() {
        return (BUILDER) this;
    }

    public BUILDER start(Integer start) {
        this.start = start;
        return thisT();
    }

    public BUILDER limit(Integer limit) {
        this.limit = limit;
        return thisT();
    }

    public BUILDER orderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
        return thisT();
    }

    public BUILDER orderByClause(String orderByClause, Boolean condition) {
        if (condition != null && condition) {
            this.orderByClause = orderByClause;
        }
        return thisT();
    }

    public BUILDER distinct(boolean distinct) {
        this.distinct = distinct;
        return thisT();
    }

    public BUILDER columns(Set<String> columns) {
        this.columns = columns;
        return thisT();
    }

    public BUILDER addColumns(String ... columns) {
        if (this.columns == null) {
            this.columns = new HashSet<>();
        }
        if (columns!=null && columns.length>0) {
            for (String column : columns) {
                this.columns.add(column);
            }
        }
        return thisT();
    }

    public abstract EXAMPLE build();
}
