package cn.com.yld.mapper;

import java.util.List;
import cn.com.yld.pojo.GoodsComment;

public interface GoodsCommentMapper {
	//查询全部
	public List<GoodsComment> findall();
	//id查询
	public List<GoodsComment> findbyid();
	//插入
	public void insert(GoodsComment goodsComment);
	//更新
	public void update(GoodsComment goodsComment);
	//分页
	public List<GoodsComment> findbylike();
}
