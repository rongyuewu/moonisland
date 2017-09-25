package cn.com.yld.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.com.yld.dao.UserDao;
import cn.com.yld.mapper.UserMapper;
import cn.com.yld.pojo.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
	
	@Override
	public List<User> findall() {
		UserMapper mapper=this.getSqlSession().getMapper(UserMapper.class);
		return mapper.findall();
	}

	@Override
	public User finduser(User user) {
		UserMapper mapper=this.getSqlSession().getMapper(UserMapper.class);
		return mapper.finduser(user);
	}

	@Override
	public void insert(User user) {
		UserMapper mapper=this.getSqlSession().getMapper(UserMapper.class);
		mapper.insert(user);
	}

	@Override
	public void update(User user) {
		UserMapper mapper=this.getSqlSession().getMapper(UserMapper.class);
		mapper.update(user);
	}

	@Override
	public void delete(User user) {
		UserMapper mapper=this.getSqlSession().getMapper(UserMapper.class);
		mapper.delete(user);
	}

	@Override
	public void cleandelete(User user) {
		UserMapper mapper=this.getSqlSession().getMapper(UserMapper.class);
		mapper.cleandelete(user);
	}

	@Override
	public User findlogin(User user) {
		UserMapper mapper=this.getSqlSession().getMapper(UserMapper.class);
		return mapper.findlogin(user);
	}

}
