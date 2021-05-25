
package com.ocp.day24;
//要給執行緒的工作任務:Programming
public class Report implements Runnable{
@Override
public void run() {//寫報表
String tname = Thread.currentThread().getName();
System.out.println(tname+"寫報表"); 
 }
    
}
