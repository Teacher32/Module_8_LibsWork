package com.libs.files;

import java.io.File;
import java.util.Date;
// import java.io.IOException;

public class Main {

    public static void main(String[] args) /*throws IOException*/ {
        File file = new File("Testfiles" + File.separator + "Test.txt");

        // Проверяем, существует ли файл?
        boolean isExsists = file.exists();
        if (isExsists) {
            System.out.println("Файл с именем " + file.getName() + " существует.");
        } else {
            System.out.println("Файл с именем " + file.getName() + " не найден!");
            return;
        }

        // Выводим абсолютный путь к файлу
        System.out.println("Абсолютный путь к файлу " + file.getName() + " " + file.getAbsolutePath());

        // Проверяем, доступен ли файл для чтения/записи?
        boolean isRead = file.canRead();
        boolean isWrite = file.canWrite();
        if (isRead && isWrite) {
            System.out.println("Файл " + file.getName() + " доступен для чтения/записи.");
        } else {
            System.out.println("Файл " + file.getName() + " не доступен для редактирования.");
        }

        // Выводим дату и время последнего изменения
        long ms = file.lastModified();
        Date date = new Date(ms);
        System.out.println("Дата последнего изменения файла " + file.getName() + ": " + date);

        // проверяем, является ли файл объектом
        if (file.isFile()) {
            System.out.println("Файл " + file.getName() + " является объектом.");
        } else {
            System.out.println("Файл " + file.getName() + " не является объектом.");
        }

        // получаем размер файла в байтах
        long length = file.length();
        System.out.println("Размер файла " + file.getName() + " " + file.length() + " байт.");


    }
}
