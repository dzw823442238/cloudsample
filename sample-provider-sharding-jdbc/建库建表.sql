-- 建库建表
create DATABASE ds_2;
CREATE TABLE t_order_0(
order_id int not null,
user_id int not null,
status VARCHAR(32) not null,
PRIMARY KEY (order_id)
);

CREATE TABLE t_order_1(
order_id int not null,
user_id int not null,
status VARCHAR(32) not null,
PRIMARY KEY (order_id)
);

create TABLE t_order_item_0(
item_id int not null,
order_id int not null,
status VARCHAR(32) not null,
user_id int not null,
PRIMARY KEY (item_id)
);

create TABLE t_order_item_1(
item_id int not null,
order_id int not null,
status VARCHAR(32) not null,
user_id int not null,
PRIMARY KEY (item_id)
);