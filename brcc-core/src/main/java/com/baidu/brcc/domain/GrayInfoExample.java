/*
 * Copyright (c) Baidu Inc. All rights reserved.
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.baidu.brcc.domain;

import com.baidu.brcc.domain.base.BaseExample;
import com.baidu.brcc.domain.base.BaseExampleBuilder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class GrayInfoExample extends BaseExample {
    protected List<GrayInfoExample.Criteria> oredCriteria;

    private GrayInfoExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * 版本
     */
    private GrayInfoExample(GrayInfoExample.Builder builder) {
        this.start = builder.getStart();
        this.limit = builder.getLimit();
        this.orderByClause = builder.getOrderByClause();
        this.distinct = builder.isDistinct();
        this.columns = builder.getColumns();
        this.oredCriteria = new ArrayList<>();
    }

    public static GrayInfoExample.Builder newBuilder() {
        return new GrayInfoExample.Builder();
    }

    public List<GrayInfoExample.Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(GrayInfoExample.Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public GrayInfoExample.Criteria or() {
        GrayInfoExample.Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public GrayInfoExample.Criteria createCriteria() {
        GrayInfoExample.Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected GrayInfoExample.Criteria createCriteriaInternal() {
        GrayInfoExample.Criteria criteria = new GrayInfoExample.Criteria(this);
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {

        protected List<GrayInfoExample.Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<GrayInfoExample.Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<GrayInfoExample.Criterion> getAllCriteria() {
            return criteria;
        }

        public List<GrayInfoExample.Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new GrayInfoExample.Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new GrayInfoExample.Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new GrayInfoExample.Criterion(condition, value1, value2));
        }

        public GrayInfoExample.Criteria andIdIsNull() {
            addCriterion("id is null");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andIdEqualTo(Long value) {
            return andIdEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andIdEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("id =", value, "id");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andIdNotEqualTo(Long value) {
            return andIdNotEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andIdNotEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("id <>", value, "id");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andIdGreaterThan(Long value) {
            return andIdGreaterThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andIdGreaterThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("id >", value, "id");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andIdGreaterThanOrEqualTo(Long value) {
            return andIdGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andIdGreaterThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("id >=", value, "id");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andIdLessThan(Long value) {
            return andIdLessThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andIdLessThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("id <", value, "id");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andIdLessThanOrEqualTo(Long value) {
            return andIdLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andIdLessThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("id <=", value, "id");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andIdIn(Collection<Long> values) {
            addCriterion("id in", values, "id");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andIdNotIn(Collection<Long> values) {
            addCriterion("id not in", values, "id");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andNameIsNull() {
            addCriterion("name is null");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andVersionIdEqualTo(Long value) {
            return andVersionIdEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andVersionIdEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("version_id =", value, "versionId");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andNameNotEqualTo(String value) {
            return andNameNotEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andNameNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("name <>", value, "name");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andNameGreaterThan(String value) {
            return andNameGreaterThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andNameGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("name >", value, "name");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andNameGreaterThanOrEqualTo(String value) {
            return andNameGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andNameGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("name >=", value, "name");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andNameLessThan(String value) {
            return andNameLessThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andNameLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("name <", value, "name");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andNameLessThanOrEqualTo(String value) {
            return andNameLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andNameLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("name <=", value, "name");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andNameLike(String value) {
            return andNameLike(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andNameLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("name like", value, "name");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andNameLikeLeft(String value) {
            return andNameLikeLeft(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andNameLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("name like", value, "name");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andNameLikeRight(String value) {
            return andNameLikeRight(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andNameLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("name like", value, "name");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andNameLikeBoth(String value) {
            return andNameLikeBoth(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andNameLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("name like", value, "name");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andNameNotLike(String value) {
            return andNameNotLike(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andNameNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("name not like", value, "name");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andNameNotLikeLeft(String value) {
            return andNameNotLikeLeft(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andNameNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("name not like", value, "name");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andNameNotLikeRight(String value) {
            return andNameNotLikeRight(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andNameNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("name not like", value, "name");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andNameNotLikeBoth(String value) {
            return andNameNotLikeBoth(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andNameNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("name not like", value, "name");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andNameIn(Collection<String> values) {
            addCriterion("name in", values, "name");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andNameNotIn(Collection<String> values) {
            addCriterion("name not in", values, "name");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andGrayVersionIdEqualTo(Long value) {
            return andGrayVersionIdEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andGrayVersionIdEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("product_id =", value, "productId");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andProductIdNotEqualTo(Long value) {
            return andProductIdNotEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andProductIdNotEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("product_id <>", value, "productId");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andProductIdGreaterThan(Long value) {
            return andProductIdGreaterThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andProductIdGreaterThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("product_id >", value, "productId");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andProductIdGreaterThanOrEqualTo(Long value) {
            return andProductIdGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andProductIdGreaterThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("product_id >=", value, "productId");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andProductIdLessThan(Long value) {
            return andProductIdLessThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andProductIdLessThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("product_id <", value, "productId");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andProductIdLessThanOrEqualTo(Long value) {
            return andProductIdLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andProductIdLessThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("product_id <=", value, "productId");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andProductIdIn(Collection<Long> values) {
            addCriterion("product_id in", values, "productId");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andProductIdNotIn(Collection<Long> values) {
            addCriterion("product_id not in", values, "productId");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andProductIdBetween(Long value1, Long value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andProductIdNotBetween(Long value1, Long value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andRuleContentEqualTo(String value) {
            return andRuleContentEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andRuleContentEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("rule_content =", value, "ruleContent");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andRuleNameEqualTo(String value) {
            return andRuleContentEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andRuleNameEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("rule_name =", value, "ruleName");
            return (GrayInfoExample.Criteria) this;
        }



        public GrayInfoExample.Criteria andMemoGreaterThan(String value) {
            return andMemoGreaterThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andMemoGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("memo >", value, "memo");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andMemoGreaterThanOrEqualTo(String value) {
            return andMemoGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andMemoGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("memo >=", value, "memo");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andMemoLessThan(String value) {
            return andMemoLessThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andMemoLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("memo <", value, "memo");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andMemoLessThanOrEqualTo(String value) {
            return andMemoLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andMemoLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("memo <=", value, "memo");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andMemoLike(String value) {
            return andMemoLike(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andMemoLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("memo like", value, "memo");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andMemoLikeLeft(String value) {
            return andMemoLikeLeft(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andMemoLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("memo like", value, "memo");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andMemoLikeRight(String value) {
            return andMemoLikeRight(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andMemoLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("memo like", value, "memo");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andMemoLikeBoth(String value) {
            return andMemoLikeBoth(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andMemoLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("memo like", value, "memo");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andMemoNotLike(String value) {
            return andMemoNotLike(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andMemoNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("memo not like", value, "memo");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andMemoNotLikeLeft(String value) {
            return andMemoNotLikeLeft(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andMemoNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("memo not like", value, "memo");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andMemoNotLikeRight(String value) {
            return andMemoNotLikeRight(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andMemoNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("memo not like", value, "memo");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andMemoNotLikeBoth(String value) {
            return andMemoNotLikeBoth(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andMemoNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("memo not like", value, "memo");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andMemoIn(Collection<String> values) {
            addCriterion("memo in", values, "memo");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andMemoNotIn(Collection<String> values) {
            addCriterion("memo not in", values, "memo");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andProjectIdEqualTo(Long value) {
            return andProjectIdEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andProjectIdEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("project_id =", value, "projectId");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andProjectIdNotEqualTo(Long value) {
            return andProjectIdNotEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andProjectIdNotEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("project_id <>", value, "projectId");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andProjectIdGreaterThan(Long value) {
            return andProjectIdGreaterThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andProjectIdGreaterThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("project_id >", value, "projectId");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andProjectIdGreaterThanOrEqualTo(Long value) {
            return andProjectIdGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andProjectIdGreaterThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("project_id >=", value, "projectId");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andProjectIdLessThan(Long value) {
            return andProjectIdLessThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andProjectIdLessThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("project_id <", value, "projectId");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andProjectIdLessThanOrEqualTo(Long value) {
            return andProjectIdLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andProjectIdLessThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("project_id <=", value, "projectId");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andProjectIdIn(Collection<Long> values) {
            addCriterion("project_id in", values, "projectId");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andProjectIdNotIn(Collection<Long> values) {
            addCriterion("project_id not in", values, "projectId");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andProjectIdBetween(Long value1, Long value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andProjectIdNotBetween(Long value1, Long value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andEnvironmentIdIsNull() {
            addCriterion("environment_id is null");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andEnvironmentIdIsNotNull() {
            addCriterion("environment_id is not null");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andEnvironmentIdEqualTo(Long value) {
            return andEnvironmentIdEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andEnvironmentIdEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("environment_id =", value, "environmentId");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andEnvironmentIdNotEqualTo(Long value) {
            return andEnvironmentIdNotEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andEnvironmentIdNotEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("environment_id <>", value, "environmentId");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andEnvironmentIdGreaterThan(Long value) {
            return andEnvironmentIdGreaterThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andEnvironmentIdGreaterThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("environment_id >", value, "environmentId");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andEnvironmentIdGreaterThanOrEqualTo(Long value) {
            return andEnvironmentIdGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andEnvironmentIdGreaterThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("environment_id >=", value, "environmentId");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andEnvironmentIdLessThan(Long value) {
            return andEnvironmentIdLessThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andEnvironmentIdLessThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("environment_id <", value, "environmentId");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andEnvironmentIdLessThanOrEqualTo(Long value) {
            return andEnvironmentIdLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andEnvironmentIdLessThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("environment_id <=", value, "environmentId");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andEnvironmentIdIn(Collection<Long> values) {
            addCriterion("environment_id in", values, "environmentId");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andEnvironmentIdNotIn(Collection<Long> values) {
            addCriterion("environment_id not in", values, "environmentId");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andEnvironmentIdBetween(Long value1, Long value2) {
            addCriterion("environment_id between", value1, value2, "environmentId");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andEnvironmentIdNotBetween(Long value1, Long value2) {
            addCriterion("environment_id not between", value1, value2, "environmentId");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumIsNull() {
            addCriterion("check_sum is null");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumIsNotNull() {
            addCriterion("check_sum is not null");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumEqualTo(String value) {
            return andCheckSumEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andCheckSumEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("check_sum =", value, "checkSum");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumNotEqualTo(String value) {
            return andCheckSumNotEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andCheckSumNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("check_sum <>", value, "checkSum");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumGreaterThan(String value) {
            return andCheckSumGreaterThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andCheckSumGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("check_sum >", value, "checkSum");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumGreaterThanOrEqualTo(String value) {
            return andCheckSumGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andCheckSumGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("check_sum >=", value, "checkSum");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumLessThan(String value) {
            return andCheckSumLessThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andCheckSumLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("check_sum <", value, "checkSum");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumLessThanOrEqualTo(String value) {
            return andCheckSumLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andCheckSumLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("check_sum <=", value, "checkSum");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumLike(String value) {
            return andCheckSumLike(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andCheckSumLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("check_sum like", value, "checkSum");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumLikeLeft(String value) {
            return andCheckSumLikeLeft(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andCheckSumLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("check_sum like", value, "checkSum");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumLikeRight(String value) {
            return andCheckSumLikeRight(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andCheckSumLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("check_sum like", value, "checkSum");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumLikeBoth(String value) {
            return andCheckSumLikeBoth(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andCheckSumLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("check_sum like", value, "checkSum");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumNotLike(String value) {
            return andCheckSumNotLike(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andCheckSumNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("check_sum not like", value, "checkSum");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumNotLikeLeft(String value) {
            return andCheckSumNotLikeLeft(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andCheckSumNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("check_sum not like", value, "checkSum");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumNotLikeRight(String value) {
            return andCheckSumNotLikeRight(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andCheckSumNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("check_sum not like", value, "checkSum");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumNotLikeBoth(String value) {
            return andCheckSumNotLikeBoth(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andCheckSumNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("check_sum not like", value, "checkSum");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumIn(Collection<String> values) {
            addCriterion("check_sum in", values, "checkSum");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumNotIn(Collection<String> values) {
            addCriterion("check_sum not in", values, "checkSum");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumBetween(String value1, String value2) {
            addCriterion("check_sum between", value1, value2, "checkSum");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumNotBetween(String value1, String value2) {
            addCriterion("check_sum not between", value1, value2, "checkSum");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumDateIsNull() {
            addCriterion("check_sum_date is null");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumDateIsNotNull() {
            addCriterion("check_sum_date is not null");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumDateEqualTo(Date value) {
            return andCheckSumDateEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andCheckSumDateEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("check_sum_date =", value, "checkSumDate");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumDateNotEqualTo(Date value) {
            return andCheckSumDateNotEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andCheckSumDateNotEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("check_sum_date <>", value, "checkSumDate");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumDateGreaterThan(Date value) {
            return andCheckSumDateGreaterThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andCheckSumDateGreaterThan(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("check_sum_date >", value, "checkSumDate");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumDateGreaterThanOrEqualTo(Date value) {
            return andCheckSumDateGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andCheckSumDateGreaterThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("check_sum_date >=", value, "checkSumDate");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumDateLessThan(Date value) {
            return andCheckSumDateLessThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andCheckSumDateLessThan(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("check_sum_date <", value, "checkSumDate");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumDateLessThanOrEqualTo(Date value) {
            return andCheckSumDateLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andCheckSumDateLessThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("check_sum_date <=", value, "checkSumDate");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumDateIn(Collection<Date> values) {
            addCriterion("check_sum_date in", values, "checkSumDate");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumDateNotIn(Collection<Date> values) {
            addCriterion("check_sum_date not in", values, "checkSumDate");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumDateBetween(Date value1, Date value2) {
            addCriterion("check_sum_date between", value1, value2, "checkSumDate");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumDateNotBetween(Date value1, Date value2) {
            addCriterion("check_sum_date not between", value1, value2, "checkSumDate");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumEnableIsNull() {
            addCriterion("check_sum_enable is null");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumEnableIsNotNull() {
            addCriterion("check_sum_enable is not null");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumEnableEqualTo(Byte value) {
            return andCheckSumEnableEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andCheckSumEnableEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("check_sum_enable =", value, "checkSumEnable");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumEnableNotEqualTo(Byte value) {
            return andCheckSumEnableNotEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andCheckSumEnableNotEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("check_sum_enable <>", value, "checkSumEnable");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumEnableGreaterThan(Byte value) {
            return andCheckSumEnableGreaterThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andCheckSumEnableGreaterThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("check_sum_enable >", value, "checkSumEnable");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumEnableGreaterThanOrEqualTo(Byte value) {
            return andCheckSumEnableGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andCheckSumEnableGreaterThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("check_sum_enable >=", value, "checkSumEnable");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumEnableLessThan(Byte value) {
            return andCheckSumEnableLessThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andCheckSumEnableLessThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("check_sum_enable <", value, "checkSumEnable");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumEnableLessThanOrEqualTo(Byte value) {
            return andCheckSumEnableLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andCheckSumEnableLessThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("check_sum_enable <=", value, "checkSumEnable");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumEnableIn(Collection<Byte> values) {
            addCriterion("check_sum_enable in", values, "checkSumEnable");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumEnableNotIn(Collection<Byte> values) {
            addCriterion("check_sum_enable not in", values, "checkSumEnable");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumEnableBetween(Byte value1, Byte value2) {
            addCriterion("check_sum_enable between", value1, value2, "checkSumEnable");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCheckSumEnableNotBetween(Byte value1, Byte value2) {
            addCriterion("check_sum_enable not between", value1, value2, "checkSumEnable");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andDeletedEqualTo(Byte value) {
            return andDeletedEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andDeletedEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("deleted =", value, "deleted");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andDeletedNotEqualTo(Byte value) {
            return andDeletedNotEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andDeletedNotEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("deleted <>", value, "deleted");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andDeletedGreaterThan(Byte value) {
            return andDeletedGreaterThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andDeletedGreaterThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("deleted >", value, "deleted");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andDeletedGreaterThanOrEqualTo(Byte value) {
            return andDeletedGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andDeletedGreaterThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("deleted >=", value, "deleted");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andDeletedLessThan(Byte value) {
            return andDeletedLessThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andDeletedLessThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("deleted <", value, "deleted");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andDeletedLessThanOrEqualTo(Byte value) {
            return andDeletedLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andDeletedLessThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("deleted <=", value, "deleted");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andDeletedIn(Collection<Byte> values) {
            addCriterion("deleted in", values, "deleted");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andDeletedNotIn(Collection<Byte> values) {
            addCriterion("deleted not in", values, "deleted");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andDeletedBetween(Byte value1, Byte value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andDeletedNotBetween(Byte value1, Byte value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andUpdateTimeEqualTo(Date value) {
            return andUpdateTimeEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andUpdateTimeEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("update_time =", value, "updateTime");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andUpdateTimeNotEqualTo(Date value) {
            return andUpdateTimeNotEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andUpdateTimeNotEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("update_time <>", value, "updateTime");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andUpdateTimeGreaterThan(Date value) {
            return andUpdateTimeGreaterThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andUpdateTimeGreaterThan(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("update_time >", value, "updateTime");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            return andUpdateTimeGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andUpdateTimeGreaterThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("update_time >=", value, "updateTime");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andUpdateTimeLessThan(Date value) {
            return andUpdateTimeLessThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andUpdateTimeLessThan(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("update_time <", value, "updateTime");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            return andUpdateTimeLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andUpdateTimeLessThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("update_time <=", value, "updateTime");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andUpdateTimeIn(Collection<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andUpdateTimeNotIn(Collection<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCreateTimeEqualTo(Date value) {
            return andCreateTimeEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andCreateTimeEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("create_time =", value, "createTime");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCreateTimeNotEqualTo(Date value) {
            return andCreateTimeNotEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andCreateTimeNotEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("create_time <>", value, "createTime");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCreateTimeGreaterThan(Date value) {
            return andCreateTimeGreaterThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andCreateTimeGreaterThan(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("create_time >", value, "createTime");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            return andCreateTimeGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andCreateTimeGreaterThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("create_time >=", value, "createTime");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCreateTimeLessThan(Date value) {
            return andCreateTimeLessThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andCreateTimeLessThan(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("create_time <", value, "createTime");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            return andCreateTimeLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.Criteria andCreateTimeLessThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion("create_time <=", value, "createTime");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCreateTimeIn(Collection<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCreateTimeNotIn(Collection<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (GrayInfoExample.Criteria) this;
        }

        public GrayInfoExample.Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (GrayInfoExample.Criteria) this;
        }
    }

    public static class Criteria extends GrayInfoExample.GeneratedCriteria {

        private GrayInfoExample example;

        protected Criteria(GrayInfoExample example) {
            super();
            this.example = example;
        }

        public GrayInfoExample toExample() {
            return this.example;
        }

        public GrayInfoExample.Criteria addCustomerCriteria(String condition) {
            addCriterion(condition);
            return this;
        }

        public GrayInfoExample.Criteria addCustomerCriteria(String condition, Boolean bCondition) {
            if (bCondition == null || !bCondition){
                return (GrayInfoExample.Criteria) this;
            }
            addCriterion(condition);
            return this;
        }

        /**
         * 举例: exists(select 1 from b where b.aid = a.id and b.id=#{criterion.value})
         */
        public GrayInfoExample.Criteria addCustomerCriteria(String condition, Object value) {
            addCriterion(condition,value,"customerCondition");
            return this;
        }

        public GrayInfoExample.CriterionGroup andGroupCriterion() {
            GrayInfoExample.CriterionGroup group = new GrayInfoExample.CriterionGroup("");
            group.type = 1;
            group.criteria = this;
            criteria.add(group);
            return group;
        }

        public GrayInfoExample.CriterionGroup andGroupCriterion(Boolean condition) {
            GrayInfoExample.CriterionGroup group = new GrayInfoExample.CriterionGroup("");
            group.type = 1;
            group.criteria = this;
            if (condition) {
                criteria.add(group);
            }
            return group;
        }
    }

    public static class Criterion {

        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        /**
         * // 0 - 普通, 1 - CriterionGroup
         */
        protected byte type;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        public byte getType() {
            return type;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof Collection<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }

    public static class CriterionGroup extends GrayInfoExample.Criterion {

        private GrayInfoExample.Criteria criteria;

        protected List<GrayInfoExample.Criterion> inlineOrCriteria;

        public GrayInfoExample.Criteria getCriteria() {
            return criteria;
        }

        public List<GrayInfoExample.Criterion> getInlineOrCriteria() {
            return inlineOrCriteria;
        }

        protected CriterionGroup(String condition) {
            super(condition);
        }

        protected CriterionGroup(String condition, Object value, String typeHandler) {
            super(condition, value, typeHandler);
        }

        protected CriterionGroup(String condition, Object value) {
            super(condition, value);
        }

        protected CriterionGroup(String condition, Object value, Object secondValue, String typeHandler) {
            super(condition, value, secondValue, typeHandler);
        }

        protected CriterionGroup(String condition, Object value, Object secondValue) {
            super(condition, value, secondValue);
        }

        public GrayInfoExample.CriterionGroup or(GrayInfoExample.Criterion criterion) {
            if (inlineOrCriteria == null) {
                inlineOrCriteria = new ArrayList<>();
            }
            inlineOrCriteria.add(criterion);
            return this;
        }

        public GrayInfoExample.Criteria toCriteria() {
            return criteria;
        }

        public GrayInfoExample.CriterionGroup orIdIsNull() {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("id is null");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orIdIsNotNull() {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("id is not null");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orIdEqualTo(Long value) {
            return orIdEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orIdEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("id =", value, "id");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orIdNotEqualTo(Long value) {
            return orIdNotEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orIdNotEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("id <>", value, "id");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orIdGreaterThan(Long value) {
            return orIdGreaterThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orIdGreaterThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("id >", value, "id");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orIdGreaterThanOrEqualTo(Long value) {
            return orIdGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orIdGreaterThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("id >=", value, "id");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orIdLessThan(Long value) {
            return orIdLessThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orIdLessThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("id <", value, "id");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orIdLessThanOrEqualTo(Long value) {
            return orIdLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orIdLessThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("id <=", value, "id");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orIdIn(Collection<Long> values) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("id in", values, "id");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orIdNotIn(Collection<Long> values) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("id not in", values, "id");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orIdBetween(Long value1, Long value2) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("id between", value1, value2, "id");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orIdNotBetween(Long value1, Long value2) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("id not between", value1, value2, "id");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orRuleNameIsNull() {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("name is null");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orRuleNameIsNotNull() {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("name is not null");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orRuleNameEqualTo(String value) {
            return orRuleNameEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orRuleNameEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("rule_name =", value, "ruleName");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orRuleNameNotEqualTo(String value) {
            return orRuleNameNotEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orRuleNameNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("name <>", value, "name");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orNameGreaterThan(String value) {
            return orNameGreaterThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orNameGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("name >", value, "name");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orNameGreaterThanOrEqualTo(String value) {
            return orNameGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orNameGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("name >=", value, "name");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orNameLessThan(String value) {
            return orNameLessThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orNameLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("name <", value, "name");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orNameLessThanOrEqualTo(String value) {
            return orNameLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orNameLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("name <=", value, "name");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orNameLike(String value) {
            return orNameLike(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orNameLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("name like", value, "name");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orNameLikeLeft(String value) {
            return orNameLikeLeft(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orNameLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("name like", value, "name");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orNameLikeRight(String value) {
            return orNameLikeRight(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orNameLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("name like", value, "name");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orNameLikeBoth(String value) {
            return orNameLikeBoth(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orNameLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("name like", value, "name");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orNameNotLike(String value) {
            return orNameNotLike(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orNameNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("name not like", value, "name");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orNameNotLikeLeft(String value) {
            return orNameNotLikeLeft(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orNameNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("name not like", value, "name");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orNameNotLikeRight(String value) {
            return orNameNotLikeRight(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orNameNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("name not like", value, "name");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orNameNotLikeBoth(String value) {
            return orNameNotLikeBoth(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orNameNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("name not like", value, "name");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orNameIn(Collection<String> values) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("name in", values, "name");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orNameNotIn(Collection<String> values) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("name not in", values, "name");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orNameBetween(String value1, String value2) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("name between", value1, value2, "name");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orNameNotBetween(String value1, String value2) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("name not between", value1, value2, "name");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orProductIdIsNull() {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("product_id is null");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orProductIdIsNotNull() {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("product_id is not null");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orProductIdEqualTo(Long value) {
            return orProductIdEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orProductIdEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("product_id =", value, "productId");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orProductIdNotEqualTo(Long value) {
            return orProductIdNotEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orProductIdNotEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("product_id <>", value, "productId");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orProductIdGreaterThan(Long value) {
            return orProductIdGreaterThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orProductIdGreaterThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("product_id >", value, "productId");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orProductIdGreaterThanOrEqualTo(Long value) {
            return orProductIdGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orProductIdGreaterThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("product_id >=", value, "productId");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orProductIdLessThan(Long value) {
            return orProductIdLessThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orProductIdLessThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("product_id <", value, "productId");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orProductIdLessThanOrEqualTo(Long value) {
            return orProductIdLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orProductIdLessThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("product_id <=", value, "productId");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orProductIdIn(Collection<Long> values) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("product_id in", values, "productId");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orProductIdNotIn(Collection<Long> values) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("product_id not in", values, "productId");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orProductIdBetween(Long value1, Long value2) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("product_id between", value1, value2, "productId");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orProductIdNotBetween(Long value1, Long value2) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("product_id not between", value1, value2, "productId");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orMemoIsNull() {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("memo is null");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orMemoIsNotNull() {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("memo is not null");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orMemoEqualTo(String value) {
            return orMemoEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orMemoEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("memo =", value, "memo");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orMemoNotEqualTo(String value) {
            return orMemoNotEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orMemoNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("memo <>", value, "memo");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orMemoGreaterThan(String value) {
            return orMemoGreaterThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orMemoGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("memo >", value, "memo");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orMemoGreaterThanOrEqualTo(String value) {
            return orMemoGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orMemoGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("memo >=", value, "memo");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orMemoLessThan(String value) {
            return orMemoLessThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orMemoLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("memo <", value, "memo");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orMemoLessThanOrEqualTo(String value) {
            return orMemoLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orMemoLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("memo <=", value, "memo");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orMemoLike(String value) {
            return orMemoLike(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orMemoLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("memo like", value, "memo");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orMemoLikeLeft(String value) {
            return orMemoLikeLeft(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orMemoLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("memo like", value, "memo");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orMemoLikeRight(String value) {
            return orMemoLikeRight(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orMemoLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("memo like", value, "memo");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orMemoLikeBoth(String value) {
            return orMemoLikeBoth(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orMemoLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("memo like", value, "memo");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orMemoNotLike(String value) {
            return orMemoNotLike(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orMemoNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("memo not like", value, "memo");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orMemoNotLikeLeft(String value) {
            return orMemoNotLikeLeft(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orMemoNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("memo not like", value, "memo");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orMemoNotLikeRight(String value) {
            return orMemoNotLikeRight(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orMemoNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("memo not like", value, "memo");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orMemoNotLikeBoth(String value) {
            return orMemoNotLikeBoth(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orMemoNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("memo not like", value, "memo");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orMemoIn(Collection<String> values) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("memo in", values, "memo");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orMemoNotIn(Collection<String> values) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("memo not in", values, "memo");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orMemoBetween(String value1, String value2) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("memo between", value1, value2, "memo");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orMemoNotBetween(String value1, String value2) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("memo not between", value1, value2, "memo");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orProjectIdIsNull() {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("project_id is null");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orProjectIdIsNotNull() {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("project_id is not null");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orProjectIdEqualTo(Long value) {
            return orProjectIdEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orProjectIdEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("project_id =", value, "projectId");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orProjectIdNotEqualTo(Long value) {
            return orProjectIdNotEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orProjectIdNotEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("project_id <>", value, "projectId");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orProjectIdGreaterThan(Long value) {
            return orProjectIdGreaterThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orProjectIdGreaterThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("project_id >", value, "projectId");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orProjectIdGreaterThanOrEqualTo(Long value) {
            return orProjectIdGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orProjectIdGreaterThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("project_id >=", value, "projectId");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orProjectIdLessThan(Long value) {
            return orProjectIdLessThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orProjectIdLessThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("project_id <", value, "projectId");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orProjectIdLessThanOrEqualTo(Long value) {
            return orProjectIdLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orProjectIdLessThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("project_id <=", value, "projectId");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orProjectIdIn(Collection<Long> values) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("project_id in", values, "projectId");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orProjectIdNotIn(Collection<Long> values) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("project_id not in", values, "projectId");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orProjectIdBetween(Long value1, Long value2) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("project_id between", value1, value2, "projectId");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orProjectIdNotBetween(Long value1, Long value2) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("project_id not between", value1, value2, "projectId");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orEnvironmentIdIsNull() {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("environment_id is null");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orEnvironmentIdIsNotNull() {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("environment_id is not null");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orEnvironmentIdEqualTo(Long value) {
            return orEnvironmentIdEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orEnvironmentIdEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("environment_id =", value, "environmentId");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orEnvironmentIdNotEqualTo(Long value) {
            return orEnvironmentIdNotEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orEnvironmentIdNotEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("environment_id <>", value, "environmentId");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orEnvironmentIdGreaterThan(Long value) {
            return orEnvironmentIdGreaterThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orEnvironmentIdGreaterThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("environment_id >", value, "environmentId");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orEnvironmentIdGreaterThanOrEqualTo(Long value) {
            return orEnvironmentIdGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orEnvironmentIdGreaterThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("environment_id >=", value, "environmentId");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orEnvironmentIdLessThan(Long value) {
            return orEnvironmentIdLessThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orEnvironmentIdLessThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("environment_id <", value, "environmentId");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orEnvironmentIdLessThanOrEqualTo(Long value) {
            return orEnvironmentIdLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orEnvironmentIdLessThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("environment_id <=", value, "environmentId");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orEnvironmentIdIn(Collection<Long> values) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("environment_id in", values, "environmentId");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orEnvironmentIdNotIn(Collection<Long> values) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("environment_id not in", values, "environmentId");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orEnvironmentIdBetween(Long value1, Long value2) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("environment_id between", value1, value2, "environmentId");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orEnvironmentIdNotBetween(Long value1, Long value2) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("environment_id not between", value1, value2, "environmentId");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumIsNull() {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum is null");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumIsNotNull() {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum is not null");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumEqualTo(String value) {
            return orCheckSumEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orCheckSumEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum =", value, "checkSum");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumNotEqualTo(String value) {
            return orCheckSumNotEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orCheckSumNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum <>", value, "checkSum");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumGreaterThan(String value) {
            return orCheckSumGreaterThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orCheckSumGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum >", value, "checkSum");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumGreaterThanOrEqualTo(String value) {
            return orCheckSumGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orCheckSumGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum >=", value, "checkSum");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumLessThan(String value) {
            return orCheckSumLessThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orCheckSumLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum <", value, "checkSum");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumLessThanOrEqualTo(String value) {
            return orCheckSumLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orCheckSumLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum <=", value, "checkSum");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumLike(String value) {
            return orCheckSumLike(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orCheckSumLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum like", value, "checkSum");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumLikeLeft(String value) {
            return orCheckSumLikeLeft(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orCheckSumLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum like", value, "checkSum");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumLikeRight(String value) {
            return orCheckSumLikeRight(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orCheckSumLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum like", value, "checkSum");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumLikeBoth(String value) {
            return orCheckSumLikeBoth(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orCheckSumLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum like", value, "checkSum");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumNotLike(String value) {
            return orCheckSumNotLike(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orCheckSumNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum not like", value, "checkSum");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumNotLikeLeft(String value) {
            return orCheckSumNotLikeLeft(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orCheckSumNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum not like", value, "checkSum");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumNotLikeRight(String value) {
            return orCheckSumNotLikeRight(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orCheckSumNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum not like", value, "checkSum");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumNotLikeBoth(String value) {
            return orCheckSumNotLikeBoth(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orCheckSumNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum not like", value, "checkSum");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumIn(Collection<String> values) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum in", values, "checkSum");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumNotIn(Collection<String> values) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum not in", values, "checkSum");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumBetween(String value1, String value2) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum between", value1, value2, "checkSum");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumNotBetween(String value1, String value2) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum not between", value1, value2, "checkSum");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumDateIsNull() {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum_date is null");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumDateIsNotNull() {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum_date is not null");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumDateEqualTo(Date value) {
            return orCheckSumDateEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orCheckSumDateEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum_date =", value, "checkSumDate");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumDateNotEqualTo(Date value) {
            return orCheckSumDateNotEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orCheckSumDateNotEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum_date <>", value, "checkSumDate");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumDateGreaterThan(Date value) {
            return orCheckSumDateGreaterThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orCheckSumDateGreaterThan(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum_date >", value, "checkSumDate");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumDateGreaterThanOrEqualTo(Date value) {
            return orCheckSumDateGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orCheckSumDateGreaterThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum_date >=", value, "checkSumDate");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumDateLessThan(Date value) {
            return orCheckSumDateLessThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orCheckSumDateLessThan(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum_date <", value, "checkSumDate");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumDateLessThanOrEqualTo(Date value) {
            return orCheckSumDateLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orCheckSumDateLessThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum_date <=", value, "checkSumDate");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumDateIn(Collection<Date> values) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum_date in", values, "checkSumDate");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumDateNotIn(Collection<Date> values) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum_date not in", values, "checkSumDate");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumDateBetween(Date value1, Date value2) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum_date between", value1, value2, "checkSumDate");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumDateNotBetween(Date value1, Date value2) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum_date not between", value1, value2, "checkSumDate");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumEnableIsNull() {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum_enable is null");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumEnableIsNotNull() {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum_enable is not null");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumEnableEqualTo(Byte value) {
            return orCheckSumEnableEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orCheckSumEnableEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum_enable =", value, "checkSumEnable");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumEnableNotEqualTo(Byte value) {
            return orCheckSumEnableNotEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orCheckSumEnableNotEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum_enable <>", value, "checkSumEnable");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumEnableGreaterThan(Byte value) {
            return orCheckSumEnableGreaterThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orCheckSumEnableGreaterThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum_enable >", value, "checkSumEnable");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumEnableGreaterThanOrEqualTo(Byte value) {
            return orCheckSumEnableGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orCheckSumEnableGreaterThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum_enable >=", value, "checkSumEnable");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumEnableLessThan(Byte value) {
            return orCheckSumEnableLessThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orCheckSumEnableLessThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum_enable <", value, "checkSumEnable");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumEnableLessThanOrEqualTo(Byte value) {
            return orCheckSumEnableLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orCheckSumEnableLessThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum_enable <=", value, "checkSumEnable");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumEnableIn(Collection<Byte> values) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum_enable in", values, "checkSumEnable");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumEnableNotIn(Collection<Byte> values) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum_enable not in", values, "checkSumEnable");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumEnableBetween(Byte value1, Byte value2) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum_enable between", value1, value2, "checkSumEnable");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCheckSumEnableNotBetween(Byte value1, Byte value2) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("check_sum_enable not between", value1, value2, "checkSumEnable");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orDeletedIsNull() {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("deleted is null");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orDeletedIsNotNull() {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("deleted is not null");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orDeletedEqualTo(Byte value) {
            return orDeletedEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orDeletedEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("deleted =", value, "deleted");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orDeletedNotEqualTo(Byte value) {
            return orDeletedNotEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orDeletedNotEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("deleted <>", value, "deleted");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orDeletedGreaterThan(Byte value) {
            return orDeletedGreaterThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orDeletedGreaterThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("deleted >", value, "deleted");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orDeletedGreaterThanOrEqualTo(Byte value) {
            return orDeletedGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orDeletedGreaterThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("deleted >=", value, "deleted");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orDeletedLessThan(Byte value) {
            return orDeletedLessThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orDeletedLessThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("deleted <", value, "deleted");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orDeletedLessThanOrEqualTo(Byte value) {
            return orDeletedLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orDeletedLessThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("deleted <=", value, "deleted");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orDeletedIn(Collection<Byte> values) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("deleted in", values, "deleted");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orDeletedNotIn(Collection<Byte> values) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("deleted not in", values, "deleted");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orDeletedBetween(Byte value1, Byte value2) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("deleted between", value1, value2, "deleted");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orDeletedNotBetween(Byte value1, Byte value2) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("deleted not between", value1, value2, "deleted");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orUpdateTimeIsNull() {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("update_time is null");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orUpdateTimeIsNotNull() {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("update_time is not null");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orUpdateTimeEqualTo(Date value) {
            return orUpdateTimeEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orUpdateTimeEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("update_time =", value, "updateTime");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orUpdateTimeNotEqualTo(Date value) {
            return orUpdateTimeNotEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orUpdateTimeNotEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("update_time <>", value, "updateTime");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orUpdateTimeGreaterThan(Date value) {
            return orUpdateTimeGreaterThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orUpdateTimeGreaterThan(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("update_time >", value, "updateTime");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orUpdateTimeGreaterThanOrEqualTo(Date value) {
            return orUpdateTimeGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orUpdateTimeGreaterThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("update_time >=", value, "updateTime");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orUpdateTimeLessThan(Date value) {
            return orUpdateTimeLessThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orUpdateTimeLessThan(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("update_time <", value, "updateTime");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orUpdateTimeLessThanOrEqualTo(Date value) {
            return orUpdateTimeLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orUpdateTimeLessThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("update_time <=", value, "updateTime");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orUpdateTimeIn(Collection<Date> values) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("update_time in", values, "updateTime");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orUpdateTimeNotIn(Collection<Date> values) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("update_time not in", values, "updateTime");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orUpdateTimeBetween(Date value1, Date value2) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("update_time between", value1, value2, "updateTime");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orUpdateTimeNotBetween(Date value1, Date value2) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("update_time not between", value1, value2, "updateTime");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCreateTimeIsNull() {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("create_time is null");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCreateTimeIsNotNull() {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("create_time is not null");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCreateTimeEqualTo(Date value) {
            return orCreateTimeEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orCreateTimeEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("create_time =", value, "createTime");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCreateTimeNotEqualTo(Date value) {
            return orCreateTimeNotEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orCreateTimeNotEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("create_time <>", value, "createTime");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCreateTimeGreaterThan(Date value) {
            return orCreateTimeGreaterThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orCreateTimeGreaterThan(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("create_time >", value, "createTime");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCreateTimeGreaterThanOrEqualTo(Date value) {
            return orCreateTimeGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orCreateTimeGreaterThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("create_time >=", value, "createTime");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCreateTimeLessThan(Date value) {
            return orCreateTimeLessThan(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orCreateTimeLessThan(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("create_time <", value, "createTime");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCreateTimeLessThanOrEqualTo(Date value) {
            return orCreateTimeLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayInfoExample.CriterionGroup orCreateTimeLessThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("create_time <=", value, "createTime");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCreateTimeIn(Collection<Date> values) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("create_time in", values, "createTime");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCreateTimeNotIn(Collection<Date> values) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("create_time not in", values, "createTime");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCreateTimeBetween(Date value1, Date value2) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("create_time between", value1, value2, "createTime");
            return or(criterion);
        }

        public GrayInfoExample.CriterionGroup orCreateTimeNotBetween(Date value1, Date value2) {
            GrayInfoExample.Criterion criterion = new GrayInfoExample.Criterion("create_time not between", value1, value2, "createTime");
            return or(criterion);
        }
    }

    public static final class Builder extends BaseExampleBuilder<GrayInfoExample.Builder, GrayInfoExample> {

        protected List<GrayInfoExample.Criteria> oredCriteria;

        private Builder() {

        }

        public GrayInfoExample.Builder oredCriteria(List<GrayInfoExample.Criteria> oredCriteria) {
            this.oredCriteria = oredCriteria;
            return this;
        }

        @Override
        public GrayInfoExample build() {
            return new GrayInfoExample(this);
        }
    }
}
