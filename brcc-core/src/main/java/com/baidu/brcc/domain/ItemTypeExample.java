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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import com.baidu.brcc.domain.base.BaseExample;
import com.baidu.brcc.domain.base.BaseExampleBuilder;

public class ItemTypeExample extends BaseExample {

    protected List<Criteria> oredCriteria;

    private ItemTypeExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * 配置项类型
     */
    private ItemTypeExample(Builder builder) {
        this.start = builder.getStart();
        this.limit = builder.getLimit();
        this.orderByClause = builder.getOrderByClause();
        this.distinct = builder.isDistinct();
        this.columns = builder.getColumns();
        this.oredCriteria = new ArrayList<>();
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            return andIdEqualTo(value, Boolean.TRUE);
        }

        public Criteria andIdEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            return andIdNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andIdNotEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            return andIdGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andIdGreaterThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            return andIdGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            return andIdLessThan(value, Boolean.TRUE);
        }

        public Criteria andIdLessThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            return andIdLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andIdLessThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(Collection<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(Collection<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            return andNameEqualTo(value, Boolean.TRUE);
        }

        public Criteria andNameEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            return andNameNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andNameNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            return andNameGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andNameGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            return andNameGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andNameGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            return andNameLessThan(value, Boolean.TRUE);
        }

        public Criteria andNameLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            return andNameLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andNameLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            return andNameLike(value, Boolean.TRUE);
        }

        public Criteria andNameLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLikeLeft(String value) {
            return andNameLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andNameLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLikeRight(String value) {
            return andNameLikeRight(value, Boolean.TRUE);
        }

        public Criteria andNameLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLikeBoth(String value) {
            return andNameLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andNameLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            return andNameNotLike(value, Boolean.TRUE);
        }

        public Criteria andNameNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLikeLeft(String value) {
            return andNameNotLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andNameNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLikeRight(String value) {
            return andNameNotLikeRight(value, Boolean.TRUE);
        }

        public Criteria andNameNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLikeBoth(String value) {
            return andNameNotLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andNameNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(Collection<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(Collection<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            return andMemoEqualTo(value, Boolean.TRUE);
        }

        public Criteria andMemoEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            return andMemoNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andMemoNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            return andMemoGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andMemoGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            return andMemoGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            return andMemoLessThan(value, Boolean.TRUE);
        }

        public Criteria andMemoLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            return andMemoLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andMemoLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            return andMemoLike(value, Boolean.TRUE);
        }

        public Criteria andMemoLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLikeLeft(String value) {
            return andMemoLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andMemoLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLikeRight(String value) {
            return andMemoLikeRight(value, Boolean.TRUE);
        }

        public Criteria andMemoLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLikeBoth(String value) {
            return andMemoLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andMemoLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            return andMemoNotLike(value, Boolean.TRUE);
        }

        public Criteria andMemoNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLikeLeft(String value) {
            return andMemoNotLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andMemoNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLikeRight(String value) {
            return andMemoNotLikeRight(value, Boolean.TRUE);
        }

        public Criteria andMemoNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLikeBoth(String value) {
            return andMemoNotLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andMemoNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(Collection<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(Collection<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andIsEncryptIsNull() {
            addCriterion("is_encrypt is null");
            return (Criteria) this;
        }

        public Criteria andIsEncryptIsNotNull() {
            addCriterion("is_encrypt is not null");
            return (Criteria) this;
        }

        public Criteria andIsEncryptEqualTo(Byte value) {
            return andIsEncryptEqualTo(value, Boolean.TRUE);
        }

        public Criteria andIsEncryptEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("is_encrypt =", value, "isEncrypt");
            return (Criteria) this;
        }

        public Criteria andIsEncryptNotEqualTo(Byte value) {
            return andIsEncryptNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andIsEncryptNotEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("is_encrypt <>", value, "isEncrypt");
            return (Criteria) this;
        }

        public Criteria andIsEncryptGreaterThan(Byte value) {
            return andIsEncryptGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andIsEncryptGreaterThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("is_encrypt >", value, "isEncrypt");
            return (Criteria) this;
        }

        public Criteria andIsEncryptGreaterThanOrEqualTo(Byte value) {
            return andIsEncryptGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andIsEncryptGreaterThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("is_encrypt >=", value, "isEncrypt");
            return (Criteria) this;
        }

        public Criteria andIsEncryptLessThan(Byte value) {
            return andIsEncryptLessThan(value, Boolean.TRUE);
        }

        public Criteria andIsEncryptLessThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("is_encrypt <", value, "isEncrypt");
            return (Criteria) this;
        }

        public Criteria andIsEncryptLessThanOrEqualTo(Byte value) {
            return andIsEncryptLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andIsEncryptLessThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("is_encrypt <=", value, "isEncrypt");
            return (Criteria) this;
        }

        public Criteria andIsEncryptIn(Collection<Byte> values) {
            addCriterion("is_encrypt in", values, "isEncrypt");
            return (Criteria) this;
        }

        public Criteria andIsEncryptNotIn(Collection<Byte> values) {
            addCriterion("is_encrypt not in", values, "isEncrypt");
            return (Criteria) this;
        }

        public Criteria andIsEncryptBetween(Byte value1, Byte value2) {
            addCriterion("is_encrypt between", value1, value2, "isEncrypt");
            return (Criteria) this;
        }

        public Criteria andIsEncryptNotBetween(Byte value1, Byte value2) {
            addCriterion("is_encrypt not between", value1, value2, "isEncrypt");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            return andUpdateTimeEqualTo(value, Boolean.TRUE);
        }

        public Criteria andUpdateTimeEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            return andUpdateTimeNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andUpdateTimeNotEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            return andUpdateTimeGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andUpdateTimeGreaterThan(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            return andUpdateTimeGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            return andUpdateTimeLessThan(value, Boolean.TRUE);
        }

        public Criteria andUpdateTimeLessThan(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            return andUpdateTimeLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(Collection<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(Collection<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            return andCreateTimeEqualTo(value, Boolean.TRUE);
        }

        public Criteria andCreateTimeEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            return andCreateTimeNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andCreateTimeNotEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            return andCreateTimeGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andCreateTimeGreaterThan(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            return andCreateTimeGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            return andCreateTimeLessThan(value, Boolean.TRUE);
        }

        public Criteria andCreateTimeLessThan(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            return andCreateTimeLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(Collection<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(Collection<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        private ItemTypeExample example;

        protected Criteria(ItemTypeExample example) {
            super();
            this.example = example;
        }

        public ItemTypeExample toExample() {
            return this.example;
        }

        public Criteria addCustomerCriteria(String condition) {
            addCriterion(condition);
            return this;
        }

        public Criteria addCustomerCriteria(String condition, Boolean bCondition) {
            if (bCondition == null || !bCondition){
                return (Criteria) this;
            }
            addCriterion(condition);
            return this;
        }

        /**
         * 举例: exists(select 1 from b where b.aid = a.id and b.id=#{criterion.value})
         */
        public Criteria addCustomerCriteria(String condition, Object value) {
             addCriterion(condition,value,"customerCondition");
            return this;
        }

        public CriterionGroup andGroupCriterion() {
            CriterionGroup group = new CriterionGroup("");
            group.type = 1;
            group.criteria = this;
            criteria.add(group);
            return group;
        }

        public CriterionGroup andGroupCriterion(Boolean condition) {
            CriterionGroup group = new CriterionGroup("");
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

    public static class CriterionGroup extends Criterion {

        private Criteria criteria;

        protected List<Criterion> inlineOrCriteria;

        public Criteria getCriteria() {
            return criteria;
        }

        public List<Criterion> getInlineOrCriteria() {
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

        public CriterionGroup or(Criterion criterion) {
            if (inlineOrCriteria == null) {
                inlineOrCriteria = new ArrayList<>();
            }
            inlineOrCriteria.add(criterion);
            return this;
        }

        public Criteria toCriteria() {
            return criteria;
        }

        public CriterionGroup orIdIsNull() {
            Criterion criterion = new Criterion("id is null");
            return or(criterion);
        }

        public CriterionGroup orIdIsNotNull() {
            Criterion criterion = new Criterion("id is not null");
            return or(criterion);
        }

        public CriterionGroup orIdEqualTo(Long value) {
            return orIdEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orIdEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("id =", value, "id");
            return or(criterion);
        }

        public CriterionGroup orIdNotEqualTo(Long value) {
            return orIdNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orIdNotEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("id <>", value, "id");
            return or(criterion);
        }

        public CriterionGroup orIdGreaterThan(Long value) {
            return orIdGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orIdGreaterThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("id >", value, "id");
            return or(criterion);
        }

        public CriterionGroup orIdGreaterThanOrEqualTo(Long value) {
            return orIdGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orIdGreaterThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("id >=", value, "id");
            return or(criterion);
        }

        public CriterionGroup orIdLessThan(Long value) {
            return orIdLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orIdLessThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("id <", value, "id");
            return or(criterion);
        }

        public CriterionGroup orIdLessThanOrEqualTo(Long value) {
            return orIdLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orIdLessThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("id <=", value, "id");
            return or(criterion);
        }

        public CriterionGroup orIdIn(Collection<Long> values) {
            Criterion criterion = new Criterion("id in", values, "id");
            return or(criterion);
        }

        public CriterionGroup orIdNotIn(Collection<Long> values) {
            Criterion criterion = new Criterion("id not in", values, "id");
            return or(criterion);
        }

        public CriterionGroup orIdBetween(Long value1, Long value2) {
            Criterion criterion = new Criterion("id between", value1, value2, "id");
            return or(criterion);
        }

        public CriterionGroup orIdNotBetween(Long value1, Long value2) {
            Criterion criterion = new Criterion("id not between", value1, value2, "id");
            return or(criterion);
        }

        public CriterionGroup orNameIsNull() {
            Criterion criterion = new Criterion("name is null");
            return or(criterion);
        }

        public CriterionGroup orNameIsNotNull() {
            Criterion criterion = new Criterion("name is not null");
            return or(criterion);
        }

        public CriterionGroup orNameEqualTo(String value) {
            return orNameEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orNameEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("name =", value, "name");
            return or(criterion);
        }

        public CriterionGroup orNameNotEqualTo(String value) {
            return orNameNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orNameNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("name <>", value, "name");
            return or(criterion);
        }

        public CriterionGroup orNameGreaterThan(String value) {
            return orNameGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orNameGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("name >", value, "name");
            return or(criterion);
        }

        public CriterionGroup orNameGreaterThanOrEqualTo(String value) {
            return orNameGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orNameGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("name >=", value, "name");
            return or(criterion);
        }

        public CriterionGroup orNameLessThan(String value) {
            return orNameLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orNameLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("name <", value, "name");
            return or(criterion);
        }

        public CriterionGroup orNameLessThanOrEqualTo(String value) {
            return orNameLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orNameLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("name <=", value, "name");
            return or(criterion);
        }

        public CriterionGroup orNameLike(String value) {
            return orNameLike(value, Boolean.TRUE);
        }

        public CriterionGroup orNameLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("name like", value, "name");
            return or(criterion);
        }

        public CriterionGroup orNameLikeLeft(String value) {
            return orNameLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orNameLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("name like", value, "name");
            return or(criterion);
        }

        public CriterionGroup orNameLikeRight(String value) {
            return orNameLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orNameLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("name like", value, "name");
            return or(criterion);
        }

        public CriterionGroup orNameLikeBoth(String value) {
            return orNameLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orNameLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("name like", value, "name");
            return or(criterion);
        }

        public CriterionGroup orNameNotLike(String value) {
            return orNameNotLike(value, Boolean.TRUE);
        }

        public CriterionGroup orNameNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("name not like", value, "name");
            return or(criterion);
        }

        public CriterionGroup orNameNotLikeLeft(String value) {
            return orNameNotLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orNameNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("name not like", value, "name");
            return or(criterion);
        }

        public CriterionGroup orNameNotLikeRight(String value) {
            return orNameNotLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orNameNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("name not like", value, "name");
            return or(criterion);
        }

        public CriterionGroup orNameNotLikeBoth(String value) {
            return orNameNotLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orNameNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("name not like", value, "name");
            return or(criterion);
        }

        public CriterionGroup orNameIn(Collection<String> values) {
            Criterion criterion = new Criterion("name in", values, "name");
            return or(criterion);
        }

        public CriterionGroup orNameNotIn(Collection<String> values) {
            Criterion criterion = new Criterion("name not in", values, "name");
            return or(criterion);
        }

        public CriterionGroup orNameBetween(String value1, String value2) {
            Criterion criterion = new Criterion("name between", value1, value2, "name");
            return or(criterion);
        }

        public CriterionGroup orNameNotBetween(String value1, String value2) {
            Criterion criterion = new Criterion("name not between", value1, value2, "name");
            return or(criterion);
        }

        public CriterionGroup orMemoIsNull() {
            Criterion criterion = new Criterion("memo is null");
            return or(criterion);
        }

        public CriterionGroup orMemoIsNotNull() {
            Criterion criterion = new Criterion("memo is not null");
            return or(criterion);
        }

        public CriterionGroup orMemoEqualTo(String value) {
            return orMemoEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orMemoEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("memo =", value, "memo");
            return or(criterion);
        }

        public CriterionGroup orMemoNotEqualTo(String value) {
            return orMemoNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orMemoNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("memo <>", value, "memo");
            return or(criterion);
        }

        public CriterionGroup orMemoGreaterThan(String value) {
            return orMemoGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orMemoGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("memo >", value, "memo");
            return or(criterion);
        }

        public CriterionGroup orMemoGreaterThanOrEqualTo(String value) {
            return orMemoGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orMemoGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("memo >=", value, "memo");
            return or(criterion);
        }

        public CriterionGroup orMemoLessThan(String value) {
            return orMemoLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orMemoLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("memo <", value, "memo");
            return or(criterion);
        }

        public CriterionGroup orMemoLessThanOrEqualTo(String value) {
            return orMemoLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orMemoLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("memo <=", value, "memo");
            return or(criterion);
        }

        public CriterionGroup orMemoLike(String value) {
            return orMemoLike(value, Boolean.TRUE);
        }

        public CriterionGroup orMemoLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("memo like", value, "memo");
            return or(criterion);
        }

        public CriterionGroup orMemoLikeLeft(String value) {
            return orMemoLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orMemoLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("memo like", value, "memo");
            return or(criterion);
        }

        public CriterionGroup orMemoLikeRight(String value) {
            return orMemoLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orMemoLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("memo like", value, "memo");
            return or(criterion);
        }

        public CriterionGroup orMemoLikeBoth(String value) {
            return orMemoLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orMemoLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("memo like", value, "memo");
            return or(criterion);
        }

        public CriterionGroup orMemoNotLike(String value) {
            return orMemoNotLike(value, Boolean.TRUE);
        }

        public CriterionGroup orMemoNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("memo not like", value, "memo");
            return or(criterion);
        }

        public CriterionGroup orMemoNotLikeLeft(String value) {
            return orMemoNotLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orMemoNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("memo not like", value, "memo");
            return or(criterion);
        }

        public CriterionGroup orMemoNotLikeRight(String value) {
            return orMemoNotLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orMemoNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("memo not like", value, "memo");
            return or(criterion);
        }

        public CriterionGroup orMemoNotLikeBoth(String value) {
            return orMemoNotLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orMemoNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("memo not like", value, "memo");
            return or(criterion);
        }

        public CriterionGroup orMemoIn(Collection<String> values) {
            Criterion criterion = new Criterion("memo in", values, "memo");
            return or(criterion);
        }

        public CriterionGroup orMemoNotIn(Collection<String> values) {
            Criterion criterion = new Criterion("memo not in", values, "memo");
            return or(criterion);
        }

        public CriterionGroup orMemoBetween(String value1, String value2) {
            Criterion criterion = new Criterion("memo between", value1, value2, "memo");
            return or(criterion);
        }

        public CriterionGroup orMemoNotBetween(String value1, String value2) {
            Criterion criterion = new Criterion("memo not between", value1, value2, "memo");
            return or(criterion);
        }

        public CriterionGroup orIsEncryptIsNull() {
            Criterion criterion = new Criterion("is_encrypt is null");
            return or(criterion);
        }

        public CriterionGroup orIsEncryptIsNotNull() {
            Criterion criterion = new Criterion("is_encrypt is not null");
            return or(criterion);
        }

        public CriterionGroup orIsEncryptEqualTo(Byte value) {
            return orIsEncryptEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orIsEncryptEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("is_encrypt =", value, "isEncrypt");
            return or(criterion);
        }

        public CriterionGroup orIsEncryptNotEqualTo(Byte value) {
            return orIsEncryptNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orIsEncryptNotEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("is_encrypt <>", value, "isEncrypt");
            return or(criterion);
        }

        public CriterionGroup orIsEncryptGreaterThan(Byte value) {
            return orIsEncryptGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orIsEncryptGreaterThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("is_encrypt >", value, "isEncrypt");
            return or(criterion);
        }

        public CriterionGroup orIsEncryptGreaterThanOrEqualTo(Byte value) {
            return orIsEncryptGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orIsEncryptGreaterThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("is_encrypt >=", value, "isEncrypt");
            return or(criterion);
        }

        public CriterionGroup orIsEncryptLessThan(Byte value) {
            return orIsEncryptLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orIsEncryptLessThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("is_encrypt <", value, "isEncrypt");
            return or(criterion);
        }

        public CriterionGroup orIsEncryptLessThanOrEqualTo(Byte value) {
            return orIsEncryptLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orIsEncryptLessThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("is_encrypt <=", value, "isEncrypt");
            return or(criterion);
        }

        public CriterionGroup orIsEncryptIn(Collection<Byte> values) {
            Criterion criterion = new Criterion("is_encrypt in", values, "isEncrypt");
            return or(criterion);
        }

        public CriterionGroup orIsEncryptNotIn(Collection<Byte> values) {
            Criterion criterion = new Criterion("is_encrypt not in", values, "isEncrypt");
            return or(criterion);
        }

        public CriterionGroup orIsEncryptBetween(Byte value1, Byte value2) {
            Criterion criterion = new Criterion("is_encrypt between", value1, value2, "isEncrypt");
            return or(criterion);
        }

        public CriterionGroup orIsEncryptNotBetween(Byte value1, Byte value2) {
            Criterion criterion = new Criterion("is_encrypt not between", value1, value2, "isEncrypt");
            return or(criterion);
        }

        public CriterionGroup orUpdateTimeIsNull() {
            Criterion criterion = new Criterion("update_time is null");
            return or(criterion);
        }

        public CriterionGroup orUpdateTimeIsNotNull() {
            Criterion criterion = new Criterion("update_time is not null");
            return or(criterion);
        }

        public CriterionGroup orUpdateTimeEqualTo(Date value) {
            return orUpdateTimeEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orUpdateTimeEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("update_time =", value, "updateTime");
            return or(criterion);
        }

        public CriterionGroup orUpdateTimeNotEqualTo(Date value) {
            return orUpdateTimeNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orUpdateTimeNotEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("update_time <>", value, "updateTime");
            return or(criterion);
        }

        public CriterionGroup orUpdateTimeGreaterThan(Date value) {
            return orUpdateTimeGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orUpdateTimeGreaterThan(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("update_time >", value, "updateTime");
            return or(criterion);
        }

        public CriterionGroup orUpdateTimeGreaterThanOrEqualTo(Date value) {
            return orUpdateTimeGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orUpdateTimeGreaterThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("update_time >=", value, "updateTime");
            return or(criterion);
        }

        public CriterionGroup orUpdateTimeLessThan(Date value) {
            return orUpdateTimeLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orUpdateTimeLessThan(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("update_time <", value, "updateTime");
            return or(criterion);
        }

        public CriterionGroup orUpdateTimeLessThanOrEqualTo(Date value) {
            return orUpdateTimeLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orUpdateTimeLessThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("update_time <=", value, "updateTime");
            return or(criterion);
        }

        public CriterionGroup orUpdateTimeIn(Collection<Date> values) {
            Criterion criterion = new Criterion("update_time in", values, "updateTime");
            return or(criterion);
        }

        public CriterionGroup orUpdateTimeNotIn(Collection<Date> values) {
            Criterion criterion = new Criterion("update_time not in", values, "updateTime");
            return or(criterion);
        }

        public CriterionGroup orUpdateTimeBetween(Date value1, Date value2) {
            Criterion criterion = new Criterion("update_time between", value1, value2, "updateTime");
            return or(criterion);
        }

        public CriterionGroup orUpdateTimeNotBetween(Date value1, Date value2) {
            Criterion criterion = new Criterion("update_time not between", value1, value2, "updateTime");
            return or(criterion);
        }

        public CriterionGroup orCreateTimeIsNull() {
            Criterion criterion = new Criterion("create_time is null");
            return or(criterion);
        }

        public CriterionGroup orCreateTimeIsNotNull() {
            Criterion criterion = new Criterion("create_time is not null");
            return or(criterion);
        }

        public CriterionGroup orCreateTimeEqualTo(Date value) {
            return orCreateTimeEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orCreateTimeEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("create_time =", value, "createTime");
            return or(criterion);
        }

        public CriterionGroup orCreateTimeNotEqualTo(Date value) {
            return orCreateTimeNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orCreateTimeNotEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("create_time <>", value, "createTime");
            return or(criterion);
        }

        public CriterionGroup orCreateTimeGreaterThan(Date value) {
            return orCreateTimeGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orCreateTimeGreaterThan(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("create_time >", value, "createTime");
            return or(criterion);
        }

        public CriterionGroup orCreateTimeGreaterThanOrEqualTo(Date value) {
            return orCreateTimeGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orCreateTimeGreaterThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("create_time >=", value, "createTime");
            return or(criterion);
        }

        public CriterionGroup orCreateTimeLessThan(Date value) {
            return orCreateTimeLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orCreateTimeLessThan(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("create_time <", value, "createTime");
            return or(criterion);
        }

        public CriterionGroup orCreateTimeLessThanOrEqualTo(Date value) {
            return orCreateTimeLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orCreateTimeLessThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("create_time <=", value, "createTime");
            return or(criterion);
        }

        public CriterionGroup orCreateTimeIn(Collection<Date> values) {
            Criterion criterion = new Criterion("create_time in", values, "createTime");
            return or(criterion);
        }

        public CriterionGroup orCreateTimeNotIn(Collection<Date> values) {
            Criterion criterion = new Criterion("create_time not in", values, "createTime");
            return or(criterion);
        }

        public CriterionGroup orCreateTimeBetween(Date value1, Date value2) {
            Criterion criterion = new Criterion("create_time between", value1, value2, "createTime");
            return or(criterion);
        }

        public CriterionGroup orCreateTimeNotBetween(Date value1, Date value2) {
            Criterion criterion = new Criterion("create_time not between", value1, value2, "createTime");
            return or(criterion);
        }
    }

    public static final class Builder extends BaseExampleBuilder<Builder, ItemTypeExample> {

        protected List<Criteria> oredCriteria;

        private Builder() {

        }

        public Builder oredCriteria(List<Criteria> oredCriteria) {
            this.oredCriteria = oredCriteria;
            return this;
        }

        @Override
        public ItemTypeExample build() {
            return new ItemTypeExample(this);
        }
    }
}
