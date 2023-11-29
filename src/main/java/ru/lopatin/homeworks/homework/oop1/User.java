package ru.lopatin.homeworks.homework.oop1;

import java.time.LocalDate;

//Cоздайте класс Пользователь (User) с полями: фамилия, имя, отчество, год рождения, email;
public class User {
    private String surname;
    private String name;
    private String partonymic;
    private int birthYear;
    private String email;

    //Реализуйте у класса конструктор, позволяющий заполнять эти поля при создании объекта;
    public User(String surname, String name, String partonymic, int birthYear, String email) {
        this.surname = surname;
        this.name = name;
        this.partonymic = partonymic;
        this.birthYear = birthYear;
        this.email = email;
    }

    //В классе Пользователь реализуйте метод, выводящий в консоль информацию о пользователе в виде:
    //        ФИО: фамилия имя отчество
    //        Год рождения: год рождения
    //        e-mail: email
    public void info() {
        System.out.println("ФИО: "+ this.surname+"\n" +
                "Год рождения: "+ this.birthYear+"\n" +
                "e-mail: "+ this.email);
    }
    public int getAge(){
        LocalDate curDate = LocalDate.now();
        int curYear = curDate.getYear();
        return curYear-this.birthYear;
    }
}
