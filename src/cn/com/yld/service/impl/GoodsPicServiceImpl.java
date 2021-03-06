package cn.com.yld.service.impl;

import java.util.List;

import cn.com.yld.dao.GoodsPicDao;
import cn.com.yld.pojo.GoodsPic;
import cn.com.yld.service.GoodsPicService;

public class GoodsPicServiceImpl implements GoodsPicService {
	private GoodsPicDao goodsPicDao;
	public GoodsPicDao getGoodsPicDao() {
		return goodsPicDao;
	}
	public void setGoodsPicDao(GoodsPicDao goodsPicDao) {
		this.goodsPicDao = goodsPicDao;
	}
	@Override
	public List<GoodsPic> findall() {
		return this.goodsPicDao.findall();
	}

	@Override
	public List<GoodsPic> findbyid(GoodsPic goodsPic) {
		return this.goodsPicDao.findbyid(goodsPic);
	}

	@Override
	public List<GoodsPic> findlinmit(int page) {
		return this.goodsPicDao.findlinmit(page,5);
	}

	@Override
	public void insert(GoodsPic goodsPic) {
		this.goodsPicDao.insert(goodsPic);
	}

	@Override
	public void update(GoodsPic goodsPic) {
		this.goodsPicDao.update(goodsPic);
	}
	@Override
	public int addgoodsPic(GoodsPic goodsPic) {
		goodsPicDao.insert(goodsPic);
		return 1;
	}
	@Override
	public int pagecount() {
		return this.goodsPicDao.pagecount();
	}
	@Override
	public List<GoodsPic> findallpage(int page) {
		return this.goodsPicDao.findallpage(page);
	}

}
