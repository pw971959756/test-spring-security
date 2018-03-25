create table sys_model
(
	model_id int auto_increment
		primary key,
	model_code varchar(50) null,
	model_name varchar(50) null,
	model_status int null,
	role_id int null
)
engine=InnoDB
;

create table sys_role
(
	role_id int auto_increment
		primary key,
	role_name varchar(50) null,
	role_status int null,
	client_id int null
)
engine=InnoDB
;

create table sys_user
(
	user_id int auto_increment
		primary key,
	user_name varchar(20) null,
	user_login_name varchar(50) null,
	user_password varchar(200) null,
	client_id int null,
	user_status int null
)
engine=InnoDB
;

create table test_entity
(
	test_id int auto_increment
		primary key,
	teset_name varchar(50) null
)
engine=InnoDB
;




INSERT INTO test_spring_security.sys_model (model_id, model_code, model_name, model_status, role_id) VALUES (1, 'HOME_F1', 'test-t1', null, 1);
INSERT INTO test_spring_security.sys_model (model_id, model_code, model_name, model_status, role_id) VALUES (2, 'HOME_F2', 'test-t2', null, 1);
INSERT INTO test_spring_security.sys_model (model_id, model_code, model_name, model_status, role_id) VALUES (3, 'HOME_F333', 'findByUserName', null, 1);
INSERT INTO test_spring_security.sys_model (model_id, model_code, model_name, model_status, role_id) VALUES (4, 'HOME_F4', 'findAllUser', null, 1);
INSERT INTO test_spring_security.sys_model (model_id, model_code, model_name, model_status, role_id) VALUES (5, 'HOME_F5', 'findAllModel', null, 1);


INSERT INTO test_spring_security.sys_role (role_id, role_name, role_status, client_id) VALUES (1, '系统管理员', 0, 1);
INSERT INTO test_spring_security.sys_role (role_id, role_name, role_status, client_id) VALUES (2, '管理员', 0, 1);
INSERT INTO test_spring_security.sys_role (role_id, role_name, role_status, client_id) VALUES (3, '部门经理', 0, 1);
INSERT INTO test_spring_security.sys_role (role_id, role_name, role_status, client_id) VALUES (4, '员工', 0, 1);


INSERT INTO test_spring_security.sys_user (user_id, user_name, user_login_name, user_password, client_id, user_status) VALUES (1, '张三', 'zhangsan', 'zhangsan', 1, 0);
INSERT INTO test_spring_security.sys_user (user_id, user_name, user_login_name, user_password, client_id, user_status) VALUES (2, '李四', 'lisi', 'lisi', 1, 0);
INSERT INTO test_spring_security.sys_user (user_id, user_name, user_login_name, user_password, client_id, user_status) VALUES (3, '王五', 'wangwu', 'wangwu', 1, 0);
INSERT INTO test_spring_security.sys_user (user_id, user_name, user_login_name, user_password, client_id, user_status) VALUES (4, '赵六', 'zhaoliu', 'zhaoliu', 1, 0);

INSERT INTO test_spring_security.test_entity (test_id, teset_name) VALUES (1, '张三');
INSERT INTO test_spring_security.test_entity (test_id, teset_name) VALUES (2, '李四');