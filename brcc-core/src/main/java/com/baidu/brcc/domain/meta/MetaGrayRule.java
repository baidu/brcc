package com.baidu.brcc.domain.meta;

public final class MetaGrayRule {
    /**
     * 灰度规则
     */
    public static final String TABLE_NAME = "`rcc_gray_rule`";

    /**
     * 编号
     */
    public static final String ID = "id";

    public static final String COLUMN_NAME_ID = "`id`";

    public static final String JAVA_TYPE_ID = "java.lang.Long";

    public static final String JDBC_TYPE_ID = "BIGINT";

    public static final String IS_KEY_ID = "true";

    /**
     * 版本ID
     */
    public static final String VERSIONID = "versionId";

    public static final String COLUMN_NAME_VERSIONID = "`version_id`";

    public static final String JAVA_TYPE_VERSIONID = "java.lang.Long";

    public static final String JDBC_TYPE_VERSIONID = "BIGINT";

    public static final String IS_KEY_VERSIONID = "false";

    /**
     * 灰度版本ID
     */
    public static final String GRAYVERSIONID = "grayVersionId";

    public static final String COLUMN_NAME_GRAYVERSIONID = "`gray_version_id`";

    public static final String JAVA_TYPE_GRAYVERSIONID = "java.lang.Long";

    public static final String JDBC_TYPE_GRAYVERSIONID = "BIGINT";

    public static final String IS_KEY_GRAYVERSIONID = "false";

    /**
     * 灰度类型
     */
    public static final String GRAYTYPE = "grayType";

    public static final String COLUMN_NAME_GRAYTYPE = "`gray_type`";

    public static final String JAVA_TYPE_GRAYTYPE = "java.lang.Byte";

    public static final String JDBC_TYPE_GRAYTYPE = "TINYINT";

    public static final String IS_KEY_GRAYTYPE = "false";

    /**
     * 灰度实例个数
     */
    public static final String INSTANCECOUNT = "instanceCount";

    public static final String COLUMN_NAME_INSTANCECOUNT = "`instance_count`";

    public static final String JAVA_TYPE_INSTANCECOUNT = "java.lang.Long";

    public static final String JDBC_TYPE_INSTANCECOUNT = "BIGINT";

    public static final String IS_KEY_INSTANCECOUNT = "false";

    /**
     * 灰度实例IP
     */
    public static final String INSTANCEIP = "instanceIp";

    public static final String COLUMN_NAME_INSTANCEIP = "`instance_ip`";

    public static final String JAVA_TYPE_INSTANCEIP = "java.lang.String";

    public static final String JDBC_TYPE_INSTANCEIP = "VARCHAR";

    public static final String IS_KEY_INSTANCEIP = "false";

    /**
     * 灰度容器ID
     */
    public static final String CONTAINERID = "containerId";

    public static final String COLUMN_NAME_CONTAINERID = "`container_id`";

    public static final String JAVA_TYPE_CONTAINERID = "java.lang.String";

    public static final String JDBC_TYPE_CONTAINERID = "VARCHAR";

    public static final String IS_KEY_CONTAINERID = "false";

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
        if (columnName.equals(COLUMN_NAME_VERSIONID)) {
            return VERSIONID;
        }
        if (columnName.equals(COLUMN_NAME_GRAYVERSIONID)) {
            return GRAYVERSIONID;
        }
        if (columnName.equals(COLUMN_NAME_GRAYTYPE)) {
            return GRAYTYPE;
        }
        if (columnName.equals(COLUMN_NAME_INSTANCECOUNT)) {
            return INSTANCECOUNT;
        }
        if (columnName.equals(COLUMN_NAME_INSTANCEIP)) {
            return INSTANCEIP;
        }
        if (columnName.equals(COLUMN_NAME_CONTAINERID)) {
            return CONTAINERID;
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
        if (fieldName.equals(VERSIONID)) {
            return COLUMN_NAME_VERSIONID;
        }
        if (fieldName.equals(GRAYVERSIONID)) {
            return COLUMN_NAME_GRAYVERSIONID;
        }
        if (fieldName.equals(GRAYTYPE)) {
            return COLUMN_NAME_GRAYTYPE;
        }
        if (fieldName.equals(INSTANCECOUNT)) {
            return COLUMN_NAME_INSTANCECOUNT;
        }
        if (fieldName.equals(INSTANCEIP)) {
            return COLUMN_NAME_INSTANCEIP;
        }
        if (fieldName.equals(CONTAINERID)) {
            return COLUMN_NAME_CONTAINERID;
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
        if (fieldName.equals(VERSIONID)) {
            return COLUMN_NAME_VERSIONID.replace("`", "");
        }
        if (fieldName.equals(GRAYVERSIONID)) {
            return COLUMN_NAME_GRAYVERSIONID.replace("`", "");
        }
        if (fieldName.equals(GRAYTYPE)) {
            return COLUMN_NAME_GRAYTYPE.replace("`", "");
        }
        if (fieldName.equals(INSTANCECOUNT)) {
            return COLUMN_NAME_INSTANCECOUNT.replace("`", "");
        }
        if (fieldName.equals(INSTANCEIP)) {
            return COLUMN_NAME_INSTANCEIP.replace("`", "");
        }
        if (fieldName.equals(CONTAINERID)) {
            return COLUMN_NAME_CONTAINERID.replace("`", "");
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
