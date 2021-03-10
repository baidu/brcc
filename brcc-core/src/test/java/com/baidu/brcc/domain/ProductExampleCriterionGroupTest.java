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

public class ProductExampleCriterionGroupTest {





    ProductExample.CriterionGroup criterionGroup = ProductExample.newBuilder().build().createCriteria()
            .andGroupCriterion();

    @Before
    public void setUp() {

    }

    @Test
    public void testOr() throws Exception {
        ProductExample.CriterionGroup result =
                criterionGroup.or(new ProductExample.Criterion("condition", "value", "secondValue", "typeHandler"));

    }

    @Test
    public void testToCriteria() throws Exception {
        ProductExample.Criteria result = criterionGroup.toCriteria();

    }

    @Test
    public void testOrIdIsNull() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orIdIsNull();

    }

    @Test
    public void testOrIdIsNotNull() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orIdIsNotNull();

    }

    @Test
    public void testOrIdEqualTo() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdEqualTo2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdNotEqualTo() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdNotEqualTo2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdGreaterThan() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testOrIdGreaterThan2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdGreaterThanOrEqualTo() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdGreaterThanOrEqualTo2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdLessThan() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testOrIdLessThan2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdLessThanOrEqualTo() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdLessThanOrEqualTo2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdIn() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrIdNotIn() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrIdBetween() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrIdNotBetween() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrNameIsNull() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orNameIsNull();

    }

    @Test
    public void testOrNameIsNotNull() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orNameIsNotNull();

    }

    @Test
    public void testOrNameEqualTo() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orNameEqualTo("value");

    }

    @Test
    public void testOrNameEqualTo2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orNameEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameNotEqualTo() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orNameNotEqualTo("value");

    }

    @Test
    public void testOrNameNotEqualTo2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orNameNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameGreaterThan() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orNameGreaterThan("value");

    }

    @Test
    public void testOrNameGreaterThan2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orNameGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameGreaterThanOrEqualTo() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orNameGreaterThanOrEqualTo("value");

    }

    @Test
    public void testOrNameGreaterThanOrEqualTo2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orNameGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameLessThan() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orNameLessThan("value");

    }

    @Test
    public void testOrNameLessThan2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orNameLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameLessThanOrEqualTo() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orNameLessThanOrEqualTo("value");

    }

    @Test
    public void testOrNameLessThanOrEqualTo2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orNameLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameLike() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orNameLike("value");

    }

    @Test
    public void testOrNameLike2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orNameLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameLikeLeft() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orNameLikeLeft("value");

    }

    @Test
    public void testOrNameLikeLeft2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orNameLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameLikeRight() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orNameLikeRight("value");

    }

    @Test
    public void testOrNameLikeRight2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orNameLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameLikeBoth() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orNameLikeBoth("value");

    }

    @Test
    public void testOrNameLikeBoth2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orNameLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameNotLike() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orNameNotLike("value");

    }

    @Test
    public void testOrNameNotLike2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orNameNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameNotLikeLeft() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orNameNotLikeLeft("value");

    }

    @Test
    public void testOrNameNotLikeLeft2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orNameNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameNotLikeRight() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orNameNotLikeRight("value");

    }

    @Test
    public void testOrNameNotLikeRight2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orNameNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameNotLikeBoth() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orNameNotLikeBoth("value");

    }

    @Test
    public void testOrNameNotLikeBoth2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orNameNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameIn() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orNameIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrNameNotIn() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orNameNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrNameBetween() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orNameBetween("value1", "value2");

    }

    @Test
    public void testOrNameNotBetween() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orNameNotBetween("value1", "value2");

    }

    @Test
    public void testOrMemoIsNull() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orMemoIsNull();

    }

    @Test
    public void testOrMemoIsNotNull() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orMemoIsNotNull();

    }

    @Test
    public void testOrMemoEqualTo() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orMemoEqualTo("value");

    }

    @Test
    public void testOrMemoEqualTo2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orMemoEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoNotEqualTo() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orMemoNotEqualTo("value");

    }

    @Test
    public void testOrMemoNotEqualTo2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orMemoNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoGreaterThan() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orMemoGreaterThan("value");

    }

    @Test
    public void testOrMemoGreaterThan2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orMemoGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoGreaterThanOrEqualTo() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orMemoGreaterThanOrEqualTo("value");

    }

    @Test
    public void testOrMemoGreaterThanOrEqualTo2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orMemoGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoLessThan() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orMemoLessThan("value");

    }

    @Test
    public void testOrMemoLessThan2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orMemoLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoLessThanOrEqualTo() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orMemoLessThanOrEqualTo("value");

    }

    @Test
    public void testOrMemoLessThanOrEqualTo2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orMemoLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoLike() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orMemoLike("value");

    }

    @Test
    public void testOrMemoLike2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orMemoLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoLikeLeft() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orMemoLikeLeft("value");

    }

    @Test
    public void testOrMemoLikeLeft2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orMemoLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoLikeRight() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orMemoLikeRight("value");

    }

    @Test
    public void testOrMemoLikeRight2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orMemoLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoLikeBoth() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orMemoLikeBoth("value");

    }

    @Test
    public void testOrMemoLikeBoth2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orMemoLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoNotLike() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orMemoNotLike("value");

    }

    @Test
    public void testOrMemoNotLike2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orMemoNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoNotLikeLeft() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orMemoNotLikeLeft("value");

    }

    @Test
    public void testOrMemoNotLikeLeft2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orMemoNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoNotLikeRight() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orMemoNotLikeRight("value");

    }

    @Test
    public void testOrMemoNotLikeRight2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orMemoNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoNotLikeBoth() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orMemoNotLikeBoth("value");

    }

    @Test
    public void testOrMemoNotLikeBoth2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orMemoNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoIn() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orMemoIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrMemoNotIn() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orMemoNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrMemoBetween() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orMemoBetween("value1", "value2");

    }

    @Test
    public void testOrMemoNotBetween() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orMemoNotBetween("value1", "value2");

    }

    @Test
    public void testOrUpdateTimeIsNull() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orUpdateTimeIsNull();

    }

    @Test
    public void testOrUpdateTimeIsNotNull() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orUpdateTimeIsNotNull();

    }

    @Test
    public void testOrUpdateTimeEqualTo() throws Exception {
        ProductExample.CriterionGroup result =
                criterionGroup.orUpdateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime());

    }

    @Test
    public void testOrUpdateTimeEqualTo2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup
                .orUpdateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeNotEqualTo() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup
                .orUpdateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime());

    }

    @Test
    public void testOrUpdateTimeNotEqualTo2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup
                .orUpdateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeGreaterThan() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup
                .orUpdateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime());

    }

    @Test
    public void testOrUpdateTimeGreaterThan2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup
                .orUpdateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeGreaterThanOrEqualTo() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup
                .orUpdateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime());

    }

    @Test
    public void testOrUpdateTimeGreaterThanOrEqualTo2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup
                .orUpdateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeLessThan() throws Exception {
        ProductExample.CriterionGroup result =
                criterionGroup.orUpdateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime());

    }

    @Test
    public void testOrUpdateTimeLessThan2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup
                .orUpdateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeLessThanOrEqualTo() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup
                .orUpdateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime());

    }

    @Test
    public void testOrUpdateTimeLessThanOrEqualTo2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup
                .orUpdateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeIn() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orUpdateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime()));

    }

    @Test
    public void testOrUpdateTimeNotIn() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orUpdateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime()));

    }

    @Test
    public void testOrUpdateTimeBetween() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup
                .orUpdateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime());

    }

    @Test
    public void testOrUpdateTimeNotBetween() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup
                .orUpdateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime());

    }

    @Test
    public void testOrCreateTimeIsNull() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orCreateTimeIsNull();

    }

    @Test
    public void testOrCreateTimeIsNotNull() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orCreateTimeIsNotNull();

    }

    @Test
    public void testOrCreateTimeEqualTo() throws Exception {
        ProductExample.CriterionGroup result =
                criterionGroup.orCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime());

    }

    @Test
    public void testOrCreateTimeEqualTo2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup
                .orCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeNotEqualTo() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup
                .orCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime());

    }

    @Test
    public void testOrCreateTimeNotEqualTo2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup
                .orCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeGreaterThan() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime());

    }

    @Test
    public void testOrCreateTimeGreaterThan2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeGreaterThanOrEqualTo() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime());

    }

    @Test
    public void testOrCreateTimeGreaterThanOrEqualTo2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeLessThan() throws Exception {
        ProductExample.CriterionGroup result =
                criterionGroup.orCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime());

    }

    @Test
    public void testOrCreateTimeLessThan2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup
                .orCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeLessThanOrEqualTo() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup
                .orCreateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime());

    }

    @Test
    public void testOrCreateTimeLessThanOrEqualTo2() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup
                .orCreateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeIn() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orCreateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime()));

    }

    @Test
    public void testOrCreateTimeNotIn() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup.orCreateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime()));

    }

    @Test
    public void testOrCreateTimeBetween() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup
                .orCreateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime());

    }

    @Test
    public void testOrCreateTimeNotBetween() throws Exception {
        ProductExample.CriterionGroup result = criterionGroup
                .orCreateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 12).getTime());

    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev
// .com/forum#!/testme
