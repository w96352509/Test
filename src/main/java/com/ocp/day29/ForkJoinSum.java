package com.ocp.day29;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class SumTask extends RecursiveTask<Long>{
private long [] numbers;//主資料1~10
private int from;//0~5 0=from
private int to;//5=to
 public SumTask(long[] numbers, int from, int to) {
 this.numbers = numbers;
this.from = from;
this.to = to;
    }
 @Override
protected Long compute() {//演算法部分
//當資料數量<=3才回計算
long total =0;
if(to-from<=3){
for(int i=from;i<to;i++){
 total+=numbers[i];  
 //System.out.printf("SumTask: from: %d to: %d -> %s\n",
 // from, to, Thread.currentThread().getName()
 }
 System.out.printf("from:%d ,to:%d,total:%d\n",from,to,total);
 return total;
}else{//將任務一分為二
    int middle=(from+to)/2; 
    System.out.printf("Left from: %d, to: %d\n", from, middle);
    SumTask taskLeft = new SumTask(numbers,from,middle);
    System.out.printf("Right from: %d, to: %d\n", middle, to);
    SumTask taskRight = new SumTask(numbers,middle,to);
 //拆分
    taskLeft.fork();
    taskRight.fork();
    //拆分後join合併
    return taskRight.join()+taskLeft.join();
}
}
    
}

public class ForkJoinSum {
 public static void main(String[] args) {
long[] numbers = {1,2,3,4,5,6,7,8,9,10};
System.out.println(Arrays.toString(numbers));
     ForkJoinPool pool = new ForkJoinPool(4);//CPU數
     int from=0 ,to=numbers.length;//預設起始結尾
     long result=pool.invoke(new SumTask(numbers,from, to));//把數字丟入方法
     System.out.println(result);
    }
   
}
