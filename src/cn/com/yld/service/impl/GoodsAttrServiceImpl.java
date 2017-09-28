package cn.com.yld.service.impl;

import cn.com.yld.dao.GoodsAttrDao;
import cn.com.yld.service.GoodsAttrService;

public class GoodsAttrServiceImpl implements GoodsAttrService {
 private GoodsAttrDao goodsAttrDao;

public GoodsAttrDao getGoodsAttrDao() {
	return goodsAttrDao;
}

public void setGoodsAttrDao(GoodsAttrDao goodsAttrDao) {
	this.goodsAttrDao = goodsAttrDao;
}
 
}
