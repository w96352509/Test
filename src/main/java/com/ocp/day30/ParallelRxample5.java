package com.ocp.day30;

import java.util.stream.IntStream;
import java.util.stream.Stream;
public class ParallelRxample5 {
   public static void main(String[] args) {
   long count=Stream.iterate(0, n -> n+1)
           .limit(100)
           .filter(ParallelRxample5::isPrime)
           .peek(x -> System.out.println(x))
           .count();
       System.out.println(count);
           
    }  
   public  static  boolean isPrime(int x){
    if(x<=1)return false;//        //每個值
   return !IntStream.rangeClosed(2, (int)Math.sqrt((double)x)).anyMatch(i -> x%i == 0);//質數
   }
}
