package cn.com.yld.service;

import java.util.List;

import cn.com.yld.pojo.Goods;

public interface GoodsService {
//查询在售商品数量
public int findcount();
//查询在售商品
public List<Goods> findgoods();
}
