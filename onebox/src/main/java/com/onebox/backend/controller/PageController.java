package com.onebox.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 
 * @ClassName: PageController  
 * @Description: 页面请求映射 
 * @author Brian  
 * @date 2018年5月14日  
 *
 */
@Controller
public class PageController {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/api")
	public String api() {
		return "api";
	}
	
	@RequestMapping("/userinfo")
	public String userinfo() {
		return "userinfo";
	}
	
	@RequestMapping("/test")
	public String testpage() {
		return "testpage";
	}
	
	@RequestMapping("/record")
	public String record() {
		return "record";
	}
	
	@RequestMapping("/uploading")
	public String upload() {
		return "uploading";
	}

}
