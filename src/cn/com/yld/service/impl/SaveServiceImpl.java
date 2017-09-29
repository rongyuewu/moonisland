package cn.com.yld.service.impl;

import java.util.List;

import cn.com.yld.dao.SaveDao;
import cn.com.yld.pojo.Save;
import cn.com.yld.service.SaveService;

public class SaveServiceImpl implements SaveService {
	private SaveDao saveDao;

	public SaveDao getSaveDao() {
		return saveDao;
	}

	public void setSaveDao(SaveDao saveDao) {
		this.saveDao = saveDao;
	}

	@Override
	public List<Save> findall(Save save) {
		return saveDao.findall(save);
	}

	@Override
	public List<Save> findbyid() {
		return saveDao.findbyid();
	}

	@Override
	public void insert(Save save) {
		saveDao.insert(save);

	}

	@Override
	public void delete(Save save) {
		saveDao.insert(save);

	}

	@Override
	public int pagecount() {
		return saveDao.pagecount();
	}

	@Override
	public List<Save> findbylike(int page, int num) {
		return saveDao.findbylike(page, num);
	}

}
