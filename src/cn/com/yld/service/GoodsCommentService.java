package cn.com.yld.service;

import java.util.List;

import cn.com.yld.pojo.GoodsComment;

public interface GoodsCommentService {
//分页查询
public List<GoodsComment> findlimit(int page);
//查询数量
public int findcount();
//删除评论
public void delcomment(GoodsComment goodsComment);
//查询商品评论
public List<GoodsComment> findattr(GoodsComment goodsComment);
}
