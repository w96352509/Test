
package com.ocp.day22;

public class MyFood {
    public static void main(String[] args) {
try {
checkFood("炸機");
} catch (BadFoodException e) {
System.out.println(e.getMessage());   
 }
 }
public static void checkFood(String s) throws  BadFoodException{
String[] badFoods={"炸機","可樂","薯條"};
for(String bad:badFoods){
if(s.equals(bad)){
String errorMsg = bad+"垃圾食物";
BadFoodException e= new BadFoodException(errorMsg);
throw e;
   } 
  }
System.out.println(s+"不是垃圾食物");
  }
}
