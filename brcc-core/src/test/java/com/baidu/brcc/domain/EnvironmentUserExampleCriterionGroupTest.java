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

public class EnvironmentUserExampleCriterionGroupTest {

    EnvironmentUserExample.CriterionGroup criterionGroup = EnvironmentUserExample.newBuilder().build().createCriteria()
            .andGroupCriterion();

    @Before
    public void setUp() {
    }

    @Test
    public void testOr() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup
                .or(new EnvironmentUserExample.Criterion("condition", "value", "secondValue", "typeHandler"));

    }

    @Test
    public void testToCriteria() throws Exception {
        EnvironmentUserExample.Criteria result = criterionGroup.toCriteria();

    }

    @Test
    public void testOrIdIsNull() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orIdIsNull();

    }

    @Test
    public void testOrIdIsNotNull() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orIdIsNotNull();

    }

    @Test
    public void testOrIdEqualTo() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdEqualTo2() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdNotEqualTo() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdNotEqualTo2() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdGreaterThan() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testOrIdGreaterThan2() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdGreaterThanOrEqualTo() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdGreaterThanOrEqualTo2() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdLessThan() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testOrIdLessThan2() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdLessThanOrEqualTo() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdLessThanOrEqualTo2() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdIn() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrIdNotIn() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrIdBetween() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrIdNotBetween() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrProductIdIsNull() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orProductIdIsNull();

    }

    @Test
    public void testOrProductIdIsNotNull() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orProductIdIsNotNull();

    }

    @Test
    public void testOrProductIdEqualTo() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orProductIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProductIdEqualTo2() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orProductIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProductIdNotEqualTo() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orProductIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProductIdNotEqualTo2() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orProductIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProductIdGreaterThan() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orProductIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testOrProductIdGreaterThan2() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orProductIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProductIdGreaterThanOrEqualTo() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orProductIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProductIdGreaterThanOrEqualTo2() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orProductIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProductIdLessThan() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orProductIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testOrProductIdLessThan2() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orProductIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProductIdLessThanOrEqualTo() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orProductIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProductIdLessThanOrEqualTo2() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orProductIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProductIdIn() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orProductIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrProductIdNotIn() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orProductIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrProductIdBetween() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orProductIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrProductIdNotBetween() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orProductIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdIsNull() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orProjectIdIsNull();

    }

    @Test
    public void testOrProjectIdIsNotNull() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orProjectIdIsNotNull();

    }

    @Test
    public void testOrProjectIdEqualTo() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orProjectIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdEqualTo2() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orProjectIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProjectIdNotEqualTo() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orProjectIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdNotEqualTo2() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orProjectIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProjectIdGreaterThan() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orProjectIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdGreaterThan2() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orProjectIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProjectIdGreaterThanOrEqualTo() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orProjectIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdGreaterThanOrEqualTo2() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orProjectIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProjectIdLessThan() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orProjectIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdLessThan2() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orProjectIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProjectIdLessThanOrEqualTo() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orProjectIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdLessThanOrEqualTo2() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orProjectIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProjectIdIn() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orProjectIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrProjectIdNotIn() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orProjectIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrProjectIdBetween() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orProjectIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdNotBetween() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orProjectIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrEnvironmentIdIsNull() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orEnvironmentIdIsNull();

    }

    @Test
    public void testOrEnvironmentIdIsNotNull() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orEnvironmentIdIsNotNull();

    }

    @Test
    public void testOrEnvironmentIdEqualTo() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orEnvironmentIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrEnvironmentIdEqualTo2() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orEnvironmentIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrEnvironmentIdNotEqualTo() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orEnvironmentIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrEnvironmentIdNotEqualTo2() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orEnvironmentIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrEnvironmentIdGreaterThan() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orEnvironmentIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testOrEnvironmentIdGreaterThan2() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orEnvironmentIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrEnvironmentIdGreaterThanOrEqualTo() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orEnvironmentIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrEnvironmentIdGreaterThanOrEqualTo2() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orEnvironmentIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrEnvironmentIdLessThan() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orEnvironmentIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testOrEnvironmentIdLessThan2() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orEnvironmentIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrEnvironmentIdLessThanOrEqualTo() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orEnvironmentIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrEnvironmentIdLessThanOrEqualTo2() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orEnvironmentIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrEnvironmentIdIn() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orEnvironmentIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrEnvironmentIdNotIn() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orEnvironmentIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrEnvironmentIdBetween() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orEnvironmentIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrEnvironmentIdNotBetween() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orEnvironmentIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrUserIdIsNull() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserIdIsNull();

    }

    @Test
    public void testOrUserIdIsNotNull() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserIdIsNotNull();

    }

    @Test
    public void testOrUserIdEqualTo() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrUserIdEqualTo2() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrUserIdNotEqualTo() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrUserIdNotEqualTo2() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrUserIdGreaterThan() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testOrUserIdGreaterThan2() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orUserIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrUserIdGreaterThanOrEqualTo() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrUserIdGreaterThanOrEqualTo2() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orUserIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrUserIdLessThan() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testOrUserIdLessThan2() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrUserIdLessThanOrEqualTo() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrUserIdLessThanOrEqualTo2() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orUserIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrUserIdIn() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrUserIdNotIn() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orUserIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrUserIdBetween() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrUserIdNotBetween() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orUserIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrUserNameIsNull() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserNameIsNull();

    }

    @Test
    public void testOrUserNameIsNotNull() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserNameIsNotNull();

    }

    @Test
    public void testOrUserNameEqualTo() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserNameEqualTo("value");

    }

    @Test
    public void testOrUserNameEqualTo2() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserNameEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrUserNameNotEqualTo() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserNameNotEqualTo("value");

    }

    @Test
    public void testOrUserNameNotEqualTo2() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserNameNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrUserNameGreaterThan() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserNameGreaterThan("value");

    }

    @Test
    public void testOrUserNameGreaterThan2() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserNameGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrUserNameGreaterThanOrEqualTo() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserNameGreaterThanOrEqualTo("value");

    }

    @Test
    public void testOrUserNameGreaterThanOrEqualTo2() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orUserNameGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrUserNameLessThan() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserNameLessThan("value");

    }

    @Test
    public void testOrUserNameLessThan2() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserNameLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrUserNameLessThanOrEqualTo() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserNameLessThanOrEqualTo("value");

    }

    @Test
    public void testOrUserNameLessThanOrEqualTo2() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orUserNameLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrUserNameLike() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserNameLike("value");

    }

    @Test
    public void testOrUserNameLike2() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserNameLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrUserNameLikeLeft() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserNameLikeLeft("value");

    }

    @Test
    public void testOrUserNameLikeLeft2() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserNameLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrUserNameLikeRight() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserNameLikeRight("value");

    }

    @Test
    public void testOrUserNameLikeRight2() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserNameLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrUserNameLikeBoth() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserNameLikeBoth("value");

    }

    @Test
    public void testOrUserNameLikeBoth2() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserNameLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrUserNameNotLike() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserNameNotLike("value");

    }

    @Test
    public void testOrUserNameNotLike2() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserNameNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrUserNameNotLikeLeft() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserNameNotLikeLeft("value");

    }

    @Test
    public void testOrUserNameNotLikeLeft2() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserNameNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrUserNameNotLikeRight() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserNameNotLikeRight("value");

    }

    @Test
    public void testOrUserNameNotLikeRight2() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserNameNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrUserNameNotLikeBoth() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserNameNotLikeBoth("value");

    }

    @Test
    public void testOrUserNameNotLikeBoth2() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserNameNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrUserNameIn() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserNameIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrUserNameNotIn() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserNameNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrUserNameBetween() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserNameBetween("value1", "value2");

    }

    @Test
    public void testOrUserNameNotBetween() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUserNameNotBetween("value1", "value2");

    }

    @Test
    public void testOrPriTypeIsNull() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orPriTypeIsNull();

    }

    @Test
    public void testOrPriTypeIsNotNull() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orPriTypeIsNotNull();

    }

    @Test
    public void testOrPriTypeEqualTo() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orPriTypeEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrPriTypeEqualTo2() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orPriTypeEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrPriTypeNotEqualTo() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orPriTypeNotEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrPriTypeNotEqualTo2() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orPriTypeNotEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrPriTypeGreaterThan() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orPriTypeGreaterThan(Byte.valueOf("00110"));

    }

    @Test
    public void testOrPriTypeGreaterThan2() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orPriTypeGreaterThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrPriTypeGreaterThanOrEqualTo() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orPriTypeGreaterThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrPriTypeGreaterThanOrEqualTo2() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orPriTypeGreaterThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrPriTypeLessThan() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orPriTypeLessThan(Byte.valueOf("00110"));

    }

    @Test
    public void testOrPriTypeLessThan2() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orPriTypeLessThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrPriTypeLessThanOrEqualTo() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orPriTypeLessThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrPriTypeLessThanOrEqualTo2() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orPriTypeLessThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrPriTypeIn() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orPriTypeIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testOrPriTypeNotIn() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orPriTypeNotIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testOrPriTypeBetween() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orPriTypeBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testOrPriTypeNotBetween() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orPriTypeNotBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testOrUpdateTimeIsNull() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUpdateTimeIsNull();

    }

    @Test
    public void testOrUpdateTimeIsNotNull() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUpdateTimeIsNotNull();

    }

    @Test
    public void testOrUpdateTimeEqualTo() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orUpdateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 6).getTime());

    }

    @Test
    public void testOrUpdateTimeEqualTo2() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup
                .orUpdateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 6).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeNotEqualTo() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orUpdateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 6).getTime());

    }

    @Test
    public void testOrUpdateTimeNotEqualTo2() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup
                .orUpdateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 6).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeGreaterThan() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup
                .orUpdateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 6).getTime());

    }

    @Test
    public void testOrUpdateTimeGreaterThan2() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup
                .orUpdateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 6).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeGreaterThanOrEqualTo() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup
                .orUpdateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 6).getTime());

    }

    @Test
    public void testOrUpdateTimeGreaterThanOrEqualTo2() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup
                .orUpdateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 6).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeLessThan() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orUpdateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 6).getTime());

    }

    @Test
    public void testOrUpdateTimeLessThan2() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup
                .orUpdateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 6).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeLessThanOrEqualTo() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup
                .orUpdateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 6).getTime());

    }

    @Test
    public void testOrUpdateTimeLessThanOrEqualTo2() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup
                .orUpdateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 6).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeIn() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUpdateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 6).getTime()));

    }

    @Test
    public void testOrUpdateTimeNotIn() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orUpdateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 6).getTime()));

    }

    @Test
    public void testOrUpdateTimeBetween() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup
                .orUpdateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 6).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 6).getTime());

    }

    @Test
    public void testOrUpdateTimeNotBetween() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup
                .orUpdateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 6).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 6).getTime());

    }

    @Test
    public void testOrCreateTimeIsNull() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orCreateTimeIsNull();

    }

    @Test
    public void testOrCreateTimeIsNotNull() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orCreateTimeIsNotNull();

    }

    @Test
    public void testOrCreateTimeEqualTo() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 6).getTime());

    }

    @Test
    public void testOrCreateTimeEqualTo2() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup
                .orCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 6).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeNotEqualTo() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 6).getTime());

    }

    @Test
    public void testOrCreateTimeNotEqualTo2() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup
                .orCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 6).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeGreaterThan() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 6).getTime());

    }

    @Test
    public void testOrCreateTimeGreaterThan2() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 6).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeGreaterThanOrEqualTo() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 6).getTime());

    }

    @Test
    public void testOrCreateTimeGreaterThanOrEqualTo2() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 6).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeLessThan() throws Exception {
        EnvironmentUserExample.CriterionGroup result =
                criterionGroup.orCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 6).getTime());

    }

    @Test
    public void testOrCreateTimeLessThan2() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup
                .orCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 6).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeLessThanOrEqualTo() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup
                .orCreateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 6).getTime());

    }

    @Test
    public void testOrCreateTimeLessThanOrEqualTo2() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup
                .orCreateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 6).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeIn() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orCreateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 6).getTime()));

    }

    @Test
    public void testOrCreateTimeNotIn() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup.orCreateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 6).getTime()));

    }

    @Test
    public void testOrCreateTimeBetween() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup
                .orCreateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 6).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 6).getTime());

    }

    @Test
    public void testOrCreateTimeNotBetween() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criterionGroup
                .orCreateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 6).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 6).getTime());

    }
}
