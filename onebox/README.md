up - down

2018-05-20
+ tomcat 支持https
	- https://blog.csdn.net/bao19901210/article/details/8768362
	x Invalid character found in method name. HTTP method names must be tokens
	x 本是http的请求 错误使用https方式请求 就会报该错

2018-05-16
+ 支持http/https
	+ https://www.cnblogs.com/lianggp/p/8136540.html
+ ssl
	+ keytool -genkey -alias onebox -storetype PKCS12 -keyalg RSA -keysize 2048 -keystore keystore.p12 -validity 3650
	+ token: onebox
	+ CN=Ren, OU=CUHK, O=CUHK, L=HK, ST=HK, C=CN
 
2018-05-16
用户中心接口测试OK
+ server.port=8080
+ http://localhost:8080/onebox/api 查看接口信息
+ /onebox/uploading 上传文件测试页面
+ 上传文件
	+ url:/onebox/common/upload
	+ request:@RequestParam("file") MultipartFile multipartFile
	+ response:{"result":"success/error"[,"filepath":""]}
	
+ 用户中心
+ 首次登陆存储用户信息
	+ url:/onebox/user/saveUser
	+ request:{"username":"","openid":"","userimage":""}
	+ response:{"result": "success/error"}
	
+ 完善用户信息，统计真实姓名
	+ url:/onebox/user/fixUser
	+ request:{"realname":"","openid":""}
	+ response:{"result": "success/error"}

+ 按ID查找
	+ url:/onebox/user/findByID
	+ request:{"openid":""}
	+ response:{"user_ID":"","user_image":"","user_score":0,"user_name":"","real_name":""}
	
+ 登陆积分+1
	+ url:/onebox/user/scoreIncrement
	+ request:{"openid":""}
	+ response:{"result": "success/error"}