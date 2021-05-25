package com.ocp.day32;

import java.io.File;

public class CreateFileDemo {
public static void main(String[] args) {
String path="src\\main\\java\\com\\ocp\\day32";//路徑保留src後
String name = "data.txt";//檔案名稱
String pathAddName = path+File.separator+name;//File.separator目錄檔案的分隔符號
 File file = new File(pathAddName);//建立一個檔案
 System.out.printf("%s是否存在? %b\n",pathAddName,file.exists());
 //若不存在就建立新檔   
   if(!file.exists()){
 System.out.println("建立檔案:");
    try {
boolean success=file.createNewFile();//createNewFile回傳布林值   
 } catch (Exception e) {
 System.out.println(e);
       }
    
   }

    }
    
}
