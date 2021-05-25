package com.lab.rice;

import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.Callable;
//Callable可有回傳直,可拋例外
//負責抓取json的網址設定
public class RiceJsonThread implements Callable<String>{
private String path;//網址路徑
 public RiceJsonThread(String path) {
this.path = path;
    }
 @Override                                   
  public String call() throws Exception {
   URL url = new URL(path);//建立URL物件
InputStreamReader isr = new InputStreamReader(url.openStream(), "utf-8");
 String json = new Scanner(isr)
                .useDelimiter("\\A")
                .next();
        return json;
        // \A 這個 pattern 代表的是全部選擇
        // 透過 Scanner 可以將網路串流(openStream())變成字串
        // 利用 InputStreamReader 將中文編碼(UTF-8)
    }
    
}
