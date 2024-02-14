package ru.lopatin.homeworks.homework20;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Homework20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название файла");
        String fileName = scanner.next();
        System.out.println("Введите подстроку для поиска к-ва соответствий");
        String substr = scanner.next();
        try {
            BufferedReader in = new BufferedReader(new FileReader(fileName, Charset.forName("UTF-8")));
            String text;
            int count = 0;
            while ((text = in.readLine()) != null) {
                count += text.split(substr).length - 1;
            }
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
