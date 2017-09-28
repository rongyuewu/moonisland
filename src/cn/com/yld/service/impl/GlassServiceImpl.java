package cn.com.yld.service.impl;

import java.util.List;

import cn.com.yld.dao.GlassDao;
import cn.com.yld.pojo.Glass;
import cn.com.yld.service.GlassService;

public class GlassServiceImpl implements GlassService {

	private GlassDao glassDao;
	

	public GlassDao getGlassDao() {
		return glassDao;
	}

	public void setGlassDao(GlassDao glassDao) {
		this.glassDao = glassDao;
	}

	@Override
	public List<Glass> findall() {
		return this.glassDao.findall();
	}

	@Override
	public List<Glass> findbyid() {
		return this.glassDao.findbyid();
	}

	@Override
	public void insert(Glass glass) {
		this.glassDao.insert(glass);
	}

	@Override
	public void update(Glass glass) {
		this.glassDao.update(glass);
	}

	@Override
	public void delete(Glass glass) {
		this.glassDao.delete(glass);
	}

	@Override
	public void cleandelete(Glass glass) {
		this.glassDao.cleandelete(glass);
	}

	@Override
	public List<Glass> findbylike(int page,int num) {
		return this.glassDao.findbylike(page, num);
	}

	@Override
	public String findnumber() {
		return this.glassDao.findnumber();
	}

	
}
