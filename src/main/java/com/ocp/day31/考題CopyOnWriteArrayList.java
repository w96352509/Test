package com.ocp.day31;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

public class 考題CopyOnWriteArrayList {
public static void main(String[] args) {
final List<String> list = new CopyOnWriteArrayList<>();
final AtomicInteger ai = new AtomicInteger(0);
final CyclicBarrier barrier = new CyclicBarrier(2,new Runnable() {
@Override
 public void run() {
 System.out.println(list);//印出 CopyOnWriteArrayList  
    }
});
Runnable r = new Runnable(){
 @Override
 public void run() {
  try {
 Thread.sleep(1000*ai.incrementAndGet());//++0
 list.add("X");
 barrier.await();//1.[X]2.[X,X][X]到達條件後執行Runnable()->[X,X][X,+X]
 //3[X,X][X,+X,+X]4[X,X][X,+X,+X,+X]
     } catch (Exception e) {
     }
}
};
new Thread(r).start();
new Thread(r).start();
new Thread(r).start();
new Thread(r).start();
}
    
}
