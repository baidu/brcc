package com.baidu.brcc.domain.meta;

/*
@Results({
       @Result(property = "id", column = "id", javaType = java.lang.Long.class, jdbcType = JdbcType.BIGINT, id = true),
       @Result(property = "userId", column = "user_id", javaType = java.lang.Long.class, jdbcType = JdbcType.BIGINT),
       @Result(property = "operator", column = "operator", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
       @Result(property = "scene", column = "scene", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
       @Result(property = "response", column = "response", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
       @Result(property = "remoteAddress", column = "remote_address", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
       @Result(property = "createTime", column = "create_time", javaType = java.util.Date.class, jdbcType = JdbcType.TIMESTAMP),
       @Result(property = "request", column = "request", javaType = java.lang.String.class, jdbcType = JdbcType.LONGVARCHAR)
})
*/
public final class MetaOperationLog {

    /**
     * 操作日志表
     */
    public static final String TABLE_NAME = "`rcc_operation_log`";

    /**
     * 自增ID
     */
    public static final String ID = "id";

    public static final String COLUMN_NAME_ID = "`id`";

    public static final String JAVA_TYPE_ID = "java.lang.Long";

    public static final String JDBC_TYPE_ID = "BIGINT";

    public static final String IS_KEY_ID = "true";

    /**
     * 操作人ID
     */
    public static final String USERID = "userId";

    public static final String COLUMN_NAME_USERID = "`user_id`";

    public static final String JAVA_TYPE_USERID = "java.lang.Long";

    public static final String JDBC_TYPE_USERID = "BIGINT";

    public static final String IS_KEY_USERID = "false";

    /**
     * 操作人名称
     */
    public static final String OPERATOR = "operator";

    public static final String COLUMN_NAME_OPERATOR = "`operator`";

    public static final String JAVA_TYPE_OPERATOR = "java.lang.String";

    public static final String JDBC_TYPE_OPERATOR = "VARCHAR";

    public static final String IS_KEY_OPERATOR = "false";

    /**
     * 场景
     */
    public static final String SCENE = "scene";

    public static final String COLUMN_NAME_SCENE = "`scene`";

    public static final String JAVA_TYPE_SCENE = "java.lang.String";

    public static final String JDBC_TYPE_SCENE = "VARCHAR";

    public static final String IS_KEY_SCENE = "false";

    /**
     * 返回参数
     */
    public static final String RESPONSE = "response";

    public static final String COLUMN_NAME_RESPONSE = "`response`";

    public static final String JAVA_TYPE_RESPONSE = "java.lang.String";

    public static final String JDBC_TYPE_RESPONSE = "VARCHAR";

    public static final String IS_KEY_RESPONSE = "false";

    /**
     * 操作地址
     */
    public static final String REMOTEADDRESS = "remoteAddress";

    public static final String COLUMN_NAME_REMOTEADDRESS = "`remote_address`";

    public static final String JAVA_TYPE_REMOTEADDRESS = "java.lang.String";

    public static final String JDBC_TYPE_REMOTEADDRESS = "VARCHAR";

    public static final String IS_KEY_REMOTEADDRESS = "false";

    /**
     * 创建时间
     */
    public static final String CREATETIME = "createTime";

    public static final String COLUMN_NAME_CREATETIME = "`create_time`";

    public static final String JAVA_TYPE_CREATETIME = "java.util.Date";

    public static final String JDBC_TYPE_CREATETIME = "TIMESTAMP";

    public static final String IS_KEY_CREATETIME = "false";

    /**
     * 请求参数
     */
    public static final String REQUEST = "request";

    public static final String COLUMN_NAME_REQUEST = "`request`";

    public static final String JAVA_TYPE_REQUEST = "java.lang.String";

    public static final String JDBC_TYPE_REQUEST = "LONGVARCHAR";

    public static final String IS_KEY_REQUEST = "false";

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
        if (columnName.equals(COLUMN_NAME_USERID)) {
            return USERID;
        }
        if (columnName.equals(COLUMN_NAME_OPERATOR)) {
            return OPERATOR;
        }
        if (columnName.equals(COLUMN_NAME_SCENE)) {
            return SCENE;
        }
        if (columnName.equals(COLUMN_NAME_RESPONSE)) {
            return RESPONSE;
        }
        if (columnName.equals(COLUMN_NAME_REMOTEADDRESS)) {
            return REMOTEADDRESS;
        }
        if (columnName.equals(COLUMN_NAME_CREATETIME)) {
            return CREATETIME;
        }
        if (columnName.equals(COLUMN_NAME_REQUEST)) {
            return REQUEST;
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
        if (fieldName.equals(USERID)) {
            return COLUMN_NAME_USERID;
        }
        if (fieldName.equals(OPERATOR)) {
            return COLUMN_NAME_OPERATOR;
        }
        if (fieldName.equals(SCENE)) {
            return COLUMN_NAME_SCENE;
        }
        if (fieldName.equals(RESPONSE)) {
            return COLUMN_NAME_RESPONSE;
        }
        if (fieldName.equals(REMOTEADDRESS)) {
            return COLUMN_NAME_REMOTEADDRESS;
        }
        if (fieldName.equals(CREATETIME)) {
            return COLUMN_NAME_CREATETIME;
        }
        if (fieldName.equals(REQUEST)) {
            return COLUMN_NAME_REQUEST;
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
        if (fieldName.equals(USERID)) {
            return COLUMN_NAME_USERID.replace("`", "");
        }
        if (fieldName.equals(OPERATOR)) {
            return COLUMN_NAME_OPERATOR.replace("`", "");
        }
        if (fieldName.equals(SCENE)) {
            return COLUMN_NAME_SCENE.replace("`", "");
        }
        if (fieldName.equals(RESPONSE)) {
            return COLUMN_NAME_RESPONSE.replace("`", "");
        }
        if (fieldName.equals(REMOTEADDRESS)) {
            return COLUMN_NAME_REMOTEADDRESS.replace("`", "");
        }
        if (fieldName.equals(CREATETIME)) {
            return COLUMN_NAME_CREATETIME.replace("`", "");
        }
        if (fieldName.equals(REQUEST)) {
            return COLUMN_NAME_REQUEST.replace("`", "");
        }
        return "";
    }
}
