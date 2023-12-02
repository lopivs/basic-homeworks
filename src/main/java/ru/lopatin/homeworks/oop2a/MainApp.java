package ru.lopatin.homeworks.oop2a;

import java.util.Random;

public class MainApp {

    public static void main(String[] args) {
        Random random = new Random();
        Plate plate = new Plate(120);
        Cat[] cat = new Cat[10];
        for (int i = 0; i < cat.length; i++) {
            cat[i] = new Cat("Котик № " + (i+1), random.nextInt(25));
            cat[i].eat(plate);
        }

    }
}
