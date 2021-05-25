package com.ocp.day32;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderNewDemo {
    public static void main(String[] args) {
   String path="src/main/java/com/ocp/day32/data.txt"; 
//FileReader extends InputStreamReader extends Reader implemenrs Closeable Readable 才可放在try()裡
 try(FileReader fr = new FileReader(path)) {
            char[] buffer = new char[1];
            while (fr.read(buffer) != -1) {                
                System.out.print(buffer[0]);
            }
        }  catch (IOException e1) {
            System.out.println(e1);
        } 
    }
}
        
    

