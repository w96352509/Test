
package com.ocp.day32;

import java.io.FileWriter;
//網路概論
public class FileWriterNewDemo {
    public static void main(String[] args) {
   String path="src/main/java/com/ocp/day32/data.txt"; 
   //FileWriter OutputStreamWriter Writer Closeable
try(FileWriter fw = new FileWriter(path,true)) {//關掉你鎖定的檔案(用完path後切斷連結)
                              //  true保留原資料並加上
                              //flase 清除原資料
           fw.write("Hello"); // 寫入資料
            System.out.println("寫入成功 !");
        } catch (Exception e) {
        }
    }
   
   
}
