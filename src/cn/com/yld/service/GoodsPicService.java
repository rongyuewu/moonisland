package cn.com.yld.service;

import java.util.List;

import cn.com.yld.pojo.GoodsPic;

public interface GoodsPicService {
	//查询全部
	public List<GoodsPic> findall();
	//插入
	public void insert(GoodsPic goodsPic);
	//更新
	public void update(GoodsPic goodsPic);
	//删除
	public void delete(GoodsPic goodsPic);
}
