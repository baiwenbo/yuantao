
$("#checkSubject").click(function(){
    if (type1=="2"){
        var remark=$("input[name='topic1Six']").val();
        if ($("input[name='topic1Two']").is(':checked') === false && remark ==""){
            alert("请选择题1不符项");
            return false;
        }

        var topic1Four=$("#topic1Four").val();
        if (topic1Four==""||topic1Four==null){
            alert("请上传题1图片");
            return false;
        }
    }
    if (type2=="2"){
        var remark2=$("input[name='topic2Six']").val();
        if ($("input[name='topic2Two']").is(':checked') === false && remark2 ==""){
            alert("请选择题2不符项");
            return false;
        }

        var topic2Four=$("#topic2Four").val();
        if (topic2Four==""||topic2Four==null){
            alert("请上传题2图片");
            return false;
        }
    }
    if (type3=="2"){
        var remark3=$("input[name='topic3Six']").val();
        if ($("input[name='topic3Two']").is(':checked') === false && remark3 ==""){
            alert("请选择题3不符项");
            return false;
        }
      /*  if ($("input[name='topic3Three']").is(':checked') === false){
            alert("请选择不符项");
            return false;
        }*/
      var topic3Two=$("input[name='topic3Two']:checked").val();
      if (topic3Two.indexOf("店内灯光未全部亮启")>0){
          var topic3Four=$("#topic3Four").val();
          if (topic3Four==""||topic3Four==null){
              alert("请上传题3图片");
              return false;
          }
      }

    }
    if (type4=="2"){
        var remark4=$("input[name='topic4Six']").val();
        if ($("input[name='topic4Two']").is(':checked') === false && remark4 ==""){
            alert("请选择题4不符项");
            return false;
        }
     /*   if ($("input[name='topic4Three']").is(':checked') === false){
            alert("请选择不符项");
            return false;
        }*/
        var topic4Four=$("#topic4Four").val();
        if (topic4Four==""||topic4Four==null){
            alert("请上传题4图片");
            return false;
        }
    }
    if (type5=="2"){
        var remark5=$("input[name='topic5Six']").val();
        if ($("input[name='topic5Two']").is(':checked') === false && remark5 ==""){
            alert("请选择题5不符项");
            return false;
        }
      /*  if ($("input[name='topic5Three']").is(':checked') === false){
            alert("请选择不符项");
            return false;
        }*/
        var topic5Four=$("#topic5Four").val();
        if (topic5Four==""||topic5Four==null){
            alert("请上传题5图片");
            return false;
        }
    }
    if (type6=="2"){
        var remark6=$("input[name='topic6Six']").val();
        if ($("input[name='topic6Two']").is(':checked') === false && remark6 ==""){
            alert("请选择题6不符项");
            return false;
        }
       /* if ($("input[name='topic6Three']").is(':checked') === false){
            alert("请选择不符项");
            return false;
        }*/
        var topic6Four=$("#topic6Four").val();
        if (topic6Four==""||topic6Four==null){
            alert("请上传题6图片");
            return false;
        }
    }
    if (type7=="2"){
        var remark7=$("input[name='topic7Six']").val();
        if ($("input[name='topic7Two']").is(':checked') === false && remark7 ==""){
            alert("请选择题7不符项");
            return false;
        }
      /*  if ($("input[name='topic7Three']").is(':checked') === false){
            alert("请选择不符项");
            return false;
        }*/

        var topic7Four=$("#topic7Four").val();
        if (topic7Four==""||topic7Four==null){
            alert("请上传题7图片");
            return false;
        }
    }

    if (type8=="2"){
        var remark8=$("input[name='topic8Six']").val();
        if ($("input[name='topic8Two']").is(':checked') === false && remark8 ==""){
            alert("请选择题8不符项");
            return false;
        }
      /*  if ($("input[name='topic8Three']").is(':checked') === false){
            alert("请选择不符项");
            return false;
        }*/
        var topic8Four=$("#topic8Four").val();
        if (topic8Four==""||topic8Four==null){
            alert("请上传题8图片");
            return false;
        }
    }
    if (type9=="2"){
        if ($("input[name='topic9Two']").is(':checked') === false ){
            alert("请选择题9不符项");
            return false;
        }
        var remark9=$("input[name='topic9Six']").val();
        if ($("input[name='topic9Three']").is(':checked') === false && remark9 ==""){
            alert("请选择题9不符项");
            return false;
        }
        var topic9Four=$("#topic9Four").val();
        if (topic9Four==""||topic9Four==null){
            alert("请上传题9图片");
            return false;
        }
    }
    if (type10=="2"){
        var remark10=$("input[name='topic10Six']").val();
        if ($("input[name='topic10Two']").is(':checked') === false && remark10 ==""){
            alert("请选择题10不符项");
            return false;
        }
        if ($("input[name='topic10Three']").is(':checked') === false){
            alert("请选择题10不符项");
            return false;
        }
        var topic10Four=$("#topic10Four").val();
        if (topic10Four==""||topic10Four==null){
            alert("请上传题10图片");
            return false;
        }
    }
    if (type11=="2"){
        var remark11=$("input[name='topic11Six']").val();
        if ($("input[name='topic11Two']").is(':checked') === false  && remark11 ==""){
            alert("请选择题11不符项");
            return false;
        }
       /* if ($("input[name='topic11Three']").is(':checked') === false){
            alert("请选择不符项");
            return false;
        }*/
        var topic11Four=$("#topic11Four").val();
        if (topic11Four==""||topic11Four==null){
            alert("请上传题11图片");
            return false;
        }
    }
    if (type12=="2"){
        var remark12=$("input[name='topic12Six']").val();
        if ($("input[name='topic12Two']").is(':checked') === false  && remark12 ==""){
            alert("请选择题12不符项");
            return false;
        }
      /*  if ($("input[name='topic12Three']").is(':checked') === false){
            alert("请选择不符项");
            return false;
        }*/
        var topic12Four=$("#topic12Four").val();
        if (topic12Four==""||topic12Four==null){
            alert("请上传题12图片");
            return false;
        }
    }
    if (type13=="2"){
        var remark13=$("input[name='topic13Six']").val();
        if ($("input[name='topic13Two']").is(':checked') === false  && remark13 ==""){
            alert("请选择题13不符项");
            return false;
        }
       /* if ($("input[name='topic13Three']").is(':checked') === false){
            alert("请选择不符项");
            return false;
        }*/
        var topic13Four=$("#topic13Four").val();
        if (topic13Four==""||topic13Four==null){
            alert("请上传题13图片");
            return false;
        }
    }
    if (type14=="2"){
        var remark14=$("input[name='topic14Six']").val();
        if ($("input[name='topic14Two']").is(':checked') === false  && remark14 ==""){
            alert("请选择题14不符项");
            return false;
        }
      /*  if ($("input[name='topic14Three']").is(':checked') === false){
            alert("请选择题14不符项");
            return false;
        }*/
        var topic14Four=$("#topic14Four").val();
        if (topic14Four==""||topic14Four==null){
            alert("请上传题14图片");
            return false;
        }
    }
    if (type15=="2"){
        var remark15=$("input[name='topic15Six']").val();
        if ($("input[name='topic15Two']").is(':checked') === false && remark15==""){
            alert("请选择题15不符项");
            return false;
        }
 /*       if ($("input[name='topic15Three']").is(':checked') === false){
            alert("请选择题15不符项");
            return false;
        }*/
        var topic15Four=$("#topic15Four").val();
        if (topic15Four==""||topic15Four==null){
            alert("请上传题15图片");
            return false;
        }
    }
    if (type16=="2"){
        var remark16=$("input[name='topic16Six']").val();
        if ($("input[name='topic16Two']").is(':checked') === false  && remark16 ==""){
            alert("请选择题16不符项");
            return false;
        }
        if ($("input[name='topic16Three']").is(':checked') === false){
            alert("请选择题16不符项");
            return false;
        }
        var topic16Four=$("#topic16Four").val();
        if (topic16Four==""||topic16Four==null){
            alert("请上传题16图片");
            return false;
        }
    }
    if (type17=="2"){
        var remark17=$("input[name='topic17Six']").val();
        if ($("input[name='topic17Two']").is(':checked') === false  && remark17 ==""){
            alert("请选择题17不符项");
            return false;
        }
        if ($("input[name='topic17Three']").is(':checked') === false){
            alert("请选择题17不符项");
            return false;
        }
        var topic17Four=$("#topic17Four").val();
        if (topic17Four==""||topic17Four==null){
            alert("请上题17传图片");
            return false;
        }
    }
    if (type18=="2"){
        var remark18=$("input[name='topic18Six']").val();
        if ($("input[name='topic18Two']").is(':checked') === false  && remark18 ==""){
            alert("请选择题18不符项");
            return false;
        }
       /* if ($("input[name='topic18Three']").is(':checked') === false){
            alert("请选择不符项");
            return false;
        }*/
        var topic18Four=$("#topic18Four").val();
        if (topic18Four==""||topic18Four==null){
            alert("请上传题18图片");
            return false;
        }
    }
    if (type19=="2"){
        var remark19=$("input[name='topic19Six']").val();
        if ($("input[name='topic19Two']").is(':checked') === false  && remark19 ==""){
            alert("请选择题19不符项");
            return false;
        }
     /*   if ($("input[name='topic19Three']").is(':checked') === false){
            alert("请选择题19不符项");
            return false;
        }*/
        var topic19Four=$("#topic19Four").val();
        if (topic19Four==""||topic19Four==null){
            alert("请上传题19图片");
            return false;
        }
    }
    if (type20=="2"){
        var remark20=$("input[name='topic20Six']").val();
        if ($("input[name='topic20Two']").is(':checked') === false  && remark20 ==""){
            alert("请选择题20不符项");
            return false;
        }
      /*  if ($("input[name='topic20Three']").is(':checked') === false){
            alert("请选择题20不符项");
            return false;
        }*/
        var topic20Four=$("#topic20Four").val();
        if (topic20Four==""||topic20Four==null){
            alert("请上传题20图片");
            return false;
        }
    }
    if (type21=="2"){
        var remark21=$("input[name='topic21Six']").val();
        if ($("input[name='topic21Two']").is(':checked') === false  && remark21 ==""){
            alert("请选择题21不符项");
            return false;
        }
       /* if ($("input[name='topic21Three']").is(':checked') === false){
            alert("请选择题21不符项");
            return false;
        }*/
        var topic21Four=$("#topic21Four").val();
        if (topic21Four==""||topic21Four==null){
            alert("请上传题21图片");
            return false;
        }
    }
    if (type22=="2"){
        var remark22=$("input[name='topic22Six']").val();
        if ($("input[name='topic22Two']").is(':checked') === false  && remark22 ==""){
            alert("请选择题22不符项");
            return false;
        }
       /* if ($("input[name='topic22Three']").is(':checked') === false){
            alert("请选择题22不符项");
            return false;
        }*/
        var topic22Four=$("#topic22Four").val();
        if (topic22Four==""||topic22Four==null){
            alert("请上传题22图片");
            return false;
        }
    }
    if (type23=="2"){
        var remark23=$("input[name='topic23Six']").val();
        if ($("input[name='topic23Two']").is(':checked') === false  && remark23 ==""){
            alert("请选择题23不符项");
            return false;
        }
        if ($("input[name='topic23Three']").is(':checked') === false){
            alert("请选择23不符项");
            return false;
        }
        var topic23Four=$("#topic23Four").val();
        if (topic23Four==""||topic23Four==null){
            alert("请上传题23图片");
            return false;
        }
    }
    if (type24=="2"){
        var remark24=$("input[name='topic24Six']").val();
        if ($("input[name='topic24Two']").is(':checked') === false  && remark24 ==""){
            alert("请选择题24不符项");
            return false;
        }
     /*   if ($("input[name='topic24Three']").is(':checked') === false){
            alert("请选择不符项");
            return false;
        }*/
        var topic24Four=$("#topic24Four").val();
        if (topic24Four==""||topic24Four==null){
            alert("请上传题24图片");
            return false;
        }
    }
    if (type25=="2"){
        var remark25=$("input[name='topic25Six']").val();
        if ($("input[name='topic25Two']").is(':checked') === false  && remark25 ==""){
            alert("请选择题25不符项");
            return false;
        }
      /*  if ($("input[name='topic25Three']").is(':checked') === false){
            alert("请选择不符项");
            return false;
        }*/
        var topic25Four=$("#topic25Four").val();
        if (topic25Four==""||topic25Four==null){
            alert("请上传题25图片");
            return false;
        }
    }
    if (type26=="2"){
        var remark26=$("input[name='topic26Six']").val();
        if ($("input[name='topic26Two']").is(':checked') === false && remark26 ==""){
            alert("请选择题26不符项");
            return false;
        }
        /*if ($("input[name='topic26Three']").is(':checked') === false){
            alert("请选择不符项");
            return false;
        }*/
        var topic26Four=$("#topic26Four").val();
        if (topic26Four==""||topic26Four==null){
            alert("请上传题26图片");
            return false;
        }
    }
    if (type27=="2"){
        var remark27=$("input[name='topic27Six']").val();
        if ($("input[name='topic27Two']").is(':checked') === false && remark27 ==""){
            alert("请选择题27不符项");
            return false;
        }
      /*  if ($("input[name='topic27Three']").is(':checked') === false){
            alert("请选择题27不符项");
            return false;
        }*/
        var topic27Four=$("#topic27Four").val();
        if (topic27Four==""||topic27Four==null){
            alert("请上传题27图片");
            return false;
        }
    }
    if (type28=="2"){
        var remark28=$("input[name='topic28Six']").val();
        if ($("input[name='topic28Two']").is(':checked') === false && remark28 ==""){
            alert("请选择题28不符项");
            return false;
        }
        var topic28Four=$("#topic28Four").val();
        if (topic28Four==""||topic28Four==null){
            alert("请上传题28图片");
            return false;
        }
    }
    if (type29=="2"){
        var remark29=$("input[name='topic29Six']").val();
        if ($("input[name='topic29Two']").is(':checked') === false && remark29 ==""){
            alert("请选择题29不符项");
            return false;
        }
        var topic29Four=$("#topic29Four").val();
        if (topic29Four==""||topic29Four==null){
            alert("请上传题29图片");
            return false;
        }
    }
    if (type30=="2"){
        var remark30=$("input[name='topic30Six']").val();
        if ($("input[name='topic30Two']").is(':checked') === false && remark30 ==""){
            alert("请选择题30不符项");
            return false;
        }
        var topic30Four=$("#topic30Four").val();
        if (topic30Four==""||topic30Four==null){
            alert("请上传题30图片");
            return false;
        }
    }
    if (type31=="2"){
        var remark31=$("input[name='topic31Six']").val();
        if ($("input[name='topic31Two']").is(':checked') === false && remark31 ==""){
            alert("请选择题31不符项");
            return false;
        }
        var topic31Four=$("#topic31Four").val();
        if (topic31Four==""||topic31Four==null){
            alert("请上传题31图片");
            return false;
        }
    }
    if (type32=="2"){
        var remark32=$("input[name='topic32Six']").val();
        if ($("input[name='topic32Two']").is(':checked') === false && remark32 ==""){
            alert("请选择题32不符项");
            return false;
        }
        var topic32Four=$("#topic32Four").val();
        if (topic32Four==""||topic32Four==null){
            alert("请上传题32图片");
            return false;
        }

    }
    if (type33=="2"){
        var remark33=$("input[name='topic33Six']").val();
        if ($("input[name='topic33Two']").is(':checked') === false && remark33 ==""){
            alert("请选择题33不符项");
            return false;
        }
        var topic33Four=$("#topic33Four").val();
        if (topic33Four==""||topic33Four==null){
            alert("请上传题33图片");
            return false;
        }
    }
    /*if (type34=="2"){
        var remark34=$("input[name='topic34Six']").val();
        if ($("input[name='topic34Two']").is(':checked') === false && remark34 ==""){
            alert("请选择题34不符项");
            return false;
        }
        if ($("input[name='topic34Three']").is(':checked') === false){
            alert("请选择题34不符项");
            return false;
        }
        var topic34Four=$("#topic34Four").val();
        if (topic34Four==""||topic34Four==null){
            alert("请上传题34图片");
            return false;
        }
    }
    if (type35=="2"){
        var remark35=$("input[name='topic35Six']").val();
        if ($("input[name='topic35Two']").is(':checked') === false && remark35 ==""){
            alert("请选择题35不符项");
            return false;
        }
        if ($("input[name='topic35Three']").is(':checked') === false){
            alert("请选择题35不符项");
            return false;
        }
        var topic35Four=$("#topic35Four").val();
        if (topic35Four==""||topic35Four==null){
            alert("请上传题35图片");
            return false;
        }
    }
    if (type36=="2"){
        var remark36=$("input[name='topic36Six']").val();
        if ($("input[name='topic36Two']").is(':checked') === false && remark36 ==""){
            alert("请选择题36不符项");
            return false;
        }
        if ($("input[name='topic36Three']").is(':checked') === false){
            alert("请选择题36不符项");
            return false;
        }
        var topic36Four=$("#topic36Four").val();
        if (topic36Four==""||topic36Four==null){
            alert("请上传题36图片");
            return false;
        }
    }
    if (type37=="2"){
        var remark37=$("input[name='topic37Six']").val();
        if ($("input[name='topic37Two']").is(':checked') === false && remark37 ==""){
            alert("请选择题37不符项");
            return false;
        }
        if ($("input[name='topic37Three']").is(':checked') === false){
            alert("请选择题37不符项");
            return false;
        }
        var topic37Four=$("#topic37Four").val();
        if (topic37Four==""||topic37Four==null){
            alert("请上传题37图片");
            return false;
        }
    }
    if (type38=="2"){
        var remark38=$("input[name='topic38Six']").val();
        if ($("input[name='topic38Two']").is(':checked') === false && remark38 ==""){
            alert("请选择题38不符项");
            return false;
        }
       /!* if ($("input[name='topic38Three']").is(':checked') === false){
            alert("请选择不符项");
            return false;
        }*!/
        var topic38Four=$("#topic38Four").val();
        if (topic38Four==""||topic38Four==null){
            alert("请上传题38图片");
            return false;
        }
    }
    if (type39=="2"){
        var remark39=$("input[name='topic39Six']").val();
        if ($("input[name='topic39Two']").is(':checked') === false && remark39 ==""){
            alert("请选择题39不符项");
            return false;
        }
      /!*  if ($("input[name='topic39Three']").is(':checked') === false){
            alert("请选择不符项");
            return false;
        }*!/
        var topic39Four=$("#topic39Four").val();
        if (topic39Four==""||topic39Four==null){
            alert("请上传题39图片");
            return false;
        }
    }
    if (type40=="2"){
        var remark40=$("input[name='topic40Six']").val();
        if ($("input[name='topic40Two']").is(':checked') === false && remark40 ==""){
            alert("请选择题40不符项");
            return false;
        }
        if ($("input[name='topic40Three']").is(':checked') === false){
            alert("请选择题40不符项");
            return false;
        }
        var topic40Four=$("#topic40Four").val();
        if (topic40Four==""||topic40Four==null){
            alert("请上传题40图片");
            return false;
        }
    }*/



});

var type1="1";
var type2="1";
var type3="1";
var type4="1";
var type5="1";
var type6="1";
var type7="1";
var type8="1";
var type9="1";
var type10="1";
var type11="1";
var type12="1";
var type13="1";
var type14="1";
var type15="1";
var type16="1";
var type17="1";
var type18="1";
var type19="1";
var type20="1";
var type21="1";
var type22="1";
var type23="1";
var type24="1";
var type25="1";
var type26="1";
var type27="1";
var type28="1";
var type29="1";
var type30="1";
var type31="1";
var type32="1";
var type33="1";
var type34="1";
var type35="1";
var type36="1";
var type37="1";
var type38="1";
var type39="1";
var type40="1";

