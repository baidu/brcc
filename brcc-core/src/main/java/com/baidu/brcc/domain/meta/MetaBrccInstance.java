package com.baidu.brcc.domain.meta;

/*
@Results({
       @Result(property = "id", column = "id", javaType = java.lang.Long.class, jdbcType = JdbcType.BIGINT, id = true),
       @Result(property = "idc", column = "idc", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
       @Result(property = "containerId", column = "container_id", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
       @Result(property = "appName", column = "app_name", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
       @Result(property = "ip", column = "ip", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
       @Result(property = "clientVersion", column = "client_version", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
       @Result(property = "enableUpdateCallback", column = "enable_update_callback", javaType = java.lang.Byte.class, jdbcType = JdbcType.TINYINT),
       @Result(property = "lastChecksum", column = "last_checksum", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
       @Result(property = "lastChecksumTime", column = "last_checksum_time", javaType = java.util.Date.class, jdbcType = JdbcType.TIMESTAMP),
       @Result(property = "currentChecksum", column = "current_checksum", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
       @Result(property = "currentChecksumTime", column = "current_checksum_time", javaType = java.util.Date.class, jdbcType = JdbcType.TIMESTAMP),
       @Result(property = "versionId", column = "version_id", javaType = java.lang.Long.class, jdbcType = JdbcType.BIGINT),
       @Result(property = "netCost", column = "net_cost", javaType = java.lang.Integer.class, jdbcType = JdbcType.INTEGER),
       @Result(property = "heartbeatTime", column = "heartbeat_time", javaType = java.util.Date.class, jdbcType = JdbcType.TIMESTAMP),
       @Result(property = "createTime", column = "create_time", javaType = java.util.Date.class, jdbcType = JdbcType.TIMESTAMP)
})
*/
public final class MetaBrccInstance {

    /**
     * 实例信息
     */
    public static final String TABLE_NAME = "`rcc_instance`";

    /**
     * 编号
     */
    public static final String ID = "id";

    public static final String COLUMN_NAME_ID = "`id`";

    public static final String JAVA_TYPE_ID = "java.lang.Long";

    public static final String JDBC_TYPE_ID = "BIGINT";

    public static final String IS_KEY_ID = "true";

    /**
     * 机房名称
     */
    public static final String IDC = "idc";

    public static final String COLUMN_NAME_IDC = "`idc`";

    public static final String JAVA_TYPE_IDC = "java.lang.String";

    public static final String JDBC_TYPE_IDC = "VARCHAR";

    public static final String IS_KEY_IDC = "false";

    /**
     * 容器ID
     */
    public static final String CONTAINERID = "containerId";

    public static final String COLUMN_NAME_CONTAINERID = "`container_id`";

    public static final String JAVA_TYPE_CONTAINERID = "java.lang.String";

    public static final String JDBC_TYPE_CONTAINERID = "VARCHAR";

    public static final String IS_KEY_CONTAINERID = "false";

    /**
     * 应用名
     */
    public static final String APPNAME = "appName";

    public static final String COLUMN_NAME_APPNAME = "`app_name`";

    public static final String JAVA_TYPE_APPNAME = "java.lang.String";

    public static final String JDBC_TYPE_APPNAME = "VARCHAR";

    public static final String IS_KEY_APPNAME = "false";

    /**
     * ip地址
     */
    public static final String IP = "ip";

    public static final String COLUMN_NAME_IP = "`ip`";

    public static final String JAVA_TYPE_IP = "java.lang.String";

    public static final String JDBC_TYPE_IP = "VARCHAR";

    public static final String IS_KEY_IP = "false";

    /**
     * 客户端版本
     */
    public static final String CLIENTVERSION = "clientVersion";

    public static final String COLUMN_NAME_CLIENTVERSION = "`client_version`";

    public static final String JAVA_TYPE_CLIENTVERSION = "java.lang.String";

    public static final String JDBC_TYPE_CLIENTVERSION = "VARCHAR";

    public static final String IS_KEY_CLIENTVERSION = "false";

    /**
     * 是否开启心跳功能
     */
    public static final String ENABLEUPDATECALLBACK = "enableUpdateCallback";

    public static final String COLUMN_NAME_ENABLEUPDATECALLBACK = "`enable_update_callback`";

