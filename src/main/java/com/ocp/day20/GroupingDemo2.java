package com.ocp.day20;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;

public class GroupingDemo2 {
public static void main(String[] args) {
List<String> sex =Arrays.asList("男","女","男","女","男","女","男","女");
//請問男女各有多少
Map<String,Long> names = sex.stream()
.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
System.out.println(names);
List<Integer> score =Arrays.asList(100,30,80,40,90);
//及格與不及格
Map<String,Long>  score1  =  score.stream()
.collect(Collectors.groupingBy(e->e>=60?"及格":"非及格",Collectors.counting()));
System.out.println(score1);
//

    }
   
}
