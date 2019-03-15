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
    $("#th14").hide();
    $("#th15").hide();
    $("#th16").hide();
    $("#th17").hide();
    $("#th18").hide();
    $("#th19").hide();
    $("#th20").hide();
    $("#th21").hide();
    $("#th22").hide();
    $("#th23").hide();
    $("#th24").hide();
    $("#th25").hide();
    $("#th26").hide();
    $("#th27").hide();
    $("#th28").hide();
    $("#th29").hide();
    $("#th30").hide();
    $("#th31").hide();
    $("#th32").hide();
    $("#th33").hide();
    $("#th34").hide();
    $("#th35").hide();
    $("#th36").hide();
    $("#th37").hide();
    $("#th38").hide();
    $("#th39").hide();
    $("#th40").hide();


    $("#queryCompany").click(function(){
        $("#companyList").empty();
      var customerName=$("#customerName").val();
        $.ajax({
            type:"get",
            url:path+"/environment/queryName",
            data: "name="+customerName,
            dataType:"json",
            async : false,
            success:function(result){
                var html="<select name='companyId' style='width: 130px;height: 40px'>"
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
function th14Div(type) {
    if (type==2){
        $("#th14").show();
    }else{
        $("#th14").hide();
    }
}function th15Div(type) {
    if (type==2){
        $("#th15").show();
    }else{
        $("#th15").hide();
    }
}function th16Div(type) {
    if (type==2){
        $("#th16").show();
    }else{
        $("#th16").hide();
    }
}function th17Div(type) {
    if (type==2){
        $("#th17").show();
    }else{
        $("#th17").hide();
    }
}function th18Div(type) {
    if (type==2){
        $("#th18").show();
    }else{
        $("#th18").hide();
    }
}function th19Div(type) {
    if (type==2){
        $("#th19").show();
    }else{
        $("#th19").hide();
    }
}function th20Div(type) {
    if (type==2){
        $("#th20").show();
    }else{
        $("#th20").hide();
    }
}function th21Div(type) {
    if (type==2){
        $("#th21").show();
    }else{
        $("#th21").hide();
    }
}function th22Div(type) {
    if (type==2){
        $("#th22").show();
    }else{
        $("#th22").hide();
    }
}function th23Div(type) {
    if (type==2){
        $("#th23").show();
    }else{
        $("#th23").hide();
    }
}function th24Div(type) {
    if (type==2){
        $("#th24").show();
    }else{
        $("#th24").hide();
    }
}function th25Div(type) {
    if (type==2){
        $("#th25").show();
    }else{
        $("#th25").hide();
    }
}function th26Div(type) {
    if (type==2){
        $("#th26").show();
    }else{
        $("#th26").hide();
    }
}function th27Div(type) {
    if (type==2){
        $("#th27").show();
    }else{
        $("#th27").hide();
    }
}function th28Div(type) {
    if (type==2){
        $("#th28").show();
    }else{
        $("#th28").hide();
    }
}function th29Div(type) {
    if (type==2){
        $("#th29").show();
    }else{
        $("#th29").hide();
    }
}function th30Div(type) {
    if (type==2){
        $("#th30").show();
    }else{
        $("#th30").hide();
    }
}function th31Div(type) {
    if (type==2){
        $("#th31").show();
    }else{
        $("#th31").hide();
    }
}function th32Div(type) {
    if (type==2){
        $("#th32").show();
    }else{
        $("#th32").hide();
    }
}function th33Div(type) {
    if (type==2){
        $("#th33").show();
    }else{
        $("#th33").hide();
    }
}function th34Div(type) {
    if (type==2){
        $("#th34").show();
    }else{
        $("#th34").hide();
    }

}
function th35Div(type) {
    if (type==2){
        $("#th35").show();
    }else{
        $("#th35").hide();
    }
}
function th37Div(type) {
    if (type==2){
        $("#th37").show();
    }else{
        $("#th37").hide();
    }
}
function th36Div(type) {
    if (type==2){
        $("#th36").show();
    }else{
        $("#th36").hide();
    }
}
function th38Div(type) {
    if (type==2){
        $("#th38").show();
    }else{
        $("#th38").hide();
    }
}
function th39Div(type) {
    if (type==2){
        $("#th39").show();
    }else{
        $("#th39").hide();
    }
}
function th40Div(type) {
    if (type==2){
        $("#th40").show();
    }else{
        $("#th40").hide();
    }
}
layui.config({
    base: path+'/layuiadmin/' //静态资源所在路径
}).extend({
    index: 'lib/index' //主入口模块
}).use(['index', 'laydate'], function(){
    var laydate = layui.laydate;

    //示例代码


    //日期时间选择器
    laydate.render({
        elem: '#executedate'
        ,type: 'datetime'
    });
    laydate.render({
        elem: '#starttime'
        ,type: 'datetime'
    });
    laydate.render({
        elem: '#endtime'
        ,type: 'datetime'
    });
});
