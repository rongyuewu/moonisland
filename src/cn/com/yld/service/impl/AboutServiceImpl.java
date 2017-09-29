package cn.com.yld.service.impl;

import java.util.List;

import cn.com.yld.dao.AboutDao;
import cn.com.yld.pojo.About;
import cn.com.yld.service.AboutService;

public class AboutServiceImpl implements AboutService {
	private AboutDao aboutDao;
	

	public AboutDao getAboutDao() {
		return aboutDao;
	}

	public void setAboutDao(AboutDao aboutDao) {
		this.aboutDao = aboutDao;
	}

	@Override
	public List<About> findall() {
		
		return this.aboutDao.findall();
	}

	@Override
	public void insert(About about) {
		this.aboutDao.insert(about);

	}

	@Override
	public void update(About about) {
		this.aboutDao.update(about);

	}

	@Override
	public void delete(About about) {
		this.aboutDao.delete(about);

	}

}
