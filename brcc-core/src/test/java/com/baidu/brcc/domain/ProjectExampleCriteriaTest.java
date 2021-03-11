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

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;

public class ProjectExampleCriteriaTest {

    ProjectExample.Criteria criteria = ProjectExample.newBuilder().build().createCriteria();

    @Before
    public void setUp() {

    }

    @Test
    public void testToExample() throws Exception {
        ProjectExample result = criteria.toExample();

    }

    @Test
    public void testAddCustomerCriteria() throws Exception {
        ProjectExample.Criteria result = criteria.addCustomerCriteria("condition");

    }

    @Test
    public void testAddCustomerCriteria2() throws Exception {
        ProjectExample.Criteria result = criteria.addCustomerCriteria("condition", Boolean.TRUE);

    }

    @Test
    public void testAddCustomerCriteria3() throws Exception {
        ProjectExample.Criteria result = criteria.addCustomerCriteria("condition", "value");

    }

    @Test
    public void testAndGroupCriterion() throws Exception {
        ProjectExample.CriterionGroup result = criteria.andGroupCriterion();

    }

    @Test
    public void testAndGroupCriterion2() throws Exception {
        ProjectExample.CriterionGroup result = criteria.andGroupCriterion(Boolean.TRUE);

    }

    @Test
    public void testIsValid() throws Exception {
        boolean result = criteria.isValid();

    }

    @Test
    public void testAndIdIsNull() throws Exception {
        ProjectExample.Criteria result = criteria.andIdIsNull();

    }

    @Test
    public void testAndIdIsNotNull() throws Exception {
        ProjectExample.Criteria result = criteria.andIdIsNotNull();

    }

