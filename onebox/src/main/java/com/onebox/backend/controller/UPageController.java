package com.onebox.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UPageController {
	//主页
	@RequestMapping("/index")
	public String index() {
		return "/index";
	}
	
}
