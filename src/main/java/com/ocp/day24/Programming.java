
package com.ocp.day24;
//要給執行緒的工作任務:Programming
public class Programming implements Runnable{
 @Override
public void run() {//寫程式的工作
 String tname = Thread.currentThread().getName();
System.out.println(tname+"寫Java程式"); 

 }
    
}
