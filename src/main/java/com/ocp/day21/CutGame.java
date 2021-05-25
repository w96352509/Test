package com.ocp.day21;

import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
請撰寫一支程式,需由鍵盤輸入一個整數,用來表示繩子的程度(單位:公尺)
如果每天減去一半的長度,要花費幾天的時間,長度會短於五公尺
繩子有1000與99這兩條
*/
public class CutGame {
static int b = 0; 
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("輸入繩子長度");
int rope =0;
try {
rope=sc.nextInt();
 } catch (InputMismatchException e) {
System.out.println("長度重新輸入"+e);
    main(args);
}
    if (rope>=5) {
     while(rope>=5){
      b++;
      rope/=2;
}  
  System.out.println("b:"+b);
    }
 
 }
    
}
