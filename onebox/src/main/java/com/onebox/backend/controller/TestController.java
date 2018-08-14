package com.onebox.backend.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {
	//测试列表
	@RequestMapping("/list")
	public String testList() {
		return "/test/list";
	}
	//某个测试的详细信息
	@RequestMapping("/detail")
	public String testDetail() {
		return "/test/detail";
	}
	
	//新建测试
	@RequestMapping("/generate")
	public String testGenerate() {
		return "/test/generate";
	}
	//生成测试的实现 - 不同的方式 - 接口实现
	//Exercise平时练习(题库中提取) / Exam考试习题（导入） / 错题回顾（数据库中提取）
	@RequestMapping("/genTestbyLib") 
	public @ResponseBody String genTestbyLib(@RequestBody Map<String, Object> reqMap) {
		//学科 mandarin / math
		String subject = reqMap.get("subject").toString();
		int ammount = Integer.parseInt(reqMap.get("ammount").toString());
		return subject + ammount;
	}
	//导入试题
	@RequestMapping("/genTestbyImport")
	public @ResponseBody String genTestbyImport(@RequestBody Map<String, Object> map) {
		return "";
	}
	//错题回顾
	@RequestMapping("/genTestbyHistory")
	public @ResponseBody String genTestbyHistory(@RequestBody Map<String, Object> map) {
		return "";
	}
	
	

}
