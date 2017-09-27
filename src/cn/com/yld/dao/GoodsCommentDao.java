package cn.com.yld.dao;

import java.util.List;
import cn.com.yld.pojo.GoodsComment;

public interface GoodsCommentDao {
	public List<GoodsComment> findall();
	public List<GoodsComment> findbyid(GoodsComment goodsComment);
	public void insert(GoodsComment goodsComment);
	public List<GoodsComment> findbyattr(GoodsComment goodsComment);
	public List<GoodsComment> findbylimit(int page,int num);
	public void update(GoodsComment goodsComment);
	public void delete(GoodsComment goodsComment);
}
