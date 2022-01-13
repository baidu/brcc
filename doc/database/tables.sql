
use brcc;

-- /******************************************/
-- /*   数据库全名 = brcc   */
-- /*   表名称 = rcc_api_token   */
-- /******************************************/
CREATE TABLE `rcc_api_token` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `token` varchar(64) NOT NULL DEFAULT '' COMMENT 'api token',
  `project_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '工程ID',
  `project_name` varchar(50) NOT NULL DEFAULT '' COMMENT '工程名称',
  `expire_never` tinyint(3) unsigned NOT NULL DEFAULT '1' COMMENT '是否过期，1-永不过期，0-非永不过期',
  `expire_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '过期时间',
  `deleted` tinyint(3) unsigned NOT NULL DEFAULT '0' COMMENT '删除标志，1-已删除',
  `update_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '更新时间',
  `create_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '创建时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_token` (`token`) USING BTREE,
  KEY `idx_project_id` (`project_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='api token信息表';

-- /******************************************/
-- /*   数据库全名 = brcc   */
-- /*   表名称 = rcc_config_change_log   */
-- /******************************************/
CREATE TABLE `rcc_config_change_log` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `user_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '操作人ID',
  `operator` varchar(60) NOT NULL DEFAULT '' COMMENT '操作人名称',
  `product_id` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '所属产品线ID',
  `project_id` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '工程ID',
  `environment_id` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '环境id',
  `version_id` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '版本id',
  `group_id` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '分组id',
  `group_name` varchar(50) NOT NULL DEFAULT '' COMMENT '分组名称',
  `old_content` text NOT NULL COMMENT '原配置',
  `new_content` text NOT NULL COMMENT '新配置',
  `create_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '创建时间',
  PRIMARY KEY (`id`),
  KEY `project_id` (`project_id`) USING BTREE,
  KEY `version_id` (`version_id`,`create_time`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='配置变更记录';

-- /******************************************/
-- /*   数据库全名 = brcc   */
-- /*   表名称 = rcc_config_group   */
-- /******************************************/
CREATE TABLE `rcc_config_group` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(50) NOT NULL DEFAULT '' COMMENT '分组名称',
  `product_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '所属产品线ID',
  `memo` varchar(200) NOT NULL DEFAULT '' COMMENT '分组描述',
  `project_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '工程ID',
  `environment_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '环境id',
  `version_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '版本id',
  `default_type` tinyint(3) unsigned NOT NULL DEFAULT '0' COMMENT '默认分组标识',
  `deleted` tinyint(3) unsigned NOT NULL DEFAULT '0' COMMENT '删除标志，1-已删除',
  `update_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '更新时间',
  `create_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '创建时间',
  PRIMARY KEY (`id`),
  KEY `idx_version_id` (`version_id`) USING BTREE,
  KEY `idx_name` (`name`) USING BTREE,
  KEY `idx_project_id` (`project_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='分组';

-- /******************************************/
-- /*   数据库全名 = brcc   */
-- /*   表名称 = rcc_config_item   */
-- /******************************************/
CREATE TABLE `rcc_config_item` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(128) NOT NULL DEFAULT '' COMMENT '配置项名称',
  `product_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '所属产品线ID',
  `memo` varchar(200) NOT NULL DEFAULT '' COMMENT '配置项描述',
  `project_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '工程ID',
  `environment_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '环境id',
  `version_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '版本id',
  `group_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '组id',
  `type_id` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '配置类型id',
  `val` varchar(4096) NOT NULL DEFAULT '' COMMENT '配置值',
  `shareable` tinyint(3) unsigned NOT NULL DEFAULT '0' COMMENT '是否共享',
  `ref` tinyint(3) unsigned NOT NULL DEFAULT '0' COMMENT '是否引用值',
  `deleted` tinyint(3) unsigned NOT NULL DEFAULT '0' COMMENT '删除标志，1-已删除',
  `update_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '更新时间',
  `create_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '创建时间',
  PRIMARY KEY (`id`),
  KEY `idx_name` (`name`) USING BTREE,
  KEY `idx_group_id` (`group_id`),
  KEY `idx_project_id` (`project_id`,`environment_id`) USING BTREE,
  KEY `idx_version_id` (`version_id`,`name`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='配置项';

-- /******************************************/
-- /*   数据库全名 = brcc   */
-- /*   表名称 = rcc_environment   */
-- /******************************************/
CREATE TABLE `rcc_environment` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(50) NOT NULL DEFAULT '' COMMENT '环境名称',
  `product_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '所属产品线ID',
  `memo` varchar(200) NOT NULL DEFAULT '' COMMENT '环境描述',
  `project_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '工程ID',
  `deleted` tinyint(3) unsigned NOT NULL DEFAULT '0' COMMENT '删除标志，1-已删除',
  `update_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '更新时间',
  `create_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '创建时间',
  PRIMARY KEY (`id`),
  KEY `idx_name` (`name`) USING BTREE,
  KEY `idx_project_id` (`project_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='环境';

-- /******************************************/
-- /*   数据库全名 = brcc   */
-- /*   表名称 = rcc_environment_user   */
-- /******************************************/
CREATE TABLE `rcc_environment_user` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `product_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '所属产品线ID',
  `project_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '工程id',
  `environment_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '环境id',
  `user_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '用户id',
  `user_name` varchar(64) NOT NULL COMMENT '用户名',
  `pri_type` tinyint(3) unsigned NOT NULL DEFAULT '0' COMMENT '权限，1-读，2-写',
  `update_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '更新时间',
  `create_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '创建时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_user_pid_env` (`user_id`,`project_id`,`environment_id`) USING BTREE,
  KEY `idx_product_id` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='环境用户关系';

-- /******************************************/
-- /*   数据库全名 = brcc   */
-- /*   表名称 = rcc_item_type   */
-- /******************************************/
CREATE TABLE `rcc_item_type` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(50) NOT NULL DEFAULT '' COMMENT '类型名称',
  `memo` varchar(200) NOT NULL DEFAULT '' COMMENT '备注',
  `is_encrypt` tinyint(3) unsigned NOT NULL DEFAULT '0' COMMENT '是否加密0:不加密,1:加密',
  `update_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '更新时间',
  `create_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '创建时间',
  PRIMARY KEY (`id`),
  KEY `idx_encrypt` (`is_encrypt`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='配置项类型';

-- /******************************************/
-- /*   数据库全名 = brcc   */
-- /*   表名称 = rcc_operation_log   */
-- /******************************************/
CREATE TABLE `rcc_operation_log` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `user_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '操作人ID',
  `operator` varchar(60) NOT NULL DEFAULT '' COMMENT '操作人名称',
  `scene` varchar(128) NOT NULL DEFAULT '' COMMENT '场景',
  `request` text NOT NULL COMMENT '请求参数',
  `response` varchar(10240) NOT NULL DEFAULT '' COMMENT '返回参数',
  `remote_address` varchar(60) NOT NULL DEFAULT '' COMMENT '操作地址',
  `create_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '创建时间',
  PRIMARY KEY (`id`),
  KEY `create_time` (`create_time`,`operator`,`scene`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='操作日志表';

-- /******************************************/
-- /*   数据库全名 = brcc   */
-- /*   表名称 = rcc_product   */
-- /******************************************/
CREATE TABLE `rcc_product` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(50) NOT NULL DEFAULT '' COMMENT '产品线名称',
  `memo` varchar(200) NOT NULL DEFAULT '' COMMENT '产品线描述',
  `update_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '更新时间',
  `create_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '创建时间',
  PRIMARY KEY (`id`),
  KEY `idx_name` (`name`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产品线';

-- /******************************************/
-- /*   数据库全名 = brcc   */
-- /*   表名称 = rcc_product_user   */
-- /******************************************/
CREATE TABLE `rcc_product_user` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `product_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '产品线id',
  `user_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '用户ID',
  `user_name` varchar(64) NOT NULL COMMENT '用户名',
  `is_admin` tinyint(3) unsigned NOT NULL DEFAULT '0' COMMENT '角色，0：非管理员，1管理员',
  `update_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '更新时间',
  `create_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '创建时间',
  PRIMARY KEY (`id`),
  KEY `idx_user_product` (`product_id`,`user_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产品线用户关系';

-- /******************************************/
-- /*   数据库全名 = brcc   */
-- /*   表名称 = rcc_project   */
-- /******************************************/
CREATE TABLE `rcc_project` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(50) NOT NULL DEFAULT '' COMMENT '工程名称',
  `product_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '所属产品线ID',
  `memo` varchar(200) NOT NULL DEFAULT '' COMMENT '工程描述',
  `project_type` tinyint(3) unsigned NOT NULL DEFAULT '1' COMMENT '工程类型,0:公共 1:私有',
  `dependency_ids` varchar(500) NOT NULL DEFAULT '' COMMENT '依赖工程id列表',
  `dependency_names` varchar(1024) NOT NULL DEFAULT '' COMMENT '依赖工程名',
  `mail_receiver` varchar(500) NOT NULL DEFAULT '' COMMENT '变更邮件接收人',
  `api_password` varchar(218) NOT NULL DEFAULT '' COMMENT 'api访问密码',
  `api_token` varchar(64) NOT NULL DEFAULT '' COMMENT 'api token',
  `deleted` tinyint(3) unsigned NOT NULL DEFAULT '0' COMMENT '删除标志，1-已删除',
  `update_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '更新时间',
  `create_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '创建时间',
  PRIMARY KEY (`id`),
  KEY `idx_name` (`name`) USING BTREE,
  KEY `idx_product_id` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='工程信息表';

-- /******************************************/
-- /*   数据库全名 = brcc   */
-- /*   表名称 = rcc_project_user   */
-- /******************************************/
CREATE TABLE `rcc_project_user` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `product_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '所属产品线ID',
  `project_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '工程id',
  `user_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '用户id',
  `user_name` varchar(64) NOT NULL COMMENT '用户名',
  `is_admin` tinyint(3) unsigned NOT NULL DEFAULT '0' COMMENT '是否管理员, 0-否，1-是',
  `update_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '更新时间',
  `create_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '创建时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_user_project` (`user_id`,`product_id`,`project_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='工程用户关系';

-- /******************************************/
-- /*   数据库全名 = brcc   */
-- /*   表名称 = rcc_user   */
-- /******************************************/
CREATE TABLE `rcc_user` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(64) NOT NULL DEFAULT '' COMMENT '用户名',
  `password` varchar(50) NOT NULL DEFAULT '' COMMENT '操作台登录密码',
  `api_password` varchar(50) NOT NULL DEFAULT '' COMMENT 'api访问密码',
  `status` tinyint(3) unsigned NOT NULL DEFAULT '0' COMMENT '状态0-正常，1-禁用',
  `type` tinyint(3) unsigned NOT NULL DEFAULT '0' COMMENT '用户类型, 0-默认, 1-uuap',
  `role` tinyint(3) unsigned NOT NULL DEFAULT '0' COMMENT '管理类型, 0-普通, 1-工程, 2-产品线, 3-系统管理员',
  `token` varchar(64) NOT NULL DEFAULT '' COMMENT 'token',
  `update_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '更新时间',
  `create_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '创建时间',
  PRIMARY KEY (`id`),
  KEY `idx_name` (`name`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户';

-- /******************************************/
-- /*   数据库全名 = brcc   */
-- /*   表名称 = rcc_version   */
-- /******************************************/
CREATE TABLE `rcc_version` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(50) NOT NULL DEFAULT '' COMMENT '版本名称',
  `product_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '所属产品线ID',
  `memo` varchar(200) NOT NULL DEFAULT '' COMMENT '版本描述',
  `project_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '工程ID',
  `environment_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '环境id',
  `check_sum` varchar(36) NOT NULL DEFAULT '' COMMENT '更新标识，由该标识识别是否有配置更新',
  `check_sum_date` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT 'check_sum最后提交时间',
  `check_sum_enable` tinyint(3) unsigned NOT NULL DEFAULT '0' COMMENT '是否运行check检查。1-检查, 0-不检查',
  `deleted` tinyint(4) unsigned NOT NULL DEFAULT '0' COMMENT '删除标志，1-已删除',
  `update_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '更新时间',
  `create_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '创建时间',
  `gray_flag` tinyint(3) UNSIGNED NOT NULL DEFAULT 0 COMMENT '灰度标识',
  `main_version_id` bigint(20) UNSIGNED NOT NULL DEFAULT 0 COMMENT '关联的主版本',
  PRIMARY KEY (`id`),
  KEY `idx_name` (`name`) USING BTREE,
  KEY `idx_envid` (`environment_id`) USING BTREE,
  KEY `idx_project_id` (`project_id`,`environment_id`,`name`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='版本';

-- /******************************************/
-- /*   数据库全名 = brcc   */
-- /*   表名称 = rcc_operation_config   */
-- /******************************************/
CREATE TABLE `rcc_operation_config` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `config_key` varchar(50) NOT NULL DEFAULT '' COMMENT '运营配置KEY',
  `config_val` varchar(2000) NOT NULL DEFAULT '' COMMENT '运营配置Value',
  `create_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '创建时间',
  PRIMARY KEY (`id`),
  KEY `idx_key` (`config_key`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='运营配置';

-- /******************************************/
-- /*   数据库全名 = brcc   */
-- /*   表名称 = rcc_instance   */
-- /******************************************/
CREATE TABLE `rcc_instance` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `idc` varchar(120) NOT NULL DEFAULT '' COMMENT '机房名称',
  `container_id` varchar(120) NOT NULL DEFAULT '' COMMENT '容器ID',
  `app_name` varchar(120) NOT NULL DEFAULT '' COMMENT '应用名',
  `ip` varchar(16) NOT NULL DEFAULT '' COMMENT 'ip地址',
  `client_version` varchar(32) NOT NULL DEFAULT '' COMMENT '客户端版本',
  `enable_update_callback` tinyint(3) NOT NULL DEFAULT '0' COMMENT '是否开启心跳功能',
  `last_checksum` varchar(64) NOT NULL DEFAULT '' COMMENT '上一次checksum值',
  `last_checksum_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '上次生效时间',
  `current_checksum` varchar(64) NOT NULL DEFAULT '' COMMENT '当前checksum值',
  `current_checksum_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '当前生效时间',
  `version_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '版本id',
  `net_cost` int(11) NOT NULL DEFAULT '-1' COMMENT '上一次网络开销',
  `heartbeat_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '最后心跳时间',
  `create_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `gray_flag` tinyint(3) unsigned NOT NULL DEFAULT '0' COMMENT '灰度标识',
  `gray_version_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '灰度版本ID',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_version_id` (`version_id`,`ip`,`app_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=7195 DEFAULT CHARSET=utf8 COMMENT='实例信息';

-- /******************************************/
-- /*   数据库全名 = brcc   */
-- /*   表名称 = rcc_gray_info   */
-- /******************************************/
CREATE TABLE `rcc_gray_info` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `rule_name` varchar(120) NOT NULL DEFAULT '' COMMENT '灰度名称',
  `rule_content` varchar(200) NOT NULL DEFAULT '' COMMENT '灰度规则内容',
  `rule_bean` varchar(40) NOT NULL DEFAULT '' COMMENT '规则sring bean name',
  `update_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '更新时间',
  `create_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='灰度规则内容';

-- /******************************************/
-- /*   数据库全名 = brcc   */
-- /*   表名称 = rcc_gray_rule   */
-- /******************************************/
CREATE TABLE `rcc_gray_rule` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `gray_version_id` bigint(16) NOT NULL DEFAULT '0' COMMENT '灰度版本id',
  `rule_id` bigint(16) NOT NULL DEFAULT '0' COMMENT '灰度规则ID',
  `rule_content` varchar(120) NOT NULL DEFAULT '' COMMENT '灰度规则内容',
  `deleted` tinyint(3) unsigned NOT NULL DEFAULT '0' COMMENT '0-未删除，1-删除',
  `update_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '更新时间',
  `create_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='灰度规则信息';

-- /******************************************/
-- /*   数据库全名 = brcc   */
-- /*   表名称 = rcc_api_count   */
-- /******************************************/
CREATE TABLE `rcc_api_count` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `product_name` varchar(200) NOT NULL DEFAULT '' COMMENT '产品线名称',
  `product_count` bigint(20) NOT NULL COMMENT 'api调用次数',
  `product_cache_key` varchar(120) NOT NULL DEFAULT '' COMMENT '缓存中的key',
  `version` bigint(20) NOT NULL COMMENT '版本号',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `product_cache_key` (`product_cache_key`),
  KEY `idx_product_name` (`product_name`,`product_cache_key`,`product_count`,`version`),
  KEY `idx_product_cache_key` (`product_cache_key`,`product_count`,`version`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8 COMMENT='产品线调用api次数统计';