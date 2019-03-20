$(document).ready(function(){

});

function  fileFour(obj) {
    var formData = new FormData();

 var nameId=obj.id;
 var  file= $("input[name='"+nameId+"']");
 nameId=nameId.substr(0, nameId.length - 4);
 var name=$("#"+nameId+"").val();
    formData.append("file", $("input[name='"+obj.id+"']")[0].files[0]);
    $.ajax({
        type:"post",
        url:path+"/environment/saveQuestion",
        processData: false,
        contentType: false,
        data: formData,
        dataType:"text",
        async : false,
        success:function(result){
            alert("上传成功");
            var urlimg="";
          if (name!=""){
              urlimg =name+","+result;
          } else{
              urlimg=result;
          }
            $("#"+nameId+"").val(urlimg);
          //上传完图片后需要删除该图片，否则该图片依然存在就会导致上传图片文件过大原因
            file.val("");
        },
        error: function(result) {
            alert("服务异常");
        }

    });


}