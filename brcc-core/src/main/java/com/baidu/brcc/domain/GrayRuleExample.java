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

public class GrayRuleExample extends BaseExample {
    protected List<GrayRuleExample.Criteria> oredCriteria;

    private GrayRuleExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * 版本
     */
    private GrayRuleExample(GrayRuleExample.Builder builder) {
        this.start = builder.getStart();
        this.limit = builder.getLimit();
        this.orderByClause = builder.getOrderByClause();
        this.distinct = builder.isDistinct();
        this.columns = builder.getColumns();
        this.oredCriteria = new ArrayList<>();
    }

    public static GrayRuleExample.Builder newBuilder() {
        return new GrayRuleExample.Builder();
    }

    public List<GrayRuleExample.Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(GrayRuleExample.Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public GrayRuleExample.Criteria or() {
        GrayRuleExample.Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public GrayRuleExample.Criteria createCriteria() {
        GrayRuleExample.Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected GrayRuleExample.Criteria createCriteriaInternal() {
        GrayRuleExample.Criteria criteria = new GrayRuleExample.Criteria(this);
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {

        protected List<GrayRuleExample.Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<GrayRuleExample.Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<GrayRuleExample.Criterion> getAllCriteria() {
            return criteria;
        }

        public List<GrayRuleExample.Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new GrayRuleExample.Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new GrayRuleExample.Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new GrayRuleExample.Criterion(condition, value1, value2));
        }

        public GrayRuleExample.Criteria andIdIsNull() {
            addCriterion("id is null");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andIdEqualTo(Long value) {
            return andIdEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andIdEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("id =", value, "id");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andIdNotEqualTo(Long value) {
            return andIdNotEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andIdNotEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("id <>", value, "id");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andIdGreaterThan(Long value) {
            return andIdGreaterThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andIdGreaterThan(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("id >", value, "id");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andIdGreaterThanOrEqualTo(Long value) {
            return andIdGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andIdGreaterThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("id >=", value, "id");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andIdLessThan(Long value) {
            return andIdLessThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andIdLessThan(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("id <", value, "id");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andIdLessThanOrEqualTo(Long value) {
            return andIdLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andIdLessThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("id <=", value, "id");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andIdIn(Collection<Long> values) {
            addCriterion("id in", values, "id");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andIdNotIn(Collection<Long> values) {
            addCriterion("id not in", values, "id");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (GrayRuleExample.Criteria) this;
        }


        public GrayRuleExample.Criteria andNameGreaterThanOrEqualTo(String value) {
            return andNameGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andNameGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("name >=", value, "name");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andNameLessThan(String value) {
            return andNameLessThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andNameLessThan(String value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("name <", value, "name");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andNameLessThanOrEqualTo(String value) {
            return andNameLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andNameLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("name <=", value, "name");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andNameLike(String value) {
            return andNameLike(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andNameLike(String value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("name like", value, "name");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andNameLikeLeft(String value) {
            return andNameLikeLeft(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andNameLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("name like", value, "name");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andNameLikeRight(String value) {
            return andNameLikeRight(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andNameLikeRight(String value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("name like", value, "name");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andNameLikeBoth(String value) {
            return andNameLikeBoth(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andNameLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("name like", value, "name");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andNameNotLike(String value) {
            return andNameNotLike(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andNameNotLike(String value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("name not like", value, "name");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andNameNotLikeLeft(String value) {
            return andNameNotLikeLeft(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andNameNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("name not like", value, "name");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andNameNotLikeRight(String value) {
            return andNameNotLikeRight(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andNameNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("name not like", value, "name");
            return (GrayRuleExample.Criteria) this;
        }


        public GrayRuleExample.Criteria andGrayVersionIdEqualTo(Long value) {
            return andGrayVersionIdEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andGrayVersionIdEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("gray_version_id =", value, "grayVersionId");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andRuleIdEqualTo(Long value) {
            return andRuleIdEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andRuleIdEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("rule_id =", value, "ruleId");
            return (GrayRuleExample.Criteria) this;
        }


        public GrayRuleExample.Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andMemoEqualTo(String value) {
            return andMemoEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andMemoEqualTo(String value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("memo =", value, "memo");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andMemoNotEqualTo(String value) {
            return andMemoNotEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andMemoNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("memo <>", value, "memo");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andMemoGreaterThan(String value) {
            return andMemoGreaterThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andMemoGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("memo >", value, "memo");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andMemoGreaterThanOrEqualTo(String value) {
            return andMemoGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andMemoGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("memo >=", value, "memo");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andMemoLessThan(String value) {
            return andMemoLessThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andMemoLessThan(String value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("memo <", value, "memo");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andMemoLessThanOrEqualTo(String value) {
            return andMemoLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andMemoLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("memo <=", value, "memo");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andMemoLike(String value) {
            return andMemoLike(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andMemoLike(String value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("memo like", value, "memo");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andMemoLikeLeft(String value) {
            return andMemoLikeLeft(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andMemoLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("memo like", value, "memo");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andMemoLikeRight(String value) {
            return andMemoLikeRight(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andMemoLikeRight(String value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("memo like", value, "memo");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andMemoLikeBoth(String value) {
            return andMemoLikeBoth(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andMemoLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("memo like", value, "memo");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andMemoNotLike(String value) {
            return andMemoNotLike(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andMemoNotLike(String value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("memo not like", value, "memo");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andMemoNotLikeLeft(String value) {
            return andMemoNotLikeLeft(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andMemoNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("memo not like", value, "memo");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andMemoNotLikeRight(String value) {
            return andMemoNotLikeRight(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andMemoNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("memo not like", value, "memo");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andMemoNotLikeBoth(String value) {
            return andMemoNotLikeBoth(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andMemoNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("memo not like", value, "memo");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andMemoIn(Collection<String> values) {
            addCriterion("memo in", values, "memo");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andMemoNotIn(Collection<String> values) {
            addCriterion("memo not in", values, "memo");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andProjectIdEqualTo(Long value) {
            return andProjectIdEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andProjectIdEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("project_id =", value, "projectId");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andProjectIdNotEqualTo(Long value) {
            return andProjectIdNotEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andProjectIdNotEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("project_id <>", value, "projectId");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andProjectIdGreaterThan(Long value) {
            return andProjectIdGreaterThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andProjectIdGreaterThan(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("project_id >", value, "projectId");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andProjectIdGreaterThanOrEqualTo(Long value) {
            return andProjectIdGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andProjectIdGreaterThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("project_id >=", value, "projectId");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andProjectIdLessThan(Long value) {
            return andProjectIdLessThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andProjectIdLessThan(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("project_id <", value, "projectId");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andProjectIdLessThanOrEqualTo(Long value) {
            return andProjectIdLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andProjectIdLessThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("project_id <=", value, "projectId");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andProjectIdIn(Collection<Long> values) {
            addCriterion("project_id in", values, "projectId");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andProjectIdNotIn(Collection<Long> values) {
            addCriterion("project_id not in", values, "projectId");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andProjectIdBetween(Long value1, Long value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andProjectIdNotBetween(Long value1, Long value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andEnvironmentIdIsNull() {
            addCriterion("environment_id is null");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andEnvironmentIdIsNotNull() {
            addCriterion("environment_id is not null");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andEnvironmentIdEqualTo(Long value) {
            return andEnvironmentIdEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andEnvironmentIdEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("environment_id =", value, "environmentId");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andEnvironmentIdNotEqualTo(Long value) {
            return andEnvironmentIdNotEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andEnvironmentIdNotEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("environment_id <>", value, "environmentId");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andEnvironmentIdGreaterThan(Long value) {
            return andEnvironmentIdGreaterThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andEnvironmentIdGreaterThan(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("environment_id >", value, "environmentId");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andEnvironmentIdGreaterThanOrEqualTo(Long value) {
            return andEnvironmentIdGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andEnvironmentIdGreaterThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("environment_id >=", value, "environmentId");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andEnvironmentIdLessThan(Long value) {
            return andEnvironmentIdLessThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andEnvironmentIdLessThan(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("environment_id <", value, "environmentId");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andEnvironmentIdLessThanOrEqualTo(Long value) {
            return andEnvironmentIdLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andEnvironmentIdLessThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("environment_id <=", value, "environmentId");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andEnvironmentIdIn(Collection<Long> values) {
            addCriterion("environment_id in", values, "environmentId");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andEnvironmentIdNotIn(Collection<Long> values) {
            addCriterion("environment_id not in", values, "environmentId");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andEnvironmentIdBetween(Long value1, Long value2) {
            addCriterion("environment_id between", value1, value2, "environmentId");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andEnvironmentIdNotBetween(Long value1, Long value2) {
            addCriterion("environment_id not between", value1, value2, "environmentId");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumIsNull() {
            addCriterion("check_sum is null");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumIsNotNull() {
            addCriterion("check_sum is not null");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumEqualTo(String value) {
            return andCheckSumEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andCheckSumEqualTo(String value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("check_sum =", value, "checkSum");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumNotEqualTo(String value) {
            return andCheckSumNotEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andCheckSumNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("check_sum <>", value, "checkSum");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumGreaterThan(String value) {
            return andCheckSumGreaterThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andCheckSumGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("check_sum >", value, "checkSum");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumGreaterThanOrEqualTo(String value) {
            return andCheckSumGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andCheckSumGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("check_sum >=", value, "checkSum");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumLessThan(String value) {
            return andCheckSumLessThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andCheckSumLessThan(String value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("check_sum <", value, "checkSum");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumLessThanOrEqualTo(String value) {
            return andCheckSumLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andCheckSumLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("check_sum <=", value, "checkSum");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumLike(String value) {
            return andCheckSumLike(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andCheckSumLike(String value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("check_sum like", value, "checkSum");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumLikeLeft(String value) {
            return andCheckSumLikeLeft(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andCheckSumLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("check_sum like", value, "checkSum");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumLikeRight(String value) {
            return andCheckSumLikeRight(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andCheckSumLikeRight(String value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("check_sum like", value, "checkSum");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumLikeBoth(String value) {
            return andCheckSumLikeBoth(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andCheckSumLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("check_sum like", value, "checkSum");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumNotLike(String value) {
            return andCheckSumNotLike(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andCheckSumNotLike(String value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("check_sum not like", value, "checkSum");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumNotLikeLeft(String value) {
            return andCheckSumNotLikeLeft(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andCheckSumNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("check_sum not like", value, "checkSum");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumNotLikeRight(String value) {
            return andCheckSumNotLikeRight(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andCheckSumNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("check_sum not like", value, "checkSum");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumNotLikeBoth(String value) {
            return andCheckSumNotLikeBoth(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andCheckSumNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("check_sum not like", value, "checkSum");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumIn(Collection<String> values) {
            addCriterion("check_sum in", values, "checkSum");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumNotIn(Collection<String> values) {
            addCriterion("check_sum not in", values, "checkSum");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumBetween(String value1, String value2) {
            addCriterion("check_sum between", value1, value2, "checkSum");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumNotBetween(String value1, String value2) {
            addCriterion("check_sum not between", value1, value2, "checkSum");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumDateIsNull() {
            addCriterion("check_sum_date is null");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumDateIsNotNull() {
            addCriterion("check_sum_date is not null");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumDateEqualTo(Date value) {
            return andCheckSumDateEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andCheckSumDateEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("check_sum_date =", value, "checkSumDate");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumDateNotEqualTo(Date value) {
            return andCheckSumDateNotEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andCheckSumDateNotEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("check_sum_date <>", value, "checkSumDate");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumDateGreaterThan(Date value) {
            return andCheckSumDateGreaterThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andCheckSumDateGreaterThan(Date value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("check_sum_date >", value, "checkSumDate");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumDateGreaterThanOrEqualTo(Date value) {
            return andCheckSumDateGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andCheckSumDateGreaterThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("check_sum_date >=", value, "checkSumDate");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumDateLessThan(Date value) {
            return andCheckSumDateLessThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andCheckSumDateLessThan(Date value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("check_sum_date <", value, "checkSumDate");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumDateLessThanOrEqualTo(Date value) {
            return andCheckSumDateLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andCheckSumDateLessThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("check_sum_date <=", value, "checkSumDate");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumDateIn(Collection<Date> values) {
            addCriterion("check_sum_date in", values, "checkSumDate");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumDateNotIn(Collection<Date> values) {
            addCriterion("check_sum_date not in", values, "checkSumDate");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumDateBetween(Date value1, Date value2) {
            addCriterion("check_sum_date between", value1, value2, "checkSumDate");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumDateNotBetween(Date value1, Date value2) {
            addCriterion("check_sum_date not between", value1, value2, "checkSumDate");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumEnableIsNull() {
            addCriterion("check_sum_enable is null");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumEnableIsNotNull() {
            addCriterion("check_sum_enable is not null");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumEnableEqualTo(Byte value) {
            return andCheckSumEnableEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andCheckSumEnableEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("check_sum_enable =", value, "checkSumEnable");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumEnableNotEqualTo(Byte value) {
            return andCheckSumEnableNotEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andCheckSumEnableNotEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("check_sum_enable <>", value, "checkSumEnable");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumEnableGreaterThan(Byte value) {
            return andCheckSumEnableGreaterThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andCheckSumEnableGreaterThan(Byte value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("check_sum_enable >", value, "checkSumEnable");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumEnableGreaterThanOrEqualTo(Byte value) {
            return andCheckSumEnableGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andCheckSumEnableGreaterThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("check_sum_enable >=", value, "checkSumEnable");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumEnableLessThan(Byte value) {
            return andCheckSumEnableLessThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andCheckSumEnableLessThan(Byte value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("check_sum_enable <", value, "checkSumEnable");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumEnableLessThanOrEqualTo(Byte value) {
            return andCheckSumEnableLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andCheckSumEnableLessThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("check_sum_enable <=", value, "checkSumEnable");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumEnableIn(Collection<Byte> values) {
            addCriterion("check_sum_enable in", values, "checkSumEnable");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumEnableNotIn(Collection<Byte> values) {
            addCriterion("check_sum_enable not in", values, "checkSumEnable");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumEnableBetween(Byte value1, Byte value2) {
            addCriterion("check_sum_enable between", value1, value2, "checkSumEnable");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCheckSumEnableNotBetween(Byte value1, Byte value2) {
            addCriterion("check_sum_enable not between", value1, value2, "checkSumEnable");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andDeletedEqualTo(Byte value) {
            return andDeletedEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andDeletedEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("deleted =", value, "deleted");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andDeletedNotEqualTo(Byte value) {
            return andDeletedNotEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andDeletedNotEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("deleted <>", value, "deleted");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andDeletedGreaterThan(Byte value) {
            return andDeletedGreaterThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andDeletedGreaterThan(Byte value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("deleted >", value, "deleted");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andDeletedGreaterThanOrEqualTo(Byte value) {
            return andDeletedGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andDeletedGreaterThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("deleted >=", value, "deleted");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andDeletedLessThan(Byte value) {
            return andDeletedLessThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andDeletedLessThan(Byte value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("deleted <", value, "deleted");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andDeletedLessThanOrEqualTo(Byte value) {
            return andDeletedLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andDeletedLessThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("deleted <=", value, "deleted");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andDeletedIn(Collection<Byte> values) {
            addCriterion("deleted in", values, "deleted");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andDeletedNotIn(Collection<Byte> values) {
            addCriterion("deleted not in", values, "deleted");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andDeletedBetween(Byte value1, Byte value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andDeletedNotBetween(Byte value1, Byte value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andUpdateTimeEqualTo(Date value) {
            return andUpdateTimeEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andUpdateTimeEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("update_time =", value, "updateTime");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andUpdateTimeNotEqualTo(Date value) {
            return andUpdateTimeNotEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andUpdateTimeNotEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("update_time <>", value, "updateTime");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andUpdateTimeGreaterThan(Date value) {
            return andUpdateTimeGreaterThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andUpdateTimeGreaterThan(Date value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("update_time >", value, "updateTime");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            return andUpdateTimeGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andUpdateTimeGreaterThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("update_time >=", value, "updateTime");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andUpdateTimeLessThan(Date value) {
            return andUpdateTimeLessThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andUpdateTimeLessThan(Date value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("update_time <", value, "updateTime");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            return andUpdateTimeLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andUpdateTimeLessThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("update_time <=", value, "updateTime");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andUpdateTimeIn(Collection<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andUpdateTimeNotIn(Collection<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCreateTimeEqualTo(Date value) {
            return andCreateTimeEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andCreateTimeEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("create_time =", value, "createTime");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCreateTimeNotEqualTo(Date value) {
            return andCreateTimeNotEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andCreateTimeNotEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("create_time <>", value, "createTime");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCreateTimeGreaterThan(Date value) {
            return andCreateTimeGreaterThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andCreateTimeGreaterThan(Date value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("create_time >", value, "createTime");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            return andCreateTimeGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andCreateTimeGreaterThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("create_time >=", value, "createTime");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCreateTimeLessThan(Date value) {
            return andCreateTimeLessThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andCreateTimeLessThan(Date value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("create_time <", value, "createTime");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            return andCreateTimeLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.Criteria andCreateTimeLessThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion("create_time <=", value, "createTime");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCreateTimeIn(Collection<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCreateTimeNotIn(Collection<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (GrayRuleExample.Criteria) this;
        }

        public GrayRuleExample.Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (GrayRuleExample.Criteria) this;
        }
    }

    public static class Criteria extends GrayRuleExample.GeneratedCriteria {

        private GrayRuleExample example;

        protected Criteria(GrayRuleExample example) {
            super();
            this.example = example;
        }

        public GrayRuleExample toExample() {
            return this.example;
        }

        public GrayRuleExample.Criteria addCustomerCriteria(String condition) {
            addCriterion(condition);
            return this;
        }

        public GrayRuleExample.Criteria addCustomerCriteria(String condition, Boolean bCondition) {
            if (bCondition == null || !bCondition) {
                return (GrayRuleExample.Criteria) this;
            }
            addCriterion(condition);
            return this;
        }

        /**
         * 举例: exists(select 1 from b where b.aid = a.id and b.id=#{criterion.value})
         */
        public GrayRuleExample.Criteria addCustomerCriteria(String condition, Object value) {
            addCriterion(condition, value, "customerCondition");
            return this;
        }

        public GrayRuleExample.CriterionGroup andGroupCriterion() {
            GrayRuleExample.CriterionGroup group = new GrayRuleExample.CriterionGroup("");
            group.type = 1;
            group.criteria = this;
            criteria.add(group);
            return group;
        }

        public GrayRuleExample.CriterionGroup andGroupCriterion(Boolean condition) {
            GrayRuleExample.CriterionGroup group = new GrayRuleExample.CriterionGroup("");
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

    public static class CriterionGroup extends GrayRuleExample.Criterion {

        private GrayRuleExample.Criteria criteria;

        protected List<GrayRuleExample.Criterion> inlineOrCriteria;

        public GrayRuleExample.Criteria getCriteria() {
            return criteria;
        }

        public List<GrayRuleExample.Criterion> getInlineOrCriteria() {
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

        public GrayRuleExample.CriterionGroup or(GrayRuleExample.Criterion criterion) {
            if (inlineOrCriteria == null) {
                inlineOrCriteria = new ArrayList<>();
            }
            inlineOrCriteria.add(criterion);
            return this;
        }

        public GrayRuleExample.Criteria toCriteria() {
            return criteria;
        }

        public GrayRuleExample.CriterionGroup orIdIsNull() {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("id is null");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orIdIsNotNull() {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("id is not null");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orIdEqualTo(Long value) {
            return orIdEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orIdEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("id =", value, "id");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orIdNotEqualTo(Long value) {
            return orIdNotEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orIdNotEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("id <>", value, "id");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orIdGreaterThan(Long value) {
            return orIdGreaterThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orIdGreaterThan(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("id >", value, "id");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orIdGreaterThanOrEqualTo(Long value) {
            return orIdGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orIdGreaterThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("id >=", value, "id");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orIdLessThan(Long value) {
            return orIdLessThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orIdLessThan(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("id <", value, "id");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orIdLessThanOrEqualTo(Long value) {
            return orIdLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orIdLessThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("id <=", value, "id");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orIdIn(Collection<Long> values) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("id in", values, "id");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orIdNotIn(Collection<Long> values) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("id not in", values, "id");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orIdBetween(Long value1, Long value2) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("id between", value1, value2, "id");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orIdNotBetween(Long value1, Long value2) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("id not between", value1, value2, "id");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orNameIsNull() {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("name is null");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orNameIsNotNull() {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("name is not null");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orNameEqualTo(String value) {
            return orNameEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orNameEqualTo(String value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("name =", value, "name");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orNameNotEqualTo(String value) {
            return orNameNotEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orNameNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("name <>", value, "name");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orNameGreaterThan(String value) {
            return orNameGreaterThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orNameGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("name >", value, "name");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orNameGreaterThanOrEqualTo(String value) {
            return orNameGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orNameGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("name >=", value, "name");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orNameLessThan(String value) {
            return orNameLessThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orNameLessThan(String value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("name <", value, "name");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orNameLessThanOrEqualTo(String value) {
            return orNameLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orNameLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("name <=", value, "name");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orNameLike(String value) {
            return orNameLike(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orNameLike(String value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("name like", value, "name");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orNameLikeLeft(String value) {
            return orNameLikeLeft(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orNameLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("name like", value, "name");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orNameLikeRight(String value) {
            return orNameLikeRight(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orNameLikeRight(String value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("name like", value, "name");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orNameLikeBoth(String value) {
            return orNameLikeBoth(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orNameLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("name like", value, "name");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orNameNotLike(String value) {
            return orNameNotLike(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orNameNotLike(String value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("name not like", value, "name");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orNameNotLikeLeft(String value) {
            return orNameNotLikeLeft(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orNameNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("name not like", value, "name");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orNameNotLikeRight(String value) {
            return orNameNotLikeRight(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orNameNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("name not like", value, "name");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orNameNotLikeBoth(String value) {
            return orNameNotLikeBoth(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orNameNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("name not like", value, "name");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orNameIn(Collection<String> values) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("name in", values, "name");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orNameNotIn(Collection<String> values) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("name not in", values, "name");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orNameBetween(String value1, String value2) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("name between", value1, value2, "name");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orNameNotBetween(String value1, String value2) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("name not between", value1, value2, "name");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orProductIdIsNull() {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("product_id is null");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orProductIdIsNotNull() {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("product_id is not null");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orProductIdEqualTo(Long value) {
            return orProductIdEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orProductIdEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("product_id =", value, "productId");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orProductIdNotEqualTo(Long value) {
            return orProductIdNotEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orProductIdNotEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("product_id <>", value, "productId");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orProductIdGreaterThan(Long value) {
            return orProductIdGreaterThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orProductIdGreaterThan(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("product_id >", value, "productId");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orProductIdGreaterThanOrEqualTo(Long value) {
            return orProductIdGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orProductIdGreaterThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("product_id >=", value, "productId");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orProductIdLessThan(Long value) {
            return orProductIdLessThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orProductIdLessThan(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("product_id <", value, "productId");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orProductIdLessThanOrEqualTo(Long value) {
            return orProductIdLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orProductIdLessThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("product_id <=", value, "productId");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orProductIdIn(Collection<Long> values) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("product_id in", values, "productId");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orProductIdNotIn(Collection<Long> values) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("product_id not in", values, "productId");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orProductIdBetween(Long value1, Long value2) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("product_id between", value1, value2, "productId");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orProductIdNotBetween(Long value1, Long value2) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("product_id not between", value1, value2, "productId");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orMemoIsNull() {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("memo is null");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orMemoIsNotNull() {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("memo is not null");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orMemoEqualTo(String value) {
            return orMemoEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orMemoEqualTo(String value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("memo =", value, "memo");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orMemoNotEqualTo(String value) {
            return orMemoNotEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orMemoNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("memo <>", value, "memo");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orMemoGreaterThan(String value) {
            return orMemoGreaterThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orMemoGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("memo >", value, "memo");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orMemoGreaterThanOrEqualTo(String value) {
            return orMemoGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orMemoGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("memo >=", value, "memo");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orMemoLessThan(String value) {
            return orMemoLessThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orMemoLessThan(String value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("memo <", value, "memo");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orMemoLessThanOrEqualTo(String value) {
            return orMemoLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orMemoLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("memo <=", value, "memo");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orMemoLike(String value) {
            return orMemoLike(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orMemoLike(String value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("memo like", value, "memo");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orMemoLikeLeft(String value) {
            return orMemoLikeLeft(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orMemoLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("memo like", value, "memo");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orMemoLikeRight(String value) {
            return orMemoLikeRight(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orMemoLikeRight(String value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("memo like", value, "memo");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orMemoLikeBoth(String value) {
            return orMemoLikeBoth(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orMemoLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("memo like", value, "memo");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orMemoNotLike(String value) {
            return orMemoNotLike(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orMemoNotLike(String value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("memo not like", value, "memo");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orMemoNotLikeLeft(String value) {
            return orMemoNotLikeLeft(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orMemoNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("memo not like", value, "memo");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orMemoNotLikeRight(String value) {
            return orMemoNotLikeRight(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orMemoNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("memo not like", value, "memo");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orMemoNotLikeBoth(String value) {
            return orMemoNotLikeBoth(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orMemoNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("memo not like", value, "memo");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orMemoIn(Collection<String> values) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("memo in", values, "memo");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orMemoNotIn(Collection<String> values) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("memo not in", values, "memo");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orMemoBetween(String value1, String value2) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("memo between", value1, value2, "memo");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orMemoNotBetween(String value1, String value2) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("memo not between", value1, value2, "memo");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orProjectIdIsNull() {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("project_id is null");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orProjectIdIsNotNull() {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("project_id is not null");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orProjectIdEqualTo(Long value) {
            return orProjectIdEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orProjectIdEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("project_id =", value, "projectId");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orProjectIdNotEqualTo(Long value) {
            return orProjectIdNotEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orProjectIdNotEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("project_id <>", value, "projectId");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orProjectIdGreaterThan(Long value) {
            return orProjectIdGreaterThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orProjectIdGreaterThan(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("project_id >", value, "projectId");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orProjectIdGreaterThanOrEqualTo(Long value) {
            return orProjectIdGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orProjectIdGreaterThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("project_id >=", value, "projectId");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orProjectIdLessThan(Long value) {
            return orProjectIdLessThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orProjectIdLessThan(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("project_id <", value, "projectId");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orProjectIdLessThanOrEqualTo(Long value) {
            return orProjectIdLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orProjectIdLessThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("project_id <=", value, "projectId");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orProjectIdIn(Collection<Long> values) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("project_id in", values, "projectId");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orProjectIdNotIn(Collection<Long> values) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("project_id not in", values, "projectId");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orProjectIdBetween(Long value1, Long value2) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("project_id between", value1, value2, "projectId");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orProjectIdNotBetween(Long value1, Long value2) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("project_id not between", value1, value2, "projectId");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orEnvironmentIdIsNull() {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("environment_id is null");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orEnvironmentIdIsNotNull() {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("environment_id is not null");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orEnvironmentIdEqualTo(Long value) {
            return orEnvironmentIdEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orEnvironmentIdEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("environment_id =", value, "environmentId");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orEnvironmentIdNotEqualTo(Long value) {
            return orEnvironmentIdNotEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orEnvironmentIdNotEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("environment_id <>", value, "environmentId");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orEnvironmentIdGreaterThan(Long value) {
            return orEnvironmentIdGreaterThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orEnvironmentIdGreaterThan(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("environment_id >", value, "environmentId");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orEnvironmentIdGreaterThanOrEqualTo(Long value) {
            return orEnvironmentIdGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orEnvironmentIdGreaterThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("environment_id >=", value, "environmentId");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orEnvironmentIdLessThan(Long value) {
            return orEnvironmentIdLessThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orEnvironmentIdLessThan(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("environment_id <", value, "environmentId");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orEnvironmentIdLessThanOrEqualTo(Long value) {
            return orEnvironmentIdLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orEnvironmentIdLessThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("environment_id <=", value, "environmentId");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orEnvironmentIdIn(Collection<Long> values) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("environment_id in", values, "environmentId");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orEnvironmentIdNotIn(Collection<Long> values) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("environment_id not in", values, "environmentId");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orEnvironmentIdBetween(Long value1, Long value2) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("environment_id between", value1, value2, "environmentId");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orEnvironmentIdNotBetween(Long value1, Long value2) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("environment_id not between", value1, value2, "environmentId");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumIsNull() {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum is null");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumIsNotNull() {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum is not null");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumEqualTo(String value) {
            return orCheckSumEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orCheckSumEqualTo(String value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum =", value, "checkSum");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumNotEqualTo(String value) {
            return orCheckSumNotEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orCheckSumNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum <>", value, "checkSum");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumGreaterThan(String value) {
            return orCheckSumGreaterThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orCheckSumGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum >", value, "checkSum");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumGreaterThanOrEqualTo(String value) {
            return orCheckSumGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orCheckSumGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum >=", value, "checkSum");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumLessThan(String value) {
            return orCheckSumLessThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orCheckSumLessThan(String value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum <", value, "checkSum");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumLessThanOrEqualTo(String value) {
            return orCheckSumLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orCheckSumLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum <=", value, "checkSum");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumLike(String value) {
            return orCheckSumLike(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orCheckSumLike(String value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum like", value, "checkSum");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumLikeLeft(String value) {
            return orCheckSumLikeLeft(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orCheckSumLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum like", value, "checkSum");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumLikeRight(String value) {
            return orCheckSumLikeRight(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orCheckSumLikeRight(String value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum like", value, "checkSum");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumLikeBoth(String value) {
            return orCheckSumLikeBoth(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orCheckSumLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum like", value, "checkSum");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumNotLike(String value) {
            return orCheckSumNotLike(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orCheckSumNotLike(String value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum not like", value, "checkSum");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumNotLikeLeft(String value) {
            return orCheckSumNotLikeLeft(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orCheckSumNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum not like", value, "checkSum");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumNotLikeRight(String value) {
            return orCheckSumNotLikeRight(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orCheckSumNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum not like", value, "checkSum");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumNotLikeBoth(String value) {
            return orCheckSumNotLikeBoth(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orCheckSumNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum not like", value, "checkSum");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumIn(Collection<String> values) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum in", values, "checkSum");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumNotIn(Collection<String> values) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum not in", values, "checkSum");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumBetween(String value1, String value2) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum between", value1, value2, "checkSum");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumNotBetween(String value1, String value2) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum not between", value1, value2, "checkSum");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumDateIsNull() {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum_date is null");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumDateIsNotNull() {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum_date is not null");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumDateEqualTo(Date value) {
            return orCheckSumDateEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orCheckSumDateEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum_date =", value, "checkSumDate");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumDateNotEqualTo(Date value) {
            return orCheckSumDateNotEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orCheckSumDateNotEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum_date <>", value, "checkSumDate");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumDateGreaterThan(Date value) {
            return orCheckSumDateGreaterThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orCheckSumDateGreaterThan(Date value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum_date >", value, "checkSumDate");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumDateGreaterThanOrEqualTo(Date value) {
            return orCheckSumDateGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orCheckSumDateGreaterThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum_date >=", value, "checkSumDate");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumDateLessThan(Date value) {
            return orCheckSumDateLessThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orCheckSumDateLessThan(Date value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum_date <", value, "checkSumDate");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumDateLessThanOrEqualTo(Date value) {
            return orCheckSumDateLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orCheckSumDateLessThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum_date <=", value, "checkSumDate");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumDateIn(Collection<Date> values) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum_date in", values, "checkSumDate");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumDateNotIn(Collection<Date> values) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum_date not in", values, "checkSumDate");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumDateBetween(Date value1, Date value2) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum_date between", value1, value2, "checkSumDate");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumDateNotBetween(Date value1, Date value2) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum_date not between", value1, value2, "checkSumDate");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumEnableIsNull() {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum_enable is null");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumEnableIsNotNull() {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum_enable is not null");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumEnableEqualTo(Byte value) {
            return orCheckSumEnableEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orCheckSumEnableEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum_enable =", value, "checkSumEnable");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumEnableNotEqualTo(Byte value) {
            return orCheckSumEnableNotEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orCheckSumEnableNotEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum_enable <>", value, "checkSumEnable");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumEnableGreaterThan(Byte value) {
            return orCheckSumEnableGreaterThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orCheckSumEnableGreaterThan(Byte value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum_enable >", value, "checkSumEnable");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumEnableGreaterThanOrEqualTo(Byte value) {
            return orCheckSumEnableGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orCheckSumEnableGreaterThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum_enable >=", value, "checkSumEnable");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumEnableLessThan(Byte value) {
            return orCheckSumEnableLessThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orCheckSumEnableLessThan(Byte value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum_enable <", value, "checkSumEnable");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumEnableLessThanOrEqualTo(Byte value) {
            return orCheckSumEnableLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orCheckSumEnableLessThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum_enable <=", value, "checkSumEnable");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumEnableIn(Collection<Byte> values) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum_enable in", values, "checkSumEnable");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumEnableNotIn(Collection<Byte> values) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum_enable not in", values, "checkSumEnable");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumEnableBetween(Byte value1, Byte value2) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum_enable between", value1, value2, "checkSumEnable");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCheckSumEnableNotBetween(Byte value1, Byte value2) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("check_sum_enable not between", value1, value2, "checkSumEnable");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orDeletedIsNull() {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("deleted is null");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orDeletedIsNotNull() {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("deleted is not null");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orDeletedEqualTo(Byte value) {
            return orDeletedEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orDeletedEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("deleted =", value, "deleted");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orDeletedNotEqualTo(Byte value) {
            return orDeletedNotEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orDeletedNotEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("deleted <>", value, "deleted");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orDeletedGreaterThan(Byte value) {
            return orDeletedGreaterThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orDeletedGreaterThan(Byte value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("deleted >", value, "deleted");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orDeletedGreaterThanOrEqualTo(Byte value) {
            return orDeletedGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orDeletedGreaterThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("deleted >=", value, "deleted");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orDeletedLessThan(Byte value) {
            return orDeletedLessThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orDeletedLessThan(Byte value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("deleted <", value, "deleted");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orDeletedLessThanOrEqualTo(Byte value) {
            return orDeletedLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orDeletedLessThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("deleted <=", value, "deleted");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orDeletedIn(Collection<Byte> values) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("deleted in", values, "deleted");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orDeletedNotIn(Collection<Byte> values) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("deleted not in", values, "deleted");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orDeletedBetween(Byte value1, Byte value2) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("deleted between", value1, value2, "deleted");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orDeletedNotBetween(Byte value1, Byte value2) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("deleted not between", value1, value2, "deleted");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orUpdateTimeIsNull() {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("update_time is null");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orUpdateTimeIsNotNull() {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("update_time is not null");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orUpdateTimeEqualTo(Date value) {
            return orUpdateTimeEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orUpdateTimeEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("update_time =", value, "updateTime");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orUpdateTimeNotEqualTo(Date value) {
            return orUpdateTimeNotEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orUpdateTimeNotEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("update_time <>", value, "updateTime");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orUpdateTimeGreaterThan(Date value) {
            return orUpdateTimeGreaterThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orUpdateTimeGreaterThan(Date value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("update_time >", value, "updateTime");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orUpdateTimeGreaterThanOrEqualTo(Date value) {
            return orUpdateTimeGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orUpdateTimeGreaterThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("update_time >=", value, "updateTime");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orUpdateTimeLessThan(Date value) {
            return orUpdateTimeLessThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orUpdateTimeLessThan(Date value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("update_time <", value, "updateTime");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orUpdateTimeLessThanOrEqualTo(Date value) {
            return orUpdateTimeLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orUpdateTimeLessThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("update_time <=", value, "updateTime");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orUpdateTimeIn(Collection<Date> values) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("update_time in", values, "updateTime");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orUpdateTimeNotIn(Collection<Date> values) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("update_time not in", values, "updateTime");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orUpdateTimeBetween(Date value1, Date value2) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("update_time between", value1, value2, "updateTime");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orUpdateTimeNotBetween(Date value1, Date value2) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("update_time not between", value1, value2, "updateTime");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCreateTimeIsNull() {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("create_time is null");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCreateTimeIsNotNull() {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("create_time is not null");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCreateTimeEqualTo(Date value) {
            return orCreateTimeEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orCreateTimeEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("create_time =", value, "createTime");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCreateTimeNotEqualTo(Date value) {
            return orCreateTimeNotEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orCreateTimeNotEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("create_time <>", value, "createTime");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCreateTimeGreaterThan(Date value) {
            return orCreateTimeGreaterThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orCreateTimeGreaterThan(Date value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("create_time >", value, "createTime");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCreateTimeGreaterThanOrEqualTo(Date value) {
            return orCreateTimeGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orCreateTimeGreaterThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("create_time >=", value, "createTime");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCreateTimeLessThan(Date value) {
            return orCreateTimeLessThan(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orCreateTimeLessThan(Date value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("create_time <", value, "createTime");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCreateTimeLessThanOrEqualTo(Date value) {
            return orCreateTimeLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public GrayRuleExample.CriterionGroup orCreateTimeLessThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition) {
                return this;
            }
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("create_time <=", value, "createTime");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCreateTimeIn(Collection<Date> values) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("create_time in", values, "createTime");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCreateTimeNotIn(Collection<Date> values) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("create_time not in", values, "createTime");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCreateTimeBetween(Date value1, Date value2) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("create_time between", value1, value2, "createTime");
            return or(criterion);
        }

        public GrayRuleExample.CriterionGroup orCreateTimeNotBetween(Date value1, Date value2) {
            GrayRuleExample.Criterion criterion = new GrayRuleExample.Criterion("create_time not between", value1, value2, "createTime");
            return or(criterion);
        }
    }

    public static final class Builder extends BaseExampleBuilder<GrayRuleExample.Builder, GrayRuleExample> {

        protected List<GrayRuleExample.Criteria> oredCriteria;

        private Builder() {

        }

        public GrayRuleExample.Builder oredCriteria(List<GrayRuleExample.Criteria> oredCriteria) {
            this.oredCriteria = oredCriteria;
            return this;
        }

        @Override
        public GrayRuleExample build() {
            return new GrayRuleExample(this);
        }
    }
}
