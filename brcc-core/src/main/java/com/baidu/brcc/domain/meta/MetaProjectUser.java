package com.baidu.brcc.domain.meta;

/*
@Results({
       @Result(property = "id", column = "id", javaType = java.lang.Long.class, jdbcType = JdbcType.BIGINT, id = true),
       @Result(property = "productId", column = "product_id", javaType = java.lang.Long.class, jdbcType = JdbcType.BIGINT),
       @Result(property = "projectId", column = "project_id", javaType = java.lang.Long.class, jdbcType = JdbcType.BIGINT),
       @Result(property = "userId", column = "user_id", javaType = java.lang.Long.class, jdbcType = JdbcType.BIGINT),
       @Result(property = "userName", column = "user_name", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
       @Result(property = "isAdmin", column = "is_admin", javaType = java.lang.Byte.class, jdbcType = JdbcType.TINYINT),
       @Result(property = "updateTime", column = "update_time", javaType = java.util.Date.class, jdbcType = JdbcType.TIMESTAMP),
       @Result(property = "createTime", column = "create_time", javaType = java.util.Date.class, jdbcType = JdbcType.TIMESTAMP)
})
*/
public final class MetaProjectUser {

    /**
     * 工程用户关系
     */
    public static final String TABLE_NAME = "`rcc_project_user`";

    /**
     * 编号
     */
    public static final String ID = "id";

    public static final String COLUMN_NAME_ID = "`id`";

    public static final String JAVA_TYPE_ID = "java.lang.Long";

    public static final String JDBC_TYPE_ID = "BIGINT";

    public static final String IS_KEY_ID = "true";

    /**
     * 所属产品线ID
     */
    public static final String PRODUCTID = "productId";

    public static final String COLUMN_NAME_PRODUCTID = "`product_id`";

    public static final String JAVA_TYPE_PRODUCTID = "java.lang.Long";

    public static final String JDBC_TYPE_PRODUCTID = "BIGINT";

    public static final String IS_KEY_PRODUCTID = "false";

    /**
     * 工程id
     */
    public static final String PROJECTID = "projectId";

    public static final String COLUMN_NAME_PROJECTID = "`project_id`";

    public static final String JAVA_TYPE_PROJECTID = "java.lang.Long";

    public static final String JDBC_TYPE_PROJECTID = "BIGINT";

    public static final String IS_KEY_PROJECTID = "false";

    /**
     * 用户id
     */
    public static final String USERID = "userId";

    public static final String COLUMN_NAME_USERID = "`user_id`";

    public static final String JAVA_TYPE_USERID = "java.lang.Long";

    public static final String JDBC_TYPE_USERID = "BIGINT";

    public static final String IS_KEY_USERID = "false";

    /**
     * 用户名
     */
    public static final String USERNAME = "userName";

    public static final String COLUMN_NAME_USERNAME = "`user_name`";

    public static final String JAVA_TYPE_USERNAME = "java.lang.String";

    public static final String JDBC_TYPE_USERNAME = "VARCHAR";

    public static final String IS_KEY_USERNAME = "false";

    /**
     * 是否管理员, 0-否，1-是
     */
    public static final String ISADMIN = "isAdmin";

    public static final String COLUMN_NAME_ISADMIN = "`is_admin`";

    public static final String JAVA_TYPE_ISADMIN = "java.lang.Byte";

    public static final String JDBC_TYPE_ISADMIN = "TINYINT";

    public static final String IS_KEY_ISADMIN = "false";

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
        if (columnName.equals(COLUMN_NAME_PRODUCTID)) {
            return PRODUCTID;
        }
        if (columnName.equals(COLUMN_NAME_PROJECTID)) {
            return PROJECTID;
        }
        if (columnName.equals(COLUMN_NAME_USERID)) {
            return USERID;
        }
        if (columnName.equals(COLUMN_NAME_USERNAME)) {
            return USERNAME;
        }
        if (columnName.equals(COLUMN_NAME_ISADMIN)) {
            return ISADMIN;
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
        if (fieldName.equals(PRODUCTID)) {
            return COLUMN_NAME_PRODUCTID;
        }
        if (fieldName.equals(PROJECTID)) {
            return COLUMN_NAME_PROJECTID;
        }
        if (fieldName.equals(USERID)) {
            return COLUMN_NAME_USERID;
        }
        if (fieldName.equals(USERNAME)) {
            return COLUMN_NAME_USERNAME;
        }
        if (fieldName.equals(ISADMIN)) {
            return COLUMN_NAME_ISADMIN;
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
        if (fieldName.equals(PRODUCTID)) {
            return COLUMN_NAME_PRODUCTID.replace("`", "");
        }
        if (fieldName.equals(PROJECTID)) {
            return COLUMN_NAME_PROJECTID.replace("`", "");
        }
        if (fieldName.equals(USERID)) {
            return COLUMN_NAME_USERID.replace("`", "");
        }
        if (fieldName.equals(USERNAME)) {
            return COLUMN_NAME_USERNAME.replace("`", "");
        }
        if (fieldName.equals(ISADMIN)) {
            return COLUMN_NAME_ISADMIN.replace("`", "");
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
