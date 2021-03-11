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

public class ItemTypeExampleCriterionGroupTest {

    ItemTypeExample.CriterionGroup criterionGroup = ItemTypeExample.newBuilder().build().createCriteria()
            .andGroupCriterion();

    @Before
    public void setUp() {

    }

    @Test
    public void testOr() throws Exception {
        ItemTypeExample.CriterionGroup result =
                criterionGroup.or(new ItemTypeExample.Criterion("condition", "value", "secondValue", "typeHandler"));

    }

    @Test
    public void testToCriteria() throws Exception {
        ItemTypeExample.Criteria result = criterionGroup.toCriteria();

    }

    @Test
    public void testOrIdIsNull() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orIdIsNull();

    }

    @Test
    public void testOrIdIsNotNull() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orIdIsNotNull();

    }

    @Test
    public void testOrIdEqualTo() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdEqualTo2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdNotEqualTo() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdNotEqualTo2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdGreaterThan() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testOrIdGreaterThan2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdGreaterThanOrEqualTo() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdGreaterThanOrEqualTo2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdLessThan() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testOrIdLessThan2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdLessThanOrEqualTo() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdLessThanOrEqualTo2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdIn() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrIdNotIn() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrIdBetween() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrIdNotBetween() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrNameIsNull() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orNameIsNull();

    }

    @Test
    public void testOrNameIsNotNull() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orNameIsNotNull();

    }

    @Test
    public void testOrNameEqualTo() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orNameEqualTo("value");

    }

    @Test
    public void testOrNameEqualTo2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orNameEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameNotEqualTo() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orNameNotEqualTo("value");

    }

    @Test
    public void testOrNameNotEqualTo2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orNameNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameGreaterThan() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orNameGreaterThan("value");

    }

    @Test
    public void testOrNameGreaterThan2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orNameGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameGreaterThanOrEqualTo() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orNameGreaterThanOrEqualTo("value");

    }

    @Test
    public void testOrNameGreaterThanOrEqualTo2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orNameGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameLessThan() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orNameLessThan("value");

    }

    @Test
    public void testOrNameLessThan2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orNameLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameLessThanOrEqualTo() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orNameLessThanOrEqualTo("value");

    }

    @Test
    public void testOrNameLessThanOrEqualTo2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orNameLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameLike() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orNameLike("value");

    }

    @Test
    public void testOrNameLike2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orNameLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameLikeLeft() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orNameLikeLeft("value");

    }

    @Test
    public void testOrNameLikeLeft2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orNameLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameLikeRight() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orNameLikeRight("value");

    }

    @Test
    public void testOrNameLikeRight2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orNameLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameLikeBoth() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orNameLikeBoth("value");

    }

    @Test
    public void testOrNameLikeBoth2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orNameLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameNotLike() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orNameNotLike("value");

    }

    @Test
    public void testOrNameNotLike2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orNameNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameNotLikeLeft() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orNameNotLikeLeft("value");

    }

    @Test
    public void testOrNameNotLikeLeft2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orNameNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameNotLikeRight() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orNameNotLikeRight("value");

    }

    @Test
    public void testOrNameNotLikeRight2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orNameNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameNotLikeBoth() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orNameNotLikeBoth("value");

    }

    @Test
    public void testOrNameNotLikeBoth2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orNameNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameIn() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orNameIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrNameNotIn() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orNameNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrNameBetween() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orNameBetween("value1", "value2");

    }

    @Test
    public void testOrNameNotBetween() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orNameNotBetween("value1", "value2");

    }

    @Test
    public void testOrMemoIsNull() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orMemoIsNull();

    }

    @Test
    public void testOrMemoIsNotNull() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orMemoIsNotNull();

    }

    @Test
    public void testOrMemoEqualTo() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orMemoEqualTo("value");

    }

    @Test
    public void testOrMemoEqualTo2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orMemoEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoNotEqualTo() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orMemoNotEqualTo("value");

    }

    @Test
    public void testOrMemoNotEqualTo2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orMemoNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoGreaterThan() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orMemoGreaterThan("value");

    }

    @Test
    public void testOrMemoGreaterThan2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orMemoGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoGreaterThanOrEqualTo() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orMemoGreaterThanOrEqualTo("value");

    }

    @Test
    public void testOrMemoGreaterThanOrEqualTo2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orMemoGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoLessThan() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orMemoLessThan("value");

    }

    @Test
    public void testOrMemoLessThan2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orMemoLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoLessThanOrEqualTo() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orMemoLessThanOrEqualTo("value");

    }

    @Test
    public void testOrMemoLessThanOrEqualTo2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orMemoLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoLike() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orMemoLike("value");

    }

    @Test
    public void testOrMemoLike2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orMemoLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoLikeLeft() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orMemoLikeLeft("value");

    }

    @Test
    public void testOrMemoLikeLeft2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orMemoLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoLikeRight() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orMemoLikeRight("value");

    }

    @Test
    public void testOrMemoLikeRight2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orMemoLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoLikeBoth() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orMemoLikeBoth("value");

    }

    @Test
    public void testOrMemoLikeBoth2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orMemoLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoNotLike() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orMemoNotLike("value");

    }

    @Test
    public void testOrMemoNotLike2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orMemoNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoNotLikeLeft() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orMemoNotLikeLeft("value");

    }

    @Test
    public void testOrMemoNotLikeLeft2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orMemoNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoNotLikeRight() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orMemoNotLikeRight("value");

    }

    @Test
    public void testOrMemoNotLikeRight2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orMemoNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoNotLikeBoth() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orMemoNotLikeBoth("value");

    }

    @Test
    public void testOrMemoNotLikeBoth2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orMemoNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoIn() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orMemoIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrMemoNotIn() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orMemoNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrMemoBetween() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orMemoBetween("value1", "value2");

    }

    @Test
    public void testOrMemoNotBetween() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orMemoNotBetween("value1", "value2");

    }

    @Test
    public void testOrIsEncryptIsNull() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orIsEncryptIsNull();

    }

    @Test
    public void testOrIsEncryptIsNotNull() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orIsEncryptIsNotNull();

    }

    @Test
    public void testOrIsEncryptEqualTo() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orIsEncryptEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrIsEncryptEqualTo2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orIsEncryptEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrIsEncryptNotEqualTo() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orIsEncryptNotEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrIsEncryptNotEqualTo2() throws Exception {
        ItemTypeExample.CriterionGroup result =
                criterionGroup.orIsEncryptNotEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrIsEncryptGreaterThan() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orIsEncryptGreaterThan(Byte.valueOf("00110"));

    }

    @Test
    public void testOrIsEncryptGreaterThan2() throws Exception {
        ItemTypeExample.CriterionGroup result =
                criterionGroup.orIsEncryptGreaterThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrIsEncryptGreaterThanOrEqualTo() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orIsEncryptGreaterThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrIsEncryptGreaterThanOrEqualTo2() throws Exception {
        ItemTypeExample.CriterionGroup result =
                criterionGroup.orIsEncryptGreaterThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrIsEncryptLessThan() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orIsEncryptLessThan(Byte.valueOf("00110"));

    }

    @Test
    public void testOrIsEncryptLessThan2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orIsEncryptLessThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrIsEncryptLessThanOrEqualTo() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orIsEncryptLessThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrIsEncryptLessThanOrEqualTo2() throws Exception {
        ItemTypeExample.CriterionGroup result =
                criterionGroup.orIsEncryptLessThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrIsEncryptIn() throws Exception {
        ItemTypeExample.CriterionGroup result =
                criterionGroup.orIsEncryptIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testOrIsEncryptNotIn() throws Exception {
        ItemTypeExample.CriterionGroup result =
                criterionGroup.orIsEncryptNotIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testOrIsEncryptBetween() throws Exception {
        ItemTypeExample.CriterionGroup result =
                criterionGroup.orIsEncryptBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testOrIsEncryptNotBetween() throws Exception {
        ItemTypeExample.CriterionGroup result =
                criterionGroup.orIsEncryptNotBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testOrUpdateTimeIsNull() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orUpdateTimeIsNull();

    }

    @Test
    public void testOrUpdateTimeIsNotNull() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orUpdateTimeIsNotNull();

    }

    @Test
    public void testOrUpdateTimeEqualTo() throws Exception {
        ItemTypeExample.CriterionGroup result =
                criterionGroup.orUpdateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 10).getTime());

    }

    @Test
    public void testOrUpdateTimeEqualTo2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup
                .orUpdateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 10).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeNotEqualTo() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup
                .orUpdateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 10).getTime());

    }

    @Test
    public void testOrUpdateTimeNotEqualTo2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup
                .orUpdateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 10).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeGreaterThan() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup
                .orUpdateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 10).getTime());

    }

    @Test
    public void testOrUpdateTimeGreaterThan2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup
                .orUpdateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 10).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeGreaterThanOrEqualTo() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup
                .orUpdateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 10).getTime());

    }

    @Test
    public void testOrUpdateTimeGreaterThanOrEqualTo2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup
                .orUpdateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 10).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeLessThan() throws Exception {
        ItemTypeExample.CriterionGroup result =
                criterionGroup.orUpdateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 10).getTime());

    }

    @Test
    public void testOrUpdateTimeLessThan2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup
                .orUpdateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 10).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeLessThanOrEqualTo() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup
                .orUpdateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 10).getTime());

    }

    @Test
    public void testOrUpdateTimeLessThanOrEqualTo2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup
                .orUpdateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 10).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeIn() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orUpdateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 10).getTime()));

    }

    @Test
    public void testOrUpdateTimeNotIn() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orUpdateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 10).getTime()));

    }

    @Test
    public void testOrUpdateTimeBetween() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup
                .orUpdateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 10).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 10).getTime());

    }

    @Test
    public void testOrUpdateTimeNotBetween() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup
                .orUpdateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 10).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 10).getTime());

    }

    @Test
    public void testOrCreateTimeIsNull() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orCreateTimeIsNull();

    }

    @Test
    public void testOrCreateTimeIsNotNull() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orCreateTimeIsNotNull();

    }

    @Test
    public void testOrCreateTimeEqualTo() throws Exception {
        ItemTypeExample.CriterionGroup result =
                criterionGroup.orCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 10).getTime());

    }

    @Test
    public void testOrCreateTimeEqualTo2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup
                .orCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 10).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeNotEqualTo() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup
                .orCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 10).getTime());

    }

    @Test
    public void testOrCreateTimeNotEqualTo2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup
                .orCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 10).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeGreaterThan() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 10).getTime());

    }

    @Test
    public void testOrCreateTimeGreaterThan2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 10).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeGreaterThanOrEqualTo() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 10).getTime());

    }

    @Test
    public void testOrCreateTimeGreaterThanOrEqualTo2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 10).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeLessThan() throws Exception {
        ItemTypeExample.CriterionGroup result =
                criterionGroup.orCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 10).getTime());

    }

    @Test
    public void testOrCreateTimeLessThan2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup
                .orCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 10).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeLessThanOrEqualTo() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup
                .orCreateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 10).getTime());

    }

    @Test
    public void testOrCreateTimeLessThanOrEqualTo2() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup
                .orCreateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 10).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeIn() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orCreateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 10).getTime()));

    }

    @Test
    public void testOrCreateTimeNotIn() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup.orCreateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 10).getTime()));

    }

    @Test
    public void testOrCreateTimeBetween() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup
                .orCreateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 10).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 10).getTime());

    }

    @Test
    public void testOrCreateTimeNotBetween() throws Exception {
        ItemTypeExample.CriterionGroup result = criterionGroup
                .orCreateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 10).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 10).getTime());

    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev
// .com/forum#!/testme
