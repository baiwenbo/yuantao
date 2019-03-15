$(document).ready(function(){
    var th1=$("input[name='topic1One']:checked").val();
    var th2=$("input[name='topic2One']:checked").val();
    var th3=$("input[name='topic3One']:checked").val();
    var th4=$("input[name='topic4One']:checked").val();
    var th5=$("input[name='topic5One']:checked").val();
    var th6=$("input[name='topic6One']:checked").val();
    var th7=$("input[name='topic7One']:checked").val();
    var th8=$("input[name='topic8One']:checked").val();
    var th9=$("input[name='topic9One']:checked").val();
    var th9t=$("input[name='topic9Two']:checked").val();
    var th10=$("input[name='topic10One']:checked").val();
    var th11=$("input[name='topic11One']:checked").val();
    var th12=$("input[name='topic12One']:checked").val();
    var th13=$("input[name='topic13One']:checked").val();
    var th14=$("input[name='topic14One']:checked").val();
    var th15=$("input[name='topic15One']:checked").val();
    var th16=$("input[name='topic16One']:checked").val();
    var th17=$("input[name='topic17One']:checked").val();
    var th18=$("input[name='topic18One']:checked").val();
    var th19=$("input[name='topic19One']:checked").val();
    var th20=$("input[name='topic20One']:checked").val();
    var th21=$("input[name='topic21One']:checked").val();
    var th22=$("input[name='topic22One']:checked").val();
    var th23=$("input[name='topic23One']:checked").val();
    var th24=$("input[name='topic24One']:checked").val();
    var th25=$("input[name='topic25One']:checked").val();
    var th26=$("input[name='topic26One']:checked").val();
    var th27=$("input[name='topic27One']:checked").val();
    var th28=$("input[name='topic28One']:checked").val();
    var th29=$("input[name='topic29One']:checked").val();
    var th30=$("input[name='topic30One']:checked").val();
    var th31=$("input[name='topic31One']:checked").val();
    var th32=$("input[name='topic32One']:checked").val();
    var th33=$("input[name='topic33One']:checked").val();
    var th34=$("input[name='topic34One']:checked").val();
    var th35=$("input[name='topic35One']:checked").val();
    var th36=$("input[name='topic36One']:checked").val();
    var th37=$("input[name='topic37One']:checked").val();
    var th38=$("input[name='topic38One']:checked").val();
    var th39=$("input[name='topic39One']:checked").val();
    var th40=$("input[name='topic40One']:checked").val();
if (th1.indexOf("完全")>0){
    $("#one").hide();
}
if (th2.indexOf("完全")>0){
    $("#two").hide();
}
if (th3.indexOf("完全")>0){
    $("#three").hide();
}
if (th4.indexOf("完全")>0){
    $("#four").hide();
}
if (th5.indexOf("完全")>0){
    $("#five").hide();
}
if (th6.indexOf("完全")>0){
    $("#six").hide();
}
if (th7.indexOf("完全")>0){
    $("#seven").hide();
}
if (th8.indexOf("完全")>0){
    $("#eight").hide();
}
if (th9.indexOf("有")>0){
    $("#ninesuper").hide();
}
if (th9t.indexOf("完全")>0){
    $("#nine").hide();
}
if (th10.indexOf("完全")>0){
    $("#ten").hide();
}
if (th11.indexOf("完全")>0){
    $("#eleven").hide();
}
if (th12.indexOf("完全")>0){
    $("#twelve").hide();
}
if (th13.indexOf("完全")>0){
    $("#thirteen").hide();
}
if (th14.indexOf("完全")>0){
    $("#th14").hide();
}
if (th15.indexOf("完全")>0){
    $("#th15").hide();
}
if (th16.indexOf("完全")>0){
    $("#th16").hide();
}
    if (th17.indexOf("完全")>0){
        $("#th17").hide();
    }
    if (th18.indexOf("完全")>0){
        $("#th18").hide();
    }
    if (th19.indexOf("完全")>0){
        $("#th19").hide();
    }
    if (th20.indexOf("完全")>0){
        $("#th20").hide();
    }
    if (th21.indexOf("完全")>0){
        $("#th21").hide();
    }
    if (th22.indexOf("完全")>0){
        $("#th22").hide();
    }
    if (th23.indexOf("完全")>0){
        $("#th23").hide();
    }
    if (th24.indexOf("完全")>0){
        $("#th24").hide();
    }
    if (th25.indexOf("完全")>0){
        $("#th25").hide();
    }
    if (th26.indexOf("完全")>0){
        $("#th26").hide();
    }
    if (th27.indexOf("完全")>0){
        $("#th27").hide();
    }
    if (th28.indexOf("完全")>0){
        $("#th28").hide();
    }
    if (th29.indexOf("完全")>0){
        $("#th29").hide();
    }
    if (th30.indexOf("完全")>0){
        $("#th30").hide();
    }
    if (th31.indexOf("完全")>0){
        $("#th31").hide();
    }
    if (th32.indexOf("完全")>0){
        $("#th32").hide();
    }
    if (th33.indexOf("完全")>0){
        $("#th33").hide();
    }
    if (th34.indexOf("完全")>0){
        $("#th34").hide();
    }
    if (th35.indexOf("完全")>0){
        $("#th35").hide();
    }
    if (th36.indexOf("完全")>0){
        $("#th36").hide();
    }
    if (th37.indexOf("完全")>0){
        $("#th37").hide();
    }
    if (th38.indexOf("完全")>0){
        $("#th38").hide();
    }
    if (th39.indexOf("完全")>0){
        $("#th39").hide();
    }
    if (th40.indexOf("完全")>0){
        $("#th40").hide();
    }
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
