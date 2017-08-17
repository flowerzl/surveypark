package com.zhaolei.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhaolei.dao.BaseDao;
import com.zhaolei.model.User;
import com.zhaolei.service.UserService;

@Service(value = "us")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

	@Resource(name = "userDao")
	public void setBaseDao(BaseDao<User> baseDao) {

		super.setBaseDao(baseDao);
	}

}
