package com.onebox.backend.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 
 * @ClassName: StatisticsController  
 * @Description: 数据统计相关类
 * @author Brian  
 * @date 2018年8月13日  
 *
 */
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("/statistics")
public class StatisticsController {
	//返回数据统计页面
	@RequestMapping("/data")
	public String statisticsData() {
		return "/statistics/data";
	}
	
	//班级整体数据
	@RequestMapping("/class")
	public @ResponseBody String getClassData(@RequestBody Map<String, Object> map) {
		String class_id = map.get("class_id").toString();
		return class_id;
	}
	//个人数据
	@RequestMapping("/pupil")
	public @ResponseBody String getPupilData(@RequestBody Map<String, Object> map) {
		String pupil_id = map.get("user_id").toString();
		return pupil_id;
	}
	//某道题的历史数据
	@RequestMapping("/exercise")
	public @ResponseBody String getExerciseData(@RequestBody Map<String, Object> map) {
		String exercise_id = map.get("exercise_id").toString();
		return exercise_id;
	}

}
