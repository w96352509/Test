package com.ocp.day30;

import java.util.stream.IntStream;
/*
.sequential()預設單工
.parallel()平行多工
*/
public class ParallelRxample2 {
   public static void main(String[] args) {
    System.out.println("Normal");//sequential()喚回普通方法
    IntStream range = IntStream.rangeClosed(1, 10);//包含10
    range.forEach(System.out::println);
    
    System.out.println("Parallel");//平行互相不干擾
    IntStream range2 = IntStream.rangeClosed(1, 10).parallel();//包含10
    range2.forEach(System.out::println);
    }   
}
