package cn.com.yld.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.yld.dao.GoodsDao;
import cn.com.yld.dao.GoodsPicDao;
import cn.com.yld.pojo.Goods;
import cn.com.yld.pojo.GoodsPic;

public class GoodsPicTest {
	private ApplicationContext context;
	@Before
	public void setup(){
		context=new ClassPathXmlApplicationContext("springmvc-config.xml");
	}
	@Test
	public void test01(){
		GoodsPicDao dao=(GoodsPicDao) this.context.getBean("goodsPicDao");
		dao.findlinmit(1, 5);
	}
	@Test
	public void test02(){
		GoodsPicDao dao=(GoodsPicDao) this.context.getBean("goodsPicDao");
		List<GoodsPic> ls=dao.findall();
		
	}
	@Test
	public void test03(){
		GoodsPicDao dao=(GoodsPicDao) this.context.getBean("goodsPicDao");
		GoodsPic goodsPic=new GoodsPic();
		goodsPic.setGoodsId("22");
		List<GoodsPic> ls=dao.findbyid(goodsPic);
	}
	@Test
	public void test04(){
		GoodsPic goodsPic=new GoodsPic();
		Goods goods=new Goods();
		goods.setGoodsId(66);
		goodsPic.setPic1("1564");
		goodsPic.setGoods(goods);
		GoodsPicDao dao=(GoodsPicDao) this.context.getBean("goodsPicDao");
		dao.insert(goodsPic);
	}
	@Test
	public void test05(){
		GoodsPic goodsPic=new GoodsPic();
		Goods goods=new Goods();
		goods.setGoodsId(66);
		goodsPic.setPic1("1564");
		goodsPic.setGoods(goods);
		GoodsPicDao dao=(GoodsPicDao) this.context.getBean("goodsPicDao");
		dao.insert(goodsPic);
	}
}