# noinspection SqlNoDataSourceInspectionForFile

create table product_info (
	product_id varchar(32) not null,
	product_name varchar(64) not null,
	product_price decimal(8,2) not null,
	product_stock int not null,
	product_desc varchar(64),
	product_icon varchar(512),
	category_type int not null,
	create_time timestamp not null,
	primary key (product_id) 
) comment '商品表';

create table product_category (
	category_id int not null auto_increment,
	category_name varchar(64) not null comment '类目名称',
	category_type int not null comment '类目编号',
	create_time timestamp not null,
	primary key (category_id),
	unique key uqe_category_type (category_type)
) comment '类目表';


create table order_master (
	order_id varchar(32) not null,
	buyer_name varchar(32) not null,
	buyer_phone varchar(32) not null,
	buyer_add varchar(128) not null,
	buyer_openid varchar(64) not null,
	order_amount decimal(8,2) not null,
	order_status tinyint(3) not null default 0,
	pay_status tinyint(3) not null default 0,
	create_time timestamp not null,
	primary key (order_id),
	key idx_buyer_openid (buyer_openid)
) comment '订单表';

create table order_detail (
	detail_id varchar(32) not null,
	order_id varchar(32) not null,
	product_id varchar(32) not null,
	product_name varchar(64) not null,
	product_price decimal(8,2) not null,
	product_quantity int not null,
	product_icon varchar(512),
	create_time timestamp not null,
	primary key (detail_id),
	key idx_order_id (order_id)

) comment '订单详情';

create table user (
  user_id int not null auto_increment,
  user_name varchar(32) not null,
  user_pass varchar(32) not null,
  user_phone varchar(32) not null,
  user_address varchar(512) not null,
  primary key (user_id)
) comment '用户表';

create table book (
  book_id int not null auto_increment,
  book_name varchar(32) not null,
  book_price varchar(32) not null,
  book_owner int not null,
  primary key (book_id),
  foreign key (book_owner) references user (user_id)
) comment '书籍表';