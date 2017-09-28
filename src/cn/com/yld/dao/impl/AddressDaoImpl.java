package cn.com.yld.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.com.yld.dao.AddressDao;
import cn.com.yld.mapper.AddressMapper;
import cn.com.yld.pojo.Address;

public class AddressDaoImpl extends SqlSessionDaoSupport implements AddressDao {

	@Override
	public List<Address> findall() {
		AddressMapper mapper = this.getSqlSession().getMapper(AddressMapper.class);
		return mapper.findall();
	}

	@Override
	public List<Address> findbyid(Address address) {
		AddressMapper mapper = this.getSqlSession().getMapper(AddressMapper.class);
		return mapper.findbyid(address);
	}

	@Override
	public void insert(Address address) {
		AddressMapper mapper = this.getSqlSession().getMapper(AddressMapper.class);
		mapper.insert(address);
	}

	@Override
	public void delect(Address address) {
		AddressMapper mapper = this.getSqlSession().getMapper(AddressMapper.class);
		mapper.delect(address);
	}

	@Override
	public void update(Address address) {
		AddressMapper mapper = this.getSqlSession().getMapper(AddressMapper.class);
		mapper.update(address);

	}

}
