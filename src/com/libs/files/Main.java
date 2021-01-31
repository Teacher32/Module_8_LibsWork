package com.libs.files;

import java.io.File;
// import java.io.IOException;

public class Main {

    public static void main(String[] args) /*throws IOException*/ {
        File file = new File("Testfiles/Test.txt");
        boolean isExsists = file.exists();
        if (isExsists) {
            System.out.println("Файл с именем " + file.getName() + " существует.");
        }
        else {
            System.out.println("Файл с именем " + file.getName() + " не найден!");
            return;
        }

        System.out.println("Абсолютный путь к файлу " + file.getName() + " " + file.getAbsolutePath());
    }
}
