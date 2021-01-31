package com.libs.date_calendar;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

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

        System.out.println("********** Далее идут методы класса Calendar **********");

        Calendar calendar = Calendar.getInstance();     // с помощью этой строки получаем все параметры текущего момента времени (год, месяц, время и т.п.)
        // System.out.println(calendar);
        // int era = calendar.get(Calendar.ERA);
        // System.out.println(era);
        int year = calendar.get(Calendar.YEAR);
        System.out.println("Сейчас на дворе " + year + "-й год.");
        int month = calendar.get(Calendar.MONTH);
        System.out.println("Сейчас " + (month + 1) + "-й месяц."); // январь - это нулевой месяц (!), а декабрь - 11-ый (!)
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Сегодня " + dayOfMonth + "-ое число.");
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println("Сегодня " + (dayOfWeek + 1) + "-й день недели.");   // неделя начинается с воскресенья (!)

        System.out.println("********** Использование класса SimpleDateFormat **********");
        calendar.setTimeInMillis(999L);
        // SimpleDateFormat dateFormat = new SimpleDateFormat("E MMM dd HH:mm:ss ZZ yyyy");
        // System.out.println(dateFormat.format(calendar.getTime()));
        System.out.println(calendar.getTime());
    }

}
