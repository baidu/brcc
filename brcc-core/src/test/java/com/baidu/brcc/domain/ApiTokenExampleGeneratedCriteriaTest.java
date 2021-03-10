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

public class ApiTokenExampleGeneratedCriteriaTest {

    ApiTokenExample.GeneratedCriteria generatedCriteria = ApiTokenExample.newBuilder().build().createCriteria();
    @Before
    public void setUp() {
    }

    @Test
    public void testIsValid() throws Exception {
        boolean result = generatedCriteria.isValid();

    }

    @Test
    public void testAddCriterion() throws Exception {
        generatedCriteria.addCriterion("condition");
    }

    @Test
    public void testAddCriterion2() throws Exception {
        generatedCriteria.addCriterion("condition", "value", "property");
    }

    @Test
    public void testAddCriterion3() throws Exception {
        generatedCriteria.addCriterion("condition", "value1", "value2", "property");
    }

    @Test
    public void testAndIdIsNull() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andIdIsNull();

    }

    @Test
    public void testAndIdIsNotNull() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andIdIsNotNull();

    }

    @Test
    public void testAndIdEqualTo() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdEqualTo2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdNotEqualTo() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdNotEqualTo2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdGreaterThan() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testAndIdGreaterThan2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdGreaterThanOrEqualTo() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdGreaterThanOrEqualTo2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdLessThan() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testAndIdLessThan2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdLessThanOrEqualTo() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdLessThanOrEqualTo2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdIn() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndIdNotIn() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndIdBetween() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndIdNotBetween() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndTokenIsNull() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andTokenIsNull();

    }

    @Test
    public void testAndTokenIsNotNull() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andTokenIsNotNull();

    }

    @Test
    public void testAndTokenEqualTo() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andTokenEqualTo("value");

    }

    @Test
    public void testAndTokenEqualTo2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andTokenEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndTokenNotEqualTo() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andTokenNotEqualTo("value");

    }

    @Test
    public void testAndTokenNotEqualTo2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andTokenNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndTokenGreaterThan() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andTokenGreaterThan("value");

    }

    @Test
    public void testAndTokenGreaterThan2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andTokenGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndTokenGreaterThanOrEqualTo() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andTokenGreaterThanOrEqualTo("value");

    }

    @Test
    public void testAndTokenGreaterThanOrEqualTo2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andTokenGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndTokenLessThan() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andTokenLessThan("value");

    }

    @Test
    public void testAndTokenLessThan2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andTokenLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndTokenLessThanOrEqualTo() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andTokenLessThanOrEqualTo("value");

    }

    @Test
    public void testAndTokenLessThanOrEqualTo2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andTokenLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndTokenLike() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andTokenLike("value");

    }

    @Test
    public void testAndTokenLike2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andTokenLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndTokenLikeLeft() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andTokenLikeLeft("value");

    }

    @Test
    public void testAndTokenLikeLeft2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andTokenLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndTokenLikeRight() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andTokenLikeRight("value");

    }

    @Test
    public void testAndTokenLikeRight2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andTokenLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndTokenLikeBoth() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andTokenLikeBoth("value");

    }

    @Test
    public void testAndTokenLikeBoth2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andTokenLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndTokenNotLike() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andTokenNotLike("value");

    }

    @Test
    public void testAndTokenNotLike2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andTokenNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndTokenNotLikeLeft() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andTokenNotLikeLeft("value");

    }

    @Test
    public void testAndTokenNotLikeLeft2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andTokenNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndTokenNotLikeRight() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andTokenNotLikeRight("value");

    }

    @Test
    public void testAndTokenNotLikeRight2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andTokenNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndTokenNotLikeBoth() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andTokenNotLikeBoth("value");

    }

    @Test
    public void testAndTokenNotLikeBoth2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andTokenNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndTokenIn() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andTokenIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndTokenNotIn() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andTokenNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndTokenBetween() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andTokenBetween("value1", "value2");

    }

    @Test
    public void testAndTokenNotBetween() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andTokenNotBetween("value1", "value2");

    }

    @Test
    public void testAndProjectIdIsNull() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectIdIsNull();

    }

    @Test
    public void testAndProjectIdIsNotNull() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectIdIsNotNull();

    }

    @Test
    public void testAndProjectIdEqualTo() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdEqualTo2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProjectIdNotEqualTo() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdNotEqualTo2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProjectIdGreaterThan() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdGreaterThan2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProjectIdGreaterThanOrEqualTo() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdGreaterThanOrEqualTo2() throws Exception {
        ApiTokenExample.Criteria result =
                generatedCriteria.andProjectIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProjectIdLessThan() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdLessThan2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProjectIdLessThanOrEqualTo() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdLessThanOrEqualTo2() throws Exception {
        ApiTokenExample.Criteria result =
                generatedCriteria.andProjectIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProjectIdIn() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndProjectIdNotIn() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndProjectIdBetween() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdNotBetween() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndProjectNameIsNull() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectNameIsNull();

    }

    @Test
    public void testAndProjectNameIsNotNull() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectNameIsNotNull();

    }

    @Test
    public void testAndProjectNameEqualTo() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectNameEqualTo("value");

    }

    @Test
    public void testAndProjectNameEqualTo2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectNameEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndProjectNameNotEqualTo() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectNameNotEqualTo("value");

    }

    @Test
    public void testAndProjectNameNotEqualTo2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectNameNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndProjectNameGreaterThan() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectNameGreaterThan("value");

    }

    @Test
    public void testAndProjectNameGreaterThan2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectNameGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndProjectNameGreaterThanOrEqualTo() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectNameGreaterThanOrEqualTo("value");

    }

    @Test
    public void testAndProjectNameGreaterThanOrEqualTo2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectNameGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndProjectNameLessThan() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectNameLessThan("value");

    }

    @Test
    public void testAndProjectNameLessThan2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectNameLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndProjectNameLessThanOrEqualTo() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectNameLessThanOrEqualTo("value");

    }

    @Test
    public void testAndProjectNameLessThanOrEqualTo2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectNameLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndProjectNameLike() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectNameLike("value");

    }

    @Test
    public void testAndProjectNameLike2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectNameLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndProjectNameLikeLeft() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectNameLikeLeft("value");

    }

    @Test
    public void testAndProjectNameLikeLeft2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectNameLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndProjectNameLikeRight() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectNameLikeRight("value");

    }

    @Test
    public void testAndProjectNameLikeRight2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectNameLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndProjectNameLikeBoth() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectNameLikeBoth("value");

    }

    @Test
    public void testAndProjectNameLikeBoth2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectNameLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndProjectNameNotLike() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectNameNotLike("value");

    }

    @Test
    public void testAndProjectNameNotLike2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectNameNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndProjectNameNotLikeLeft() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectNameNotLikeLeft("value");

    }

    @Test
    public void testAndProjectNameNotLikeLeft2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectNameNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndProjectNameNotLikeRight() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectNameNotLikeRight("value");

    }

    @Test
    public void testAndProjectNameNotLikeRight2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectNameNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndProjectNameNotLikeBoth() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectNameNotLikeBoth("value");

    }

    @Test
    public void testAndProjectNameNotLikeBoth2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectNameNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndProjectNameIn() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectNameIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndProjectNameNotIn() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectNameNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndProjectNameBetween() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectNameBetween("value1", "value2");

    }

    @Test
    public void testAndProjectNameNotBetween() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andProjectNameNotBetween("value1", "value2");

    }

    @Test
    public void testAndExpireNeverIsNull() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andExpireNeverIsNull();

    }

    @Test
    public void testAndExpireNeverIsNotNull() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andExpireNeverIsNotNull();

    }

    @Test
    public void testAndExpireNeverEqualTo() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andExpireNeverEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndExpireNeverEqualTo2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andExpireNeverEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndExpireNeverNotEqualTo() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andExpireNeverNotEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndExpireNeverNotEqualTo2() throws Exception {
        ApiTokenExample.Criteria result =
                generatedCriteria.andExpireNeverNotEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndExpireNeverGreaterThan() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andExpireNeverGreaterThan(Byte.valueOf("00110"));

    }

    @Test
    public void testAndExpireNeverGreaterThan2() throws Exception {
        ApiTokenExample.Criteria result =
                generatedCriteria.andExpireNeverGreaterThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndExpireNeverGreaterThanOrEqualTo() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andExpireNeverGreaterThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndExpireNeverGreaterThanOrEqualTo2() throws Exception {
        ApiTokenExample.Criteria result =
                generatedCriteria.andExpireNeverGreaterThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndExpireNeverLessThan() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andExpireNeverLessThan(Byte.valueOf("00110"));

    }

    @Test
    public void testAndExpireNeverLessThan2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andExpireNeverLessThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndExpireNeverLessThanOrEqualTo() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andExpireNeverLessThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndExpireNeverLessThanOrEqualTo2() throws Exception {
        ApiTokenExample.Criteria result =
                generatedCriteria.andExpireNeverLessThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndExpireNeverIn() throws Exception {
        ApiTokenExample.Criteria result =
                generatedCriteria.andExpireNeverIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testAndExpireNeverNotIn() throws Exception {
        ApiTokenExample.Criteria result =
                generatedCriteria.andExpireNeverNotIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testAndExpireNeverBetween() throws Exception {
        ApiTokenExample.Criteria result =
                generatedCriteria.andExpireNeverBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testAndExpireNeverNotBetween() throws Exception {
        ApiTokenExample.Criteria result =
                generatedCriteria.andExpireNeverNotBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testAndExpireTimeIsNull() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andExpireTimeIsNull();

    }

    @Test
    public void testAndExpireTimeIsNotNull() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andExpireTimeIsNotNull();

    }

    @Test
    public void testAndExpireTimeEqualTo() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria
                .andExpireTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime());

    }

    @Test
    public void testAndExpireTimeEqualTo2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria
                .andExpireTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndExpireTimeNotEqualTo() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria
                .andExpireTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime());

    }

    @Test
    public void testAndExpireTimeNotEqualTo2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria
                .andExpireTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndExpireTimeGreaterThan() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria
                .andExpireTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime());

    }

    @Test
    public void testAndExpireTimeGreaterThan2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria
                .andExpireTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndExpireTimeGreaterThanOrEqualTo() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria
                .andExpireTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime());

    }

    @Test
    public void testAndExpireTimeGreaterThanOrEqualTo2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria
                .andExpireTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndExpireTimeLessThan() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria
                .andExpireTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime());

    }

    @Test
    public void testAndExpireTimeLessThan2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria
                .andExpireTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndExpireTimeLessThanOrEqualTo() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria
                .andExpireTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime());

    }

    @Test
    public void testAndExpireTimeLessThanOrEqualTo2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria
                .andExpireTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndExpireTimeIn() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andExpireTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime()));

    }

    @Test
    public void testAndExpireTimeNotIn() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andExpireTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime()));

    }

    @Test
    public void testAndExpireTimeBetween() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria
                .andExpireTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime());

    }

    @Test
    public void testAndExpireTimeNotBetween() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria
                .andExpireTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime());

    }

    @Test
    public void testAndDeletedIsNull() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andDeletedIsNull();

    }

    @Test
    public void testAndDeletedIsNotNull() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andDeletedIsNotNull();

    }

    @Test
    public void testAndDeletedEqualTo() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andDeletedEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedEqualTo2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andDeletedEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndDeletedNotEqualTo() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andDeletedNotEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedNotEqualTo2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andDeletedNotEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndDeletedGreaterThan() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andDeletedGreaterThan(Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedGreaterThan2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andDeletedGreaterThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndDeletedGreaterThanOrEqualTo() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andDeletedGreaterThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedGreaterThanOrEqualTo2() throws Exception {
        ApiTokenExample.Criteria result =
                generatedCriteria.andDeletedGreaterThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndDeletedLessThan() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andDeletedLessThan(Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedLessThan2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andDeletedLessThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndDeletedLessThanOrEqualTo() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andDeletedLessThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedLessThanOrEqualTo2() throws Exception {
        ApiTokenExample.Criteria result =
                generatedCriteria.andDeletedLessThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndDeletedIn() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andDeletedIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testAndDeletedNotIn() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andDeletedNotIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testAndDeletedBetween() throws Exception {
        ApiTokenExample.Criteria result =
                generatedCriteria.andDeletedBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedNotBetween() throws Exception {
        ApiTokenExample.Criteria result =
                generatedCriteria.andDeletedNotBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testAndUpdateTimeIsNull() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andUpdateTimeIsNull();

    }

    @Test
    public void testAndUpdateTimeIsNotNull() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andUpdateTimeIsNotNull();

    }

    @Test
    public void testAndUpdateTimeEqualTo() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria
                .andUpdateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime());

    }

    @Test
    public void testAndUpdateTimeEqualTo2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria
                .andUpdateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeNotEqualTo() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria
                .andUpdateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime());

    }

    @Test
    public void testAndUpdateTimeNotEqualTo2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria
                .andUpdateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeGreaterThan() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria
                .andUpdateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime());

    }

    @Test
    public void testAndUpdateTimeGreaterThan2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria
                .andUpdateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeGreaterThanOrEqualTo() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria
                .andUpdateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime());

    }

    @Test
    public void testAndUpdateTimeGreaterThanOrEqualTo2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria
                .andUpdateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeLessThan() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria
                .andUpdateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime());

    }

    @Test
    public void testAndUpdateTimeLessThan2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria
                .andUpdateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeLessThanOrEqualTo() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria
                .andUpdateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime());

    }

    @Test
    public void testAndUpdateTimeLessThanOrEqualTo2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria
                .andUpdateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeIn() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andUpdateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime()));

    }

    @Test
    public void testAndUpdateTimeNotIn() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andUpdateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime()));

    }

    @Test
    public void testAndUpdateTimeBetween() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria
                .andUpdateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime());

    }

    @Test
    public void testAndUpdateTimeNotBetween() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria
                .andUpdateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime());

    }

    @Test
    public void testAndCreateTimeIsNull() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andCreateTimeIsNull();

    }

    @Test
    public void testAndCreateTimeIsNotNull() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andCreateTimeIsNotNull();

    }

    @Test
    public void testAndCreateTimeEqualTo() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria
                .andCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime());

    }

    @Test
    public void testAndCreateTimeEqualTo2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria
                .andCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeNotEqualTo() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria
                .andCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime());

    }

    @Test
    public void testAndCreateTimeNotEqualTo2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria
                .andCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeGreaterThan() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria
                .andCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime());

    }

    @Test
    public void testAndCreateTimeGreaterThan2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria
                .andCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeGreaterThanOrEqualTo() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria
                .andCreateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime());

    }

    @Test
    public void testAndCreateTimeGreaterThanOrEqualTo2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria
                .andCreateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeLessThan() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria
                .andCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime());

    }

    @Test
    public void testAndCreateTimeLessThan2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria
                .andCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeLessThanOrEqualTo() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria
                .andCreateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime());

    }

    @Test
    public void testAndCreateTimeLessThanOrEqualTo2() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria
                .andCreateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeIn() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andCreateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime()));

    }

    @Test
    public void testAndCreateTimeNotIn() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria.andCreateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime()));

    }

    @Test
    public void testAndCreateTimeBetween() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria
                .andCreateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime());

    }

    @Test
    public void testAndCreateTimeNotBetween() throws Exception {
        ApiTokenExample.Criteria result = generatedCriteria
                .andCreateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 37).getTime());

    }
}
