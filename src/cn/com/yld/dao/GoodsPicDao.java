package cn.com.yld.dao;

import java.util.List;
import java.util.Map;

import cn.com.yld.pojo.GoodsPic;

public interface GoodsPicDao {
	//查询全部
	public List<GoodsPic> findall();
	//id查询
	public List<GoodsPic> findbyid(GoodsPic goodsPic);
	//分页查询
	public List<GoodsPic> findlinmit(int page,int num);
	//插入
	public void insert(GoodsPic goodsPic);
	//更新
	public void update(GoodsPic goodsPic);
	//总页数
	public int pagecount();
}
