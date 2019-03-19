package cn.vo.controller.hans;

import cn.vo.pojo.entity.TestPaper;

public class FractionUtil {

    //赋值得分
    public static TestPaper getFraction(TestPaper testPaper){
        try {
            if (testPaper.getTopic1One().contains("不")){
                if (testPaper.getTopic1Three() != null && !testPaper.getTopic1Three().isEmpty()) {
                    testPaper.setTopic1Fraction(FractionUtil.getNumber("th1",testPaper.getTopic1Three()));
                }
            }else{
                testPaper.setTopic1Fraction("4");
            }

            if (testPaper.getTopic2One().contains("不")){
                if (testPaper.getTopic2Three() != null && !testPaper.getTopic2Three().isEmpty()) {
                    testPaper.setTopic2Fraction(FractionUtil.getNumber("th1",testPaper.getTopic2Three()));
                }
            }else{
                testPaper.setTopic2Fraction("4");
            }

            if (testPaper.getTopic3One().contains("不")){
                testPaper.setTopic3Fraction("0");
            }else{
                testPaper.setTopic3Fraction("1");
            }

            if (testPaper.getTopic4One().contains("不")){
                    testPaper.setTopic4Fraction("0");
            }else{
                testPaper.setTopic4Fraction("1");
            }

            if (testPaper.getTopic5One().contains("不")){
                    testPaper.setTopic5Fraction("0");
            }else{
                testPaper.setTopic5Fraction("2");
            }

            if (testPaper.getTopic6One().contains("不")){
                testPaper.setTopic6Fraction("0");
            }else{
                testPaper.setTopic6Fraction("2");
            }
            if (testPaper.getTopic7One().contains("不")){
                  testPaper.setTopic7Fraction("0");
            }else{
                testPaper.setTopic7Fraction("2");
            }
            if (testPaper.getTopic8One().contains("不")){
                  testPaper.setTopic8Fraction("0");
            }else{
                testPaper.setTopic8Fraction("2");
            }
            if (testPaper.getTopic9One().contains("有")) {
                if (testPaper.getTopic9Two().contains("不")) {
                    testPaper.setTopic9Fraction("0");
                } else {
                    testPaper.setTopic9Fraction("2");
                }
            }else{
                testPaper.setTopic9Fraction("2");
            }


            if (testPaper.getTopic10One().contains("不")){
                if (testPaper.getTopic10Three() != null && !testPaper.getTopic10Three().isEmpty()) {
                    testPaper.setTopic10Fraction(FractionUtil.getNumber("th10",testPaper.getTopic10Three()));
                }
            }else{
                testPaper.setTopic10Fraction("5");
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
                testPaper.setTopic13Fraction("2");
            }
            if (testPaper.getTopic14One().contains("不")){
                if (testPaper.getTopic14Three() != null && !testPaper.getTopic14Three().isEmpty()) {
                    testPaper.setTopic14Fraction(FractionUtil.getNumber("th14",testPaper.getTopic14Three()));
                }
            }else{
                testPaper.setTopic14Fraction("4");
            }
            if (testPaper.getTopic15One().contains("不")){
                if (testPaper.getTopic15Three() != null && !testPaper.getTopic15Three().isEmpty()) {
                    testPaper.setTopic15Fraction(FractionUtil.getNumber("th15",testPaper.getTopic15Three()));
                }
            }else{
                testPaper.setTopic15Fraction("2");
            }
            if (testPaper.getTopic16One().contains("不")){
                if (testPaper.getTopic16Three() != null && !testPaper.getTopic16Three().isEmpty()) {
                    testPaper.setTopic16Fraction(FractionUtil.getNumber("th16",testPaper.getTopic16Three()));
                }
            }else{
                testPaper.setTopic16Fraction("4");
            }
            if (testPaper.getTopic17One().contains("不")){
                if (testPaper.getTopic17Three() != null && !testPaper.getTopic17Three().isEmpty()) {
                    testPaper.setTopic17Fraction(Integer.valueOf(FractionUtil.getNumber("th17",testPaper.getTopic17Three())) * 2 + "");
                }
            }else{
                testPaper.setTopic17Fraction("4");
            }
            if (testPaper.getTopic18One().contains("不")){
                    testPaper.setTopic18Fraction("0");
            }else{
                testPaper.setTopic18Fraction("2");
            }
            if (testPaper.getTopic19One().contains("不")){
                if (testPaper.getTopic19Three() != null && !testPaper.getTopic19Three().isEmpty()) {
                    testPaper.setTopic19Fraction(FractionUtil.getNumber("th19",testPaper.getTopic19Three()));
                }
            }else{
                testPaper.setTopic19Fraction("2");
            }
            if (testPaper.getTopic20One().contains("不")){
                if (testPaper.getTopic20Three() != null && !testPaper.getTopic20Three().isEmpty()) {
                    testPaper.setTopic20Fraction(FractionUtil.getNumber("th20",testPaper.getTopic20Three()));
                }
            }else{
                testPaper.setTopic20Fraction("2");
            }
            if (testPaper.getTopic21One().contains("不")){
                if (testPaper.getTopic21Three() != null && !testPaper.getTopic21Three().isEmpty()) {
                    testPaper.setTopic21Fraction(FractionUtil.getNumber("th21",testPaper.getTopic21Three()));
                }
            }else{
                testPaper.setTopic21Fraction("4");
            }
            if (testPaper.getTopic22One().contains("不")){
                if (testPaper.getTopic22Three() != null && !testPaper.getTopic22Three().isEmpty()) {
                    testPaper.setTopic22Fraction(FractionUtil.getNumber("th22",testPaper.getTopic22Three()));
                }
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
                testPaper.setTopic24Fraction("2");
            }
            if (testPaper.getTopic25One().contains("不")){
                 testPaper.setTopic25Fraction("0");
            }else{
                testPaper.setTopic25Fraction("2");
            }
            if (testPaper.getTopic26One().contains("不")){
                 testPaper.setTopic26Fraction("0");
            }else{
                testPaper.setTopic26Fraction("2");
            }
            if (testPaper.getTopic27One().contains("不")){
                testPaper.setTopic27Fraction("0");
            }else{
                testPaper.setTopic27Fraction("4");
            }
            if (testPaper.getTopic28One().contains("不")){
                 testPaper.setTopic28Fraction("0");
            }else{
                 testPaper.setTopic28Fraction("2");
            }
            if (testPaper.getTopic29One().contains("不")){
                if (testPaper.getTopic29Three() != null && !testPaper.getTopic29Three().isEmpty()) {
                    testPaper.setTopic29Fraction(FractionUtil.getNumber("th29",testPaper.getTopic29Three()));
                }
            }else{
                testPaper.setTopic29Fraction("4");
            }
            if (testPaper.getTopic30One().contains("不")){
                if (testPaper.getTopic30Three() != null && !testPaper.getTopic30Three().isEmpty()) {
                    testPaper.setTopic30Fraction(FractionUtil.getNumber("th30",testPaper.getTopic30Three()));
                }
            }else{
                testPaper.setTopic30Fraction("2");
            }
            if (testPaper.getTopic31One().contains("不")){
                if (testPaper.getTopic31Three() != null && !testPaper.getTopic31Three().isEmpty()) {
                    testPaper.setTopic31Fraction(FractionUtil.getNumber("th31",testPaper.getTopic31Three()));
                }
            }else{
                testPaper.setTopic31Fraction("2");
            }
            if (testPaper.getTopic32One().contains("不")){
                 testPaper.setTopic32Fraction("0");
            }else{
                testPaper.setTopic32Fraction("2");
            }
            if (testPaper.getTopic33One().contains("不")){
                if (testPaper.getTopic33Three() != null && !testPaper.getTopic33Three().isEmpty()) {
                    testPaper.setTopic33Fraction(FractionUtil.getNumber("th33",testPaper.getTopic33Three()));
                }
            }else{
                testPaper.setTopic33Fraction("4");
            }
            if (testPaper.getTopic34One().contains("不")){
                if (testPaper.getTopic34Three() != null && !testPaper.getTopic34Three().isEmpty()) {
                    testPaper.setTopic34Fraction(FractionUtil.getNumber("th34",testPaper.getTopic34Three()));
                }
            }else{
                testPaper.setTopic34Fraction("2");
            }
            if (testPaper.getTopic35One().contains("不")){
                if (testPaper.getTopic35Three() != null && !testPaper.getTopic35Three().isEmpty()) {
                    testPaper.setTopic35Fraction(FractionUtil.getNumber("th35",testPaper.getTopic35Three()));
                }
            }else{
                testPaper.setTopic35Fraction("2");
            }
            if (testPaper.getTopic36One().contains("不")){
                if (testPaper.getTopic36Three() != null && !testPaper.getTopic36Three().isEmpty()) {
                    testPaper.setTopic36Fraction(FractionUtil.getNumber("th36",testPaper.getTopic36Three()));
                }
            }else{
                testPaper.setTopic36Fraction("2");
            }
            if (testPaper.getTopic37One().contains("不")){
                if (testPaper.getTopic37Three() != null && !testPaper.getTopic37Three().isEmpty()) {
                    testPaper.setTopic37Fraction(FractionUtil.getNumber("th37",testPaper.getTopic37Three()));
                }
            }else{
                testPaper.setTopic37Fraction("2");
            }
            if (testPaper.getTopic38One().contains("不")){
                testPaper.setTopic38Fraction("0");
            }else{
                testPaper.setTopic38Fraction("2");
            }
            if (testPaper.getTopic39One().contains("不")){
                testPaper.setTopic39Fraction("0");
            }else{
                testPaper.setTopic39Fraction("4");
            }
            if (testPaper.getTopic40One().contains("不")){
                if (testPaper.getTopic40Three() != null && !testPaper.getTopic40Three().isEmpty()) {
                    testPaper.setTopic40Fraction(FractionUtil.getNumber("th40",testPaper.getTopic40Three()));
                }
            }else{
                testPaper.setTopic40Fraction("2");
            }


            if (testPaper.getTopic26One().contains("不")){
                testPaper.setScore("0");
            }else {
                testPaper.setScore(FractionUtil.getsSore(testPaper));
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
    public  static  String getsSore(TestPaper testPaper){
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
        }catch (Exception e){
            e.printStackTrace();
             return "";
        }
        return String.valueOf(score);
    }



}
