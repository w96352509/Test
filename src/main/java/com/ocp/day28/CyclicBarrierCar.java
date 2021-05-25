package com.ocp.day28;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierCar {
public static void main(String[] args) {
 int n =4;//車子的數量 (parties值)      
//通常不會建立兩個CB在同一規則裡
Runnable r = () -> {
String tname = Thread.currentThread().getName();
 System.out.printf("%s開動吃飯!\n",tname);
try {
Thread.sleep(2000);
  } catch (Exception e) {
  }
 };                                //n給定數量的執行續
 CyclicBarrier cb =new CyclicBarrier(n,r);//建構子public CyclicBarrier(int parties, Runnable barrierAction) 
 new Car(cb).start();//0
 new Car(cb).start();//1
 new Car(cb).start();//2
 new Car(cb).start();//3
 



}
   
}
