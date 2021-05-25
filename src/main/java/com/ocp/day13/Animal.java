package com.ocp.day13;

public interface Animal {
    void move() ;
   default void eat() {    //介面預設方法實作
   System.out.println("吃罐頭食品"); 
   }
}