    public static final String JAVA_TYPE_ENABLEUPDATECALLBACK = "java.lang.Byte";

    public static final String JDBC_TYPE_ENABLEUPDATECALLBACK = "TINYINT";

    public static final String IS_KEY_ENABLEUPDATECALLBACK = "false";

    /**
     * 上一次checksum值
     */
    public static final String LASTCHECKSUM = "lastChecksum";

    public static final String COLUMN_NAME_LASTCHECKSUM = "`last_checksum`";

    public static final String JAVA_TYPE_LASTCHECKSUM = "java.lang.String";

    public static final String JDBC_TYPE_LASTCHECKSUM = "VARCHAR";

    public static final String IS_KEY_LASTCHECKSUM = "false";

    /**
     * 上次生效时间
     */
    public static final String LASTCHECKSUMTIME = "lastChecksumTime";

    public static final String COLUMN_NAME_LASTCHECKSUMTIME = "`last_checksum_time`";

    public static final String JAVA_TYPE_LASTCHECKSUMTIME = "java.util.Date";

    public static final String JDBC_TYPE_LASTCHECKSUMTIME = "TIMESTAMP";

    public static final String IS_KEY_LASTCHECKSUMTIME = "false";

    /**
     * 当前checksum值
     */
    public static final String CURRENTCHECKSUM = "currentChecksum";

    public static final String COLUMN_NAME_CURRENTCHECKSUM = "`current_checksum`";

    public static final String JAVA_TYPE_CURRENTCHECKSUM = "java.lang.String";

    public static final String JDBC_TYPE_CURRENTCHECKSUM = "VARCHAR";

    public static final String IS_KEY_CURRENTCHECKSUM = "false";

    /**
     * 当前生效时间
     */
    public static final String CURRENTCHECKSUMTIME = "currentChecksumTime";

    public static final String COLUMN_NAME_CURRENTCHECKSUMTIME = "`current_checksum_time`";

    public static final String JAVA_TYPE_CURRENTCHECKSUMTIME = "java.util.Date";

    public static final String JDBC_TYPE_CURRENTCHECKSUMTIME = "TIMESTAMP";

    public static final String IS_KEY_CURRENTCHECKSUMTIME = "false";

    /**
     * 版本id
     */
    public static final String VERSIONID = "versionId";

    public static final String COLUMN_NAME_VERSIONID = "`version_id`";

    public static final String JAVA_TYPE_VERSIONID = "java.lang.Long";

    public static final String JDBC_TYPE_VERSIONID = "BIGINT";

    public static final String IS_KEY_VERSIONID = "false";

    /**
     * 上一次网络开销
     */
    public static final String NETCOST = "netCost";

    public static final String COLUMN_NAME_NETCOST = "`net_cost`";

    public static final String JAVA_TYPE_NETCOST = "java.lang.Integer";

    public static final String JDBC_TYPE_NETCOST = "INTEGER";

    public static final String IS_KEY_NETCOST = "false";

    /**
     * 最后心跳时间
     */
    public static final String HEARTBEATTIME = "heartbeatTime";

    public static final String COLUMN_NAME_HEARTBEATTIME = "`heartbeat_time`";

    public static final String JAVA_TYPE_HEARTBEATTIME = "java.util.Date";

    public static final String JDBC_TYPE_HEARTBEATTIME = "TIMESTAMP";

