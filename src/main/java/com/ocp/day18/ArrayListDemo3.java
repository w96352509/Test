package com.ocp.day18;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class ArrayListDemo3 {
//1~5取三後不放回    
public static void main(String[] args) {
 List<Integer> lotto= new ArrayList<>();
 lotto.add(1);
 lotto.add(2);
 lotto.add(3);
 lotto.add(4);
 lotto.add(5);  
 //存放所選取的號碼
 Set<Integer> ans = new LinkedHashSet<>();
 System.out.println(lotto);
 Random r = new Random();
 for(int i =0;i<3;i++){
  int idx= r.nextInt(lotto.size());
  int vaule = lotto.get(idx);
  lotto.remove(idx);
 ans.add(vaule);
}
    System.out.println(lotto);
    System.out.println(ans);
}
}
