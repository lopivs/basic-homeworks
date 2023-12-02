package ru.lopatin.homeworks.oop2.animals;

public abstract class Animal {
    private static final int RUN_COEFFICIENT = 1; //Все животные на 1 метр бега тратят 1 ед выносливости,(можно обойтись и без константы, просто не умножать, добавил чтобы попрактиковаться)
    protected String name; // имя
    protected float runningSpeed; // скорость бега (м/с)
    protected float swimmingSpeed; // скорость плавания (м/с)
    protected float currentStamina; // выносливость
    public void info() {
        System.out.println("Показатели " + name + ": \n"
                + " выносливость - " + currentStamina + "\n"
                + " скорость бега - " + runningSpeed + "\n"
                + (swimmingSpeed > 0 ? " скорость плавания - " + swimmingSpeed + " \n" : ""));
    }

    // Все животные на 1 метр бега тратят 1 ед выносливости
    public float run(int distance) {
        float wasteStamina = distance * RUN_COEFFICIENT;
        float wasteTime = distance / runningSpeed;
        if (currentStamina >= wasteStamina) {
            currentStamina -= wasteStamina;
            return wasteTime;
        }
        currentStamina = 0;
        return -1;
    }

    public String getName() {
        return name;
    }
}