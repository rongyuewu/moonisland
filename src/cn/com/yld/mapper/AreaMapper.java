package cn.com.yld.mapper;

import java.util.List;
import cn.com.yld.pojo.Area;

public interface AreaMapper {
	//查询全部
	public List<Area> findall();
	//根据id查询全部
	public List<Area> findbyid(Area area);
}
