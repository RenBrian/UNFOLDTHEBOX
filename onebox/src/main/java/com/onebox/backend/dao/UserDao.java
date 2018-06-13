package com.onebox.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.onebox.backend.entity.User;

public interface UserDao extends JpaRepository<User,String> {
	
	@Query(value = "select user_score from one_user where user_ID = ?", nativeQuery = true)
	public Integer getUserScore(String openid);
	
	@Modifying
	@Query(value = "update one_user set real_name = ? where user_ID = ?", nativeQuery = true)
	public Integer fixUser(String realname, String openid);
	
	@Modifying
	@Query(value = "update one_user set user_score = ? where user_ID = ?", nativeQuery = true)
	public Integer increUserScore(Integer score, String openid);

}
