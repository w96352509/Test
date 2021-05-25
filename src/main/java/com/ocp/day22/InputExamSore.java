package com.ocp.day22;
public class InputExamSore {
public static void main(String[] args) {
   int score=90;
    try {
        chake(score);
    } catch (Exception e) {
      System.out.println("score: "+score+"錯誤原因:"+e.getMessage());
    }
}
 public static void chake(int score) throws Exception{
     //檢驗參數
     if(score<0 || score>100){
Exception e = new Exception("分數必須介於0到100之間");
     throw  e ;
     }
      if(score>=60){
          System.out.println("Pass");  
      }else{
       System.out.println("Fail");   
      }  
    }
    
}
