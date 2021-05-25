
package com.ocp.day24;
                //變成子執行緒物件
public class Race extends  Thread{
 @Override//不可小於原方法
 //最大
 public void run(){
 job();
    }
private void job(){
   //執行敘名稱 
 String tname = Thread.currentThread().getName();
for(int i= 1;i<=1000;i++){
if (tname.equals("程咬金")&&i <=200&&i>600) 
continue;
System.out.printf("%s跑了%d步\n",tname,i);      
    }
}
}
