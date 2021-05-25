package com.ocp.day29;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
/*
if{
f(0)=0
f(1)=1
}
f(n)=f(n-1)+f(n-2)
*/
class Fibonacci extends  RecursiveTask<Integer>{
final  int n ;//有一次性的給值,因可以建構子

public Fibonacci(int n) {
   this.n = n;
    }
@Override
    protected Integer compute() {
    if (n<=1) {
     return n;
    }
    //建立方法物件(將N分解(fork)成f1,f2)
    Fibonacci f1 = new Fibonacci(n-1);
    f1.fork();
    Fibonacci f2 = new Fibonacci(n-2);
    f2.fork();
    return f1.join()+f2.join();//合併f1,f2
    }
    
}
public class ForkJoinFibonacci {//(費氏數列)
public static void main(String[] args) {
    ForkJoinPool pool = new ForkJoinPool(4);
    //0,1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233
//F(n)0,1, 2, 3, 4, 5, 6, 7,  8,  9, 10 
    int result= pool.invoke(new Fibonacci(10));
    System.out.println(result);
}
    
}