    @Test
    public void testAndIdEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdNotEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdNotEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdGreaterThan() throws Exception {
        ProjectExample.Criteria result = criteria.andIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testAndIdGreaterThan2() throws Exception {
        ProjectExample.Criteria result = criteria.andIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdGreaterThanOrEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdGreaterThanOrEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdLessThan() throws Exception {
        ProjectExample.Criteria result = criteria.andIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testAndIdLessThan2() throws Exception {
        ProjectExample.Criteria result = criteria.andIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdLessThanOrEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdLessThanOrEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdIn() throws Exception {
        ProjectExample.Criteria result = criteria.andIdIn(Arrays.<Long>asList(Long.valueOf(1)), Boolean.TRUE);

    }

    @Test
    public void testAndIdIn2() throws Exception {
        ProjectExample.Criteria result = criteria.andIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndIdNotIn() throws Exception {
        ProjectExample.Criteria result = criteria.andIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndIdBetween() throws Exception {
        ProjectExample.Criteria result = criteria.andIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndIdNotBetween() throws Exception {
        ProjectExample.Criteria result = criteria.andIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndNameIsNull() throws Exception {
        ProjectExample.Criteria result = criteria.andNameIsNull();

    }

    @Test
    public void testAndNameIsNotNull() throws Exception {
        ProjectExample.Criteria result = criteria.andNameIsNotNull();

    }

    @Test
    public void testAndNameEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andNameEqualTo("value");

    }

    @Test
    public void testAndNameEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andNameEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameNotEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andNameNotEqualTo("value");

    }

    @Test
    public void testAndNameNotEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andNameNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameGreaterThan() throws Exception {
        ProjectExample.Criteria result = criteria.andNameGreaterThan("value");

    }

    @Test
    public void testAndNameGreaterThan2() throws Exception {
        ProjectExample.Criteria result = criteria.andNameGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameGreaterThanOrEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andNameGreaterThanOrEqualTo("value");

    }

    @Test
    public void testAndNameGreaterThanOrEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andNameGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLessThan() throws Exception {
        ProjectExample.Criteria result = criteria.andNameLessThan("value");

    }

    @Test
    public void testAndNameLessThan2() throws Exception {
        ProjectExample.Criteria result = criteria.andNameLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLessThanOrEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andNameLessThanOrEqualTo("value");

    }

    @Test
    public void testAndNameLessThanOrEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andNameLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLike() throws Exception {
        ProjectExample.Criteria result = criteria.andNameLike("value");

    }

    @Test
    public void testAndNameLike2() throws Exception {
        ProjectExample.Criteria result = criteria.andNameLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLikeLeft() throws Exception {
        ProjectExample.Criteria result = criteria.andNameLikeLeft("value");

    }

    @Test
    public void testAndNameLikeLeft2() throws Exception {
        ProjectExample.Criteria result = criteria.andNameLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLikeRight() throws Exception {
        ProjectExample.Criteria result = criteria.andNameLikeRight("value");

    }

    @Test
    public void testAndNameLikeRight2() throws Exception {
        ProjectExample.Criteria result = criteria.andNameLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLikeBoth() throws Exception {
        ProjectExample.Criteria result = criteria.andNameLikeBoth("value");

    }

    @Test
    public void testAndNameLikeBoth2() throws Exception {
        ProjectExample.Criteria result = criteria.andNameLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameNotLike() throws Exception {
        ProjectExample.Criteria result = criteria.andNameNotLike("value");

    }

    @Test
    public void testAndNameNotLike2() throws Exception {
        ProjectExample.Criteria result = criteria.andNameNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameNotLikeLeft() throws Exception {
        ProjectExample.Criteria result = criteria.andNameNotLikeLeft("value");

    }

    @Test
    public void testAndNameNotLikeLeft2() throws Exception {
        ProjectExample.Criteria result = criteria.andNameNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameNotLikeRight() throws Exception {
        ProjectExample.Criteria result = criteria.andNameNotLikeRight("value");

    }

    @Test
    public void testAndNameNotLikeRight2() throws Exception {
        ProjectExample.Criteria result = criteria.andNameNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameNotLikeBoth() throws Exception {
        ProjectExample.Criteria result = criteria.andNameNotLikeBoth("value");

    }

    @Test
    public void testAndNameNotLikeBoth2() throws Exception {
        ProjectExample.Criteria result = criteria.andNameNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameIn() throws Exception {
        ProjectExample.Criteria result = criteria.andNameIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndNameNotIn() throws Exception {
        ProjectExample.Criteria result = criteria.andNameNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndNameBetween() throws Exception {
        ProjectExample.Criteria result = criteria.andNameBetween("value1", "value2");

    }

    @Test
    public void testAndNameNotBetween() throws Exception {
        ProjectExample.Criteria result = criteria.andNameNotBetween("value1", "value2");

    }

    @Test
    public void testAndProductIdIsNull() throws Exception {
        ProjectExample.Criteria result = criteria.andProductIdIsNull();

    }

    @Test
    public void testAndProductIdIsNotNull() throws Exception {
        ProjectExample.Criteria result = criteria.andProductIdIsNotNull();

    }

    @Test
    public void testAndProductIdEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andProductIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andProductIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdNotEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andProductIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdNotEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andProductIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdGreaterThan() throws Exception {
        ProjectExample.Criteria result = criteria.andProductIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdGreaterThan2() throws Exception {
        ProjectExample.Criteria result = criteria.andProductIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdGreaterThanOrEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andProductIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdGreaterThanOrEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andProductIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdLessThan() throws Exception {
        ProjectExample.Criteria result = criteria.andProductIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdLessThan2() throws Exception {
        ProjectExample.Criteria result = criteria.andProductIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdLessThanOrEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andProductIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdLessThanOrEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andProductIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdIn() throws Exception {
        ProjectExample.Criteria result = criteria.andProductIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndProductIdNotIn() throws Exception {
        ProjectExample.Criteria result = criteria.andProductIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndProductIdBetween() throws Exception {
        ProjectExample.Criteria result = criteria.andProductIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndProductIdNotBetween() throws Exception {
        ProjectExample.Criteria result = criteria.andProductIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndMemoIsNull() throws Exception {
        ProjectExample.Criteria result = criteria.andMemoIsNull();

    }

    @Test
    public void testAndMemoIsNotNull() throws Exception {
        ProjectExample.Criteria result = criteria.andMemoIsNotNull();

    }

    @Test
    public void testAndMemoEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andMemoEqualTo("value");

    }

    @Test
    public void testAndMemoEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andMemoEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoNotEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andMemoNotEqualTo("value");

    }

    @Test
    public void testAndMemoNotEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andMemoNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoGreaterThan() throws Exception {
        ProjectExample.Criteria result = criteria.andMemoGreaterThan("value");

    }

    @Test
    public void testAndMemoGreaterThan2() throws Exception {
        ProjectExample.Criteria result = criteria.andMemoGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoGreaterThanOrEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andMemoGreaterThanOrEqualTo("value");

    }

    @Test
    public void testAndMemoGreaterThanOrEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andMemoGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoLessThan() throws Exception {
        ProjectExample.Criteria result = criteria.andMemoLessThan("value");

    }

    @Test
    public void testAndMemoLessThan2() throws Exception {
        ProjectExample.Criteria result = criteria.andMemoLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoLessThanOrEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andMemoLessThanOrEqualTo("value");

    }

    @Test
    public void testAndMemoLessThanOrEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andMemoLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoLike() throws Exception {
        ProjectExample.Criteria result = criteria.andMemoLike("value");

    }

    @Test
    public void testAndMemoLike2() throws Exception {
        ProjectExample.Criteria result = criteria.andMemoLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoLikeLeft() throws Exception {
        ProjectExample.Criteria result = criteria.andMemoLikeLeft("value");

    }

    @Test
    public void testAndMemoLikeLeft2() throws Exception {
        ProjectExample.Criteria result = criteria.andMemoLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoLikeRight() throws Exception {
        ProjectExample.Criteria result = criteria.andMemoLikeRight("value");

    }

    @Test
    public void testAndMemoLikeRight2() throws Exception {
        ProjectExample.Criteria result = criteria.andMemoLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoLikeBoth() throws Exception {
        ProjectExample.Criteria result = criteria.andMemoLikeBoth("value");

    }

    @Test
    public void testAndMemoLikeBoth2() throws Exception {
        ProjectExample.Criteria result = criteria.andMemoLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoNotLike() throws Exception {
        ProjectExample.Criteria result = criteria.andMemoNotLike("value");

    }

    @Test
    public void testAndMemoNotLike2() throws Exception {
        ProjectExample.Criteria result = criteria.andMemoNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoNotLikeLeft() throws Exception {
        ProjectExample.Criteria result = criteria.andMemoNotLikeLeft("value");

    }

    @Test
    public void testAndMemoNotLikeLeft2() throws Exception {
        ProjectExample.Criteria result = criteria.andMemoNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoNotLikeRight() throws Exception {
        ProjectExample.Criteria result = criteria.andMemoNotLikeRight("value");

    }

    @Test
    public void testAndMemoNotLikeRight2() throws Exception {
        ProjectExample.Criteria result = criteria.andMemoNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoNotLikeBoth() throws Exception {
        ProjectExample.Criteria result = criteria.andMemoNotLikeBoth("value");

    }

    @Test
    public void testAndMemoNotLikeBoth2() throws Exception {
        ProjectExample.Criteria result = criteria.andMemoNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoIn() throws Exception {
        ProjectExample.Criteria result = criteria.andMemoIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndMemoNotIn() throws Exception {
        ProjectExample.Criteria result = criteria.andMemoNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndMemoBetween() throws Exception {
        ProjectExample.Criteria result = criteria.andMemoBetween("value1", "value2");

    }

    @Test
    public void testAndMemoNotBetween() throws Exception {
        ProjectExample.Criteria result = criteria.andMemoNotBetween("value1", "value2");

    }

    @Test
    public void testAndProjectTypeIsNull() throws Exception {
        ProjectExample.Criteria result = criteria.andProjectTypeIsNull();

    }

    @Test
    public void testAndProjectTypeIsNotNull() throws Exception {
        ProjectExample.Criteria result = criteria.andProjectTypeIsNotNull();

    }

    @Test
    public void testAndProjectTypeEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andProjectTypeEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndProjectTypeEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andProjectTypeEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndProjectTypeNotEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andProjectTypeNotEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndProjectTypeNotEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andProjectTypeNotEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndProjectTypeGreaterThan() throws Exception {
        ProjectExample.Criteria result = criteria.andProjectTypeGreaterThan(Byte.valueOf("00110"));

    }

    @Test
    public void testAndProjectTypeGreaterThan2() throws Exception {
        ProjectExample.Criteria result = criteria.andProjectTypeGreaterThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndProjectTypeGreaterThanOrEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andProjectTypeGreaterThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndProjectTypeGreaterThanOrEqualTo2() throws Exception {
        ProjectExample.Criteria result =
                criteria.andProjectTypeGreaterThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndProjectTypeLessThan() throws Exception {
        ProjectExample.Criteria result = criteria.andProjectTypeLessThan(Byte.valueOf("00110"));

    }

    @Test
    public void testAndProjectTypeLessThan2() throws Exception {
        ProjectExample.Criteria result = criteria.andProjectTypeLessThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndProjectTypeLessThanOrEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andProjectTypeLessThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndProjectTypeLessThanOrEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andProjectTypeLessThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndProjectTypeIn() throws Exception {
        ProjectExample.Criteria result = criteria.andProjectTypeIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testAndProjectTypeNotIn() throws Exception {
        ProjectExample.Criteria result = criteria.andProjectTypeNotIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testAndProjectTypeBetween() throws Exception {
        ProjectExample.Criteria result = criteria.andProjectTypeBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testAndProjectTypeNotBetween() throws Exception {
        ProjectExample.Criteria result =
                criteria.andProjectTypeNotBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testAndDependencyIdsIsNull() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyIdsIsNull();

    }

    @Test
    public void testAndDependencyIdsIsNotNull() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyIdsIsNotNull();

    }

    @Test
    public void testAndDependencyIdsEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyIdsEqualTo("value");

    }

    @Test
    public void testAndDependencyIdsEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyIdsEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndDependencyIdsNotEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyIdsNotEqualTo("value");

    }

    @Test
    public void testAndDependencyIdsNotEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyIdsNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndDependencyIdsGreaterThan() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyIdsGreaterThan("value");

    }

    @Test
    public void testAndDependencyIdsGreaterThan2() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyIdsGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndDependencyIdsGreaterThanOrEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyIdsGreaterThanOrEqualTo("value");

    }

    @Test
    public void testAndDependencyIdsGreaterThanOrEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyIdsGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndDependencyIdsLessThan() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyIdsLessThan("value");

    }

    @Test
    public void testAndDependencyIdsLessThan2() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyIdsLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndDependencyIdsLessThanOrEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyIdsLessThanOrEqualTo("value");

    }

    @Test
    public void testAndDependencyIdsLessThanOrEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyIdsLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndDependencyIdsLike() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyIdsLike("value");

    }

    @Test
    public void testAndDependencyIdsLike2() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyIdsLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndDependencyIdsLikeLeft() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyIdsLikeLeft("value");

    }

    @Test
    public void testAndDependencyIdsLikeLeft2() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyIdsLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndDependencyIdsLikeRight() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyIdsLikeRight("value");

    }

    @Test
    public void testAndDependencyIdsLikeRight2() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyIdsLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndDependencyIdsLikeBoth() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyIdsLikeBoth("value");

    }

    @Test
    public void testAndDependencyIdsLikeBoth2() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyIdsLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndDependencyIdsNotLike() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyIdsNotLike("value");

    }

    @Test
    public void testAndDependencyIdsNotLike2() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyIdsNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndDependencyIdsNotLikeLeft() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyIdsNotLikeLeft("value");

    }

    @Test
    public void testAndDependencyIdsNotLikeLeft2() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyIdsNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndDependencyIdsNotLikeRight() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyIdsNotLikeRight("value");

    }

    @Test
    public void testAndDependencyIdsNotLikeRight2() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyIdsNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndDependencyIdsNotLikeBoth() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyIdsNotLikeBoth("value");

    }

    @Test
    public void testAndDependencyIdsNotLikeBoth2() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyIdsNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndDependencyIdsIn() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyIdsIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndDependencyIdsNotIn() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyIdsNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndDependencyIdsBetween() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyIdsBetween("value1", "value2");

    }

    @Test
    public void testAndDependencyIdsNotBetween() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyIdsNotBetween("value1", "value2");

    }

    @Test
    public void testAndDependencyNamesIsNull() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyNamesIsNull();

    }

    @Test
    public void testAndDependencyNamesIsNotNull() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyNamesIsNotNull();

    }

    @Test
    public void testAndDependencyNamesEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyNamesEqualTo("value");

    }

    @Test
    public void testAndDependencyNamesEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyNamesEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndDependencyNamesNotEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyNamesNotEqualTo("value");

    }

    @Test
    public void testAndDependencyNamesNotEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyNamesNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndDependencyNamesGreaterThan() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyNamesGreaterThan("value");

    }

    @Test
    public void testAndDependencyNamesGreaterThan2() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyNamesGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndDependencyNamesGreaterThanOrEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyNamesGreaterThanOrEqualTo("value");

    }

    @Test
    public void testAndDependencyNamesGreaterThanOrEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyNamesGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndDependencyNamesLessThan() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyNamesLessThan("value");

    }

    @Test
    public void testAndDependencyNamesLessThan2() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyNamesLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndDependencyNamesLessThanOrEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyNamesLessThanOrEqualTo("value");

    }

    @Test
    public void testAndDependencyNamesLessThanOrEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyNamesLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndDependencyNamesLike() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyNamesLike("value");

    }

    @Test
    public void testAndDependencyNamesLike2() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyNamesLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndDependencyNamesLikeLeft() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyNamesLikeLeft("value");

    }

    @Test
    public void testAndDependencyNamesLikeLeft2() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyNamesLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndDependencyNamesLikeRight() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyNamesLikeRight("value");

    }

    @Test
    public void testAndDependencyNamesLikeRight2() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyNamesLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndDependencyNamesLikeBoth() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyNamesLikeBoth("value");

    }

    @Test
    public void testAndDependencyNamesLikeBoth2() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyNamesLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndDependencyNamesNotLike() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyNamesNotLike("value");

    }

    @Test
    public void testAndDependencyNamesNotLike2() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyNamesNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndDependencyNamesNotLikeLeft() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyNamesNotLikeLeft("value");

    }

    @Test
    public void testAndDependencyNamesNotLikeLeft2() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyNamesNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndDependencyNamesNotLikeRight() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyNamesNotLikeRight("value");

    }

    @Test
    public void testAndDependencyNamesNotLikeRight2() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyNamesNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndDependencyNamesNotLikeBoth() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyNamesNotLikeBoth("value");

    }

    @Test
    public void testAndDependencyNamesNotLikeBoth2() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyNamesNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndDependencyNamesIn() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyNamesIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndDependencyNamesNotIn() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyNamesNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndDependencyNamesBetween() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyNamesBetween("value1", "value2");

    }

    @Test
    public void testAndDependencyNamesNotBetween() throws Exception {
        ProjectExample.Criteria result = criteria.andDependencyNamesNotBetween("value1", "value2");

    }

    @Test
    public void testAndMailReceiverIsNull() throws Exception {
        ProjectExample.Criteria result = criteria.andMailReceiverIsNull();

    }

    @Test
    public void testAndMailReceiverIsNotNull() throws Exception {
        ProjectExample.Criteria result = criteria.andMailReceiverIsNotNull();

    }

    @Test
    public void testAndMailReceiverEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andMailReceiverEqualTo("value");

    }

    @Test
    public void testAndMailReceiverEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andMailReceiverEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndMailReceiverNotEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andMailReceiverNotEqualTo("value");

    }

    @Test
    public void testAndMailReceiverNotEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andMailReceiverNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndMailReceiverGreaterThan() throws Exception {
        ProjectExample.Criteria result = criteria.andMailReceiverGreaterThan("value");

    }

    @Test
    public void testAndMailReceiverGreaterThan2() throws Exception {
        ProjectExample.Criteria result = criteria.andMailReceiverGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndMailReceiverGreaterThanOrEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andMailReceiverGreaterThanOrEqualTo("value");

    }

    @Test
    public void testAndMailReceiverGreaterThanOrEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andMailReceiverGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndMailReceiverLessThan() throws Exception {
        ProjectExample.Criteria result = criteria.andMailReceiverLessThan("value");

    }

    @Test
    public void testAndMailReceiverLessThan2() throws Exception {
        ProjectExample.Criteria result = criteria.andMailReceiverLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndMailReceiverLessThanOrEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andMailReceiverLessThanOrEqualTo("value");

    }

    @Test
    public void testAndMailReceiverLessThanOrEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andMailReceiverLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndMailReceiverLike() throws Exception {
        ProjectExample.Criteria result = criteria.andMailReceiverLike("value");

    }

    @Test
    public void testAndMailReceiverLike2() throws Exception {
        ProjectExample.Criteria result = criteria.andMailReceiverLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndMailReceiverLikeLeft() throws Exception {
        ProjectExample.Criteria result = criteria.andMailReceiverLikeLeft("value");

    }

    @Test
    public void testAndMailReceiverLikeLeft2() throws Exception {
        ProjectExample.Criteria result = criteria.andMailReceiverLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndMailReceiverLikeRight() throws Exception {
        ProjectExample.Criteria result = criteria.andMailReceiverLikeRight("value");

    }

    @Test
    public void testAndMailReceiverLikeRight2() throws Exception {
        ProjectExample.Criteria result = criteria.andMailReceiverLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndMailReceiverLikeBoth() throws Exception {
        ProjectExample.Criteria result = criteria.andMailReceiverLikeBoth("value");

    }

    @Test
    public void testAndMailReceiverLikeBoth2() throws Exception {
        ProjectExample.Criteria result = criteria.andMailReceiverLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndMailReceiverNotLike() throws Exception {
        ProjectExample.Criteria result = criteria.andMailReceiverNotLike("value");

    }

    @Test
    public void testAndMailReceiverNotLike2() throws Exception {
        ProjectExample.Criteria result = criteria.andMailReceiverNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndMailReceiverNotLikeLeft() throws Exception {
        ProjectExample.Criteria result = criteria.andMailReceiverNotLikeLeft("value");

    }

    @Test
    public void testAndMailReceiverNotLikeLeft2() throws Exception {
        ProjectExample.Criteria result = criteria.andMailReceiverNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndMailReceiverNotLikeRight() throws Exception {
        ProjectExample.Criteria result = criteria.andMailReceiverNotLikeRight("value");

    }

    @Test
    public void testAndMailReceiverNotLikeRight2() throws Exception {
        ProjectExample.Criteria result = criteria.andMailReceiverNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndMailReceiverNotLikeBoth() throws Exception {
        ProjectExample.Criteria result = criteria.andMailReceiverNotLikeBoth("value");

    }

    @Test
    public void testAndMailReceiverNotLikeBoth2() throws Exception {
        ProjectExample.Criteria result = criteria.andMailReceiverNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndMailReceiverIn() throws Exception {
        ProjectExample.Criteria result = criteria.andMailReceiverIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndMailReceiverNotIn() throws Exception {
        ProjectExample.Criteria result = criteria.andMailReceiverNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndMailReceiverBetween() throws Exception {
        ProjectExample.Criteria result = criteria.andMailReceiverBetween("value1", "value2");

    }

    @Test
    public void testAndMailReceiverNotBetween() throws Exception {
        ProjectExample.Criteria result = criteria.andMailReceiverNotBetween("value1", "value2");

    }

    @Test
    public void testAndApiPasswordIsNull() throws Exception {
        ProjectExample.Criteria result = criteria.andApiPasswordIsNull();

    }

    @Test
    public void testAndApiPasswordIsNotNull() throws Exception {
        ProjectExample.Criteria result = criteria.andApiPasswordIsNotNull();

    }

    @Test
    public void testAndApiPasswordEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andApiPasswordEqualTo("value");

    }

    @Test
    public void testAndApiPasswordEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andApiPasswordEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndApiPasswordNotEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andApiPasswordNotEqualTo("value");

    }

    @Test
    public void testAndApiPasswordNotEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andApiPasswordNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndApiPasswordGreaterThan() throws Exception {
        ProjectExample.Criteria result = criteria.andApiPasswordGreaterThan("value");

    }

    @Test
    public void testAndApiPasswordGreaterThan2() throws Exception {
        ProjectExample.Criteria result = criteria.andApiPasswordGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndApiPasswordGreaterThanOrEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andApiPasswordGreaterThanOrEqualTo("value");

    }

    @Test
    public void testAndApiPasswordGreaterThanOrEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andApiPasswordGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndApiPasswordLessThan() throws Exception {
        ProjectExample.Criteria result = criteria.andApiPasswordLessThan("value");

    }

    @Test
    public void testAndApiPasswordLessThan2() throws Exception {
        ProjectExample.Criteria result = criteria.andApiPasswordLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndApiPasswordLessThanOrEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andApiPasswordLessThanOrEqualTo("value");

    }

    @Test
    public void testAndApiPasswordLessThanOrEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andApiPasswordLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndApiPasswordLike() throws Exception {
        ProjectExample.Criteria result = criteria.andApiPasswordLike("value");

    }

    @Test
    public void testAndApiPasswordLike2() throws Exception {
        ProjectExample.Criteria result = criteria.andApiPasswordLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndApiPasswordLikeLeft() throws Exception {
        ProjectExample.Criteria result = criteria.andApiPasswordLikeLeft("value");

    }

    @Test
    public void testAndApiPasswordLikeLeft2() throws Exception {
        ProjectExample.Criteria result = criteria.andApiPasswordLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndApiPasswordLikeRight() throws Exception {
        ProjectExample.Criteria result = criteria.andApiPasswordLikeRight("value");

    }

    @Test
    public void testAndApiPasswordLikeRight2() throws Exception {
        ProjectExample.Criteria result = criteria.andApiPasswordLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndApiPasswordLikeBoth() throws Exception {
        ProjectExample.Criteria result = criteria.andApiPasswordLikeBoth("value");

    }

    @Test
    public void testAndApiPasswordLikeBoth2() throws Exception {
        ProjectExample.Criteria result = criteria.andApiPasswordLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndApiPasswordNotLike() throws Exception {
        ProjectExample.Criteria result = criteria.andApiPasswordNotLike("value");

    }

    @Test
    public void testAndApiPasswordNotLike2() throws Exception {
        ProjectExample.Criteria result = criteria.andApiPasswordNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndApiPasswordNotLikeLeft() throws Exception {
        ProjectExample.Criteria result = criteria.andApiPasswordNotLikeLeft("value");

    }

    @Test
    public void testAndApiPasswordNotLikeLeft2() throws Exception {
        ProjectExample.Criteria result = criteria.andApiPasswordNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndApiPasswordNotLikeRight() throws Exception {
        ProjectExample.Criteria result = criteria.andApiPasswordNotLikeRight("value");

    }

    @Test
    public void testAndApiPasswordNotLikeRight2() throws Exception {
        ProjectExample.Criteria result = criteria.andApiPasswordNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndApiPasswordNotLikeBoth() throws Exception {
        ProjectExample.Criteria result = criteria.andApiPasswordNotLikeBoth("value");

    }

    @Test
    public void testAndApiPasswordNotLikeBoth2() throws Exception {
        ProjectExample.Criteria result = criteria.andApiPasswordNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndApiPasswordIn() throws Exception {
        ProjectExample.Criteria result = criteria.andApiPasswordIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndApiPasswordNotIn() throws Exception {
        ProjectExample.Criteria result = criteria.andApiPasswordNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndApiPasswordBetween() throws Exception {
        ProjectExample.Criteria result = criteria.andApiPasswordBetween("value1", "value2");

    }

    @Test
    public void testAndApiPasswordNotBetween() throws Exception {
        ProjectExample.Criteria result = criteria.andApiPasswordNotBetween("value1", "value2");

    }

    @Test
    public void testAndApiTokenIsNull() throws Exception {
        ProjectExample.Criteria result = criteria.andApiTokenIsNull();

    }

    @Test
    public void testAndApiTokenIsNotNull() throws Exception {
        ProjectExample.Criteria result = criteria.andApiTokenIsNotNull();

    }

    @Test
    public void testAndApiTokenEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andApiTokenEqualTo("value");

    }

    @Test
    public void testAndApiTokenEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andApiTokenEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndApiTokenNotEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andApiTokenNotEqualTo("value");

    }

    @Test
    public void testAndApiTokenNotEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andApiTokenNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndApiTokenGreaterThan() throws Exception {
        ProjectExample.Criteria result = criteria.andApiTokenGreaterThan("value");

    }

    @Test
    public void testAndApiTokenGreaterThan2() throws Exception {
        ProjectExample.Criteria result = criteria.andApiTokenGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndApiTokenGreaterThanOrEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andApiTokenGreaterThanOrEqualTo("value");

    }

    @Test
    public void testAndApiTokenGreaterThanOrEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andApiTokenGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndApiTokenLessThan() throws Exception {
        ProjectExample.Criteria result = criteria.andApiTokenLessThan("value");

    }

    @Test
    public void testAndApiTokenLessThan2() throws Exception {
        ProjectExample.Criteria result = criteria.andApiTokenLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndApiTokenLessThanOrEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andApiTokenLessThanOrEqualTo("value");

    }

    @Test
    public void testAndApiTokenLessThanOrEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andApiTokenLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndApiTokenLike() throws Exception {
        ProjectExample.Criteria result = criteria.andApiTokenLike("value");

    }

    @Test
    public void testAndApiTokenLike2() throws Exception {
        ProjectExample.Criteria result = criteria.andApiTokenLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndApiTokenLikeLeft() throws Exception {
        ProjectExample.Criteria result = criteria.andApiTokenLikeLeft("value");

    }

    @Test
    public void testAndApiTokenLikeLeft2() throws Exception {
        ProjectExample.Criteria result = criteria.andApiTokenLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndApiTokenLikeRight() throws Exception {
        ProjectExample.Criteria result = criteria.andApiTokenLikeRight("value");

    }

    @Test
    public void testAndApiTokenLikeRight2() throws Exception {
        ProjectExample.Criteria result = criteria.andApiTokenLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndApiTokenLikeBoth() throws Exception {
        ProjectExample.Criteria result = criteria.andApiTokenLikeBoth("value");

    }

    @Test
    public void testAndApiTokenLikeBoth2() throws Exception {
        ProjectExample.Criteria result = criteria.andApiTokenLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndApiTokenNotLike() throws Exception {
        ProjectExample.Criteria result = criteria.andApiTokenNotLike("value");

    }

    @Test
    public void testAndApiTokenNotLike2() throws Exception {
        ProjectExample.Criteria result = criteria.andApiTokenNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndApiTokenNotLikeLeft() throws Exception {
        ProjectExample.Criteria result = criteria.andApiTokenNotLikeLeft("value");

    }

    @Test
    public void testAndApiTokenNotLikeLeft2() throws Exception {
        ProjectExample.Criteria result = criteria.andApiTokenNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndApiTokenNotLikeRight() throws Exception {
        ProjectExample.Criteria result = criteria.andApiTokenNotLikeRight("value");

    }

    @Test
    public void testAndApiTokenNotLikeRight2() throws Exception {
        ProjectExample.Criteria result = criteria.andApiTokenNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndApiTokenNotLikeBoth() throws Exception {
        ProjectExample.Criteria result = criteria.andApiTokenNotLikeBoth("value");

    }

    @Test
    public void testAndApiTokenNotLikeBoth2() throws Exception {
        ProjectExample.Criteria result = criteria.andApiTokenNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndApiTokenIn() throws Exception {
        ProjectExample.Criteria result = criteria.andApiTokenIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndApiTokenNotIn() throws Exception {
        ProjectExample.Criteria result = criteria.andApiTokenNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndApiTokenBetween() throws Exception {
        ProjectExample.Criteria result = criteria.andApiTokenBetween("value1", "value2");

    }

    @Test
    public void testAndApiTokenNotBetween() throws Exception {
        ProjectExample.Criteria result = criteria.andApiTokenNotBetween("value1", "value2");

    }

    @Test
    public void testAndDeletedIsNull() throws Exception {
        ProjectExample.Criteria result = criteria.andDeletedIsNull();

    }

    @Test
    public void testAndDeletedIsNotNull() throws Exception {
        ProjectExample.Criteria result = criteria.andDeletedIsNotNull();

    }

    @Test
    public void testAndDeletedEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andDeletedEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andDeletedEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndDeletedNotEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andDeletedNotEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedNotEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andDeletedNotEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndDeletedGreaterThan() throws Exception {
        ProjectExample.Criteria result = criteria.andDeletedGreaterThan(Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedGreaterThan2() throws Exception {
        ProjectExample.Criteria result = criteria.andDeletedGreaterThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndDeletedGreaterThanOrEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andDeletedGreaterThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedGreaterThanOrEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andDeletedGreaterThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndDeletedLessThan() throws Exception {
        ProjectExample.Criteria result = criteria.andDeletedLessThan(Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedLessThan2() throws Exception {
        ProjectExample.Criteria result = criteria.andDeletedLessThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndDeletedLessThanOrEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andDeletedLessThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedLessThanOrEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andDeletedLessThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndDeletedIn() throws Exception {
        ProjectExample.Criteria result = criteria.andDeletedIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testAndDeletedNotIn() throws Exception {
        ProjectExample.Criteria result = criteria.andDeletedNotIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testAndDeletedBetween() throws Exception {
        ProjectExample.Criteria result = criteria.andDeletedBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedNotBetween() throws Exception {
        ProjectExample.Criteria result = criteria.andDeletedNotBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testAndUpdateTimeIsNull() throws Exception {
        ProjectExample.Criteria result = criteria.andUpdateTimeIsNull();

    }

    @Test
    public void testAndUpdateTimeIsNotNull() throws Exception {
        ProjectExample.Criteria result = criteria.andUpdateTimeIsNotNull();

    }

    @Test
    public void testAndUpdateTimeEqualTo() throws Exception {
        ProjectExample.Criteria result =
                criteria.andUpdateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime());

    }

    @Test
    public void testAndUpdateTimeEqualTo2() throws Exception {
        ProjectExample.Criteria result =
                criteria.andUpdateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeNotEqualTo() throws Exception {
        ProjectExample.Criteria result =
                criteria.andUpdateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime());

    }

    @Test
    public void testAndUpdateTimeNotEqualTo2() throws Exception {
        ProjectExample.Criteria result =
                criteria.andUpdateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeGreaterThan() throws Exception {
        ProjectExample.Criteria result =
                criteria.andUpdateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime());

    }

    @Test
    public void testAndUpdateTimeGreaterThan2() throws Exception {
        ProjectExample.Criteria result =
                criteria.andUpdateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeGreaterThanOrEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andUpdateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime());

    }

    @Test
    public void testAndUpdateTimeGreaterThanOrEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andUpdateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeLessThan() throws Exception {
        ProjectExample.Criteria result =
                criteria.andUpdateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime());

    }

    @Test
    public void testAndUpdateTimeLessThan2() throws Exception {
        ProjectExample.Criteria result =
                criteria.andUpdateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeLessThanOrEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andUpdateTimeLessThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime());

    }

    @Test
    public void testAndUpdateTimeLessThanOrEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andUpdateTimeLessThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeIn() throws Exception {
        ProjectExample.Criteria result = criteria.andUpdateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime()));

    }

    @Test
    public void testAndUpdateTimeNotIn() throws Exception {
        ProjectExample.Criteria result = criteria.andUpdateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime()));

    }

    @Test
    public void testAndUpdateTimeBetween() throws Exception {
        ProjectExample.Criteria result =
                criteria.andUpdateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime());

    }

    @Test
    public void testAndUpdateTimeNotBetween() throws Exception {
        ProjectExample.Criteria result =
                criteria.andUpdateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime());

    }

    @Test
    public void testAndCreateTimeIsNull() throws Exception {
        ProjectExample.Criteria result = criteria.andCreateTimeIsNull();

    }

    @Test
    public void testAndCreateTimeIsNotNull() throws Exception {
        ProjectExample.Criteria result = criteria.andCreateTimeIsNotNull();

    }

    @Test
    public void testAndCreateTimeEqualTo() throws Exception {
        ProjectExample.Criteria result =
                criteria.andCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime());

    }

    @Test
    public void testAndCreateTimeEqualTo2() throws Exception {
        ProjectExample.Criteria result =
                criteria.andCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeNotEqualTo() throws Exception {
        ProjectExample.Criteria result =
                criteria.andCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime());

    }

    @Test
    public void testAndCreateTimeNotEqualTo2() throws Exception {
        ProjectExample.Criteria result =
                criteria.andCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeGreaterThan() throws Exception {
        ProjectExample.Criteria result =
                criteria.andCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime());

    }

    @Test
    public void testAndCreateTimeGreaterThan2() throws Exception {
        ProjectExample.Criteria result =
                criteria.andCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeGreaterThanOrEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andCreateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime());

    }

    @Test
    public void testAndCreateTimeGreaterThanOrEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andCreateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeLessThan() throws Exception {
        ProjectExample.Criteria result =
                criteria.andCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime());

    }

    @Test
    public void testAndCreateTimeLessThan2() throws Exception {
        ProjectExample.Criteria result =
                criteria.andCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeLessThanOrEqualTo() throws Exception {
        ProjectExample.Criteria result = criteria.andCreateTimeLessThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime());

    }

    @Test
    public void testAndCreateTimeLessThanOrEqualTo2() throws Exception {
        ProjectExample.Criteria result = criteria.andCreateTimeLessThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeIn() throws Exception {
        ProjectExample.Criteria result = criteria.andCreateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime()));

    }

    @Test
    public void testAndCreateTimeNotIn() throws Exception {
        ProjectExample.Criteria result = criteria.andCreateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime()));

    }

    @Test
    public void testAndCreateTimeBetween() throws Exception {
        ProjectExample.Criteria result =
                criteria.andCreateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime());

    }

    @Test
    public void testAndCreateTimeNotBetween() throws Exception {
        ProjectExample.Criteria result =
                criteria.andCreateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime());

    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev
// .com/forum#!/testme
