package org.seckill.entity;

import java.util.Date;

import lombok.Data;

@Data
public class Seckill{
	
	private long seckillId;
	
	private String name;
	
	private int number;
	
	private Date startTime;
	
	private Date endTime;
	
	private Date createTime;
	
}
