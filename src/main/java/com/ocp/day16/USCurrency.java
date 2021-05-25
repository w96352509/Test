package com.ocp.day16;
//Penny1,Nicle5,Dime10,Quarter25
public enum USCurrency {
Penny(1),Nicle(5),Dime(10),Quarter(25);    
 private  int  value;
private USCurrency(int value) {
  this.value = value;
  }
public int getValue(){
return value;
}

}
