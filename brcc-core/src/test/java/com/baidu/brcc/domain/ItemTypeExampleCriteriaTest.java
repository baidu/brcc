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

public class ItemTypeExampleCriteriaTest {

    ItemTypeExample.Criteria criteria = ItemTypeExample.newBuilder().build().createCriteria();

    @Before
    public void setUp() {
    }

    @Test
    public void testToExample() throws Exception {
        ItemTypeExample result = criteria.toExample();

    }

    @Test
    public void testAddCustomerCriteria() throws Exception {
        ItemTypeExample.Criteria result = criteria.addCustomerCriteria("condition");

    }

    @Test
    public void testAddCustomerCriteria2() throws Exception {
        ItemTypeExample.Criteria result = criteria.addCustomerCriteria("condition", Boolean.TRUE);

    }

    @Test
    public void testAddCustomerCriteria3() throws Exception {
        ItemTypeExample.Criteria result = criteria.addCustomerCriteria("condition", "value");

    }

    @Test
    public void testAndGroupCriterion() throws Exception {
        ItemTypeExample.CriterionGroup result = criteria.andGroupCriterion();

    }

    @Test
    public void testAndGroupCriterion2() throws Exception {
        ItemTypeExample.CriterionGroup result = criteria.andGroupCriterion(Boolean.TRUE);

    }

    @Test
    public void testIsValid() throws Exception {
        boolean result = criteria.isValid();

    }

    @Test
    public void testAndIdIsNull() throws Exception {
        ItemTypeExample.Criteria result = criteria.andIdIsNull();

    }

    @Test
    public void testAndIdIsNotNull() throws Exception {
        ItemTypeExample.Criteria result = criteria.andIdIsNotNull();

    }

