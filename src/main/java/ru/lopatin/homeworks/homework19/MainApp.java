package ru.lopatin.homeworks.homework19;

public class MainApp {
    public static void main(String[] args) {
        Box<Fruit> boxFruit = new Box(new Apple(99),new Orange(5),new Apple(44),new Orange(4));
        System.out.println("boxFruit.weight = " + boxFruit.weight());

        Box<Orange> boxOrange = new Box(new Orange(10),new Orange(5),new Orange(18),new Orange(4));
        System.out.println("boxOrange.weight = " + boxOrange.weight());

        Box<Apple> boxApple = new Box(new Apple(12),new Apple(4),new Apple(18),new Apple(4));
        System.out.println("boxApple.weight = " + boxApple.weight());

        boxFruit.pourInto(boxApple.getFruits());
        System.out.println("boxFruit.weight = " + boxFruit.weight());
        boxFruit.pourInto(boxOrange.getFruits());
        System.out.println("boxFruit.weight = " + boxFruit.weight());

        // boxApple.pourInto(boxOrange.getFruits()); // ошибка
        // boxApple.pourInto(boxFruit.getFruits());  // ошибка

        System.out.println("boxOrange compareTo boxApple = " + boxOrange.compareTo(boxApple));

        System.out.println("boxFruit compareTo boxApple = " + boxOrange.compareTo(boxApple));

    }
}
