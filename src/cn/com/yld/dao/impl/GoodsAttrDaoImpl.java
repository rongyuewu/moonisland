package cn.com.yld.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.com.yld.dao.GoodsAttrDao;
import cn.com.yld.mapper.GoodsAttrMapper;
import cn.com.yld.pojo.GoodsAttr;

public class GoodsAttrDaoImpl extends SqlSessionDaoSupport implements GoodsAttrDao{


	@Override
	public void insert(GoodsAttr goodsAttr) {
		GoodsAttrMapper mapper = this.getSqlSession().getMapper(GoodsAttrMapper.class);
		mapper.insert(goodsAttr);
	}

	@Override
	public void update(GoodsAttr goodsAttr) {
		GoodsAttrMapper mapper = this.getSqlSession().getMapper(GoodsAttrMapper.class);
		mapper.update(goodsAttr);
	}

	@Override
	public List<GoodsAttr> findall() {
		GoodsAttrMapper mapper = this.getSqlSession().getMapper(GoodsAttrMapper.class);
		return mapper.findall();
	}

	@Override
	public List<GoodsAttr> findByAttr(GoodsAttr goodsAttr) {
		GoodsAttrMapper mapper = this.getSqlSession().getMapper(GoodsAttrMapper.class);
		return mapper.findByAttr(goodsAttr);
	}

	@Override
	public List<GoodsAttr> findbylimit(int page,int num) {
		GoodsAttrMapper mapper = this.getSqlSession().getMapper(GoodsAttrMapper.class);
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("num1", (page-1)*num);
		map.put("num2", num);
		return mapper.findbylimit(map);
	}


}
