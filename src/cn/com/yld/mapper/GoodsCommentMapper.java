package cn.com.yld.mapper;

import java.util.List;
import java.util.Map;

import cn.com.yld.pojo.GoodsComment;

public interface GoodsCommentMapper {
	//查询全部
	public List<GoodsComment> findall();
	//id查询
	public List<GoodsComment> findbyid(GoodsComment goodsComment);
	//属性查询
	public List<GoodsComment> findbyattr(GoodsComment goodsComment);
	//插入
	public void insert(GoodsComment goodsComment);
	//分页
	public List<GoodsComment> findbylimit(Map<String, Integer> map);
	//通用更新
	public void update(GoodsComment goodsComment);
	//删除
	public void delete(GoodsComment goodsComment);
}
