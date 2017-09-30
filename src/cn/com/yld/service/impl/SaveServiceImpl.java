package cn.com.yld.service.impl;

import java.util.List;
import java.util.Map;

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
	public List<Save> findall() {
		return saveDao.findall();
	}

	@Override
	public List<Save> findbyid(Save save) {
		return saveDao.findbyid(save);
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
	public List<Save> findbylimit(Map map) {
		return saveDao.findbylimit(map);
	}

}
