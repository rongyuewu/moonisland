package cn.com.yld.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.com.yld.dao.BrandDao;
import cn.com.yld.mapper.BrandMapper;
import cn.com.yld.mapper.GlassMapper;
import cn.com.yld.pojo.Brand;

public class BrandDaoImpl extends SqlSessionDaoSupport implements BrandDao {

	@Override
	public List<Brand> findall() {
		BrandMapper mapper = this.getSqlSession().getMapper(BrandMapper.class);
		List<Brand> ls = mapper.findall();
		return ls;
	}

	@Override
	public void insert(Brand brand) {
		BrandMapper mapper = this.getSqlSession().getMapper(BrandMapper.class);
		mapper.insert(brand);
	}

	@Override
	public void update(Brand brand) {
		BrandMapper mapper = this.getSqlSession().getMapper(BrandMapper.class);
		mapper.update(brand);
	}

	@Override
	public void delete(Brand brand) {
		BrandMapper mapper = this.getSqlSession().getMapper(BrandMapper.class);
		mapper.delete(brand);
	}

	@Override
	public List<Brand> findbyid() {
		BrandMapper mapper = this.getSqlSession().getMapper(BrandMapper.class);
		return mapper.findbyid();
	}

	@Override
	public void cleandelete(Brand brand) {
		BrandMapper mapper = this.getSqlSession().getMapper(BrandMapper.class);
		mapper.cleandelete(brand);
	}
	
	@Override
	public int findnumber() {
		BrandMapper mapper = this.getSqlSession().getMapper(BrandMapper.class);
		return mapper.findnumber();
	}
}
