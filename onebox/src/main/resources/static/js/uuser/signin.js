$().ready(function() {
	
	$(document).on('click','#signin_click',function(e){
		var email = $("#inputEmail").val();
		var passward = $("#inputPassword").val();
		//hash function 
		$.ajax{(
			url:'',
			type:'POST',
			contentType:'application/json',
			dataType:'json',
			timeout: 5000,
			data:JSON.stringify({
				"useremail":email,
				"userpassword":password
			}),
			success:function(data){
				if (data.result=="success") {
					window.location = "/onebox/uuser/index";
				}else{
					toastr.warning("邮箱或密码不正确");
				}
			},
			error:function(e){
				console.log(e);
				toastr.error("请求失败！");
			}
		)};
	});
	
	
});