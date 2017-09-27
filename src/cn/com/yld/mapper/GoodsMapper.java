package cn.com.yld.mapper;

import java.util.List;
import java.util.Map;

import cn.com.yld.pojo.Goods;

public interface GoodsMapper {
	//插入
	public void insert(Goods goods);
	//查询全部
	public List<Goods> findall();
	//分页查询
	public List<Goods> findlimit(Map<String, Integer> map);
	//按价格分页查询
	public List<Goods> findlimitpri(Map<String, Integer> map);
	//id查询
	public Goods findbyid(Goods goods);
	//在售查询
	public List<Goods> findbyAvailable();
	//更新
	public void update(Goods goods);
	//删除
	public void delete(Goods goods);
	//模糊
	public List<Goods> findbylike(Map<String, String> map);
}
