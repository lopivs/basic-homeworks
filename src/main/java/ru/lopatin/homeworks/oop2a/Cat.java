package ru.lopatin.homeworks.oop2a;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat (Plate plate){
        this.satiety = plate.decreaseFood(this.appetite);
        System.out.println(name + (satiety ? " сыт" : " голоден"));
    }

}
