package cn.com.yld.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sun.jndi.url.corbaname.corbanameURLContextFactory;

import cn.com.yld.dao.AddressDao;
import cn.com.yld.pojo.Address;

public class AddressTest {
	private ApplicationContext context;
	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("springmvc-config.xml");
	}

	@Test
	public void test() {
		AddressDao dao = (AddressDao) this.context.getBean("addressDao");
		List<Address> ls = dao.findall();
		for (Address address : ls) {
			System.out.println(address.getProvinceid());
		}
	}
	@Test
	public void testbyid() {
		AddressDao dao = (AddressDao) this.context.getBean("addressDao");
		Address addr = new Address();
		addr.setAddressId(1);
		List<Address> ls = dao.findbyid(addr);
		for (Address address : ls) {
			System.out.println(address.getProvinceid());
		}
	}
	@Test
	public void testinsert() {
		AddressDao dao = (AddressDao) this.context.getBean("addressDao");
		Address addr = new Address();
		addr.setAddressId(1);
		addr.setProvinceid("天津");
		addr.setCityid("红桥");
		dao.insert(addr);
		System.out.println(addr);
	}
	@Test
	public void delect(){
		AddressDao dao = (AddressDao) this.context.getBean("addressDao");
		Address address = new Address();
		address.setAddressId(2);
		dao.delect(address);
		System.out.println(dao);
	}

	@Test
	public void update(){
		AddressDao dao = (AddressDao) this.context.getBean("addressDao");
		Address address = new Address();
		address.setAddressId(3);
		address.setAddressState("1");
		dao.update(address);
		System.out.println(dao);
	}
}
