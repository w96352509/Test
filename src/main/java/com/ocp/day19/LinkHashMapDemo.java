package com.ocp.day19;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkHashMapDemo {
    public static void main(String[] args) {
 Map<String,Integer> exams = new LinkedHashMap<>();
 exams.put("國文",100);
 exams.put("數學",90);
 exams.put("英文",90);

    //取得科目
 Set<String> keys = exams.keySet();
 System.out.println(keys);
        //數學
  System.out.println(exams.get("數學"));  
    //所有分數
Collection<Integer>scores=exams.values();
System.out.println(scores);
    }
    
}