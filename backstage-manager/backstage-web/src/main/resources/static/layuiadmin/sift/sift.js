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
            url:path+"/sift/queryCode",
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

function oneDiv(type) {
    if (type == 2){
        $("#one").show();
        type1="2";
    }else{
        $("#one").hide();
        type1="1";
    }
}

function twoDiv(type) {
    if (type==2){
        $("#two").show();
        type2="2";
    }else{
        $("#two").hide();
        type2="1";
    }
}
function threeDiv(type) {
    if (type==2){
        $("#three").show();
        type3="2";
    }else{
        $("#three").hide();
        type3="1";
    }
}
function fourDiv(type) {
    if (type==2){
        $("#four").show();
        type4="2";
    }else{
        $("#four").hide();
        type4="1";
    }
}
function fiveDiv(type) {
    if (type==2){
        $("#five").show();
        type5="2";
    }else{
        $("#five").hide();
        type5="1";
    }
}
function sixDiv(type) {
    if (type==2){
        $("#six").show();
        type6="2";
    }else{
        $("#six").hide();
        type6="1";
    }
}
function sevenDiv(type) {
    if (type==2){
        $("#seven").show();
        type7="2";
    }else{
        $("#seven").hide();
        type7="1";
    }
}
function eightDiv(type) {
    if (type==2){
        $("#eight").show();
        type8="2";
    }else{
        $("#eight").hide();
        type8="1";
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
        type9="2";
    }else{
        $("#nine").hide();
        type9="1";
    }
}
function tenDiv(type) {
    if (type==2){
        $("#ten").show();
        type10="2";
    }else{
        $("#ten").hide();
        type10="1";
    }
}
function elevenDiv(type) {
    if (type==2){
        $("#eleven").show();
        type11="2";
    }else{
        $("#eleven").hide();
        type11="1";
    }
}
function twelveDiv(type) {
    if (type==2){
        $("#twelve").show();
        type12="2";
    }else{
        $("#twelve").hide();
        type12="1";
    }
}
function thirteenDiv(type) {
    if (type==2){
        $("#thirteen").show();
        type13="2";
    }else{
        $("#thirteen").hide();
        type13="1";
    }
}
function resert() {
    window.location.reload();
}
function th14Div(type) {
    if (type==2){
        $("#th14").show();
        type14="2";
    }else{
        $("#th14").hide();
        type14="1";
    }
}function th15Div(type) {
    if (type==2){
        $("#th15").show();
        type15="2";
    }else{
        $("#th15").hide();
        type15="1";
    }
}function th16Div(type) {
    if (type==2){
        $("#th16").show();
        type16="2";
    }else{
        $("#th16").hide();
        type16="1";
    }
}function th17Div(type) {
    if (type==2){
        $("#th17").show();
        type17="2";
    }else{
        $("#th17").hide();
        type17="7";
    }
}function th18Div(type) {
    if (type==2){
        $("#th18").show();
        type18="2";
    }else{
        $("#th18").hide();
        type18="1";
    }
}function th19Div(type) {
    if (type==2){
        $("#th19").show();
        type19="2";
    }else{
        $("#th19").hide();
        type19="1";
    }
}function th20Div(type) {
    if (type==2){
        $("#th20").show();
        type20="2";
    }else{
        $("#th20").hide();
        type20="1";
    }
}function th21Div(type) {
    if (type==2){
        $("#th21").show();
        type21="2";
    }else{
        $("#th21").hide();
        type21="1";
    }
}function th22Div(type) {
    if (type==2){
        $("#th22").show();
        type22="2";
    }else{
        $("#th22").hide();
        type22="1";
    }
}function th23Div(type) {
    if (type==2){
        $("#th23").show();
        type23="2";
    }else{
        $("#th23").hide();
        type23="1";
    }
}function th24Div(type) {
    if (type==2){
        $("#th24").show();
        type24="2";
    }else{
        $("#th24").hide();
        type24="1";
    }
}function th25Div(type) {
    if (type==2){
        $("#th25").show();
        type25="2";
    }else{
        $("#th25").hide();
        type25="1";
    }
}function th26Div(type) {
    if (type==2){
        $("#th26").show();
        type26="2";
    }else{
        $("#th26").hide();
        type26="1";
    }
}function th27Div(type) {
    if (type==2){
        $("#th27").show();
        type27="2";
    }else{
        $("#th27").hide();
        type27="1";
    }
}function th28Div(type) {
    if (type==2){
        $("#th28").show();
        type28="2";
    }else{
        $("#th28").hide();
        type28="1";
    }
}function th29Div(type) {
    if (type==2){
        $("#th29").show();
        type29="2";
    }else{
        $("#th29").hide();
        type29="0";
    }
}function th30Div(type) {
    if (type==2){
        $("#th30").show();
        type30="2";
    }else{
        $("#th30").hide();
        type30="0";
    }
}function th31Div(type) {
    if (type==2){
        $("#th31").show();
        type31="2";
    }else{
        $("#th31").hide();
        type31="1";
    }
}function th32Div(type) {
    if (type==2){
        $("#th32").show();
        type32="2";
    }else{
        $("#th32").hide();
        type32="1";
    }
}function th33Div(type) {
    if (type==2){
        $("#th33").show();
        type33="2";
    }else{
        $("#th33").hide();
        type33="1";
    }
}function th34Div(type) {
    if (type==2){
        $("#th34").show();
        type34="2";
    }else{
        $("#th34").hide();
        type34="1";
    }

}
function th35Div(type) {
    if (type==2){
        $("#th35").show();
        type35="2";
    }else{
        $("#th35").hide();
        type35="1";
    }
}
function th37Div(type) {
    if (type==2){
        $("#th37").show();
        type37="2";
    }else{
        $("#th37").hide();
        type37="1";
    }
}
function th36Div(type) {
    if (type==2){
        $("#th36").show();
        type36="2";
    }else{
        $("#th36").hide();
        type36="1";
    }

}
function th38Div(type) {
    if (type==2){
        $("#th38").show();
        type38="2";
    }else{
        $("#th38").hide();
        type38="1";
    }
}
function th39Div(type) {
    if (type==2){
        $("#th39").show();
        type39="2";
    }else{
        $("#th39").hide();
        type39="1";
    }
}
function th40Div(type) {
    if (type==2){
        $("#th40").show();
        type40="2";
    }else{
        $("#th40").hide();
        type40="1";
    }
}
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