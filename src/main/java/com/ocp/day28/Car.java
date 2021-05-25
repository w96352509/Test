package com.ocp.day28;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class Car  extends Thread{
private  CyclicBarrier cb; //建立循環物件
public Car(CyclicBarrier cb) {
        this.cb = cb;
    }
@Override
public void run() {
String tname=Thread.currentThread().getName();    
System.out.printf("%s從台北出發\n",tname);
try { 
  Thread.sleep(new Random().nextInt(5000));//每人到達時間不同
  System.out.printf("%s到台中\n",tname);
  cb.await();
  //cb.await(10, TimeUnit.SECONDS);設定時間
    } catch (Exception e) {
    }
    System.out.printf("%s繼續往高雄出發\n",tname);
    }
    
    
}
