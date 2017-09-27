package cn.com.yld.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.yld.dao.GoodsCommentDao;
import cn.com.yld.pojo.Goods;
import cn.com.yld.pojo.GoodsComment;
import cn.com.yld.pojo.User;

public class GoodsCommentTest {
	private ApplicationContext context;
	@Before
	public void setup(){
		context=new ClassPathXmlApplicationContext("springmvc-config.xml");
	}
	@Test
	public void test01(){
		GoodsCommentDao dao=(GoodsCommentDao) this.context.getBean("goodsCommentDao");
		dao.findall();
		
	}
	@Test
	public void test02(){
		GoodsComment goodsComment=new GoodsComment();
		goodsComment.setCommentId(3);
		GoodsCommentDao dao=(GoodsCommentDao) this.context.getBean("goodsCommentDao");
		dao.findbyid(goodsComment);
		
	}
	@Test
	public void test03(){
		GoodsComment goodsComment=new GoodsComment();
		User user=new User();
		user.setNickName("laoewang");
		user.setUserId(45);
		goodsComment.setCommentStatus("0");
		goodsComment.setUser(user);
		GoodsCommentDao dao=(GoodsCommentDao) this.context.getBean("goodsCommentDao");
		dao.insert(goodsComment);
		
	}
	//通用查询测试
	@Test
	public void test04(){
		GoodsComment goodsComment=new GoodsComment();
		User user=new User();
		Goods goods=new Goods();
		goods.setBrowseNum("耐克");
		user.setNickName("laoewang");
		user.setUserId(45);
		goodsComment.setCommentStatus("0");
		goodsComment.setUser(user);
		goodsComment.setGoods(goods);
		GoodsCommentDao dao=(GoodsCommentDao) this.context.getBean("goodsCommentDao");
		dao.findbyattr(goodsComment);
		
	}
	@Test
	public void test05(){
		GoodsCommentDao dao=(GoodsCommentDao) this.context.getBean("goodsCommentDao");
		dao.findbylimit(1, 1);
		
	}
	@Test
	public void test06(){
		GoodsComment goodsComment=new GoodsComment();
		goodsComment.setCommentId(3);
		goodsComment.setCommentContentword("333333333333333");
		GoodsCommentDao dao=(GoodsCommentDao) this.context.getBean("goodsCommentDao");
		dao.update(goodsComment);
		
	}
	@Test
	public void test07(){
		GoodsComment goodsComment=new GoodsComment();
		goodsComment.setCommentId(14);
		GoodsCommentDao dao=(GoodsCommentDao) this.context.getBean("goodsCommentDao");
		dao.delete(goodsComment);
		
	}
}
