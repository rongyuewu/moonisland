package cn.com.yld.mapper;

import java.util.List;

import cn.com.yld.pojo.About;

public interface AboutMapper {
	//查询全部
	public List<About> findall();
	//插入
	public void insert(About about);
	//更新
	public void update(About about);
	//删除
	public void delete(About about);
}
