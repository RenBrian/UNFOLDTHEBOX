package com.onebox.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.onebox.backend.entity.UUser;

public interface UUserDao extends JpaRepository<UUser, String>{
	@Query(value = "select * from one_uuser where uuser_email = ?", nativeQuery = true)
	public UUser getByEmail(String email);
	
	//获取加密的hash
	//uuser_name=? or uuser_email = ?
	@Query(value = "select uuser_hash from one_uuser where uuser_email = ?", nativeQuery = true)
	public String getUUserHash(String uuser_email);
	
	//更改hash/name/image
	@Modifying
	@Query(value = "update one_uuser set uuser_hash = ?, uuser_name = ?, uuser_image = ? where user_ID = ?", nativeQuery = true)
	public Integer updateUUser(String hash, String name, String image, String id);

}
