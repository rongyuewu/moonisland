package cn.com.yld.service;
import cn.com.yld.pojo.Returnorder;
import java.util.List;

public interface ReturnorderService {
	//查询全部
	public List<Returnorder> find();
	//插入
	public void insert(Returnorder returnorder);
	//更改
	public void update(Returnorder returnorder);
	
}
