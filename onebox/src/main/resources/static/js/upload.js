$().ready(function() {
    $("#upload").click(function(){
    	//console.log("click");
    	var form = $("#upload_form");
    	console.log(form[0]);
    	var formdata = new FormData(form[0]); 
    	/* var file = $("#file");
    	console.log(file);
    	var formdata = new FormData();
    	formdata.append("file",file[0]); */
    	$.ajax({
            url: '/xtags/fileupload',
            type: 'POST',
            data: formdata,                    // 上传formdata封装的数据
            dataType: 'JSON',
            cache: false,                      // 不缓存
            processData: false,                // 告诉jQuery不要去处理发送的数据
            contentType: false,                // 告诉jQuery不要去设置Content-Type请求头
            success:function (msg) {           //成功回调
                console.log(msg);
                //$("#upload").attr("disabled","disabled");
            	var flag = msg.result;
            	if(flag=="success"){
            		console.log("上传成功！");
            	}else if(flag=="error"){
            		console.log("上传失败！");
            	}
            },error:function (err){
            	console.log("上传调用错误");
            }
        });
    });
});
