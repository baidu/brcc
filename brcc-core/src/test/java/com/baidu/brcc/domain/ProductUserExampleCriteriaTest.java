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

public class ProductUserExampleCriteriaTest {

    ProductUserExample.Criteria criteria = ProductUserExample.newBuilder().build().createCriteria();

    @Before
    public void setUp() {

    }

    @Test
    public void testToExample() throws Exception {
        ProductUserExample result = criteria.toExample();

    }

    @Test
    public void testAddCustomerCriteria() throws Exception {
        ProductUserExample.Criteria result = criteria.addCustomerCriteria("condition");

    }

    @Test
    public void testAddCustomerCriteria2() throws Exception {
        ProductUserExample.Criteria result = criteria.addCustomerCriteria("condition", Boolean.TRUE);

    }

    @Test
    public void testAddCustomerCriteria3() throws Exception {
        ProductUserExample.Criteria result = criteria.addCustomerCriteria("condition", "value");

    }

    @Test
    public void testAndGroupCriterion() throws Exception {
        ProductUserExample.CriterionGroup result = criteria.andGroupCriterion();

    }

    @Test
    public void testAndGroupCriterion2() throws Exception {
        ProductUserExample.CriterionGroup result = criteria.andGroupCriterion(Boolean.TRUE);

    }

    @Test
    public void testIsValid() throws Exception {
        boolean result = criteria.isValid();

    }

    @Test
    public void testAndIdIsNull() throws Exception {
        ProductUserExample.Criteria result = criteria.andIdIsNull();

    }

    @Test
    public void testAndIdIsNotNull() throws Exception {
        ProductUserExample.Criteria result = criteria.andIdIsNotNull();

    }

