$(document).ready(function(){

});

function  fileFour(obj) {
    var formData = new FormData();
 var nameId=obj.id;
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
        },
        error: function(result) {
            alert("服务异常");
        }

    });


}