package cn.com.yld.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.yld.dao.GoodsDao;
import cn.com.yld.dao.UserDao;
import cn.com.yld.pojo.Goods;

public class GoodsTest {
	private ApplicationContext context;
	@Before
	public void setup(){
		context=new ClassPathXmlApplicationContext("springmvc-config.xml");
	}
	@Test
	public void test1(){
		Goods goods=new Goods();
		goods.setGoodsContent("hehe");
		GoodsDao dao=(GoodsDao) this.context.getBean("goodsDao");
		dao.insert(goods);
	}
	@Test
	public void test2(){
		GoodsDao dao=(GoodsDao) this.context.getBean("goodsDao");
		dao.findall();
	}
	@Test
	public void test3(){
		Goods goods=new Goods();
		goods.setGoodsId(21);
		GoodsDao dao=(GoodsDao) this.context.getBean("goodsDao");
		dao.findbyid(goods);
	}
	//分页测试
	@Test
	public void test4(){
		GoodsDao dao=(GoodsDao) this.context.getBean("goodsDao");
		dao.findbylimit(1, 2);
	}
	@Test
	public void test5(){
		Goods goods=new Goods();
		goods.setGoodsId(25);
		GoodsDao dao=(GoodsDao) this.context.getBean("goodsDao");
		dao.delete(goods);
	}
	//模糊查询
	@Test
	public void test6(){
		GoodsDao dao=(GoodsDao) this.context.getBean("goodsDao");
		dao.findbylike("测");
	}
	//分页排序
	@Test
	public void test7(){
		GoodsDao dao=(GoodsDao) this.context.getBean("goodsDao");
		dao.findlimitpri(1, 4, 0);
	}
}

