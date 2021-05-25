package com.ocp.day28;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Lotto implements  Callable<Integer>{
@Override
    public Integer call() throws Exception {
     Thread.sleep(new Random().nextInt(1000));
     return new Random().nextInt(100);
    }
}
public class ThreadPoolExecutorDemo {
public static void main(String[] args) throws Exception{
    System.out.println("請給我Lotto數字");
    ExecutorService service =Executors.newCachedThreadPool();//單一執行緒只用一條下去做
    for(int i=1;i<=3;i++){
        System.out.printf("第%d組 計算中",i);
        Future future =service.submit(new Lotto());
        System.out.println(future.get());
    }
    
    }
    
}
