package com.onebox.backend.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onebox.backend.entity.User;
import com.onebox.backend.service.UserService;

import net.sf.json.JSONObject;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	//首次登录存储用户信息
	//用户尾一标识openid
	//还需要字段:大名
	//{"username":"","openid":"","realname":""}
	@RequestMapping("/saveUser")
	public String map(@RequestBody Map<String, Object> reqMap) {
		String user_name = reqMap.get("username").toString();
		String user_ID = reqMap.get("openid").toString();
		String real_name = reqMap.get("realname").toString();
		String user_image = reqMap.get("userimage").toString();
		if(real_name==null) {
			real_name = "神秘小朋友";
		}
		//初始积分为0
		User user = new User(user_ID, user_name, real_name, 0, user_image);
		System.out.println(user);
		return userService.saveUser(user);
	}
	
	//根据openid查找用户
	//{"openid":""}
	@RequestMapping("/findByID")
	public String findByOpenID(@RequestBody Map<String, Object> reqMap) {
		String openid = reqMap.get("openid").toString();
		User user = userService.findByOpenID(openid);
		System.out.println(user);
		JSONObject json = JSONObject.fromObject(user);
		return json.toString();
	}
	
	//登录加积分
	@RequestMapping("/scoreIncrement")
	public String scoreIncrement(@RequestBody Map<String, Object> reqMap) {
		String openid = reqMap.get("openid").toString();
		return userService.increUserScore(openid);
	}
	

}
