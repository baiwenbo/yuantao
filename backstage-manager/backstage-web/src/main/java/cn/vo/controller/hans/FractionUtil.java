package cn.vo.controller.hans;

import cn.vo.pojo.entity.TestHans;
import cn.vo.pojo.entity.TestPaper;

public class FractionUtil {

    //赋值得分
    public static TestPaper getFraction(TestPaper testPaper,TestHans testHans){
        try {
            if (testPaper.getTopic1One().contains("不")){
                    testPaper.setTopic1Fraction("0");
            }else{
                testPaper.setTopic1Fraction("2");
            }
            if (testPaper.getTopic2One().contains("不")){
                testPaper.setTopic2Fraction("0");
            }else {
                testPaper.setTopic2Fraction("2");
            }

            if (testPaper.getTopic3One().contains("不")){
                 testPaper.setTopic3Fraction("0");
            }else{
                testPaper.setTopic3Fraction("1");
            }

            if (testPaper.getTopic4One().contains("不")){
               testPaper.setTopic4Fraction("0");
            }else{
                testPaper.setTopic4Fraction("2");
            }

            if (testPaper.getTopic5One().contains("不")){
                testPaper.setTopic5Fraction("0");
            }else{
                testPaper.setTopic5Fraction("1");
            }
            if (testPaper.getTopic6One().contains("不")){
               testPaper.setTopic6Fraction("0");
            }else{
                testPaper.setTopic6Fraction("1");
            }
            if (testPaper.getTopic7One().contains("不")){
                testPaper.setTopic7Fraction("0");
            }else{
                testPaper.setTopic7Fraction("1");
            }
            if (testPaper.getTopic8One().contains("不")){
                testPaper.setTopic8Fraction("0");
            }else{
                testPaper.setTopic8Fraction("1");
            }
            if (testPaper.getTopic9One().contains("有")) {
                    testPaper.setTopic9Fraction("0");
            }else{
                testPaper.setTopic9Fraction("1");
            }
            if (testPaper.getTopic10One().contains("不")){
                 testPaper.setTopic10Fraction("0");
            }else{
                testPaper.setTopic10Fraction("1");
            }
            if (testPaper.getTopic11One().contains("不")){
               testPaper.setTopic11Fraction("0");
            }else{
                testPaper.setTopic11Fraction("1");
            }
            if (testPaper.getTopic12One().contains("不")){
               testPaper.setTopic12Fraction("0");
            }else{
                testPaper.setTopic12Fraction("2");
            }
            if (testPaper.getTopic13One().contains("不")){
                testPaper.setTopic13Fraction("0");
            }else{
                testPaper.setTopic13Fraction("1");
            }
            if (testPaper.getTopic14One().contains("不")){
               testPaper.setTopic14Fraction("0");
            }else{
                testPaper.setTopic14Fraction("1");
            }
            if (testPaper.getTopic15One().contains("不")){
                  testPaper.setTopic15Fraction("0");
            }else{
                testPaper.setTopic15Fraction("1");
            }
            if (testPaper.getTopic16One().contains("不")){
                testPaper.setTopic16Fraction("0");
            }else{
                testPaper.setTopic16Fraction("3");
            }
            if (testPaper.getTopic17One().contains("不")){
                if (testPaper.getTopic17Two() != null && !testPaper.getTopic17Two().isEmpty()) {
                    if(testPaper.getTopic17Two().contains("未推荐超级会员")){
                        testPaper.setTopic17Fraction("0");
                    }else if(testPaper.getTopic17Two().contains("未使用专业用语")){
                        testPaper.setTopic17Fraction("1");
                    }else{
                        testPaper.setTopic17Fraction("2");
                    }
                } else {
                    testPaper.setTopic17Fraction("3");
                }
            }else{
                testPaper.setTopic17Fraction("3");
            }
            if (testPaper.getTopic18One().contains("不")){
                if (testPaper.getTopic18Two() != null && !testPaper.getTopic18Two().isEmpty()) {
                    if(testPaper.getTopic18Two().contains("未说“您好，会员有积分有优惠，请您出示会员码”服务用语")){
                        testPaper.setTopic18Fraction("0");
                    }else if(testPaper.getTopic18Two().contains("未推荐下载APP，新用户可领15元优惠券")){
                        testPaper.setTopic18Fraction("1");
                    }else{
                        testPaper.setTopic18Fraction("2");
                    }
                } else {
                    testPaper.setTopic18Fraction("3");
                }
            }else{
                testPaper.setTopic18Fraction("3");
            }
            if (testPaper.getTopic19One().contains("不")){
                if (testPaper.getTopic19Two() != null && !testPaper.getTopic19Two().isEmpty()) {
                    if(testPaper.getTopic19Two().contains("未使用服务用语“您好，总计消费XX钱")){
                        testPaper.setTopic19Fraction("0");
                    }else if(testPaper.getTopic19Two().contains("如顾客有会员商品，店员未推荐超级会员")){
                        testPaper.setTopic19Fraction("1");
                    }else{
                        testPaper.setTopic19Fraction("2");
                    }
                } else {
                    testPaper.setTopic19Fraction("3");
                }
            }else{
                testPaper.setTopic19Fraction("3");
            }
            if (testPaper.getTopic20One().contains("不")){
                if (testPaper.getTopic20Two() != null && !testPaper.getTopic20Two().isEmpty()) {
                    if(testPaper.getTopic20Two().contains("请问您是使用苏宁支付吗")){
                        testPaper.setTopic20Fraction("0");
                    }else if(testPaper.getTopic20Two().contains("店员未推荐开通免密支付")){
                        testPaper.setTopic20Fraction("2");
                    }else{
                        testPaper.setTopic20Fraction("0");
                    }
                } else {
                    testPaper.setTopic20Fraction("3");
                }
            }else{
                testPaper.setTopic20Fraction("3");
            }
            if (testPaper.getTopic21One().contains("不")){
                if (testPaper.getTopic21Two() != null && !testPaper.getTopic21Two().isEmpty()) {
                    if(testPaper.getTopic21Two().contains("请问您是使用苏宁支付吗")){
                        testPaper.setTopic21Fraction("0");
                    }else if(testPaper.getTopic21Two().contains("店员未推荐开通免密支付")){
                        testPaper.setTopic21Fraction("1");
                    }else{
                        testPaper.setTopic21Fraction("0");
                    }
                } else {
                    testPaper.setTopic21Fraction("2");
                }
            }else{
                testPaper.setTopic21Fraction("2");
            }
            if (testPaper.getTopic22One().contains("不")){
               testPaper.setTopic22Fraction("0");
            }else{
                testPaper.setTopic22Fraction("2");
            }
            if (testPaper.getTopic23One().contains("不")){
               testPaper.setTopic23Fraction("0");
            }else{
                testPaper.setTopic23Fraction("2");
            }
            if (testPaper.getTopic24One().contains("不")){
                testPaper.setTopic24Fraction("0");
            }else{
                testPaper.setTopic24Fraction("1");
            }
            if (testPaper.getTopic25One().contains("不")){
               testPaper.setTopic25Fraction("0");
            }else{
                testPaper.setTopic25Fraction("1");
            }
            if (testPaper.getTopic26One().contains("不")){
                testPaper.setTopic26Fraction("0");
            }else{
                testPaper.setTopic26Fraction("1");
            }
            if (testPaper.getTopic27One().contains("不")){
               testPaper.setTopic27Fraction("0");
            }else{
                testPaper.setTopic27Fraction("1");
            }
            if (testPaper.getTopic28One().contains("不")){
                testPaper.setTopic28Fraction("0");
            }else{
                testPaper.setTopic28Fraction("1");
            }
            if (testPaper.getTopic29One().contains("不")){
                testPaper.setTopic29Fraction("0");
            }else{
                testPaper.setTopic29Fraction("2");
            }
            if (testPaper.getTopic30One().contains("不")){
               testPaper.setTopic30Fraction("0");
            }else{
                testPaper.setTopic30Fraction("1");
            }
            if (testPaper.getTopic31One().contains("不")){
               testPaper.setTopic31Fraction("0");
            }else{
                testPaper.setTopic31Fraction("1");
            }
            if (testPaper.getTopic32One().contains("不")){
                 testPaper.setTopic32Fraction("0");
            }else{
                testPaper.setTopic32Fraction("2");
            }
            if (testPaper.getTopic33One().contains("不")){
                testPaper.setTopic33Fraction("0");
            }else{
                testPaper.setTopic33Fraction("2");
            }
            if (testPaper.getTopic34One().contains("不")){
               testPaper.setTopic34Fraction("0");
            }else{
                testPaper.setTopic34Fraction("2");
            }
            if (testPaper.getTopic35One().contains("不")){
                testPaper.setTopic35Fraction("0");
            }else{
                testPaper.setTopic35Fraction("2");
            }
            if (testPaper.getTopic36One().contains("不")){
               testPaper.setTopic36Fraction("0");
            }else{
                testPaper.setTopic36Fraction("2");
            }
            if (testPaper.getTopic37One().contains("不")){
                 testPaper.setTopic37Fraction("0");
            }else{
                testPaper.setTopic37Fraction("2");
            }
            if (testPaper.getTopic38One().contains("不")){
               testPaper.setTopic38Fraction("0");
            }else{
                testPaper.setTopic38Fraction("1");
            }
            if (testPaper.getTopic39One().contains("不")){
                 testPaper.setTopic39Fraction("0");
            }else{
                testPaper.setTopic39Fraction("2");
            }
            if (testPaper.getTopic40One().contains("不")){
                testPaper.setTopic40Fraction("0");
            }else{
                testPaper.setTopic40Fraction("2");
            }

            if (testHans.getTopic41One().contains("不")){
                testHans.setTopic41Fraction("0");
            }else{
                testHans.setTopic41Fraction("2");
            }
            if (testHans.getTopic42One().contains("不")){
                testHans.setTopic42Fraction("0");
            }else{
                testHans.setTopic42Fraction("2");
            }
            if (testHans.getTopic43One().contains("不")){
                testHans.setTopic43Fraction("0");
            }else{
                testHans.setTopic43Fraction("2");
            }
            if (testHans.getTopic44One().contains("不")){
                testHans.setTopic44Fraction("0");
            }else{
                testHans.setTopic44Fraction("2");
            }
            if (testHans.getTopic45One().contains("不")){
                testHans.setTopic45Fraction("0");
            }else{
                testHans.setTopic45Fraction("2");
            }
            if (testHans.getTopic46One().contains("不")){
                testHans.setTopic46Fraction("0");
            }else{
                testHans.setTopic46Fraction("2");
            }
            if (testHans.getTopic47One().contains("不")){
                testHans.setTopic47Fraction("0");
            }else{
                testHans.setTopic47Fraction("2");
            }
            if (testHans.getTopic48One().contains("不")){
                if (testHans.getTopic48Three() != null && !testHans.getTopic48Three().isEmpty()) {
                    if(testHans.getTopic48Three().contains("手写价签1处或价签破")){
                        testHans.setTopic48Fraction("1");
                    }else if(testHans.getTopic48Three().contains("手写价签2处")){
                        testHans.setTopic48Fraction("0");
                    }else{
                        testHans.setTopic48Fraction("2");
                    }
                } else {
                    testHans.setTopic48Fraction("3");
                }
            }else{
                testHans.setTopic48Fraction("2");
            }
            if (testHans.getTopic49One().contains("不")){
                testHans.setTopic49Fraction("0");
            }else{
                testHans.setTopic49Fraction("2");
            }
            if (testHans.getTopic50One().contains("不")){
                testHans.setTopic50Fraction("0");
            }else{
                testHans.setTopic50Fraction("2");
            }
            if (testHans.getTopic51One().contains("不")){
                testHans.setTopic51Fraction("0");
            }else{
                testHans.setTopic51Fraction("1");
            }
            if (testHans.getTopic52One().contains("不")){
                testHans.setTopic52Fraction("0");
            }else{
                testHans.setTopic52Fraction("2");
            }
            if (testHans.getTopic53One().contains("不")){
                testHans.setTopic53Fraction("0");
            }else{
                testHans.setTopic53Fraction("1");
            }
            if (testHans.getTopic54One().contains("不")){
                testHans.setTopic54Fraction("0");
            }else{
                testHans.setTopic54Fraction("1");
            }
            if (testHans.getTopic55One().contains("不")){
                testHans.setTopic55Fraction("0");
            }else{
                testHans.setTopic55Fraction("1");
            }
            if (testHans.getTopic56One().contains("不")){
                testHans.setTopic56Fraction("0");
            }else{
                testHans.setTopic56Fraction("1");
            }
            if (testHans.getTopic57One().contains("不")){
                testHans.setTopic57Fraction("0");
            }else{
                testHans.setTopic57Fraction("1");
            }
            if (testHans.getTopic58One().contains("不")){
                testHans.setTopic58Fraction("0");
            }else{
                testHans.setTopic58Fraction("2");
            }
            if (testHans.getTopic59One().contains("不")){
                testHans.setTopic59Fraction("0");
            }else{
                testHans.setTopic59Fraction("1");
            }
            if (testHans.getTopic60One().contains("不")){
                testHans.setTopic60Fraction("0");
            }else{
                testHans.setTopic60Fraction("1");
            }
            if (testHans.getTopic61One().contains("不")){
                testHans.setTopic61Fraction("0");
            }else{
                testHans.setTopic61Fraction("2");
            }
            if (testHans.getTopic62One().contains("存在，有过")){
                testPaper.setScore("0");
            }else if (testHans.getTopic63One().contains("存在，有私设")){
                testPaper.setScore("0");
            } else{
                testPaper.setScore(FractionUtil.getsSore(testPaper,testHans));
            }
        }catch (Exception e){
            e.printStackTrace();
            return testPaper;
        }
        return testPaper;

    }

