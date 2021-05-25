package com.ocp.day28;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
class CallerThread implements Callable<String>{
 String str;
public CallerThread(String str) {
        this.str = str;
}
@Override
public String call() throws Exception {
return str.concat("Call");
 }
}
public class 考題2 {
public static void main(String[] args) throws Exception{
 ExecutorService service = Executors.newFixedThreadPool(4);//固定4個執行續空間
 Future f1 = service.submit(new CallerThread("Call"));//submit將callable方法丟入,submit回傳一個Future
 String str = f1.get().toString();//取得Future內容顯示
 System.out.println(str);
}
    
}
