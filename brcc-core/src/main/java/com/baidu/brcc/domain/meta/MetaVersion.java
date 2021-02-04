package com.baidu.brcc.domain.meta;

/*
@Results({
       @Result(property = "id", column = "id", javaType = java.lang.Long.class, jdbcType = JdbcType.BIGINT, id = true),
       @Result(property = "name", column = "name", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
       @Result(property = "productId", column = "product_id", javaType = java.lang.Long.class, jdbcType = JdbcType.BIGINT),
       @Result(property = "memo", column = "memo", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
       @Result(property = "projectId", column = "project_id", javaType = java.lang.Long.class, jdbcType = JdbcType.BIGINT),
       @Result(property = "environmentId", column = "environment_id", javaType = java.lang.Long.class, jdbcType = JdbcType.BIGINT),
       @Result(property = "checkSum", column = "check_sum", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
       @Result(property = "checkSumDate", column = "check_sum_date", javaType = java.util.Date.class, jdbcType = JdbcType.TIMESTAMP),
       @Result(property = "checkSumEnable", column = "check_sum_enable", javaType = java.lang.Byte.class, jdbcType = JdbcType.TINYINT),
       @Result(property = "deleted", column = "deleted", javaType = java.lang.Byte.class, jdbcType = JdbcType.TINYINT),
       @Result(property = "updateTime", column = "update_time", javaType = java.util.Date.class, jdbcType = JdbcType.TIMESTAMP),
       @Result(property = "createTime", column = "create_time", javaType = java.util.Date.class, jdbcType = JdbcType.TIMESTAMP)
})
*/
public final class MetaVersion {

    /**
     * 版本
     */
    public static final String TABLE_NAME = "`rcc_version`";

    /**
     * 编号
     */
    public static final String ID = "id";

    public static final String COLUMN_NAME_ID = "`id`";

    public static final String JAVA_TYPE_ID = "java.lang.Long";

    public static final String JDBC_TYPE_ID = "BIGINT";

    public static final String IS_KEY_ID = "true";

    /**
     * 版本名称
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
     * 版本描述
     */
    public static final String MEMO = "memo";

    public static final String COLUMN_NAME_MEMO = "`memo`";

    public static final String JAVA_TYPE_MEMO = "java.lang.String";

    public static final String JDBC_TYPE_MEMO = "VARCHAR";

    public static final String IS_KEY_MEMO = "false";

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
     * 更新标识，由该标识识别是否有配置更新
     */
    public static final String CHECKSUM = "checkSum";

    public static final String COLUMN_NAME_CHECKSUM = "`check_sum`";

    public static final String JAVA_TYPE_CHECKSUM = "java.lang.String";

    public static final String JDBC_TYPE_CHECKSUM = "VARCHAR";

    public static final String IS_KEY_CHECKSUM = "false";

    /**
     * check_sum最后提交时间
     */
    public static final String CHECKSUMDATE = "checkSumDate";

    public static final String COLUMN_NAME_CHECKSUMDATE = "`check_sum_date`";

    public static final String JAVA_TYPE_CHECKSUMDATE = "java.util.Date";

    public static final String JDBC_TYPE_CHECKSUMDATE = "TIMESTAMP";

    public static final String IS_KEY_CHECKSUMDATE = "false";

    /**
     * 是否运行check检查。1-检查, 0-不检查
     */
    public static final String CHECKSUMENABLE = "checkSumEnable";

    public static final String COLUMN_NAME_CHECKSUMENABLE = "`check_sum_enable`";

    public static final String JAVA_TYPE_CHECKSUMENABLE = "java.lang.Byte";

    public static final String JDBC_TYPE_CHECKSUMENABLE = "TINYINT";

    public static final String IS_KEY_CHECKSUMENABLE = "false";

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
        if (columnName.equals(COLUMN_NAME_PROJECTID)) {
            return PROJECTID;
        }
        if (columnName.equals(COLUMN_NAME_ENVIRONMENTID)) {
            return ENVIRONMENTID;
        }
        if (columnName.equals(COLUMN_NAME_CHECKSUM)) {
            return CHECKSUM;
        }
        if (columnName.equals(COLUMN_NAME_CHECKSUMDATE)) {
            return CHECKSUMDATE;
        }
        if (columnName.equals(COLUMN_NAME_CHECKSUMENABLE)) {
            return CHECKSUMENABLE;
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
        if (fieldName.equals(PROJECTID)) {
            return COLUMN_NAME_PROJECTID;
        }
        if (fieldName.equals(ENVIRONMENTID)) {
            return COLUMN_NAME_ENVIRONMENTID;
        }
        if (fieldName.equals(CHECKSUM)) {
            return COLUMN_NAME_CHECKSUM;
        }
        if (fieldName.equals(CHECKSUMDATE)) {
            return COLUMN_NAME_CHECKSUMDATE;
        }
        if (fieldName.equals(CHECKSUMENABLE)) {
            return COLUMN_NAME_CHECKSUMENABLE;
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
        if (fieldName.equals(PROJECTID)) {
            return COLUMN_NAME_PROJECTID.replace("`", "");
        }
        if (fieldName.equals(ENVIRONMENTID)) {
            return COLUMN_NAME_ENVIRONMENTID.replace("`", "");
        }
        if (fieldName.equals(CHECKSUM)) {
            return COLUMN_NAME_CHECKSUM.replace("`", "");
        }
        if (fieldName.equals(CHECKSUMDATE)) {
            return COLUMN_NAME_CHECKSUMDATE.replace("`", "");
        }
        if (fieldName.equals(CHECKSUMENABLE)) {
            return COLUMN_NAME_CHECKSUMENABLE.replace("`", "");
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
