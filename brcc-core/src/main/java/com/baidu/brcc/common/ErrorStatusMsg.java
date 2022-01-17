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
package com.baidu.brcc.common;

public class ErrorStatusMsg {

    // 参数缺失
    public static final Integer PARAM_MIS_STATUS = 9001;
    public static final String PARAM_MIS_MSG = "参数缺失";

    // 参数错误
    public static final Integer PARAM_ERROR_STATUS = 9002;
    public static final String PARAM_ERROR_MSG = "参数错误";

    // 权限不够
    public static final Integer PRIV_EXCEED_STATUS = 9003;
    public static final String PRIV_EXCEED_MSG = "权限不够";

    // 缺少项目名称
    public static final Integer MIS_PROJECT_NAME_STATUS = 1001;
    public static final String MIS_PROJECT_NAME_MSG = "缺少project名称";

    // 项目名称重名
    public static final Integer DUP_PROJECT_NAME_STATUS = 1002;
    public static final String DUP_PROJECT_NAME_MSG = "project名称重复";

    // 缺少产品线名称
    public static final Integer MIS_PRODUCT_NAME_STATUS = 1004;
    public static final String MIS_PRODUCT_NAME_MSG = "缺少product名称";

    // CONSOLE 相关
    // 您尚未登录
    public static final int NON_LOGIN_STATUS = 443;
    public static final String NON_LOGIN_MSG = "您尚未登录";

    // 您无权执行此操作
    public static final Integer PRIV_MIS_STATUS = 403;
    public static final String PRIV_MIS_MSG = "您无权执行此操作";

    // 当前用户状态不可用
    public static final Integer USER_NOT_AVAILABLE_STATUS = 405;
    public static final String USER_NOT_AVAILABLE_MSG = "当前用户状态不可用";

    // 服务器错误
    public static final Integer SERVER_ERROR_STATUS = 100500;
    public static final String SERVER_ERROR_MSG = "服务器错误";

    // 用户不存在
    public static final Integer USER_NOT_EXISTS_STATUS = 100101;
    public static final String USER_NOT_EXISTS_MSG = "用户不存在";

    // 用户名不能为空
    public static final Integer USER_NAME_EMPTY_STATUS = 100102;
    public static final String USER_NAME_EMPTY_MSG = "用户名不能为空";

    // 用户密码不能为空
    public static final Integer USER_PASSWORD_EMPTY_STATUS = 100103;
    public static final String USER_PASSWORD_EMPTY_MSG = "用户密码不能为空";

    // 登录名不能为空
    public static final Integer USER_LOGIN_NAME_EMPTY_STATUS = 100104;
    public static final String USER_LOGIN_NAME_EMPTY_MSG = "登录名不能为空";

    // 登录密码不能为空
    public static final Integer USER_LOGIN_PASSWORD_EMPTY_STATUS = 100105;
    public static final String USER_LOGIN_PASSWORD_EMPTY_MSG = "登录密码不能为空";

    // 登录密码不能为空
    public static final Integer USER_LOGIN_PASSWORD_ERROR_STATUS = 100106;
    public static final String USER_LOGIN_PASSWORD_ERROR_MSG = "登录密码不正确";

    public static final Integer PRODUCT_NOT_EXISTS_STATUS = 100107;
    public static final String PRODUCT_NOT_EXISTS_MSG = "产品线不存在";

    // 产品线已存在
    public static final Integer PRODUCT_EXISTS_STATUS = 100108;
    public static final String PRODUCT_EXISTS_MSG = "产品线已存在";

    // 产品线名称不能为空
    public static final Integer PRODUCT_NAME_EMPTY_STATUS = 100109;
    public static final String PRODUCT_NAME_EMPTY_MSG = "产品线名称不能为空";

    // 产品线ID不能为空
    public static final Integer PRODUCT_ID_EMPTY_STATUS = 100110;
    public static final String PRODUCT_ID_EMPTY_MSG = "产品线ID不能为空";

    // 工程ID不能为空
    public static final Integer PROJECT_ID_NOT_EXISTS_STATUS = 100111;
    public static final String PROJECT_ID_NOT_EXISTS_MSG = "工程ID不能为空";

