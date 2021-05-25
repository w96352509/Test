package com.ocp.day21;
public class AppleShare {
 public static void main(String[] args) {
 int n=0;//人數
     try {
     submit(n);   
     } catch (ArithmeticException e) {
    System.out.println("錯誤原因"+e.getLocalizedMessage());
         System.out.println("錯誤原因"+e.getMessage());//錯誤原因    
     }
 
 }
public static  void submit(int n ){//n人數
if(n<=0){
ArithmeticException e  = new ArithmeticException("n<=0");
throw e ;
}
  int apple =10;
  int result = 0;
 result = apple / n;
 System.out.println(result);
}
}
