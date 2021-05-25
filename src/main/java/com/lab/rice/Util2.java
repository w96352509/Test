
package com.lab.rice;

import com.google.gson.Gson;
import java.util.concurrent.FutureTask;

public class Util2 {
    public static Rice[] getRices() {
        // 不合格
String path = "https://data.coa.gov.tw/Service/OpenData/FromM/AgricultureiRiceFailure.aspx";
RiceJsonThread r1 = new RiceJsonThread(path);
FutureTask<String> task = new FutureTask<>(r1);
 new Thread(task).start();
   try {
            String json2 = task.get();
            Rice[] rices2 = new Gson().fromJson(json2, Rice[].class);
            return rices2;
        } catch (Exception e) {
            System.out.println("資料無法取得, " + e);
        }
        return null;
    }
}