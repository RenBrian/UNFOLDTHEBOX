package com.onebox.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.onebox.backend.entity.UUser;

public interface UUserDao extends JpaRepository<String, UUser>{
	
	@Query(value = "select uuser_psw from user where user_ID = ?", nativeQuery = true)
	public Integer getUserScore(String uuserid);

}
