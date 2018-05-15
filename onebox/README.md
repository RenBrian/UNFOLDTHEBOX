2018-05-16
用户中心接口测试OK
server.port=8080
+ http://localhost:8080/onebox/api 查看接口信息
+ /onebox/uploading 上传文件测试页面
+ 上传文件
	url:/onebox/common/upload
	request:@RequestParam("file") MultipartFile multipartFile
	response:{"result":"success/error"[,"filepath":""]}
+ 用户中心
	+ 首次登陆存储用户信息
	url:/onebox/user/saveUser
	request:{"username":"","openid":"","realname":"","userimage":""}
	response:{"result": "success/error"}

	+ 按ID查找
	url:/onebox/user/findByID
	request:{"openid":""}
	response:{"user_ID":"","user_image":"","user_score":0,"user_name":"","real_name":""}
	
	+ 登陆积分+1
	url:/onebox/user/scoreIncrement
	request:{"openid":""}
	response:{"result": "success/error"}