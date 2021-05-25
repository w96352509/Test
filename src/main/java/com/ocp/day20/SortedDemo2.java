package com.ocp.day20;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class SortedDemo2 {
    public static void main(String[] args) {
List<Integer> list = Arrays.asList(100,40,80,30,90);     
 //將及各分數排序好的資料放入新的集合
 List<Integer> sortedAndPassList = list.stream()
 .filter(e->e>=60)
//.sorted()//自然排序
//.sorted(Comparator.naturalOrder())//自然排序
//.sorted(Comparator.revweseOrder())//反向排序      
.sorted((o1,o2)->o1-o2)
.collect(toList());//收集進tolist
System.out.println(sortedAndPassList);
 }
    
}