    public static final String IS_KEY_HEARTBEATTIME = "false";

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
        if (columnName.equals(COLUMN_NAME_IDC)) {
            return IDC;
        }
        if (columnName.equals(COLUMN_NAME_CONTAINERID)) {
            return CONTAINERID;
        }
        if (columnName.equals(COLUMN_NAME_APPNAME)) {
            return APPNAME;
        }
        if (columnName.equals(COLUMN_NAME_IP)) {
            return IP;
        }
        if (columnName.equals(COLUMN_NAME_CLIENTVERSION)) {
            return CLIENTVERSION;
        }
        if (columnName.equals(COLUMN_NAME_ENABLEUPDATECALLBACK)) {
            return ENABLEUPDATECALLBACK;
        }
        if (columnName.equals(COLUMN_NAME_LASTCHECKSUM)) {
            return LASTCHECKSUM;
        }
        if (columnName.equals(COLUMN_NAME_LASTCHECKSUMTIME)) {
            return LASTCHECKSUMTIME;
        }
        if (columnName.equals(COLUMN_NAME_CURRENTCHECKSUM)) {
            return CURRENTCHECKSUM;
        }
        if (columnName.equals(COLUMN_NAME_CURRENTCHECKSUMTIME)) {
            return CURRENTCHECKSUMTIME;
        }
        if (columnName.equals(COLUMN_NAME_VERSIONID)) {
            return VERSIONID;
        }
        if (columnName.equals(COLUMN_NAME_NETCOST)) {
            return NETCOST;
        }
        if (columnName.equals(COLUMN_NAME_HEARTBEATTIME)) {
            return HEARTBEATTIME;
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
        if (fieldName.equals(IDC)) {
            return COLUMN_NAME_IDC;
        }
        if (fieldName.equals(CONTAINERID)) {
            return COLUMN_NAME_CONTAINERID;
        }
        if (fieldName.equals(APPNAME)) {
            return COLUMN_NAME_APPNAME;
        }
        if (fieldName.equals(IP)) {
            return COLUMN_NAME_IP;
        }
        if (fieldName.equals(CLIENTVERSION)) {
            return COLUMN_NAME_CLIENTVERSION;
        }
        if (fieldName.equals(ENABLEUPDATECALLBACK)) {
            return COLUMN_NAME_ENABLEUPDATECALLBACK;
        }
        if (fieldName.equals(LASTCHECKSUM)) {
            return COLUMN_NAME_LASTCHECKSUM;
        }
        if (fieldName.equals(LASTCHECKSUMTIME)) {
            return COLUMN_NAME_LASTCHECKSUMTIME;
        }
        if (fieldName.equals(CURRENTCHECKSUM)) {
            return COLUMN_NAME_CURRENTCHECKSUM;
        }
        if (fieldName.equals(CURRENTCHECKSUMTIME)) {
            return COLUMN_NAME_CURRENTCHECKSUMTIME;
        }
        if (fieldName.equals(VERSIONID)) {
            return COLUMN_NAME_VERSIONID;
        }
        if (fieldName.equals(NETCOST)) {
            return COLUMN_NAME_NETCOST;
        }
        if (fieldName.equals(HEARTBEATTIME)) {
            return COLUMN_NAME_HEARTBEATTIME;
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
        if (fieldName.equals(IDC)) {
            return COLUMN_NAME_IDC.replace("`", "");
        }
        if (fieldName.equals(CONTAINERID)) {
            return COLUMN_NAME_CONTAINERID.replace("`", "");
        }
        if (fieldName.equals(APPNAME)) {
            return COLUMN_NAME_APPNAME.replace("`", "");
        }
        if (fieldName.equals(IP)) {
            return COLUMN_NAME_IP.replace("`", "");
        }
        if (fieldName.equals(CLIENTVERSION)) {
            return COLUMN_NAME_CLIENTVERSION.replace("`", "");
        }
        if (fieldName.equals(ENABLEUPDATECALLBACK)) {
            return COLUMN_NAME_ENABLEUPDATECALLBACK.replace("`", "");
        }
        if (fieldName.equals(LASTCHECKSUM)) {
            return COLUMN_NAME_LASTCHECKSUM.replace("`", "");
        }
        if (fieldName.equals(LASTCHECKSUMTIME)) {
            return COLUMN_NAME_LASTCHECKSUMTIME.replace("`", "");
        }
        if (fieldName.equals(CURRENTCHECKSUM)) {
            return COLUMN_NAME_CURRENTCHECKSUM.replace("`", "");
        }
        if (fieldName.equals(CURRENTCHECKSUMTIME)) {
            return COLUMN_NAME_CURRENTCHECKSUMTIME.replace("`", "");
        }
        if (fieldName.equals(VERSIONID)) {
            return COLUMN_NAME_VERSIONID.replace("`", "");
        }
        if (fieldName.equals(NETCOST)) {
            return COLUMN_NAME_NETCOST.replace("`", "");
        }
        if (fieldName.equals(HEARTBEATTIME)) {
            return COLUMN_NAME_HEARTBEATTIME.replace("`", "");
        }
        if (fieldName.equals(CREATETIME)) {
            return COLUMN_NAME_CREATETIME.replace("`", "");
        }
        return "";
    }
}