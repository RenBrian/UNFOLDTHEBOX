package com.onebox.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @ClassName: PageController  
 * @Description: uuser的页面控制
 * @author Brian  
 * @date 2018年7月21日  
 *
 */
@Controller
@RequestMapping("/uuser")
public class UUserPageController {
	//登录
	@RequestMapping("/signin")
	public String login() {
		return "/uuser/signin";
	}
	//注册
	@RequestMapping("/signup")
	public String signup() {
		return "/uuser/signup";
	}
	//重置密码
	@RequestMapping("/reset")
	public String reset() {
		return "/uuser/reset";
	}
	
	//题库页面
	@RequestMapping("/lib")
	public String lib() {
		return "/uuser/lib";
	}
	//测试页面
	@RequestMapping("/test")
	public String test() {
		return "/uuser/test";
	}
	//成绩页面
	@RequestMapping("/result")
	public String result() {
		return "/uuser/result";
	}
	//个人中心页面
	@RequestMapping("/info")
	public String uuserinfo() {
		return "/uuser/info";
	}
	//关于我们的介绍页面
	@RequestMapping("/about")
	public String introduction() {
		return "/onebox";
	}

}
