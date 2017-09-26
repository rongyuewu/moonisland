package cn.com.yld.service.impl;

import java.util.List;

import cn.com.yld.dao.BrandDao;
import cn.com.yld.pojo.Brand;
import cn.com.yld.service.BrandService;

public class BrandServiceImpl implements BrandService {

	private BrandDao dao;
	
	public BrandDao getDao() {
		return dao;
	}

	public void setDao(BrandDao dao) {
		this.dao = dao;
	}

	@Override
	public List<Brand> findall() {
		return this.dao.findall();
	}

	@Override
	public List<Brand> findbyid() {
		return this.dao.findbyid();
	}

	@Override
	public void insert(Brand brand) {
		this.dao.insert(brand);
	}

	@Override
	public void update(Brand brand) {
		this.dao.update(brand);
	}

	@Override
	public void delete(Brand brand) {
		this.dao.delete(brand);
	}

}