    // 工程依赖ID不能为空
    public static final Integer PROJECT_REF_ID_NOT_EXISTS_STATUS = 100112;
    public static final String PROJECT_REF_ID_NOT_EXISTS_MSG = "工程依赖ID不能为空";

    // 工程已存在
    public static final Integer PROJECT_EXISTS_STATUS = 100113;
    public static final String PROJECT_EXISTS_MSG = "工程已存在";

    // 工程名已存在
    public static final Integer PROJECT_NAME_EXISTS_STATUS = 100232;
    public static final String PROJECT_NAME_EXISTS_MSG = "工程名已被占用！工程名在BRCC全局唯一";

    // 工程类型无效
    public static final Integer PROJECT_TYPE_NOT_AVAILABLE_STATUS = 100114;
    public static final String PROJECT_TYPE_NOT_AVAILABLE_MSG = "工程类型无效";

    // 环境已存在
    public static final Integer ENVIRONMENT_EXISTS_STATUS = 100115;
    public static final String ENVIRONMENT_EXISTS_MSG = "环境已存在";

    // 起始日期不能为空
    public static final Integer VERSION_CHANGE_LOG_START_TIME_EMPTY_STATUS = 100116;
    public static final String VERSION_CHANGE_LOG_START_TIME_EMPTY_MSG = "起始日期不能为空";

    // 终止日期不能为空
    public static final Integer VERSION_CHANGE_LOG_END_TIME_EMPTY_STATUS = 100117;
    public static final String VERSION_CHANGE_LOG_END_TIME_EMPTY_MSG = "终止日期不能为空";

    // 源版本ID不能为空
    public static final Integer VERSION_COPY_SRC_VERSION_ID_NOT_EXISTS_STATUS = 100118;
    public static final String VERSION_COPY_SRC_VERSION_ID_NOT_EXISTS_MSG = "源版本ID不能为空";

    // 源版本不存在
    public static final Integer VERSION_COPY_SRC_VERSION_NOT_EXISTS_STATUS = 100119;
    public static final String VERSION_COPY_SRC_VERSION_NOT_EXISTS_MSG = "源版本不存在";

    // 目标版本ID不能为空
    public static final Integer VERSION_COPY_DEST_VERSION_ID_NOT_EXISTS_STATUS = 100120;
    public static final String VERSION_COPY_DEST_VERSION_ID_NOT_EXISTS_MSG = "目标版本ID不能为空";

    // 目标版本不存在
    public static final Integer VERSION_COPY_DEST_VERSION_NOT_EXISTS_STATUS = 100121;
    public static final String VERSION_COPY_DEST_VERSION_NOT_EXISTS_MSG = "目标版本不存在";

    // 源版本ID与目标版本ID重复
    public static final Integer VERSION_COPY_SRC_DEST_VERSION_ID_DUPLICATE_STATUS = 100122;
    public static final String VERSION_COPY_SRC_DEST_VERSION_ID_DUPLICATE_MSG = "源版本ID与目标版本ID重复";

    // 源版本不存在
    public static final Integer VERSION_SRC_NOT_EXISTS_STATUS = 100123;
    public static final String VERSION_SRC_NOT_EXISTS_MSG = "源版本不存在";

    // 目标版本不存在
    public static final Integer VERSION_DEST_NOT_EXISTS_STATUS = 100124;
    public static final String VERSION_DEST_NOT_EXISTS_MSG = "目标版本不存在";

    // 版本已存在
    public static final Integer VERSION_EXISTS_STATUS = 100125;
    public static final String VERSION_EXISTS_MSG = "版本已存在";

    // 分组Id不能为空
    public static final Integer GROUP_ID_NOT_EXISTS_STATUS = 100126;
    public static final String GROUP_ID_NOT_EXISTS_MSG = "分组Id不能为空";

    // 分组名不能为空
    public static final Integer GROUP_NAME_NOT_EXISTS_STATUS = 100127;
    public static final String GROUP_NAME_NOT_EXISTS_MSG = "分组名不能为空";

    // 分组不存在
    public static final Integer GROUP_NOT_EXISTS_STATUS = 100128;
    public static final String GROUP_NOT_EXISTS_MSG = "分组不存在";

