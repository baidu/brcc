package com.baidu.brcc.domain.meta;

/*
@Results({
       @Result(property = "id", column = "id", javaType = java.lang.Long.class, jdbcType = JdbcType.BIGINT, id = true),
       @Result(property = "name", column = "name", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
       @Result(property = "password", column = "password", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
       @Result(property = "apiPassword", column = "api_password", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
       @Result(property = "status", column = "status", javaType = java.lang.Byte.class, jdbcType = JdbcType.TINYINT),
       @Result(property = "type", column = "type", javaType = java.lang.Byte.class, jdbcType = JdbcType.TINYINT),
       @Result(property = "role", column = "role", javaType = java.lang.Byte.class, jdbcType = JdbcType.TINYINT),
       @Result(property = "token", column = "token", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
       @Result(property = "updateTime", column = "update_time", javaType = java.util.Date.class, jdbcType = JdbcType.TIMESTAMP),
       @Result(property = "createTime", column = "create_time", javaType = java.util.Date.class, jdbcType = JdbcType.TIMESTAMP)
})
*/
public final class MetaUser {

    /**
     * 用户
     */
    public static final String TABLE_NAME = "`rcc_user`";

    /**
     * 编号
     */
    public static final String ID = "id";

    public static final String COLUMN_NAME_ID = "`id`";

    public static final String JAVA_TYPE_ID = "java.lang.Long";

    public static final String JDBC_TYPE_ID = "BIGINT";

    public static final String IS_KEY_ID = "true";

    /**
     * 用户名
     */
    public static final String NAME = "name";

    public static final String COLUMN_NAME_NAME = "`name`";

    public static final String JAVA_TYPE_NAME = "java.lang.String";

    public static final String JDBC_TYPE_NAME = "VARCHAR";

    public static final String IS_KEY_NAME = "false";

    /**
     * 操作台登录密码
     */
    public static final String PASSWORD = "password";

    public static final String COLUMN_NAME_PASSWORD = "`password`";

    public static final String JAVA_TYPE_PASSWORD = "java.lang.String";

    public static final String JDBC_TYPE_PASSWORD = "VARCHAR";

    public static final String IS_KEY_PASSWORD = "false";

    /**
     * api访问密码
     */
    public static final String APIPASSWORD = "apiPassword";

    public static final String COLUMN_NAME_APIPASSWORD = "`api_password`";

    public static final String JAVA_TYPE_APIPASSWORD = "java.lang.String";

    public static final String JDBC_TYPE_APIPASSWORD = "VARCHAR";

    public static final String IS_KEY_APIPASSWORD = "false";

    /**
     * 状态0-正常，1-禁用
     */
    public static final String STATUS = "status";

    public static final String COLUMN_NAME_STATUS = "`status`";

    public static final String JAVA_TYPE_STATUS = "java.lang.Byte";

    public static final String JDBC_TYPE_STATUS = "TINYINT";

    public static final String IS_KEY_STATUS = "false";

    /**
     * 用户类型, 0-默认, 1-uuap
     */
    public static final String TYPE = "type";

    public static final String COLUMN_NAME_TYPE = "`type`";

    public static final String JAVA_TYPE_TYPE = "java.lang.Byte";

    public static final String JDBC_TYPE_TYPE = "TINYINT";

    public static final String IS_KEY_TYPE = "false";

    /**
     * 管理类型, 0-普通, 1-工程, 2-产品线, 3-系统管理员
     */
    public static final String ROLE = "role";

    public static final String COLUMN_NAME_ROLE = "`role`";

    public static final String JAVA_TYPE_ROLE = "java.lang.Byte";

    public static final String JDBC_TYPE_ROLE = "TINYINT";

    public static final String IS_KEY_ROLE = "false";

    /**
     * token
     */
    public static final String TOKEN = "token";

    public static final String COLUMN_NAME_TOKEN = "`token`";

    public static final String JAVA_TYPE_TOKEN = "java.lang.String";

    public static final String JDBC_TYPE_TOKEN = "VARCHAR";

    public static final String IS_KEY_TOKEN = "false";

    /**
     * 更新时间
     */
    public static final String UPDATETIME = "updateTime";

    public static final String COLUMN_NAME_UPDATETIME = "`update_time`";

    public static final String JAVA_TYPE_UPDATETIME = "java.util.Date";

    public static final String JDBC_TYPE_UPDATETIME = "TIMESTAMP";

    public static final String IS_KEY_UPDATETIME = "false";

    /**
     * 创建时间
     */
    public static final String CREATETIME = "createTime";

    public static final String COLUMN_NAME_CREATETIME = "`create_time`";

