package cn.com.yld.dao;

import java.util.List;

import cn.com.yld.pojo.Brand;


public interface BrandDao {
	//查询全部
	public List<Brand> findall();
	//查询id
	public List<Brand> findbyid();
	//插入
	public void insert(Brand brand);
	//更新
	public void update(Brand brand);
	//删除
	public void delete(Brand brand);
}
