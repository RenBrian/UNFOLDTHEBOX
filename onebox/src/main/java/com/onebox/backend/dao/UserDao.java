package com.onebox.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.onebox.backend.entity.User;

public interface UserDao extends JpaRepository<User,String> {
	
	@Query(value = "select user_score from user where user_ID = ?", nativeQuery = true)
	public Integer getUserScore(String openid);

}
