package cn.com.yld.dao;

import java.util.List;
import cn.com.yld.pojo.Goods;

public interface GoodsDao {
	//插入
	public void insert(Goods goods);
	//全查
	public List<Goods> findall();
	//id查
	public Goods findbyid(Goods goods);
	//动态修改
	public void update(Goods goods);
	//分页查询
	public List<Goods> findbylimit(int page,int num);
	//价格排序分页查询
	public List<Goods> findlimitpri(int page,int num,int num2);
	//删除
	public void delete(Goods goods);
	//模糊
	public List<Goods> findbylike(String str);
	//在售数量查询
	public int findcount();
	//在售查询
	public List<Goods> findbyAvailable();
}
