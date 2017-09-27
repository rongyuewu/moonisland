package cn.com.yld.service.impl;

import java.util.List;
import java.util.Map;

import cn.com.yld.dao.GlassDao;
import cn.com.yld.pojo.Glass;
import cn.com.yld.service.GlassService;

public class GlassServiceImpl implements GlassService {

	private GlassDao dao;
	public GlassDao getDao() {
		return dao;
	}

	public void setDao(GlassDao dao) {
		this.dao = dao;
	}

	@Override
	public List<Glass> findall() {
		return this.dao.findall();
	}

	@Override
	public List<Glass> findbyid() {
		return this.dao.findbyid();
	}

	@Override
	public void insert(Glass glass) {
		this.dao.insert(glass);
	}

	@Override
	public void update(Glass glass) {
		this.dao.update(glass);
	}

	@Override
	public void delete(Glass glass) {
		this.dao.delete(glass);
	}

	@Override
	public void cleandelete(Glass glass) {
		this.dao.cleandelete(glass);
	}

	@Override
	public List<Glass> findbylike(int page,int num) {
		return this.dao.findbylike(page, num);
	}

	
}
