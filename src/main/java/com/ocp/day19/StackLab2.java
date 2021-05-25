package com.ocp.day19;

import java.util.Scanner;
import java.util.Stack;

public class StackLab2 {
public static void main(String[] args) {
Stack<String> str = new Stack<>();
Scanner sc = new Scanner(System.in);
System.out.println("輸入");
for(int i =0;i<4;i++){
 str.push(sc.next());
}
System.out.print(str);
while (!str.isEmpty()) {            
System.out.print(str.pop());
  }
 }   
}
