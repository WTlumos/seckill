create database seckill ;

use seckill;

create table user(
id int auto_increment not null,
name varchar(50) not null,
password varchar(50) not null,
primary key(id)
)
select * from user

insert into user values (default,'abc','123'),(default,'cba','123'),(default,'bca','123');

select * from user where name='abc' and password ='123'

select * from user where gmt_create >= now()- interval 5 minute

create table seckill_activity(
id int auto_increment not null,
goods_id varchar(50) not null,
sec_count long not null,
start_time datetime,
end_time datetime,
status int COMMENT'0 未开始 1 进行中 2 已结束',
current_price decimal(10,2),
primary key(id)
)
select * from seckill_activity;

insert into seckill_activity values(default,'1253857207963942913',10,'2020-04-28 00:00:00','2020-04-29 00:00:00',0,9.8);

select * from seckill_activity where now() between start_time and end_time and status = 1

create table seckill_order(
order_id int auto_increment not null,
order_no varchar(50) not null COMMENT '订单唯一标示',
trade_no varchar(50) not null COMMENT '交易唯一标示',
order_status int not null default 0 COMMENT '0 已创建 1 已支付 2 已发货 3 已收货 4 已评论',
userId varchar(10) not null,
create_time datetime not null,
primary key(order_id),
key idx_order(order_no)
)
SELECT * FROM seckill_order