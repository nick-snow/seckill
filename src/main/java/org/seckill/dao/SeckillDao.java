package org.seckill.dao;

import java.util.List;

import org.seckill.entity.Seckill;

public interface SeckillDao {
	
	//減庫存
	int reduceNumber(long seckillId);
	
	//根據id查詢秒殺對象
	Seckill queryById(long seckillId);
	
	//根據偏移量查詢秒殺商品列表
	List<Seckill> queryAll(int offet, int limit);
}
