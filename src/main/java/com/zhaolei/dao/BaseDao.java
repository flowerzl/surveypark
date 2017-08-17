package com.zhaolei.dao;

import java.util.List;

public interface BaseDao<T> {
	void save(T t);

	void dalete(T t);

	void update(T t);

	T getOne(String name);

	List<T> getAll();
}
