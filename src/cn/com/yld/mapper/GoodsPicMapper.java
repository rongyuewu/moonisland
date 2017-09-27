package cn.com.yld.mapper;

import java.util.List;

import cn.com.yld.pojo.GoodsPic;

public interface GoodsPicMapper {
	//查询全部
	public List<GoodsPic> findall();
	//插入
	public void insert(GoodsPic goodsPic);
	//更新
	public void update(GoodsPic goodsPic);
	//删除
	public void delete(GoodsPic goodsPic);
}
