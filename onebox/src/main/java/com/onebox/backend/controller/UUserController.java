package com.onebox.backend.controller;

import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onebox.backend.entity.UUser;
import com.onebox.backend.service.UUserService;

import net.sf.json.JSONObject;

@RestController
@RequestMapping("/uuser")
public class UUserController {
	
	@Autowired
	private UUserService uuserService; 
	//注册
	@RequestMapping("/register")
	public String register(Map<String, Object> map) {
		String id = UUID.randomUUID().toString().replaceAll("-", "");
		UUser uuser = new UUser(
				map.get("hash").toString(),
				map.get("name").toString(),
				map.get("email").toString());
		uuser.setUuser_ID(id);
		return uuserService.insert(uuser);
	}
	//UUser登陆
	@RequestMapping("/uuser/login")
	public String login(Map<String, Object> map, HttpSession session) {
		String email = map.get("email").toString();
		String hash = map.get("hash").toString();
		String response = uuserService.validate(email, hash);
		
		JSONObject json = JSONObject.fromObject(response);
		if (json.get("result").toString().equals("success")) {
			session.setAttribute("uuserid", json.get("id").toString());
		}
		return response;
	}
	//修改信息
	@RequestMapping("/modify")
	public String modify(Map<String, Object> map) {
		String id = map.get("id").toString();
		String name = map.get("name").toString();
		String hash = map.get("hash").toString();
		String image = map.get("image").toString();
		return uuserService.update(hash, name, image, id);
	}
	
	@RequestMapping("/getInfo")
	public String getInfo(Map<String, Object> map) {
		String id = map.get("id").toString();
		return uuserService.findUUser(id);
	}
	
	@RequestMapping("/getUUsers")
	public String getAllUUsers() {
		return uuserService.getUUsers();
	}
}
