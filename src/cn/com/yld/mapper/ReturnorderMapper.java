package cn.com.yld.mapper;
import cn.com.yld.pojo.Returnorder;
import java.util.List;

public interface ReturnorderMapper {
	//查询全部
	public List<Returnorder> findall();
	//插入
	public void insert(Returnorder returnorder);
	//更改
	public void updatestatus(Returnorder returnorder);
	
}
