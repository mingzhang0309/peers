SET NAMES utf8;
CREATE DATABASE peer DEFAULT CHARACTER SET utf8;
USE peer;

SET NAMES utf8;
USE peer;

CREATE TABLE `tb_login`(
	`id` INT(11) UNSIGNED NOT NULL AUTO_INCREMENT,
	`user_id` INT(11) UNSIGNED NOT NULL COMMENT '用户表id',
	`token` VARCHAR(32) NOT NULL COMMENT 'token',
	`device_type` TINYINT(2) NOT NULL default 0 COMMENT '0:ios 1:andriod 2:browser 3:winphone',
	`device_sign` VARCHAR(32) NOT NULL default '' COMMENT '浏览器标识或者手机标识',
	`login_type` TINYINT(1) NOT NULL COMMENT '手机短信登录、账号密码登录、oauth登录等',
	`ip` VARCHAR(16) NOT NULL default '' COMMENT 'ip',
	`create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP comment '创建时间',
	`expire_time` DATETIME NOT NULL COMMENT '过期时间',
	`last_update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
	PRIMARY KEY (`id`),
	UNIQUE uniq_token(`token`)
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT '登录表';

CREATE TABLE `tb_captcha`(
	`id` INT(11) UNSIGNED NOT NULL AUTO_INCREMENT,
	`session_id` VARCHAR(32) NOT NULL DEFAULT '' COMMENT 'sessionId串流程用，验证接口回传',
	`phone` VARCHAR(16) NOT NULL COMMENT '手机号',
	`value` VARCHAR(4) NOT NULL COMMENT '验证码值',
	`content` VARCHAR(128) NOT NULL COMMENT '验证短信内容',
	`try_count` TINYINT(1) NOT NULL COMMENT '验证次数',
	`create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP comment '创建时间',
	`last_update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
	PRIMARY KEY (`id`),
	UNIQUE uniq_session_id(`session_id`),
	KEY idx_phone(`phone`)
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT '验证码表';

CREATE TABLE `peer`(
	`id` INT(11) UNSIGNED NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(32) NOT NULL COMMENT '宠物nick',
	`sex` TINYINT(1) NOT NULL COMMENT '宠物性别',
	`varieties` VARCHAR(32) NOT NULL COMMENT '宠物品种',
	`owner_id` INT(11) UNSIGNED NOT NULL COMMENT '主人id',
	`peer_head_url` VARCHAR(256) NOT NULL COMMENT '宠物头像url',
	`peer_tag` VARCHAR(128) NOT NULL COMMENT '宠物标签',
	`create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP comment '创建时间',
	`last_update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
	PRIMARY KEY (`id`),
	UNIQUE uniq_owner_id(`owner_id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT '宠物表';

CREATE TABLE `peer_user`(
	`id` INT(11) UNSIGNED NOT NULL AUTO_INCREMENT,
	`nick` VARCHAR(32) NOT NULL COMMENT '用户nick',
	`introduction` VARCHAR(256) NOT NULL COMMENT '用户简介',
	`is_master` TINYINT(1) NOT NULL COMMENT '是否是主要主人',
	`peer_id` INT(11) UNSIGNED NOT NULL COMMENT '关联宠物id',
	`password` varchar(32) NOT NULL DEFAULT '' COMMENT '密码',
	`create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP comment '创建时间',
	`last_update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
	PRIMARY KEY (`id`),
	UNIQUE uniq_peer_id(`peer_id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT '宠物主人表';

CREATE TABLE `feed_base`(
	`id` INT(11) UNSIGNED NOT NULL AUTO_INCREMENT,
	`peer_id` INT(11) NOT NULL COMMENT '宠物id',
	`img` VARCHAR(256) NOT NULL COMMENT '宠物图片url',
	`message` VARCHAR(256) NOT NULL COMMENT 'feed主信息',
	`thumbs_count` INT(11) NOT NULL DEFAULT 0 COMMENT 'feed点赞数',
	`comment_count` INT(11) NOT NULL DEFAULT 0 COMMENT 'feed评论数',
	`owner_id` INT(11) UNSIGNED NOT NULL COMMENT 'feed发布人',
	`location` VARCHAR(32) NOT NULL COMMENT '定位信息',
	`create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP comment '创建时间',
	`last_update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
	PRIMARY KEY (`id`),
	UNIQUE uniq_peer_id(`peer_id`),
	KEY idx_owner_id(`owner_id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT 'feed流基础表';

CREATE TABLE `feed_message`(
	`id` INT(11) UNSIGNED NOT NULL AUTO_INCREMENT,
	`feed_id` INT(11) NOT NULL COMMENT 'feed标识',
	`name` VARCHAR(32) NOT NULL COMMENT '留言用户nick',
	`message` VARCHAR(512) NOT NULL COMMENT '留言内容',
	`parent_id` INT(11) UNSIGNED NOT NULL COMMENT '父留言id，为-1则本身是父留言',
	`create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP comment '创建时间',
	`last_update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
	PRIMARY KEY (`id`),
	UNIQUE uniq_feed_id(`feed_id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT 'feed留言表';



