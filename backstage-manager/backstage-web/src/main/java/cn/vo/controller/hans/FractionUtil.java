package cn.vo.controller.hans;

import cn.vo.pojo.entity.TestPaper;

public class FractionUtil {

    //赋值得分
    public static TestPaper getFraction(TestPaper testPaper){
        try {
            if (testPaper.getTopic1Three() != null && !testPaper.getTopic1Three().isEmpty()) {
                testPaper.setTopic1Fraction(FractionUtil.getNumber(testPaper.getTopic1Three()));
            } else if (testPaper.getTopic1Two() != null && !testPaper.getTopic1Two().isEmpty()) {
                testPaper.setTopic1Fraction("-4");
            } else {
                testPaper.setTopic1Fraction("4");
            }
            if (testPaper.getTopic2Three() != null && !testPaper.getTopic2Three().isEmpty()) {
                testPaper.setTopic2Fraction(FractionUtil.getNumber(testPaper.getTopic2Three()));
            } else if (testPaper.getTopic2Two() != null && !testPaper.getTopic2Two().isEmpty()) {
                testPaper.setTopic2Fraction("-4");
            } else {
                testPaper.setTopic2Fraction("4");
            }
            if (testPaper.getTopic3Three() != null && !testPaper.getTopic3Three().isEmpty()) {
                testPaper.setTopic3Fraction(FractionUtil.getNumber(testPaper.getTopic3Three()));
            } else if (testPaper.getTopic3Two() != null && !testPaper.getTopic3Two().isEmpty()) {
                testPaper.setTopic3Fraction("-1");
            } else {
                testPaper.setTopic3Fraction("1");
            }
            if (testPaper.getTopic4Three() != null && !testPaper.getTopic4Three().isEmpty()) {
                testPaper.setTopic4Fraction(FractionUtil.getNumber(testPaper.getTopic4Three()));
            } else if (testPaper.getTopic4Two() != null && !testPaper.getTopic4Two().isEmpty()) {
                testPaper.setTopic4Fraction("-1");
            } else {
                testPaper.setTopic4Fraction("1");
            }
            if (testPaper.getTopic5Three() != null && !testPaper.getTopic5Three().isEmpty()) {
                testPaper.setTopic5Fraction(FractionUtil.getNumber(testPaper.getTopic5Three()));
            } else if (testPaper.getTopic5Two() != null && !testPaper.getTopic5Two().isEmpty()) {
                testPaper.setTopic5Fraction("-2");
            } else {
                testPaper.setTopic5Fraction("4");
            }
            if (testPaper.getTopic6Three() != null && !testPaper.getTopic6Three().isEmpty()) {
                testPaper.setTopic6Fraction(FractionUtil.getNumber(testPaper.getTopic6Three()));
            } else if (testPaper.getTopic6Two() != null && !testPaper.getTopic6Two().isEmpty()) {
                testPaper.setTopic6Fraction("-2");
            } else {
                testPaper.setTopic6Fraction("2");
            }
            if (testPaper.getTopic7Three() != null && !testPaper.getTopic7Three().isEmpty()) {
                testPaper.setTopic7Fraction(FractionUtil.getNumber(testPaper.getTopic7Three()));
            } else if (testPaper.getTopic7Two() != null && !testPaper.getTopic7Two().isEmpty()) {
                testPaper.setTopic7Fraction("-2");
            } else {
                testPaper.setTopic7Fraction("2");
            }
            if (testPaper.getTopic8Three() != null && !testPaper.getTopic8Three().isEmpty()) {
                testPaper.setTopic8Fraction(FractionUtil.getNumber(testPaper.getTopic8Three()));
            } else if (testPaper.getTopic8Two() != null && !testPaper.getTopic8Two().isEmpty()) {
                testPaper.setTopic2Fraction("-2");
            } else {
                testPaper.setTopic8Fraction("2");
            }
            if (testPaper.getTopic9Three() != null && !testPaper.getTopic9Three().isEmpty()) {
                testPaper.setTopic9Fraction(FractionUtil.getNumber(testPaper.getTopic9Three()));
            } else if (testPaper.getTopic9Two() != null && !testPaper.getTopic9Two().isEmpty()) {
                testPaper.setTopic9Fraction("-2");
            } else {
                testPaper.setTopic9Fraction("2");
            }
            if (testPaper.getTopic10Three() != null && !testPaper.getTopic10Three().isEmpty()) {
                testPaper.setTopic10Fraction(FractionUtil.getNumber(testPaper.getTopic10Three()));
            } else if (testPaper.getTopic10Two() != null && !testPaper.getTopic10Two().isEmpty()) {
                testPaper.setTopic10Fraction("-5");
            } else {
                testPaper.setTopic10Fraction("5");
            }
            if (testPaper.getTopic11Three() != null && !testPaper.getTopic11Three().isEmpty()) {
                testPaper.setTopic11Fraction(FractionUtil.getNumber(testPaper.getTopic11Three()));
            } else if (testPaper.getTopic11Two() != null && !testPaper.getTopic11Two().isEmpty()) {
                testPaper.setTopic11Fraction("-1");
            } else {
                testPaper.setTopic11Fraction("1");
            }
            if (testPaper.getTopic12Three() != null && !testPaper.getTopic12Three().isEmpty()) {
                testPaper.setTopic12Fraction(FractionUtil.getNumber(testPaper.getTopic12Three()));
            } else if (testPaper.getTopic12Two() != null && !testPaper.getTopic12Two().isEmpty()) {
                testPaper.setTopic12Fraction("-2");
            } else {
                testPaper.setTopic12Fraction("2");
            }
            if (testPaper.getTopic13Three() != null && !testPaper.getTopic13Three().isEmpty()) {
                testPaper.setTopic13Fraction(FractionUtil.getNumber(testPaper.getTopic13Three()));
            } else if (testPaper.getTopic13Two() != null && !testPaper.getTopic13Two().isEmpty()) {
                testPaper.setTopic13Fraction("-2");
            } else {
                testPaper.setTopic13Fraction("2");
            }
            if (testPaper.getTopic14Three() != null && !testPaper.getTopic14Three().isEmpty()) {
                testPaper.setTopic14Fraction(FractionUtil.getNumber(testPaper.getTopic14Three()));
            } else if (testPaper.getTopic14Two() != null && !testPaper.getTopic14Two().isEmpty()) {
                testPaper.setTopic14Fraction("-4");
            } else {
                testPaper.setTopic14Fraction("4");
            }
            if (testPaper.getTopic15Three() != null && !testPaper.getTopic15Three().isEmpty()) {
                testPaper.setTopic15Fraction(FractionUtil.getNumber(testPaper.getTopic15Three()));
            } else if (testPaper.getTopic15Two() != null && !testPaper.getTopic15Two().isEmpty()) {
                testPaper.setTopic15Fraction("-2");
            } else {
                testPaper.setTopic15Fraction("2");
            }
            if (testPaper.getTopic16Three() != null && !testPaper.getTopic16Three().isEmpty()) {
                testPaper.setTopic16Fraction(FractionUtil.getNumber(testPaper.getTopic16Three()));
            } else if (testPaper.getTopic16Two() != null && !testPaper.getTopic16Two().isEmpty()) {
                testPaper.setTopic16Fraction("-4");
            } else {
                testPaper.setTopic16Fraction("4");
            }
            if (testPaper.getTopic17Three() != null && !testPaper.getTopic17Three().isEmpty()) {
                testPaper.setTopic17Fraction(Integer.valueOf(FractionUtil.getNumber(testPaper.getTopic17Three())) * 2 + "");
            } else if (testPaper.getTopic17Two() != null && !testPaper.getTopic17Two().isEmpty()) {
                testPaper.setTopic17Fraction("-4");
            } else {
                testPaper.setTopic17Fraction("4");
            }
            if (testPaper.getTopic18Three() != null && !testPaper.getTopic18Three().isEmpty()) {
                testPaper.setTopic18Fraction(FractionUtil.getNumber(testPaper.getTopic18Three()));
            } else if (testPaper.getTopic18Two() != null && !testPaper.getTopic18Two().isEmpty()) {
                testPaper.setTopic18Fraction("-2");
            } else {
                testPaper.setTopic18Fraction("2");
            }
            if (testPaper.getTopic19Three() != null && !testPaper.getTopic19Three().isEmpty()) {
                testPaper.setTopic19Fraction(FractionUtil.getNumber(testPaper.getTopic19Three()));
            } else if (testPaper.getTopic19Two() != null && !testPaper.getTopic19Two().isEmpty()) {
                testPaper.setTopic19Fraction("-2");
            } else {
                testPaper.setTopic19Fraction("2");
            }
            if (testPaper.getTopic20Three() != null && !testPaper.getTopic20Three().isEmpty()) {
                testPaper.setTopic20Fraction(FractionUtil.getNumber(testPaper.getTopic20Three()));
            } else if (testPaper.getTopic20Two() != null && !testPaper.getTopic20Two().isEmpty()) {
                testPaper.setTopic20Fraction("-2");
            } else {
                testPaper.setTopic20Fraction("2");
            }
            if (testPaper.getTopic21Three() != null && !testPaper.getTopic21Three().isEmpty()) {
                testPaper.setTopic21Fraction(FractionUtil.getNumber(testPaper.getTopic21Three()));
            } else if (testPaper.getTopic21Two() != null && !testPaper.getTopic21Two().isEmpty()) {
                testPaper.setTopic21Fraction("-4");
            } else {
                testPaper.setTopic21Fraction("4");
            }
            if (testPaper.getTopic22Three() != null && !testPaper.getTopic22Three().isEmpty()) {
                testPaper.setTopic22Fraction(FractionUtil.getNumber(testPaper.getTopic22Three()));
            } else if (testPaper.getTopic22Two() != null && !testPaper.getTopic22Two().isEmpty()) {
                testPaper.setTopic22Fraction("-2");
            } else {
                testPaper.setTopic22Fraction("2");
            }
            if (testPaper.getTopic23Three() != null && !testPaper.getTopic23Three().isEmpty()) {
                testPaper.setTopic23Fraction(FractionUtil.getNumber(testPaper.getTopic23Three()));
            } else if (testPaper.getTopic23Two() != null && !testPaper.getTopic23Two().isEmpty()) {
                testPaper.setTopic23Fraction("-2");
            } else {
                testPaper.setTopic23Fraction("2");
            }
            if (testPaper.getTopic24Three() != null && !testPaper.getTopic24Three().isEmpty()) {
                testPaper.setTopic24Fraction(FractionUtil.getNumber(testPaper.getTopic24Three()));
            } else if (testPaper.getTopic24Two() != null && !testPaper.getTopic24Two().isEmpty()) {
                testPaper.setTopic24Fraction("-2");
            } else {
                testPaper.setTopic24Fraction("2");
            }
            if (testPaper.getTopic25Three() != null && !testPaper.getTopic25Three().isEmpty()) {
                testPaper.setTopic25Fraction(FractionUtil.getNumber(testPaper.getTopic25Three()));
            } else if (testPaper.getTopic25Two() != null && !testPaper.getTopic25Two().isEmpty()) {
                testPaper.setTopic25Fraction("-2");
            } else {
                testPaper.setTopic25Fraction("2");
            }
            if (testPaper.getTopic26Three() != null && !testPaper.getTopic26Three().isEmpty()) {
                testPaper.setTopic26Fraction(FractionUtil.getNumber(testPaper.getTopic26Three()));
            } else if (testPaper.getTopic26Two() != null && !testPaper.getTopic26Two().isEmpty()) {
                testPaper.setTopic26Fraction("-2");
            } else {
                testPaper.setTopic26Fraction("2");
            }
            if (testPaper.getTopic27Three() != null && !testPaper.getTopic27Three().isEmpty()) {
                testPaper.setTopic27Fraction(FractionUtil.getNumber(testPaper.getTopic27Three()));
            } else if (testPaper.getTopic27Two() != null && !testPaper.getTopic27Two().isEmpty()) {
                testPaper.setTopic27Fraction("-4");
            } else {
                testPaper.setTopic27Fraction("4");
            }
            if (testPaper.getTopic28Three() != null && !testPaper.getTopic28Three().isEmpty()) {
                testPaper.setTopic28Fraction(FractionUtil.getNumber(testPaper.getTopic28Three()));
            } else if (testPaper.getTopic28Two() != null && !testPaper.getTopic28Two().isEmpty()) {
                testPaper.setTopic28Fraction("-2");
            } else {
                testPaper.setTopic28Fraction("2");
            }
            if (testPaper.getTopic29Three() != null && !testPaper.getTopic29Three().isEmpty()) {
                testPaper.setTopic29Fraction(FractionUtil.getNumber(testPaper.getTopic29Three()));
            } else if (testPaper.getTopic29Two() != null && !testPaper.getTopic29Two().isEmpty()) {
                testPaper.setTopic29Fraction("-4");
            } else {
                testPaper.setTopic29Fraction("4");
            }
            if (testPaper.getTopic30Three() != null && !testPaper.getTopic30Three().isEmpty()) {
                testPaper.setTopic30Fraction(FractionUtil.getNumber(testPaper.getTopic30Three()));
            } else if (testPaper.getTopic30Two() != null && !testPaper.getTopic30Two().isEmpty()) {
                testPaper.setTopic30Fraction("-2");
            } else {
                testPaper.setTopic30Fraction("2");
            }
            if (testPaper.getTopic31Three() != null && !testPaper.getTopic31Three().isEmpty()) {
                testPaper.setTopic31Fraction(FractionUtil.getNumber(testPaper.getTopic31Three()));
            } else if (testPaper.getTopic31Two() != null && !testPaper.getTopic31Two().isEmpty()) {
                testPaper.setTopic31Fraction("-3");
            } else {
                testPaper.setTopic31Fraction("2");
            }
            if (testPaper.getTopic32Three() != null && !testPaper.getTopic32Three().isEmpty()) {
                testPaper.setTopic32Fraction(FractionUtil.getNumber(testPaper.getTopic32Three()));
            } else if (testPaper.getTopic32Two() != null && !testPaper.getTopic32Two().isEmpty()) {
                testPaper.setTopic32Fraction("-2");
            } else {
                testPaper.setTopic32Fraction("2");
            }
            if (testPaper.getTopic33Three() != null && !testPaper.getTopic33Three().isEmpty()) {
                testPaper.setTopic33Fraction(FractionUtil.getNumber(testPaper.getTopic33Three()));
            } else if (testPaper.getTopic33Two() != null && !testPaper.getTopic33Two().isEmpty()) {
                testPaper.setTopic33Fraction("-4");
            } else {
                testPaper.setTopic33Fraction("4");
            }
            if (testPaper.getTopic34Three() != null && !testPaper.getTopic34Three().isEmpty()) {
                testPaper.setTopic34Fraction(FractionUtil.getNumber(testPaper.getTopic34Three()));
            } else if (testPaper.getTopic34Two() != null && !testPaper.getTopic34Two().isEmpty()) {
                testPaper.setTopic34Fraction("-2");
            } else {
                testPaper.setTopic34Fraction("2");
            }
            if (testPaper.getTopic35Three() != null && !testPaper.getTopic35Three().isEmpty()) {
                testPaper.setTopic35Fraction(FractionUtil.getNumber(testPaper.getTopic35Three()));
            } else if (testPaper.getTopic35Two() != null && !testPaper.getTopic35Two().isEmpty()) {
                testPaper.setTopic35Fraction("-2");
            } else {
                testPaper.setTopic35Fraction("2");
            }
            if (testPaper.getTopic36Three() != null && !testPaper.getTopic36Three().isEmpty()) {
                testPaper.setTopic36Fraction(FractionUtil.getNumber(testPaper.getTopic36Three()));
            } else if (testPaper.getTopic36Two() != null && !testPaper.getTopic36Two().isEmpty()) {
                testPaper.setTopic36Fraction("-2");
            } else {
                testPaper.setTopic36Fraction("2");
            }
            if (testPaper.getTopic37Three() != null && !testPaper.getTopic37Three().isEmpty()) {
                testPaper.setTopic37Fraction(FractionUtil.getNumber(testPaper.getTopic37Three()));
            } else if (testPaper.getTopic37Two() != null && !testPaper.getTopic37Two().isEmpty()) {
                testPaper.setTopic37Fraction("-2");
            } else {
                testPaper.setTopic37Fraction("2");
            }
            if (testPaper.getTopic38Three() != null && !testPaper.getTopic38Three().isEmpty()) {
                testPaper.setTopic38Fraction(FractionUtil.getNumber(testPaper.getTopic38Three()));
            } else if (testPaper.getTopic38Two() != null && !testPaper.getTopic38Two().isEmpty()) {
                testPaper.setTopic38Fraction("-2");
            } else {
                testPaper.setTopic38Fraction("2");
            }
            if (testPaper.getTopic39Three() != null && !testPaper.getTopic39Three().isEmpty()) {
                testPaper.setTopic39Fraction(FractionUtil.getNumber(testPaper.getTopic39Three()));
            } else if (testPaper.getTopic39Two() != null && !testPaper.getTopic39Two().isEmpty()) {
                testPaper.setTopic39Fraction("-4");
            } else {
                testPaper.setTopic39Fraction("4");
            }
            if (testPaper.getTopic40Three() != null && !testPaper.getTopic40Three().isEmpty()) {
                testPaper.setTopic40Fraction(FractionUtil.getNumber(testPaper.getTopic40Three()));
            } else if (testPaper.getTopic40Two() != null && !testPaper.getTopic40Two().isEmpty()) {
                testPaper.setTopic40Fraction("-2");
            } else {
                testPaper.setTopic40Fraction("2");
            }
            testPaper.setScore(FractionUtil.getsSore(testPaper));
        }catch (Exception e){
            e.printStackTrace();
            return testPaper;
        }

        return testPaper;

    }

