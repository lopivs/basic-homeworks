package ru.lopatin.homeworks.homeworkOOP1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        User[] users = {
                new User("Васильев", "Александр", "Дмитриевич", (1940 + (int) (Math.random() * 80)), "email1.mail.ru"),
                new User("Петров", "Валерий", "Дмитриевич", (1940 + (int) (Math.random() * 80)), "email2.mail.ru"),
                new User("Иванов", "Антон", "Дмитриевич", (1940 + (int) (Math.random() * 80)), "email3.mail.ru"),
                new User("Васильева", "Мария", "Дмитриевна", (1940 + (int) (Math.random() * 80)), "email4.mail.ru"),
                new User("Петрова", "Валерия", "Дмитриевна", (1940 + (int) (Math.random() * 80)), "email5.mail.ru"),
                new User("Иванова", "Татьяна", "Дмитриевна", (1940 + (int) (Math.random() * 80)), "email6.mail.ru"),
                new User("Чернова", "Елена", "Дмитриевна", (1940 + (int) (Math.random() * 80)), "email7.mail.ru"),
                new User("Добрынин", "Вячеслав", "Дмитриевич", (1940 + (int) (Math.random() * 80)), "email8.mail.ru"),
                new User("Петросян", "Дмитрий", "Дмитриевич", (1940 + (int) (Math.random() * 80)), "email9.mail.ru"),
                new User("Меладзе", "Алексей", "Дмитриевич", (1940 + (int) (Math.random() * 80)), "email10.mail.ru"),
        };
        //В методе main() Main класса создайте массив из 10 пользователей и заполните его объектами и с помощью цикла выведите информацию только о пользователях старше 40 лет.
        for (int i = 0; i < users.length; i++) {
            if (users[i].getAge() >= 40) {
                users[i].info();
                System.out.println();
            }
        }
        newBox();
    }

    public static void newBox() {
        Scanner scanner = new Scanner(System.in);
        Box box = new Box(15, "yelow");
        box.info();
        int choice;
        while (true) {
            System.out.println("Что хочешь сделать с коробкой: \n 0 - перекрасить, 1 - открыть, 2 - закрыть, 3 - положить предмет, 4 - убрать предмет по названию, 5 очистить ячейку по номеру ячейки, 6 - выйти");
            choice = scanner.nextInt();
            switch (choice) {
                case 0 -> box.setColor();
                case 1 -> box.openBox();
                case 2 -> box.closeBox();
                case 3 -> box.addItem();
                case 4 -> box.deleteItem();
                case 5 -> box.freeCell();
                default -> {break;}
            }
        }
    }

}
