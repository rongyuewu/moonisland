package cn.com.yld.mapper;

import java.util.List;
import cn.com.yld.pojo.Brand;

public interface BrandMapper {
	//查询全部
	public List<Brand> findall();
	//查询全部
	public List<Brand> findbyid();
	//插入
	public void insert(Brand brand);
	//更新
	public void update(Brand brand);
}
