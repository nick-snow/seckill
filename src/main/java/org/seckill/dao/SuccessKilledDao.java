package org.seckill.dao;

import org.seckill.entity.SuccessKilled;

public interface SuccessKilledDao {
	
	//插入購買明細，可過濾重複
	int insertSuccessKilled(long seckillId ,long userPhone);

	//根據id查詢SuccessKilled并携帶秒殺產品對象實體
	SuccessKilled queryByIdWithSeckill(long seckillId);
}
