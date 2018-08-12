package com.onebox.backend.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/lib")
public class LibController {
	//获取题库列表
	@RequestMapping("/list")
	public String list() {
		return "/lib/list";
	}
	
	@RequestMapping("/getList")
	public @ResponseBody String getList(@RequestBody Map<String, Object> map) {
		String subject = map.get("subject").toString();
		
		return subject;
	}
	//获取某题详细信息 - 查看修改
	@RequestMapping("/exercise")
	public String exercise() {
		return "/lib/exercise";
	}
	
	@RequestMapping("/getExercise")
	public @ResponseBody String getExercise(@RequestBody Map<String, Object> map) {
		String e_id = map.get("exercise_id").toString();
		return e_id;
	}
	
	@RequestMapping("/updateExercise")
	public @ResponseBody String updateExercise(@RequestBody Map<String, Object> map) {
		String e_id = map.get("exercise_id").toString();
		return e_id;
	}
	
	@RequestMapping("/deleteExercise")
	public @ResponseBody String deleteExercise(@RequestBody Map<String, Object> map) {
		String e_id = map.get("exxercise_id").toString();
		return e_id;
	}
	
	@RequestMapping("/deleteList")
	public @ResponseBody String deleteList(@RequestBody Map<String, Object> map) {
		String e_ids = map.get("exercise_ids").toString();
		return e_ids;
	}
	

}
