package cn.com.yld.mapper;

import java.util.List;
import cn.com.yld.pojo.Area;

public interface AreaMapper {
	//查询全部
	public List<Area> findall();
	//查询全部
	public List<Area> findbyid();
	//插入
	public void insert(Area area);
}
