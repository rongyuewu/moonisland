package cn.com.yld.service.impl;

import java.util.List;

import cn.com.yld.dao.AboutDao;
import cn.com.yld.pojo.About;
import cn.com.yld.service.AboutService;

public class AboutServiceImpl implements AboutService {
	private AboutDao dao;
	
	public AboutDao getDao() {
		return dao;
	}

	public void setDao(AboutDao dao) {
		this.dao = dao;
	}

	@Override
	public List<About> findall() {
		
		return this.dao.findall();
	}

	@Override
	public void insert(About about) {
		this.dao.insert(about);

	}

	@Override
	public void update(About about) {
		this.dao.update(about);

	}

	@Override
	public void delete(About about) {
		this.dao.delete(about);

	}

}
