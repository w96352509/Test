package com.ocp.day18;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo2  {
//1~5取三後不放回    
public static void main(String[] args) {
 List<Integer> lotto= new ArrayList<>();
lotto.add(1);
 lotto.add(2);
 lotto.add(3);
 lotto.add(4);
 lotto.add(5);  
 System.out.println(lotto);
 ListIterator <Integer> iter= lotto.listIterator();
while (iter.hasNext()) {
int idx = iter.nextIndex();
   int value=iter.next();
System.out.printf("%d:%d/n",idx,value);
           }
//取出idx=2
int value1=lotto.get(2);
//移出idx=2的元素
lotto.remove(2);
System.out.println(lotto);
//------------------------------
//取出idx=2
int value2=lotto.get(2);
//移出idx=2的元素
lotto.remove(2);
System.out.println(lotto);
//-------------------------
//取出idx=2
int value3=lotto.get(1);
//移出idx=2的元素
lotto.remove(1);
System.out.println(lotto);
System.out.printf("取出的資料:%d %d %d\n",value3,value2,value1);
   



}
   
}
