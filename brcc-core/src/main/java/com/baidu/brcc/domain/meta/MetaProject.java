package com.baidu.brcc.domain.meta;

/*
@Results({
       @Result(property = "id", column = "id", javaType = java.lang.Long.class, jdbcType = JdbcType.BIGINT, id = true),
       @Result(property = "name", column = "name", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
       @Result(property = "productId", column = "product_id", javaType = java.lang.Long.class, jdbcType = JdbcType.BIGINT),
       @Result(property = "memo", column = "memo", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
       @Result(property = "projectType", column = "project_type", javaType = java.lang.Byte.class, jdbcType = JdbcType.TINYINT),
       @Result(property = "dependencyIds", column = "dependency_ids", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
       @Result(property = "dependencyNames", column = "dependency_names", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
       @Result(property = "mailReceiver", column = "mail_receiver", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
       @Result(property = "apiPassword", column = "api_password", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
       @Result(property = "apiToken", column = "api_token", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
       @Result(property = "deleted", column = "deleted", javaType = java.lang.Byte.class, jdbcType = JdbcType.TINYINT),
       @Result(property = "updateTime", column = "update_time", javaType = java.util.Date.class, jdbcType = JdbcType.TIMESTAMP),
       @Result(property = "createTime", column = "create_time", javaType = java.util.Date.class, jdbcType = JdbcType.TIMESTAMP)
})
*/
public final class MetaProject {

    /**
     * 工程
     */
    public static final String TABLE_NAME = "`rcc_project`";

    /**
     * 编号
     */
    public static final String ID = "id";

    public static final String COLUMN_NAME_ID = "`id`";

    public static final String JAVA_TYPE_ID = "java.lang.Long";

    public static final String JDBC_TYPE_ID = "BIGINT";

    public static final String IS_KEY_ID = "true";

    /**
     * 工程名称
     */
    public static final String NAME = "name";

    public static final String COLUMN_NAME_NAME = "`name`";

    public static final String JAVA_TYPE_NAME = "java.lang.String";

    public static final String JDBC_TYPE_NAME = "VARCHAR";

    public static final String IS_KEY_NAME = "false";

    /**
     * 所属产品线ID
     */
    public static final String PRODUCTID = "productId";

    public static final String COLUMN_NAME_PRODUCTID = "`product_id`";

    public static final String JAVA_TYPE_PRODUCTID = "java.lang.Long";

    public static final String JDBC_TYPE_PRODUCTID = "BIGINT";

    public static final String IS_KEY_PRODUCTID = "false";

    /**
     * 工程描述
     */
    public static final String MEMO = "memo";

    public static final String COLUMN_NAME_MEMO = "`memo`";

    public static final String JAVA_TYPE_MEMO = "java.lang.String";

    public static final String JDBC_TYPE_MEMO = "VARCHAR";

    public static final String IS_KEY_MEMO = "false";

    /**
     * 工程类型,0:公共 1:私有
     */
    public static final String PROJECTTYPE = "projectType";

    public static final String COLUMN_NAME_PROJECTTYPE = "`project_type`";

    public static final String JAVA_TYPE_PROJECTTYPE = "java.lang.Byte";

    public static final String JDBC_TYPE_PROJECTTYPE = "TINYINT";

    public static final String IS_KEY_PROJECTTYPE = "false";

    /**
     * 依赖工程id列表
     */
    public static final String DEPENDENCYIDS = "dependencyIds";

    public static final String COLUMN_NAME_DEPENDENCYIDS = "`dependency_ids`";

    public static final String JAVA_TYPE_DEPENDENCYIDS = "java.lang.String";

    public static final String JDBC_TYPE_DEPENDENCYIDS = "VARCHAR";

    public static final String IS_KEY_DEPENDENCYIDS = "false";

    /**
     * 依赖工程名
     */
    public static final String DEPENDENCYNAMES = "dependencyNames";

    public static final String COLUMN_NAME_DEPENDENCYNAMES = "`dependency_names`";

    public static final String JAVA_TYPE_DEPENDENCYNAMES = "java.lang.String";

    public static final String JDBC_TYPE_DEPENDENCYNAMES = "VARCHAR";

    public static final String IS_KEY_DEPENDENCYNAMES = "false";

    /**
     * 变更邮件接收人
     */
    public static final String MAILRECEIVER = "mailReceiver";

