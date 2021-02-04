package com.baidu.brcc.domain.meta;

/*
@Results({
       @Result(property = "id", column = "id", javaType = java.lang.Long.class, jdbcType = JdbcType.BIGINT, id = true),
       @Result(property = "userId", column = "user_id", javaType = java.lang.Long.class, jdbcType = JdbcType.BIGINT),
       @Result(property = "productId", column = "product_id", javaType = java.lang.Long.class, jdbcType = JdbcType.BIGINT),
       @Result(property = "projectId", column = "project_id", javaType = java.lang.Long.class, jdbcType = JdbcType.BIGINT),
       @Result(property = "environmentId", column = "environment_id", javaType = java.lang.Long.class, jdbcType = JdbcType.BIGINT),
       @Result(property = "versionId", column = "version_id", javaType = java.lang.Long.class, jdbcType = JdbcType.BIGINT),
       @Result(property = "groupId", column = "group_id", javaType = java.lang.Long.class, jdbcType = JdbcType.BIGINT),
       @Result(property = "groupName", column = "group_name", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
       @Result(property = "operator", column = "operator", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
       @Result(property = "createTime", column = "create_time", javaType = java.util.Date.class, jdbcType = JdbcType.TIMESTAMP),
       @Result(property = "oldContent", column = "old_content", javaType = java.lang.String.class, jdbcType = JdbcType.LONGVARCHAR),
       @Result(property = "newContent", column = "new_content", javaType = java.lang.String.class, jdbcType = JdbcType.LONGVARCHAR)
})
*/
public final class MetaConfigChangeLog {

    /**
     * 配置变更记录
     */
    public static final String TABLE_NAME = "`rcc_config_change_log`";

    /**
     * 编号
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
     * 所属产品线ID
     */
    public static final String PRODUCTID = "productId";

    public static final String COLUMN_NAME_PRODUCTID = "`product_id`";

    public static final String JAVA_TYPE_PRODUCTID = "java.lang.Long";

    public static final String JDBC_TYPE_PRODUCTID = "BIGINT";

    public static final String IS_KEY_PRODUCTID = "false";

    /**
     * 工程ID
     */
    public static final String PROJECTID = "projectId";

    public static final String COLUMN_NAME_PROJECTID = "`project_id`";

    public static final String JAVA_TYPE_PROJECTID = "java.lang.Long";

    public static final String JDBC_TYPE_PROJECTID = "BIGINT";

    public static final String IS_KEY_PROJECTID = "false";

    /**
     * 环境id
     */
    public static final String ENVIRONMENTID = "environmentId";

    public static final String COLUMN_NAME_ENVIRONMENTID = "`environment_id`";

    public static final String JAVA_TYPE_ENVIRONMENTID = "java.lang.Long";

    public static final String JDBC_TYPE_ENVIRONMENTID = "BIGINT";

    public static final String IS_KEY_ENVIRONMENTID = "false";

    /**
     * 版本id
     */
    public static final String VERSIONID = "versionId";

    public static final String COLUMN_NAME_VERSIONID = "`version_id`";

    public static final String JAVA_TYPE_VERSIONID = "java.lang.Long";

    public static final String JDBC_TYPE_VERSIONID = "BIGINT";

    public static final String IS_KEY_VERSIONID = "false";

    /**
     * 分组id
     */
    public static final String GROUPID = "groupId";

    public static final String COLUMN_NAME_GROUPID = "`group_id`";

    public static final String JAVA_TYPE_GROUPID = "java.lang.Long";

    public static final String JDBC_TYPE_GROUPID = "BIGINT";

    public static final String IS_KEY_GROUPID = "false";

    /**
     * 分组名称
     */
    public static final String GROUPNAME = "groupName";

    public static final String COLUMN_NAME_GROUPNAME = "`group_name`";

    public static final String JAVA_TYPE_GROUPNAME = "java.lang.String";

    public static final String JDBC_TYPE_GROUPNAME = "VARCHAR";

    public static final String IS_KEY_GROUPNAME = "false";

    /**
     * 操作人名称
     */
    public static final String OPERATOR = "operator";

    public static final String COLUMN_NAME_OPERATOR = "`operator`";

    public static final String JAVA_TYPE_OPERATOR = "java.lang.String";

    public static final String JDBC_TYPE_OPERATOR = "VARCHAR";

    public static final String IS_KEY_OPERATOR = "false";

    /**
     * 创建时间
     */
    public static final String CREATETIME = "createTime";

    public static final String COLUMN_NAME_CREATETIME = "`create_time`";

    public static final String JAVA_TYPE_CREATETIME = "java.util.Date";

