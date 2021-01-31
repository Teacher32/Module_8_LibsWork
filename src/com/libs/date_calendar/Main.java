package com.libs.date_calendar;

import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Текущие дата и время: " + date);

        long time = System.currentTimeMillis();
        System.out.println("Текущее время: " + time + " миллисекунд");

        Date date1 = new Date(1);
        Date date2 = new Date(2);
        System.out.println(date1.after(date2));         // Если date1 <= date2, то выведется false

        Date date3 = new Date(1);
        Date date4 = new Date(2);
        System.out.println(date3.before(date4));         // Если date1 < date2, то выведется true

        Date date5 = new Date(1);
        Date date6 = new Date(2);
        System.out.println(date5.compareTo(date6));     // Если date1 < date2, то выведется -1
                                                        // Если date1 > date2, то выведется 1
                                                        // Если date1 = date2, то выведется 0

        Date date7 = new Date();
        System.out.println(date7.getTime());            // выведет количество миллисекунд с 1 января 1970 года 00:00

        Date date8 = new Date();
        date8.setTime(2);                               // задали количество миллисекунд 2.
        System.out.println(date8.getTime());            // выведет 2
    }

}
