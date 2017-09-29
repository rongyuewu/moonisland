package cn.com.yld.service.impl;

import java.util.List;

import cn.com.yld.dao.AddressDao;
import cn.com.yld.pojo.Address;
import cn.com.yld.service.AddressService;

public class AddressServiceImpl implements AddressService {
	private AddressDao addressDao;
	
	public AddressDao getAddressDao() {
		return addressDao;
	}

	public void setAddressDao(AddressDao addressDao) {
		this.addressDao = addressDao;
	}

	@Override
	public List<Address> findall() {
		return addressDao.findall();
	}

	@Override
	public List<Address> findbyid(Address address) {
		return addressDao.findbyid(address);
	}

	@Override
	public void insert(Address address) {
		addressDao.insert(address);
	}

	@Override
	public void delect(Address address) {
		addressDao.delect(address);
	}

	@Override
	public void update(Address address) {
		addressDao.update(address);
	}

}
