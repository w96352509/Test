package com.ocp.day28;

import java.util.concurrent.CyclicBarrier;

class Work extends Thread{
 CyclicBarrier  cb;//建立循環物件
public Work(CyclicBarrier cb) {
   this.cb = cb;
    }

    @Override
    public void run() {
        try {
       cb.await(); //在所有參與者都已經在此 barrier上調用await方法之前，將一直等待。
        System.out.println("Work");
        } catch (Exception e) {
        }
   }
}
class  Master implements Runnable{

    @Override
    public void run() {
    System.out.println("Master");
    }
    }


public class 考題1 {
public static void main(String[] args) {
Master master = new Master();//new master方法
CyclicBarrier cb = new CyclicBarrier(1,master);
//Start判斷有幾個執行續
//建立一個新的 CyclicBarrier,當執行緒為1時,最後一個到執行master方法
//並在啟動 barrier 時執行給定的屏障操作，該操作由最後一個進入 barrier 的執行緒執行
 Work work = new Work(cb);
 //會卡在wait()等待所有的參與者->執行到master->參與者到齊可執行
 
    work.start();
    }
    
}
