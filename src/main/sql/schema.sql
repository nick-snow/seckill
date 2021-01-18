create DATABASE seckill;

use seckill;

create table seckill(
`seckill_id` bigint NOT NULL auto_increment COMMENT '商品庫存id',
`name` varchar(120) NOT NULL COMMENT '商品名稱',
`number` int NOT NULL COMMENT '庫存數量',
`start_time` timestamp NOT NULL COMMENT '秒殺開啓時間',
`end_time` timestamp NOT NULL COMMENT '秒殺結束時間',
`create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '創建時間',
PRIMARY KEY (seckill_id),
key idx_start_time(start_time),
key idx_end_time(end_time),
key idx_create_time(create_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='秒殺庫存表';


insert into 
	seckill(name,number,start_time,end_time)
values
	('1000元秒殺iphone6',100,'2015-11-01 00:00:00','2015-11-02 00:00:00'),
	('2000元秒殺iphone11',200,'2015-11-01 00:00:00','2015-11-02 00:00:00'),
	('3000元秒殺iphone12',400,'2015-11-01 00:00:00','2015-11-02 00:00:00'),
	('500元秒殺iphone5',300,'2015-11-01 00:00:00','2015-11-02 00:00:00')
	
	
create table success_killed(
`seckill_id` bigint NOT NULL COMMENT '秒殺商品id',
`user_phone` bigint NOT NULL COMMENT '用戶手機號',
`state` int NOT NULL DEFAULT -1 COMMENT '狀態標示:-1,無效:0,成功  1,已付款 2:已發貨',
`create_time` timestamp NOT NULL COMMENT '創建時間',
PRIMARY KEY(seckill_id,user_phone),/*聯合主鍵*/
key idx_create_time(create_time)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT = '秒殺成功明細表'