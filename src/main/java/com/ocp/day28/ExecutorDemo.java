package com.ocp.day28;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.Executor;
class MyExecutor implements Executor{
@Override
public void execute(Runnable command) {
  new Thread(command).start();
}
 }
public class ExecutorDemo {
public static void main(String[] args) {
Runnable r1 = () -> System.out.println(new Date());//取得現在時間
Runnable r2 = () -> System.out.println(new Random().nextInt(100));
MyExecutor exec=new MyExecutor();
exec.execute(r1);
exec.execute(r2);

//java8 MyExecutor  不需要建立Class
Executor exec2 = (command)->new Thread(command).start();
exec2.execute(r2);
exec.execute(r1);
exec.execute(()->System.out.println("停"));
}
   
}
