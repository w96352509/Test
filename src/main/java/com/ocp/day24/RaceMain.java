package com.ocp.day24;
public class RaceMain {
public static void main(String[] args) {
Race race = new Race();
Race race2 = new Race();
Race race3 = new Race();
race3.setName("程咬金");//200~600可看到
race.setName("烏龜");
race2.setName("兔子");
//設定權限(預設=5,範圍1~10)=11次的呼叫
race.setPriority(10);//調整被呼叫機率
race2.setPriority(1);
//執行緒啟動
race.start();//不可用Run
race2.start();
race3.start();

    }
   
}
