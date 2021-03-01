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
package com.baidu.brcc.utils.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeUtils {

    public static Date now() {
        return new Date();
    }
    /**
     * 今天
     *
     * @return yyyy-MM-dd
     */
    public static Date today() {
        LocalDate today = LocalDate.now();
        return Date.from(today.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }

    /**
     * 昨天
     *
     * @return yyyy-MM-dd
     */
    public static Date yesterday() {
        LocalDate yesterday = LocalDate.now().plusDays(-1);
        return Date.from(yesterday.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }

    /**
     * 明天
     *
     * @return yyyy-MM-dd
     */
    public static Date tomorrow() {
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        return Date.from(tomorrow.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }

    /**
     * 转换日期
     */
    public static String toDateString(Date date, String... pattern) {
        if (date == null) {
            return "";
        }
        String p = pattern == null || pattern.length == 0 ? "yyyy-MM-dd" : pattern[0];
        LocalDate localDate = LocalDateTime.ofInstant(date.toInstant(), ZoneOffset.systemDefault()).toLocalDate();
        return localDate.format(DateTimeFormatter.ofPattern(p));
    }

    /**
     * 转换日期
     */
    public static String toDateTimeString(Date date, String... pattern) {
        if (date == null) {
            return "";
        }
        String p = pattern == null || pattern.length == 0 ? "yyyy-MM-dd HH:mm:ss" : pattern[0];
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneOffset.systemDefault());
        return localDateTime.format(DateTimeFormatter.ofPattern(p));
    }

    /**
     * 判断是否过期, 包括当天
     */
    public static boolean expireDate(Date date) {
        if (date == null) {
            return true;
        }
        LocalDate localDate = LocalDateTime.ofInstant(date.toInstant(), ZoneOffset.systemDefault()).toLocalDate();
        return localDate.isBefore(LocalDate.now());
    }

    /**
     * 相差天数
     */
    public static long intervalDays(Date begin, Date end) {
        LocalDate beginLocalDate = LocalDateTime.ofInstant(begin.toInstant(), ZoneOffset.systemDefault()).toLocalDate();
        LocalDate endLocalDate = LocalDateTime.ofInstant(end.toInstant(), ZoneOffset.systemDefault()).toLocalDate();

        return endLocalDate.toEpochDay() - beginLocalDate.toEpochDay();
    }

    /**
     * 获取到小时的日期， 分、秒、毫秒均0填充
     * @param time 需要转换的日期
     * 2020-09-03 05:39:42.045 将返回 2020-09-03 05:00:00.000
     */
    public static Date toHourDate(LocalDateTime time) {
        LocalDateTime of = LocalDateTime.of(time.getYear(), time.getMonth(), time.getDayOfMonth(),
                time.getHour(), 0, 0);
        return Date.from(of.atZone(ZoneOffset.systemDefault()).toInstant());
    }

    public static Date toDayDate(LocalDateTime time) {
        LocalDateTime of = LocalDateTime.of(time.getYear(), time.getMonth(), time.getDayOfMonth(),
                0, 0, 0);
        return Date.from(of.atZone(ZoneOffset.systemDefault()).toInstant());
    }

    public static Date toDate(LocalDateTime time) {
        return Date.from(time.atZone(ZoneOffset.systemDefault()).toInstant());
    }

    public static LocalDateTime toLocalDateTime(String dateStr, String pattern) {
        return LocalDateTime.parse(dateStr, DateTimeFormatter.ofPattern(pattern));
    }

}
