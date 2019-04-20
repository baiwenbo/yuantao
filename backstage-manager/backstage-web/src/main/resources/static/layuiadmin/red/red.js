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
    $("#th41").hide();
    $("#th42").hide();
    $("#th43").hide();
    $("#th44").hide();
    $("#th45").hide();
    $("#th46").hide();
    $("#th47").hide();
    $("#th48").hide();
    $("#th49").hide();
    $("#th50").hide();

    $("#th51").hide();
    $("#th52").hide();
    $("#th53").hide();

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