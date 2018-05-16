up - down

2018-05-16
支持http/https
	https://www.jianshu.com/p/c3879add87ec
	https://www.jianshu.com/p/b6549f086b21
	https://yq.aliyun.com/articles/54056
ssl
	keytool -genkey -alias onebox -storetype PKCS12 -keyalg RSA -keysize 2048 -keystore keystore.p12 -validity 3650
	token: onebox
	CN=Ren, OU=CUHK, O=CUHK, L=HK, ST=HK, C=CN

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