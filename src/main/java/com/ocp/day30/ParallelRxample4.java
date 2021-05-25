package com.ocp.day30;

import java.util.stream.Stream;
public class ParallelRxample4 {
   public static void main(String[] args) {
   long count= Stream.iterate(0, n ->n+1)
           .limit(10)//最多顯示
           .filter(x-> x%3==0&&x%5!=0)
          .peek(x->System.out.println(x))
           .count();
       System.out.println("count:"+count);
    }   
}
