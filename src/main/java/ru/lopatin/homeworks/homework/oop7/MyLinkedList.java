package ru.lopatin.homeworks.homework.oop7;

import java.util.LinkedList;

public class MyLinkedList<T> {
    Node<T> first;
    Node<T> last;
    int size = 0;

    private static class Node<T> {
        T item;
        Node<T> next;
        Node<T> prev;

        Node(Node<T> prev, T element, Node<T> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    private boolean isExists(int pos) {
        return (pos <= size && pos >= 1);
    }

    /**
     * addFirst(T data) - добавляет элемент в начало списка, остальные сдвигаются вправо
     * @param data
     * @return
     */
    public int addFirst(T data) {
        Node<T> newFirst = new Node<T>(null, data, this.first);
        if (this.first == null) {
            this.last = newFirst;
        } else {
            Node<T> prevFirst = this.first;
            prevFirst.prev = newFirst;
        }
        this.first = newFirst;
        size++;
        return size;
    }

    /**
     * addLast(T data) - добавляет элемент в конец списка
     * @param data
     * @return
     */
    public int addLast(T data) {
        Node<T> newLast = new Node<T>(this.last, data, null);
        if (this.last == null) {
            this.first = newLast;
        } else {
            Node<T> prevLast = this.last;
            prevLast.next = newLast;
        }
        this.last = newLast;
        size++;
        return size;
    }

    /**
     * T getFirst() - возвращает первый элемент списка
     * @return
     */
    public T getFirst() {
        final Node<T> thisFirst = this.first;
        return thisFirst.item;
    }

    /**
     * T getLast() - возвращает последний элемент списка
     * @return
     */
    public T getLast() {
        final Node<T> thisLast = this.last;
        return thisLast.item;
    }

    /**
     * T remove(int position) - удаляет элемент с номером position
     * @param position
     * @return
     */
    public T remove(int position) {
        Node<T> curNode = this.first;
        Node<T> nextNode;
        Node<T> editNode;
        if (!isExists(position)) {
            throw new IndexOutOfBoundsException("Position " + position + " out of list size 0 .. " + size);
        }
        if (size == 1) {
            first = null;
            last = null;
            size--;
            return curNode.item;
        }
        if (position == 1) {
            nextNode = curNode.next;
            nextNode.prev = null;
            first = nextNode;
            size--;
            return curNode.item;
        }
        if (position == size) {
            curNode = last;
            editNode = curNode.prev;
            editNode.next = null;
            last = editNode;
            size--;
            return curNode.item;
        }
        // тут главное чтобы size был верный
        for (int i = 1; i < position; i++) {
            curNode = curNode.next;
        }
        editNode = curNode.prev;
        editNode.next = curNode.next;
        size--;
        return curNode.item;
    }

    /**
     * T get(int position) - возвращает элемент с номером posiion
     * @param position
     * @return
     */
    public T get(int position) {
        if (!isExists(position)) {
            throw new IndexOutOfBoundsException("Position " + position + " out of list size 0 .. " + size);
        }
        Node<T> curNode = this.first;
        Node<T> nextNode = this.first;
        int curPos = 0;
        while (position <= curPos) {
            curPos++;
            curNode = nextNode;
            if (position == curPos) {
                return curNode.item;
            }
            nextNode = curNode.next;
        }
        return curNode.item;
    }

    /**
     * int getSize() - возвращает количество элементов в списке.
     * @return
     */
    public int getSize() {
        return size;
    }

}

