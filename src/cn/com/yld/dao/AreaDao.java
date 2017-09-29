package cn.com.yld.dao;

import java.util.List;
import cn.com.yld.pojo.Area;

public interface AreaDao {
	//查询全部
	public List<Area> findall();
	//查询id
	public List<Area> findbyid(Area area);
	
}
