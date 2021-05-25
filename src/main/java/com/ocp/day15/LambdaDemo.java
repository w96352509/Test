package com.ocp.day15;
import java.util.stream.Stream;
import java.util.function.Supplier;
public class LambdaDemo {
    public static void main(String[] args) {
    Integer[] radius ={5,-10,15};
    Supplier<Double> supplier = ()->Math.PI;//supplier
    Stream.of(radius)
    .filter(t->t>0)//predicate
    .mapToDouble(t->Math.pow(t,2)*supplier.get())
    .forEach(System.out::println);//consumer
    }
 
}
