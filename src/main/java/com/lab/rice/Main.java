package com.lab.rice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
public static void main(String[] args) {
Rice[] rices  =Util.getRices();
Rice[] rices2 = Util2.getRices();
List<Rice[]> list= new ArrayList<>();
list.add(rices);
list.add(rices2);
list.stream().flatMap(m -> Arrays.stream(m)).filter(f -> f.get品名().contains("壽司米"))
 .forEach(System.out::print);






        
    }

    public Main() {
    }
}
