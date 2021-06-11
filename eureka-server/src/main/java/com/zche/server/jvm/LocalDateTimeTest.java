package com.zche.server.jvm;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime date1 = LocalDateTime.now();
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        String date2Str = formatter2.format(date1);
        System.out.println(date2Str);

        String datetime =  "2018-01-13 21:27:30";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ldt = LocalDateTime.parse(datetime, dtf);
        System.out.println(ldt);
    }
}
