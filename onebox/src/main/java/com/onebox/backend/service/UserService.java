package com.onebox.backend.service;

import com.onebox.backend.entity.User;

public interface UserService {
	
	public String saveUser(User user);
	
	public User findByOpenID(String openid);
	
	public Integer getUserScore(String openid);
	
	public String increUserScore(String openid);

}
