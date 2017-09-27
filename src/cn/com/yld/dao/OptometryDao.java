package cn.com.yld.dao;

import java.util.List;

import cn.com.yld.pojo.Optometry;

public interface OptometryDao {
	//全表查询
	public List<Optometry> findall();
	//id查询
	public List<Optometry> findbyid();
	//插入
	public void insert(Optometry optometry);
	//更新
	public void update(Optometry optometry);
}
