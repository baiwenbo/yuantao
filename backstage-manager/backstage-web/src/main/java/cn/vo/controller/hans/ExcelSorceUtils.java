package cn.vo.controller.hans;

import cn.vo.pojo.entity.TestPaper;

import java.util.ArrayList;
import java.util.List;

public class ExcelSorceUtils {

    public static List<TestPaper> getSorce(List<TestPaper> list){
        List<TestPaper>  paperList=new ArrayList<>();
        if (list.size()>0){
            for (int i=0;i<list.size();i++){
                TestPaper testPaper=list.get(i);
                    testPaper.setTh1sorce(setSorce(testPaper.getTopic1One(),"th1"));
                    testPaper.setTh2sorce(setSorce(testPaper.getTopic2One(),"th2"));
                    testPaper.setTh3sorce(setSorce(testPaper.getTopic3One(),"th3"));
                    testPaper.setTh4sorce(setSorce(testPaper.getTopic4One(),"th4"));
                    testPaper.setTh5sorce(setSorce(testPaper.getTopic5One(),"th5"));
                    testPaper.setTh6sorce(setSorce(testPaper.getTopic6One(),"th6"));
                    testPaper.setTh7sorce(setSorce(testPaper.getTopic7One(),"th7"));
                    testPaper.setTh8sorce(setSorce(testPaper.getTopic8One(),"th8"));
                    testPaper.setTh9sorce(setSorce(testPaper.getTopic9One(),"th9"));
                    testPaper.setTh10sorce(setSorce(testPaper.getTopic10One(),"th10"));
                    testPaper.setTh11sorce(setSorce(testPaper.getTopic11One(),"th11"));
                    testPaper.setTh12sorce(setSorce(testPaper.getTopic12One(),"th12"));
                    testPaper.setTh13sorce(setSorce(testPaper.getTopic13One(),"th13"));
                    testPaper.setTh14sorce(setSorce(testPaper.getTopic14One(),"th14"));
                    testPaper.setTh15sorce(setSorce(testPaper.getTopic15One(),"th15"));
                    testPaper.setTh16sorce(setSorce(testPaper.getTopic16One(),"th16"));
                    testPaper.setTh17sorce(setSorce(testPaper.getTopic17One(),"th17"));
                    testPaper.setTh18sorce(setSorce(testPaper.getTopic18One(),"th18"));
                    testPaper.setTh19sorce(setSorce(testPaper.getTopic19One(),"th19"));
                    testPaper.setTh20sorce(setSorce(testPaper.getTopic20One(),"th20"));
                    testPaper.setTh21sorce(setSorce(testPaper.getTopic21One(),"th21"));
                    testPaper.setTh22sorce(setSorce(testPaper.getTopic22One(),"th22"));
                    testPaper.setTh23sorce(setSorce(testPaper.getTopic23One(),"th23"));
                    testPaper.setTh24sorce(setSorce(testPaper.getTopic24One(),"th24"));
                    testPaper.setTh25sorce(setSorce(testPaper.getTopic25One(),"th25"));
                    testPaper.setTh26sorce(setSorce(testPaper.getTopic26One(),"th26"));
                    testPaper.setTh27sorce(setSorce(testPaper.getTopic27One(),"th27"));
                    testPaper.setTh28sorce(setSorce(testPaper.getTopic28One(),"th28"));
                    testPaper.setTh29sorce(setSorce(testPaper.getTopic29One(),"th29"));
                    testPaper.setTh30sorce(setSorce(testPaper.getTopic30One(),"th30"));
                    testPaper.setTh31sorce(setSorce(testPaper.getTopic31One(),"th31"));
                    testPaper.setTh32sorce(setSorce(testPaper.getTopic32One(),"th32"));
                    testPaper.setTh33sorce(setSorce(testPaper.getTopic33One(),"th33"));
                    testPaper.setTh34sorce(setSorce(testPaper.getTopic34One(),"th34"));
                    testPaper.setTh35sorce(setSorce(testPaper.getTopic35One(),"th35"));
                    testPaper.setTh36sorce(setSorce(testPaper.getTopic36One(),"th36"));
                    testPaper.setTh37sorce(setSorce(testPaper.getTopic37One(),"th37"));
                    testPaper.setTh38sorce(setSorce(testPaper.getTopic38One(),"th38"));
                    testPaper.setTh39sorce(setSorce(testPaper.getTopic39One(),"th39"));
                    testPaper.setTh40sorce(setSorce(testPaper.getTopic40One(),"th40"));

                    testPaper.setTh1mark(getNumber("",testPaper.getTopic1Three()));
                    testPaper.setTh2mark(getNumber("",testPaper.getTopic2Three()));
                    testPaper.setTh3mark(getNumber("",testPaper.getTopic3Three()));
                    testPaper.setTh4mark(getNumber("",testPaper.getTopic4Three()));
                    testPaper.setTh5mark(getNumber("",testPaper.getTopic5Three()));
                    testPaper.setTh6mark(getNumber("",testPaper.getTopic6Three()));
                    testPaper.setTh7mark(getNumber("",testPaper.getTopic7Three()));
                    testPaper.setTh8mark(getNumber("",testPaper.getTopic8Three()));
                    testPaper.setTh9mark(getNumber("",testPaper.getTopic9Three()));
                    testPaper.setTh10mark(getNumber("",testPaper.getTopic10Three()));
                    testPaper.setTh11mark(getNumber("",testPaper.getTopic11Three()));
                    testPaper.setTh12mark(getNumber("",testPaper.getTopic12Three()));
                    testPaper.setTh13mark(getNumber("",testPaper.getTopic13Three()));
                    testPaper.setTh14mark(getNumber("",testPaper.getTopic14Three()));
                    testPaper.setTh15mark(getNumber("",testPaper.getTopic15Three()));
                    testPaper.setTh16mark(getNumber("",testPaper.getTopic16Three()));
                    testPaper.setTh17mark(getNumber("",testPaper.getTopic17Three()));
                    testPaper.setTh18mark(getNumber("",testPaper.getTopic18Three()));
                    testPaper.setTh19mark(getNumber("",testPaper.getTopic19Three()));
                    testPaper.setTh20mark(getNumber("",testPaper.getTopic20Three()));
                    testPaper.setTh21mark(getNumber("",testPaper.getTopic21Three()));
                    testPaper.setTh22mark(getNumber("",testPaper.getTopic22Three()));
                    testPaper.setTh23mark(getNumber("",testPaper.getTopic23Three()));
                    testPaper.setTh24mark(getNumber("",testPaper.getTopic24Three()));
                    testPaper.setTh25mark(getNumber("",testPaper.getTopic25Three()));
                    testPaper.setTh26mark(getNumber("",testPaper.getTopic26Three()));
                    testPaper.setTh27mark(getNumber("",testPaper.getTopic27Three()));
                    testPaper.setTh28mark(getNumber("",testPaper.getTopic28Three()));
                    testPaper.setTh29mark(getNumber("",testPaper.getTopic29Three()));
                    testPaper.setTh30mark(getNumber("",testPaper.getTopic30Three()));
                    testPaper.setTh31mark(getNumber("",testPaper.getTopic31Three()));
                    testPaper.setTh32mark(getNumber("",testPaper.getTopic32Three()));
                    testPaper.setTh33mark(getNumber("",testPaper.getTopic33Three()));
                    testPaper.setTh34mark(getNumber("",testPaper.getTopic34Three()));
                    testPaper.setTh35mark(getNumber("",testPaper.getTopic35Three()));
                    testPaper.setTh36mark(getNumber("",testPaper.getTopic36Three()));
                    testPaper.setTh37mark(getNumber("",testPaper.getTopic37Three()));
                    testPaper.setTh38mark(getNumber("",testPaper.getTopic38Three()));
                    testPaper.setTh39mark(getNumber("",testPaper.getTopic39Three()));
                    testPaper.setTh40mark(getNumber("",testPaper.getTopic40Three()));
                paperList.add(testPaper);
            }
        }
        return paperList;

    }



    public static String setSorce(String disable,String quest){
        String number="0";
        if (disable.contains("不符合")){
            return  number;
        }else{
             number= String.valueOf(EnumerationMap.getFraction(quest));
        }
        return number;
    }

    public static String getNumber(String ques,String three){
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
            return "0";
        }
        return  "-"+num;
    }
}
