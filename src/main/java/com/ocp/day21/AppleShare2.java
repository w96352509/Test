package com.ocp.day21;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AppleShare2 {
 public static void main(String[] args) {
 int n=0;//人數
     try {   
    submit(n);
     } catch (Exception e) {
         System.out.println(e.getMessage());
         System.out.println(e.getLocalizedMessage());
         e.printStackTrace(System.out);//印出詳細錯誤資料
     }
}
public static void submit(int n)throws Exception{//n人數
if(n<=0){
Exception e  = new Exception("n<=0");
throw e ;
}
  int apple =10;
  int result = 0;
 result = apple / n;
 System.out.println(result);
}//throws Exception 上接 try catch
}
