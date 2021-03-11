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

public class ProjectUserExampleCriterionGroupTest {

    ProjectUserExample.CriterionGroup criterionGroup = ProjectUserExample.newBuilder().build().createCriteria()
            .andGroupCriterion();

    @Before
    public void setUp() {

    }

    @Test
    public void testOr() throws Exception {
        ProjectUserExample.CriterionGroup result =
                criterionGroup.or(new ProjectUserExample.Criterion("condition", "value", "secondValue", "typeHandler"));

    }

    @Test
    public void testToCriteria() throws Exception {
        ProjectUserExample.Criteria result = criterionGroup.toCriteria();

    }

    @Test
    public void testOrIdIsNull() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orIdIsNull();

    }

    @Test
    public void testOrIdIsNotNull() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orIdIsNotNull();

    }

    @Test
    public void testOrIdEqualTo() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdEqualTo2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdNotEqualTo() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdNotEqualTo2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdGreaterThan() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testOrIdGreaterThan2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdGreaterThanOrEqualTo() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdGreaterThanOrEqualTo2() throws Exception {
        ProjectUserExample.CriterionGroup result =
                criterionGroup.orIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdLessThan() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testOrIdLessThan2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdLessThanOrEqualTo() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdLessThanOrEqualTo2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdIn() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrIdNotIn() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrIdBetween() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrIdNotBetween() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrProductIdIsNull() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orProductIdIsNull();

    }

    @Test
    public void testOrProductIdIsNotNull() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orProductIdIsNotNull();

    }

    @Test
    public void testOrProductIdEqualTo() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orProductIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProductIdEqualTo2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orProductIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProductIdNotEqualTo() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orProductIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProductIdNotEqualTo2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orProductIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProductIdGreaterThan() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orProductIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testOrProductIdGreaterThan2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orProductIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProductIdGreaterThanOrEqualTo() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orProductIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProductIdGreaterThanOrEqualTo2() throws Exception {
        ProjectUserExample.CriterionGroup result =
                criterionGroup.orProductIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProductIdLessThan() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orProductIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testOrProductIdLessThan2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orProductIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProductIdLessThanOrEqualTo() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orProductIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProductIdLessThanOrEqualTo2() throws Exception {
        ProjectUserExample.CriterionGroup result =
                criterionGroup.orProductIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProductIdIn() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orProductIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrProductIdNotIn() throws Exception {
        ProjectUserExample.CriterionGroup result =
                criterionGroup.orProductIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrProductIdBetween() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orProductIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrProductIdNotBetween() throws Exception {
        ProjectUserExample.CriterionGroup result =
                criterionGroup.orProductIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdIsNull() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orProjectIdIsNull();

    }

    @Test
    public void testOrProjectIdIsNotNull() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orProjectIdIsNotNull();

    }

    @Test
    public void testOrProjectIdEqualTo() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orProjectIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdEqualTo2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orProjectIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProjectIdNotEqualTo() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orProjectIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdNotEqualTo2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orProjectIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProjectIdGreaterThan() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orProjectIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdGreaterThan2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orProjectIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProjectIdGreaterThanOrEqualTo() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orProjectIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdGreaterThanOrEqualTo2() throws Exception {
        ProjectUserExample.CriterionGroup result =
                criterionGroup.orProjectIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProjectIdLessThan() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orProjectIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdLessThan2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orProjectIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProjectIdLessThanOrEqualTo() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orProjectIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdLessThanOrEqualTo2() throws Exception {
        ProjectUserExample.CriterionGroup result =
                criterionGroup.orProjectIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProjectIdIn() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orProjectIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrProjectIdNotIn() throws Exception {
        ProjectUserExample.CriterionGroup result =
                criterionGroup.orProjectIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrProjectIdBetween() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orProjectIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdNotBetween() throws Exception {
        ProjectUserExample.CriterionGroup result =
                criterionGroup.orProjectIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrUserIdIsNull() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserIdIsNull();

    }

    @Test
    public void testOrUserIdIsNotNull() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserIdIsNotNull();

    }

    @Test
    public void testOrUserIdEqualTo() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrUserIdEqualTo2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrUserIdNotEqualTo() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrUserIdNotEqualTo2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrUserIdGreaterThan() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testOrUserIdGreaterThan2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrUserIdGreaterThanOrEqualTo() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrUserIdGreaterThanOrEqualTo2() throws Exception {
        ProjectUserExample.CriterionGroup result =
                criterionGroup.orUserIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrUserIdLessThan() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testOrUserIdLessThan2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrUserIdLessThanOrEqualTo() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrUserIdLessThanOrEqualTo2() throws Exception {
        ProjectUserExample.CriterionGroup result =
                criterionGroup.orUserIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrUserIdIn() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrUserIdNotIn() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrUserIdBetween() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrUserIdNotBetween() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrUserNameIsNull() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserNameIsNull();

    }

    @Test
    public void testOrUserNameIsNotNull() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserNameIsNotNull();

    }

    @Test
    public void testOrUserNameEqualTo() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserNameEqualTo("value");

    }

    @Test
    public void testOrUserNameEqualTo2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserNameEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrUserNameNotEqualTo() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserNameNotEqualTo("value");

    }

    @Test
    public void testOrUserNameNotEqualTo2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserNameNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrUserNameGreaterThan() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserNameGreaterThan("value");

    }

    @Test
    public void testOrUserNameGreaterThan2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserNameGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrUserNameGreaterThanOrEqualTo() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserNameGreaterThanOrEqualTo("value");

    }

    @Test
    public void testOrUserNameGreaterThanOrEqualTo2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserNameGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrUserNameLessThan() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserNameLessThan("value");

    }

    @Test
    public void testOrUserNameLessThan2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserNameLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrUserNameLessThanOrEqualTo() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserNameLessThanOrEqualTo("value");

    }

    @Test
    public void testOrUserNameLessThanOrEqualTo2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserNameLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrUserNameLike() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserNameLike("value");

    }

    @Test
    public void testOrUserNameLike2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserNameLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrUserNameLikeLeft() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserNameLikeLeft("value");

    }

    @Test
    public void testOrUserNameLikeLeft2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserNameLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrUserNameLikeRight() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserNameLikeRight("value");

    }

    @Test
    public void testOrUserNameLikeRight2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserNameLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrUserNameLikeBoth() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserNameLikeBoth("value");

    }

    @Test
    public void testOrUserNameLikeBoth2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserNameLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrUserNameNotLike() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserNameNotLike("value");

    }

    @Test
    public void testOrUserNameNotLike2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserNameNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrUserNameNotLikeLeft() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserNameNotLikeLeft("value");

    }

    @Test
    public void testOrUserNameNotLikeLeft2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserNameNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrUserNameNotLikeRight() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserNameNotLikeRight("value");

    }

    @Test
    public void testOrUserNameNotLikeRight2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserNameNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrUserNameNotLikeBoth() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserNameNotLikeBoth("value");

    }

    @Test
    public void testOrUserNameNotLikeBoth2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserNameNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrUserNameIn() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserNameIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrUserNameNotIn() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserNameNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrUserNameBetween() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserNameBetween("value1", "value2");

    }

    @Test
    public void testOrUserNameNotBetween() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUserNameNotBetween("value1", "value2");

    }

    @Test
    public void testOrIsAdminIsNull() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orIsAdminIsNull();

    }

    @Test
    public void testOrIsAdminIsNotNull() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orIsAdminIsNotNull();

    }

    @Test
    public void testOrIsAdminEqualTo() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orIsAdminEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrIsAdminEqualTo2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orIsAdminEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrIsAdminNotEqualTo() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orIsAdminNotEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrIsAdminNotEqualTo2() throws Exception {
        ProjectUserExample.CriterionGroup result =
                criterionGroup.orIsAdminNotEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrIsAdminGreaterThan() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orIsAdminGreaterThan(Byte.valueOf("00110"));

    }

    @Test
    public void testOrIsAdminGreaterThan2() throws Exception {
        ProjectUserExample.CriterionGroup result =
                criterionGroup.orIsAdminGreaterThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrIsAdminGreaterThanOrEqualTo() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orIsAdminGreaterThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrIsAdminGreaterThanOrEqualTo2() throws Exception {
        ProjectUserExample.CriterionGroup result =
                criterionGroup.orIsAdminGreaterThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrIsAdminLessThan() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orIsAdminLessThan(Byte.valueOf("00110"));

    }

    @Test
    public void testOrIsAdminLessThan2() throws Exception {
        ProjectUserExample.CriterionGroup result =
                criterionGroup.orIsAdminLessThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrIsAdminLessThanOrEqualTo() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orIsAdminLessThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrIsAdminLessThanOrEqualTo2() throws Exception {
        ProjectUserExample.CriterionGroup result =
                criterionGroup.orIsAdminLessThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrIsAdminIn() throws Exception {
        ProjectUserExample.CriterionGroup result =
                criterionGroup.orIsAdminIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testOrIsAdminNotIn() throws Exception {
        ProjectUserExample.CriterionGroup result =
                criterionGroup.orIsAdminNotIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testOrIsAdminBetween() throws Exception {
        ProjectUserExample.CriterionGroup result =
                criterionGroup.orIsAdminBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testOrIsAdminNotBetween() throws Exception {
        ProjectUserExample.CriterionGroup result =
                criterionGroup.orIsAdminNotBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testOrUpdateTimeIsNull() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUpdateTimeIsNull();

    }

    @Test
    public void testOrUpdateTimeIsNotNull() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUpdateTimeIsNotNull();

    }

    @Test
    public void testOrUpdateTimeEqualTo() throws Exception {
        ProjectUserExample.CriterionGroup result =
                criterionGroup.orUpdateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 15).getTime());

    }

    @Test
    public void testOrUpdateTimeEqualTo2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup
                .orUpdateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 15).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeNotEqualTo() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup
                .orUpdateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 15).getTime());

    }

    @Test
    public void testOrUpdateTimeNotEqualTo2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup
                .orUpdateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 15).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeGreaterThan() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup
                .orUpdateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 15).getTime());

    }

    @Test
    public void testOrUpdateTimeGreaterThan2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup
                .orUpdateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 15).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeGreaterThanOrEqualTo() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup
                .orUpdateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 15).getTime());

    }

    @Test
    public void testOrUpdateTimeGreaterThanOrEqualTo2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup
                .orUpdateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 15).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeLessThan() throws Exception {
        ProjectUserExample.CriterionGroup result =
                criterionGroup.orUpdateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 15).getTime());

    }

    @Test
    public void testOrUpdateTimeLessThan2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup
                .orUpdateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 15).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeLessThanOrEqualTo() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup
                .orUpdateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 15).getTime());

    }

    @Test
    public void testOrUpdateTimeLessThanOrEqualTo2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup
                .orUpdateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 15).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeIn() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUpdateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 15).getTime()));

    }

    @Test
    public void testOrUpdateTimeNotIn() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orUpdateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 15).getTime()));

    }

    @Test
    public void testOrUpdateTimeBetween() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup
                .orUpdateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 15).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 15).getTime());

    }

    @Test
    public void testOrUpdateTimeNotBetween() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup
                .orUpdateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 15).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 15).getTime());

    }

    @Test
    public void testOrCreateTimeIsNull() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orCreateTimeIsNull();

    }

    @Test
    public void testOrCreateTimeIsNotNull() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orCreateTimeIsNotNull();

    }

    @Test
    public void testOrCreateTimeEqualTo() throws Exception {
        ProjectUserExample.CriterionGroup result =
                criterionGroup.orCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 15).getTime());

    }

    @Test
    public void testOrCreateTimeEqualTo2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup
                .orCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 15).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeNotEqualTo() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup
                .orCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 15).getTime());

    }

    @Test
    public void testOrCreateTimeNotEqualTo2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup
                .orCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 15).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeGreaterThan() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 15).getTime());

    }

    @Test
    public void testOrCreateTimeGreaterThan2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 15).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeGreaterThanOrEqualTo() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 15).getTime());

    }

    @Test
    public void testOrCreateTimeGreaterThanOrEqualTo2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 15).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeLessThan() throws Exception {
        ProjectUserExample.CriterionGroup result =
                criterionGroup.orCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 15).getTime());

    }

    @Test
    public void testOrCreateTimeLessThan2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup
                .orCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 15).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeLessThanOrEqualTo() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup
                .orCreateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 15).getTime());

    }

    @Test
    public void testOrCreateTimeLessThanOrEqualTo2() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup
                .orCreateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 15).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeIn() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orCreateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 15).getTime()));

    }

    @Test
    public void testOrCreateTimeNotIn() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup.orCreateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 15).getTime()));

    }

    @Test
    public void testOrCreateTimeBetween() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup
                .orCreateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 15).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 15).getTime());

    }

    @Test
    public void testOrCreateTimeNotBetween() throws Exception {
        ProjectUserExample.CriterionGroup result = criterionGroup
                .orCreateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 15).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 15).getTime());

    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev
// .com/forum#!/testme
