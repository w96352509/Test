package com.ocp.day32;

import java.io.FileReader;
import java.util.Arrays;

public class FileReaderDemo {
 public static void main(String[] args) {
  String path="src/main/java/com/ocp/day32/data.txt";
  FileReader fr =null;
        try {
        fr=new FileReader(path);
        //code here.....   
        char[] buffer = new char[1];//準備一個陣列
         while(fr.read(buffer)!=-1) {                
         System.out.print(buffer[0]);       
            }
//(讀取一個陣列資料,一個位置),會回傳一個1OR-1的int
                        //-1是空buffer的回傳
        
        System.out.println(Arrays.toString(buffer));
        
        } catch (Exception e1) {
            System.out.println(e1);
        }finally{
            if (fr!=null) {
             try {
             fr.close();
                } catch (Exception e2) {
             System.out.println(e2);
                }
   
            }
   
        }
    
    }
    
}