    public static final String JAVA_TYPE_CREATETIME = "java.util.Date";

    public static final String JDBC_TYPE_CREATETIME = "TIMESTAMP";

    public static final String IS_KEY_CREATETIME = "false";

    /**
     * 根据数据库字段名返回JAVA对象字段名
     */
    public static String getFieldNameByColumn(String columnName) {
        if (columnName == null) {
            return "";
        }
        columnName = columnName.trim();
        if (columnName.length() <= 0) {
            return "";
        }
        if (!columnName.startsWith("`")) {
            columnName = "`" + columnName + "`";
        }
        if (columnName.equals(COLUMN_NAME_ID)) {
            return ID;
        }
        if (columnName.equals(COLUMN_NAME_NAME)) {
            return NAME;
        }
        if (columnName.equals(COLUMN_NAME_PASSWORD)) {
            return PASSWORD;
        }
        if (columnName.equals(COLUMN_NAME_APIPASSWORD)) {
            return APIPASSWORD;
        }
        if (columnName.equals(COLUMN_NAME_STATUS)) {
            return STATUS;
        }
        if (columnName.equals(COLUMN_NAME_TYPE)) {
            return TYPE;
        }
        if (columnName.equals(COLUMN_NAME_ROLE)) {
            return ROLE;
        }
        if (columnName.equals(COLUMN_NAME_TOKEN)) {
            return TOKEN;
        }
        if (columnName.equals(COLUMN_NAME_UPDATETIME)) {
            return UPDATETIME;
        }
        if (columnName.equals(COLUMN_NAME_CREATETIME)) {
            return CREATETIME;
        }
        return "";
    }

    /**
     * 根据JavaPojo对象字段名返回安全的数据库字段名, eg：`id`
     */
    public static String getSafeColumnNameByField(String fieldName) {
        if (fieldName == null) {
            return "";
        }
        fieldName = fieldName.trim();
        if (fieldName.length() <= 0) {
            return "";
        }
        if (fieldName.equals(ID)) {
            return COLUMN_NAME_ID;
        }
        if (fieldName.equals(NAME)) {
            return COLUMN_NAME_NAME;
        }
        if (fieldName.equals(PASSWORD)) {
            return COLUMN_NAME_PASSWORD;
        }
        if (fieldName.equals(APIPASSWORD)) {
            return COLUMN_NAME_APIPASSWORD;
        }
        if (fieldName.equals(STATUS)) {
            return COLUMN_NAME_STATUS;
        }
        if (fieldName.equals(TYPE)) {
            return COLUMN_NAME_TYPE;
        }
        if (fieldName.equals(ROLE)) {
            return COLUMN_NAME_ROLE;
        }
        if (fieldName.equals(TOKEN)) {
            return COLUMN_NAME_TOKEN;
        }
        if (fieldName.equals(UPDATETIME)) {
            return COLUMN_NAME_UPDATETIME;
        }
        if (fieldName.equals(CREATETIME)) {
            return COLUMN_NAME_CREATETIME;
        }
        return "";
    }

    /**
     * 根据JavaPojo对象字段名返回数据库字段名, eg：id
     */
    public static String getColumnNameByField(String fieldName) {
        if (fieldName == null) {
            return "";
        }
        fieldName = fieldName.trim();
        if (fieldName.length() <= 0) {
            return "";
        }
        if (fieldName.equals(ID)) {
            return COLUMN_NAME_ID.replace("`", "");
        }
        if (fieldName.equals(NAME)) {
            return COLUMN_NAME_NAME.replace("`", "");
        }
        if (fieldName.equals(PASSWORD)) {
            return COLUMN_NAME_PASSWORD.replace("`", "");
        }
        if (fieldName.equals(APIPASSWORD)) {
            return COLUMN_NAME_APIPASSWORD.replace("`", "");
        }
        if (fieldName.equals(STATUS)) {
            return COLUMN_NAME_STATUS.replace("`", "");
        }
        if (fieldName.equals(TYPE)) {
            return COLUMN_NAME_TYPE.replace("`", "");
        }
        if (fieldName.equals(ROLE)) {
            return COLUMN_NAME_ROLE.replace("`", "");
        }
        if (fieldName.equals(TOKEN)) {
            return COLUMN_NAME_TOKEN.replace("`", "");
        }
        if (fieldName.equals(UPDATETIME)) {
            return COLUMN_NAME_UPDATETIME.replace("`", "");
        }
        if (fieldName.equals(CREATETIME)) {
            return COLUMN_NAME_CREATETIME.replace("`", "");
        }
        return "";
    }
}
