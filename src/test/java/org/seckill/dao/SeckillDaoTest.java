package org.seckill.dao;

import java.io.*;
import java.util.List;

import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.Seckill;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 配置spring和junit整合，junit啓動時加載springIOC容器
 * spring-test，junit
 */
@RunWith(SpringJUnit4ClassRunner.class)

//告訴junit spring配置文件
@ContextConfiguration({"classpath*:spring/spring-dao.xml"})
public class SeckillDaoTest {
		//注入Dao實現類
		@Resource
		private SeckillDao seckillDao;
	
		@Test
		//減庫存
		public void reduceNumber() throws Exception {
			long id = 1000;
			Seckill seckill = seckillDao.queryById(id);
			System.out.println(seckill.getName());
			System.out.println(seckill);
			seckillDao.reduceNumber(1000);
			System.out.println(seckill.getNumber());
		}
		
		@Test
		//根據id查詢秒殺對象
		public void queryById() throws Exception{
			
		}
		
		@Test
		//根據偏移量查詢秒殺商品列表
		//java没有保存形参的记录
		public void queryAll() throws Exception{
			List<Seckill> seckills = seckillDao.queryAll(0, 100);
			for(Seckill seckill : seckills) {
				System.out.println(seckill);
			}
		}
		

}
