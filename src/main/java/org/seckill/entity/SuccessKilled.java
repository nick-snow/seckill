package org.seckill.entity;

import java.util.Date;

import lombok.Data;

@Data
public class SuccessKilled {
	
	private long seckillId;
	
	private long userPhone;
	
	private short state;
	
	private Date createTime;
	
	private Seckill seckill;
}
