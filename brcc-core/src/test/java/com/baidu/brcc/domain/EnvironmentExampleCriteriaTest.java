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

public class EnvironmentExampleCriteriaTest {
    EnvironmentExample.Criteria criteria = EnvironmentExample.newBuilder().build().createCriteria();

    @Before
    public void setUp() {
    }

    @Test
    public void testToExample() throws Exception {
        EnvironmentExample result = criteria.toExample();

    }

    @Test
    public void testAddCustomerCriteria() throws Exception {
        EnvironmentExample.Criteria result = criteria.addCustomerCriteria("condition");

    }

    @Test
    public void testAddCustomerCriteria2() throws Exception {
        EnvironmentExample.Criteria result = criteria.addCustomerCriteria("condition", Boolean.TRUE);

    }

    @Test
    public void testAddCustomerCriteria3() throws Exception {
        EnvironmentExample.Criteria result = criteria.addCustomerCriteria("condition", "value");

    }

    @Test
    public void testAndGroupCriterion() throws Exception {
        EnvironmentExample.CriterionGroup result = criteria.andGroupCriterion();

    }

    @Test
    public void testAndGroupCriterion2() throws Exception {
        EnvironmentExample.CriterionGroup result = criteria.andGroupCriterion(Boolean.TRUE);

    }

    @Test
    public void testIsValid() throws Exception {
        boolean result = criteria.isValid();

    }

    @Test
    public void testAndIdIsNull() throws Exception {
        EnvironmentExample.Criteria result = criteria.andIdIsNull();

    }

    @Test
    public void testAndIdIsNotNull() throws Exception {
        EnvironmentExample.Criteria result = criteria.andIdIsNotNull();

    }

