package cn.com.yld.mapper;

import java.util.List;

public interface GoodsAttrMapper {
	//查询全部
	public List<GoodsAttrMapper> findall();
	//查询全部
	public List<GoodsAttrMapper> findbyid();
	//插入
	public void insert(GoodsAttrMapper goodsAttrMapper);
	//更新
	public void update(GoodsAttrMapper goodsAttrMapper);
}
