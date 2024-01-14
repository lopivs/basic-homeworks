package ru.lopatin.homeworks.homework.oop7;
/*
На основе разработанного MyLinkedList создать класс MyQueue работающий по принципу очереди, и имеющий два метода
offer(T data), добавляющий элемент в очередь и T poll() - забирающий элемент из очереди
*/
public class  MyQueue<T> {
    MyLinkedList<T> list = new MyLinkedList<>();
    public int offer(T data){
        return list.addLast(data);
    }

    public T poll(){
        T element = list.getFirst();
        list.remove(1);
        return element;
    }

}
