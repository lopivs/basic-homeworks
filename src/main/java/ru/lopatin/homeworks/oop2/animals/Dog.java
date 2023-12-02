package ru.lopatin.homeworks.oop2.animals;

public class Dog extends Animal implements SwimableAnimal {
    private final static int SWIM_COEFFICIENT = 2;//Собаки на 1 метр плавания тратят 2 единицы
    public Dog(String name, float runningSpeed, float swimmingSpeed, float currentStamina) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.swimmingSpeed = swimmingSpeed;
        this.currentStamina = currentStamina;
    }

    @Override
    public float swim(int distance) {
        float wasteStamina = distance * SWIM_COEFFICIENT;
        float wasteTime = distance / swimmingSpeed;
        if (currentStamina >= wasteStamina) {
            currentStamina -= wasteStamina;
            return wasteTime;
        }
        currentStamina = 0;
        return -1;
    }

}
