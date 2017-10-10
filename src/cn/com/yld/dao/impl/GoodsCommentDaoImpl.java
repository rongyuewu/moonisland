package cn.com.yld.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.com.yld.dao.GoodsCommentDao;
import cn.com.yld.mapper.GoodsCommentMapper;
import cn.com.yld.pojo.GoodsComment;

public class GoodsCommentDaoImpl extends SqlSessionDaoSupport implements GoodsCommentDao {

	@Override
	public List<GoodsComment> findall() {
		GoodsCommentMapper mapper=this.getSqlSession().getMapper(GoodsCommentMapper.class);
		return mapper.findall();
	}

	@Override
	public List<GoodsComment> findbyid(GoodsComment goodsComment) {
		GoodsCommentMapper mapper=this.getSqlSession().getMapper(GoodsCommentMapper.class);
		return mapper.findbyid(goodsComment);
	}

	@Override
	public void insert(GoodsComment goodsComment) {
		GoodsCommentMapper mapper=this.getSqlSession().getMapper(GoodsCommentMapper.class);
		mapper.insert(goodsComment);
		
	}

	@Override
	public List<GoodsComment> findbyattr(GoodsComment goodsComment) {
		GoodsCommentMapper mapper=this.getSqlSession().getMapper(GoodsCommentMapper.class);
		System.out.println(mapper.findbyattr(goodsComment));
		return mapper.findbyattr(goodsComment);
	}

	@Override
	public List<GoodsComment> findbylimit(int page, int num) {
		GoodsCommentMapper mapper=this.getSqlSession().getMapper(GoodsCommentMapper.class);
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("num1", (page-1)*num);
		map.put("num2", num);
		return mapper.findbylimit(map);
	}

	@Override
	public void update(GoodsComment goodsComment) {
		GoodsCommentMapper mapper=this.getSqlSession().getMapper(GoodsCommentMapper.class);
		mapper.update(goodsComment);
		
	}

	@Override
	public void delete(GoodsComment goodsComment) {
		GoodsCommentMapper mapper=this.getSqlSession().getMapper(GoodsCommentMapper.class);
		mapper.delete(goodsComment);
	}

	@Override
	public int findcount() {
		GoodsCommentMapper mapper=this.getSqlSession().getMapper(GoodsCommentMapper.class);
		return mapper.findcount();
	}

}
