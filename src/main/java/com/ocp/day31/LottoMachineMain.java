package com.ocp.day31;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class LottoMachineMain {
public static void main(String[] args) throws InterruptedException {
    System.out.println("開獎");
    ExecutorService service= Executors.newCachedThreadPool();
    Collection<Callable<Lotto>>list = new ArrayList<>();//放入以下新增
    list.add(new LottoMachine(1));
    list.add(new LottoMachine(2));
    list.add(new LottoMachine(3));
    list.add(new LottoMachine(4));
    list.add(new LottoMachine(5));
    System.out.println("開始搖獎");
    List<Future<Lotto>> result = service.invokeAll(list);//這個List放入所有Callable的回傳
   //java8 List直接給forEach的特權                           //要等全都到再全做
    System.out.println("唱名獎號");
    result.forEach(f ->{try {
           System.out.println(f.get()); 
        } catch (Exception e) {
        }
});
    service.shutdown();
}
    
}
