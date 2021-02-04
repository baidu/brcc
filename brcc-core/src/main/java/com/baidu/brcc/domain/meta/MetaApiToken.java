package com.baidu.brcc.domain.meta;

/*
@Results({
       @Result(property = "id", column = "id", javaType = java.lang.Long.class, jdbcType = JdbcType.BIGINT, id = true),
       @Result(property = "token", column = "token", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
       @Result(property = "projectId", column = "project_id", javaType = java.lang.Long.class, jdbcType = JdbcType.BIGINT),
       @Result(property = "projectName", column = "project_name", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
       @Result(property = "expireNever", column = "expire_never", javaType = java.lang.Byte.class, jdbcType = JdbcType.TINYINT),
       @Result(property = "expireTime", column = "expire_time", javaType = java.util.Date.class, jdbcType = JdbcType.TIMESTAMP),
       @Result(property = "deleted", column = "deleted", javaType = java.lang.Byte.class, jdbcType = JdbcType.TINYINT),
       @Result(property = "updateTime", column = "update_time", javaType = java.util.Date.class, jdbcType = JdbcType.TIMESTAMP),
       @Result(property = "createTime", column = "create_time", javaType = java.util.Date.class, jdbcType = JdbcType.TIMESTAMP)
})
*/
public final class MetaApiToken {

    /**
     * api token
     */
    public static final String TABLE_NAME = "`rcc_api_token`";

    /**
     * 编号
     */
    public static final String ID = "id";

    public static final String COLUMN_NAME_ID = "`id`";

    public static final String JAVA_TYPE_ID = "java.lang.Long";

    public static final String JDBC_TYPE_ID = "BIGINT";

    public static final String IS_KEY_ID = "true";

    /**
     * api token
     */
    public static final String TOKEN = "token";

    public static final String COLUMN_NAME_TOKEN = "`token`";

    public static final String JAVA_TYPE_TOKEN = "java.lang.String";

    public static final String JDBC_TYPE_TOKEN = "VARCHAR";

    public static final String IS_KEY_TOKEN = "false";

    /**
     * 工程ID
     */
    public static final String PROJECTID = "projectId";

    public static final String COLUMN_NAME_PROJECTID = "`project_id`";

    public static final String JAVA_TYPE_PROJECTID = "java.lang.Long";

    public static final String JDBC_TYPE_PROJECTID = "BIGINT";

    public static final String IS_KEY_PROJECTID = "false";

    /**
     * 工程名称
     */
    public static final String PROJECTNAME = "projectName";

    public static final String COLUMN_NAME_PROJECTNAME = "`project_name`";

    public static final String JAVA_TYPE_PROJECTNAME = "java.lang.String";

    public static final String JDBC_TYPE_PROJECTNAME = "VARCHAR";

    public static final String IS_KEY_PROJECTNAME = "false";

    /**
     * 是否过期，1-永不过期，0-非永不过期
     */
    public static final String EXPIRENEVER = "expireNever";

    public static final String COLUMN_NAME_EXPIRENEVER = "`expire_never`";

    public static final String JAVA_TYPE_EXPIRENEVER = "java.lang.Byte";

    public static final String JDBC_TYPE_EXPIRENEVER = "TINYINT";

    public static final String IS_KEY_EXPIRENEVER = "false";

    /**
     * 过期时间
     */
    public static final String EXPIRETIME = "expireTime";

    public static final String COLUMN_NAME_EXPIRETIME = "`expire_time`";

    public static final String JAVA_TYPE_EXPIRETIME = "java.util.Date";

    public static final String JDBC_TYPE_EXPIRETIME = "TIMESTAMP";

    public static final String IS_KEY_EXPIRETIME = "false";

    /**
     * 删除标志，1-已删除
     */
    public static final String DELETED = "deleted";

    public static final String COLUMN_NAME_DELETED = "`deleted`";

    public static final String JAVA_TYPE_DELETED = "java.lang.Byte";

    public static final String JDBC_TYPE_DELETED = "TINYINT";

    public static final String IS_KEY_DELETED = "false";

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
        if (columnName.equals(COLUMN_NAME_TOKEN)) {
            return TOKEN;
        }
        if (columnName.equals(COLUMN_NAME_PROJECTID)) {
            return PROJECTID;
        }
        if (columnName.equals(COLUMN_NAME_PROJECTNAME)) {
            return PROJECTNAME;
        }
        if (columnName.equals(COLUMN_NAME_EXPIRENEVER)) {
            return EXPIRENEVER;
        }
        if (columnName.equals(COLUMN_NAME_EXPIRETIME)) {
            return EXPIRETIME;
        }
        if (columnName.equals(COLUMN_NAME_DELETED)) {
            return DELETED;
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
        if (fieldName.equals(TOKEN)) {
            return COLUMN_NAME_TOKEN;
        }
        if (fieldName.equals(PROJECTID)) {
            return COLUMN_NAME_PROJECTID;
        }
        if (fieldName.equals(PROJECTNAME)) {
            return COLUMN_NAME_PROJECTNAME;
        }
        if (fieldName.equals(EXPIRENEVER)) {
            return COLUMN_NAME_EXPIRENEVER;
        }
        if (fieldName.equals(EXPIRETIME)) {
            return COLUMN_NAME_EXPIRETIME;
        }
        if (fieldName.equals(DELETED)) {
            return COLUMN_NAME_DELETED;
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
        if (fieldName.equals(TOKEN)) {
            return COLUMN_NAME_TOKEN.replace("`", "");
        }
        if (fieldName.equals(PROJECTID)) {
            return COLUMN_NAME_PROJECTID.replace("`", "");
        }
        if (fieldName.equals(PROJECTNAME)) {
            return COLUMN_NAME_PROJECTNAME.replace("`", "");
        }
        if (fieldName.equals(EXPIRENEVER)) {
            return COLUMN_NAME_EXPIRENEVER.replace("`", "");
        }
        if (fieldName.equals(EXPIRETIME)) {
            return COLUMN_NAME_EXPIRETIME.replace("`", "");
        }
        if (fieldName.equals(DELETED)) {
            return COLUMN_NAME_DELETED.replace("`", "");
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
