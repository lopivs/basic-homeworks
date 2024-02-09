package ru.lopatin.homeworks.homework19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Создайте классы Fruit, Apple extends Fruit, Orange extends Fruit;
 * Создайте класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта:
 * Box только для яблок, Box только для апельсин,Box и для тех, и для других фруктов. Для хранения фруктов внутри коробки используйте ArrayList;
 * Реализуйте метод добавления фрукта в коробку;
 * Реализуйте метод weight, который высчитывает вес коробки (например, из веса одного фрукта и их количества, или может через суммирование, как посчитаете нужным). Вес фрукта задаете самостоятельно, единицы измерения не важны;
 * Реализуйте метод compare, позволяющий сравнить текущую коробку с переданной в качестве аргумента. true – если их массы равны. Можно сравнивать коробки с разными типами фруктов;
 * Реализуйте метод, позволяющий пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов в коробках;
 */
public class Box<T extends Fruit> implements Comparable<Box> {
    private List<T> fruits;

    public Box(T... fruits) {
        this.fruits = new ArrayList<>(Arrays.asList(fruits));
    }

    public List<T> getFruits() {
        return fruits;
    }

    public void pourInto(List<? extends T> source) {
        fruits.addAll(source);
    }

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public int weight() {
        int weight = 0;
        for (T fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    @Override
    public int compareTo(Box o) {
        return this.weight() - o.weight();
    }
}
