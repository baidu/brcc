/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.domain;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;

public class ApiTokenExampleCriterionGroupTest {
    ApiTokenExample.CriterionGroup criterionGroup = ApiTokenExample.newBuilder().build().createCriteria()
            .andGroupCriterion();

    @Before
    public void setUp() {
    }

    @Test
    public void testOr() throws Exception {
        ApiTokenExample.CriterionGroup result =
                criterionGroup.or(new ApiTokenExample.Criterion("condition", "value", "secondValue", "typeHandler"));

    }

    @Test
    public void testToCriteria() throws Exception {
        ApiTokenExample.Criteria result = criterionGroup.toCriteria();

    }

    @Test
    public void testOrIdIsNull() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orIdIsNull();

    }

    @Test
    public void testOrIdIsNotNull() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orIdIsNotNull();

    }

    @Test
    public void testOrIdEqualTo() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdEqualTo2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdNotEqualTo() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdNotEqualTo2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdGreaterThan() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testOrIdGreaterThan2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdGreaterThanOrEqualTo() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdGreaterThanOrEqualTo2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdLessThan() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testOrIdLessThan2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdLessThanOrEqualTo() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdLessThanOrEqualTo2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdIn() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrIdNotIn() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrIdBetween() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrIdNotBetween() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrTokenIsNull() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orTokenIsNull();

    }

    @Test
    public void testOrTokenIsNotNull() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orTokenIsNotNull();

    }

    @Test
    public void testOrTokenEqualTo() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orTokenEqualTo("value");

    }

    @Test
    public void testOrTokenEqualTo2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orTokenEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrTokenNotEqualTo() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orTokenNotEqualTo("value");

    }

    @Test
    public void testOrTokenNotEqualTo2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orTokenNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrTokenGreaterThan() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orTokenGreaterThan("value");

    }

    @Test
    public void testOrTokenGreaterThan2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orTokenGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrTokenGreaterThanOrEqualTo() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orTokenGreaterThanOrEqualTo("value");

    }

    @Test
    public void testOrTokenGreaterThanOrEqualTo2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orTokenGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrTokenLessThan() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orTokenLessThan("value");

    }

    @Test
    public void testOrTokenLessThan2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orTokenLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrTokenLessThanOrEqualTo() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orTokenLessThanOrEqualTo("value");

    }

    @Test
    public void testOrTokenLessThanOrEqualTo2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orTokenLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrTokenLike() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orTokenLike("value");

    }

    @Test
    public void testOrTokenLike2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orTokenLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrTokenLikeLeft() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orTokenLikeLeft("value");

    }

    @Test
    public void testOrTokenLikeLeft2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orTokenLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrTokenLikeRight() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orTokenLikeRight("value");

    }

    @Test
    public void testOrTokenLikeRight2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orTokenLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrTokenLikeBoth() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orTokenLikeBoth("value");

    }

    @Test
    public void testOrTokenLikeBoth2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orTokenLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrTokenNotLike() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orTokenNotLike("value");

    }

    @Test
    public void testOrTokenNotLike2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orTokenNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrTokenNotLikeLeft() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orTokenNotLikeLeft("value");

    }

    @Test
    public void testOrTokenNotLikeLeft2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orTokenNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrTokenNotLikeRight() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orTokenNotLikeRight("value");

    }

    @Test
    public void testOrTokenNotLikeRight2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orTokenNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrTokenNotLikeBoth() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orTokenNotLikeBoth("value");

    }

    @Test
    public void testOrTokenNotLikeBoth2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orTokenNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrTokenIn() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orTokenIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrTokenNotIn() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orTokenNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrTokenBetween() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orTokenBetween("value1", "value2");

    }

    @Test
    public void testOrTokenNotBetween() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orTokenNotBetween("value1", "value2");

    }

    @Test
    public void testOrProjectIdIsNull() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectIdIsNull();

    }

    @Test
    public void testOrProjectIdIsNotNull() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectIdIsNotNull();

    }

    @Test
    public void testOrProjectIdEqualTo() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdEqualTo2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProjectIdNotEqualTo() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdNotEqualTo2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProjectIdGreaterThan() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdGreaterThan2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProjectIdGreaterThanOrEqualTo() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdGreaterThanOrEqualTo2() throws Exception {
        ApiTokenExample.CriterionGroup result =
                criterionGroup.orProjectIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProjectIdLessThan() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdLessThan2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProjectIdLessThanOrEqualTo() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdLessThanOrEqualTo2() throws Exception {
        ApiTokenExample.CriterionGroup result =
                criterionGroup.orProjectIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProjectIdIn() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrProjectIdNotIn() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrProjectIdBetween() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdNotBetween() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrProjectNameIsNull() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectNameIsNull();

    }

    @Test
    public void testOrProjectNameIsNotNull() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectNameIsNotNull();

    }

    @Test
    public void testOrProjectNameEqualTo() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectNameEqualTo("value");

    }

    @Test
    public void testOrProjectNameEqualTo2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectNameEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrProjectNameNotEqualTo() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectNameNotEqualTo("value");

    }

    @Test
    public void testOrProjectNameNotEqualTo2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectNameNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrProjectNameGreaterThan() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectNameGreaterThan("value");

    }

    @Test
    public void testOrProjectNameGreaterThan2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectNameGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrProjectNameGreaterThanOrEqualTo() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectNameGreaterThanOrEqualTo("value");

    }

    @Test
    public void testOrProjectNameGreaterThanOrEqualTo2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectNameGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrProjectNameLessThan() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectNameLessThan("value");

    }

    @Test
    public void testOrProjectNameLessThan2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectNameLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrProjectNameLessThanOrEqualTo() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectNameLessThanOrEqualTo("value");

    }

    @Test
    public void testOrProjectNameLessThanOrEqualTo2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectNameLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrProjectNameLike() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectNameLike("value");

    }

    @Test
    public void testOrProjectNameLike2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectNameLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrProjectNameLikeLeft() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectNameLikeLeft("value");

    }

    @Test
    public void testOrProjectNameLikeLeft2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectNameLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrProjectNameLikeRight() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectNameLikeRight("value");

    }

    @Test
    public void testOrProjectNameLikeRight2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectNameLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrProjectNameLikeBoth() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectNameLikeBoth("value");

    }

    @Test
    public void testOrProjectNameLikeBoth2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectNameLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrProjectNameNotLike() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectNameNotLike("value");

    }

    @Test
    public void testOrProjectNameNotLike2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectNameNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrProjectNameNotLikeLeft() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectNameNotLikeLeft("value");

    }

    @Test
    public void testOrProjectNameNotLikeLeft2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectNameNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrProjectNameNotLikeRight() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectNameNotLikeRight("value");

    }

    @Test
    public void testOrProjectNameNotLikeRight2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectNameNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrProjectNameNotLikeBoth() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectNameNotLikeBoth("value");

    }

    @Test
    public void testOrProjectNameNotLikeBoth2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectNameNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrProjectNameIn() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectNameIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrProjectNameNotIn() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectNameNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrProjectNameBetween() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectNameBetween("value1", "value2");

    }

    @Test
    public void testOrProjectNameNotBetween() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orProjectNameNotBetween("value1", "value2");

    }

    @Test
    public void testOrExpireNeverIsNull() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orExpireNeverIsNull();

    }

    @Test
    public void testOrExpireNeverIsNotNull() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orExpireNeverIsNotNull();

    }

    @Test
    public void testOrExpireNeverEqualTo() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orExpireNeverEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrExpireNeverEqualTo2() throws Exception {
        ApiTokenExample.CriterionGroup result =
                criterionGroup.orExpireNeverEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrExpireNeverNotEqualTo() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orExpireNeverNotEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrExpireNeverNotEqualTo2() throws Exception {
        ApiTokenExample.CriterionGroup result =
                criterionGroup.orExpireNeverNotEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrExpireNeverGreaterThan() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orExpireNeverGreaterThan(Byte.valueOf("00110"));

    }

    @Test
    public void testOrExpireNeverGreaterThan2() throws Exception {
        ApiTokenExample.CriterionGroup result =
                criterionGroup.orExpireNeverGreaterThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrExpireNeverGreaterThanOrEqualTo() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orExpireNeverGreaterThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrExpireNeverGreaterThanOrEqualTo2() throws Exception {
        ApiTokenExample.CriterionGroup result =
                criterionGroup.orExpireNeverGreaterThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrExpireNeverLessThan() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orExpireNeverLessThan(Byte.valueOf("00110"));

    }

    @Test
    public void testOrExpireNeverLessThan2() throws Exception {
        ApiTokenExample.CriterionGroup result =
                criterionGroup.orExpireNeverLessThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrExpireNeverLessThanOrEqualTo() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orExpireNeverLessThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrExpireNeverLessThanOrEqualTo2() throws Exception {
        ApiTokenExample.CriterionGroup result =
                criterionGroup.orExpireNeverLessThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrExpireNeverIn() throws Exception {
        ApiTokenExample.CriterionGroup result =
                criterionGroup.orExpireNeverIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testOrExpireNeverNotIn() throws Exception {
        ApiTokenExample.CriterionGroup result =
                criterionGroup.orExpireNeverNotIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testOrExpireNeverBetween() throws Exception {
        ApiTokenExample.CriterionGroup result =
                criterionGroup.orExpireNeverBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testOrExpireNeverNotBetween() throws Exception {
        ApiTokenExample.CriterionGroup result =
                criterionGroup.orExpireNeverNotBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testOrExpireTimeIsNull() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orExpireTimeIsNull();

    }

    @Test
    public void testOrExpireTimeIsNotNull() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orExpireTimeIsNotNull();

    }

    @Test
    public void testOrExpireTimeEqualTo() throws Exception {
        ApiTokenExample.CriterionGroup result =
                criterionGroup.orExpireTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime());

    }

    @Test
    public void testOrExpireTimeEqualTo2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup
                .orExpireTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrExpireTimeNotEqualTo() throws Exception {
        ApiTokenExample.CriterionGroup result =
                criterionGroup.orExpireTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime());

    }

    @Test
    public void testOrExpireTimeNotEqualTo2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup
                .orExpireTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrExpireTimeGreaterThan() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup
                .orExpireTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime());

    }

    @Test
    public void testOrExpireTimeGreaterThan2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup
                .orExpireTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrExpireTimeGreaterThanOrEqualTo() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup
                .orExpireTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime());

    }

    @Test
    public void testOrExpireTimeGreaterThanOrEqualTo2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup
                .orExpireTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrExpireTimeLessThan() throws Exception {
        ApiTokenExample.CriterionGroup result =
                criterionGroup.orExpireTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime());

    }

    @Test
    public void testOrExpireTimeLessThan2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup
                .orExpireTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrExpireTimeLessThanOrEqualTo() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup
                .orExpireTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime());

    }

    @Test
    public void testOrExpireTimeLessThanOrEqualTo2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup
                .orExpireTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrExpireTimeIn() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orExpireTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime()));

    }

    @Test
    public void testOrExpireTimeNotIn() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orExpireTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime()));

    }

    @Test
    public void testOrExpireTimeBetween() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup
                .orExpireTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime());

    }

    @Test
    public void testOrExpireTimeNotBetween() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup
                .orExpireTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime());

    }

    @Test
    public void testOrDeletedIsNull() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orDeletedIsNull();

    }

    @Test
    public void testOrDeletedIsNotNull() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orDeletedIsNotNull();

    }

    @Test
    public void testOrDeletedEqualTo() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orDeletedEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrDeletedEqualTo2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orDeletedEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrDeletedNotEqualTo() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orDeletedNotEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrDeletedNotEqualTo2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orDeletedNotEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrDeletedGreaterThan() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orDeletedGreaterThan(Byte.valueOf("00110"));

    }

    @Test
    public void testOrDeletedGreaterThan2() throws Exception {
        ApiTokenExample.CriterionGroup result =
                criterionGroup.orDeletedGreaterThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrDeletedGreaterThanOrEqualTo() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orDeletedGreaterThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrDeletedGreaterThanOrEqualTo2() throws Exception {
        ApiTokenExample.CriterionGroup result =
                criterionGroup.orDeletedGreaterThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrDeletedLessThan() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orDeletedLessThan(Byte.valueOf("00110"));

    }

    @Test
    public void testOrDeletedLessThan2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orDeletedLessThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrDeletedLessThanOrEqualTo() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orDeletedLessThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrDeletedLessThanOrEqualTo2() throws Exception {
        ApiTokenExample.CriterionGroup result =
                criterionGroup.orDeletedLessThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrDeletedIn() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orDeletedIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testOrDeletedNotIn() throws Exception {
        ApiTokenExample.CriterionGroup result =
                criterionGroup.orDeletedNotIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testOrDeletedBetween() throws Exception {
        ApiTokenExample.CriterionGroup result =
                criterionGroup.orDeletedBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testOrDeletedNotBetween() throws Exception {
        ApiTokenExample.CriterionGroup result =
                criterionGroup.orDeletedNotBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testOrUpdateTimeIsNull() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orUpdateTimeIsNull();

    }

    @Test
    public void testOrUpdateTimeIsNotNull() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orUpdateTimeIsNotNull();

    }

    @Test
    public void testOrUpdateTimeEqualTo() throws Exception {
        ApiTokenExample.CriterionGroup result =
                criterionGroup.orUpdateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime());

    }

    @Test
    public void testOrUpdateTimeEqualTo2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup
                .orUpdateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeNotEqualTo() throws Exception {
        ApiTokenExample.CriterionGroup result =
                criterionGroup.orUpdateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime());

    }

    @Test
    public void testOrUpdateTimeNotEqualTo2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup
                .orUpdateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeGreaterThan() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup
                .orUpdateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime());

    }

    @Test
    public void testOrUpdateTimeGreaterThan2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup
                .orUpdateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeGreaterThanOrEqualTo() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup
                .orUpdateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime());

    }

    @Test
    public void testOrUpdateTimeGreaterThanOrEqualTo2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup
                .orUpdateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeLessThan() throws Exception {
        ApiTokenExample.CriterionGroup result =
                criterionGroup.orUpdateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime());

    }

    @Test
    public void testOrUpdateTimeLessThan2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup
                .orUpdateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeLessThanOrEqualTo() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup
                .orUpdateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime());

    }

    @Test
    public void testOrUpdateTimeLessThanOrEqualTo2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup
                .orUpdateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeIn() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orUpdateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime()));

    }

    @Test
    public void testOrUpdateTimeNotIn() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orUpdateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime()));

    }

    @Test
    public void testOrUpdateTimeBetween() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup
                .orUpdateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime());

    }

    @Test
    public void testOrUpdateTimeNotBetween() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup
                .orUpdateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime());

    }

    @Test
    public void testOrCreateTimeIsNull() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orCreateTimeIsNull();

    }

    @Test
    public void testOrCreateTimeIsNotNull() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orCreateTimeIsNotNull();

    }

    @Test
    public void testOrCreateTimeEqualTo() throws Exception {
        ApiTokenExample.CriterionGroup result =
                criterionGroup.orCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime());

    }

    @Test
    public void testOrCreateTimeEqualTo2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup
                .orCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeNotEqualTo() throws Exception {
        ApiTokenExample.CriterionGroup result =
                criterionGroup.orCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime());

    }

    @Test
    public void testOrCreateTimeNotEqualTo2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup
                .orCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeGreaterThan() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime());

    }

    @Test
    public void testOrCreateTimeGreaterThan2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeGreaterThanOrEqualTo() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime());

    }

    @Test
    public void testOrCreateTimeGreaterThanOrEqualTo2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeLessThan() throws Exception {
        ApiTokenExample.CriterionGroup result =
                criterionGroup.orCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime());

    }

    @Test
    public void testOrCreateTimeLessThan2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup
                .orCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeLessThanOrEqualTo() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup
                .orCreateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime());

    }

    @Test
    public void testOrCreateTimeLessThanOrEqualTo2() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup
                .orCreateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeIn() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orCreateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime()));

    }

    @Test
    public void testOrCreateTimeNotIn() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup.orCreateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime()));

    }

    @Test
    public void testOrCreateTimeBetween() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup
                .orCreateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime());

    }

    @Test
    public void testOrCreateTimeNotBetween() throws Exception {
        ApiTokenExample.CriterionGroup result = criterionGroup
                .orCreateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 47).getTime());

    }
}
