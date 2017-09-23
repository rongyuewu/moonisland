package cn.com.yld.mapper;

import java.util.List;
import cn.com.yld.pojo.Glass;

public interface GlassMapper {
	//查询全部
	public List<Glass> findall();
	//查询全部
	public List<Glass> findbyid();
	//插入
	public void insert(Glass glass);
	//更新
	public void update(Glass glass);
}
