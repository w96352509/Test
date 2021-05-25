package com.ocp.day29;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
/*
1+2+3 0~3
4+5+6 3~6
7+8+9 6~9 
10    10
*/

class Sum extends RecursiveAction {
static  final int THR =3;
int stlndex;
int lstindex ;
int[] data;
public Sum(int[] data,int start, int end ) {
    this.data = data;    
    this.stlndex = start;
    this.lstindex = end;
        
}
@Override
 protected void compute() {
 int sum=0;
 if(lstindex-stlndex<=THR){
 for(int i=stlndex;i<lstindex;i++){
  sum+=data[i];
  } 
System.out.println(sum);  
 }else{                                                         
new Sum(data, stlndex+THR, lstindex).fork();//0~10->3~10->6~10->     9~10 = numbers[9]=10
                                             //0~9->3~9->             6~9=number[6,7,8]=7,8,9              
                                             //0~6->                  3~6=number[3,4,5]=4,5,6
                                             //                       0~3=number[0,1,2]=1,2,3
new Sum(data, stlndex,Math.min(lstindex, stlndex+THR)).compute();
//為了符合上演算法取質                         compute()取計算後得質    
                                             //9~10 -> 9(10-12)-> 9 =10
                                             //6~9 ->  6(9-12)->6~9 =24           
                                             //3~6 -> 3(6-9)->3~6=15
                                             //0~3 -> 0(3-6)->0~3   =6    順序下往上            
 }
}
}

public class 題目1 {
public static void main(String[] args) {
    ForkJoinPool pool = new ForkJoinPool();
   
    int data[]={1,2,3,4,5,6,7,8,9,10};
    pool.invoke(new Sum(data,0,data.length));
    }
  }
