package com.ocp.day18;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
public class Lotto539 {//1~39取五
 //樂透539電腦選號
    public static void main(String[] args) {
    Random r = new Random(); 
Set<Integer> lotto = new LinkedHashSet<>();
while (lotto.size()<5) {            
    int n = r.nextInt(39)+1;//0+1-38+1
    System.out.printf("n=%d\n",n);
    lotto.add(n); //加到集合    
  }
System.out.println(lotto);
System.out.println(lotto.size());
 }
   
}
