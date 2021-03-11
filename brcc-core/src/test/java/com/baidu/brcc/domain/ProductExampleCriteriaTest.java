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

public class ProductExampleCriteriaTest {

    ProductExample.Criteria criteria = ProductExample.newBuilder().build().createCriteria();

    @Before
    public void setUp() {

    }

    @Test
    public void testToExample() throws Exception {
        ProductExample result = criteria.toExample();

    }

    @Test
    public void testAddCustomerCriteria() throws Exception {
        ProductExample.Criteria result = criteria.addCustomerCriteria("condition");

    }

    @Test
    public void testAddCustomerCriteria2() throws Exception {
        ProductExample.Criteria result = criteria.addCustomerCriteria("condition", Boolean.TRUE);

    }

    @Test
    public void testAddCustomerCriteria3() throws Exception {
        ProductExample.Criteria result = criteria.addCustomerCriteria("condition", "value");

    }

    @Test
    public void testAndGroupCriterion() throws Exception {
        ProductExample.CriterionGroup result = criteria.andGroupCriterion();

    }

    @Test
    public void testAndGroupCriterion2() throws Exception {
        ProductExample.CriterionGroup result = criteria.andGroupCriterion(Boolean.TRUE);

    }

    @Test
    public void testIsValid() throws Exception {
        boolean result = criteria.isValid();

    }

    @Test
    public void testAndIdIsNull() throws Exception {
        ProductExample.Criteria result = criteria.andIdIsNull();

    }

    @Test
    public void testAndIdIsNotNull() throws Exception {
        ProductExample.Criteria result = criteria.andIdIsNotNull();

    }

