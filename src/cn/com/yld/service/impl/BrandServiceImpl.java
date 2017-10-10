package cn.com.yld.service.impl;

import java.util.List;

import cn.com.yld.dao.BrandDao;
import cn.com.yld.pojo.Brand;
import cn.com.yld.service.BrandService;

public class BrandServiceImpl implements BrandService {

	private BrandDao brandDao;
	

	public BrandDao getBrandDao() {
		return brandDao;
	}

	public void setBrandDao(BrandDao brandDao) {
		this.brandDao = brandDao;
	}

	@Override
	public List<Brand> findall() {
		return this.brandDao.findall();
	}

	@Override
	public List<Brand> findbyid() {
		return this.brandDao.findbyid();
	}

	@Override
	public int addbrand(Brand brand) {
		brandDao.insert(brand);
		return 1;
	}

	@Override
	public int update(Brand brand) {
		return this.brandDao.update(brand);
	}

	@Override
	public void delete(Brand brand) {
		this.brandDao.delete(brand);
	}

	@Override
	public void cleandelete(Brand brand) {
		this.brandDao.cleandelete(brand);
	}

	@Override
	public int findnumber() {
		return this.brandDao.findnumber();
	}

}
