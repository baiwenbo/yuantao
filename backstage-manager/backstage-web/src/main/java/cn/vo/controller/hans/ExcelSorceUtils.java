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
                testPaper.setTh1mark(setMark(testPaper.getTopic1One(),"th1"));
                testPaper.setTh2mark(setMark(testPaper.getTopic2One(),"th2"));
                testPaper.setTh3mark(setMark(testPaper.getTopic3One(),"th3"));
                testPaper.setTh4mark(setMark(testPaper.getTopic4One(),"th4"));
                testPaper.setTh5mark(setMark(testPaper.getTopic5One(),"th5"));
                testPaper.setTh6mark(setMark(testPaper.getTopic6One(),"th6"));
                testPaper.setTh7mark(setMark(testPaper.getTopic7One(),"th7"));
                testPaper.setTh8mark(setMark(testPaper.getTopic8One(),"th8"));
                testPaper.setTh9mark(setMark(testPaper.getTopic9Two(),"th9"));
                testPaper.setTh10mark(setMark(testPaper.getTopic10One(),"th10"));
                testPaper.setTh11mark(setMark(testPaper.getTopic11One(),"th11"));
                testPaper.setTh12mark(setMark(testPaper.getTopic12One(),"th12"));
                testPaper.setTh13mark(setMark(testPaper.getTopic13One(),"th13"));
                testPaper.setTh14mark(setMark(testPaper.getTopic14One(),"th14"));
                testPaper.setTh15mark(setMark(testPaper.getTopic15One(),"th15"));
                testPaper.setTh16mark(setMark(testPaper.getTopic16One(),"th16"));
                testPaper.setTh17mark(setMark(testPaper.getTopic17One(),"th17"));
                testPaper.setTh18mark(setMark(testPaper.getTopic18One(),"th18"));
                testPaper.setTh19mark(setMark(testPaper.getTopic19One(),"th19"));
                testPaper.setTh20mark(setMark(testPaper.getTopic20One(),"th20"));
                testPaper.setTh21mark(setMark(testPaper.getTopic21One(),"th21"));
                testPaper.setTh22mark(setMark(testPaper.getTopic22One(),"th22"));
                testPaper.setTh23mark(setMark(testPaper.getTopic23One(),"th23"));
                testPaper.setTh24mark(setMark(testPaper.getTopic24One(),"th24"));
                testPaper.setTh25mark(setMark(testPaper.getTopic25One(),"th25"));
                testPaper.setTh26mark(setMark(testPaper.getTopic26One(),"th26"));
                testPaper.setTh27mark(setMark(testPaper.getTopic27One(),"th27"));
                testPaper.setTh28mark(setMark(testPaper.getTopic28One(),"th28"));
                testPaper.setTh29mark(setMark(testPaper.getTopic29One(),"th29"));
                testPaper.setTh30mark(setMark(testPaper.getTopic30One(),"th30"));
                testPaper.setTh31mark(setMark(testPaper.getTopic31One(),"th31"));
                testPaper.setTh32mark(setMark(testPaper.getTopic32One(),"th32"));
                testPaper.setTh33mark(setMark(testPaper.getTopic33One(),"th33"));
                testPaper.setTh34mark(setMark(testPaper.getTopic34One(),"th34"));
                testPaper.setTh35mark(setMark(testPaper.getTopic35One(),"th35"));
                testPaper.setTh36mark(setMark(testPaper.getTopic36One(),"th36"));
                testPaper.setTh37mark(setMark(testPaper.getTopic37One(),"th37"));
                testPaper.setTh38mark(setMark(testPaper.getTopic38One(),"th38"));
                testPaper.setTh39mark(setMark(testPaper.getTopic39One(),"th39"));
                testPaper.setTh40mark(setMark(testPaper.getTopic40One(),"th40"));

                testPaper.setTh1sorce(setSorce("th1",testPaper.getTopic1Three(),""));
                testPaper.setTh2sorce(setSorce("th2",testPaper.getTopic2Three(),""));
                testPaper.setTh3sorce(setSorce("th3",testPaper.getTopic3Three(),""));
                testPaper.setTh4sorce(setSorce("th4",testPaper.getTopic4Three(),""));
                testPaper.setTh5sorce(setSorce("th5",testPaper.getTopic5Three(),""));
                testPaper.setTh6sorce(setSorce("th6",testPaper.getTopic6Three(),""));
                testPaper.setTh7sorce(setSorce("th7",testPaper.getTopic7Three(),""));
                testPaper.setTh8sorce(setSorce("th8",testPaper.getTopic8Three(),""));
                testPaper.setTh9sorce(setSorce("th9",testPaper.getTopic9Three(),""));
                testPaper.setTh10sorce(setSorce("th10",testPaper.getTopic10Three(),""));
                testPaper.setTh11sorce(setSorce("th11",testPaper.getTopic11Three(),""));
                testPaper.setTh12sorce(setSorce("th12",testPaper.getTopic12Three(),""));
                testPaper.setTh13sorce(setSorce("th13",testPaper.getTopic13Three(),""));
                testPaper.setTh14sorce(setSorce("th14",testPaper.getTopic14Three(),""));
                testPaper.setTh15sorce(setSorce("th15",testPaper.getTopic15Three(),""));
                testPaper.setTh16sorce(setSorce("th16",testPaper.getTopic16Three(),""));
                testPaper.setTh17sorce(setSorce("th17",testPaper.getTopic17Three(),""));
                testPaper.setTh18sorce(setSorce("th18",testPaper.getTopic18Three(),""));
                testPaper.setTh19sorce(setSorce("th19",testPaper.getTopic19Three(),""));
                testPaper.setTh20sorce(setSorce("th20",testPaper.getTopic20Three(),""));
                testPaper.setTh21sorce(setSorce("th21",testPaper.getTopic21Three(),""));
                testPaper.setTh22sorce(setSorce("th22",testPaper.getTopic22Three(),""));
                testPaper.setTh23sorce(setSorce("th23",testPaper.getTopic23Three(),""));
                testPaper.setTh24sorce(setSorce("th24",testPaper.getTopic24Three(),""));
                testPaper.setTh25sorce(setSorce("th25",testPaper.getTopic25Three(),""));
                testPaper.setTh26sorce(setSorce("th26",testPaper.getTopic26Three(),""));
                testPaper.setTh27sorce(setSorce("th27",testPaper.getTopic27Three(),""));
                testPaper.setTh28sorce(setSorce("th28",testPaper.getTopic28Three(),""));
                testPaper.setTh29sorce(setSorce("th29",testPaper.getTopic29Three(),""));
                testPaper.setTh30sorce(setSorce("th30",testPaper.getTopic30Three(),""));
                testPaper.setTh31sorce(setSorce("th31",testPaper.getTopic31Three(),""));
                testPaper.setTh32sorce(setSorce("th32",testPaper.getTopic32Three(),""));
                testPaper.setTh33sorce(setSorce("th33",testPaper.getTopic33Three(),""));
                testPaper.setTh34sorce(setSorce("th34",testPaper.getTopic34Three(),""));
                testPaper.setTh35sorce(setSorce("th35",testPaper.getTopic35Three(),""));
                testPaper.setTh36sorce(setSorce("th36",testPaper.getTopic36Three(),""));
                testPaper.setTh37sorce(setSorce("th37",testPaper.getTopic37Three(),""));
                testPaper.setTh38sorce(setSorce("th38",testPaper.getTopic38Three(),""));
                testPaper.setTh39sorce(setSorce("th39",testPaper.getTopic39Three(),""));
                testPaper.setTh40sorce(setSorce("th40",testPaper.getTopic40Three(),""));

                testPaper.setTopic1Two(testPaper.getTopic1Two()+testPaper.getTopic1Six());
                testPaper.setTopic2Two(testPaper.getTopic2Two()+testPaper.getTopic2Six());
                testPaper.setTopic3Two(testPaper.getTopic3Two()+testPaper.getTopic3Six());
                testPaper.setTopic4Two(testPaper.getTopic4Two()+testPaper.getTopic4Six());
                testPaper.setTopic5Two(testPaper.getTopic5Two()+testPaper.getTopic5Six());
                testPaper.setTopic6Two(testPaper.getTopic6Two()+testPaper.getTopic6Six());
                testPaper.setTopic7Two(testPaper.getTopic7Two()+testPaper.getTopic7Six());
                testPaper.setTopic8Two(testPaper.getTopic8Two()+testPaper.getTopic8Six());
                testPaper.setTopic9Two(testPaper.getTopic9Three()+testPaper.getTopic9Six());
                testPaper.setTopic10Two(testPaper.getTopic10Two()+testPaper.getTopic10Six());
                testPaper.setTopic11Two(testPaper.getTopic11Two()+testPaper.getTopic11Six());
                testPaper.setTopic12Two(testPaper.getTopic12Two()+testPaper.getTopic12Six());
                testPaper.setTopic13Two(testPaper.getTopic13Two()+testPaper.getTopic13Six());
                testPaper.setTopic14Two(testPaper.getTopic14Two()+testPaper.getTopic14Six());
                testPaper.setTopic15Two(testPaper.getTopic15Two()+testPaper.getTopic15Six());
                testPaper.setTopic16Two(testPaper.getTopic16Two()+testPaper.getTopic16Six());
                testPaper.setTopic17Two(testPaper.getTopic17Two()+testPaper.getTopic17Six());
                testPaper.setTopic18Two(testPaper.getTopic18Two()+testPaper.getTopic18Six());
                testPaper.setTopic19Two(testPaper.getTopic19Two()+testPaper.getTopic19Six());
                testPaper.setTopic20Two(testPaper.getTopic20Two()+testPaper.getTopic20Six());
                testPaper.setTopic21Two(testPaper.getTopic21Two()+testPaper.getTopic21Six());
                testPaper.setTopic22Two(testPaper.getTopic22Two()+testPaper.getTopic22Six());
                testPaper.setTopic23Two(testPaper.getTopic23Two()+testPaper.getTopic23Six());
                testPaper.setTopic24Two(testPaper.getTopic24Two()+testPaper.getTopic24Six());
                testPaper.setTopic25Two(testPaper.getTopic25Two()+testPaper.getTopic25Six());
                testPaper.setTopic26Two(testPaper.getTopic26Two()+testPaper.getTopic26Six());
                testPaper.setTopic27Two(testPaper.getTopic27Two()+testPaper.getTopic27Six());
                testPaper.setTopic28Two(testPaper.getTopic28Two()+testPaper.getTopic28Six());
                testPaper.setTopic29Two(testPaper.getTopic29Two()+testPaper.getTopic29Six());
                testPaper.setTopic30Two(testPaper.getTopic30Two()+testPaper.getTopic30Six());
                testPaper.setTopic31Two(testPaper.getTopic31Two()+testPaper.getTopic31Six());
                testPaper.setTopic32Two(testPaper.getTopic32Two()+testPaper.getTopic32Six());
                testPaper.setTopic33Two(testPaper.getTopic33Two()+testPaper.getTopic33Six());
                testPaper.setTopic34Two(testPaper.getTopic34Two()+testPaper.getTopic34Six());
                testPaper.setTopic35Two(testPaper.getTopic35Two()+testPaper.getTopic35Six());
                testPaper.setTopic36Two(testPaper.getTopic36Two()+testPaper.getTopic36Six());
                testPaper.setTopic37Two(testPaper.getTopic37Two()+testPaper.getTopic37Six());
                testPaper.setTopic38Two(testPaper.getTopic38Two()+testPaper.getTopic38Six());
                testPaper.setTopic39Two(testPaper.getTopic39Two()+testPaper.getTopic39Six());
                testPaper.setTopic40Two(testPaper.getTopic40Two()+testPaper.getTopic40Six());
                paperList.add(testPaper);
            }
        }
        return paperList;

    }



    public static String setMark(String disable,String quest){
        String number="0";
        if (disable.contains("不符合")){
            return  number;
        }else{
             number= String.valueOf(EnumerationMap.getFraction(quest));
        }
        return number;
    }

    public static String setSorce(String quest,String three,String two){
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