    @Test
    public void testAndIdEqualTo() throws Exception {
        ProductExample.Criteria result = criteria.andIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdEqualTo2() throws Exception {
        ProductExample.Criteria result = criteria.andIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdNotEqualTo() throws Exception {
        ProductExample.Criteria result = criteria.andIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdNotEqualTo2() throws Exception {
        ProductExample.Criteria result = criteria.andIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdGreaterThan() throws Exception {
        ProductExample.Criteria result = criteria.andIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testAndIdGreaterThan2() throws Exception {
        ProductExample.Criteria result = criteria.andIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdGreaterThanOrEqualTo() throws Exception {
        ProductExample.Criteria result = criteria.andIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdGreaterThanOrEqualTo2() throws Exception {
        ProductExample.Criteria result = criteria.andIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdLessThan() throws Exception {
        ProductExample.Criteria result = criteria.andIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testAndIdLessThan2() throws Exception {
        ProductExample.Criteria result = criteria.andIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdLessThanOrEqualTo() throws Exception {
        ProductExample.Criteria result = criteria.andIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdLessThanOrEqualTo2() throws Exception {
        ProductExample.Criteria result = criteria.andIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdIn() throws Exception {
        ProductExample.Criteria result = criteria.andIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndIdIn2() throws Exception {
        ProductExample.Criteria result = criteria.andIdIn(Arrays.<Long>asList(Long.valueOf(1)), Boolean.TRUE);

    }

    @Test
    public void testAndIdNotIn() throws Exception {
        ProductExample.Criteria result = criteria.andIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndIdBetween() throws Exception {
        ProductExample.Criteria result = criteria.andIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndIdNotBetween() throws Exception {
        ProductExample.Criteria result = criteria.andIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndNameIsNull() throws Exception {
        ProductExample.Criteria result = criteria.andNameIsNull();

    }

    @Test
    public void testAndNameIsNotNull() throws Exception {
        ProductExample.Criteria result = criteria.andNameIsNotNull();

    }

    @Test
    public void testAndNameEqualTo() throws Exception {
        ProductExample.Criteria result = criteria.andNameEqualTo("value");

    }

    @Test
    public void testAndNameEqualTo2() throws Exception {
        ProductExample.Criteria result = criteria.andNameEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameNotEqualTo() throws Exception {
        ProductExample.Criteria result = criteria.andNameNotEqualTo("value");

    }

    @Test
    public void testAndNameNotEqualTo2() throws Exception {
        ProductExample.Criteria result = criteria.andNameNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameGreaterThan() throws Exception {
        ProductExample.Criteria result = criteria.andNameGreaterThan("value");

    }

    @Test
    public void testAndNameGreaterThan2() throws Exception {
        ProductExample.Criteria result = criteria.andNameGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameGreaterThanOrEqualTo() throws Exception {
        ProductExample.Criteria result = criteria.andNameGreaterThanOrEqualTo("value");

    }

    @Test
    public void testAndNameGreaterThanOrEqualTo2() throws Exception {
        ProductExample.Criteria result = criteria.andNameGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLessThan() throws Exception {
        ProductExample.Criteria result = criteria.andNameLessThan("value");

    }

    @Test
    public void testAndNameLessThan2() throws Exception {
        ProductExample.Criteria result = criteria.andNameLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLessThanOrEqualTo() throws Exception {
        ProductExample.Criteria result = criteria.andNameLessThanOrEqualTo("value");

    }

    @Test
    public void testAndNameLessThanOrEqualTo2() throws Exception {
        ProductExample.Criteria result = criteria.andNameLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLike() throws Exception {
        ProductExample.Criteria result = criteria.andNameLike("value");

    }

    @Test
    public void testAndNameLike2() throws Exception {
        ProductExample.Criteria result = criteria.andNameLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLikeLeft() throws Exception {
        ProductExample.Criteria result = criteria.andNameLikeLeft("value");

    }

    @Test
    public void testAndNameLikeLeft2() throws Exception {
        ProductExample.Criteria result = criteria.andNameLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLikeRight() throws Exception {
        ProductExample.Criteria result = criteria.andNameLikeRight("value");

    }

    @Test
    public void testAndNameLikeRight2() throws Exception {
        ProductExample.Criteria result = criteria.andNameLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLikeBoth() throws Exception {
        ProductExample.Criteria result = criteria.andNameLikeBoth("value");

    }

    @Test
    public void testAndNameLikeBoth2() throws Exception {
        ProductExample.Criteria result = criteria.andNameLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameNotLike() throws Exception {
        ProductExample.Criteria result = criteria.andNameNotLike("value");

    }

    @Test
    public void testAndNameNotLike2() throws Exception {
        ProductExample.Criteria result = criteria.andNameNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameNotLikeLeft() throws Exception {
        ProductExample.Criteria result = criteria.andNameNotLikeLeft("value");

    }

    @Test
    public void testAndNameNotLikeLeft2() throws Exception {
        ProductExample.Criteria result = criteria.andNameNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameNotLikeRight() throws Exception {
        ProductExample.Criteria result = criteria.andNameNotLikeRight("value");

    }

    @Test
    public void testAndNameNotLikeRight2() throws Exception {
        ProductExample.Criteria result = criteria.andNameNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameNotLikeBoth() throws Exception {
        ProductExample.Criteria result = criteria.andNameNotLikeBoth("value");

    }

    @Test
    public void testAndNameNotLikeBoth2() throws Exception {
        ProductExample.Criteria result = criteria.andNameNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameIn() throws Exception {
        ProductExample.Criteria result = criteria.andNameIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndNameNotIn() throws Exception {
        ProductExample.Criteria result = criteria.andNameNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndNameBetween() throws Exception {
        ProductExample.Criteria result = criteria.andNameBetween("value1", "value2");

    }

    @Test
    public void testAndNameNotBetween() throws Exception {
        ProductExample.Criteria result = criteria.andNameNotBetween("value1", "value2");

    }

    @Test
    public void testAndMemoIsNull() throws Exception {
        ProductExample.Criteria result = criteria.andMemoIsNull();

    }

    @Test
    public void testAndMemoIsNotNull() throws Exception {
        ProductExample.Criteria result = criteria.andMemoIsNotNull();

    }

    @Test
    public void testAndMemoEqualTo() throws Exception {
        ProductExample.Criteria result = criteria.andMemoEqualTo("value");

    }

    @Test
    public void testAndMemoEqualTo2() throws Exception {
        ProductExample.Criteria result = criteria.andMemoEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoNotEqualTo() throws Exception {
        ProductExample.Criteria result = criteria.andMemoNotEqualTo("value");

    }

    @Test
    public void testAndMemoNotEqualTo2() throws Exception {
        ProductExample.Criteria result = criteria.andMemoNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoGreaterThan() throws Exception {
        ProductExample.Criteria result = criteria.andMemoGreaterThan("value");

    }

    @Test
    public void testAndMemoGreaterThan2() throws Exception {
        ProductExample.Criteria result = criteria.andMemoGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoGreaterThanOrEqualTo() throws Exception {
        ProductExample.Criteria result = criteria.andMemoGreaterThanOrEqualTo("value");

    }

    @Test
    public void testAndMemoGreaterThanOrEqualTo2() throws Exception {
        ProductExample.Criteria result = criteria.andMemoGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoLessThan() throws Exception {
        ProductExample.Criteria result = criteria.andMemoLessThan("value");

    }

    @Test
    public void testAndMemoLessThan2() throws Exception {
        ProductExample.Criteria result = criteria.andMemoLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoLessThanOrEqualTo() throws Exception {
        ProductExample.Criteria result = criteria.andMemoLessThanOrEqualTo("value");

    }

    @Test
    public void testAndMemoLessThanOrEqualTo2() throws Exception {
        ProductExample.Criteria result = criteria.andMemoLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoLike() throws Exception {
        ProductExample.Criteria result = criteria.andMemoLike("value");

    }

    @Test
    public void testAndMemoLike2() throws Exception {
        ProductExample.Criteria result = criteria.andMemoLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoLikeLeft() throws Exception {
        ProductExample.Criteria result = criteria.andMemoLikeLeft("value");

    }

    @Test
    public void testAndMemoLikeLeft2() throws Exception {
        ProductExample.Criteria result = criteria.andMemoLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoLikeRight() throws Exception {
        ProductExample.Criteria result = criteria.andMemoLikeRight("value");

    }

    @Test
    public void testAndMemoLikeRight2() throws Exception {
        ProductExample.Criteria result = criteria.andMemoLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoLikeBoth() throws Exception {
        ProductExample.Criteria result = criteria.andMemoLikeBoth("value");

    }

    @Test
    public void testAndMemoLikeBoth2() throws Exception {
        ProductExample.Criteria result = criteria.andMemoLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoNotLike() throws Exception {
        ProductExample.Criteria result = criteria.andMemoNotLike("value");

    }

    @Test
    public void testAndMemoNotLike2() throws Exception {
        ProductExample.Criteria result = criteria.andMemoNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoNotLikeLeft() throws Exception {
        ProductExample.Criteria result = criteria.andMemoNotLikeLeft("value");

    }

    @Test
    public void testAndMemoNotLikeLeft2() throws Exception {
        ProductExample.Criteria result = criteria.andMemoNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoNotLikeRight() throws Exception {
        ProductExample.Criteria result = criteria.andMemoNotLikeRight("value");

    }

    @Test
    public void testAndMemoNotLikeRight2() throws Exception {
        ProductExample.Criteria result = criteria.andMemoNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoNotLikeBoth() throws Exception {
        ProductExample.Criteria result = criteria.andMemoNotLikeBoth("value");

    }

    @Test
    public void testAndMemoNotLikeBoth2() throws Exception {
        ProductExample.Criteria result = criteria.andMemoNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoIn() throws Exception {
        ProductExample.Criteria result = criteria.andMemoIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndMemoNotIn() throws Exception {
        ProductExample.Criteria result = criteria.andMemoNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndMemoBetween() throws Exception {
        ProductExample.Criteria result = criteria.andMemoBetween("value1", "value2");

    }

    @Test
    public void testAndMemoNotBetween() throws Exception {
        ProductExample.Criteria result = criteria.andMemoNotBetween("value1", "value2");

    }

    @Test
    public void testAndUpdateTimeIsNull() throws Exception {
        ProductExample.Criteria result = criteria.andUpdateTimeIsNull();

    }

    @Test
    public void testAndUpdateTimeIsNotNull() throws Exception {
        ProductExample.Criteria result = criteria.andUpdateTimeIsNotNull();

    }

    @Test
    public void testAndUpdateTimeEqualTo() throws Exception {
        ProductExample.Criteria result =
                criteria.andUpdateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime());

    }

    @Test
    public void testAndUpdateTimeEqualTo2() throws Exception {
        ProductExample.Criteria result =
                criteria.andUpdateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeNotEqualTo() throws Exception {
        ProductExample.Criteria result =
                criteria.andUpdateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime());

    }

    @Test
    public void testAndUpdateTimeNotEqualTo2() throws Exception {
        ProductExample.Criteria result =
                criteria.andUpdateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeGreaterThan() throws Exception {
        ProductExample.Criteria result =
                criteria.andUpdateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime());

    }

    @Test
    public void testAndUpdateTimeGreaterThan2() throws Exception {
        ProductExample.Criteria result =
                criteria.andUpdateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeGreaterThanOrEqualTo() throws Exception {
        ProductExample.Criteria result = criteria.andUpdateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime());

    }

    @Test
    public void testAndUpdateTimeGreaterThanOrEqualTo2() throws Exception {
        ProductExample.Criteria result = criteria.andUpdateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeLessThan() throws Exception {
        ProductExample.Criteria result =
                criteria.andUpdateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime());

    }

    @Test
    public void testAndUpdateTimeLessThan2() throws Exception {
        ProductExample.Criteria result =
                criteria.andUpdateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeLessThanOrEqualTo() throws Exception {
        ProductExample.Criteria result = criteria.andUpdateTimeLessThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime());

    }

    @Test
    public void testAndUpdateTimeLessThanOrEqualTo2() throws Exception {
        ProductExample.Criteria result = criteria.andUpdateTimeLessThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeIn() throws Exception {
        ProductExample.Criteria result = criteria.andUpdateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime()));

    }

    @Test
    public void testAndUpdateTimeNotIn() throws Exception {
        ProductExample.Criteria result = criteria.andUpdateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime()));

    }

    @Test
    public void testAndUpdateTimeBetween() throws Exception {
        ProductExample.Criteria result =
                criteria.andUpdateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime());

    }

    @Test
    public void testAndUpdateTimeNotBetween() throws Exception {
        ProductExample.Criteria result =
                criteria.andUpdateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime());

    }

    @Test
    public void testAndCreateTimeIsNull() throws Exception {
        ProductExample.Criteria result = criteria.andCreateTimeIsNull();

    }

    @Test
    public void testAndCreateTimeIsNotNull() throws Exception {
        ProductExample.Criteria result = criteria.andCreateTimeIsNotNull();

    }

    @Test
    public void testAndCreateTimeEqualTo() throws Exception {
        ProductExample.Criteria result =
                criteria.andCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime());

    }

    @Test
    public void testAndCreateTimeEqualTo2() throws Exception {
        ProductExample.Criteria result =
                criteria.andCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeNotEqualTo() throws Exception {
        ProductExample.Criteria result =
                criteria.andCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime());

    }

    @Test
    public void testAndCreateTimeNotEqualTo2() throws Exception {
        ProductExample.Criteria result =
                criteria.andCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeGreaterThan() throws Exception {
        ProductExample.Criteria result =
                criteria.andCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime());

    }

    @Test
    public void testAndCreateTimeGreaterThan2() throws Exception {
        ProductExample.Criteria result =
                criteria.andCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeGreaterThanOrEqualTo() throws Exception {
        ProductExample.Criteria result = criteria.andCreateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime());

    }

    @Test
    public void testAndCreateTimeGreaterThanOrEqualTo2() throws Exception {
        ProductExample.Criteria result = criteria.andCreateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeLessThan() throws Exception {
        ProductExample.Criteria result =
                criteria.andCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime());

    }

    @Test
    public void testAndCreateTimeLessThan2() throws Exception {
        ProductExample.Criteria result =
                criteria.andCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeLessThanOrEqualTo() throws Exception {
        ProductExample.Criteria result = criteria.andCreateTimeLessThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime());

    }

    @Test
    public void testAndCreateTimeLessThanOrEqualTo2() throws Exception {
        ProductExample.Criteria result = criteria.andCreateTimeLessThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeIn() throws Exception {
        ProductExample.Criteria result = criteria.andCreateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime()));

    }

    @Test
    public void testAndCreateTimeNotIn() throws Exception {
        ProductExample.Criteria result = criteria.andCreateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime()));

    }

    @Test
    public void testAndCreateTimeBetween() throws Exception {
        ProductExample.Criteria result =
                criteria.andCreateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime());

    }

    @Test
    public void testAndCreateTimeNotBetween() throws Exception {
        ProductExample.Criteria result =
                criteria.andCreateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime());

    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev
// .com/forum#!/testme
