package cn.com.yld.mapper;

import java.util.List;
import cn.com.yld.pojo.Goods;

public interface GoodsMapper {
	//查询全部
	public List<Goods> findall();
	//id查询
	public List<Goods> findbyid();
	//插入
	public void insert(Goods goods);
	//更新
	public void update(Goods goods);
	//分页
	public List<Goods> findbylike();
}