    public static final String JDBC_TYPE_CREATETIME = "TIMESTAMP";

    public static final String IS_KEY_CREATETIME = "false";

    /**
     * 原配置
     */
    public static final String OLDCONTENT = "oldContent";

    public static final String COLUMN_NAME_OLDCONTENT = "`old_content`";

    public static final String JAVA_TYPE_OLDCONTENT = "java.lang.String";

    public static final String JDBC_TYPE_OLDCONTENT = "LONGVARCHAR";

    public static final String IS_KEY_OLDCONTENT = "false";

    /**
     * 新配置
     */
    public static final String NEWCONTENT = "newContent";

    public static final String COLUMN_NAME_NEWCONTENT = "`new_content`";

    public static final String JAVA_TYPE_NEWCONTENT = "java.lang.String";

    public static final String JDBC_TYPE_NEWCONTENT = "LONGVARCHAR";

    public static final String IS_KEY_NEWCONTENT = "false";

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
        if (columnName.equals(COLUMN_NAME_PRODUCTID)) {
            return PRODUCTID;
        }
        if (columnName.equals(COLUMN_NAME_PROJECTID)) {
            return PROJECTID;
        }
        if (columnName.equals(COLUMN_NAME_ENVIRONMENTID)) {
            return ENVIRONMENTID;
        }
        if (columnName.equals(COLUMN_NAME_VERSIONID)) {
            return VERSIONID;
        }
        if (columnName.equals(COLUMN_NAME_GROUPID)) {
            return GROUPID;
        }
        if (columnName.equals(COLUMN_NAME_GROUPNAME)) {
            return GROUPNAME;
        }
        if (columnName.equals(COLUMN_NAME_OPERATOR)) {
            return OPERATOR;
        }
        if (columnName.equals(COLUMN_NAME_CREATETIME)) {
            return CREATETIME;
        }
        if (columnName.equals(COLUMN_NAME_OLDCONTENT)) {
            return OLDCONTENT;
        }
        if (columnName.equals(COLUMN_NAME_NEWCONTENT)) {
            return NEWCONTENT;
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
        if (fieldName.equals(PRODUCTID)) {
            return COLUMN_NAME_PRODUCTID;
        }
        if (fieldName.equals(PROJECTID)) {
            return COLUMN_NAME_PROJECTID;
        }
        if (fieldName.equals(ENVIRONMENTID)) {
            return COLUMN_NAME_ENVIRONMENTID;
        }
        if (fieldName.equals(VERSIONID)) {
            return COLUMN_NAME_VERSIONID;
        }
        if (fieldName.equals(GROUPID)) {
            return COLUMN_NAME_GROUPID;
        }
        if (fieldName.equals(GROUPNAME)) {
            return COLUMN_NAME_GROUPNAME;
        }
        if (fieldName.equals(OPERATOR)) {
            return COLUMN_NAME_OPERATOR;
        }
        if (fieldName.equals(CREATETIME)) {
            return COLUMN_NAME_CREATETIME;
        }
        if (fieldName.equals(OLDCONTENT)) {
            return COLUMN_NAME_OLDCONTENT;
        }
        if (fieldName.equals(NEWCONTENT)) {
            return COLUMN_NAME_NEWCONTENT;
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
        if (fieldName.equals(PRODUCTID)) {
            return COLUMN_NAME_PRODUCTID.replace("`", "");
        }
        if (fieldName.equals(PROJECTID)) {
            return COLUMN_NAME_PROJECTID.replace("`", "");
        }
        if (fieldName.equals(ENVIRONMENTID)) {
            return COLUMN_NAME_ENVIRONMENTID.replace("`", "");
        }
        if (fieldName.equals(VERSIONID)) {
            return COLUMN_NAME_VERSIONID.replace("`", "");
        }
        if (fieldName.equals(GROUPID)) {
            return COLUMN_NAME_GROUPID.replace("`", "");
        }
        if (fieldName.equals(GROUPNAME)) {
            return COLUMN_NAME_GROUPNAME.replace("`", "");
        }
        if (fieldName.equals(OPERATOR)) {
            return COLUMN_NAME_OPERATOR.replace("`", "");
        }
        if (fieldName.equals(CREATETIME)) {
            return COLUMN_NAME_CREATETIME.replace("`", "");
        }
        if (fieldName.equals(OLDCONTENT)) {
            return COLUMN_NAME_OLDCONTENT.replace("`", "");
        }
        if (fieldName.equals(NEWCONTENT)) {
            return COLUMN_NAME_NEWCONTENT.replace("`", "");
        }
        return "";
    }
}
