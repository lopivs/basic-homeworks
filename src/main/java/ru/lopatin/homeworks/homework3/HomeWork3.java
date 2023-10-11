package ru.lopatin.homeworks.homework3;

import java.util.Scanner;
import java.lang.Math;

public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println("Введите число от 1 до 5");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        switch (a) {
            case 1 -> greetings();
            case 2 ->
                    checkSign((int) (Math.random() * 10 - 5), (int) (Math.random() * 10 - 5), (int) (Math.random() * 10 - 5));
            case 3 -> selectColor();
            case 4 -> compareNumbers();
            case 5 -> addOrSubtractAndPrint((int) (Math.random() * 20), (int) (Math.random() * 5), Math.random() < 0.5);
        }
    }
    //(1) Реализуйте метод greetings(), который при вызове должен отпечатать в столбец 4 слова: Hello, World, from, Java;
    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
    }
    //(2) Реализуйте метод checkSign(..), принимающий в качестве аргументов 3 int переменные a, b и c.
    // Метод должен посчитать их сумму, и если она больше или равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
    public static void checkSign(int a, int b, int c) {
        if (a+b+c > 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }
    //(3) Реализуйте метод selectColor() в теле которого задайте int переменную data с любым начальным значением. Если data меньше 10 включительно,
    // то в консоль должно быть выведено сообщение “Красный”, если от 10 до 20 включительно, то “Желтый”, если больше 20 - “Зеленый”;
    public static void selectColor() {
        int a = (int)(Math.random()*30);
        if (a < 11) {
            System.out.println("Красный");
        }
        if (a>10 && a<21) {
            System.out.println("Желтый");
        }
        if (a>20) {
            System.out.println("Зеленый");
        }
    }
    //(4) Реализуйте метод compareNumbers(), в теле которого объявите две int переменные a и b с любыми начальными значениями.
    // Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
    public static void compareNumbers() {
        int a = (int)(Math.random()*30);
        int b = (int)(Math.random()*30);

        if (a >= b) {
            System.out.println(a+" >= "+b);
        }
        else
        {
            System.out.println(a+" < "+b);
        }
    }
    //(5) Создайте метод addOrSubtractAndPrint(int initValue, int delta, boolean increment).
    //Если increment = true, то метод должен к initValue прибавить delta и отпечатать в консоль результат, в противном случае - вычесть;
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println(initValue+"+"+delta+"="+(initValue+delta));
        }
        else{
            System.out.println(initValue+"-"+delta+"="+(initValue-delta));
        }
    }
}
