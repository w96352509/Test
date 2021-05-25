package com.ocp.day17;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
    Set set = new LinkedHashSet();
    set.add("國文");
    set.add(100);
    set.add("英文");
    set.add(90);
    set.add("數學");
    set.add(80);
    set.add(null);
    System.out.println(set);
    System.out.println(set.size());
    set.remove(null);//remove移除
    System.out.println(set);
    //走訪元素
    Iterator iter = set.iterator();
        while (iter.hasNext()) {
            Object next = iter.next();
            System.out.println(next);
        }
    iter= set.iterator();//二次呼叫
        while (iter.hasNext()) {
            Object next = iter.next();
            System.out.println(next);
        }
        //印出科目
   
        iter= set.iterator();
        while (iter.hasNext()) {
        Object next = iter.next();
        if(next instanceof String){
         System.out.println(next);    
        }
               }
        //計算總分
        //java7
        int sum =0 ;
        iter= set.iterator();
        while (iter.hasNext()) {
        Object next = iter.next();
        if(next instanceof Integer){
        sum +=(Integer)next;
                }
        }    
      System.out.println(sum);  
      //java8
  int sum2= set.stream().
  filter(s->s instanceof Integer).
  mapToInt(s->Integer.parseInt(s.toString())).
  sum();
              
   System.out.println(sum2);        
       // Java 8
        int sum3 = set.stream()
                .filter(s -> s instanceof Integer)
                //.mapToInt(s -> ((Integer)s).intValue())
                .mapToInt(s -> (Integer)s)//轉型
                .sum();
        System.out.println(sum3);        
      
    }
}
