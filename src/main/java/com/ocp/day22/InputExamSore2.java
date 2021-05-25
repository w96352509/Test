package com.ocp.day22;
public class InputExamSore2 {
public static void main(String[] args) {
   int score=90;
    try {
    chake(score);
    } catch (ScoreRangeException e) {
      System.out.println("score: "+score+"錯誤原因:"+e.getMessage());
      e.怎麼辦();
    }
}
 public static void chake(int score) throws ScoreRangeException{
     //檢驗參數
     if(score<0 || score>100){
ScoreRangeException e = new ScoreRangeException(score);
     throw  e ;
     }
      if(score>=60){
          System.out.println("Pass");  
      }else{
       System.out.println("Fail");   
      }  
    }
    
}