    @Test
    public void testAndIdEqualTo() throws Exception {
        ItemTypeExample.Criteria result = criteria.andIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdEqualTo2() throws Exception {
        ItemTypeExample.Criteria result = criteria.andIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdNotEqualTo() throws Exception {
        ItemTypeExample.Criteria result = criteria.andIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdNotEqualTo2() throws Exception {
        ItemTypeExample.Criteria result = criteria.andIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdGreaterThan() throws Exception {
        ItemTypeExample.Criteria result = criteria.andIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testAndIdGreaterThan2() throws Exception {
        ItemTypeExample.Criteria result = criteria.andIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdGreaterThanOrEqualTo() throws Exception {
        ItemTypeExample.Criteria result = criteria.andIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdGreaterThanOrEqualTo2() throws Exception {
        ItemTypeExample.Criteria result = criteria.andIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdLessThan() throws Exception {
        ItemTypeExample.Criteria result = criteria.andIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testAndIdLessThan2() throws Exception {
        ItemTypeExample.Criteria result = criteria.andIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdLessThanOrEqualTo() throws Exception {
        ItemTypeExample.Criteria result = criteria.andIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdLessThanOrEqualTo2() throws Exception {
        ItemTypeExample.Criteria result = criteria.andIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdIn() throws Exception {
        ItemTypeExample.Criteria result = criteria.andIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndIdNotIn() throws Exception {
        ItemTypeExample.Criteria result = criteria.andIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndIdBetween() throws Exception {
        ItemTypeExample.Criteria result = criteria.andIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndIdNotBetween() throws Exception {
        ItemTypeExample.Criteria result = criteria.andIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndNameIsNull() throws Exception {
        ItemTypeExample.Criteria result = criteria.andNameIsNull();

    }

    @Test
    public void testAndNameIsNotNull() throws Exception {
        ItemTypeExample.Criteria result = criteria.andNameIsNotNull();

    }

    @Test
    public void testAndNameEqualTo() throws Exception {
        ItemTypeExample.Criteria result = criteria.andNameEqualTo("value");

    }

    @Test
    public void testAndNameEqualTo2() throws Exception {
        ItemTypeExample.Criteria result = criteria.andNameEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameNotEqualTo() throws Exception {
        ItemTypeExample.Criteria result = criteria.andNameNotEqualTo("value");

    }

    @Test
    public void testAndNameNotEqualTo2() throws Exception {
        ItemTypeExample.Criteria result = criteria.andNameNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameGreaterThan() throws Exception {
        ItemTypeExample.Criteria result = criteria.andNameGreaterThan("value");

    }

    @Test
    public void testAndNameGreaterThan2() throws Exception {
        ItemTypeExample.Criteria result = criteria.andNameGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameGreaterThanOrEqualTo() throws Exception {
        ItemTypeExample.Criteria result = criteria.andNameGreaterThanOrEqualTo("value");

    }

    @Test
    public void testAndNameGreaterThanOrEqualTo2() throws Exception {
        ItemTypeExample.Criteria result = criteria.andNameGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLessThan() throws Exception {
        ItemTypeExample.Criteria result = criteria.andNameLessThan("value");

    }

    @Test
    public void testAndNameLessThan2() throws Exception {
        ItemTypeExample.Criteria result = criteria.andNameLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLessThanOrEqualTo() throws Exception {
        ItemTypeExample.Criteria result = criteria.andNameLessThanOrEqualTo("value");

    }

    @Test
    public void testAndNameLessThanOrEqualTo2() throws Exception {
        ItemTypeExample.Criteria result = criteria.andNameLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLike() throws Exception {
        ItemTypeExample.Criteria result = criteria.andNameLike("value");

    }

    @Test
    public void testAndNameLike2() throws Exception {
        ItemTypeExample.Criteria result = criteria.andNameLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLikeLeft() throws Exception {
        ItemTypeExample.Criteria result = criteria.andNameLikeLeft("value");

    }

    @Test
    public void testAndNameLikeLeft2() throws Exception {
        ItemTypeExample.Criteria result = criteria.andNameLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLikeRight() throws Exception {
        ItemTypeExample.Criteria result = criteria.andNameLikeRight("value");

    }

    @Test
    public void testAndNameLikeRight2() throws Exception {
        ItemTypeExample.Criteria result = criteria.andNameLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLikeBoth() throws Exception {
        ItemTypeExample.Criteria result = criteria.andNameLikeBoth("value");

    }

    @Test
    public void testAndNameLikeBoth2() throws Exception {
        ItemTypeExample.Criteria result = criteria.andNameLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameNotLike() throws Exception {
        ItemTypeExample.Criteria result = criteria.andNameNotLike("value");

    }

    @Test
    public void testAndNameNotLike2() throws Exception {
        ItemTypeExample.Criteria result = criteria.andNameNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameNotLikeLeft() throws Exception {
        ItemTypeExample.Criteria result = criteria.andNameNotLikeLeft("value");

    }

    @Test
    public void testAndNameNotLikeLeft2() throws Exception {
        ItemTypeExample.Criteria result = criteria.andNameNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameNotLikeRight() throws Exception {
        ItemTypeExample.Criteria result = criteria.andNameNotLikeRight("value");

    }

    @Test
    public void testAndNameNotLikeRight2() throws Exception {
        ItemTypeExample.Criteria result = criteria.andNameNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameNotLikeBoth() throws Exception {
        ItemTypeExample.Criteria result = criteria.andNameNotLikeBoth("value");

    }

    @Test
    public void testAndNameNotLikeBoth2() throws Exception {
        ItemTypeExample.Criteria result = criteria.andNameNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameIn() throws Exception {
        ItemTypeExample.Criteria result = criteria.andNameIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndNameNotIn() throws Exception {
        ItemTypeExample.Criteria result = criteria.andNameNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndNameBetween() throws Exception {
        ItemTypeExample.Criteria result = criteria.andNameBetween("value1", "value2");

    }

    @Test
    public void testAndNameNotBetween() throws Exception {
        ItemTypeExample.Criteria result = criteria.andNameNotBetween("value1", "value2");

    }

    @Test
    public void testAndMemoIsNull() throws Exception {
        ItemTypeExample.Criteria result = criteria.andMemoIsNull();

    }

    @Test
    public void testAndMemoIsNotNull() throws Exception {
        ItemTypeExample.Criteria result = criteria.andMemoIsNotNull();

    }

    @Test
    public void testAndMemoEqualTo() throws Exception {
        ItemTypeExample.Criteria result = criteria.andMemoEqualTo("value");

    }

    @Test
    public void testAndMemoEqualTo2() throws Exception {
        ItemTypeExample.Criteria result = criteria.andMemoEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoNotEqualTo() throws Exception {
        ItemTypeExample.Criteria result = criteria.andMemoNotEqualTo("value");

    }

    @Test
    public void testAndMemoNotEqualTo2() throws Exception {
        ItemTypeExample.Criteria result = criteria.andMemoNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoGreaterThan() throws Exception {
        ItemTypeExample.Criteria result = criteria.andMemoGreaterThan("value");

    }

    @Test
    public void testAndMemoGreaterThan2() throws Exception {
        ItemTypeExample.Criteria result = criteria.andMemoGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoGreaterThanOrEqualTo() throws Exception {
        ItemTypeExample.Criteria result = criteria.andMemoGreaterThanOrEqualTo("value");

    }

    @Test
    public void testAndMemoGreaterThanOrEqualTo2() throws Exception {
        ItemTypeExample.Criteria result = criteria.andMemoGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoLessThan() throws Exception {
        ItemTypeExample.Criteria result = criteria.andMemoLessThan("value");

    }

    @Test
    public void testAndMemoLessThan2() throws Exception {
        ItemTypeExample.Criteria result = criteria.andMemoLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoLessThanOrEqualTo() throws Exception {
        ItemTypeExample.Criteria result = criteria.andMemoLessThanOrEqualTo("value");

    }

    @Test
    public void testAndMemoLessThanOrEqualTo2() throws Exception {
        ItemTypeExample.Criteria result = criteria.andMemoLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoLike() throws Exception {
        ItemTypeExample.Criteria result = criteria.andMemoLike("value");

    }

    @Test
    public void testAndMemoLike2() throws Exception {
        ItemTypeExample.Criteria result = criteria.andMemoLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoLikeLeft() throws Exception {
        ItemTypeExample.Criteria result = criteria.andMemoLikeLeft("value");

    }

    @Test
    public void testAndMemoLikeLeft2() throws Exception {
        ItemTypeExample.Criteria result = criteria.andMemoLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoLikeRight() throws Exception {
        ItemTypeExample.Criteria result = criteria.andMemoLikeRight("value");

    }

    @Test
    public void testAndMemoLikeRight2() throws Exception {
        ItemTypeExample.Criteria result = criteria.andMemoLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoLikeBoth() throws Exception {
        ItemTypeExample.Criteria result = criteria.andMemoLikeBoth("value");

    }

    @Test
    public void testAndMemoLikeBoth2() throws Exception {
        ItemTypeExample.Criteria result = criteria.andMemoLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoNotLike() throws Exception {
        ItemTypeExample.Criteria result = criteria.andMemoNotLike("value");

    }

    @Test
    public void testAndMemoNotLike2() throws Exception {
        ItemTypeExample.Criteria result = criteria.andMemoNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoNotLikeLeft() throws Exception {
        ItemTypeExample.Criteria result = criteria.andMemoNotLikeLeft("value");

    }

    @Test
    public void testAndMemoNotLikeLeft2() throws Exception {
        ItemTypeExample.Criteria result = criteria.andMemoNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoNotLikeRight() throws Exception {
        ItemTypeExample.Criteria result = criteria.andMemoNotLikeRight("value");

    }

    @Test
    public void testAndMemoNotLikeRight2() throws Exception {
        ItemTypeExample.Criteria result = criteria.andMemoNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoNotLikeBoth() throws Exception {
        ItemTypeExample.Criteria result = criteria.andMemoNotLikeBoth("value");

    }

    @Test
    public void testAndMemoNotLikeBoth2() throws Exception {
        ItemTypeExample.Criteria result = criteria.andMemoNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoIn() throws Exception {
        ItemTypeExample.Criteria result = criteria.andMemoIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndMemoNotIn() throws Exception {
        ItemTypeExample.Criteria result = criteria.andMemoNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndMemoBetween() throws Exception {
        ItemTypeExample.Criteria result = criteria.andMemoBetween("value1", "value2");

    }

    @Test
    public void testAndMemoNotBetween() throws Exception {
        ItemTypeExample.Criteria result = criteria.andMemoNotBetween("value1", "value2");

    }

    @Test
    public void testAndIsEncryptIsNull() throws Exception {
        ItemTypeExample.Criteria result = criteria.andIsEncryptIsNull();

    }

    @Test
    public void testAndIsEncryptIsNotNull() throws Exception {
        ItemTypeExample.Criteria result = criteria.andIsEncryptIsNotNull();

    }

    @Test
    public void testAndIsEncryptEqualTo() throws Exception {
        ItemTypeExample.Criteria result = criteria.andIsEncryptEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndIsEncryptEqualTo2() throws Exception {
        ItemTypeExample.Criteria result = criteria.andIsEncryptEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndIsEncryptNotEqualTo() throws Exception {
        ItemTypeExample.Criteria result = criteria.andIsEncryptNotEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndIsEncryptNotEqualTo2() throws Exception {
        ItemTypeExample.Criteria result = criteria.andIsEncryptNotEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndIsEncryptGreaterThan() throws Exception {
        ItemTypeExample.Criteria result = criteria.andIsEncryptGreaterThan(Byte.valueOf("00110"));

    }

    @Test
    public void testAndIsEncryptGreaterThan2() throws Exception {
        ItemTypeExample.Criteria result = criteria.andIsEncryptGreaterThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndIsEncryptGreaterThanOrEqualTo() throws Exception {
        ItemTypeExample.Criteria result = criteria.andIsEncryptGreaterThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndIsEncryptGreaterThanOrEqualTo2() throws Exception {
        ItemTypeExample.Criteria result =
                criteria.andIsEncryptGreaterThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndIsEncryptLessThan() throws Exception {
        ItemTypeExample.Criteria result = criteria.andIsEncryptLessThan(Byte.valueOf("00110"));

    }

    @Test
    public void testAndIsEncryptLessThan2() throws Exception {
        ItemTypeExample.Criteria result = criteria.andIsEncryptLessThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndIsEncryptLessThanOrEqualTo() throws Exception {
        ItemTypeExample.Criteria result = criteria.andIsEncryptLessThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndIsEncryptLessThanOrEqualTo2() throws Exception {
        ItemTypeExample.Criteria result = criteria.andIsEncryptLessThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndIsEncryptIn() throws Exception {
        ItemTypeExample.Criteria result = criteria.andIsEncryptIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testAndIsEncryptNotIn() throws Exception {
        ItemTypeExample.Criteria result = criteria.andIsEncryptNotIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testAndIsEncryptBetween() throws Exception {
        ItemTypeExample.Criteria result = criteria.andIsEncryptBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testAndIsEncryptNotBetween() throws Exception {
        ItemTypeExample.Criteria result = criteria.andIsEncryptNotBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testAndUpdateTimeIsNull() throws Exception {
        ItemTypeExample.Criteria result = criteria.andUpdateTimeIsNull();

    }

    @Test
    public void testAndUpdateTimeIsNotNull() throws Exception {
        ItemTypeExample.Criteria result = criteria.andUpdateTimeIsNotNull();

    }

    @Test
    public void testAndUpdateTimeEqualTo() throws Exception {
        ItemTypeExample.Criteria result =
                criteria.andUpdateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 9).getTime());

    }

    @Test
    public void testAndUpdateTimeEqualTo2() throws Exception {
        ItemTypeExample.Criteria result =
                criteria.andUpdateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 9).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeNotEqualTo() throws Exception {
        ItemTypeExample.Criteria result =
                criteria.andUpdateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 9).getTime());

    }

    @Test
    public void testAndUpdateTimeNotEqualTo2() throws Exception {
        ItemTypeExample.Criteria result =
                criteria.andUpdateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 9).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeGreaterThan() throws Exception {
        ItemTypeExample.Criteria result =
                criteria.andUpdateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 9).getTime());

    }

    @Test
    public void testAndUpdateTimeGreaterThan2() throws Exception {
        ItemTypeExample.Criteria result =
                criteria.andUpdateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 9).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeGreaterThanOrEqualTo() throws Exception {
        ItemTypeExample.Criteria result = criteria.andUpdateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 9).getTime());

    }

    @Test
    public void testAndUpdateTimeGreaterThanOrEqualTo2() throws Exception {
        ItemTypeExample.Criteria result = criteria.andUpdateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 9).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeLessThan() throws Exception {
        ItemTypeExample.Criteria result =
                criteria.andUpdateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 9).getTime());

    }

    @Test
    public void testAndUpdateTimeLessThan2() throws Exception {
        ItemTypeExample.Criteria result =
                criteria.andUpdateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 9).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeLessThanOrEqualTo() throws Exception {
        ItemTypeExample.Criteria result = criteria.andUpdateTimeLessThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 9).getTime());

    }

    @Test
    public void testAndUpdateTimeLessThanOrEqualTo2() throws Exception {
        ItemTypeExample.Criteria result = criteria.andUpdateTimeLessThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 9).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeIn() throws Exception {
        ItemTypeExample.Criteria result = criteria.andUpdateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 9).getTime()));

    }

    @Test
    public void testAndUpdateTimeNotIn() throws Exception {
        ItemTypeExample.Criteria result = criteria.andUpdateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 9).getTime()));

    }

    @Test
    public void testAndUpdateTimeBetween() throws Exception {
        ItemTypeExample.Criteria result =
                criteria.andUpdateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 9).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 9).getTime());

    }

    @Test
    public void testAndUpdateTimeNotBetween() throws Exception {
        ItemTypeExample.Criteria result =
                criteria.andUpdateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 9).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 9).getTime());

    }

    @Test
    public void testAndCreateTimeIsNull() throws Exception {
        ItemTypeExample.Criteria result = criteria.andCreateTimeIsNull();

    }

    @Test
    public void testAndCreateTimeIsNotNull() throws Exception {
        ItemTypeExample.Criteria result = criteria.andCreateTimeIsNotNull();

    }

    @Test
    public void testAndCreateTimeEqualTo() throws Exception {
        ItemTypeExample.Criteria result =
                criteria.andCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 9).getTime());

    }

    @Test
    public void testAndCreateTimeEqualTo2() throws Exception {
        ItemTypeExample.Criteria result =
                criteria.andCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 9).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeNotEqualTo() throws Exception {
        ItemTypeExample.Criteria result =
                criteria.andCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 9).getTime());

    }

    @Test
    public void testAndCreateTimeNotEqualTo2() throws Exception {
        ItemTypeExample.Criteria result =
                criteria.andCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 9).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeGreaterThan() throws Exception {
        ItemTypeExample.Criteria result =
                criteria.andCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 9).getTime());

    }

    @Test
    public void testAndCreateTimeGreaterThan2() throws Exception {
        ItemTypeExample.Criteria result =
                criteria.andCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 9).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeGreaterThanOrEqualTo() throws Exception {
        ItemTypeExample.Criteria result = criteria.andCreateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 9).getTime());

    }

    @Test
    public void testAndCreateTimeGreaterThanOrEqualTo2() throws Exception {
        ItemTypeExample.Criteria result = criteria.andCreateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 9).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeLessThan() throws Exception {
        ItemTypeExample.Criteria result =
                criteria.andCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 9).getTime());

    }

    @Test
    public void testAndCreateTimeLessThan2() throws Exception {
        ItemTypeExample.Criteria result =
                criteria.andCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 9).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeLessThanOrEqualTo() throws Exception {
        ItemTypeExample.Criteria result = criteria.andCreateTimeLessThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 9).getTime());

    }

    @Test
    public void testAndCreateTimeLessThanOrEqualTo2() throws Exception {
        ItemTypeExample.Criteria result = criteria.andCreateTimeLessThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 9).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeIn() throws Exception {
        ItemTypeExample.Criteria result = criteria.andCreateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 9).getTime()));

    }

    @Test
    public void testAndCreateTimeNotIn() throws Exception {
        ItemTypeExample.Criteria result = criteria.andCreateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 9).getTime()));

    }

    @Test
    public void testAndCreateTimeBetween() throws Exception {
        ItemTypeExample.Criteria result =
                criteria.andCreateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 9).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 9).getTime());

    }

    @Test
    public void testAndCreateTimeNotBetween() throws Exception {
        ItemTypeExample.Criteria result =
                criteria.andCreateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 9).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 9).getTime());

    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev
// .com/forum#!/testme
