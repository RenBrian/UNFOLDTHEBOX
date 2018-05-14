package com.onebox.backend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.onebox.backend.dao.UserDao;
import com.onebox.backend.entity.User;
import com.onebox.backend.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	
	@Override
	public User findByOpenID(String openid) {
		return userDao.findOne(openid);
	}
	
	@Override
	public Integer getUserScore(String openid) {
		return userDao.getUserScore(openid);
	}

	@Transactional
	@Override
	public String saveUser(User user) {
		try {
			userDao.save(user);
			return "{\"result\":\"success\"}";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "{\"result\":\"error\"}";
	}

}
