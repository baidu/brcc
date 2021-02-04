package com.baidu.brcc.domain.base;

import java.util.HashSet;
import java.util.Set;

public abstract class BaseExample {

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
     * 分页偏移量
     */
    public void setStart(Integer start) {
        this.start = start;
    }

    /**
     * 每页显示条数
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * 每页显示条数
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * 排序
     */
    public String getOrderByClause() {
        return this.orderByClause;
    }

    /**
     * 排序
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 是否去重
     */
    public boolean isDistinct() {
        return this.distinct;
    }

    /**
     * 是否去重
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 返回列
     */
    public Set<String> getColumns() {
        return this.columns;
    }

    /**
     * 返回列
     */
    public void setColumns(Set<String> columns) {
        this.columns = columns;
    }

    public void addColumns(String ... columns) {
        if (this.columns == null) {
            this.columns = new HashSet<>();
        }
        if (columns!=null && columns.length>0) {
            for (String column : columns) {
                this.columns.add(column);
            }
        }
    }
}
