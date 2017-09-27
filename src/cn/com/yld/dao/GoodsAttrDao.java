package cn.com.yld.dao;

import java.util.List;

import cn.com.yld.pojo.GoodsAttr;

public interface GoodsAttrDao {
	//动态插入
	public void insert(GoodsAttr goodsAttr);
	//更新
	public void update(GoodsAttr goodsAttr);
	public List<GoodsAttr> findall();
	//动态查询
	public List<GoodsAttr> findByAttr(GoodsAttr goodsAttr);
	//分页查询
	public List<GoodsAttr> findbylimit(int page,int num);
}
