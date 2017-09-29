package cn.com.yld.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.com.yld.dao.SaveDao;
import cn.com.yld.mapper.SaveMapper;
import cn.com.yld.pojo.Save;

public class SaveDaoImpl extends SqlSessionDaoSupport implements SaveDao {

	@Override
	public List<Save> findall() {
		SaveMapper mapper = this.getSqlSession().getMapper(SaveMapper.class);
		return mapper.findall();
	}

	@Override
	public List<Save> findbyid(Save save) {
		SaveMapper mapper = this.getSqlSession().getMapper(SaveMapper.class);
		return mapper.findbyid(save);
	}

	@Override
	public void insert(Save save) {
		SaveMapper mapper = this.getSqlSession().getMapper(SaveMapper.class);
		mapper.insert(save);
	}

	@Override
	public void delete(Save save) {
		SaveMapper mapper = this.getSqlSession().getMapper(SaveMapper.class);
		mapper.delete(save);
	}

	@Override
	public int pagecount() {
		SaveMapper mapper = this.getSqlSession().getMapper(SaveMapper.class);
		int page = mapper.pagecount();
		return page;
	}

	@Override
	public List<Save> findbylimit(int page,int num) {
		SaveMapper mapper = this.getSqlSession().getMapper(SaveMapper.class);
		Map<String, Integer> map = new HashMap<>();
		map.put("num1", (page-1)*num);
		map.put("num2", num);
		return mapper.findbylimit(map);
	}

}
