package com.onebox.backend.controller;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.onebox.backend.tools.FileUtil;
import com.onebox.backend.tools.IPUtil;
/**
 * @ClassName: FileController  
 * @Description: 实现文件上传 - 返回的url中IP可能出错
 * @return {"result":"","filepath":""} 
 * @author Brian  
 * @date 2018年5月16日  
 */
@Controller
@RequestMapping("/common")
public class FileController {
	
	@Value("${web.file}")
	private String webFilePath;
	
	@Value("${server.port}")
	private String port;
	@Value("${server.context-path}")
	private String context;
	
	@RequestMapping("/upload")
	public @ResponseBody String uploadFile(@RequestParam("file") MultipartFile multipartFile, HttpServletRequest req, HttpServletResponse res) {
		//允许跨域访问
		res.setHeader("Access-Control-Allow-Headers", "accept, content-type");  
	    res.setHeader("Access-Control-Allow-Method", "POST");  
	    res.setHeader("Access-Control-Allow-Origin", "*");
		String contentType = multipartFile.getContentType();
		//重新命名
		String fileName = multipartFile.getOriginalFilename();
		String suffix = fileName.substring(fileName.lastIndexOf(".") + 1);
		String filename = UUID.randomUUID().toString().replace("-", "");
		fileName = filename +"."+ suffix;
		System.out.println("filename->>>" + fileName + "\nContentType->>>" + contentType);
		//获取存储路径
		String filepath = webFilePath + "/";
		
		System.out.println("filepath->>>>" + filepath);
		String fileurl = "http://" + IPUtil.getLocalIP() + ":" + port + context + "/" + fileName;
		System.out.println(fileurl);
		try {
			FileUtil.uploadFile(multipartFile.getBytes(), filepath, fileName);
			System.out.println("{\"result\":\"success\",\"filepath\":" + fileurl + "}");
			return "{\"result\":\"success\",\"filepath\":\"" + fileurl + "\"}";
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "{\"result\":\"error\"}";
	}

}
