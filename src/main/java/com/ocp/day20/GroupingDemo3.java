package com.ocp.day20;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupingDemo3 {
    public static void main(String[] args) {
 List<Fruit> fruits =Arrays.asList(
new Fruit("apple",10,9.9),
new Fruit("banana",20,19.9),
new Fruit("orange",10,29.9),
new Fruit("watermelon",10,29.9),
new Fruit("papaya",20,9.9),
new Fruit("apple",10,9.9),
new Fruit("banana",10,19.9),
new Fruit("apple",20,9.9)
 );
 //根據price求分組
 Map<Double,List<Fruit>> groupingPrice=fruits.stream()
.collect(Collectors.groupingBy(Fruit::getPrice));
 System.out.println(groupingPrice);
 //相同的price是哪些水果名
Map<Double,List<String>> groupingPrice2=fruits.stream()
.collect(Collectors.groupingBy(Fruit::getPrice,Collectors.mapping(Fruit::getName,Collectors.toList()
)));
 System.out.println(groupingPrice2);
 Map<Double,Set<String>> groupingPrice3=fruits.stream()
.collect(Collectors.groupingBy(Fruit::getPrice,Collectors.mapping(Fruit::getName,Collectors.toSet()
)));
System.out.println(groupingPrice3);
    }
   }
