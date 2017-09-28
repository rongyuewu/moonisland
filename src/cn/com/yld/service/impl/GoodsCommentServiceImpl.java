package cn.com.yld.service.impl;

import cn.com.yld.dao.GoodsCommentDao;
import cn.com.yld.service.GoodsCommentService;

public class GoodsCommentServiceImpl implements GoodsCommentService {
private GoodsCommentDao goodsCommentDao;

public void setGoodsCommentDao(GoodsCommentDao goodsCommentDao) {
	this.goodsCommentDao = goodsCommentDao;
}

}
