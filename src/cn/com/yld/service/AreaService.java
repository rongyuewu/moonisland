package cn.com.yld.service;

import java.util.List;
import cn.com.yld.pojo.Area;

public interface AreaService {
	//查询全部
	public List<Area> findall();
	//查询全部
	public List<Area> findbyid(Area area);

}
