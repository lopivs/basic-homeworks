package ru.lopatin.homeworks.homework.oop7;
/*
На основе разработанного MyLinkedList построить класс MyStack имеющий два метода - push(T data) - помещающий элемент в стек и T pop() - достающий элемент из стека
*/
public class MyStack<T> {
    MyLinkedList<T> list = new MyLinkedList<>();
    public int push(T data){
        return list.addLast(data);
    }

    public T pop(){
        T element = list.getLast();
        list.remove(list.getSize());
        return element;
    }
}
