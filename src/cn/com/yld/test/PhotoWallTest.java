package cn.com.yld.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.yld.dao.AboutDao;
import cn.com.yld.dao.PhotoWallDao;
import cn.com.yld.dao.UserDao;
import cn.com.yld.pojo.About;
import cn.com.yld.pojo.PhotoWall;
import cn.com.yld.pojo.User;

public class PhotoWallTest {
	private ApplicationContext context;
	@Before
	public void setup(){
		context=new ClassPathXmlApplicationContext("springmvc-config.xml");
	}
	@Test
	public void test01(){
		PhotoWallDao dao = (PhotoWallDao) this.context.getBean("photoWallDao");
		List<PhotoWall> ls=(List<PhotoWall>) dao.find();
		for (PhotoWall photoWall : ls) {
			System.out.println(photoWall.getPhotoWord());
		}
	}
	
}
