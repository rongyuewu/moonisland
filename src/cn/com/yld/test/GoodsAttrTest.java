package cn.com.yld.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.yld.dao.GoodsAttrDao;
import cn.com.yld.pojo.GoodsAttr;

public class GoodsAttrTest {
	private ApplicationContext context;
	@Before
	public void setup(){
		context=new ClassPathXmlApplicationContext("springmvc-config.xml");
	}
	@Test
	public void test1(){
		GoodsAttr goodsAttr=new GoodsAttr();
		goodsAttr.setBorder("sss");
		goodsAttr.setColor("honsse");
		GoodsAttrDao dao = (GoodsAttrDao) this.context.getBean("goodsAttrDao");
		dao.insert(goodsAttr);
	}
	@Test
	public void test2(){
		GoodsAttr goodsAttr=new GoodsAttr();
		goodsAttr.setAttrId(23);
		goodsAttr.setColor("eeeeeee");
		GoodsAttrDao dao = (GoodsAttrDao) this.context.getBean("goodsAttrDao");
		dao.update(goodsAttr);
	}
	@Test
	public void test3(){
		GoodsAttrDao dao = (GoodsAttrDao) this.context.getBean("goodsAttrDao");
		dao.findall();
	}
	@Test
	public void test4(){
		GoodsAttr goodsAttr=new GoodsAttr();
		goodsAttr.setAttrId(23);
		GoodsAttrDao dao = (GoodsAttrDao) this.context.getBean("goodsAttrDao");
		dao.findByAttr(goodsAttr);
	}
	@Test
	public void test5(){
		GoodsAttrDao dao = (GoodsAttrDao) this.context.getBean("goodsAttrDao");
		dao.findbylimit(1, 2);
	}
}
