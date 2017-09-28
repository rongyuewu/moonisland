package cn.com.yld.service;

import java.util.List;

import cn.com.yld.pojo.Glass;

public interface GlassService {
	//查询全部
	public List<Glass> findall();
	//查询id
	public List<Glass> findbyid();
	//插入
	public void insert(Glass glass);
	//更新
	public void update(Glass glass);
	//删除
	public void delete(Glass glass);
	//清除删除
	public void cleandelete(Glass glass);
	//分页
	public List<Glass> findbylike(int page,int num);
	//查询数量
	public String findnumber();
}
