package cn.vo.util;

import cn.vo.controller.hans.FractionUtil;
import cn.vo.pojo.entity.TestPaper;

public class SorceUtils {
    //赋值得分
    public static TestPaper getFraction(TestPaper testPaper){
        try {
            if (testPaper.getTopic1One().contains("不")){
                if (testPaper.getTopic1Three() != null && !testPaper.getTopic1Three().isEmpty()) {
                    testPaper.setTopic1Fraction(FractionUtil.getNumber("th1",testPaper.getTopic1Three()));
                } else if (testPaper.getTopic1Two() != null && !testPaper.getTopic1Two().isEmpty()) {
                    testPaper.setTopic1Fraction("0");
                } else {
                    testPaper.setTopic1Fraction("4");
                }
            }else{
                testPaper.setTopic1Fraction("4");
            }
            if (testPaper.getTopic2One().contains("不")){
                if (testPaper.getTopic2Three() != null && !testPaper.getTopic2Three().isEmpty()) {
                    testPaper.setTopic2Fraction(FractionUtil.getNumber("th2",testPaper.getTopic2Three()));
                } else if (testPaper.getTopic2Two() != null && !testPaper.getTopic2Two().isEmpty()) {
                    testPaper.setTopic2Fraction("0");
                } else {
                    testPaper.setTopic2Fraction("4");
                }
            }else {
                testPaper.setTopic2Fraction("4");
            }

            if (testPaper.getTopic3One().contains("不")){
                if (testPaper.getTopic3Three() != null && !testPaper.getTopic3Three().isEmpty()) {
                    testPaper.setTopic3Fraction(FractionUtil.getNumber("th3",testPaper.getTopic3Three()));
                } else if (testPaper.getTopic3Two() != null && !testPaper.getTopic3Two().isEmpty()) {
                    testPaper.setTopic3Fraction("0");
                } else {
                    testPaper.setTopic3Fraction("1");
                }
            }else{
                testPaper.setTopic3Fraction("1");
            }

            if (testPaper.getTopic4One().contains("不")){
                if (testPaper.getTopic4Three() != null && !testPaper.getTopic4Three().isEmpty()) {
                    testPaper.setTopic4Fraction(FractionUtil.getNumber("th4",testPaper.getTopic4Three()));
                } else if (testPaper.getTopic4Two() != null && !testPaper.getTopic4Two().isEmpty()) {
                    testPaper.setTopic4Fraction("0");
                } else {
                    testPaper.setTopic4Fraction("1");
                }
            }else{
                testPaper.setTopic4Fraction("1");
            }

            if (testPaper.getTopic5One().contains("不")){

                if (testPaper.getTopic5Three() != null && !testPaper.getTopic5Three().isEmpty()) {
                    testPaper.setTopic5Fraction(FractionUtil.getNumber("th5",testPaper.getTopic5Three()));
                } else if (testPaper.getTopic5Two() != null && !testPaper.getTopic5Two().isEmpty()) {
                    testPaper.setTopic5Fraction("0");
                } else {
                    testPaper.setTopic5Fraction("2");
                }
            }else{
                testPaper.setTopic5Fraction("2");
            }
            if (testPaper.getTopic6One().contains("不")){
                if (testPaper.getTopic6Three() != null && !testPaper.getTopic6Three().isEmpty()) {
                    testPaper.setTopic6Fraction(FractionUtil.getNumber("th6",testPaper.getTopic6Three()));
                } else if (testPaper.getTopic6Two() != null && !testPaper.getTopic6Two().isEmpty()) {
                    testPaper.setTopic6Fraction("0");
                } else {
                    testPaper.setTopic6Fraction("2");
                }
            }else{
                testPaper.setTopic6Fraction("2");
            }
            if (testPaper.getTopic7One().contains("不")){
                if (testPaper.getTopic7Three() != null && !testPaper.getTopic7Three().isEmpty()) {
                    testPaper.setTopic7Fraction(FractionUtil.getNumber("th7",testPaper.getTopic7Three()));
                } else if (testPaper.getTopic7Two() != null && !testPaper.getTopic7Two().isEmpty()) {
                    testPaper.setTopic7Fraction("0");
                } else {
                    testPaper.setTopic7Fraction("2");
                }
            }else{
                testPaper.setTopic7Fraction("2");
            }
            if (testPaper.getTopic8One().contains("不")){
                if (testPaper.getTopic8Three() != null && !testPaper.getTopic8Three().isEmpty()) {
                    testPaper.setTopic8Fraction(FractionUtil.getNumber("th8",testPaper.getTopic8Three()));
                } else if (testPaper.getTopic8Two() != null && !testPaper.getTopic8Two().isEmpty()) {
                    testPaper.setTopic8Fraction("0");
                } else {
                    testPaper.setTopic8Fraction("2");
                }
            }else{
                testPaper.setTopic8Fraction("2");
            }
            if (testPaper.getTopic9One().contains("不")){
                if (testPaper.getTopic9One().contains("2")){
                    testPaper.setTopic9Fraction("0");
                }else{
                    if (testPaper.getTopic9Two().contains("2")){
                        testPaper.setTopic9Fraction("0");
                    }else{
                        testPaper.setTopic9Fraction("2");
                    }
                }
            }else{
                testPaper.setTopic9Fraction("2");
            }
            if (testPaper.getTopic10One().contains("不")){
                if (testPaper.getTopic10Three() != null && !testPaper.getTopic10Three().isEmpty()) {
                    testPaper.setTopic10Fraction(FractionUtil.getNumber("th10",testPaper.getTopic10Three()));
                } else if (testPaper.getTopic10Two() != null && !testPaper.getTopic10Two().isEmpty()) {
                    testPaper.setTopic10Fraction("0");
                } else {
                    testPaper.setTopic10Fraction("5");
                }
            }else{
                testPaper.setTopic10Fraction("5");
            }
            if (testPaper.getTopic11One().contains("不")){
                if (testPaper.getTopic11Three() != null && !testPaper.getTopic11Three().isEmpty()) {
                    testPaper.setTopic11Fraction(FractionUtil.getNumber("th11",testPaper.getTopic11Three()));
                } else if (testPaper.getTopic11Two() != null && !testPaper.getTopic11Two().isEmpty()) {
                    testPaper.setTopic11Fraction("0");
                } else {
                    testPaper.setTopic11Fraction("1");
                }
            }else{
                testPaper.setTopic11Fraction("1");
            }
            if (testPaper.getTopic12One().contains("不")){
                if (testPaper.getTopic12Three() != null && !testPaper.getTopic12Three().isEmpty()) {
                    testPaper.setTopic12Fraction(FractionUtil.getNumber("th12",testPaper.getTopic12Three()));
                } else if (testPaper.getTopic12Two() != null && !testPaper.getTopic12Two().isEmpty()) {
                    testPaper.setTopic12Fraction("0");
                } else {
                    testPaper.setTopic12Fraction("2");
                }
            }else{
                testPaper.setTopic12Fraction("2");
            }
            if (testPaper.getTopic13One().contains("不")){
                if (testPaper.getTopic13Three() != null && !testPaper.getTopic13Three().isEmpty()) {
                    testPaper.setTopic13Fraction(FractionUtil.getNumber("th13",testPaper.getTopic13Three()));
                } else if (testPaper.getTopic13Two() != null && !testPaper.getTopic13Two().isEmpty()) {
                    testPaper.setTopic13Fraction("0");
                } else {
                    testPaper.setTopic13Fraction("2");
                }
            }else{
                testPaper.setTopic13Fraction("2");
            }
            if (testPaper.getTopic14One().contains("不")){
                if (testPaper.getTopic14Three() != null && !testPaper.getTopic14Three().isEmpty()) {
                    testPaper.setTopic14Fraction(FractionUtil.getNumber("th14",testPaper.getTopic14Three()));
                } else if (testPaper.getTopic14Two() != null && !testPaper.getTopic14Two().isEmpty()) {
                    testPaper.setTopic14Fraction("0");
                } else {
                    testPaper.setTopic14Fraction("4");
                }
            }else{
                testPaper.setTopic14Fraction("4");
            }
            if (testPaper.getTopic15One().contains("不")){
                if (testPaper.getTopic15Three() != null && !testPaper.getTopic15Three().isEmpty()) {
                    testPaper.setTopic15Fraction(FractionUtil.getNumber("th15",testPaper.getTopic15Three()));
                } else if (testPaper.getTopic15Two() != null && !testPaper.getTopic15Two().isEmpty()) {
                    testPaper.setTopic15Fraction("0");
                } else {
                    testPaper.setTopic15Fraction("2");
                }
            }else{
                testPaper.setTopic15Fraction("2");
            }
            if (testPaper.getTopic16One().contains("不")){
                if (testPaper.getTopic16Three() != null && !testPaper.getTopic16Three().isEmpty()) {
                    testPaper.setTopic16Fraction(FractionUtil.getNumber("th16",testPaper.getTopic16Three()));
                } else if (testPaper.getTopic16Two() != null && !testPaper.getTopic16Two().isEmpty()) {
                    testPaper.setTopic16Fraction("0");
                } else {
                    testPaper.setTopic16Fraction("4");
                }
            }else{
                testPaper.setTopic16Fraction("4");
            }
            if (testPaper.getTopic17One().contains("不")){
                if (testPaper.getTopic17Three() != null && !testPaper.getTopic17Three().isEmpty()) {
                    testPaper.setTopic17Fraction(Integer.valueOf(FractionUtil.getNumber("th17",testPaper.getTopic17Three())) * 2 + "");
                } else if (testPaper.getTopic17Two() != null && !testPaper.getTopic17Two().isEmpty()) {
                    testPaper.setTopic17Fraction("0");
                } else {
                    testPaper.setTopic17Fraction("4");
                }
            }else{
                testPaper.setTopic17Fraction("4");
            }
            if (testPaper.getTopic18One().contains("不")){
                if (testPaper.getTopic18Three() != null && !testPaper.getTopic18Three().isEmpty()) {
                    testPaper.setTopic18Fraction(FractionUtil.getNumber("th18",testPaper.getTopic18Three()));
                } else if (testPaper.getTopic18Two() != null && !testPaper.getTopic18Two().isEmpty()) {
                    testPaper.setTopic18Fraction("0");
                } else {
                    testPaper.setTopic18Fraction("2");
                }
            }else{
                testPaper.setTopic18Fraction("2");
            }
            if (testPaper.getTopic19One().contains("不")){
                if (testPaper.getTopic19Three() != null && !testPaper.getTopic19Three().isEmpty()) {
                    testPaper.setTopic19Fraction(FractionUtil.getNumber("th19",testPaper.getTopic19Three()));
                } else if (testPaper.getTopic19Two() != null && !testPaper.getTopic19Two().isEmpty()) {
                    testPaper.setTopic19Fraction("0");
                } else {
                    testPaper.setTopic19Fraction("2");
                }
            }else{
                testPaper.setTopic19Fraction("2");
            }
            if (testPaper.getTopic20One().contains("不")){
                if (testPaper.getTopic20Three() != null && !testPaper.getTopic20Three().isEmpty()) {
                    testPaper.setTopic20Fraction(FractionUtil.getNumber("th20",testPaper.getTopic20Three()));
                } else if (testPaper.getTopic20Two() != null && !testPaper.getTopic20Two().isEmpty()) {
                    testPaper.setTopic20Fraction("0");
                } else {
                    testPaper.setTopic20Fraction("2");
                }
            }else{
                testPaper.setTopic20Fraction("2");
            }

            testPaper.setScore(getsSore(testPaper));
        }catch (Exception e){
            e.printStackTrace();
            return testPaper;
        }

        return testPaper;

    }


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
        }catch (Exception e){
            e.printStackTrace();
            return "";
        }
        return String.valueOf(score);
    }


}