    @Test
    public void testAndIdEqualTo() throws Exception {
        EnvironmentExample.Criteria result = criteria.andIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdEqualTo2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdNotEqualTo() throws Exception {
        EnvironmentExample.Criteria result = criteria.andIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdNotEqualTo2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdGreaterThan() throws Exception {
        EnvironmentExample.Criteria result = criteria.andIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testAndIdGreaterThan2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdGreaterThanOrEqualTo() throws Exception {
        EnvironmentExample.Criteria result = criteria.andIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdGreaterThanOrEqualTo2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdLessThan() throws Exception {
        EnvironmentExample.Criteria result = criteria.andIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testAndIdLessThan2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdLessThanOrEqualTo() throws Exception {
        EnvironmentExample.Criteria result = criteria.andIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdLessThanOrEqualTo2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdIn() throws Exception {
        EnvironmentExample.Criteria result = criteria.andIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndIdIn2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andIdIn(Arrays.<Long>asList(Long.valueOf(1)), Boolean.TRUE);

    }

    @Test
    public void testAndIdNotIn() throws Exception {
        EnvironmentExample.Criteria result = criteria.andIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndIdBetween() throws Exception {
        EnvironmentExample.Criteria result = criteria.andIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndIdNotBetween() throws Exception {
        EnvironmentExample.Criteria result = criteria.andIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndNameIsNull() throws Exception {
        EnvironmentExample.Criteria result = criteria.andNameIsNull();

    }

    @Test
    public void testAndNameIsNotNull() throws Exception {
        EnvironmentExample.Criteria result = criteria.andNameIsNotNull();

    }

    @Test
    public void testAndNameEqualTo() throws Exception {
        EnvironmentExample.Criteria result = criteria.andNameEqualTo("value");

    }

    @Test
    public void testAndNameEqualTo2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andNameEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameNotEqualTo() throws Exception {
        EnvironmentExample.Criteria result = criteria.andNameNotEqualTo("value");

    }

    @Test
    public void testAndNameNotEqualTo2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andNameNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameGreaterThan() throws Exception {
        EnvironmentExample.Criteria result = criteria.andNameGreaterThan("value");

    }

    @Test
    public void testAndNameGreaterThan2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andNameGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameGreaterThanOrEqualTo() throws Exception {
        EnvironmentExample.Criteria result = criteria.andNameGreaterThanOrEqualTo("value");

    }

    @Test
    public void testAndNameGreaterThanOrEqualTo2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andNameGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLessThan() throws Exception {
        EnvironmentExample.Criteria result = criteria.andNameLessThan("value");

    }

    @Test
    public void testAndNameLessThan2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andNameLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLessThanOrEqualTo() throws Exception {
        EnvironmentExample.Criteria result = criteria.andNameLessThanOrEqualTo("value");

    }

    @Test
    public void testAndNameLessThanOrEqualTo2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andNameLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLike() throws Exception {
        EnvironmentExample.Criteria result = criteria.andNameLike("value");

    }

    @Test
    public void testAndNameLike2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andNameLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLikeLeft() throws Exception {
        EnvironmentExample.Criteria result = criteria.andNameLikeLeft("value");

    }

    @Test
    public void testAndNameLikeLeft2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andNameLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLikeRight() throws Exception {
        EnvironmentExample.Criteria result = criteria.andNameLikeRight("value");

    }

    @Test
    public void testAndNameLikeRight2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andNameLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLikeBoth() throws Exception {
        EnvironmentExample.Criteria result = criteria.andNameLikeBoth("value");

    }

    @Test
    public void testAndNameLikeBoth2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andNameLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameNotLike() throws Exception {
        EnvironmentExample.Criteria result = criteria.andNameNotLike("value");

    }

    @Test
    public void testAndNameNotLike2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andNameNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameNotLikeLeft() throws Exception {
        EnvironmentExample.Criteria result = criteria.andNameNotLikeLeft("value");

    }

    @Test
    public void testAndNameNotLikeLeft2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andNameNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameNotLikeRight() throws Exception {
        EnvironmentExample.Criteria result = criteria.andNameNotLikeRight("value");

    }

    @Test
    public void testAndNameNotLikeRight2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andNameNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameNotLikeBoth() throws Exception {
        EnvironmentExample.Criteria result = criteria.andNameNotLikeBoth("value");

    }

    @Test
    public void testAndNameNotLikeBoth2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andNameNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameIn() throws Exception {
        EnvironmentExample.Criteria result = criteria.andNameIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndNameNotIn() throws Exception {
        EnvironmentExample.Criteria result = criteria.andNameNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndNameBetween() throws Exception {
        EnvironmentExample.Criteria result = criteria.andNameBetween("value1", "value2");

    }

    @Test
    public void testAndNameNotBetween() throws Exception {
        EnvironmentExample.Criteria result = criteria.andNameNotBetween("value1", "value2");

    }

    @Test
    public void testAndMemoIsNull() throws Exception {
        EnvironmentExample.Criteria result = criteria.andMemoIsNull();

    }

    @Test
    public void testAndMemoIsNotNull() throws Exception {
        EnvironmentExample.Criteria result = criteria.andMemoIsNotNull();

    }

    @Test
    public void testAndMemoEqualTo() throws Exception {
        EnvironmentExample.Criteria result = criteria.andMemoEqualTo("value");

    }

    @Test
    public void testAndMemoEqualTo2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andMemoEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoNotEqualTo() throws Exception {
        EnvironmentExample.Criteria result = criteria.andMemoNotEqualTo("value");

    }

    @Test
    public void testAndMemoNotEqualTo2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andMemoNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoGreaterThan() throws Exception {
        EnvironmentExample.Criteria result = criteria.andMemoGreaterThan("value");

    }

    @Test
    public void testAndMemoGreaterThan2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andMemoGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoGreaterThanOrEqualTo() throws Exception {
        EnvironmentExample.Criteria result = criteria.andMemoGreaterThanOrEqualTo("value");

    }

    @Test
    public void testAndMemoGreaterThanOrEqualTo2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andMemoGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoLessThan() throws Exception {
        EnvironmentExample.Criteria result = criteria.andMemoLessThan("value");

    }

    @Test
    public void testAndMemoLessThan2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andMemoLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoLessThanOrEqualTo() throws Exception {
        EnvironmentExample.Criteria result = criteria.andMemoLessThanOrEqualTo("value");

    }

    @Test
    public void testAndMemoLessThanOrEqualTo2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andMemoLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoLike() throws Exception {
        EnvironmentExample.Criteria result = criteria.andMemoLike("value");

    }

    @Test
    public void testAndMemoLike2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andMemoLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoLikeLeft() throws Exception {
        EnvironmentExample.Criteria result = criteria.andMemoLikeLeft("value");

    }

    @Test
    public void testAndMemoLikeLeft2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andMemoLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoLikeRight() throws Exception {
        EnvironmentExample.Criteria result = criteria.andMemoLikeRight("value");

    }

    @Test
    public void testAndMemoLikeRight2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andMemoLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoLikeBoth() throws Exception {
        EnvironmentExample.Criteria result = criteria.andMemoLikeBoth("value");

    }

    @Test
    public void testAndMemoLikeBoth2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andMemoLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoNotLike() throws Exception {
        EnvironmentExample.Criteria result = criteria.andMemoNotLike("value");

    }

    @Test
    public void testAndMemoNotLike2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andMemoNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoNotLikeLeft() throws Exception {
        EnvironmentExample.Criteria result = criteria.andMemoNotLikeLeft("value");

    }

    @Test
    public void testAndMemoNotLikeLeft2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andMemoNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoNotLikeRight() throws Exception {
        EnvironmentExample.Criteria result = criteria.andMemoNotLikeRight("value");

    }

    @Test
    public void testAndMemoNotLikeRight2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andMemoNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoNotLikeBoth() throws Exception {
        EnvironmentExample.Criteria result = criteria.andMemoNotLikeBoth("value");

    }

    @Test
    public void testAndMemoNotLikeBoth2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andMemoNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoIn() throws Exception {
        EnvironmentExample.Criteria result = criteria.andMemoIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndMemoNotIn() throws Exception {
        EnvironmentExample.Criteria result = criteria.andMemoNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndMemoBetween() throws Exception {
        EnvironmentExample.Criteria result = criteria.andMemoBetween("value1", "value2");

    }

    @Test
    public void testAndMemoNotBetween() throws Exception {
        EnvironmentExample.Criteria result = criteria.andMemoNotBetween("value1", "value2");

    }

    @Test
    public void testAndProductIdIsNull() throws Exception {
        EnvironmentExample.Criteria result = criteria.andProductIdIsNull();

    }

    @Test
    public void testAndProductIdIsNotNull() throws Exception {
        EnvironmentExample.Criteria result = criteria.andProductIdIsNotNull();

    }

    @Test
    public void testAndProductIdEqualTo() throws Exception {
        EnvironmentExample.Criteria result = criteria.andProductIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdEqualTo2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andProductIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdNotEqualTo() throws Exception {
        EnvironmentExample.Criteria result = criteria.andProductIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdNotEqualTo2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andProductIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdGreaterThan() throws Exception {
        EnvironmentExample.Criteria result = criteria.andProductIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdGreaterThan2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andProductIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdGreaterThanOrEqualTo() throws Exception {
        EnvironmentExample.Criteria result = criteria.andProductIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdGreaterThanOrEqualTo2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andProductIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdLessThan() throws Exception {
        EnvironmentExample.Criteria result = criteria.andProductIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdLessThan2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andProductIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdLessThanOrEqualTo() throws Exception {
        EnvironmentExample.Criteria result = criteria.andProductIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdLessThanOrEqualTo2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andProductIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdIn() throws Exception {
        EnvironmentExample.Criteria result = criteria.andProductIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndProductIdNotIn() throws Exception {
        EnvironmentExample.Criteria result = criteria.andProductIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndProductIdBetween() throws Exception {
        EnvironmentExample.Criteria result = criteria.andProductIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndProductIdNotBetween() throws Exception {
        EnvironmentExample.Criteria result = criteria.andProductIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdIsNull() throws Exception {
        EnvironmentExample.Criteria result = criteria.andProjectIdIsNull();

    }

    @Test
    public void testAndProjectIdIsNotNull() throws Exception {
        EnvironmentExample.Criteria result = criteria.andProjectIdIsNotNull();

    }

    @Test
    public void testAndProjectIdEqualTo() throws Exception {
        EnvironmentExample.Criteria result = criteria.andProjectIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdEqualTo2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andProjectIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProjectIdNotEqualTo() throws Exception {
        EnvironmentExample.Criteria result = criteria.andProjectIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdNotEqualTo2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andProjectIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProjectIdGreaterThan() throws Exception {
        EnvironmentExample.Criteria result = criteria.andProjectIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdGreaterThan2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andProjectIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProjectIdGreaterThanOrEqualTo() throws Exception {
        EnvironmentExample.Criteria result = criteria.andProjectIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdGreaterThanOrEqualTo2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andProjectIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProjectIdLessThan() throws Exception {
        EnvironmentExample.Criteria result = criteria.andProjectIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdLessThan2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andProjectIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProjectIdLessThanOrEqualTo() throws Exception {
        EnvironmentExample.Criteria result = criteria.andProjectIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdLessThanOrEqualTo2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andProjectIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProjectIdIn() throws Exception {
        EnvironmentExample.Criteria result = criteria.andProjectIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndProjectIdNotIn() throws Exception {
        EnvironmentExample.Criteria result = criteria.andProjectIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndProjectIdBetween() throws Exception {
        EnvironmentExample.Criteria result = criteria.andProjectIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdNotBetween() throws Exception {
        EnvironmentExample.Criteria result = criteria.andProjectIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndDeletedIsNull() throws Exception {
        EnvironmentExample.Criteria result = criteria.andDeletedIsNull();

    }

    @Test
    public void testAndDeletedIsNotNull() throws Exception {
        EnvironmentExample.Criteria result = criteria.andDeletedIsNotNull();

    }

    @Test
    public void testAndDeletedEqualTo() throws Exception {
        EnvironmentExample.Criteria result = criteria.andDeletedEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedEqualTo2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andDeletedEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndDeletedNotEqualTo() throws Exception {
        EnvironmentExample.Criteria result = criteria.andDeletedNotEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedNotEqualTo2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andDeletedNotEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndDeletedGreaterThan() throws Exception {
        EnvironmentExample.Criteria result = criteria.andDeletedGreaterThan(Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedGreaterThan2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andDeletedGreaterThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndDeletedGreaterThanOrEqualTo() throws Exception {
        EnvironmentExample.Criteria result = criteria.andDeletedGreaterThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedGreaterThanOrEqualTo2() throws Exception {
        EnvironmentExample.Criteria result =
                criteria.andDeletedGreaterThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndDeletedLessThan() throws Exception {
        EnvironmentExample.Criteria result = criteria.andDeletedLessThan(Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedLessThan2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andDeletedLessThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndDeletedLessThanOrEqualTo() throws Exception {
        EnvironmentExample.Criteria result = criteria.andDeletedLessThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedLessThanOrEqualTo2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andDeletedLessThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndDeletedIn() throws Exception {
        EnvironmentExample.Criteria result = criteria.andDeletedIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testAndDeletedNotIn() throws Exception {
        EnvironmentExample.Criteria result = criteria.andDeletedNotIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testAndDeletedBetween() throws Exception {
        EnvironmentExample.Criteria result = criteria.andDeletedBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedNotBetween() throws Exception {
        EnvironmentExample.Criteria result =
                criteria.andDeletedNotBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testAndUpdateTimeIsNull() throws Exception {
        EnvironmentExample.Criteria result = criteria.andUpdateTimeIsNull();

    }

    @Test
    public void testAndUpdateTimeIsNotNull() throws Exception {
        EnvironmentExample.Criteria result = criteria.andUpdateTimeIsNotNull();

    }

    @Test
    public void testAndUpdateTimeEqualTo() throws Exception {
        EnvironmentExample.Criteria result =
                criteria.andUpdateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 13).getTime());

    }

    @Test
    public void testAndUpdateTimeEqualTo2() throws Exception {
        EnvironmentExample.Criteria result =
                criteria.andUpdateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 13).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeNotEqualTo() throws Exception {
        EnvironmentExample.Criteria result =
                criteria.andUpdateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 13).getTime());

    }

    @Test
    public void testAndUpdateTimeNotEqualTo2() throws Exception {
        EnvironmentExample.Criteria result =
                criteria.andUpdateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 13).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeGreaterThan() throws Exception {
        EnvironmentExample.Criteria result =
                criteria.andUpdateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 13).getTime());

    }

    @Test
    public void testAndUpdateTimeGreaterThan2() throws Exception {
        EnvironmentExample.Criteria result =
                criteria.andUpdateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 13).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeGreaterThanOrEqualTo() throws Exception {
        EnvironmentExample.Criteria result = criteria.andUpdateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 13).getTime());

    }

    @Test
    public void testAndUpdateTimeGreaterThanOrEqualTo2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andUpdateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 13).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeLessThan() throws Exception {
        EnvironmentExample.Criteria result =
                criteria.andUpdateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 13).getTime());

    }

    @Test
    public void testAndUpdateTimeLessThan2() throws Exception {
        EnvironmentExample.Criteria result =
                criteria.andUpdateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 13).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeLessThanOrEqualTo() throws Exception {
        EnvironmentExample.Criteria result = criteria.andUpdateTimeLessThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 13).getTime());

    }

    @Test
    public void testAndUpdateTimeLessThanOrEqualTo2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andUpdateTimeLessThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 13).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeIn() throws Exception {
        EnvironmentExample.Criteria result = criteria.andUpdateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 13).getTime()));

    }

    @Test
    public void testAndUpdateTimeNotIn() throws Exception {
        EnvironmentExample.Criteria result = criteria.andUpdateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 13).getTime()));

    }

    @Test
    public void testAndUpdateTimeBetween() throws Exception {
        EnvironmentExample.Criteria result =
                criteria.andUpdateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 13).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 13).getTime());

    }

    @Test
    public void testAndUpdateTimeNotBetween() throws Exception {
        EnvironmentExample.Criteria result =
                criteria.andUpdateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 13).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 13).getTime());

    }

    @Test
    public void testAndCreateTimeIsNull() throws Exception {
        EnvironmentExample.Criteria result = criteria.andCreateTimeIsNull();

    }

    @Test
    public void testAndCreateTimeIsNotNull() throws Exception {
        EnvironmentExample.Criteria result = criteria.andCreateTimeIsNotNull();

    }

    @Test
    public void testAndCreateTimeEqualTo() throws Exception {
        EnvironmentExample.Criteria result =
                criteria.andCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 13).getTime());

    }

    @Test
    public void testAndCreateTimeEqualTo2() throws Exception {
        EnvironmentExample.Criteria result =
                criteria.andCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 13).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeNotEqualTo() throws Exception {
        EnvironmentExample.Criteria result =
                criteria.andCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 13).getTime());

    }

    @Test
    public void testAndCreateTimeNotEqualTo2() throws Exception {
        EnvironmentExample.Criteria result =
                criteria.andCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 13).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeGreaterThan() throws Exception {
        EnvironmentExample.Criteria result =
                criteria.andCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 13).getTime());

    }

    @Test
    public void testAndCreateTimeGreaterThan2() throws Exception {
        EnvironmentExample.Criteria result =
                criteria.andCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 13).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeGreaterThanOrEqualTo() throws Exception {
        EnvironmentExample.Criteria result = criteria.andCreateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 13).getTime());

    }

    @Test
    public void testAndCreateTimeGreaterThanOrEqualTo2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andCreateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 13).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeLessThan() throws Exception {
        EnvironmentExample.Criteria result =
                criteria.andCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 13).getTime());

    }

    @Test
    public void testAndCreateTimeLessThan2() throws Exception {
        EnvironmentExample.Criteria result =
                criteria.andCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 13).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeLessThanOrEqualTo() throws Exception {
        EnvironmentExample.Criteria result = criteria.andCreateTimeLessThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 13).getTime());

    }

    @Test
    public void testAndCreateTimeLessThanOrEqualTo2() throws Exception {
        EnvironmentExample.Criteria result = criteria.andCreateTimeLessThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 13).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeIn() throws Exception {
        EnvironmentExample.Criteria result = criteria.andCreateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 13).getTime()));

    }

    @Test
    public void testAndCreateTimeNotIn() throws Exception {
        EnvironmentExample.Criteria result = criteria.andCreateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 13).getTime()));

    }

    @Test
    public void testAndCreateTimeBetween() throws Exception {
        EnvironmentExample.Criteria result =
                criteria.andCreateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 13).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 13).getTime());

    }

    @Test
    public void testAndCreateTimeNotBetween() throws Exception {
        EnvironmentExample.Criteria result =
                criteria.andCreateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 13).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 13).getTime());

    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev
// .com/forum#!/testme
