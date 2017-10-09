package cn.com.yld.service.impl;

import java.util.List;

import cn.com.yld.dao.GoodsCommentDao;
import cn.com.yld.pojo.GoodsComment;
import cn.com.yld.service.GoodsCommentService;

public class GoodsCommentServiceImpl implements GoodsCommentService {
private GoodsCommentDao goodsCommentDao;

public GoodsCommentDao getGoodsCommentDao() {
	return goodsCommentDao;
}

public void setGoodsCommentDao(GoodsCommentDao goodsCommentDao) {
	this.goodsCommentDao = goodsCommentDao;
}

@Override
public List<GoodsComment> findlimit(int page) {
	return goodsCommentDao.findbylimit(page, 9);
}

@Override
public int findcount() {
	return goodsCommentDao.findcount();
}

@Override
public void delcomment(GoodsComment goodsComment) {
	goodsCommentDao.delete(goodsComment);
}

}