    // 分组已存在
    public static final Integer GROUP_EXISTS_STATUS = 100129;
    public static final String GROUP_EXISTS_MSG = "分组已存在";

    // 配置项已存在
    public static final Integer CONFIG_ITEM_EXISTS_STATUS = 100130;
    public static final String CONFIG_ITEM_EXISTS_MSG = "配置项已存在";

    // 配置项ID不能为空
    public static final Integer CONFIG_ITEM_ID_NOT_EXISTS_STATUS = 100131;
    public static final String CONFIG_ITEM_ID_NOT_EXISTS_MSG = "配置项ID不能为空";

    // 配置项KEY和配置项值不能同时为空
    public static final Integer CONFIG_KEY_VALUE_NOT_EXISTS_STATUS = 100132;
    public static final String CONFIG_KEY_VALUE_NOT_EXISTS_MSG = "配置项名称和配置项值不能同时为空";

    public static final Integer USERID_NOT_EXISTS_STATUS = 100133;
    public static final String USERID_NOT_EXISTS_MSG = "userIds不能为空";



    // API 相关
    // 工程
    // 工程名不能为空
    public static final Integer PROJECT_NAME_NOT_EXISTS_STATUS = 100201;
    public static final String PROJECT_NAME_NOT_EXISTS_MSG = "工程名不能为空";

    // 工程密码不能为空
    public static final Integer PROJECT_API_PASSWORD_NOT_EXISTS_STATUS = 100202;
    public static final String PROJECT_API_PASSWORD_NOT_EXISTS_MSG = "工程密码不能为空";

    // 项目不存在
    public static final Integer PROJECT_NOT_EXISTS_STATUS = 100203;
    public static final String PROJECT_NOT_EXISTS_MSG = "工程不存在";

    // 工程密码不正确
    public static final Integer PROJECT_API_PASSWORD_ERROR_STATUS = 100204;
    public static final String PROJECT_API_PASSWORD_ERROR_MSG = "工程密码不正确";

    // 工程TOKEN不存在
    public static final Integer PROJECT_API_TOKEN_NOT_EXISTS_STATUS = 100205;
    public static final String PROJECT_API_TOKEN_NOT_EXISTS_MSG = "工程TOKEN不存在";

    // 工程TOKEN错误
    public static final Integer PROJECT_API_TOKEN_ERROR_STATUS = 100206;
    public static final String PROJECT_API_TOKEN_ERROR_MSG = "工程TOKEN错误";

    // 工程TOKEN不能为空
    public static final Integer PROJECT_API_TOKEN_NOT_EMPTY_STATUS = 100207;
    public static final String PROJECT_API_TOKEN_NOT_EMPTY_MSG = "工程TOKEN不能为空";

    // 环境
    // 环境名称不能为空
    public static final Integer ENVIRONMENT_NAME_NOT_EMPTY_STATUS = 100208;
    public static final String ENVIRONMENT_NAME_NOT_EMPTY_MSG = "环境名称不能为空";

    // 环境不存在
    public static final Integer ENVIRONMENT_NOT_EXISTS_STATUS = 100209;
    public static final String ENVIRONMENT_NOT_EXISTS_MSG = "环境不存在";

    // environmentId不能为空
    public static final Integer ENVIRONMENT_ID_NOT_EXISTS_STATUS = 100210;
    public static final String ENVIRONMENT_ID_NOT_EXISTS_MSG = "environmentId不能为空";

    // 版本
    // versionId不能为空
    public static final Integer VERSION_ID_NOT_EXISTS_STATUS = 100211;
    public static final String VERSION_ID_NOT_EXISTS_MSG = "版本ID不能为空";

    // 灰度关联主版本ID不能为空
    public static final Integer MAIN_VERSION_ID_NOT_EXISTS_STATUS = 100216;
    public static final String MAIN_VERSION_ID_NOT_EXISTS_MSG = "主版本ID不能为空";

    // 版本名称不能为空
    public static final Integer VERSION_NAME_NOT_EXISTS_STATUS = 100212;
    public static final String VERSION_NAME_NOT_EXISTS_MSG = "版本名称不能为空";

    // 版本不存在
    public static final Integer VERSION_NOT_EXISTS_STATUS = 100213;
    public static final String VERSION_NOT_EXISTS_MSG = "版本不存在";

