package cn.com.yld.service;

import java.util.List;

import cn.com.yld.pojo.Brand;

public interface BrandService {
	//查询全部
	public List<Brand> findall();
	//查询id
	public List<Brand> findbyid();
	//插入
	public int addbrand(Brand brand);
	//更新
	public void update(Brand brand);
	//删除
	public void delete(Brand brand);
	//清除删除
	public void cleandelete(Brand brand);
	//查询数量
	public int findnumber();
}
