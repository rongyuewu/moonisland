package cn.com.yld.dao.impl;

import java.util.List;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import cn.com.yld.dao.AreaDao;
import cn.com.yld.mapper.AreaMapper;
import cn.com.yld.pojo.Area;

public class AreaDaoImpl extends SqlSessionDaoSupport implements AreaDao {

	@Override
	public List<Area> findall() {
		AreaMapper mapper = this.getSqlSession().getMapper(AreaMapper.class);
		return mapper.findall();
	}

	@Override
	public List<Area> findbyid(Area area) {
		AreaMapper mapper = this.getSqlSession().getMapper(AreaMapper.class);
		return mapper.findbyid(area);
	}

}
