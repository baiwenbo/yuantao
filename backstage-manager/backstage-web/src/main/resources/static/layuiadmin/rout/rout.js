$(document).ready(function(){
    $("#one").hide();
    $("#two").hide();
    $("#three").hide();
    $("#four").hide();
    $("#five").hide();
    $("#six").hide();
    $("#seven").hide();
    $("#eight").hide();
   // $("#ninesuper").hide();
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

    $("#queryCompany").click(function(){

      var code=$("#code").val();
      if (code==""){
          alert("门店编码不能为空");
          return;
      }
        $("#name").val("");
        $("#address").val("");
        $("#pianqu").val("");
        $("#daqu").val("");
        $("#company").val("");
        $("#companyId").val("");
        $.ajax({
            type:"get",
            url:path+"/environment/queryCode",
            data: "code="+code,
            dataType:"json",
            async : false,
            success:function(result){
               $("#name").val(result.name);
               $("#address").val(result.address);
               $("#pianqu").val(result.pianqu);
               $("#daqu").val(result.daqu);
               $("#company").val(result.company);
               $("#companyId").val(result.id);
            },
            error: function(result) {
                alert("服务异常");
            }

        });

    });

});
/*
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
function th3Div(type) {
    if (type==2){
        $("#th3").hide();
    }else{
        $("#th3").show();
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
}*/
layui.config({
    base: path+'/layuiadmin/' //静态资源所在路径
}).extend({
    index: 'lib/index' //主入口模块
}).use(['index', 'form','laydate'], function(){
    var $ = layui.jquery
        ,laydate = layui.laydate


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
    laydate.render({
        elem: '#spotdate'
        ,type: 'datetime'
    });

});
//限制上传文件的类型和大小
function validate_img(ele){
    // 返回 KB，保留小数点后两位
    //alert((ele.files[0].size/(1024*1024)).toFixed(2));
    var file = ele.value;

    if(!/.(gif|jpg|jpeg|png|GIF|JPG|bmp)$/.test(file)){

        alert("图片类型必须是.gif,jpeg,jpg,png,bmp中的一种");
        return false;

    }else{

        //alert((ele.files[0].size).toFixed(2));
        //返回Byte(B),保留小数点后两位
        if(((ele.files[0].size).toFixed(2))>=(2*1024*1024)){

            alert("请上传小于2M的图片");
            ele.value="";
            return false;
        }
    }
    alert("图片通过");
}