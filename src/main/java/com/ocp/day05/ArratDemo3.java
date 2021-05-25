package com.ocp.day05;

import java.util.Arrays;
import java.util.stream.IntStream;
public class ArratDemo3 {
    public static void main(String[] args) {
     // 全班有6個人此次考數學的成績列表
int[] scores1 = {81, 90, 90, 100, 40, 50};
System.out.printf("數學: %s\n", Arrays.toString(scores1));
int sum =IntStream.of(scores1).sum();
double avg =IntStream.of(scores1).average().getAsDouble();
System.out.printf("總分:%d\n",sum); 
System.out.printf("平均:%.1f\n",avg);

//IntStream串流
//請問及格的總分與平均
//java 7
sum =0 ; 

for(int x :scores1)
{
    if(x>=60)
    {
        sum += x ;         
    }
}
System.out.printf("及格的總分:%d\n",sum);
  //java8 filter過濾
  sum = IntStream.of(scores1).filter(x-> x >=60).sum();
  System.out.printf("及格的總分:%d\n",sum);      
  avg = IntStream.of(scores1).filter(x-> x >=60).average()//得到平均
          .getAsDouble(); //取得平均double的資料    
  System.out.printf("及格的總分:%.1f\n",avg);     
        
    }
   
}
