package cn.vo.util;

import java.util.HashMap;
import java.util.Map;

public class SourceMap {

    public static Integer getFraction(String que){
        Map<String,Integer> map = new HashMap();
        map.put("th1",6);
        map.put("th2",6);
        map.put("th3",4);
        map.put("th4",6);
        map.put("th5",6);
        map.put("th6",6);
        map.put("th7",4);
        map.put("th8",4);
        map.put("th9",5);
        map.put("th10",6);
        map.put("th11",4);
        map.put("th12",4);
        map.put("th13",5);
        map.put("th14",6);
        map.put("th15",4);
        map.put("th16",6);
        map.put("th17",4);
        map.put("th18",5);
        map.put("th19",3);
        map.put("th20",6);
        return map.get(que);
    }
}