    public static final String COLUMN_NAME_MAILRECEIVER = "`mail_receiver`";

    public static final String JAVA_TYPE_MAILRECEIVER = "java.lang.String";

    public static final String JDBC_TYPE_MAILRECEIVER = "VARCHAR";

    public static final String IS_KEY_MAILRECEIVER = "false";

    public static final String APIPASSWORD = "apiPassword";

    public static final String COLUMN_NAME_APIPASSWORD = "`api_password`";

    public static final String JAVA_TYPE_APIPASSWORD = "java.lang.String";

    public static final String JDBC_TYPE_APIPASSWORD = "VARCHAR";

    public static final String IS_KEY_APIPASSWORD = "false";

    /**
     * api token
     */
    public static final String APITOKEN = "apiToken";

    public static final String COLUMN_NAME_APITOKEN = "`api_token`";

    public static final String JAVA_TYPE_APITOKEN = "java.lang.String";

    public static final String JDBC_TYPE_APITOKEN = "VARCHAR";

    public static final String IS_KEY_APITOKEN = "false";

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
        if (columnName.equals(COLUMN_NAME_NAME)) {
            return NAME;
        }
        if (columnName.equals(COLUMN_NAME_PRODUCTID)) {
            return PRODUCTID;
        }
        if (columnName.equals(COLUMN_NAME_MEMO)) {
            return MEMO;
        }
        if (columnName.equals(COLUMN_NAME_PROJECTTYPE)) {
            return PROJECTTYPE;
        }
        if (columnName.equals(COLUMN_NAME_DEPENDENCYIDS)) {
            return DEPENDENCYIDS;
        }
        if (columnName.equals(COLUMN_NAME_DEPENDENCYNAMES)) {
            return DEPENDENCYNAMES;
        }
        if (columnName.equals(COLUMN_NAME_MAILRECEIVER)) {
            return MAILRECEIVER;
        }
        if (columnName.equals(COLUMN_NAME_APIPASSWORD)) {
            return APIPASSWORD;
        }
        if (columnName.equals(COLUMN_NAME_APITOKEN)) {
            return APITOKEN;
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
        if (fieldName.equals(NAME)) {
            return COLUMN_NAME_NAME;
        }
        if (fieldName.equals(PRODUCTID)) {
            return COLUMN_NAME_PRODUCTID;
        }
        if (fieldName.equals(MEMO)) {
            return COLUMN_NAME_MEMO;
        }
        if (fieldName.equals(PROJECTTYPE)) {
            return COLUMN_NAME_PROJECTTYPE;
        }
        if (fieldName.equals(DEPENDENCYIDS)) {
            return COLUMN_NAME_DEPENDENCYIDS;
        }
        if (fieldName.equals(DEPENDENCYNAMES)) {
            return COLUMN_NAME_DEPENDENCYNAMES;
        }
        if (fieldName.equals(MAILRECEIVER)) {
            return COLUMN_NAME_MAILRECEIVER;
        }
        if (fieldName.equals(APIPASSWORD)) {
            return COLUMN_NAME_APIPASSWORD;
        }
        if (fieldName.equals(APITOKEN)) {
            return COLUMN_NAME_APITOKEN;
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
        if (fieldName.equals(NAME)) {
            return COLUMN_NAME_NAME.replace("`", "");
        }
        if (fieldName.equals(PRODUCTID)) {
            return COLUMN_NAME_PRODUCTID.replace("`", "");
        }
        if (fieldName.equals(MEMO)) {
            return COLUMN_NAME_MEMO.replace("`", "");
        }
        if (fieldName.equals(PROJECTTYPE)) {
            return COLUMN_NAME_PROJECTTYPE.replace("`", "");
        }
        if (fieldName.equals(DEPENDENCYIDS)) {
            return COLUMN_NAME_DEPENDENCYIDS.replace("`", "");
        }
        if (fieldName.equals(DEPENDENCYNAMES)) {
            return COLUMN_NAME_DEPENDENCYNAMES.replace("`", "");
        }
        if (fieldName.equals(MAILRECEIVER)) {
            return COLUMN_NAME_MAILRECEIVER.replace("`", "");
        }
        if (fieldName.equals(APIPASSWORD)) {
            return COLUMN_NAME_APIPASSWORD.replace("`", "");
        }
        if (fieldName.equals(APITOKEN)) {
            return COLUMN_NAME_APITOKEN.replace("`", "");
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
