package cn.com.yld.service.impl;

import java.util.List;

import cn.com.yld.dao.GoodsDao;
import cn.com.yld.pojo.Goods;
import cn.com.yld.service.GoodsService;

public class GoodsServiceImpl implements GoodsService {
private GoodsDao goodsDao;

public GoodsDao getGoodsDao() {
	return goodsDao;
}

public void setGoodsDao(GoodsDao goodsDao) {
	this.goodsDao = goodsDao;
}

@Override
public int findcount() {
	return goodsDao.findcount();
}

@Override
public List<Goods> findgoods() {
	return goodsDao.findbyAvailable();
}
}
