package com.zhaolei.service;

import java.util.List;

public interface BaseService<T> {
	void save(T t);

	void dalete(T t);

	void update(T t);

	T getOne(String name);

	List<T> getAll();
}
