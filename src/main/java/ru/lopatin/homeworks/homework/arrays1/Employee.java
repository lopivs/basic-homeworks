package ru.lopatin.homeworks.homework.arrays1;
//    Создайте класс Сотрудник с полями: имя, возраст;

public class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name;
    }
}
