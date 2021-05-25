package com.ocp.day22;
public class propagating {
public static void main(String[] args) {
    try {
     System.out.println(revers("Hellow"));
    } catch (Exception e)
    {System.out.println(e.getMessage());
    }finally{
    System.out.println("All done");    
    }
  
 }
 public static String revers(String s) throws Exception {
 
if(s.length()==0){
  Exception e = new Exception();
 throw e;
}
String reverseStr = "";
for(int i =s.length()-1;i>=0;--i){
reverseStr +=s.charAt(i);
}  
return reverseStr; 
 }
   }
