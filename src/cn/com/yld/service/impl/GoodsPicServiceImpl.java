package cn.com.yld.service.impl;

import java.util.List;

import cn.com.yld.dao.GoodsPicDao;
import cn.com.yld.pojo.GoodsPic;
import cn.com.yld.service.GoodsPicService;

public class GoodsPicServiceImpl implements GoodsPicService {
	private GoodsPicDao dao;
	
	public GoodsPicDao getDao() {
		return dao;
	}
	public void setDao(GoodsPicDao dao) {
		this.dao = dao;
	}

	@Override
	public List<GoodsPic> findall() {
		return dao.findall();
	}

	@Override
	public void insert(GoodsPic goodsPic) {
		dao.insert(goodsPic);

	}

	@Override
	public void update(GoodsPic goodsPic) {
		dao.update(goodsPic);

	}

	@Override
	public void delete(GoodsPic goodsPic) {
		dao.delete(goodsPic);
	}

}
