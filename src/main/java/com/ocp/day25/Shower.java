package com.ocp.day25;
class Father extends  Thread{
 public void run(){
System.out.println("爸爸下班回家");
System.out.println("爸爸準備洗澡");
System.out.println("爸爸發現沒熱水"); 
System.out.println("爸爸請瓦斯工人送瓦斯");
Worker worker = new Worker();//爸爸呼叫工人
worker.start();//爸爸要去請動工人執行緒
//for(int i =1;i<=100000;i++){//讓出次數
//Thread.yield();//爸爸讓出時間    
//}
try {
     worker.join(6000);//6秒最多等的時間,要在Try內
     } catch (InterruptedException e) {
     }
System.out.println("開始洗澡");
System.out.println("爸爸洗完澡了");
 }
}
class Worker extends Thread{
 public void run(){
System.out.println("瓦斯工人準備送瓦斯");
for(int i =1;i<=10;i++){
    try {
System.out.println(i+"秒鐘");
Thread.sleep(1000);//須放在Try裡
    } catch (InterruptedException e) {
System.out.println("工人發生意外"+e);        
    }
}
 System.out.println("送達");
 }
}
public class Shower {
    public static void main(String[] args) {
    Father father = new Father();
    father.start();
            
    }
 
}
