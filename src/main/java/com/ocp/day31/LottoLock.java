package com.ocp.day31;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

public class LottoLock implements Runnable{
private String userName;
private  static  final ReentrantLock LOCK = new ReentrantLock();//取得ReentrantLock()
 public LottoLock(String userName) {
 this.userName = userName;
}
@Override
public void run() {
try {
LOCK.lock();//嘗試鎖定(如鎖定不了則拋出例外)
IntStream.rangeClosed(1, 5).forEach(i ->{
try {
      Thread.sleep(3000);    
} catch (Exception e) {
    }
 int number = new Random().nextInt(10);
    System.out.printf("%s得到第%d組號碼:%d,時間%s\n"
            ,userName,i,number,new Date().toString());
});
    } catch (Exception e) {
    
    }finally{
    LOCK.unlock();//結束鎖定
}
       }
//Main
public static void main(String[] args) {
ExecutorService service=Executors.newCachedThreadPool();
service.execute(new LottoLock("Vincent"));
service.execute(new LottoLock("Anita"));
service.shutdown();
    }



}



