package com.ocp.day30;

import java.util.stream.IntStream;

public class ParallelRxample1 {
    public static void main(String[] args) {
    IntStream range = IntStream.rangeClosed(1, 10);//包含10
    range.forEach(System.out::println);
    
    System.out.println("Parallel");//平行互相不干擾
    IntStream range2 = IntStream.rangeClosed(1, 10);//包含10
    range2.parallel().forEach(System.out::println);
    }
    
}
