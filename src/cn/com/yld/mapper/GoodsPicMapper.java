package cn.com.yld.mapper;

import java.util.List;
import java.util.Map;

import cn.com.yld.pojo.GoodsPic;

public interface GoodsPicMapper {
	//查询全部
	public List<GoodsPic> findall();
	//id查询
	public List<GoodsPic> findbyid(GoodsPic goodsPic);
	//分页查询
	public List<GoodsPic> findlinmit(Map<String, Integer> map);
	//插入
	public void insert(GoodsPic goodsPic);
	//更新
	public void update(GoodsPic goodsPic);
	//总页数
	public int pagecount();
	
}
