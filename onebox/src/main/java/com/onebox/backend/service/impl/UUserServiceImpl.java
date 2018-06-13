package com.onebox.backend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.onebox.backend.dao.UUserDao;
import com.onebox.backend.entity.UUser;
import com.onebox.backend.service.UUserService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
/**
 * uuser管理员用户
 * @ClassName: UUserServiceImpl  
 * @Description: TODO 
 * @author Brian  
 * @date 2018年6月9日  
 *
 */
@Service
public class UUserServiceImpl implements UUserService{
	@Autowired
	private UUserDao uuserDao;
	
	public int countUUsers() {
		return (int) uuserDao.count();
	}
	
	@Override
	public String getUUsers() {
		List<UUser> uusers = uuserDao.findAll();
		JSONArray json = JSONArray.fromObject(uusers);
		return json.toString();
	}

	@Override
	public String findUUser(String id) {
		UUser uuser = uuserDao.findOne(id);
		JSONObject json = JSONObject.fromObject(uuser);
		return json.toString();
	}	

	@Override
	@Transactional
	//判断邮箱是否已注册，已经注册则无效
	public String insert(UUser uuser) {
		UUser has_user = uuserDao.getByEmail(uuser.getUuser_email());
		if (has_user!=null) {
			return "{\"result\":\"occupied\"}";
		} else {
			UUser uuser_new = uuserDao.save(uuser);
			if (uuser_new!=null) {
				return "{\"result\":\"success\"}";
			}
			return "{\"result\":\"error\"}";
		}
	}

	@Override
	@Transactional
	public String update(String hash, String name, String image, String id) {
		try {
			uuserDao.updateUUser(hash, name, image, id);
			return "{\"result\":\"success\"}";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "{\"result\":\"error\"}";
	}
	//登陆验证
	@Override
	public String validate(String email, String hash) {
		String uuser_hash = uuserDao.getUUserHash(email);
		if (hash.equals(uuser_hash)) {
			String uuserid = uuserDao.getByEmail(email).getUuser_ID();
			return "{\"result\":\"success\",\"id\":"+ uuserid + "\"}";
		}
		return "{\"result\":\"error\"}";
	}
}
