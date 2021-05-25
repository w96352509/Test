package com.ocp.day25;
public class WorkTread extends Thread{
 @Override
    public void run() {
     String tname = Thread.currentThread().getName();
    for(int i =1000;i>0;i--){
    System.out.printf("%d:%s\n",i,tname);      
    }
    }
    public static void main(String[] args) {
    WorkTread wt1 = new WorkTread();
    WorkTread wt2 = new WorkTread();
    wt1.setName("T1");
    wt2.setName("T2");
    wt1.setPriority(Thread.MAX_PRIORITY);//全種:10
    wt1.setPriority(Thread.MIN_PRIORITY);//全種:1
    wt2.setDaemon(true);//背景
    wt1.start();
    wt2.start();
    System.out.println(Thread.activeCount());//活著的執行緒包含(主執行緒)
    }
   
}