    @Test
    public void testAndIdEqualTo() throws Exception {
        ProductUserExample.Criteria result = criteria.andIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdEqualTo2() throws Exception {
        ProductUserExample.Criteria result = criteria.andIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdNotEqualTo() throws Exception {
        ProductUserExample.Criteria result = criteria.andIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdNotEqualTo2() throws Exception {
        ProductUserExample.Criteria result = criteria.andIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdGreaterThan() throws Exception {
        ProductUserExample.Criteria result = criteria.andIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testAndIdGreaterThan2() throws Exception {
        ProductUserExample.Criteria result = criteria.andIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdGreaterThanOrEqualTo() throws Exception {
        ProductUserExample.Criteria result = criteria.andIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdGreaterThanOrEqualTo2() throws Exception {
        ProductUserExample.Criteria result = criteria.andIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdLessThan() throws Exception {
        ProductUserExample.Criteria result = criteria.andIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testAndIdLessThan2() throws Exception {
        ProductUserExample.Criteria result = criteria.andIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdLessThanOrEqualTo() throws Exception {
        ProductUserExample.Criteria result = criteria.andIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdLessThanOrEqualTo2() throws Exception {
        ProductUserExample.Criteria result = criteria.andIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdIn() throws Exception {
        ProductUserExample.Criteria result = criteria.andIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndIdNotIn() throws Exception {
        ProductUserExample.Criteria result = criteria.andIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndIdBetween() throws Exception {
        ProductUserExample.Criteria result = criteria.andIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndIdNotBetween() throws Exception {
        ProductUserExample.Criteria result = criteria.andIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndProductIdIsNull() throws Exception {
        ProductUserExample.Criteria result = criteria.andProductIdIsNull();

    }

    @Test
    public void testAndProductIdIsNotNull() throws Exception {
        ProductUserExample.Criteria result = criteria.andProductIdIsNotNull();

    }

    @Test
    public void testAndProductIdEqualTo() throws Exception {
        ProductUserExample.Criteria result = criteria.andProductIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdEqualTo2() throws Exception {
        ProductUserExample.Criteria result = criteria.andProductIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdNotEqualTo() throws Exception {
        ProductUserExample.Criteria result = criteria.andProductIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdNotEqualTo2() throws Exception {
        ProductUserExample.Criteria result = criteria.andProductIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdGreaterThan() throws Exception {
        ProductUserExample.Criteria result = criteria.andProductIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdGreaterThan2() throws Exception {
        ProductUserExample.Criteria result = criteria.andProductIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdGreaterThanOrEqualTo() throws Exception {
        ProductUserExample.Criteria result = criteria.andProductIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdGreaterThanOrEqualTo2() throws Exception {
        ProductUserExample.Criteria result = criteria.andProductIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdLessThan() throws Exception {
        ProductUserExample.Criteria result = criteria.andProductIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdLessThan2() throws Exception {
        ProductUserExample.Criteria result = criteria.andProductIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdLessThanOrEqualTo() throws Exception {
        ProductUserExample.Criteria result = criteria.andProductIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdLessThanOrEqualTo2() throws Exception {
        ProductUserExample.Criteria result = criteria.andProductIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdIn() throws Exception {
        ProductUserExample.Criteria result = criteria.andProductIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndProductIdNotIn() throws Exception {
        ProductUserExample.Criteria result = criteria.andProductIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndProductIdBetween() throws Exception {
        ProductUserExample.Criteria result = criteria.andProductIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndProductIdNotBetween() throws Exception {
        ProductUserExample.Criteria result = criteria.andProductIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndUserIdIsNull() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserIdIsNull();

    }

    @Test
    public void testAndUserIdIsNotNull() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserIdIsNotNull();

    }

    @Test
    public void testAndUserIdEqualTo() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndUserIdEqualTo2() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndUserIdNotEqualTo() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndUserIdNotEqualTo2() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndUserIdGreaterThan() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testAndUserIdGreaterThan2() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndUserIdGreaterThanOrEqualTo() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndUserIdGreaterThanOrEqualTo2() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndUserIdLessThan() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testAndUserIdLessThan2() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndUserIdLessThanOrEqualTo() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndUserIdLessThanOrEqualTo2() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndUserIdIn() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndUserIdNotIn() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndUserIdBetween() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndUserIdNotBetween() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndUserNameIsNull() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserNameIsNull();

    }

    @Test
    public void testAndUserNameIsNotNull() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserNameIsNotNull();

    }

    @Test
    public void testAndUserNameEqualTo() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserNameEqualTo("value");

    }

    @Test
    public void testAndUserNameEqualTo2() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserNameEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndUserNameNotEqualTo() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserNameNotEqualTo("value");

    }

    @Test
    public void testAndUserNameNotEqualTo2() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserNameNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndUserNameGreaterThan() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserNameGreaterThan("value");

    }

    @Test
    public void testAndUserNameGreaterThan2() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserNameGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndUserNameGreaterThanOrEqualTo() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserNameGreaterThanOrEqualTo("value");

    }

    @Test
    public void testAndUserNameGreaterThanOrEqualTo2() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserNameGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndUserNameLessThan() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserNameLessThan("value");

    }

    @Test
    public void testAndUserNameLessThan2() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserNameLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndUserNameLessThanOrEqualTo() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserNameLessThanOrEqualTo("value");

    }

    @Test
    public void testAndUserNameLessThanOrEqualTo2() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserNameLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndUserNameLike() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserNameLike("value");

    }

    @Test
    public void testAndUserNameLike2() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserNameLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndUserNameLikeLeft() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserNameLikeLeft("value");

    }

    @Test
    public void testAndUserNameLikeLeft2() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserNameLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndUserNameLikeRight() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserNameLikeRight("value");

    }

    @Test
    public void testAndUserNameLikeRight2() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserNameLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndUserNameLikeBoth() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserNameLikeBoth("value");

    }

    @Test
    public void testAndUserNameLikeBoth2() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserNameLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndUserNameNotLike() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserNameNotLike("value");

    }

    @Test
    public void testAndUserNameNotLike2() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserNameNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndUserNameNotLikeLeft() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserNameNotLikeLeft("value");

    }

    @Test
    public void testAndUserNameNotLikeLeft2() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserNameNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndUserNameNotLikeRight() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserNameNotLikeRight("value");

    }

    @Test
    public void testAndUserNameNotLikeRight2() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserNameNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndUserNameNotLikeBoth() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserNameNotLikeBoth("value");

    }

    @Test
    public void testAndUserNameNotLikeBoth2() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserNameNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndUserNameIn() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserNameIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndUserNameNotIn() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserNameNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndUserNameBetween() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserNameBetween("value1", "value2");

    }

    @Test
    public void testAndUserNameNotBetween() throws Exception {
        ProductUserExample.Criteria result = criteria.andUserNameNotBetween("value1", "value2");

    }

    @Test
    public void testAndIsAdminIsNull() throws Exception {
        ProductUserExample.Criteria result = criteria.andIsAdminIsNull();

    }

    @Test
    public void testAndIsAdminIsNotNull() throws Exception {
        ProductUserExample.Criteria result = criteria.andIsAdminIsNotNull();

    }

    @Test
    public void testAndIsAdminEqualTo() throws Exception {
        ProductUserExample.Criteria result = criteria.andIsAdminEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndIsAdminEqualTo2() throws Exception {
        ProductUserExample.Criteria result = criteria.andIsAdminEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndIsAdminNotEqualTo() throws Exception {
        ProductUserExample.Criteria result = criteria.andIsAdminNotEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndIsAdminNotEqualTo2() throws Exception {
        ProductUserExample.Criteria result = criteria.andIsAdminNotEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndIsAdminGreaterThan() throws Exception {
        ProductUserExample.Criteria result = criteria.andIsAdminGreaterThan(Byte.valueOf("00110"));

    }

    @Test
    public void testAndIsAdminGreaterThan2() throws Exception {
        ProductUserExample.Criteria result = criteria.andIsAdminGreaterThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndIsAdminGreaterThanOrEqualTo() throws Exception {
        ProductUserExample.Criteria result = criteria.andIsAdminGreaterThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndIsAdminGreaterThanOrEqualTo2() throws Exception {
        ProductUserExample.Criteria result =
                criteria.andIsAdminGreaterThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndIsAdminLessThan() throws Exception {
        ProductUserExample.Criteria result = criteria.andIsAdminLessThan(Byte.valueOf("00110"));

    }

    @Test
    public void testAndIsAdminLessThan2() throws Exception {
        ProductUserExample.Criteria result = criteria.andIsAdminLessThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndIsAdminLessThanOrEqualTo() throws Exception {
        ProductUserExample.Criteria result = criteria.andIsAdminLessThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndIsAdminLessThanOrEqualTo2() throws Exception {
        ProductUserExample.Criteria result = criteria.andIsAdminLessThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndIsAdminIn() throws Exception {
        ProductUserExample.Criteria result = criteria.andIsAdminIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testAndIsAdminNotIn() throws Exception {
        ProductUserExample.Criteria result = criteria.andIsAdminNotIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testAndIsAdminBetween() throws Exception {
        ProductUserExample.Criteria result = criteria.andIsAdminBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testAndIsAdminNotBetween() throws Exception {
        ProductUserExample.Criteria result =
                criteria.andIsAdminNotBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testAndUpdateTimeIsNull() throws Exception {
        ProductUserExample.Criteria result = criteria.andUpdateTimeIsNull();

    }

    @Test
    public void testAndUpdateTimeIsNotNull() throws Exception {
        ProductUserExample.Criteria result = criteria.andUpdateTimeIsNotNull();

    }

    @Test
    public void testAndUpdateTimeEqualTo() throws Exception {
        ProductUserExample.Criteria result =
                criteria.andUpdateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 13).getTime());

    }

    @Test
    public void testAndUpdateTimeEqualTo2() throws Exception {
        ProductUserExample.Criteria result =
                criteria.andUpdateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 13).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeNotEqualTo() throws Exception {
        ProductUserExample.Criteria result =
                criteria.andUpdateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 13).getTime());

    }

    @Test
    public void testAndUpdateTimeNotEqualTo2() throws Exception {
        ProductUserExample.Criteria result =
                criteria.andUpdateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 13).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeGreaterThan() throws Exception {
        ProductUserExample.Criteria result =
                criteria.andUpdateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 13).getTime());

    }

    @Test
    public void testAndUpdateTimeGreaterThan2() throws Exception {
        ProductUserExample.Criteria result =
                criteria.andUpdateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 13).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeGreaterThanOrEqualTo() throws Exception {
        ProductUserExample.Criteria result = criteria.andUpdateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 13).getTime());

    }

    @Test
    public void testAndUpdateTimeGreaterThanOrEqualTo2() throws Exception {
        ProductUserExample.Criteria result = criteria.andUpdateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 13).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeLessThan() throws Exception {
        ProductUserExample.Criteria result =
                criteria.andUpdateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 13).getTime());

    }

    @Test
    public void testAndUpdateTimeLessThan2() throws Exception {
        ProductUserExample.Criteria result =
                criteria.andUpdateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 13).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeLessThanOrEqualTo() throws Exception {
        ProductUserExample.Criteria result = criteria.andUpdateTimeLessThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 13).getTime());

    }

    @Test
    public void testAndUpdateTimeLessThanOrEqualTo2() throws Exception {
        ProductUserExample.Criteria result = criteria.andUpdateTimeLessThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 13).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeIn() throws Exception {
        ProductUserExample.Criteria result = criteria.andUpdateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 13).getTime()));

    }

    @Test
    public void testAndUpdateTimeNotIn() throws Exception {
        ProductUserExample.Criteria result = criteria.andUpdateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 13).getTime()));

    }

    @Test
    public void testAndUpdateTimeBetween() throws Exception {
        ProductUserExample.Criteria result =
                criteria.andUpdateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 13).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 13).getTime());

    }

    @Test
    public void testAndUpdateTimeNotBetween() throws Exception {
        ProductUserExample.Criteria result =
                criteria.andUpdateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 13).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 13).getTime());

    }

    @Test
    public void testAndCreateTimeIsNull() throws Exception {
        ProductUserExample.Criteria result = criteria.andCreateTimeIsNull();

    }

    @Test
    public void testAndCreateTimeIsNotNull() throws Exception {
        ProductUserExample.Criteria result = criteria.andCreateTimeIsNotNull();

    }

    @Test
    public void testAndCreateTimeEqualTo() throws Exception {
        ProductUserExample.Criteria result =
                criteria.andCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 13).getTime());

    }

    @Test
    public void testAndCreateTimeEqualTo2() throws Exception {
        ProductUserExample.Criteria result =
                criteria.andCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 13).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeNotEqualTo() throws Exception {
        ProductUserExample.Criteria result =
                criteria.andCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 13).getTime());

    }

    @Test
    public void testAndCreateTimeNotEqualTo2() throws Exception {
        ProductUserExample.Criteria result =
                criteria.andCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 13).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeGreaterThan() throws Exception {
        ProductUserExample.Criteria result =
                criteria.andCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 13).getTime());

    }

    @Test
    public void testAndCreateTimeGreaterThan2() throws Exception {
        ProductUserExample.Criteria result =
                criteria.andCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 13).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeGreaterThanOrEqualTo() throws Exception {
        ProductUserExample.Criteria result = criteria.andCreateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 13).getTime());

    }

    @Test
    public void testAndCreateTimeGreaterThanOrEqualTo2() throws Exception {
        ProductUserExample.Criteria result = criteria.andCreateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 13).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeLessThan() throws Exception {
        ProductUserExample.Criteria result =
                criteria.andCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 13).getTime());

    }

    @Test
    public void testAndCreateTimeLessThan2() throws Exception {
        ProductUserExample.Criteria result =
                criteria.andCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 13).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeLessThanOrEqualTo() throws Exception {
        ProductUserExample.Criteria result = criteria.andCreateTimeLessThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 13).getTime());

    }

    @Test
    public void testAndCreateTimeLessThanOrEqualTo2() throws Exception {
        ProductUserExample.Criteria result = criteria.andCreateTimeLessThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 13).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeIn() throws Exception {
        ProductUserExample.Criteria result = criteria.andCreateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 13).getTime()));

    }

    @Test
    public void testAndCreateTimeNotIn() throws Exception {
        ProductUserExample.Criteria result = criteria.andCreateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 13).getTime()));

    }

    @Test
    public void testAndCreateTimeBetween() throws Exception {
        ProductUserExample.Criteria result =
                criteria.andCreateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 13).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 13).getTime());

    }

    @Test
    public void testAndCreateTimeNotBetween() throws Exception {
        ProductUserExample.Criteria result =
                criteria.andCreateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 13).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 13).getTime());

    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev
// .com/forum#!/testme
