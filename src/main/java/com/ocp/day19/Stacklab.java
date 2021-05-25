  
package com.ocp.day19;

import java.util.Stack;

public class Stacklab {
    public static void main(String[] args) {
String s = "java";
char[] array = s.toCharArray();
Stack<Character> stack = new Stack<>();
for(char c : array) {
stack.push(c);
        }
        while (!stack.isEmpty()) {            
            System.out.print(stack.pop());
        }
    }
}