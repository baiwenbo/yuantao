$(document).ready(function(){
    var th1=$("input[name='topic1One']:checked").val();
    var th2=$("input[name='topic2One']:checked").val();
    var th3=$("input[name='topic3One']:checked").val();
    var th4=$("input[name='topic4One']:checked").val();
    var th5=$("input[name='topic5One']:checked").val();
    var th6=$("input[name='topic6One']:checked").val();
    var th7=$("input[name='topic7One']:checked").val();
    var th8=$("input[name='topic8One']:checked").val();
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
    var th21 = $("input[name='topic21One']:checked").val();
    var th22 = $("input[name='topic22One']:checked").val();
    var th23 = $("input[name='topic23One']:checked").val();
    var th24 = $("input[name='topic24One']:checked").val();
    var th25 = $("input[name='topic25One']:checked").val();
    var th26 = $("input[name='topic26One']:checked").val();
    var th27 = $("input[name='topic27One']:checked").val();
    var th28 = $("input[name='topic28One']:checked").val();
    var th29 = $("input[name='topic29One']:checked").val();
    var th30 = $("input[name='topic30One']:checked").val();
    var th31 = $("input[name='topic31One']:checked").val();
    var th32 = $("input[name='topic32One']:checked").val();
    var th33 = $("input[name='topic33One']:checked").val();
    var th34 = $("input[name='topic34One']:checked").val();
    var th35 = $("input[name='topic35One']:checked").val();
    var th36 = $("input[name='topic36One']:checked").val();
    var th37 = $("input[name='topic37One']:checked").val();
    var th38 = $("input[name='topic38One']:checked").val();
    var th39 = $("input[name='topic39One']:checked").val();
    var th40 = $("input[name='topic40One']:checked").val();

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
    if (th21.indexOf("完全") > 0) {
        $("#th21").hide();
    } else {
        type21 = "2";
    }
    if (th22.indexOf("完全") > 0) {
        $("#th22").hide();
    } else {
        type22 = "2";
    }
    if (th23.indexOf("完全") > 0) {
        $("#th23").hide();
    } else {
        type23 = "2";
    }
    if (th24.indexOf("完全") > 0) {
        $("#th24").hide();
    } else {
        type24 = "2";
    }
    if (th25.indexOf("完全") > 0) {
        $("#th25").hide();
    } else {
        type25 = "2";
    }
    if (th26.indexOf("完全") > 0) {
        $("#th26").hide();
    } else {
        type26 = "2";
    }
    if (th27.indexOf("完全") > 0) {
        $("#th27").hide();
    } else {
        type27 = "2";
    }
    if (th28.indexOf("完全") > 0) {
        $("#th28").hide();
    } else {
        type28 = "2";
    }
    if (th29.indexOf("完全") > 0) {
        $("#th29").hide();
    } else {
        type29 = "2";
    }
    if (th30.indexOf("完全") > 0) {
        $("#th30").hide();
    } else {
        type30 = "2";
    }
    if (th31.indexOf("完全") > 0) {
        $("#th31").hide();
    } else {
        type31 = "2";
    }
    if (th32.indexOf("完全") > 0) {
        $("#th32").hide();
    } else {
        type32 = "2";
    }
    if (th33.indexOf("完全") > 0) {
        $("#th33").hide();
    } else {
        type33 = "2";
    }
    if (th34.indexOf("完全") > 0) {
        $("#th34").hide();
    } else {
        type34 = "2";
    }
    if (th35.indexOf("完全") > 0) {
        $("#th35").hide();
    } else {
        type35 = "2";
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
    laydate.render({
        elem: '#spotdate'
        ,type: 'datetime'
    });
});
