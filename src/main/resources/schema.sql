create table if not exists tanent (
  id int not null primary key auto_increment,
  name varchar(100),
  description varchar(100)
);

insert into tanent values (1,'企业文化部','负责企业文化建设');
insert into tanent values (2,'投资管理部','定向投资，业务开拓');

create table if not exists tanent_user (
  id int not null primary key auto_increment,
  tanent_id int,
  user_id int
);

insert into tanent_user values (1,1,1);
insert into tanent_user values (2,1,2);
insert into tanent_user values (3,2,3);
insert into tanent_user values (4,2,4);


create table if not exists user (
  id int not null primary key auto_increment,
  username varchar(100),
  age int
);

insert into user values (1,'张三',13);
insert into user values (2,'李四',19);
insert into user values (3,'高程',29);
insert into user values (4,'薛岭',59);

create table if not exists person (
  id int not null primary key auto_increment,
  name varchar(100),
  age int,
  id_card varchar(100),
  user_id int
);

insert into person values (1,'客户刘',99,'523623662336653',1);
insert into person values (2,'李萌',77,'52362366123336653',1);
insert into person values (3,'方正',11,'523623662dw336653',2);
insert into person values (4,'筑起',22,'5236236623we36653',2);

create table if not exists enterprise (
  id int not null primary key auto_increment,
  name varchar(100),
  employees int,
  credit_code varchar(100),
  user_id int
);

insert into enterprise values (1,'生鲜公司',100,'95656565623232',3);
insert into enterprise values (2,'牛肉公司',1023,'1231dJJJJJ12312',3);
insert into enterprise values (3,'大旗公司',2020,'95651223232',4);
insert into enterprise values (4,'流水公司',3636,'65464KKKKKKK',4);

create table if not exists user_role (
  id int not null primary key auto_increment,
  user_id int,
  role_id int
);

insert into user_role values (1,1,1);
insert into user_role values (2,1,5);
insert into user_role values (3,2,3);
insert into user_role values (4,2,4);
insert into user_role values (5,3,2);
insert into user_role values (6,3,3);
insert into user_role values (7,4,5);
insert into user_role values (8,4,6);


create table if not exists role (
  id int not null primary key auto_increment,
  name varchar(100)
);

insert into role values (1,'部门经理');
insert into role values (2,'部门经理助理');
insert into role values (3,'业务经理');
insert into role values (4,'宣传干事');
insert into role values (5,'预算员');
insert into role values (6,'投标管理员');

create table if not exists role_resource (
  id int not null primary key auto_increment,
  role_id int,
  resource_id int
);

insert into role_resource values (1,1,1);
insert into role_resource values (2,1,2);
insert into role_resource values (3,1,3);
insert into role_resource values (4,1,4);
insert into role_resource values (5,2,5);
insert into role_resource values (6,2,6);
insert into role_resource values (7,2,7);
insert into role_resource values (8,2,8);
insert into role_resource values (9,3,1);
insert into role_resource values (10,4,2);
insert into role_resource values (11,3,3);
insert into role_resource values (12,4,4);
insert into role_resource values (13,3,5);
insert into role_resource values (14,4,6);
insert into role_resource values (15,3,7);
insert into role_resource values (16,4,8);

create table if not exists resource (
  id int not null primary key auto_increment,
  name varchar(100),
  code varchar(100)
);

insert into resource values (1,'用户管理','user-manage');
insert into resource values (2,'业务办理','service');
insert into resource values (3,'资金审核','financing');
insert into resource values (4,'物资管理','materials');
insert into resource values (5,'部门管理','department');
insert into resource values (6,'新闻公告','notice');
insert into resource values (7,'日报系统','report');
insert into resource values (8,'企业培训','train');