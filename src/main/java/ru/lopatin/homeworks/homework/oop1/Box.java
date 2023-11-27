package ru.lopatin.homeworks.homework.oop1;
// Попробуйте реализовать класс по его описания: объекты класса Коробка должны иметь размеры и цвет.
// Коробку можно открывать и закрывать. Коробку можно перекрашивать. Изменить размер коробки после создания нельзя.
// У коробки должен быть метод, печатающий информацию о ней в консоль.
// В коробку можно складывать предмет (если в ней нет предмета), или выкидывать его оттуда (только если предмет в ней есть),
// только при условии что коробка открыта (предметом читаем просто строку).
// Выполнение методов должно сопровождаться выводом сообщений в консоль.

import java.util.Scanner;

public class Box {
    private String color;
    private boolean isOpen;
    private String[] items;

    private float height;

    private float width;

    private float length;


    public Box(int size, String color, float height, float width, float length) {
        this.color = color;
        this.items = new String[size];
        this.height = height;
        this.width = width;
        this.length = length;

    }

    public void openBox() {
        if (isOpen) {
            System.out.println("Коробка уже открыта");
            return;
        }
        isOpen = true;
        System.out.println("Коробка открыта");
    }

    public void closeBox() {
        if (!isOpen) {
            System.out.println("Коробка уже закрыта");
            return;
        }
        isOpen = false;
        System.out.println("Коробка закрыта");
    }

    public void addItem(String item) {
        if (!isOpen) {
            System.out.println("Коробка закрыта, открой ее, чтобы положить в нее предмет");
            return;
        }
         for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                System.out.println(item + " добавлен в коробку, в ячейку №" + (i + 1));
                return;
            }
        }
        System.out.println("В коробке нет свободного места, нужно сначала что то убрать");
    }

    public void freeCell(int cell) {
        if (!isOpen) {
            System.out.println("Коробка закрыта, открой ее, чтобы убрать из нее предмет");
            return;
        }
        cell--;
        if (items[cell] == null) {
            System.out.println("Ячейка пуста, убирать нечего.");
            return;
        } else if (cell < 0 || cell > items.length) {
            System.out.println("Ячейки с номером " + cell + " нет в коробке. ");
            return;
        }
        items[cell] = null;
        System.out.println("Ячейка " + cell + " очищена");
    }

    public void deleteItem(String item) {
        if (!isOpen) {
            System.out.println("Коробка закрыта, открой ее, чтобы убрать из нее предмет");
            return;
        }
        for (int i = 0; i < items.length; i++) {
            if (item.equals(items[i])) {
                items[i] = null;
                System.out.println(item + " убрали из коробки, ячейка №" + (i + 1) + " освождена");
                return;
            }
        }
        System.out.println(item + " не найден в коробке");
    }

    public void setColor(String color) {
        if (isOpen) {
            System.out.println("Коробка открыта, закрой ее, чтобы не испачкать содержимое");
            return;
        }
        this.color = color;
        System.out.println("Коробка перекрашена в " + color + " цвет");
    }

    public void info() {
        int freeCells = 0;
        String condition;
        if(isOpen){
            condition = "открыта";
        }
        else {
            condition = "закрыта";
        }
        for (int i = 0; i < items.length; i++) {
            if(items[i]==null){
                freeCells++;
            }
        }
        System.out.println("Состояние коробки: "+condition);
        System.out.println("Всего ячеек: "+items.length);
        System.out.println("Свободных ячеек: "+freeCells);
        System.out.println("Цвет коробки: "+color);
    }
}
