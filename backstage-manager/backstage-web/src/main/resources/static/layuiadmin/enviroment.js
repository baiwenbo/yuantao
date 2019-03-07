$(document).ready(function(){
    $("#one").hide();
    $("#two").hide();
    $("#three").hide();
    $("#four").hide();
    $("#five").hide();
    $("#six").hide();
    $("#seven").hide();
    $("#eight").hide();
    $("#ninesuper").hide();
    $("#nine").hide();
    $("#ten").hide();
    $("#eleven").hide();
    $("#twelve").hide();
    $("#thirteen").hide();


    $("#submit").click(function(){
        var data = {};
        var t = $('form').serializeArray();

        $.each(t, function() {
            data [this.name] = this.value;


        });
        $.ajax({
            type:"post",
            contentType: 'application/json;charset=UTF-8',
            url:"/testPaper/save",
            dataType:"text",
            async : false,
            data: JSON.stringify(data),
            success:function(result){
                if(result=="ok"){
                    alert("提交成功！");
                    window.parent.location.reload();
                }else{
                    alert(result);
                }
            },
            error: function(result) {
                alert("服务异常");
            }

        });

    });

    $("#queryCompany").click(function(){
      var customerName=$("#customerName").val();
        $.ajax({
            type:"get",
            url:"/xiaodian/queryName",
            data: "id="+customerName,
            dataType:"json",
            async : false,
            success:function(result){
                var html="<select name='companyId'>"
               for (var i=0;i<result.length;i++){
                    html+="<option value="+result[i].id+">"+result[i].name+"</option>"
               }
                html+="</select>"
                $("#companyList").append(html);
            },
            error: function(result) {
                alert("服务异常");
            }

        });

    });
});

function oneDiv(type) {
    if (type==2){
        $("#one").show();
    }else{
        $("#one").hide();
    }
}
function twoDiv(type) {
    if (type==2){
        $("#two").show();
    }else{
        $("#two").hide();
    }
}
function threeDiv(type) {
    if (type==2){
        $("#three").show();
    }else{
        $("#three").hide();
    }
}
function fourDiv(type) {
    if (type==2){
        $("#four").show();
    }else{
        $("#four").hide();
    }
}
function fiveDiv(type) {
    if (type==2){
        $("#five").show();
    }else{
        $("#five").hide();
    }
}
function sixDiv(type) {
    if (type==2){
        $("#six").show();
    }else{
        $("#six").hide();
    }
}
function sevenDiv(type) {
    if (type==2){
        $("#seven").show();
    }else{
        $("#seven").hide();
    }
}
function eightDiv(type) {
    if (type==2){
        $("#eight").show();
    }else{
        $("#eight").hide();
    }
}
function ninesuperDiv(type) {
    if (type==2){
        $("#ninesuper").show();
    }else{
        $("#ninesuper").hide();
    }
}
function nineDiv(type) {
    if (type==2){
        $("#nine").show();
    }else{
        $("#nine").hide();
    }
}
function tenDiv(type) {
    if (type==2){
        $("#ten").show();
    }else{
        $("#ten").hide();
    }
}
function elevenDiv(type) {
    if (type==2){
        $("#eleven").show();
    }else{
        $("#eleven").hide();
    }
}
function twelveDiv(type) {
    if (type==2){
        $("#twelve").show();
    }else{
        $("#twelve").hide();
    }
}
function thirteenDiv(type) {
    if (type==2){
        $("#thirteen").show();
    }else{
        $("#thirteen").hide();
    }
}
function resert() {
    window.location.reload();
}