package com.ocp.day26;
public class ATM2 {
    public static void main(String[] args) {
Account account = new Account(10000);
Thread t1 = new WithdrawThread(account, 5000);
Thread t2 = new WithdrawThread(account, 4000);
Thread t3 = new WithdrawThread(account, 3000);
t1.setName("小明");
t1.start();
t2.setName("小華");
t2.start();
t3.setName("小英");
t3.start();

//StringBuffer sb,Vector v//多工
//stringBulider sb2//單工   
    }
    
}
