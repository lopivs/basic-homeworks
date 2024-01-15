package ru.lopatin.homeworks.homework.oop7;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("--------Работа с листом--------");
        MyLinkedList<Integer> list = new MyLinkedList();

        for (int i = 0; i < 11; i++) {
            list.addLast(i + 1);
            System.out.println("add " + (i + 1) + " " + list.get(i + 1));
        }

        System.out.println(list.getSize());
        while (list.size > 1) {
            System.out.println("removed " + list.remove(list.size));
        }

        System.out.println(list.getSize());
        for (int i = 0; i < list.size; i++) {
            System.out.println((i + 1) + " " + list.get(i + 1));
        }

        System.out.println("--------Работа со стеком--------");
        MyStack<Integer> myStack = new MyStack();

        for (int i = 0; i < 11; i++) {
            myStack.push(i);
            if (i % 2 == 0) {
                System.out.println("myStack.pop = " + myStack.pop());
            }
        }

        System.out.println("--------Работа с очередью--------");
        MyQueue<Integer> myQueue = new MyQueue();

        for (int i = 0; i < 11; i++) {
            myQueue.offer(i);
            if (i % 2 == 0) {
                System.out.println("myQueue.poll = " + myQueue.poll());
            }
        }

    }

}