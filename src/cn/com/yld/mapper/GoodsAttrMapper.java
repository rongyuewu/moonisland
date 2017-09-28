package cn.com.yld.mapper;

import java.util.List;
import java.util.Map;

import cn.com.yld.pojo.GoodsAttr;

public interface GoodsAttrMapper {
	//查询全部
	public List<GoodsAttr> findall();
	//分页查询
	public List<GoodsAttr> findbylimit(Map<String, Integer> map);
	//动态查询
	public List<GoodsAttr> findByAttr(GoodsAttr goodsAttr);
	//动态插入
	public void insert(GoodsAttr goodsAttr);
	//动态更新
	public void update(GoodsAttr goodsAttr);
	
}
