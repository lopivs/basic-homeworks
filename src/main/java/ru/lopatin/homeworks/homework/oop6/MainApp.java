package ru.lopatin.homeworks.homework.oop6;

public class MainApp {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Валентина Петровна", "465 465 465");
        phoneBook.add("Владимир Сергеевич", "465 891 358");
        phoneBook.add("Владимир Сергеевич", "785 695 222");
        phoneBook.add("Олег Валентинович", "785 695 222");
        phoneBook.add("Дарья Ивановна", "785 695 222");
        phoneBook.add("Владимир Сергеевич", "111 111 111");
        phoneBook.add("Дарья Ивановна", "755 658 549");
        phoneBook.add("Дарья Ивановна", "333 555 888");
        phoneBook.add("Владимир Сергеевич", "785 695 222");
        phoneBook.add("Владимир Сергеевич", "785 695 222");
        //
        System.out.println(phoneBook.find("Владимир Сергеевич"));
        System.out.println(phoneBook.find("Дарья Ивановна"));
        System.out.println(phoneBook.find("Антонио Фернандэс"));
        //
        System.out.println(phoneBook.containsPhoneNumber("785 695 222"));
        System.out.println(phoneBook.containsPhoneNumber("000 695 222"));
        System.out.println(phoneBook.containsPhoneNumber("111 111 111"));
        System.out.println(phoneBook.containsPhoneNumber("465 891 358"));
    }
}
