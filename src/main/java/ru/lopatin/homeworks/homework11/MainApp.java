package ru.lopatin.homeworks.homework11;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileReaderWriter frw = new FileReaderWriter();
        frw.printFileList();
        //Далее программа запрашивает имя файла, с которым хочет работать пользователь
        System.out.println("Укажите название файла который хотите открыть");
        //Содержимое файла выводится в консоль
        frw.readFile(scanner.nextLine());
        System.out.println();
        //Затем любую введенную пользователем строку необходимо записывать в указанный файл
        System.out.println("Веедите текс, который должен быть добавлен к файлу");
        frw.writeFile(scanner.nextLine(), true);
    }
}
