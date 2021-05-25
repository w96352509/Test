
package com.ocp.day14;

public class MethodInnerClass {
  void foo(){
    final int y = 2 ;
      class Hollo{
          void print(){
              System.out.println(y);    
          }
      }
  }  
}