    //灰度实例未设置
    public static final Integer GRAY_VERSION_RELETED_STATUS = 100217;
    public static final String GRAY_VERSION_RELETED_MSG = "已有灰度版本关联";

    //灰度版本不存在
    public static final Integer GRAY_VERSION_NOT_EXISTS_STATUS = 100218;
    public static final String GRAY_VERSION_NOT_EXISTS_MSG = "灰度版本不存在";


    //灰度规则未设置
    public static final Integer GRAY_RULE_NOT_SET_STATUS = 100219;
    public static final String GRAY_RULE_NOT_SET_MSG = "灰度规则未设置";

    //灰度版本ID不能为空
    public static final Integer GRAY_VERSION_ID_NOT_EXIST_STATUS = 100220;
    public static final String GRAY_VERSION_ID_NOT_EXIST_MSG = "灰度版本ID不能为空";

    // 灰度规则重复
    public static final Integer GRAY_RULE_EXIST_STATUS = 100221;
    public static final String GRAY_RULE_EXIST_MSG = "灰度规则重复";

    // 灰度版本已存在
    public static final Integer GRAY_VERSION_EXIST_STATUS = 100222;
    public static final String GRAY_VERSION_EXIST_MSG = "灰度版本已存在";

    // 灰度版本不唯一
    public static final Integer GRAY_VERSION_MORE_THAN_ONE_STATUS = 100223;
    public static final String GRAY_VERSION_MORE_THAN_ONE_MSG = "灰度版本不唯一";

    // 配置项
    // 配置项KEY不能为空
    public static final Integer CONFIG_KEY_NOT_EXISTS_STATUS = 100214;
    public static final String CONFIG_KEY_NOT_EXISTS_MSG = "配置key不能为空";

    // 配置项不存在
    public static final Integer CONFIG_ITEM_NOT_EXISTS_STATUS = 100215;
    public static final String CONFIG_ITEM_NOT_EXISTS_MSG = "配置项不存在";

    // 复制版本时分组已存在
    public static final Integer COPY_GROUP_EXISTS_STATUS = 100224;
    public static final String COPY_GROUP_EXISTS_MSG = "该版本下存在相同分组，无法复制，请检查";

    // 复制版本时配置已存在
    public static final Integer COPY_CONFIG_EXISTS_STATUS = 100225;
    public static final String COPY_CONFIG_EXISTS_MSG = "该版本下存在相同配置，无法复制，请检查";

    // convert properties to string fail
    public static final Integer CONVERT_TO_STRING_STATUS = 100226;
    public static final String CONVERT_TO_STRING_MSG = "配置转换失败";

    // file empty error
    public static final Integer FILE_IS_EMPTY_STATUS = 100227;
    public static final String FILE_IS_EMPTY_MSG = "文件为空";

    // file name invalid
    public static final Integer FILE_NAME_INVALID_STATUS = 100228;
    public static final String FILE_NAME_INVALID_MSG = "文件名字不符合规范";

    // type can not be null
    public static final Integer TYPE_NULL_STATUS = 100229;
    public static final String TYPE_NULL_MSG = "类型不能为空";

    // ID can not be null
    public static final Integer ID_NULL_STATUS = 100230;
    public static final String ID_NULL_MSG = "ID不能为空";

    // name can not be null
    public static final Integer NAME_NULL_STATUS = 100231;
    public static final String NAME_NULL_MSG = "名称不能为空";

    // name can not be Chinese
    public static final Integer CHINESE_NOT_ALLOWED_STATUS = 100233;
    public static final String CHINESE_NOT_ALLOWED_MSG = "名称不能包含中文";

    public static final Integer COUNT_CAN_NOT_NEGATIVE_STATUS = 100234;
    public static final String COUNT_CAN_NOT_NEGATIVE_MSG = "数量不能为负";

    public static final Integer NO_ENVIRONMENT_PRI_STATUS = 100235;
    public static final String NO_ENVIRONMENT_PRI_MSG = "无任何环境权限";

    public static final Integer CHILDREN_VERSION_NOT_EMPTY_STATUS = 11000;
    public static final String CHILDREN_VERSION_NOT_EMPTY_MSG = "该版本仍被其他版本引用，不可删除！";
}
