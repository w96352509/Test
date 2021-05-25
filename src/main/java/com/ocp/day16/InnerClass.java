package com.ocp.day16;
public class InnerClass {
  int x= 100;
  static int sx =200;
 //一般內部類別
 class MyInner{
  void print(){
   System.out.println("MyInner");
   System.out.println(InnerClass.this.x);//this內個物件
   System.out.println(InnerClass.sx);
   MyStaticInner.print();
  }   
 }
    
 //靜態內部類別無this
static class MyStaticInner{
    static void print(){
   System.out.println("MyStaticInner");
   System.out.println(InnerClass.sx);
  }   
}
//主程式
public static void main(String[] args) {
   InnerClass.MyInner m1 = new InnerClass().new MyInner();
   m1.print();
   InnerClass.MyStaticInner msi = new InnerClass.MyStaticInner();
   msi.print();
    }
}
    


