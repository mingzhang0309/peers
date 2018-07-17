-- 新增微信登陆字段
alter table `peer_user` add open_id VARCHAR (32) COMMENT '微信open_id';
alter table `peer_user` add session_key VARCHAR(32) COMMENT '微信sessionKey';


alter table `tb_captcha` add user_id INT(11) UNSIGNED NOT NULL DEFAULT 0 COMMENT '用户id';
alter table `peer_user` modify password varchar(32) COMMENT '用户密码';