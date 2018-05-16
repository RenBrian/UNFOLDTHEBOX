package com.onebox.backend.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@RequestMapping("/genTest") 
	public String genTest(@RequestBody Map<String, Object> reqMap) {
		//学科 mandarin / math
		String subject = reqMap.get("subject").toString();
		//Exercise平时练习(题库中提取) / Exam考试习题（导入） / 错题回顾（数据库中提取）
		String type = reqMap.get("type").toString();
		int ammount = Integer.parseInt(reqMap.get("ammount").toString());
		
		return "";
	}
	
	

}
