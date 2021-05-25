
package com.ocp.day14;

public class Dept { //主管
String  name= "軟體部門";
    class Job { //員工
 void work(){
     String  name = "寫程式";
     System.out.println(name);
      System.out.println(Dept.this.name);
 }



     
 }
}
