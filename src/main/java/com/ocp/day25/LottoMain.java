
package com.ocp.day25;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class LottoMain {
public static void main(String[] args) {
FutureTask<Integer> task =new FutureTask<>(new Lotto());//FutureTask幫Callable取直
new Thread(task).start();
System.out.println("計算中");
 try {
   System.out.println(task.get());     
    } catch (InterruptedException ex) {
        
    }catch (ExecutionException ex){

    }
System.out.println("結束");
    
}
}
