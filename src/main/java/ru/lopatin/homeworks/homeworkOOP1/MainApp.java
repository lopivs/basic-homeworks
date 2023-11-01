package ru.lopatin.homeworks.homeworkOOP1;

public class MainApp {
    public static void main(String[] args) {
        User[] users = {
            new User("Васильев","Александр","Дмитриевич",(1940+(int)(Math.random()*80)), "email1.mail.ru"),
            new User("Петров","Валерий","Дмитриевич",(1940+(int)(Math.random()*80)), "email2.mail.ru"),
            new User("Иванов","Антон","Дмитриевич",(1940+(int)(Math.random()*80)), "email3.mail.ru"),
            new User("Васильева","Мария","Дмитриевна",(1940+(int)(Math.random()*80)), "email4.mail.ru"),
            new User("Петрова","Валерия","Дмитриевна",(1940+(int)(Math.random()*80)), "email5.mail.ru"),
            new User("Иванова","Татьяна","Дмитриевна",(1940+(int)(Math.random()*80)), "email6.mail.ru"),
            new User("Чернова","Елена","Дмитриевна",(1940+(int)(Math.random()*80)), "email7.mail.ru"),
            new User("Добрынин","Вячеслав","Дмитриевич",(1940+(int)(Math.random()*80)), "email8.mail.ru"),
            new User("Петросян","Дмитрий","Дмитриевич",(1940+(int)(Math.random()*80)), "email9.mail.ru"),
            new User("Меладзе","Алексей","Дмитриевич",(1940+(int)(Math.random()*80)), "email10.mail.ru"),
        };
        //В методе main() Main класса создайте массив из 10 пользователей и заполните его объектами и с помощью цикла выведите информацию только о пользователях старше 40 лет.
        for (int i = 0; i < users.length; i++) {
            if (users[i].getAge() >= 40) {
                users[i].info();
                System.out.println();
            }
        }
    }
}
