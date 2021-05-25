
package com.ocp.day26;
//帳戶資源
public class Account {
//輸入帳戶餘額 
  private int balance;
public Account(int balance) {
  this.balance = balance;
 }
public  synchronized void setBalance(int amount){
balance= balance-amount;
}
//查詢帳戶餘額
public int getBalance(){
return  balance;
}
 //提款方法 , amount表示提款金額
public synchronized void withdeaw(int amount){
String tname = Thread.currentThread().getName();
System.out.printf("%s準備提款$%d\n",tname,amount);
//檢查帳戶餘額
//1.先取得目前的帳戶(currentBalance)餘額
int currentBalance = getBalance();
//2.目前帳戶餘額是否足夠提款  
if (currentBalance>=amount) {
   //開始提款
   //利用for -loop模擬(提款所花的時間)
  for(int i =0;i<Integer.MAX_VALUE;i++);//空實作
    //變更帳戶餘額
    //帳戶餘額=目前帳戶餘額-提款金額
   setBalance(amount);  
//balance= currentBalance-amount;
    //印出交易清單
    System.out.printf("%s提款$%d成功,帳戶餘額%d\n",tname,amount,getBalance());
}else{
 System.out.printf("%s提款$%d 失敗,帳戶餘額%d\n",tname,amount,getBalance());   
}


}
}


