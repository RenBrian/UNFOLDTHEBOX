package com.onebox.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teacher")
public class TeacherPageController {
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/uuserinfo")
	public String uuserinfo() {
		return "uuserinfo";
	}
}
