package com.ocp.day20;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class SortedDemo3 {
    public static void main(String[] args) {
List<User> users = Arrays.asList(
   new User("A",100),
   new User("B",40), 
   new User("C",80), 
   new User("D",30),
   new User("E",90)
    );
System.out.println(users);  
//分數按照大小置入一個新集合中
List<User> reversedUsers = users.stream()
.sorted((u1,u2)->u2.getScore()-u1.getScore())
.collect(toList());
System.out.println(reversedUsers);
//分數按照小到大置入一個新集合中
List<User> sortedUsers = users.stream()
//.sorted(Comparator.comparingInt(u->u.getScore()))
//sorted(Comparator.comparingInt(User::getScore))
.sorted(Comparator.comparingInt(User::getScore).
        reversed())
.collect(toList());
System.out.println(sortedUsers);
    }
}