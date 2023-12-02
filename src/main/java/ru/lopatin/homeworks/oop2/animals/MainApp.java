package ru.lopatin.homeworks.oop2.animals;

public class MainApp {
    public static void decodeResult(Animal animal, float wTime) {
        if (wTime < 0){
            System.out.println(animal.getName() + " не справился с дистанцией, ему нужен отдах");
        }
        System.out.println(animal.getName() + " справился с дистанцией за " + wTime);
    }
    public static void main(String[] args) {
        float wasteTime;
        Cat cat = new Cat("Barsik", 19, 220);
        decodeResult(cat, cat.run(249));
        cat.info();

        Dog dog = new Dog("Muhtar", 25,4,500);
        decodeResult(dog, dog.run(249));
        dog.info();
        decodeResult(dog, dog.swim(249));
        dog.info();


        Horse horse = new Horse("Flash", 59,4,5000);
        decodeResult(horse, horse.run(249));
        horse.info();
        decodeResult(horse, horse.swim(249));
        horse.info();
    }
}