    //判断选的是几处然后计算得分
    public static String getNumber(String three){
        String num="";
        try {
            three=three.substring(three.indexOf(".") + 1);
            three=three.trim();
            if(three != null && !"".equals(three)){
                for(int i=0;i<three.length();i++){
                    if(three.charAt(i)>=48 && three.charAt(i)<=57){
                        num+=three.charAt(i);
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return  num;
    }


    //计算总分数
    public  static  String getsSore(TestPaper testPaper){
        Integer score=0;
        try {
             score =score+ Integer.valueOf(testPaper.getTopic1Fraction());
            score = score + Integer.valueOf(testPaper.getTopic2Fraction());
            score = score + Integer.valueOf(testPaper.getTopic3Fraction());
            score = score + Integer.valueOf(testPaper.getTopic4Fraction());
            score = score + Integer.valueOf(testPaper.getTopic5Fraction());
            score = score + Integer.valueOf(testPaper.getTopic6Fraction());
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
            score = score + Integer.valueOf(testPaper.getTopic29Fraction());
            score = score + Integer.valueOf(testPaper.getTopic30Fraction());
            score = score + Integer.valueOf(testPaper.getTopic31Fraction());
            score = score + Integer.valueOf(testPaper.getTopic32Fraction());
            score = score + Integer.valueOf(testPaper.getTopic33Fraction());
            score = score + Integer.valueOf(testPaper.getTopic34Fraction());
            score = score + Integer.valueOf(testPaper.getTopic35Fraction());
            score = score + Integer.valueOf(testPaper.getTopic36Fraction());
            score = score + Integer.valueOf(testPaper.getTopic37Fraction());
            score = score + Integer.valueOf(testPaper.getTopic38Fraction());
            score = score + Integer.valueOf(testPaper.getTopic39Fraction());
            score = score + Integer.valueOf(testPaper.getTopic40Fraction());
        }catch (Exception e){
            e.printStackTrace();
             return "";
        }
        return String.valueOf(score);
    }



}
