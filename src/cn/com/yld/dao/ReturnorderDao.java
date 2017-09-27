package cn.com.yld.dao;
import cn.com.yld.pojo.Returnorder;
import java.util.List;

public interface ReturnorderDao {
	//查询全部
	public List<Returnorder> findall();
	//插入
	public void insert(Returnorder returnorder);
	//更改
	public void update(Returnorder returnorder);
	
}
