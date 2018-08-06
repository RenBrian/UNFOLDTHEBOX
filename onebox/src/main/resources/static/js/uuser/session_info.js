/**
 * 获取当前session用户登陆信息
 * @returns
 */
$().ready(function(){
	$.ajax({
		url:"/onebox/uuser/session",
		type:"GET",
		contentType:"application/json",
		dateType:"json",
		timeout:5000,
		success:function(data){
			if (data.result == "success") {
				var username = data.username;
				var useremail = data.useremail;
				var userimage = data.userimage;
			}else {
				console.log("session no user");
				toastr.info("当前用户未登陆");
			}
		},
		error:function(e){
			console.log(e);
			toastr.error("请求失败！");
		}
	});
	
});