    //判断选的是几处然后计算得分
    public static String getNumber(String ques,String three){
        String num="";
        String score="";
        try {
            three=three.substring(three.indexOf("、") + 1);
            three=three.trim();
            if(three != null && !"".equals(three)){
                for(int i=0;i<three.length();i++){
                    if(three.charAt(i)>=48 && three.charAt(i)<=57){
                        num+=three.charAt(i);
                    }
                }
            }
            score=String.valueOf(EnumerationMap.getFraction(ques)-Integer.valueOf(num));
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
        return  score;
    }


    //计算总分数
    public  static  String getsSore(TestPaper testPaper,TestHans testHans){
        Integer score=0;
        try {
            score =score+ Integer.valueOf(testPaper.getTopic1Fraction());
            score = score + Integer.valueOf(testPaper.getTopic2Fraction());
            score = score + Integer.valueOf(testPaper.getTopic3Fraction());
            score = score + Integer.valueOf(testPaper.getTopic4Fraction());
            score = score + Integer.valueOf(testPaper.getTopic5Fraction());
            score = score + Integer.valueOf(testPaper.getTopic6Fraction());
            score = score + Integer.valueOf(testPaper.getTopic7Fraction());
            score = score + Integer.valueOf(testPaper.getTopic8Fraction());
            score = score + Integer.valueOf(testPaper.getTopic9Fraction());
            score = score + Integer.valueOf(testPaper.getTopic10Fraction());
            score = score + Integer.valueOf(testPaper.getTopic11Fraction());
            score = score + Integer.valueOf(testPaper.getTopic12Fraction());
            score = score + Integer.valueOf(testPaper.getTopic13Fraction());
            score = score + Integer.valueOf(testPaper.getTopic14Fraction());
            score = score + Integer.valueOf(testPaper.getTopic15Fraction());
            score = score + Integer.valueOf(testPaper.getTopic16Fraction());
            score = score + Integer.valueOf(testPaper.getTopic17Fraction());
            score = score + Integer.valueOf(testPaper.getTopic18Fraction());
            score = score + Integer.valueOf(testPaper.getTopic19Fraction());
            score = score + Integer.valueOf(testPaper.getTopic20Fraction());
            score = score + Integer.valueOf(testPaper.getTopic21Fraction());
            score = score + Integer.valueOf(testPaper.getTopic22Fraction());
            score = score + Integer.valueOf(testPaper.getTopic23Fraction());
            score = score + Integer.valueOf(testPaper.getTopic24Fraction());
            score = score + Integer.valueOf(testPaper.getTopic25Fraction());
            score = score + Integer.valueOf(testPaper.getTopic26Fraction());
            score = score + Integer.valueOf(testPaper.getTopic27Fraction());
            score = score + Integer.valueOf(testPaper.getTopic28Fraction());
            System.err.println("28"+score);
            score = score + Integer.valueOf(testPaper.getTopic29Fraction());
            System.err.println("29"+score);
            score = score + Integer.valueOf(testPaper.getTopic30Fraction());
            System.err.println("30"+score);
            score = score + Integer.valueOf(testPaper.getTopic31Fraction());
            System.err.println("31"+score);
            score = score + Integer.valueOf(testPaper.getTopic32Fraction());
            System.err.println("32"+score);
            score = score + Integer.valueOf(testPaper.getTopic33Fraction());
            score = score + Integer.valueOf(testPaper.getTopic34Fraction());
            score = score + Integer.valueOf(testPaper.getTopic35Fraction());
            score = score + Integer.valueOf(testPaper.getTopic36Fraction());
            score = score + Integer.valueOf(testPaper.getTopic37Fraction());
            score = score + Integer.valueOf(testPaper.getTopic38Fraction());
            score = score + Integer.valueOf(testPaper.getTopic39Fraction());
            score = score + Integer.valueOf(testPaper.getTopic40Fraction());


            score = score + Integer.valueOf(testHans.getTopic41Fraction());
            score = score + Integer.valueOf(testHans.getTopic42Fraction());
            score = score + Integer.valueOf(testHans.getTopic43Fraction());
            score = score + Integer.valueOf(testHans.getTopic44Fraction());
            score = score + Integer.valueOf(testHans.getTopic45Fraction());
            score = score + Integer.valueOf(testHans.getTopic46Fraction());
            score = score + Integer.valueOf(testHans.getTopic47Fraction());
            score = score + Integer.valueOf(testHans.getTopic48Fraction());
            score = score + Integer.valueOf(testHans.getTopic49Fraction());
            score = score + Integer.valueOf(testHans.getTopic50Fraction());

            score = score + Integer.valueOf(testHans.getTopic51Fraction());
            score = score + Integer.valueOf(testHans.getTopic52Fraction());
            score = score + Integer.valueOf(testHans.getTopic53Fraction());
            score = score + Integer.valueOf(testHans.getTopic54Fraction());
            score = score + Integer.valueOf(testHans.getTopic55Fraction());
            score = score + Integer.valueOf(testHans.getTopic56Fraction());
            score = score + Integer.valueOf(testHans.getTopic57Fraction());
            score = score + Integer.valueOf(testHans.getTopic58Fraction());
            score = score + Integer.valueOf(testHans.getTopic59Fraction());
            score = score + Integer.valueOf(testHans.getTopic60Fraction());
            score = score + Integer.valueOf(testHans.getTopic61Fraction());

        }catch (Exception e){
            e.printStackTrace();
             return "";
        }
        return String.valueOf(score);
    }



}
