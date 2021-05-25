
package com.lab.decorator;

public class SubWay {
    public static void main(String[] args) {
     Food food = new Bread();
     food = new Hum(food);
     food = new Lettuce(food);
     food = new Oilves(food);
     food = new Tomato(food);
     food = new Tomato(food);
     food = new Tuna(food);
     food = new Tuna(food);
     food = new Tuna(food);
     food = new Onion(food);
     food = new Onion(food);
    System.out.printf("商品:%s\n總價:%d元\n",food.getName(),food.getPrice());
    }
}
