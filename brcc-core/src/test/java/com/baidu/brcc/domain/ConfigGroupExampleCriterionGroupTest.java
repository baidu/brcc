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

public class ConfigGroupExampleCriterionGroupTest {

    @Before
    public void setUp() {

    }

    ConfigGroupExample.CriterionGroup criterionGroup = ConfigGroupExample.newBuilder().build().createCriteria()
            .andGroupCriterion();

    @Test
    public void testOr() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.or(new ConfigGroupExample.Criterion("condition", "value", "secondValue", "typeHandler"));

    }

    @Test
    public void testToCriteria() throws Exception {
        ConfigGroupExample.Criteria result = criterionGroup.toCriteria();

    }

    @Test
    public void testOrIdIsNull() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orIdIsNull();

    }

    @Test
    public void testOrIdIsNotNull() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orIdIsNotNull();

    }

    @Test
    public void testOrIdEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdNotEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdNotEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdGreaterThan() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testOrIdGreaterThan2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdGreaterThanOrEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdGreaterThanOrEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdLessThan() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testOrIdLessThan2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdLessThanOrEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdLessThanOrEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdIn() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrIdNotIn() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrIdBetween() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrIdNotBetween() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrNameIsNull() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orNameIsNull();

    }

    @Test
    public void testOrNameIsNotNull() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orNameIsNotNull();

    }

    @Test
    public void testOrNameEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orNameEqualTo("value");

    }

    @Test
    public void testOrNameEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orNameEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameNotEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orNameNotEqualTo("value");

    }

    @Test
    public void testOrNameNotEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orNameNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameGreaterThan() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orNameGreaterThan("value");

    }

    @Test
    public void testOrNameGreaterThan2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orNameGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameGreaterThanOrEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orNameGreaterThanOrEqualTo("value");

    }

    @Test
    public void testOrNameGreaterThanOrEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orNameGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameLessThan() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orNameLessThan("value");

    }

    @Test
    public void testOrNameLessThan2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orNameLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameLessThanOrEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orNameLessThanOrEqualTo("value");

    }

    @Test
    public void testOrNameLessThanOrEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orNameLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameLike() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orNameLike("value");

    }

    @Test
    public void testOrNameLike2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orNameLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameLikeLeft() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orNameLikeLeft("value");

    }

    @Test
    public void testOrNameLikeLeft2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orNameLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameLikeRight() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orNameLikeRight("value");

    }

    @Test
    public void testOrNameLikeRight2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orNameLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameLikeBoth() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orNameLikeBoth("value");

    }

    @Test
    public void testOrNameLikeBoth2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orNameLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameNotLike() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orNameNotLike("value");

    }

    @Test
    public void testOrNameNotLike2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orNameNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameNotLikeLeft() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orNameNotLikeLeft("value");

    }

    @Test
    public void testOrNameNotLikeLeft2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orNameNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameNotLikeRight() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orNameNotLikeRight("value");

    }

    @Test
    public void testOrNameNotLikeRight2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orNameNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameNotLikeBoth() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orNameNotLikeBoth("value");

    }

    @Test
    public void testOrNameNotLikeBoth2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orNameNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameIn() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orNameIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrNameNotIn() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orNameNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrNameBetween() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orNameBetween("value1", "value2");

    }

    @Test
    public void testOrNameNotBetween() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orNameNotBetween("value1", "value2");

    }

    @Test
    public void testOrMemoIsNull() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orMemoIsNull();

    }

    @Test
    public void testOrMemoIsNotNull() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orMemoIsNotNull();

    }

    @Test
    public void testOrMemoEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orMemoEqualTo("value");

    }

    @Test
    public void testOrMemoEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orMemoEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoNotEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orMemoNotEqualTo("value");

    }

    @Test
    public void testOrMemoNotEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orMemoNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoGreaterThan() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orMemoGreaterThan("value");

    }

    @Test
    public void testOrMemoGreaterThan2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orMemoGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoGreaterThanOrEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orMemoGreaterThanOrEqualTo("value");

    }

    @Test
    public void testOrMemoGreaterThanOrEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orMemoGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoLessThan() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orMemoLessThan("value");

    }

    @Test
    public void testOrMemoLessThan2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orMemoLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoLessThanOrEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orMemoLessThanOrEqualTo("value");

    }

    @Test
    public void testOrMemoLessThanOrEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orMemoLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoLike() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orMemoLike("value");

    }

    @Test
    public void testOrMemoLike2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orMemoLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoLikeLeft() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orMemoLikeLeft("value");

    }

    @Test
    public void testOrMemoLikeLeft2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orMemoLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoLikeRight() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orMemoLikeRight("value");

    }

    @Test
    public void testOrMemoLikeRight2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orMemoLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoLikeBoth() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orMemoLikeBoth("value");

    }

    @Test
    public void testOrMemoLikeBoth2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orMemoLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoNotLike() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orMemoNotLike("value");

    }

    @Test
    public void testOrMemoNotLike2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orMemoNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoNotLikeLeft() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orMemoNotLikeLeft("value");

    }

    @Test
    public void testOrMemoNotLikeLeft2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orMemoNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoNotLikeRight() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orMemoNotLikeRight("value");

    }

    @Test
    public void testOrMemoNotLikeRight2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orMemoNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoNotLikeBoth() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orMemoNotLikeBoth("value");

    }

    @Test
    public void testOrMemoNotLikeBoth2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orMemoNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoIn() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orMemoIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrMemoNotIn() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orMemoNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrMemoBetween() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orMemoBetween("value1", "value2");

    }

    @Test
    public void testOrMemoNotBetween() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orMemoNotBetween("value1", "value2");

    }

    @Test
    public void testOrProductIdIsNull() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orProductIdIsNull();

    }

    @Test
    public void testOrProductIdIsNotNull() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orProductIdIsNotNull();

    }

    @Test
    public void testOrProductIdEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orProductIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProductIdEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orProductIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProductIdNotEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orProductIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProductIdNotEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orProductIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProductIdGreaterThan() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orProductIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testOrProductIdGreaterThan2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orProductIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProductIdGreaterThanOrEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orProductIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProductIdGreaterThanOrEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orProductIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProductIdLessThan() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orProductIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testOrProductIdLessThan2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orProductIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProductIdLessThanOrEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orProductIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProductIdLessThanOrEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orProductIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProductIdIn() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orProductIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrProductIdNotIn() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orProductIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrProductIdBetween() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orProductIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrProductIdNotBetween() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orProductIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdIsNull() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orProjectIdIsNull();

    }

    @Test
    public void testOrProjectIdIsNotNull() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orProjectIdIsNotNull();

    }

    @Test
    public void testOrProjectIdEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orProjectIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orProjectIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProjectIdNotEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orProjectIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdNotEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orProjectIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProjectIdGreaterThan() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orProjectIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdGreaterThan2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orProjectIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProjectIdGreaterThanOrEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orProjectIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdGreaterThanOrEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orProjectIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProjectIdLessThan() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orProjectIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdLessThan2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orProjectIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProjectIdLessThanOrEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orProjectIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdLessThanOrEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orProjectIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProjectIdIn() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orProjectIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrProjectIdNotIn() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orProjectIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrProjectIdBetween() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orProjectIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdNotBetween() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orProjectIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrEnvironmentIdIsNull() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orEnvironmentIdIsNull();

    }

    @Test
    public void testOrEnvironmentIdIsNotNull() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orEnvironmentIdIsNotNull();

    }

    @Test
    public void testOrEnvironmentIdEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orEnvironmentIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrEnvironmentIdEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orEnvironmentIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrEnvironmentIdNotEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orEnvironmentIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrEnvironmentIdNotEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orEnvironmentIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrEnvironmentIdGreaterThan() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orEnvironmentIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testOrEnvironmentIdGreaterThan2() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orEnvironmentIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrEnvironmentIdGreaterThanOrEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orEnvironmentIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrEnvironmentIdGreaterThanOrEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orEnvironmentIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrEnvironmentIdLessThan() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orEnvironmentIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testOrEnvironmentIdLessThan2() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orEnvironmentIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrEnvironmentIdLessThanOrEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orEnvironmentIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrEnvironmentIdLessThanOrEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orEnvironmentIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrEnvironmentIdIn() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orEnvironmentIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrEnvironmentIdNotIn() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orEnvironmentIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrEnvironmentIdBetween() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orEnvironmentIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrEnvironmentIdNotBetween() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orEnvironmentIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrVersionIdIsNull() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orVersionIdIsNull();

    }

    @Test
    public void testOrVersionIdIsNotNull() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orVersionIdIsNotNull();

    }

    @Test
    public void testOrVersionIdEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orVersionIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrVersionIdEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orVersionIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrVersionIdNotEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orVersionIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrVersionIdNotEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orVersionIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrVersionIdGreaterThan() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orVersionIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testOrVersionIdGreaterThan2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orVersionIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrVersionIdGreaterThanOrEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orVersionIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrVersionIdGreaterThanOrEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orVersionIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrVersionIdLessThan() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orVersionIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testOrVersionIdLessThan2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orVersionIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrVersionIdLessThanOrEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orVersionIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrVersionIdLessThanOrEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orVersionIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrVersionIdIn() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orVersionIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrVersionIdNotIn() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orVersionIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrVersionIdBetween() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orVersionIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrVersionIdNotBetween() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orVersionIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrDefaultTypeIsNull() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orDefaultTypeIsNull();

    }

    @Test
    public void testOrDefaultTypeIsNotNull() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orDefaultTypeIsNotNull();

    }

    @Test
    public void testOrDefaultTypeEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orDefaultTypeEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrDefaultTypeEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orDefaultTypeEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrDefaultTypeNotEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orDefaultTypeNotEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrDefaultTypeNotEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orDefaultTypeNotEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrDefaultTypeGreaterThan() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orDefaultTypeGreaterThan(Byte.valueOf("00110"));

    }

    @Test
    public void testOrDefaultTypeGreaterThan2() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orDefaultTypeGreaterThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrDefaultTypeGreaterThanOrEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orDefaultTypeGreaterThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrDefaultTypeGreaterThanOrEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orDefaultTypeGreaterThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrDefaultTypeLessThan() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orDefaultTypeLessThan(Byte.valueOf("00110"));

    }

    @Test
    public void testOrDefaultTypeLessThan2() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orDefaultTypeLessThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrDefaultTypeLessThanOrEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orDefaultTypeLessThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrDefaultTypeLessThanOrEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orDefaultTypeLessThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrDefaultTypeIn() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orDefaultTypeIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testOrDefaultTypeNotIn() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orDefaultTypeNotIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testOrDefaultTypeBetween() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orDefaultTypeBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testOrDefaultTypeNotBetween() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orDefaultTypeNotBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testOrDeletedIsNull() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orDeletedIsNull();

    }

    @Test
    public void testOrDeletedIsNotNull() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orDeletedIsNotNull();

    }

    @Test
    public void testOrDeletedEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orDeletedEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrDeletedEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orDeletedEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrDeletedNotEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orDeletedNotEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrDeletedNotEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orDeletedNotEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrDeletedGreaterThan() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orDeletedGreaterThan(Byte.valueOf("00110"));

    }

    @Test
    public void testOrDeletedGreaterThan2() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orDeletedGreaterThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrDeletedGreaterThanOrEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orDeletedGreaterThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrDeletedGreaterThanOrEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orDeletedGreaterThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrDeletedLessThan() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orDeletedLessThan(Byte.valueOf("00110"));

    }

    @Test
    public void testOrDeletedLessThan2() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orDeletedLessThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrDeletedLessThanOrEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orDeletedLessThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrDeletedLessThanOrEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orDeletedLessThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrDeletedIn() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orDeletedIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testOrDeletedNotIn() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orDeletedNotIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testOrDeletedBetween() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orDeletedBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testOrDeletedNotBetween() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orDeletedNotBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testOrUpdateTimeIsNull() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orUpdateTimeIsNull();

    }

    @Test
    public void testOrUpdateTimeIsNotNull() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orUpdateTimeIsNotNull();

    }

    @Test
    public void testOrUpdateTimeEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orUpdateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 4).getTime());

    }

    @Test
    public void testOrUpdateTimeEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup
                .orUpdateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 4).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeNotEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orUpdateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 4).getTime());

    }

    @Test
    public void testOrUpdateTimeNotEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup
                .orUpdateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 4).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeGreaterThan() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orUpdateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 4).getTime());

    }

    @Test
    public void testOrUpdateTimeGreaterThan2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup
                .orUpdateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 4).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeGreaterThanOrEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup
                .orUpdateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 4).getTime());

    }

    @Test
    public void testOrUpdateTimeGreaterThanOrEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup
                .orUpdateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 4).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeLessThan() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orUpdateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 4).getTime());

    }

    @Test
    public void testOrUpdateTimeLessThan2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup
                .orUpdateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 4).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeLessThanOrEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup
                .orUpdateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 4).getTime());

    }

    @Test
    public void testOrUpdateTimeLessThanOrEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup
                .orUpdateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 4).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeIn() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orUpdateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 4).getTime()));

    }

    @Test
    public void testOrUpdateTimeNotIn() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orUpdateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 4).getTime()));

    }

    @Test
    public void testOrUpdateTimeBetween() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup
                .orUpdateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 4).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 4).getTime());

    }

    @Test
    public void testOrUpdateTimeNotBetween() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup
                .orUpdateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 4).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 4).getTime());

    }

    @Test
    public void testOrCreateTimeIsNull() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orCreateTimeIsNull();

    }

    @Test
    public void testOrCreateTimeIsNotNull() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orCreateTimeIsNotNull();

    }

    @Test
    public void testOrCreateTimeEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 4).getTime());

    }

    @Test
    public void testOrCreateTimeEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup
                .orCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 4).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeNotEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 4).getTime());

    }

    @Test
    public void testOrCreateTimeNotEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup
                .orCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 4).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeGreaterThan() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 4).getTime());

    }

    @Test
    public void testOrCreateTimeGreaterThan2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 4).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeGreaterThanOrEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 4).getTime());

    }

    @Test
    public void testOrCreateTimeGreaterThanOrEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 4).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeLessThan() throws Exception {
        ConfigGroupExample.CriterionGroup result =
                criterionGroup.orCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 4).getTime());

    }

    @Test
    public void testOrCreateTimeLessThan2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup
                .orCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 4).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeLessThanOrEqualTo() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup
                .orCreateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 4).getTime());

    }

    @Test
    public void testOrCreateTimeLessThanOrEqualTo2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup
                .orCreateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 4).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeIn() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orCreateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 4).getTime()));

    }

    @Test
    public void testOrCreateTimeNotIn() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup.orCreateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 4).getTime()));

    }

    @Test
    public void testOrCreateTimeBetween() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup
                .orCreateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 4).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 4).getTime());

    }

    @Test
    public void testOrCreateTimeNotBetween() throws Exception {
        ConfigGroupExample.CriterionGroup result = criterionGroup
                .orCreateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 4).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 4).getTime());

    }
}

