package com.zhaolei.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.zhaolei.dao.BaseDao;
import com.zhaolei.service.BaseService;

public abstract class BaseServiceImpl<T> implements BaseService<T> {

	private BaseDao<T> baseDao;

	public BaseDao<T> getBaseDao() {
		return baseDao;
	}

	@Resource
	public void setBaseDao(BaseDao<T> baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public void save(T t) {
		baseDao.save(t);

	}

	@Override
	public void dalete(T t) {
		baseDao.dalete(t);

	}

	@Override
	public void update(T t) {
		baseDao.update(t);
	}

	@Override
	public T getOne(String name) {
		// TODO Auto-generated method stub
		return baseDao.getOne(name);
	}

	@Override
	public List<T> getAll() {

		return baseDao.getAll();
	}

}
