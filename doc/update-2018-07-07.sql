-- 新增微信登陆字段
alter table `peer_user` add open_id VARCHAR (32) COMMENT '微信open_id';
alter table `peer_user` add session_key VARCHAR(32) COMMENT '微信sessionKey';