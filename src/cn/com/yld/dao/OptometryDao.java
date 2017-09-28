package cn.com.yld.dao;

import java.util.List;

import cn.com.yld.pojo.Optometry;

public interface OptometryDao {
	//全表查询
	public List<Optometry> findall();
	//id查询
	public List<Optometry> findbyid(Optometry optometry);
	//插入
	public void insert(Optometry optometry);
	//更新
	public void update(Optometry optometry);
	//删除
	public void dalete(Optometry optometry);
	//总页数
	public int pagecount();
}
